package com.libertymutual.goforcode.vicious_valet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.vicious_valet.models.Car;
import com.libertymutual.goforcode.vicious_valet.models.Lot;

@Controller
public class AppController {

	private Lot carLot;

	public AppController() {
		carLot = new Lot(3);
	}

	@RequestMapping("/remove")
	public ModelAndView removeCar(int carIndex) {
		carLot.removeCarFromLot(carIndex);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");
		mv.addObject("lot", carLot);
		mv.setViewName("redirect:/");
		return mv;
	}

	@RequestMapping("/")
	public ModelAndView showApp(String license, String licenseState, String color, String model, String make) {
		// if license is not null and the length of license is greater than 0
		// create a new instance of the car class from the values submitted
		// length is a method, so needs its own ().
		// license.length() is a number

		if (license != null && license.length() > 0) {
			Car car;
			car = new Car(license, licenseState, make, model, color);

			// park the car in the lot. add a method to the Lot class and call that method
			carLot.driveCarOnto(car);
		}

		ModelAndView mv;
		mv = new ModelAndView();
		mv.setViewName("app");

		// add the carLot so that I can see the list of cars in the view
		mv.addObject("lot", carLot);

		return mv;
	}

	    
}
