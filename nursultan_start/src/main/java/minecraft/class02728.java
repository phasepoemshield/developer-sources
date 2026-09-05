/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09885
 *  minecraft.class02418
 */
package minecraft;

import Nursultan.class09885;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import minecraft.class02418;
import minecraft.class02762;

public class class02728
implements class02762,
AutoCloseable {
    private final int y;
    private final Deque<class09885<?>> L = new ArrayDeque();

    protected Collection<class09885<?>> L() {
        return this.L;
    }

    public class02728(int n) {
        this.y = n;
    }

    @Override
    public void close() {
        this.y();
    }

    public void y() {
        this.L.forEach(class09885::close);
        this.L.clear();
    }

    private <T> T y(class02418<T> class024182) {
        Iterator<class09885<?>> var2 = this.L.iterator();
        while (var2.hasNext()) {
            class09885<?> var3 = var2.next();
            if (!class024182.N(var3.N)) continue;
            var2.remove();
            return (T)var3.y;
        }
        return (T)class024182.R();
    }

    @Override
    public <T> void N(class02418<T> class024182, T t) {
        this.L.addFirst(new class09885(class024182, t, this.y));
    }

    @Override
    public <T> T N(class02418<T> class024182) {
        T t = this.y(class024182);
        class024182.y(t);
        return t;
    }

    public void N() {
        Iterator<class09885<?>> var1 = this.L.iterator();
        while (var1.hasNext()) {
            class09885<?> var2 = var1.next();
            if (var2.L-- != 0) continue;
            var2.close();
            var1.remove();
        }
    }
}

