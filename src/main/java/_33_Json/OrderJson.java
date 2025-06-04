package _33_Json;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class OrderJson {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();
        // 속성(key-value)을 추가하는 메소드 => addProperty()
        jsonObject1.addProperty("orderId","ORD123456");
        jsonObject1.addProperty("customer","곽두팔");
        jsonObject1.addProperty("product","에어팟 프로 2세대");
        jsonObject1.addProperty("quantity",1);
        jsonObject1.addProperty("price",349000);

        JsonObject address = new JsonObject();
        address.addProperty("receiver","곽두팔");
        address.addProperty("phone","010-5678-1234");
        address.addProperty("city","서울");
        address.addProperty("district","마포구");
        address.addProperty("zipCode","04123");

        jsonObject1.add("address",address);

        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        String json2 = gson2.toJson(jsonObject1);
        System.out.println(json2);


    }
}
