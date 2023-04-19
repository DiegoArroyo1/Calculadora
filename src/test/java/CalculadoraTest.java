import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

 Calculadora c;

 @BeforeEach
 void setUp() {
  c = new Calculadora(); //NO OLVIDAR ACTIVAR LA CALCULADORA UWU

 }

 @AfterEach
 void tearDown() {

 }

  @ParameterizedTest
  @ValueSource(ints = {1, 2, 3})
  void sumaZeroTest(int num) {
   assertEquals(num, c.sumar(num, 0));


/*Calculadora c = new Calculadora();
 assertEquals(2,c.sumar(1,1));
 assertEquals(3,c.sumar(1,2));
 assertNotEquals(1,c.sumar(1,1));*/

 }

 @ParameterizedTest
 @CsvSource({
         "3,1,2",
         "3,2,1",
         "4,2,2",
         "6,2,4"
 })
 void sumaRandomTest(int esperado, int value1, int value2) {
  assertEquals(esperado, c.sumar(value1, value2));

 }

 @ParameterizedTest
 @ValueSource(ints = {1, 2, 3})
 void multiplicacionTest(int num) {
  assertEquals(10, c.multiplicar(1, 10));

/*Calculadora c = new Calculadora();
 assertEquals(2,c.sumar(1,1));
 assertEquals(3,c.sumar(1,2));
 assertNotEquals(1,c.sumar(1,1));*/

 }

 @ParameterizedTest
 @ValueSource(ints = {1, 2, 3})
 void divisionTest(int num) {
  assertEquals(10, c.dividir(20, 2));

 }

 @ParameterizedTest
 @ValueSource(ints = {1, 2, 3})
 void divisionEnteraTest(int num) {
  assertEquals(1, c.divisionEntera(29, 2));
 }

@Test
void sumaLimiteTest(){
 assertEquals(Integer.MAX_VALUE+1, c.sumar(Integer.MAX_VALUE,1));
 System.out.println(c.sumar(Integer.MAX_VALUE,1));
 assertFalse (c.sumar(Integer.MAX_VALUE,1)>0);
 assertTrue (c.sumar(Integer.MAX_VALUE,1)==0);


}

}