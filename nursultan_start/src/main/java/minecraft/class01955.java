/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  minecraft.class06695
 */
package minecraft;

import minecraft.class06584;
import minecraft.class06695;

public interface class01955
extends class06695 {
    default public class06584 U() {
        return this.N(this.method_5444());
    }

    public class06584 N();

    public void N(class06584 var1);

    default public class06584 N(int n) {
        return this.N().N(n);
    }

    default public void method_5448() {
        this.U();
    }

    default public void method_5447(int n, class06584 class065842) {
        if (n == 0) {
            this.N(class065842);
        }
    }

    default public class06584 method_5434(int n, int n2) {
        if (n != 0) {
            return class06584.E;
        }
        return this.N(n2);
    }

    default public class06584 method_5441(int n) {
        return this.method_5434(n, this.method_5444());
    }

    default public boolean method_5442() {
        return this.N().R();
    }

    default public class06584 method_5438(int n) {
        return n == 0 ? this.N() : class06584.E;
    }

    default public int method_5439() {
        return 1;
    }
}

