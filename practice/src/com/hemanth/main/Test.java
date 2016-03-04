
package com.hemanth.main;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    
    public static void main(String[] args) {

        Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();
        Integer totalPinnacles = map.remove("kjfhsakjhfd");
        System.out.println(totalPinnacles);
        
    }
    

    
    private static void fileTest()
    {
         File file = new File("D:/Temp/recon");
        System.out.println(file.isDirectory());
       
        for(File tmp : file.listFiles())
        {
            System.out.println(tmp.getAbsolutePath());
            System.out.println(tmp.delete());
        }
        
        System.out.println(file.delete());
       // File dest = new File("D:/Temp/recon1");
        
       // file.renameTo(dest);

    }
}
