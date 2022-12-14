package com.assignment.vehicle;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface CarRepo extends JpaRepository<CarEntity, Integer>{
	//@Query("SELECT * FROM car c JOIN bike b on c.type_of_tyres=b.type_of_tyres")
	//public List<CarEntity> car_tyre();
	
	@Query(value="SELECT * from car c INNER JOIN truck t ON t.no_of_tyres=c.no_of_tyres;",nativeQuery=true)
	public List<CarEntity> getjoincar();
}

