package instantiate.defaultconstruct;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户模型
 *
 * @author xuanjian
 */
public class User {

	@Autowired
	private Address address;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User{" +
				"address=" + address +
				", id=" + id +
				", name='" + name + '\'' +
				'}';
	}

}
