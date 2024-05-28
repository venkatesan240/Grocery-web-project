package com.grocery.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.grocery.servlet.UserRegister;

public class Crud {

	DbConnection db=new DbConnection();
	public void insertRegister(UserRegister user) throws SQLException, ClassNotFoundException {
		String insertQuery="insert into register(name,email,mobile,password,confirm_password)values(?,?,?,?,?)";
		Connection connection = db.getConnection();
		PreparedStatement ps=connection.prepareStatement(insertQuery);
		ps.setString(1,user.getName());
		ps.setString(2,user.getEmail());
		ps.setString(3,user.getMobile());
		ps.setString(4,user.getPassword());
		ps.setString(5,user.getConfirmpassword());
		int rows = ps.executeUpdate();
		System.out.println(rows+" user registered sucessfully");
	}
	
	public int logincredencial(String name,String password) throws ClassNotFoundException, SQLException {
		String selectQuery="select count(*) from register where name=? and password=?;";
		PreparedStatement ps=db.getConnection().prepareStatement(selectQuery);
		ps.setString(1,name);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			return rs.getInt(1);
		}
		return 0;
	}
}
