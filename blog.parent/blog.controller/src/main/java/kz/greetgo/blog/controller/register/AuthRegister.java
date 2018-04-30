package kz.greetgo.blog.controller.register;

import kz.greetgo.blog.controller.model.AuthModel;

public interface AuthRegister {
    AuthModel checkPassword(String username, String password);
}
