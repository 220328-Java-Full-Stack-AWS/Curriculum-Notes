package entities;

public class ComplicatedThing {
    private String string;
    private Integer integer;
    private Object object;

    public ComplicatedThing(String string, Integer integer, Object object) {
        this.string = string;
        this.integer = integer;
        this.object = object;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "ComplicatedThing{" +
                "string='" + string + '\'' +
                ", integer=" + integer +
                ", object=" + object +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ComplicatedThing) {
            ComplicatedThing thing = (ComplicatedThing)obj;
            if(thing.toString().equals(this.toString())) {
                return true;
            }
        }
        return false;
    }
}
