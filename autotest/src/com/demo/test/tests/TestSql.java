package com.demo.test.tests;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.test.utils.JdbcUtil;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class TestSql {
	   static JdbcUtil jdbc =new JdbcUtil();
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("**********");
      getAll1();
      Aczichan ac=new Aczichan(null, null, null, null, null);
   
      
	}
	private static Integer getAll() {
	    Connection conn = (Connection) JdbcUtil.getConnection();
	    System.out.println("_________________");
	    String sql = "SELECT * from nba_asset_data";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        int col = rs.getMetaData().getColumnCount();
	        System.out.println("============================");
	        while (rs.next()) {
	            for (int i = 1; i <= col; i++) {
	                System.out.print(rs.getString(i) + "\t");
	                if ((i == 2) && (rs.getString(i).length() < 8)) {
	                    System.out.print("\t");
	                }
	             }
	            System.out.println("");
	        }
	            System.out.println("============================");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	 
	private static Integer getAll1() {
		
	    Connection conn = (Connection) JdbcUtil.getConnection();
	    System.out.println("_________________");
	    String sql = "SELECT * from nba_asset_data";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        int col = rs.getMetaData().getColumnCount();
	        System.out.println("============================");
	        while (rs.next()) {
	            for (int i = 1; i <= col; i++) {
	                System.out.print(rs.getString(i) + "\t");
	                if ((i == 2) && (rs.getString(i).length() < 8)) {
	                    System.out.print("\t");
	                }
	             }
	            System.out.println("");
	        }
	            System.out.println("============================");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	

}
