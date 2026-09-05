/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class07430
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class07049;
import minecraft.class07299;
import minecraft.class07430;

public abstract class class07473 {
    private final EnumSet<class07430> N = EnumSet.noneOf(class07430.class);

    public void L() {
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    public boolean B() {
        return false;
    }

    public void i() {
    }

    public EnumSet<class07430> z() {
        return this.N;
    }

    public void u() {
    }

    public boolean y() {
        return this.N();
    }

    protected static int y(int n) {
        return class04995.R((int)n, (int)2);
    }

    protected int N(int n) {
        return this.B() ? n : class07473.y(n);
    }

    protected static class04782 N(class07049 class070492) {
        return (class04782)class070492.method_73183();
    }

    protected static class04782 N_18(class07299 class072992) {
        return (class04782)class072992;
    }

    public abstract boolean N();

    public void N_71(EnumSet<class07430> enumSet) {
        this.N.clear();
        this.N.addAll(enumSet);
    }

    public boolean O_() {
        return true;
    }
}

