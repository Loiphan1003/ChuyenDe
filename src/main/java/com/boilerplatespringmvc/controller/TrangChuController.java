package com.boilerplatespringmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;

@Controller
public class TrangChuController {

    @Autowired
    ServletContext context;

    @RequestMapping("/")
    public String form() {
        System.out.println("" + context.getRealPath("/WBE-INF/files/"));
        return "form";

    }

    @RequestMapping("apply")
    public String apply(ModelMap model, @RequestParam("fullname") String fullname, @RequestParam("cv") MultipartFile cv,
                        @RequestParam("photo") MultipartFile photo) {
        if (photo.isEmpty() || cv.isEmpty()) {
            model.addAttribute("message", "Vui lòng chọn file !");
        } else {
            try {
                String photoPath = context.getRealPath("/WEB-INF/files/" + photo.getOriginalFilename());
                photo.transferTo(new File(photoPath));
                String cvPath = context.getRealPath("/WEB-INF/files/" + cv.getOriginalFilename());
                cv.transferTo(new File(cvPath));
                System.out.println("" + context.getRealPath("/files/" + photo.getOriginalFilename()));
                System.out.println("" + context.getRealPath("/files/" + cv.getOriginalFilename()));
                model.addAttribute("photo_name", photo.getOriginalFilename());
                model.addAttribute("cv_name", cv.getOriginalFilename());
                model.addAttribute("cv_type", cv.getContentType());
                model.addAttribute("cv_size", cv.getSize());
                return "apply";
            } catch (Exception e) {

                e.printStackTrace();
                model.addAttribute("message", "Lỗi lưu file !");
            }
        }
        return "form";
    }
}
