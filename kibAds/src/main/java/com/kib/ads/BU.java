package com.kib.ads;

import java.util.Base64;

public class BU {
    public  static String getBu(){
        String inputString = "aGVsbG8gd29ybGR+";

        String decodedString = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            return new String(Base64.getDecoder().decode(inputString));
        }else{
            return null;
        }

    }
}
