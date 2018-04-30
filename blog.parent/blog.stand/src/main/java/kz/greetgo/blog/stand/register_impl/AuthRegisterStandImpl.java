package kz.greetgo.blog.stand.register_impl;

import kz.greetgo.blog.controller.model.AuthModel;
import kz.greetgo.blog.controller.register.AuthRegister;
import kz.greetgo.depinject.core.Bean;

@Bean
public class AuthRegisterStandImpl implements AuthRegister {

    @Override
    public AuthModel checkPassword(String username, String password) {
        AuthModel authModel = new AuthModel();
        authModel.text = "authenticated";
        return authModel;
    }
}
