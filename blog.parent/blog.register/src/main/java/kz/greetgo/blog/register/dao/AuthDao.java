package kz.greetgo.blog.register.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public abstract class AuthDao  {
    @Select("select username from users where username=#(username) and password=#(password)")
    abstract String getUssernameByUsernameAndPassword(@Param("username") String username,
                                                      @Param("password") String password);

    public static Object get() {
    }
}
