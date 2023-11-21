
public class Generic<A> {

    public <A extends Student> A birinci(A x, A y) {
        if (x.hesapla() > y.hesapla()) {
            return x;
        }
        return y;
    }

}
