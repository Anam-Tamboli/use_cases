package com.assignment.vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
public interface TruckRepo extends JpaRepository<TruckEntity, Integer> {
	@Query(value="SELECT * from truck t  JOIN car c ON t.no_of_tyres=c.no_of_tyres;",nativeQuery=true)
	public List<TruckEntity> getjointruck();

}
