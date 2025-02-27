package com.example.h2data.helper;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.InputStream;

@Component
public class FileUploadHelper {
    public final String UPLOAD_DIR="C:\\Users\\User2\\Downloads\\h2data\\h2data\\src\\main\\resources\\static";
//public final String UPLOAD_DIR=new ClassPathResource("static/image/").getFile().getAbsolutePath();
//public FileUploadHelper()throws IOException
//{

//}
    public boolean uploadFile(MultipartFile multipartFile)
{
    boolean f = false;
try{

    InputStream is= multipartFile.getInputStream();
    byte data[]=new byte[is.available()];
    is.read(data);
    //write
    FileOutputStream fos = new FileOutputStream(UPLOAD_DIR+ "\\"+multipartFile.getOriginalFilename());//File.seperator as\\
    fos.write(data);
    fos.flush();
    f= true;

}
//Files.copy(in,target,options)
catch(Exception e ){
    e.printStackTrace();

}
    return f;

}
}
