package javadersleri;

import java.lang.*;

import java.sql.*;

public class Testdb
{
            public static void main(String[] args)
            {

                        try
                        {

                                   /*

                                   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                                   String connectionUrl = "jdbc:sqlserver:// 127.0.0.1; databaseName=pubs";

                                   Connection conn = DriverManager.getConnection(connectionUrl, "sa", "123");

                                   */

                                  Class c = Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                                   Driver drv = (Driver) c.newInstance();

                                  Connection conn = drv.connect("jdbc:sqlserver://127.0.0.1; databaseName=library; user=sa; password=12345", null);

                                   Statement stmt = conn.createStatement();

                                   ResultSet rs;

                                   rs = stmt.executeQuery("select * from users");                                                                      

                                   while (rs.next())
                                   {

                                               System.out.print(rs.getString("u_name")+" ");
                                               System.out.println(rs.getString("u_password"));
                                   }

                        }

                        catch (ClassNotFoundException e)      {                                 

                                   e.printStackTrace();

                        }                     

                        catch (SQLException e2)                        {

                                   e2.printStackTrace();

                        }

                        catch (InstantiationException e)            {

                                   e.printStackTrace();

                        }

                        catch (IllegalAccessException e)          {

                                   e.printStackTrace();

                        }

         }

}