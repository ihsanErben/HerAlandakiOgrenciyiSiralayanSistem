
public class Sozel extends Student {

    public Sozel(String name, int tr, int mat, int fen, int sos) {
        super(name, tr, mat, fen, sos);
    }

    @Override
    public int hesapla() {
        return (mat * 3 + tr * 5 + fen * 3 + sos * 4);
    }

    public void bilgileriGoster(){
        System.out.println("isim: " + name);
        System.out.println("Puan: " + hesapla());
    }
}
