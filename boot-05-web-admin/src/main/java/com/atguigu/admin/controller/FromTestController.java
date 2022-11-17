package com.atguigu.admin.controller;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * FromTestController
 *
 * @author fj
 * @date 2022/9/23 21:49
 */
@Slf4j
@Controller
public class FromTestController {
    @GetMapping("/form_layouts")
    public String fromLayouts(){
        return "form/form_layouts";
    }

    @SneakyThrows
    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestParam("headerImg") MultipartFile headerImg,
                         @RequestParam("photos") MultipartFile[] photos){

        log.info("上传的信息;email={},username={},headerImg={},photos={}",email,username,headerImg.getSize(),photos.length);
//        if (!headerImg.isEmpty()) {
//            //保存到文件服务器，Oss 服务器
//            String originalFilename = headerImg.getOriginalFilename();
//            headerImg.transferTo(new File("D:\\cache\\"+originalFilename));
//        }
//        if (photos.length>0){
//            for (MultipartFile photo:photos) {
//                //保存到文件服务器，Oss 服务器
//                String originalFilename = photo.getOriginalFilename();
//                headerImg.transferTo(new File("D:\\cache\\"+originalFilename));
//            }
//        }

        return "main";
    }

}
