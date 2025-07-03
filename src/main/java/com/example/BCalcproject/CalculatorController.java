package com.example.BCalcproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")

public class CalculatorController {
	
	@GetMapping("/add")
	public double add(@RequestParam double uinum1, @RequestParam double uinum2) {
		return AddOperation.compute(uinum1, uinum2);
	}
	
	@GetMapping("/sub")
	public double sub(@RequestParam double uinum1, @RequestParam double uinum2) {
		return SubtractOperation.compute(uinum1, uinum2);
	}
	
	@GetMapping("/mul")
	public double mul(@RequestParam double uinum1, @RequestParam double uinum2) {
		return MultiplyOperation.compute(uinum1, uinum2);
	}
}
