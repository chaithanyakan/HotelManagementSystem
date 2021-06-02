package com.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Dao.HotelDaoImplementation;
import com.hotelModel.Hotels;

@Controller
@Component
public class HotelController {
	@Autowired
	public HotelDaoImplementation dao;
	@RequestMapping("/addPerson")
	public String addPerson(@ModelAttribute("h2")Hotels h2,Model model){
		
		
		int i = dao.addCustomer(h2);
		System.out.println(i);
		model.addAttribute("Hotels", h2);
		return "display";
		
	}
	@RequestMapping(value="/customerList",method=RequestMethod.GET)
	public ModelAndView getCustomerList( )
	{
		
		ModelAndView mav = new ModelAndView("success");
		mav.addObject("hotel", dao.Customerlist());
		return mav;
		
	}
	
	@RequestMapping(value="/deletecustomer/{cid}" ,method=RequestMethod.GET)
    public ModelAndView removePerson(@ModelAttribute("h2") Hotels h2, HttpServletRequest req,@PathVariable int cid){
		
		dao.deleteCustomerDetails(cid);
		ModelAndView mav = new ModelAndView("delete1");

		return mav;
 
	
	

}
}
