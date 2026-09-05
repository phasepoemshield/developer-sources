/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class08345;
import minecraft.class08368;
import minecraft.class08387;
import org.jspecify.annotations.Nullable;

public class class08376<T extends class08387> {
    private final int N;
    private final int y;
    private final int L;
    private final int u;
    private @Nullable List<class08376<T>> i;
    private @Nullable class08345<T> R;

    public class08376(int n, int n2, int n3, int n4) {
        this.N = n;
        this.y = n2;
        this.L = n3;
        this.u = n4;
    }

    public String toString() {
        return "Slot{originX=" + this.N + ", originY=" + this.y + ", width=" + this.L + ", height=" + this.u + ", texture=" + String.valueOf(this.R) + ", subSlots=" + String.valueOf(this.i) + "}";
    }

    public int y() {
        return this.y;
    }

    public boolean N(class08345<T> class083452) {
        if (this.R != null) {
            return false;
        }
        int n = class083452.y();
        int n2 = class083452.L();
        if (n > this.L || n2 > this.u) {
            return false;
        }
        if (n == this.L && n2 == this.u) {
            this.R = class083452;
            return true;
        }
        if (this.i == null) {
            this.i = new ArrayList<class08376<T>>(1);
            this.i.add(new class08376<T>(this.N, this.y, n, n2));
            int n3 = this.L - n;
            int n4 = this.u - n2;
            if (n4 > 0 && n3 > 0) {
                int n5;
                int n6 = Math.max(this.u, n3);
                if (n6 >= (n5 = Math.max(this.L, n4))) {
                    this.i.add(new class08376<T>(this.N, this.y + n2, n, n4));
                    this.i.add(new class08376<T>(this.N + n, this.y, n3, this.u));
                } else {
                    this.i.add(new class08376<T>(this.N + n, this.y, n3, n2));
                    this.i.add(new class08376<T>(this.N, this.y + n2, this.L, n4));
                }
            } else if (n3 == 0) {
                this.i.add(new class08376<T>(this.N, this.y + n2, n, n4));
            } else if (n4 == 0) {
                this.i.add(new class08376<T>(this.N + n, this.y, n3, n2));
            }
        }
        for (class08376<T> class083762 : this.i) {
            if (!class083762.N(class083452)) continue;
            return true;
        }
        return false;
    }

    public void N(class08368<T> class083682, int n) {
        if (this.R != null) {
            class083682.load(this.R.N(), this.N(), this.y(), n);
        } else if (this.i != null) {
            Iterator<class08376<T>> iterator = this.i.iterator();
            while (iterator.hasNext()) {
                iterator.next().N(class083682, n);
            }
        }
    }

    public int N() {
        return this.N;
    }
}

