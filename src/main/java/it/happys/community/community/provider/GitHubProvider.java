package it.happys.community.community.provider;
import com.alibaba.fastjson.JSON;
import it.happys.community.community.dto.AcessTokenDTO;
import it.happys.community.community.dto.GitHubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;


import java.io.IOException;

/**
 * @description:
 * @author: zhangguifa
 * @date: 2022-05-07 13:40
 */
@Component
public class GitHubProvider {
    public  String getAcessToken(AcessTokenDTO acessTokenDTO){
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(JSON.toJSONString(acessTokenDTO), mediaType);
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            String token = string.split("&")[0].split("=")[1];
            return token;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public GitHubUser getUser(String acessToken){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://github.com/user?access_token="+acessToken)
                .build();

        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            System.out.println(string);
            GitHubUser gitHubUser = JSON.parseObject(string, GitHubUser.class);
            return gitHubUser;
        }catch (IOException e){

        }
        return null;
    }

}
