/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

class class05032
implements Appendable {
    private int N;
    private final int y;

    public class05032(int n) {
        this.y = n;
    }

    @Override
    public Appendable append(char c) {
        return this.N(1);
    }

    @Override
    public Appendable append(CharSequence charSequence, int n, int n2) {
        return this.N(n2 - n);
    }

    @Override
    public Appendable append(CharSequence charSequence) {
        return this.N(charSequence.length());
    }

    private Appendable N(int n) {
        this.N += n;
        if (this.N > this.y) {
            throw new IllegalStateException("Character count over limit: " + this.N + " > " + this.y);
        }
        return this;
    }
}

