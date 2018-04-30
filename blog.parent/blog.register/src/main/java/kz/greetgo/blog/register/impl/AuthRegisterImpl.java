package kz.greetgo.blog.register.impl;

import kz.greetgo.blog.controller.model.AuthModel;
import kz.greetgo.blog.controller.register.AuthRegister;
import kz.greetgo.blog.register.dao.AuthDao;
import kz.greetgo.depinject.core.Bean;

@Bean
public class AuthRegisterImpl implements AuthRegister {

    @Override
    public AuthModel checkPassword(String username, String password) {

        String usernameString = AuthDao.get().getUsernameByUsernameAndPassword(username, password);
        AuthModel authModel = new AuthModel();
        if(usernameString!=null) authModel.text = "authenticated";
        return authModel;
    }
}
