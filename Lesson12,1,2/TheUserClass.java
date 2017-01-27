public class TheUserClass
{
	private String fName, lName, avatar;
	private int userID;
	
	public void User()
	{
		fName = "Unknown";
		lName = "Unknown";
		avatar = "Unknown";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void User(String fNa, String lNa)
	{
		fName = fNa;
		lName = lNa;
		avatar = "Unknown";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void User(String fNa, String lNa, String AV)
	{
	    fName = fNa;
	    lName = lNa;
	    avatar = AV;
	    userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public String toString()
	{
	   return "User information- \nfName- " + fName +
	   "\nlName- " + lName + "\nAvatar name- " + avatar +
	   "\nID#- " + userID;
	}
}