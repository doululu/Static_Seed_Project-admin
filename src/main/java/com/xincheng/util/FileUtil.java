package com.xincheng.util;

import java.io.File;
import java.io.FileOutputStream;

/**
 * 文件上传工具
 * @author Fx
 * @date 2018/9/12 12:44
 **/
public class FileUtil {
    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath + fileName);
        out.write(file);
        out.flush();
        out.close();
    }
}
