package api.service.dmc.wspr.service;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class KeyVaultSecretService implements SecretProvider {

	private final String secretName;
	private final SecretClient secretClient;

	public KeyVaultSecretService(
			@Value("${azure.keyvault.endpoint}") String vaultEndpoint,
			@Value("${azure.keyvault.secret-name}") String secretName) {
		if (!StringUtils.hasText(vaultEndpoint)) {
			throw new IllegalStateException("AZURE_KEY_VAULT_ENDPOINT debe estar configurada");
		}
		if (!StringUtils.hasText(secretName)) {
			throw new IllegalStateException("AZURE_KEY_VAULT_SECRET_NAME debe estar configurada");
		}

		this.secretName = secretName;
		this.secretClient = new SecretClientBuilder()
				.vaultUrl(vaultEndpoint)
				.credential(new DefaultAzureCredentialBuilder().build())
				.buildClient();
	}

	@Override
	public String getSecret() {
		return secretClient.getSecret(secretName).getValue();
	}
}
