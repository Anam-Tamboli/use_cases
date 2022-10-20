package com.assignment.vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
public interface BikeRepo extends JpaRepository<BikeEntity, Integer>{
	@Query(value="SELECT * from bike b  JOIN truck t ON b.no_of_tyres=t.no_of_tyres;",nativeQuery=true)
	public List<BikeEntity> getjoinbike();
}
