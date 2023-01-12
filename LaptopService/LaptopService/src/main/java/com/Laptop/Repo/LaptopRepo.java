package com.Laptop.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



public class LaptopRepo {
	@Repository
	public interface Productrepository extends JpaRepository<,Long>
	{
	    @Query("select count(*) from Product where product_id=?1")
	    public long getProductCountById(@Param(value = "1") long product_id);

		public static Optional<Product> findAll(long id) {
			// TODO Auto-generated method stub
			return null;

}
	}
}
