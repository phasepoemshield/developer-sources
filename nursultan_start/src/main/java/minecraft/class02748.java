/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02418
 *  minecraft.class02452
 */
package minecraft;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import minecraft.class02418;
import minecraft.class02452;
import minecraft.class02725;
import minecraft.class02734;
import minecraft.class02746;
import minecraft.class02751;
import minecraft.class02760;

public class class02748
implements class02725 {
    final int N;
    final String y;
    final List<class02751<?>> L = new ArrayList();
    final BitSet u = new BitSet();
    final BitSet i = new BitSet();
    Runnable R = () -> {};
    final List<class02746<?>> M = new ArrayList();
    final BitSet B = new BitSet();
    boolean Z;
    final /* synthetic */ class02734 z;

    private <T> class02751<T> L(class02751<T> class027512) {
        this.L.add(class027512);
        this.y(class027512);
        return class027512.N(this);
    }

    public class02748(class02734 class027342, int n, String string) {
        this.z = class027342;
        this.N = n;
        this.y = string;
    }

    public String toString() {
        return this.y;
    }

    private <T> void y(class02751<T> class027512) {
        this.N(class027512);
        if (class027512.y != null) {
            this.N(class027512.y);
        }
        class027512.L.set(this.N);
    }

    @Override
    public <T> class02452<T> N(String string, class02418<T> class024182) {
        class02746<T> class027462 = this.z.N(string, class024182, this);
        this.u.set(class027462.N);
        return class027462.L;
    }

    @Override
    public void N(Runnable runnable) {
        this.R = runnable;
    }

    private void N(class02748 class027482) {
        this.i.set(class027482.N);
    }

    private <T> void N(class02751<T> class027512) {
        class02760 class027602 = class027512.N;
        if (class027602 instanceof class02746) {
            class02746 class027462 = (class02746)class027602;
            this.u.set(class027462.N);
        }
    }

    @Override
    public void N() {
        this.Z = true;
    }

    @Override
    public void N(class02725 class027252) {
        this.i.set(((class02748)class027252).N);
    }
}

