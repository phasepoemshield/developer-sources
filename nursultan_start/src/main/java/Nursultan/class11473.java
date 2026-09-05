/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09321
 *  Nursultan.class10967
 *  Nursultan.class10996
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11938
 */
package Nursultan;

import Nursultan.class09321;
import Nursultan.class10967;
import Nursultan.class10996;
import Nursultan.class11481;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11938;
import java.util.ArrayList;
import java.util.List;

public abstract class class11473<T extends class11481> {
    public Object N_0;

    public class11473() {
        this.u();
        this.N_0 = new ArrayList();
        class11938.L().y((Object)this);
        class11938.L().N(class10996.class, class109962 -> ((List)this.N_0).removeIf(class11481::z));
    }

    static {
        class11473.y();
    }

    private void u() {
    }

    public void y(T t) {
        ((List)this.N_0).remove(t);
    }

    private static void y() {
    }

    @class11782(y=class11777.AFTER)
    public abstract void N(class10967 var1);

    public void N(T t) {
        ((List)this.N_0).add(t);
    }

    public List<T> N() {
        return (List)this.N_0;
    }

    @class11782
    public abstract void N(class10996 var1);

    @class11782(y=class11777.AFTER)
    public abstract void N(class09321 var1);
}

