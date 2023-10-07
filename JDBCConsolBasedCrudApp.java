import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

/*
     # JDBCConsolBasedCrudApp
    This is a Consol based Application for JDBC CRUD operation(MYSQL Database)
	# Requirements
	1.MYSQL Database having database name - "student",and table name - "studentinfo" having column names
	  i. sid(int Auto-increment) ii. sname (varchar)  iii. sage (int) iv. saddress (varchar)
	2.Add your databse username and password in the line  
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","username","password");
	and perform CRUD operation using this program 
	3. download mysql-connector-jar and
	4.set classpath
            i.In windows open cmd and run command (set classpath=;.;"enter the path of the .jar")
           ii. In linux (java -cp .:pathOf.jarFile  Main)
    
*/

public class JDBCConsolBasedCrudApp{

	public static void main(String[] args) {
        Connection connection = null;
		PreparedStatement pstmInsert = null;
		PreparedStatement pstmSelect = null;
		PreparedStatement pstmDelete = null;
		PreparedStatement pstmUpdate = null;
		ResultSet resultSet   = null;
	
		String insertQuery  = "INSERT INTO STUDENTINFO(sname,sage,saddress) VALUES (?,?,?);";
		String selectQuerry = "SELECT sid,sname,sage,saddress FROM STUDENTINFO where sid =?;";
	    String deleteQuerry = "delete from STUDENTINFO where sid =?;";
	    String updateQuerry = "update STUDENTINFO set sname =?,sage =? ,saddress=? where sid=?;";
		int option=0;
		int sid=0;
		String sname = null;
		String saddress= null;
		int sage = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("ENTER 1 FOR PERFORMING INSERT OPERATION");
		System.out.println("ENTER 2 FOR PERFORMING SELECT OPERATION");
		System.out.println("ENTER 3 FOR PERFORMING UPDATE OPERATION");
		System.out.println("ENTER 4 FOR PERFORMING DELETE OPERATION");
		option = input.nextInt();
		
		
	    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student"," "," ");
		System.out.println("CONNECTED TO DB");	
			switch (option) {
			case 1: {
				 if(connection!=null)
					 pstmInsert = connection.prepareStatement(insertQuery);
				     if (pstmInsert!=null) {
						 System.out.println("ENTER name OF THE STUDENT ::");
						 sname = input.next();
						 System.out.println("ENTER age OF THE STUDENT ::");
						 sage = input.nextInt();
						 System.out.println("ENTER address OF THE STUDENT ::");
						 saddress = input.next();
						 pstmInsert.setString(1,sname);
						 pstmInsert.setInt(2,sage);
						 pstmInsert.setString(3,saddress);
						 int rA=0;
						 rA= pstmInsert.executeUpdate();
						 if (rA==0)
							 System.out.println("record insertion failed");
						 else 
							 System.out.println("record inserted succesfully");
				     }
				     break;
			    }
			case 2 :{
				if (connection !=null)
					pstmSelect = connection.prepareStatement(selectQuerry);
				   if(pstmSelect!=null) {
					  System.out.println("ENTER id OF THE STUDENT ::"); 
					  sid = input.nextInt();
					  pstmSelect.setInt(1,sid);
					  resultSet= pstmSelect.executeQuery();
					  System.out.println("SID\tSNAME\tSAGE\tSADDRESS");
					  if(resultSet.next())
						  System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getInt(3)+"\t"+resultSet.getString(4));
				     else 
				    	 System.out.println("record not available for the given id");
				   }
			       break;	
			}
			case 3 :{
				if (connection !=null) {
					pstmSelect = connection.prepareStatement(selectQuerry);
				   if(pstmSelect!=null) {
					  System.out.println("ENTER id OF THE STUDENT ::"); 
					  sid = input.nextInt();
					  pstmSelect.setInt(1,sid);
					  resultSet= pstmSelect.executeQuery(); 
				   }
				   if (resultSet.next()) {
				   pstmUpdate = connection.prepareStatement(updateQuerry);
				     if(pstmUpdate!=null) {
				    	 System.out.print("ID :"+resultSet.getInt(1) +": (you cannot change id).");
				    	 System.out.print("\nNAME : "+resultSet.getString(2) +": ENTER NEW NAME --");
                         sname = input.next();
                         if (sname =="")
                        	 sname =resultSet.getString(2); 
                         System.out.print("\nAGE : "+resultSet.getInt(3) +": ENTER NEW AGE --");
                         sage = input.nextInt();
                         if (sage == (char)13)
                        	 sage =resultSet.getInt(3); 
                         System.out.print("\nADDRESS : "+resultSet.getString(4) +": ENTER NEW ADDRESS --");
                         saddress = input.next();
                         if (saddress == "")
                        	 saddress =resultSet.getString(4); 
                         
                         pstmUpdate.setString(1,sname);
                         pstmUpdate.setInt(2,sage);
                         pstmUpdate.setString(3,saddress);
                         pstmUpdate.setInt(4,sid);
                         
                         int rA = 0 ;
                         rA  = pstmUpdate.executeUpdate();
                         if(rA==0)
                        	 System.out.println("record updation failed");
                         else 
                        	 System.out.println("record updated succesfully");
                    }
				  }
				}else {
					System.out.println("no such student exists");
				}
				   
				   break;
			}
			case 4:{
				if (connection!=null)
					  pstmDelete=connection.prepareStatement(deleteQuerry);
				if (pstmDelete!=null) {
					System.out.println("ENTER ID OF STUDNET");
					sid=input.nextInt();
					pstmDelete.setInt(1,sid);
					int rA = 0 ;
					rA= pstmDelete.executeUpdate();
					if (rA==1)
					System.out.println("record deleted succesfully.");
					else
						System.out.println("record not available for the given id");
				}
				break;	
			}
			default:{
				System.out.print("wrong Input");
			}
				
			}
		
		
	  }catch (SQLException e) {
	    e.printStackTrace();
	  }catch (Exception e) {
		  e.printStackTrace();
	}finally {
		try {
			input.close();
			if(pstmDelete!=null)
				pstmDelete.close();
			if(pstmInsert!=null)
				pstmInsert.close();
			if(pstmUpdate!=null)
				pstmUpdate.close();
			if(pstmSelect!=null)
				pstmSelect.close();
            if(connection != null)
                connection.close();
            if(resultSet != null)
               resultSet.close();
			System.out.println("connection closed sucessfully");
		} catch (SQLException e2) {
			e2.printStackTrace();
		}catch(Exception e ){
            e.printStackTrace();
        }
	}

  }
}
