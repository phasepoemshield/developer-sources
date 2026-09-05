/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class04995
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import minecraft.class04995;
import minecraft.class08345;
import minecraft.class08368;
import minecraft.class08376;
import minecraft.class08383;
import minecraft.class08387;

public class class08384<T extends class08387> {
    private static final Comparator<class08345<?>> N = Comparator.comparing(class083452 -> -class083452.height).thenComparing(class083452 -> -class083452.width).thenComparing(class083452 -> class083452.N().method_45816());
    private final int y;
    private final List<class08345<T>> L = new ArrayList<class08345<T>>();
    private final List<class08376<T>> u = new ArrayList<class08376<T>>();
    private int i;
    private int R;
    private final int M;
    private final int B;
    private final int Z;

    public void L() {
        ArrayList<class08345<T>> arrayList = new ArrayList<class08345<T>>(this.L);
        arrayList.sort(N);
        for (class08345 class083453 : arrayList) {
            if (this.N(class083453)) continue;
            throw new class08383((class08387)class083453.N(), (Collection)arrayList.stream().map(class083452 -> class083452.N()).collect(ImmutableList.toImmutableList()));
        }
    }

    public class08384(int n, int n2, int n3, int n4) {
        this.y = n3;
        this.M = n;
        this.B = n2;
        this.Z = 1 << n3 << class04995.N((int)(n4 - 1), (int)0, (int)4);
    }

    private static /* synthetic */ Integer i(class08345 class083452) {
        return -class083452.y();
    }

    private boolean y(class08345<T> class083452) {
        class08376<T> class083762;
        boolean bl;
        boolean bl2;
        boolean bl3;
        int n = class04995.L((int)this.i);
        int n2 = class04995.L((int)this.R);
        int n3 = class04995.L((int)(this.i + class083452.y()));
        int n4 = class04995.L((int)(this.R + class083452.L()));
        boolean bl4 = n3 <= this.M;
        boolean bl5 = bl3 = n4 <= this.B;
        if (!bl4 && !bl3) {
            return false;
        }
        boolean bl6 = bl4 && n != n3;
        boolean bl7 = bl2 = bl3 && n2 != n4;
        if (bl6 ^ bl2) {
            bl = bl6;
        } else {
            boolean bl8 = bl = bl4 && n <= n2;
        }
        if (bl) {
            if (this.R == 0) {
                this.R = n4;
            }
            class083762 = new class08376(this.i, 0, n3 - this.i, this.R);
            this.i = n3;
        } else {
            class083762 = new class08376<T>(0, this.R, this.i, n4 - this.R);
            this.R = n4;
        }
        class083762.N(class083452);
        this.u.add(class083762);
        return true;
    }

    public int y() {
        return this.R;
    }

    public int N() {
        return this.i;
    }

    private boolean N(class08345<T> class083452) {
        Iterator<class08376<T>> iterator = this.u.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().N(class083452)) continue;
            return true;
        }
        return this.y(class083452);
    }

    public void N(T t) {
        class08345<T> class083452 = new class08345<T>(t, class08384.N(t.method_45807() + this.Z * 2, this.y), class08384.N(t.method_45815() + this.Z * 2, this.y));
        this.L.add(class083452);
    }

    public void N(class08368<T> class083682) {
        Iterator<class08376<T>> iterator = this.u.iterator();
        while (iterator.hasNext()) {
            iterator.next().N(class083682, this.Z);
        }
    }

    private static int N(int n, int n2) {
        return (n >> n2) + ((n & (1 << n2) - 1) == 0 ? 0 : 1) << n2;
    }

    private static /* synthetic */ Integer R(class08345 class083452) {
        return -class083452.L();
    }
}

