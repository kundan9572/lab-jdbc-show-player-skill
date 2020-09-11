package dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO {
	List<Skill>  list = new ArrayList<Skill>();

	
	public List<Skill >listAllSkills() throws ClassNotFoundException, SQLException, IOException{
		
		Skill skill = null;
		ConnectionManager con = new ConnectionManager();
		
		Statement st= con.getConnection().createStatement();
		
		String sql= "SELECT * FROM SKILLS";
		ResultSet rs= st.executeQuery(sql);
		
		while(rs.next()) {
			skill= new Skill();
			
			skill.setSkillId("SKILLID");
			skill.setSkillName(rs.getString("NAME"));
			list.add(skill);
		
		}
		
		return list;
		
	}
}
