package de.jonasholtkamp.senacor.cdct;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author jholtkamp
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureStubRunner(
        ids = {"de.jonasholtkamp.senacor:devcon-2017-cdct-provider:+:stubs:8090"},
        workOffline = true)
@DirtiesContext
public class AccountServiceTest {

    private static final String REMOTE = "http://localhost:8090";

    private AccountService sut;

    @Before
    public void setUp() throws Exception {
        sut = new AccountService(REMOTE);
    }

    @Test
    public void getAccount() throws Exception {
        String userId = "1234567890";

        Account account = sut.getAccount(userId);

        assertThat(account).isNotNull();
        assertThat(account).isEqualTo(new Account(userId, "Chuck", "Norris"));
    }
}