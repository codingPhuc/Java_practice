package com.nvm;


import java.sql.SQLException;
import java.util.List;

public class Program {
    public  static  void main(String args []) throws SQLException {
        if(args.length != 1)
        {
            System.out.println("invailed URL");
            return ;
        }
        System.out.println(args[0]);
        String url = args[0] ;
        ProductDAO dao = new ProductDAO(url) ;
        List<Product>  products = dao.readAll()  ; 
        for(Product  p  : products )
        {
            System.out.println(p);
        }
        dao.close() ; 
        }
}
