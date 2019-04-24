package com.all.famous.news.controller;

import lombok.var;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("images")
public class ImageRestController {

    @GetMapping(value = "{name}", produces = MediaType.IMAGE_JPEG_VALUE)
    public void getImagesByNames(
            HttpServletResponse response,
            @PathVariable("name") String encodeName) throws IOException {
        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
        String repositoryPath = "image/" + encodeName;
        var imgFile = new ClassPathResource(repositoryPath);
        StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());
    }

}
