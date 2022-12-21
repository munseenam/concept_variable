import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class staticVariableTest {

    staticVariable detail = new staticVariable();

    @Test
    public void ToTestTheWorkingOfStaticVariable() {


         detail.detailsOfKids("sofy", "alex", 300);
         String output="sofy & alex welcome to grandpas' fantacy park! ";
        assertEquals("sofy & alex welcome to grandpas' fantacy park! " ,output);

    }

}