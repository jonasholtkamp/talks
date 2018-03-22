package de.jonasholtkamp.senacor.cdct.account;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import de.jonasholtkamp.senacor.cdct.AccountController;
import org.junit.Before;

/**
 * @author jholtkamp
 */
public class AccountBase {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new AccountController());
    }
}