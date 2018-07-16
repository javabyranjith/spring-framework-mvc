package jbr.springmvc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public class UserDaoImpl implements UserDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void register(User user) {
		String sql = "insert into users values(?,?,?,?,?,?,?)";

		jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstname(),
				user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone() });
	}

	@Override
	public User validateUser(Login login) {
		String sql = "select * from users where username='" + login.getUsername() + "' and password='"
				+ login.getPassword() + "'";

		List<User> users = jdbcTemplate.query(sql, new UserMapper());

		return users.size() > 0 ? users.get(0) : null;
	}

}
