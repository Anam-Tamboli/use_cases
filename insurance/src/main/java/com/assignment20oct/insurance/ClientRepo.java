package com.assignment20oct.insurance;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface ClientRepo extends JpaRepository<ClientEntity, Integer> {
	@Query(value="SELECT * from clients c where c.id= ?1",nativeQuery=true)
	public List<ClientEntity> getdetail(Integer id);
}



	
	
	
