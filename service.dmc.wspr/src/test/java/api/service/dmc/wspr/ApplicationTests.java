package api.service.dmc.wspr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
		"azure.keyvault.endpoint=https://test.vault.azure.net",
		"azure.keyvault.secret-name=test-secret"
})
class ApplicationTests {

	@Test
	void contextLoads() {
	}

}
