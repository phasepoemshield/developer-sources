/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08199
 */
package Nursultan;

import java.util.concurrent.Executor;
import minecraft.class08199;

public class class10884
implements class08199<Runnable> {
    final /* synthetic */ String N;
    final /* synthetic */ Executor y;

    public class10884(String string, Executor executor) {
        this.N = string;
        this.y = executor;
    }

    public String toString() {
        return this.N;
    }

    public Runnable y(Runnable runnable) {
        return runnable;
    }

    public void N(Runnable runnable) {
        this.y.execute(runnable);
    }

    public String as_() {
        return this.N;
    }
}

