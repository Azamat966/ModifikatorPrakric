public class Main {
    public static void main(String[] args) {
        SilaIgroka silaIgroka = new SilaIgroka("Здаровье игрока: 10"+"\n","Сила игрока: 10"+"\n","Опыть игрока: 0"+"\n");
        System.out.println(silaIgroka);

        Xaraktiristika xaraktiristika = new Xaraktiristika("Обновленные характеристики игрока:"+"\n","Здоровье игрока: 120"+"\n","Сила игрока: 15"+"\n","Опыт игрока: 50"+"\n");
        System.out.println(xaraktiristika);

        Ataka ataka = new Ataka("Характеристики после атаки:"+"\n","Здоровье врага: 65"+"\n","Опыт игрока после атаки: 65");
        System.out.println(ataka);
    }
}