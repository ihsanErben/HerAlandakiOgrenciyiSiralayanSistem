public class Sayisal extends Student {

    public Sayisal(String name, int tr, int mat, int fen, int sos) {
        super(name, tr, mat, fen, sos);
    }

    @Override
    public int hesapla() {
        return (mat * 5 + tr * 3 + fen * 4 + sos * 2);
    }

    public void bilgileriGoster(){
        System.out.println("isim: " + name);
        System.out.println("Puan: " + hesapla());
    }
}
