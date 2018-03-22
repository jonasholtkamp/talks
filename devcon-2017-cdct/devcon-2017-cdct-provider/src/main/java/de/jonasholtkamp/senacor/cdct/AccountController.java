package de.jonasholtkamp.senacor.cdct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @RequestMapping(path = "/{userId}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public Account getSingleAccount(@PathVariable String userId) {
        return new Account(userId, "Chuck", "Norris");
    }
}