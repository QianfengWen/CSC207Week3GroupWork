package example;

import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class OkHttpClient {
    okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();

    public String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

}
