package com.kpi.microservice.currencyexchangeexampleservice.sample;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ch.qos.logback.classic.Logger;

@RestController  
public class CurrencyExchangeSampleController {
	 //private org.jboss.logging.Logger logger = LoggerFactory.logger(this.getClass());
	  
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionSampleBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable Double quantity) {
//		Map<String, String>uriVariables=new HashMap<>();  
//		uriVariables.put("from", from);  
//		uriVariables.put("to", to);
		//ResponseEntity<CurrencyConversionSampleBean>responseEntity=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionSampleBean.class, uriVariables);
		//CurrencyConversionSampleBean response=responseEntity.getBody();  
		
		String currency1="DOLLAR";
		String currency2="RUPEE";
		String currency3="DIHRAM";
		String currency4="EURO";
		String currency5="POUND";
		
		double per=0;
		double mul=0;
		//DOLLAR
		  if (from.equals(currency1))
		  {
			  if (to.equals(currency1)) 
			  {
				 mul=1;
				 per=quantity*mul;
			  }
			  if(to.equals(currency2)) 
			  {
				 mul=82.33;
				 per=quantity*mul;
			  }
			  if(to.equals(currency3))
			  {
				  mul=3.67;
				  per=quantity*mul;
			  }
			  if(to.equals(currency4))
			  {
				  mul=0.99;
				  per=quantity*mul;
			  }
			  else if(to.equals(currency5))
			  {
				  mul=0.86;
				  per=quantity*mul;
			  }
		  }
	//RUPEE
		  
		  if (from.equals(currency2))
		  {
			  if (to.equals(currency2)) 
			  {
				 mul=1;
				 per=quantity*mul;
			  }
			  if(to.equals(currency1)) 
			  {
				 mul=82.33;
				 per=quantity*mul;
			  }
			  if(to.equals(currency3))
			  {
				  mul=3.67;
				  per=quantity*mul;
			  }
			  if(to.equals(currency4))
			  {
				  mul=0.012;
				  per=quantity*mul;
			  }
			  else if(to.equals(currency5))
			  {
				  mul=0.010;
				  per=quantity*mul;
			  }
		  }
	//DIHRAM	  
		  if (from.equals(currency3))
		  {
			  if (to.equals(currency3)) 
			  {
				 mul=1;
				 per=quantity*mul;
			  }
			  if(to.equals(currency1)) 
			  {
				 mul=0.27;
				 per=quantity*mul;
			  }
			  if(to.equals(currency2))
			  {
				  mul=22.41;
				  per=quantity*mul;
			  }
			  if(to.equals(currency4))
			  {
				  mul=0.27 ;
				  per=quantity*mul;
			  }
			  else if(to.equals(currency5))
			  {
				  mul=0.23;
				  per=quantity*mul;
			  }
		  }
		  
		  //EURO
		  
		  if (from.equals(currency4))
		  {
			  if (to.equals(currency4)) 
			  {
				 mul=1;
				 per=quantity*mul;
			  }
			  if(to.equals(currency1)) 
			  {
				 mul=1;
				 per=quantity*mul;
			  }
			  if(to.equals(currency2))
			  {
				  mul=82.83;
				  per=quantity*mul;
			  }
			  if(to.equals(currency3))
			  {
				  mul=3.70 ;
				  per=quantity*mul;
			  }
			  else if(to.equals(currency5))
			  {
				  mul=0.87 ;
				  per=quantity*mul;
			  }
		  }
		//POUND  

		  if (from.equals(currency5))
		  {
			  if (to.equals(currency5)) 
			  {
				 mul=1;
				 per=quantity*mul;
			  }
			  if(to.equals(currency1)) 
			  {
				 mul=1.16;
				 per=quantity*mul;
			  }
			  if(to.equals(currency2))
			  {
				  mul=95.41;
				  per=quantity*mul;
			  }
			  if(to.equals(currency3))
			  {
				  mul=4.26  ;
				  per=quantity*mul;
			  }
			  else if(to.equals(currency4))
			  {
				  mul=1.15 ;
				  per=quantity*mul;
			  }
		  }
		return new CurrencyConversionSampleBean(1L, from,to,mul,quantity,per,0 );  
}
}
