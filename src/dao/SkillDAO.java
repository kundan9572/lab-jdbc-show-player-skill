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
	
	public List<Skill >listAllSkills() throws ClassNotFoundException, SQLException, IOException{
		
		List<Skill>  list = new ArrayList<Skill>();

		ConnectionManager con = new ConnectionManager();
		
		Statement st= con.getConnection().createStatement();
		
		String sql= "SELECT * FROM SKILL";
			
		ResultSet rs= st.executeQuery(sql);
		
		while(rs.next()) {
			Skill skill = new Skill(rs.getLong("ID") , rs.getString("NAME"));
			list.add(skill);
		}
		
		return list;
		
	}
}
