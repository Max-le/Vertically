import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VerticallyTest {

    Vertically v = new Vertically();

    @Test
    void baseCase(){
        Assertions.assertEquals(v.orientationVertical("hello"),
                "h\ne\nl\nl\no");
    }

    @Test
    void multipleWords(){
        Assertions.assertEquals("args\n" +
                        "loai\n" +
                        "pgmg\n" +
                        "hemm\n" +
                        "araa",
                v.orientationVertical("alpha roger gamma sigma"));
    }

    @Test
    void weirdChars(){
        Assertions.assertEquals( "&\n%\n\"", v.orientationVertical("&%\""));
    }
    @Test
    void differentLengths() {
        String output = v.orientationVertical("papa maman papy");
        Assertions.assertEquals( "pmp\naaa\npmp\naay\n n ", output);
    }
    @Test
    void ignoreMultipleSpaces(){
        String input = "papa   maman  papy";
        String output = v.orientationVertical(input);
        Assertions.assertEquals("pmp\naaa\npmp\naay\n n ", output);
    }
    @Test
    void ignoreLongSpace(){
        String input = "hello         world";
        String output = v.orientationVertical(input);
        Assertions.assertEquals("hw\neo\nlr\nll\nod", output);
    }

    @Test
    void respectCase(){
        String input = "alPha";
        String output = v.orientationVertical(input);
        Assertions.assertEquals("a\nl\nP\nh\na", output );
    }
    @Test
    void crazyLongString(){
        StringBuilder input= new StringBuilder("HELLO");
        for (int i = 0; i < 24; i++) {
            input.append(input);
        }
        String output = v.orientationVertical(input.toString());
        Assertions.assertTrue(output != null);
    }
}