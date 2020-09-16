package controller;

import java.sql.SQLException;

import dao.SkillDAO;

public class Main{
	public static void main(String []args) throws ClassNotFoundException, SQLException {
		SkillDAO skilldao=new SkillDAO();
		skilldao.skillCount();
		
		
	}
	
}