package com.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class stdDao {


	@Autowired
	private DataSource ds;
	
	public void save1(student s) {
		try {
		Connection con=	ds.getConnection();
			System.out.println("from dao class===" +s);
			System.out.println("from dao class===" +con);
			
			PreparedStatement st =con.prepareStatement("insert into spring.student values (?, ?, ?, ?)");
			st.setInt(1, s.getSid());
			st.setString(2, s.getSname());
			st.setInt(3, s.getSage());
			st.setString(4, s.getSqual());
			st.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void save(student s) {
		try {
		Connection con=	ds.getConnection();
			System.out.println("from dao class===" +s);
			System.out.println("from dao class===" +con);
			
			PreparedStatement st =con.prepareStatement("SELECT * FROM spring.student");
			st.execute();
		
			ResultSet rs=st.getResultSet();
			
		
			while(rs.next()) {
			  System.out.println(rs.getInt("sid")+rs.getString("sname")); }
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void save3(student s) {
		try {
		Connection con=	ds.getConnection();
			System.out.println("from dao class===" +s);
			System.out.println("from dao class===" +con);
			
			PreparedStatement st =con.prepareStatement("delete from spring.student where sid = ?");
			st.setInt(1, s.getSid());
			st.execute();
	 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void save6(student s) {
		try {
		Connection con=	ds.getConnection();
			System.out.println("from dao class===" +s);
			System.out.println("from dao class===" +con);
			
			PreparedStatement st =con.prepareStatement("update spring.student set sname ='venu' where sid = ?");
			
			st.setInt(1, s.getSid());
			st.execute();
	 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
