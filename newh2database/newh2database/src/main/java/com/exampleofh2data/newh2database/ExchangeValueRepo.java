package com.exampleofh2data.newh2database;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepo  extends JpaRepository<ExchangeValueEntity,Integer> {
	ExchangeValueEntity findByFromAndTo(String from,String to);

}


