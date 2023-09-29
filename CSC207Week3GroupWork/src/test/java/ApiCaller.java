import example.OkHttpClient;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;

public class  ApiCaller {

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        String run = client.run("http://api.airvisual.com/v2/nearest_city?key=479c3350-e1bb-4911-96c9-fec8fb2555f6");
        System.out.println(run);
//        JSONObject jsonObject = new JSONObject(run);
//        System.out.println(jsonObject);
//        HashMap<String, String> content = jsonObject.getMapType("data");
//        System.out.println(content);
    }
}

