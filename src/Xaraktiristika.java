public class Xaraktiristika {
    protected String name;
    protected String zdorovie;
    protected String sila;
   protected String opyt;

    public Xaraktiristika(String name, String zdorovie, String sila, String opyt) {
        this.name = name;
        this.zdorovie = zdorovie;
        this.sila = sila;
        this.opyt = opyt;
    }

    @Override
    public String toString() {
        return
                 name + '\'' +
                 zdorovie + '\'' +
                          sila + '\'' +
                 opyt + '\'' ;

    }
}
