/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09064
 */
package Nursultan;

import Nursultan.class09064;
import java.util.ArrayList;
import java.util.IdentityHashMap;

public class class11202 {
    public Object N_0;
    public Object N_1;

    private void L() {
    }

    class11202() {
        this.L();
        this.N_0 = new IdentityHashMap();
        this.N_1 = new ArrayList();
    }

    class09064[] u() {
        return ((ArrayList)this.N_1).toArray(new class09064[0]);
    }

    int N(class09064 class090642) {
        Integer n = (Integer)((IdentityHashMap)this.N_0).get(class090642);
        if (n != null) {
            return n;
        }
        int n2 = ((ArrayList)this.N_1).size();
        ((IdentityHashMap)this.N_0).put(class090642, n2);
        ((ArrayList)this.N_1).add(class090642);
        return n2;
    }
}

