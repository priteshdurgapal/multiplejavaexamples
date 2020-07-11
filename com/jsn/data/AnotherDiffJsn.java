package com.jsn.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.entity.ContentType;
import org.apache.http.HttpResponse;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import java.util.Map;

public class AnotherDiffJsn {

	public static void main(String[] args) throws Exception {

		AnotherDiffJsn adn = new AnotherDiffJsn();
		adn.makeHTTPPOSTRequest();
	}

	public void makeHTTPPOSTRequest() {
		try {
			HttpClient c = new DefaultHttpClient();
			HttpPost p = new HttpPost("http://elpisdesign.com/apply.php");

			p.setEntity(
					new StringEntity("{\"firstname\":\"" + "system" + "\",\"lastname\":\"" + "administrator" + "\"}",
							ContentType.create("application/json")));
			System.out.println("{\"firstname\":\"" + "system" + "\",\"lastname\":\"" + "administrator" + "\"}");
			HttpResponse r = c.execute(p);

			BufferedReader rd = new BufferedReader(new InputStreamReader(r.getEntity().getContent()));
			String line = "";
			while ((line = rd.readLine()) != null) {
				// Parse our JSON response
				JSONParser j = new JSONParser();
				JSONObject o = (JSONObject) j.parse(line);
				Map response = (Map) o.get("response");
				// System.out.println(((HttpResponse)
				// response).getStatusLine().getStatusCode());
				// System.out.println(response.get("somevalue"));
			}
		} catch (ParseException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
