import ex.kata.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeMachineScreenTest {
    CoffeeMachineSystem coffeeMachineSystem = new CoffeeMachineSystem();

    // Arrange
    Command commandOne = new Command("T", false, 1, true);
    Command commandTwo = new Command("H", false, 0, false);
    Command commandThree = new Command("C", true, 2, true);
    Command commandFour = new Command("O", false, 0, false);


    // Act
    String commandOneToTest = coffeeMachineSystem.getCommandSentence(commandOne, new Tea());
    String commandTwoToTest = coffeeMachineSystem.getCommandSentence(commandTwo, new Chocolate());
    String commandThreeToTest = coffeeMachineSystem.getCommandSentence(commandThree, new Coffee());
    String commandFourToTest = coffeeMachineSystem.getCommandSentence(commandFour, new OrangeJuice());



    // Assert
    @Test
    void displayCommandOne() {
        assertThat(commandOneToTest).isEqualTo("Drink maker makes one tea with 1 sugar(s) and a stick");
    }

    @Test
    void displayCommandTwo() {
        assertThat(commandTwoToTest).isEqualTo("Drink maker makes one chocolate with no sugar - and therefore no stick");
    }

    @Test
    void displayCommandThree() {
        assertThat(commandThreeToTest).isEqualTo("Drink maker makes an extra hot coffee with 2 sugar(s) and a stick");
    }

    @Test
    void displayCommandFour() {
        assertThat(commandFourToTest).isEqualTo("Drink maker will make one orange juice");
    }
}
