package Generics;

public class OwnGeneric {
    public static void main(String[] args) {
        Pair<Integer> p = new Pair<>(
                1,2
        );
        System.out.println(p.getE1()+" "+p.getE2());

        Pair2<String,Integer> p2 = new Pair2<>(
                "freq",2
        );

        System.out.println(p2.getE()+" "+p2.getG());
    }
}

package Generics;
// same type generic pair class
public class Pair<E> {
    E e1;
    E e2;

    public Pair(E e1, E e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public E getE1() {
        return e1;
    }

    public void setE1(E e1) {
        this.e1 = e1;
    }

    public E getE2() {
        return e2;
    }

    public void setE2(E e2) {
        this.e2 = e2;
    }
}


package Generics;
// different type pair
public class Pair2 <E,G>{
    E e;
    G g;

    public Pair2(E e, G g) {
        this.e = e;
        this.g = g;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public G getG() {
        return g;
    }

    public void setG(G g) {
        this.g = g;
    }
}

