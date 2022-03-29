public class StaticTest {
    public String str;
    public static String staticStr;

    public StaticTest() {
    }

    public StaticTest(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public static String getStaticStr() {
        return staticStr;
    }

    public static void setStaticStr(String staticStr) {
        StaticTest.staticStr = staticStr;
    }

    public void setObjectStaticString(String str) {
        setStaticStr(str);
    }

    public String getObjectStaticString() {
        return staticStr;
    }


}
