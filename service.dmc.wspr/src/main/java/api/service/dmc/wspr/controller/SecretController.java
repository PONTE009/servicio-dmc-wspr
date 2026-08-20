package api.service.dmc.wspr.controller;

import api.service.dmc.wspr.service.SecretProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretController {

	private final SecretProvider secretProvider;

	public SecretController(SecretProvider secretProvider) {
		this.secretProvider = secretProvider;
	}

	@GetMapping("/secreto")
	public String getSecret() {
		return secretProvider.getSecret();
	}
}
