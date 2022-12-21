import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class instanceVariableTest {

    instanceVariable treasure = new instanceVariable();

    @Test
    public void ToTestInstanceVariable() {



        boolean val =  treasure.MultipleVariable("sofy",200,200,true);
        assertEquals(true,val);

    }


}