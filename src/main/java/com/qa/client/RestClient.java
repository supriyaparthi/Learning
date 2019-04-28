package com.qa.client;

import org.apache.http.Header;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by parthi.
 */
public class RestClient {

    public void get(String url) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpget =new HttpGet(url);
       CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpget);

      int statuscode = closeableHttpResponse.getStatusLine().getStatusCode();
        System.out.println("Status Code =" +statuscode);
       String responseString =  EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
        JSONObject responseJson =new JSONObject(responseString);
        System.out.println(responseJson);

       Header[] headerArray = closeableHttpResponse.getAllHeaders();
        HashMap<String, String> allheader = new HashMap<String, String>();

       for(Header header:headerArray){
           allheader.put(header.getName(),(header.getValue()));
           System.out.println(allheader);
       }
    }

}
