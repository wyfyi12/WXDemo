package com.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

import net.sf.json.JSONObject;

public class HttpDeal {
	public HttpURLConnection creattconn(String url) throws Exception{
		URL u = new URL(url);
		HttpURLConnection conn= (HttpURLConnection) u.openConnection();
		conn.setDoOutput(true);
		conn.setDoInput(true);
		conn.setUseCaches(false);
		conn.setRequestMethod("POST");
		return conn;
	}
	
	public void initConnection(HttpURLConnection conn,
			Map<String, String> headMap) throws ProtocolException {
		Iterator<String> it = headMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = headMap.get(key);
			conn.setRequestProperty(key, value);
		}
	}
	
	public InputStream getHttpResponse(HttpURLConnection conn,
			JSONObject data) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(conn.getOutputStream(),
				"UTF-8");
		osw.write(data.toString());
		osw.flush();
		osw.close();
		return conn.getInputStream();
	}
	
	public String getStringFromStream(InputStream in) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in,
				"UTF-8"));
		String temp;
		while ((temp = reader.readLine()) != null) {
			sb.append(temp);
		}
		in.close();
		return sb.toString();
	}
}
