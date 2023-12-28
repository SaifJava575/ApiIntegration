package com.api.service;

import org.springframework.stereotype.Service;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Service
public class ApiIntegrationServiceLayer {

	public String translateText() throws Exception {
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
		RequestBody body = RequestBody.create(mediaType, "q=Hello%2C%20world!&target=es&source=en");

		Request request = new Request.Builder().url("https://google-translate1.p.rapidapi.com/language/translate/v2")
				.post(body).addHeader("content-type", "application/x-www-form-urlencoded")
				.addHeader("Accept-Encoding", "application/gzip").addHeader("X-RapidAPI-Key",
						"003e63e989mshba4b1e95d48daa8p1a4000jsn314aa15aa5b1")
				.addHeader("X-RapidAPI-Host", "google-translate1.p.rapidapi.com").build();

		Response response = client.newCall(request).execute();
		return response.body().string();
	}
}
