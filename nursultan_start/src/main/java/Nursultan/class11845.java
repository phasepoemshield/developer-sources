/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11834;
import Nursultan.class11852;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

public class class11845 {
    public static Object N_0;
    public static Object N_1;
    public Object y_0;
    public Object y_1;
    public Object y_2;

    public void L() {
        ((AtomicLong)this.y_2).incrementAndGet();
    }

    private static void M() {
        N_0 = 5;
        N_1 = 250L;
    }

    public class11845() {
        this.z();
        this.y_0 = new CopyOnWriteArrayList();
        this.y_1 = new AtomicInteger();
        this.y_2 = new AtomicLong();
    }

    static {
        class11845.M();
    }

    public class11852 i() {
        return new class11852(this);
    }

    private void U() {
        List list = ((List)this.y_0).stream().filter(class11834::E).toList();
        int n = list.size() - 5;
        for (class11834 class118342 : list) {
            if (n <= 0) {
                return;
            }
            if (class118342.W()) continue;
            class118342.R();
            --n;
        }
    }

    private void z() {
    }

    public List<class11834> u() {
        this.R();
        return ((List)this.y_0).stream().filter(class11834::E).toList();
    }

    private class11834 u(int n) {
        if (n <= 0) {
            return null;
        }
        for (class11834 class118342 : (List)this.y_0) {
            if (class118342.N() != n) continue;
            return class118342.E() ? class118342 : null;
        }
        return null;
    }

    public long y() {
        return ((AtomicLong)this.y_2).get();
    }

    public boolean y(int n) {
        return this.u(n) != null;
    }

    public int N(class11852 class118522) {
        class11834 class118342 = class118522.N(((AtomicInteger)this.y_1).incrementAndGet());
        this.R();
        ((List)this.y_0).add(class118342);
        this.U();
        this.L();
        return class118342.N();
    }

    public boolean N(int n) {
        class11834 class118342 = this.u(n);
        if (class118342 == null) {
            return false;
        }
        class118342.R();
        return true;
    }

    public int N(int n, Consumer<class11834> consumer, Consumer<class11852> consumer2) {
        if (this.N(n, consumer)) {
            return n;
        }
        class11852 class118522 = this.i();
        consumer2.accept(class118522);
        return class118522.N();
    }

    public boolean N(int n, Consumer<class11834> consumer) {
        class11834 class118342 = this.u(n);
        if (class118342 == null) {
            return false;
        }
        consumer.accept(class118342);
        this.L();
        return true;
    }

    public List<class11834> N() {
        this.R();
        return List.copyOf((List)this.y_0);
    }

    private void R() {
        long l = System.currentTimeMillis();
        ((List)this.y_0).removeIf(class118342 -> !class118342.E() && l - class118342.z() >= 250L);
    }
}

