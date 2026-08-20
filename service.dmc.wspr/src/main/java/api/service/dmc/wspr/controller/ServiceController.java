package api.service.dmc.wspr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ServiceController {

	@GetMapping("/hello")
	public String hello(@RequestParam String nombre) {
		return nombre;
	}
}
