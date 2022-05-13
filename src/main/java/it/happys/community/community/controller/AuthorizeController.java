package it.happys.community.community.controller;

import it.happys.community.community.dto.AcessTokenDTO;
import it.happys.community.community.dto.GitHubUser;
import it.happys.community.community.provider.GitHubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: zhangguifa
 * @date: 2022-05-07 13:30
 */
@Controller
public class AuthorizeController {
    @Autowired
    private GitHubProvider gitHubProvider;
    @Value("${github.client.id}")
    private String clientId;
    @Value("${github.client.secret}")
    private String clientScret;
    @Value("${github.client.secret}")
    private String redirectUri;
    @GetMapping("/callback")
    public String callback(@RequestParam(name="code") String code,
                           @RequestParam(name="state") String state){
        AcessTokenDTO acessTokenDTO = new AcessTokenDTO();
        acessTokenDTO.setCode(code);
        acessTokenDTO.setClient_id(clientId);
        acessTokenDTO.setRedirect_uri(redirectUri);
        acessTokenDTO.setClient_secret(clientScret);
        String acessToken = gitHubProvider.getAcessToken(acessTokenDTO);
        GitHubUser user = gitHubProvider.getUser(acessToken);
        System.out.println(user.getName());
        return "index";
    }
}
