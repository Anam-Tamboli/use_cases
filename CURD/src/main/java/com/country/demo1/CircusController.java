package com.country.demo1;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class CircusController {
@Autowired
	private CircusRepo cri;
	@GetMapping("/circus") 
	public List<CircusEntity> getSample(){
		ArrayList<CircusEntity> transformedvalues=new ArrayList<CircusEntity>();
		for(CircusEntity emt:cri.findAll()) {
			CircusEntity cr=new CircusEntity ();
			cr.setCr_id(emt.getCr_id());
			cr.setCr_name(emt.getCr_name());
			cr.setCr_type(emt.getCr_type());
			transformedvalues.add(cr);
		}
		return transformedvalues;
	}
//	public ModelAndView getAllCircus(){
//		ModelAndView mav = new ModelAndView("list-circus");
//		mav.addObject("circus", cri.findAll());
//		return mav;
}

