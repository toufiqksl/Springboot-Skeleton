package com.example.webservice.commons.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class ImageValidator{
    public static boolean isImageValid(MultipartFile multipartFile) {
        try {
            Image image = ImageIO.read(FileIO.convertToFile(multipartFile));
            if (image != null)
                return true;
        } catch (IOException e) {
            return false;
        }
        return false;
    }
}
