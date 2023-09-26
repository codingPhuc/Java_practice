package com.mvm;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL ;

import org.apache.commons.io.FileUtils;
import org.apache.commons.validator.routines.UrlValidator;

/**
 * Hello world!
 *
 */
public class Program
{
    public static void main( String[] args )
    {
        if(args.length  !=1) 
        {
            System.out.println("Please provide a URL ");
            return  ;
        }
        String url   = args[0]  ;  
        UrlValidator  validator  = new UrlValidator()  ; 
        
        if(!validator.isValid(url))
        {
            System.out.println("this url is not valid");
            return  ; 
        }
        
            String[] parts = url.split("/");
            File destination = new File(parts[parts.length -1]);

            // Copy bytes from the URL to the destination file.
            try {
                FileUtils.copyURLToFile( new URL(url), destination);
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        
    }
}
