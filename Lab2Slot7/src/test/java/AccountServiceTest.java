import QuocDE190667.AccountService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountServiceTest {
    private static AccountService accountService;
    @BeforeAll
    static void initAll() {
        accountService = new AccountService();
    }

    @AfterAll
    static void cleanupAll() {
        accountService = null;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv")
    void testIsValidEmail(String name, String password, String email) {
        assertTrue(accountService.isValidEmail(email));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv")
    void testRegisterAccount(String name, String password, String email) {
        assertTrue(accountService.registerAccount(name, password, email));
    }
}
