package com.example.BucketService.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
// import org.sqlite.JDBC;

/**
 * @author preetham
 * https://www.youtube.com/watch?v=293M9-QRZ0c
 * https://www.sqlitetutorial.net/sqlite-java/sqlite-jdbc-driver/
 */
public class JDBCHelper
{
   private static Connection connection;

   // static
   // {
   //    try
   //    {
         // Class.forName( JDBCConstants.DRIVER_NAME );
   //    }
   //    catch ( ClassNotFoundException e )
   //    {
   //       System.out.println( "Driver class not found" );
   //    }
   // }

   public static Connection getConnection() throws SQLException
   {
      connection = DriverManager.getConnection( JDBCConstants.URL );
      return connection;
   }

   public static void closeConnection( Connection con ) throws SQLException
   {
      if ( con != null )
      {
         con.close();
      }
   }

   public static void closePrepaerdStatement( PreparedStatement stmt ) throws SQLException
   {
      if ( stmt != null )
      {
         stmt.close();
      }
   }

   public static void closeResultSet( ResultSet rs ) throws SQLException
   {
      if ( rs != null )
      {
         rs.close();
      }
   }

}