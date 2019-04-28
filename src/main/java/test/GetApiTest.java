package test;

import com.qa.client.RestClient;
import com.qa.testbase.FileNavigator;

import java.io.IOException;


public class GetApiTest {
























public static void main(String args[]) throws IOException {
    FileNavigator t = new FileNavigator();
    String url = t.prop.getProperty("URL");
    //String serviceUrl =     t.prop.getProperty("serviceUrl");


    RestClient restClient =new RestClient();

              restClient.get(url);

    

    


}

    }



