package com.baimahu.QRExp;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class QRExp {
    public static void main(String[] args) throws Exception{
        String detail = "junye qiandaohu happy";
        //String detail = "中雷怎么还没起床";
        ByteArrayOutputStream out = QRCode.from(detail).to(ImageType.JPG).stream();
        File f = new File("QR.jpg");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(out.toByteArray());
        fos.flush();
    }
}
