package com.revature.flashcard.user.bean;

import com.sun.org.apache.xml.internal.security.utils.Base64;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by August Duet on 11/10/2017.
 */
@Service
@Scope(scopeName = "singleton")
public class LoginService {
    private Map<String, FcUserToken> loggedIn = new HashMap<>();

    public String loginUser(FcUser user){
        String token = null;
        if(user.getUsername().equals("steve@gmail.com") && user.getPassword().equals("123")) {
            byte[] userData = (user.getUsername() + user.getPassword()).getBytes();

            user.setTrainer(true);

            token = Base64.encode(userData);

            FcUserToken userToken = new FcUserToken();
            userToken.setUsername(user.getUsername());
            userToken.setRole("Trainer");
            userToken.setToken(token);
            userToken.setExpiresInSeconds(3600);

            loggedIn.put(token, userToken);
        }

        return token;
    }

    public FcUserToken getUser(String token) {
        System.out.println("log");
        for(Map.Entry<String, FcUserToken> e : loggedIn.entrySet()) {
            System.out.println();
        }
        return loggedIn.get(token);
    }
}
