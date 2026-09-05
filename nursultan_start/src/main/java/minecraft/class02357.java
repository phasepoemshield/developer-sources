/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class02333;
import minecraft.class02345;
import minecraft.class02346;
import minecraft.class02350;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class02357<S>
implements class02346<S> {
    private @Nullable class02345<S>[] N = new class02345[16];
    private int y;
    private int L = -1;

    public int y() {
        return this.L;
    }

    private void y(int n) {
        if (n > this.L) {
            this.L = n;
            this.y = 0;
        }
    }

    @Override
    public void N(int n, class02350<S> class023502, Object object) {
        this.y(n);
        if (n == this.L) {
            this.N(class023502, object);
        }
    }

    public List<class02333<S>> N() {
        int n = this.y;
        if (n == 0) {
            return List.of();
        }
        ArrayList<class02333<S>> arrayList = new ArrayList<class02333<S>>(n);
        for (int i = 0; i < n; ++i) {
            class02345<S> class023452 = this.N[i];
            arrayList.add(new class02333(this.L, class023452.N, class023452.y));
        }
        return arrayList;
    }

    private void N(class02350<S> class023502, Object object) {
        Object object2;
        int n;
        int n2 = this.N.length;
        if (this.y >= n2) {
            n = class07536.N((int)n2, (int)(this.y + 1));
            object2 = new class02345[n];
            System.arraycopy(this.N, 0, object2, 0, n2);
            this.N = object2;
        }
        if ((object2 = this.N[n = this.y++]) == null) {
            this.N[n] = object2 = new class02345();
        }
        object2.N = class023502;
        object2.y = object;
    }

    @Override
    public void N(int n) {
        this.y(n);
    }
}

