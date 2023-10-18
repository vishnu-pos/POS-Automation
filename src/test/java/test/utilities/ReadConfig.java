package test.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
		Properties pro;

		public ReadConfig() {

			File src=new File("./Configurations/conf.properties");

			try {

				FileInputStream fis=new FileInputStream(src);

				pro=new Properties();

				pro.load(fis);

			} catch (Exception e) {

				System.out.println("Exception Msg is :"+ e.getMessage());
			}
		}

		public String getAppUrl() {

			String url=pro.getProperty("URL");
			

			return url;
		}
	public String getAdminuserName() {
		String adminusername = pro.getProperty("AdminUserName");
		return adminusername;

	}
	
	public String getAdminUserPass() {
		String adminpassword = pro.getProperty("AdminPassword");
		return adminpassword;

	}
	
	public String getEnergyUser() {
		String euser = pro.getProperty("User");
		return euser;

	}
	
	
	public String getEnergyPass() {
	
		String epass = pro.getProperty("Password");
		return epass;
	}
	

	public String getEUrl() {

		String Eurl=pro.getProperty("EURL");
		

		return Eurl;
	}
	
	
	
	
	
	
}

