package com.clint;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class Htt_clint {
	public void get(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpclint=HttpClients.createDefault();
		 HttpGet htget= new HttpGet(url); 
		CloseableHttpResponse httpresponce= httpclint.execute(htget);
		int statuscode=httpresponce.getStatusLine().getStatusCode();
		 System.out.println(statuscode);
		String respnceString= EntityUtils.toString(httpresponce.getEntity(),"UTF-8");
		JSONObject jsonobject= new JSONObject(respnceString);
		System.out.println("JSON of API"+jsonobject);
		Header[] headerarray=httpresponce.getAllHeaders();
		HashMap<String,String> allheaders= new HashMap<String,String>();
		for(Header header:headerarray) {
			allheaders.put(header.getName(),header.getValue());
			
		}
		System.out.println("json fomat--->"+allheaders);
	}

}
