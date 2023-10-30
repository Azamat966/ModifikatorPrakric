public class Ataka {
    protected String ataka;
  protected  String zdorovie;
  protected  String opyt;

    public Ataka(String ataka, String zdorovie, String opyt) {
        this.ataka = ataka;
        this.zdorovie = zdorovie;
        this.opyt = opyt;
    }

    @Override
    public String toString() {
        return
                 ataka + '\'' +
                 zdorovie + '\'' +
                 opyt + '\'' ;
    }
}
