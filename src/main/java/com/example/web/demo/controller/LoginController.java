package com.example.web.demo.controller;

import okhttp3.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.List;

@RequestMapping
@RestController
public class LoginController {

    private  static  String  cooki="";
    private  static  String  cooki2="";
    private  static  String  execution="";

    @GetMapping("/login/{username}/{password}")
    public String login(@PathVariable("username")String username,@PathVariable("password")String password){
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        String enPwd = "";
        try {
            enPwd = Base64.getEncoder().encodeToString(password.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        RequestBody body = RequestBody.create(mediaType, "{\n  \"username\": \""+username+"\",\n  \"validateCode\": \"\",\n  \"type\": 1,\n  \"orgCode\": \"\",\n  \"encryptionPsw\": \""+enPwd+"\"\n}");
        Request request = new Request.Builder()
                .url("https://shenzhen.vss.net.cn/api/login")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response = client.newCall(request).execute();
            int code = response.code();
            if (code == 200) {
                ResponseBody rspbody = response.body();
                if (rspbody.string().contains("userId")){
                    //登录成功
                    //获取头信息
                    Headers  headers=response.headers();
                    //获取cookie
                    List<String> cookies=headers.values("Set-Cookie");

                    System.out.println(cookies);

                    String a[] = cookies.toString().split(";");
                    //保存cookie数据
                    cooki2=a[0].replace("[","");
                    cooki=a[0].substring(12);
                    System.out.println(cooki2);
                    System.out.println(cooki);
                }

//                byte[] bytes = rspbody.bytes();
                // byte[] data = StreamTool.read(response);

//                String html = new String(bytes, "UTF-8").trim().replace("\"","");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cooki2;
    }

    @GetMapping("/getdata/{sessionid}")
    public String getData(@PathVariable("sessionid") String sessionid){
        String rst = "";
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://shenzhen.vss.net.cn/api/erp-stock?factoryId=&batchNumberId=&orgGoodsId=&nearTermDays=&showFlag=false&vaccineType=")
                .method("GET", null)
                .addHeader("Cookie", sessionid)
                .build();
        try {
            Response response = client.newCall(request).execute();
            rst = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rst;
    }
}
