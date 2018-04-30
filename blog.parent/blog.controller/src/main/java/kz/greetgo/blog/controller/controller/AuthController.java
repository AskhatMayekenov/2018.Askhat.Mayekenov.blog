package kz.greetgo.blog.controller.controller;

import kz.greetgo.blog.controller.register.AuthRegister;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.blog.controller.utils.Controller;
import kz.greetgo.blog.controller.model.AuthModel;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.Par;
import kz.greetgo.mvc.annotations.ToJson;

public class AuthController implements Controller {

    public BeanGetter<AuthRegister> authRegister;

    @Mapping("*/logging")
    @ToJson

    public AuthModel checkAuth(@Par("username")String username, @Par("password")String password) {

        return new AuthModel();
    }
}
