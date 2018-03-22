package de.jonasholtkamp.senacor.cdct;

import lombok.RequiredArgsConstructor;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
public class AccountService {

    private final RestTemplate restTemplate = new RestTemplate();

    private final String remote;

    public Account getAccount(String iban) {
        return restTemplate.getForObject(getUrl(iban), Account.class);
    }

    private String getUrl(String iban) {
        return remote + "/accounts/" + StringUtils.trimAllWhitespace(iban);
    }
}
