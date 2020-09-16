package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.TreeMap;

import model.Skill;
import utility.ConnectionManager;


//1.Create a dao-class called as skilIDAO with below method,- public TreeMap<skill,lnteger> skillCount() -
//Method used to retrieve number of players having particular skill. `	
//Hint skillCount() method returns a map with key as skill type and value as number of players in that skill.
//Use TreeMap to store the values in alpabetical order. `

public class SkillDAO{
	
	public TreeMap<Skill,Integer>skillCount () throws ClassNotFoundException, SQLException {

		String sql="select count(*) from skill join player ON skill.name=player.skill group by player.skill";
		
		PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
		System.out.println("count is"+rs);

		
//		while(rs.next()) {
//			
//			long skillId=rs.getLong(1);
//			String skillname=rs.getString(2);
//			Skill s=new Skill(skillId,skillname);
//			
//			
//			System.out.println(skillname);
//			System.out.println(skillId);
//		}
		ConnectionManager.getConnection().close();
		return null;
		
	}
}