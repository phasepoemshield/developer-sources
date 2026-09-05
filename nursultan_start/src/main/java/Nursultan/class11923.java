/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 */
package Nursultan;

import com.google.common.collect.Queues;
import java.util.Queue;

public class class11923 {
    public static Object N_0;

    private static void L() {
        N_0 = null;
    }

    private class11923() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11923.L();
        N_0 = Queues.newConcurrentLinkedQueue();
    }

    public static void N() {
        Runnable runnable;
        while ((runnable = (Runnable)((Queue)N_0).poll()) != null) {
            runnable.run();
        }
    }

    public static void N(Runnable runnable) {
        ((Queue)N_0).add(runnable);
    }
}

