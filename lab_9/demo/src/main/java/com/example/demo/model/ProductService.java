package model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private  ProductRepository repo  ;

    public  ProductService (@Autowired ProductRepository repo)
    {
        this.repo  = repo  ;
    }

    public List<Product> getAll()
    {
        return  repo.findAll() ;
    }

    public  Product add(Product p)
    {
        return  repo.save(p)  ;
    }
    public  boolean deleteByid(int id)
    {
        repo.deleteById(id);
        return  true  ;
    }

}
