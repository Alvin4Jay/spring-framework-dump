package model;

/**
 * 用户模型
 *
 * @author xuanjian
 */
public class User {

    /**
     * 自增长
     */
    private int id;

    /**
     * 用户名
     */
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
