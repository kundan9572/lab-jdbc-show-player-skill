package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO
{
	static List<Skill> list=new ArrayList<Skill>();
	public List< Skill > listAllSkills() throws ClassNotFoundException, SQLException, IOException
	{
        Connection con = ConnectionManager.getConnection();
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM SKILL ORDER BY name");
		while(rs.next())
		{
			long id=rs.getLong(1);
			String name=rs.getString(2);
			Skill skill=new Skill(id,name);
			list.add(skill);
		}
		
		return list;
	}	
		
}