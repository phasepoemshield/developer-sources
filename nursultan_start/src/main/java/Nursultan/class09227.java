/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09991
 */
package Nursultan;

import Nursultan.class09211;
import Nursultan.class09991;
import java.util.function.Function;

public class class09227 {
    public Object N_0;
    public Object N_1;
    public Object N_2;

    private void L() {
    }

    private class09227(Function<class09211, class09991> function) {
        this.L();
        this.N_0 = function;
    }

    public class09991 N(class09211 class092112) {
        if (class092112 != (class09211)this.N_1) {
            this.N_1 = class092112;
            this.N_2 = (class09991)((Function)this.N_0).apply(class092112);
        }
        return (class09991)this.N_2;
    }

    public static class09227 N(Function<class09211, class09991> function) {
        return new class09227(function);
    }
}

