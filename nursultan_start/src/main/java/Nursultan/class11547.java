/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3i
 */
package Nursultan;

import Nursultan.class11556;
import Nursultan.class11565;
import Nursultan.class11570;
import Nursultan.class11579;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3i;

public abstract class class11547
implements class11579 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    public class11547(String string, int n) {
        this.i();
        this.N_0 = string;
        this.N_1 = n;
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0;
        }
    }

    @Override
    public int y() {
        return (Integer)this.N_1;
    }

    public boolean N(List<class11556> list) {
        Iterator iterator = ((List)class11570.L_0).iterator();
        while (iterator.hasNext()) {
            if (!((class11565)iterator.next()).N(list)) continue;
            return true;
        }
        return false;
    }

    public abstract boolean N(List<class11556> var1, Vector3i var2, Vector3i var3);

    public boolean N(int n, int n2, int n3) {
        return n == 4 && n3 == 1 && n2 == 4 || n == 6 && n3 == 1 && n2 == 6;
    }

    @Override
    public String N() {
        return (String)this.N_0;
    }
}

