package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.SkillDAO;
import model.Skill;

public class Main{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		SkillDAO  skilldao = new SkillDAO();
		
		List<Skill> skill = skilldao.listAllSkills();
		
		
		System.out.println("List of all skills are :");
		System.out.println();
		
		for(int i=0 ; i<skill.size();i++)
		{
			System.out.println((i+1) + " - " + skill.get(i).getSkillName());
		}
		
		
		
		
	}
}