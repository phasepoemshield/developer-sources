/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00750
 *  minecraft.class00751
 *  minecraft.class03556
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import java.util.Iterator;
import minecraft.class00750;
import minecraft.class00751;
import minecraft.class03556;
import org.jspecify.annotations.Nullable;

public class class09389<T>
implements class00750<class03556<T>> {
    final /* synthetic */ class00751 y;

    public int L() {
        return this.y.L();
    }

    public @Nullable class03556<T> N(int n) {
        return this.y.L(n).orElse(null);
    }

    public class09389(class00751 class007512) {
        this.y = class007512;
    }

    public Iterator<class03556<T>> iterator() {
        return this.y.z().map(class035292 -> class035292).iterator();
    }

    public int N(class03556<T> class035562) {
        return this.y.N(class035562.N());
    }
}

