package com.smily.CustomerProd.Repo;

import com.sagar.CustomerProd.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, String> {

}
