/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09060
 *  Nursultan.class09064
 *  Nursultan.class09076
 */
package Nursultan;

import Nursultan.class09060;
import Nursultan.class09064;
import Nursultan.class09076;
import Nursultan.class11202;
import Nursultan.class11211;
import java.util.Objects;

public class class11205
implements class11211 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    @Override
    public class09064 L() {
        return (class09064)this.N_1;
    }

    class11205(int n, class09064 class090642) {
        this.i();
        this.N_2 = -1;
        this.N_0 = n;
        this.N_1 = Objects.requireNonNull(class090642, "source");
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_2 = 0;
        }
    }

    @Override
    public int y() {
        return (Integer)this.N_0;
    }

    @Override
    public void N(class09076 class090762) {
        class09060.N().N((Integer)this.N_0 - 33984, class090762.i(((Integer)this.N_2).intValue()));
    }

    @Override
    public void N(class11202 class112022) {
        this.N_2 = class112022.N((class09064)this.N_1);
    }

    @Override
    public int a_() {
        return (Integer)this.N_2;
    }
}

