/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class05005
implements Comparable<class05005> {
    public final double N;
    public final double y;
    public final long L;
    public final String u;

    public class05005(String string, double d, double d2, long l) {
        this.u = string;
        this.N = d;
        this.y = d2;
        this.L = l;
    }

    @Override
    public int compareTo(class05005 class050052) {
        if (class050052.N < this.N) {
            return -1;
        }
        if (class050052.N > this.N) {
            return 1;
        }
        return class050052.u.compareTo(this.u);
    }

    public int N() {
        return (this.u.hashCode() & 0xAAAAAA) + -12303292;
    }
}

