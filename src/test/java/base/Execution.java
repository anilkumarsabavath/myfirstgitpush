package base;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.clint.Htt_clint;

import apimaven.Basetest;

public class Execution  extends Basetest{
	Basetest test;
	String url;
	String apiurl;
	String uri;
	Htt_clint clint;
	@BeforeMethod
	public void setup() {
		 test= new Basetest();
		url=prop.getProperty("URL");
	    apiurl=prop.getProperty("ServiceURl");
	    uri=	url+apiurl;
	}
	@Test
	public void gettest() throws ClientProtocolException, IOException {
		clint= new Htt_clint();
		clint.get(uri);
	}
	

}

