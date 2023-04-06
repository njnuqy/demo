package qy.demo.dataobject;

import qy.demo.model.User;

public class UserDo {
    private Long id;
    private String userName;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User toModel() {
        User user = new User();
        user.setId(getId());
        user.setName(getUserName());
        user.setPassword(password);
        return user;
    }
}
