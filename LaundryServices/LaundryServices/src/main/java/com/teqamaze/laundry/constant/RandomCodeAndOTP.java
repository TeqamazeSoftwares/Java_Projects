package com.teqamaze.laundry.constant;

import java.security.SecureRandom;
import java.util.Random;

public class RandomCodeAndOTP {
   
    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();
    
    public static String randomString( int len ){        
      StringBuilder sb = new StringBuilder( len );
      for( int i = 0; i < len; i++ ) 
         sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
      return sb.toString();
   }
    
    public static String genetrateOTP(int length){
        System.out.print("your OTP for this transaction is : ");
        String numbers = "0123456789";
        Random r = new Random();
        char[] otp = new char[length];
        for(int i=0;i<length;i++){
            otp[i]=numbers.charAt(r.nextInt(numbers.length()));
        }
        return new String(otp);
    }   

}
