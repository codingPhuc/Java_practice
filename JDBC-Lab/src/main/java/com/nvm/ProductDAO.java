package com.nvm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import com.mysql.cj.xdevapi.Statement;

public class ProductDAO implements Repository<Product, Integer> {
    private Connection conn;

    public ProductDAO(String url) throws SQLException {
        conn = DriverManager.getConnection(url);
        System.out.println("Connected");

    }

    @Override
    public Integer add(Product item) {
        return null;
    }

    @Override
    public List<Product> readAll() {
        String sql  = "select * from product"  ; 
        java.sql.Statement stm = null   ; 
        try 
        {
            stm = conn.createStatement()  ;
            ResultSet rs =  stm.executeQuery(sql)  ;
            List<Product> products  = new ArrayList<>() ; 
            while(rs.next() )
            {
                int id = rs.getInt(1) ; 
                String name = rs.getString(2) ;
                int price = rs.getInt(3) ;
                String color = rs.getString(price) ; 
                Product p = new Product(id, name, price ,color) ;

            }
            rs.close();  
            stm.close(); 
            return  products  ; 
        }
        catch(SQLException e)
        {
            return null ; 
        }
    }

    @Override
    public Product read(Integer id) {
        return null;
    }

    @Override
    public boolean update(Product item) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}