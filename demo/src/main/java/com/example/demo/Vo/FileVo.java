package com.example.demo.Vo;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class FileVo {
    private MultipartFile file;
    private Long id;
}
