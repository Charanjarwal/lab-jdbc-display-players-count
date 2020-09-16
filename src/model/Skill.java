package model;

public class Skill{
//	//Progression 2:
//	1.Create a model class called as skill with below attributes,- skillld - Long- skillName - String 
//	2.Include getter and setter methods for all the attributes*
//	3.Include a constructor with below arguments,- public skill(skillld,skillName) 
	private long skillId;
	private String skillName;
	public long getSkillId() {
		return skillId;
	}
	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public Skill(Long skillId,String skillName) {
		super();
		this.skillId=skillId;
		this.skillName=skillName;
		
		
		
	}
	

	
}
