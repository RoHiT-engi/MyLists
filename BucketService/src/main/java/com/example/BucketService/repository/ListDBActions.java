package com.example.BucketService.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;

import com.example.BucketService.helper.JDBCHelper;
import com.example.BucketService.models.List;

public class ListDBActions {
    private final static String INSERT_NEW_TASK     = "INSERT INTO t_list VALUES(?,?,?,?)";
    private final static String UPDATE_TASK_BY_ID     = "UPDATE t_list SET task=? WHERE tid=?";
    private final static String UPDATE_TASK_BY_ID_AND_TITLE     = "UPDATE t_list SET task=? WHERE tid=? AND title=?";
    private final static String SELECT_BY_ID     = "SELECT * FROM t_list WHERE tid=?";
    private final static String SELECT_BY_TITLE = "SELECT * FROM t_list WHERE title=?";
    private final static String GET_COUNT = "SELECT COUNT(*) AS T_COUNT FROM t_list";
    private final static String DELETE_SQL_QUERY     = "DELETE FROM PERSON WHERE ID=?";
    private final static String DELETE_ALL_SQL_QUERY = "DELETE FROM PERSON";

    // private List lst;


    public static void addNewList(List lst) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int curr_count = 0;
        
        try{
            con = JDBCHelper.getConnection();
            if ( con == null )
            {
                System.out.println("Error getting the connection. Please check if the DB server is running");
                return;
            }
            
            ps = con.prepareStatement( GET_COUNT );
            rs = ps.executeQuery();

            while ( rs.next() )
            {
                curr_count = rs.getInt("T_COUNT");
            }
            con.setAutoCommit( false );
            ps = con.prepareStatement(INSERT_NEW_TASK);
            // Adding completed tasks;
            HashSet<String> tasks = lst.getRemTasks();
            Iterator<String> it = tasks.iterator();
            System.out.println(curr_count);
            while (it.hasNext()) {
                curr_count++;
                ps.setLong(1, curr_count);
                ps.setString(2, lst.getTitle());
                ps.setString(3, it.next());
                ps.setBoolean(4, false);
                ps.execute();
                System.out.println("insertTask for list"+lst.getTitle()+" => " + ps.toString());
            }

            con.commit();

        }
      catch ( SQLException e )
      {
         try
         {
            if ( con != null )
            {
               con.rollback();
            }
         }
         catch ( SQLException e1 )
         {
            throw e1;
         }
         throw e;
      }
      finally
      {
         try
         {
            JDBCHelper.closeResultSet( rs );
            JDBCHelper.closePrepaerdStatement( ps );
            JDBCHelper.closeConnection( con );
         }
         catch ( SQLException e )
         {
            throw e;
         }
      }
    }

    private static void addTaskBYTitle() {
        
    }
    
}
