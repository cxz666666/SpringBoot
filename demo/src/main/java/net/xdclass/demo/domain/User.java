package net.xdclass.demo.domain;

/**
 * @PackageName: net.xdclass.demo.domain
 * @ClassName: User
 * @Description:
 * @author: cxz
 * @date 2019/12/2 9:24
 */
public class User {

    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
