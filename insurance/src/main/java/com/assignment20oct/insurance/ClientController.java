package com.assignment20oct.insurance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
@Autowired
private ClientRepo cr;
@GetMapping("/c1")
public List<ClientEntity> client1(){
	return cr.getdetail(1);
}

@GetMapping("/c2")
public List<ClientEntity> client2(){
	return cr.getdetail(2);
}

@GetMapping("/c3")
public List<ClientEntity> client3(){
	return cr.getdetail(3);
}

@GetMapping("/c4")
public List<ClientEntity> client4(){
	return cr.getdetail(4);
}

@GetMapping("/c5")
public List<ClientEntity> client5(){
	return cr.getdetail(5);
}
}
