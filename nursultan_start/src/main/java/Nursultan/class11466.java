/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06202
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11461;
import Nursultan.class11462;
import Nursultan.class11474;
import Nursultan.class11482;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Predicate;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11466 {
    public Object N_0;
    public static Object y_0;

    public class11466() {
        this.R();
        this.N_0 = new ConcurrentLinkedDeque();
    }

    static {
        class11466.i();
        y_0 = LogManager.getLogger(String.class);
    }

    private static void i() {
        y_0 = null;
    }

    public void y(int n, Runnable runnable) {
        ((ConcurrentLinkedDeque)this.N_0).add(new class11462(n, runnable));
    }

    public class11461 y(int n, int n2, Runnable runnable) {
        class11461 class114612 = new class11461(n, n2, runnable);
        ((ConcurrentLinkedDeque)this.N_0).add(class114612);
        return class114612;
    }

    public void N(Predicate<class06202> predicate, Runnable runnable) {
        ((ConcurrentLinkedDeque)this.N_0).add(new class11482(runnable, predicate));
    }

    public class11461 N(int n, Runnable runnable) {
        class11461 class114612 = new class11461(n, runnable);
        ((ConcurrentLinkedDeque)this.N_0).add(class114612);
        return class114612;
    }

    public void N() {
        Iterator iterator = ((ConcurrentLinkedDeque)this.N_0).iterator();
        while (iterator.hasNext()) {
            try {
                boolean bl;
                class11462 class114622 = (class11462)iterator.next();
                boolean bl2 = bl = class114622 != null;
                if (bl) {
                    class114622.u();
                }
                if (bl && !class114622.L()) continue;
                iterator.remove();
            }
            catch (Exception exception) {
                ((Logger)y_0).error("Error updating schedules: {}", (Object)exception.getMessage(), (Object)exception);
            }
        }
    }

    public void N(class11474 class114742) {
        ((ConcurrentLinkedDeque)this.N_0).add(class114742);
    }

    public void N(int n, int n2, Runnable runnable) {
        this.N(new class11474(n, n2, runnable));
    }

    public void N(Runnable runnable) {
        this.y(1, runnable);
    }

    private void R() {
    }
}

