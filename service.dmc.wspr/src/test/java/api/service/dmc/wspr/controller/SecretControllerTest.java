package api.service.dmc.wspr.controller;

import api.service.dmc.wspr.service.SecretProvider;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SecretControllerTest {

	@Test
	void returnsSecretObtainedFromProvider() {
		SecretProvider provider = () -> "valor-secreto";
		SecretController controller = new SecretController(provider);

		assertThat(controller.getSecret()).isEqualTo("valor-secreto");
	}
}
