/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.function.Supplier;

class class07553<T>
implements Supplier<T> {
    final /* synthetic */ Supplier N;
    final /* synthetic */ String y;

    class07553(Supplier supplier, String string) {
        this.N = supplier;
        this.y = string;
    }

    @Override
    public T get() {
        return this.N.get();
    }

    public String toString() {
        return this.y;
    }
}

