
import java.sql.*; 

public class dbconnect {
    
    public static void main(String [] args) {

        Connection conn = null;
        
        try{  
            //step1 load the driver class  
            Class.forName("oracle.jdbc.driver.OracleDriver");  
              
            //step2 create  the connection object  
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@183.88.230.183:1521:gcoop","iscomu","iscomu");  
              
            //step3 create the statement object  
            Statement stmt=con.createStatement();  
              
            //step4 execute query  
            ResultSet rs=stmt.executeQuery("select emp_no,id_card,salary_amt from hremployee where emp_no = '000014'");  
            while(rs.next())  
            System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getDouble(3));  
              
            //step5 close the connection object  
            con.close();  
              
            }catch(Exception e)
            { 
                System.out.println(e);
            }  
        } 
    
}
