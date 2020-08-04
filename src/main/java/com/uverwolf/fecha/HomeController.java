package com.uverwolf.fecha;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/")
public String String(Model modelo) {
	modelo.addAttribute("nombre", "Leonel");
	return "index.jsp";
}

@RequestMapping("/fecha")
public String fecha(Model modelo) {

	LocalDate fecha = LocalDate.now();
	DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("EEEE','dd' de 'MMMM','yyyy");
	modelo.addAttribute("fecha", fecha.format(formatoFecha));
	
	return "fecha.jsp";
}

@RequestMapping("/hora")
public String hora(Model modelo) {
	LocalTime hora = LocalTime.now();
	DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("hh:mm a");
	modelo.addAttribute("hora",  hora.format(formatoHora));
	return "hora.jsp";
}
}
