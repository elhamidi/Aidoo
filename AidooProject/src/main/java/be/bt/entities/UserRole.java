package be.bt.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_roles database table.
 * 
 */
@Entity
@Table(name="user_roles")
@NamedQuery(name="UserRole.findAll", query="SELECT u FROM UserRole u")
public class UserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_role_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userRoleId;

	private String role;

	//bi-directional many-to-one association to MyUser
	@ManyToOne
	@JoinColumn(name="username")
	private MyUser user;

	public UserRole() {
	}

	public int getUserRoleId() {
		return this.userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public MyUser getUser() {
		return this.user;
	}

	public void setUser(MyUser user) {
		this.user = user;
	}

}