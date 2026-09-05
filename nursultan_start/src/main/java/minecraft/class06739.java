/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06748
 *  minecraft.class07536
 */
package minecraft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import minecraft.class06723;
import minecraft.class06728;
import minecraft.class06730;
import minecraft.class06748;
import minecraft.class07536;

public class class06739
implements class06728 {
    private final List<class06748> L = new ArrayList<class06748>();
    private final List<class06748> u = new ArrayList<class06748>();

    public List<class06748> y() {
        return this.L;
    }

    public void N(Collection<class06748> collection) {
        this.u.addAll(collection);
    }

    public List<class06748> N() {
        ArrayList<class06748> arrayList = new ArrayList<class06748>(this.L);
        arrayList.addAll(this.u);
        long l = class07536.L();
        this.L.removeIf(class067482 -> class067482.u() < l);
        this.u.clear();
        return arrayList;
    }

    @Override
    public class06723 method_75532(class06730 class067302) {
        class06748 class067482 = new class06748(class067302);
        this.L.add(class067482);
        return class067482;
    }
}

