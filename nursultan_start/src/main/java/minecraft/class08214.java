/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10530
 */
package minecraft;

import Nursultan.class10530;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import minecraft.class08224;

public class class08214
extends class08224<Runnable> {
    public class08214(Executor executor, String string) {
        super(new class10530(new ConcurrentLinkedQueue()), executor, string);
    }

    @Override
    public Runnable y(Runnable runnable) {
        return runnable;
    }
}

