package api.service.dmc.wspr.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI serviceOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Service DMC WSPR API")
						.description("Documentación de los servicios REST de DMC WSPR")
						.version("1.0.0"));
	}
}
