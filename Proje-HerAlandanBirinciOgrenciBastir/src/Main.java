
public class Main {

    public static void main(String[] args) {

        Sayisal say1 = new Sayisal("ihsan", 5, 5, 4, 13);
        Sayisal say2 = new Sayisal("eren", 8, 7, 1, 1);

        Sozel soz1 = new Sozel("Zeynep", 7, 5, 4, 3);
        Sozel soz2 = new Sozel("Ucar", 1, 8, 7, 1);

        Generic g = new Generic();
        Student sayisalBirincisi = g.birinci(say1, say2);
        Student sozelBirincisi = g.birinci(soz1, soz2);
        
        sayisalBirincisi.bilgileriGoster();
        sozelBirincisi.bilgileriGoster();

    }
}
