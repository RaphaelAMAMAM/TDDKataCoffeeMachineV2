import ex.kata.CoffeeMachineSystem;
import ex.kata.Command;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeMachineSystemTest {
    CoffeeMachineSystem coffeeMachineSystem = new CoffeeMachineSystem();

    // Arrange
    String commandOne = "t:1:0";
    String commandTwo = "H::";
    String commandThree = "Ch:2:0";
    String commandFour = "::";
    String commandFive = "hh:5:0";
    String commandSix = "T:1:2";

    // Act
    Command commandOneToTest = coffeeMachineSystem.newCommand(commandOne);
    Command commandTwoToTest = coffeeMachineSystem.newCommand(commandTwo);
    Command commandThreeToTest = coffeeMachineSystem.newCommand(commandThree);
    Command commandFourToTest = coffeeMachineSystem.newCommand(commandFour);
    Command commandFiveToTest = coffeeMachineSystem.newCommand(commandFive);
    Command commandSixToTest = coffeeMachineSystem.newCommand(commandSix);

    // Assert
    @Test
    void newCommandTestOne() {
        assertThat(commandOneToTest.toString()).isEqualTo(new Command("T", false, 1, true).toString());
    }

    @Test
    void newCommandTestTwo() {
        assertThat(commandTwoToTest.toString()).isEqualTo(new Command("H", false, 0, false).toString());
    }

    @Test
    void newCommandTestThree() {
        assertThat(commandThreeToTest.toString()).isEqualTo(new Command("C", true, 2, true).toString());
    }

    @Test
    void newCommandTestFour() {
        assertThat(commandFourToTest.toString()).isEqualTo(new Command("UNKNOWN DRINK", false, 0, false).toString());
    }

    @Test
    void newCommandTestFive() {
        assertThat(commandFiveToTest.toString()).isEqualTo(new Command("H", true, 5, true).toString());
    }

    @Test
    void newCommandTestSix() {
        assertThat(commandSixToTest.toString()).isEqualTo(new Command("T", false, 1, false).toString());
    }
}
