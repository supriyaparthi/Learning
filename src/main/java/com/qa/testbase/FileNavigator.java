package com.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class FileNavigator {

    public Properties prop;

    public FileNavigator() throws IOException {


        prop = new Properties();
        FileInputStream io = null;

        io = new FileInputStream("/Users/parthi/supriyaa/RestAPI/src/main/java/com/qa/config/config.properties");
        if (io != null ){
            System.out.println("io not null");
        }
        prop.load(io);


    }

}

