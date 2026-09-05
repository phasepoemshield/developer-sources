/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 *  minecraft.class07113
 */
package minecraft;

import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07113;

public abstract class class07089 {
    protected final class06889 N;

    protected class07089(class06889 class068892) {
        this.N = class068892;
    }

    public class06889 y() {
        return this.N;
    }

    public double N(class07049 class070492) {
        double d = this.N.M - class070492.method_23317();
        double d2 = this.N.B - class070492.method_23318();
        double d3 = this.N.Z - class070492.method_23321();
        return d * d + d2 * d2 + d3 * d3;
    }

    public abstract class07113 N();
}

