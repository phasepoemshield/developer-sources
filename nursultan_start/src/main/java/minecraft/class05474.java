/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10513
 *  minecraft.class01296
 *  minecraft.class07209
 */
package minecraft;

import Nursultan.class10513;
import minecraft.class01296;
import minecraft.class07209;

public interface class05474 {
    public static class05474 L(int n, int n2) {
        return new class10513(n2, n);
    }

    default public boolean L(int n) {
        return n >= this.method_31607() && n <= this.method_31600();
    }

    public int method_31607();

    default public int method_31604(int n) {
        return n + this.method_32891();
    }

    default public int method_31600() {
        return this.method_31607() + this.method_31605() - 1;
    }

    default public boolean method_31606(class07209 class072092) {
        return this.method_31601(class072092.method_10264());
    }

    default public int method_32891() {
        return class01296.N((int)this.method_31607());
    }

    default public int method_32890() {
        return this.method_31597() - this.method_32891() + 1;
    }

    default public int method_31597() {
        return class01296.N((int)this.method_31600());
    }

    default public boolean method_31601(int n) {
        return n < this.method_31607() || n > this.method_31600();
    }

    default public int method_31603(int n) {
        return n - this.method_32891();
    }

    public int method_31605();

    default public int method_31602(int n) {
        return this.method_31603(class01296.N((int)n));
    }
}

