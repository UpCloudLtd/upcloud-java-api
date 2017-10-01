package com.upcloud.client;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.logging.Logger;

public class CharsetInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        String contentType = request.header("content-type");
        String[] splitted = contentType.split(";");
        Request newRequest = request
                .newBuilder()
                .removeHeader("content-type")
                .addHeader("content-type", splitted[0])
                .build();
        Logger.getGlobal().info("Request Content-type: " + newRequest.header("content-type"));
        Response response = chain.proceed(newRequest);
        return response;
    }
}
