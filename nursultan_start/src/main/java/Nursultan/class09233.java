/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10879
 *  minecraft.class06584
 */
package Nursultan;

import Nursultan.class10879;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import minecraft.class06584;

public class class09233 {
    public Object N_0;

    private class09233() {
        this.i();
        this.N_0 = new ArrayList();
    }

    private void i() {
    }

    public static class09233 y() {
        return new class09233();
    }

    public List<class10879<?>> N() {
        return List.copyOf((List)this.N_0);
    }

    public <T> class09233 N(String string, Function<class06584, T> function, BiPredicate<T, T> biPredicate) {
        ((List)this.N_0).add(new class10879(string, function, biPredicate));
        return this;
    }
}

