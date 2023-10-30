public class SilaIgroka {
    protected String name;
    protected String sila;
   protected String opyt;

    @Override
    public String toString() {
        return
                 name + '\'' +
                 sila + '\'' +
                 opyt + '\'' ;

    }

    public SilaIgroka(String name, String sila, String opyt) {
        this.name = name;
        this.sila = sila;
        this.opyt = opyt;



    }

}
