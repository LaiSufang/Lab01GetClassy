import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SafeInputObjTest {
    private SafeInputObj safeInputObj;

    @BeforeEach
    void setUp() {
        safeInputObj = new SafeInputObj();
    }

    @Test
    void getNonZeroLenString() {
        safeInputObj.getNonZeroLenString("Enter your name: ");
    }

    @Test
    void getRangedInt() {
        safeInputObj.getRangedInt("Enter your age: ", 0, 100);
    }

    @Test
    void getInt() {
        safeInputObj.getInt("Enter your favorite number: ");
    }

    @Test
    void getRangedDouble() {
        safeInputObj.getRangedDouble("Enter your product price: ", 0.0, 100.0);
    }

    @Test
    void getDouble() {
        safeInputObj.getDouble("Enter your favorite number: ");
    }

    @Test
    void getYNConfirm() {
        safeInputObj.getYNConfirm("Are you finished? (y/n): ");
    }

    @Test
    void getRegExString() {
        safeInputObj.getRegExString("Enter your phone number: ", "\\d{3}-\\d{3}-\\d{4}");
    }
}