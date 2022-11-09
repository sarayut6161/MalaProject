package org.itsci.malaproject.model;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idlogin", nullable = false)
    private Integer idlogin;

    @Column(name = "Username",nullable = false)
    private String Username;
    @Column(name = "Password",nullable = false)
    private String Password;

    @Column(name = "loginType",nullable = false)
    private String loginType;

    public Integer getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(Integer idlogin) {
        this.idlogin = idlogin;
    }


    public Login(String username, String password) {
        Username = username;
        Password = password;
    }

    public Login() {

    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }
}
