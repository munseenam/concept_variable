import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class localVariableTest {
    localVariable treasure = new localVariable();

    @Test
    public void ToTestLocalVariable() {
//String TestName="abc";


         boolean val =  treasure.MultipleVariable("sofy",200,200,true);
         assertEquals(true,val);

    }


}