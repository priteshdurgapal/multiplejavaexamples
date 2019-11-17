package com.jsn.data;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class JsnClass {

	
	    public static void main(String[] args) throws Exception {
	        String   payload = "{" +  "\"name\": \"Megha Durgapal\", " + 
	        		 "\"email\": \"megha.durgapa@gmail.com\", " + 
	        		 "\"email\": \"97202\", " + 
	        		
	        			
	       
	    				"}";
	        
	       // payload = "data={" +
	         //       "\"name\": \"admin\", " +
	           //     "\"first_name\": \"System\", " +
	             //   "\"last_name\": \"Administrator\"" +
	               // "}";
	        
	        
	        	
	       
	        
	       // {"error":{"name":"Name please!!!","email":"You can send your email, we don't spam...","phone":"Phone number is kind-of important","github":"Please share your Github profile LINK as well","current_location":"Please mention your current location as well.","intro":"Your intro lets us know more about you, please include that. What you like to do when you are not in office, can be a good starting point!","blog":"No blog, nothing??","resume":"Please give a link to your resume."}}

	        StringEntity entity = new StringEntity(payload,
	                ContentType.APPLICATION_FORM_URLENCODED);
	        System.out.println(payload);
	        HttpClient httpClient = HttpClientBuilder.create().build();
	        HttpPost request = new HttpPost("http://elpisdesign.com/apply.php");
	        request.setEntity(entity);

	        HttpResponse response = httpClient.execute(request);
	       // System.out.println(response.getStatusLine().getStatusCode());
	        if (response.getStatusLine().getStatusCode() == 200 || response.getStatusLine().getStatusCode() == 204) {

	            BufferedReader br = new BufferedReader(
	                    new InputStreamReader((response.getEntity().getContent())));

	            String output;
	            System.out.println("Output from Server ...." + response.getStatusLine().getStatusCode() + "\n");
	            while ((output = br.readLine()) != null) {
	               System.out.println(output);
	            }
	    }
	
	
	
		
		
	}
}


