/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 */
package Nursultan;

import Nursultan.class09057;
import Nursultan.class09064;
import Nursultan.class09065;
import Nursultan.class09083;
import Nursultan.class09086;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;

public class class09076
implements AutoCloseable {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public boolean N_init;

    public void L(int n) {
        class09083 class090832 = ((class09083[])this.N_2)[n];
        if (class090832 == null) {
            return;
        }
        ((class09083[])this.N_2)[n] = null;
        class09083 class090833 = ((class09064[])this.N_1)[n].y(class090832);
        if (class090833 != null) {
            ((class09083[])this.N_3)[((Integer)this.N_5).intValue()] = class090833;
            ((int[])this.N_4)[((Integer)this.N_5).intValue()] = n;
            this.N_5 = (Integer)this.N_5 + 1;
        }
    }

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_5 = 0;
        }
    }

    class09076(class09065 class090652) {
        this.L();
        this.N_0 = class090652;
    }

    public class09057 i(int n) {
        this.N(n);
        return ((class09064[])this.N_1)[n].N(((class09083[])this.N_2)[n]);
    }

    @Override
    public void close() {
        int n;
        class09064[] class09064Array = (class09064[])this.N_1;
        class09083[] class09083Array = (class09083[])this.N_2;
        for (n = 0; n < class09064Array.length; ++n) {
            class09083 class090832 = class09083Array[n];
            if (class090832 == null) continue;
            class09064Array[n].B(class090832);
            class09083Array[n] = null;
        }
        for (n = 0; n < (Integer)this.N_5; ++n) {
            class09064Array[((int[])this.N_4)[n]].R(((class09083[])this.N_3)[n]);
            ((class09083[])this.N_3)[n] = null;
        }
        this.N_5 = 0;
        this.N_1 = null;
    }

    public class09057 u(int n) {
        this.N(n);
        return ((class09064[])this.N_1)[n].u(((class09083[])this.N_2)[n]);
    }

    public class09086 y(int n) {
        this.N(n);
        return ((class09064[])this.N_1)[n].M(((class09083[])this.N_2)[n]);
    }

    public class09076 N(class09064[] class09064Array) {
        this.N_1 = class09064Array;
        int n = class09064Array.length;
        if ((class09083[])this.N_2 == null || ((class09083[])this.N_2).length < n) {
            this.N_2 = new class09083[n];
            this.N_3 = new class09083[n];
            this.N_4 = new int[n];
        }
        this.N_5 = 0;
        return this;
    }

    public void N(int n) {
        if (((class09083[])this.N_2)[n] != null) {
            return;
        }
        class09064 class090642 = ((class09064[])this.N_1)[n];
        ((class09065)this.N_0).R(class090642);
        class09083 class090832 = this.N(class090642, n);
        class09083 class090833 = class090832 == null ? ((class09065)this.N_0).y(class090642) : class090642.L(class090832);
        ((ObjectOpenHashSet)((class09065)this.N_0).N_0).add((Object)class090642);
        ((class09083[])this.N_2)[n] = class090833;
    }

    private class09083 N(class09064 class090642, int n) {
        for (int i = 0; i < (Integer)this.N_5; ++i) {
            class09083 class090832;
            if (((int[])this.N_4)[i] != n || !class090642.i(class090832 = ((class09083[])this.N_3)[i])) continue;
            int n2 = (Integer)this.N_5 - 1;
            this.N_5 = n2;
            int n3 = n2;
            ((class09083[])this.N_3)[i] = ((class09083[])this.N_3)[n3];
            ((int[])this.N_4)[i] = ((int[])this.N_4)[n3];
            ((class09083[])this.N_3)[n3] = null;
            return class090832;
        }
        return null;
    }
}

