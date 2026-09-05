/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09064
 *  Nursultan.class09065
 *  Nursultan.class09076
 */
package Nursultan;

import Nursultan.class09064;
import Nursultan.class09065;
import Nursultan.class09076;
import Nursultan.class11202;
import Nursultan.class11212;
import java.util.Objects;

public class class11182
implements class11212 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    class11182(class09064 class090642, boolean bl) {
        this.i();
        this.N_2 = -1;
        this.N_0 = Objects.requireNonNull(class090642, "config");
        this.N_1 = bl;
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = false;
            this.N_2 = 0;
        }
    }

    @Override
    public void N(class09076 class090762, class09065 class090652) {
        class090762.N(((Integer)this.N_2).intValue());
        class090762.y(((Integer)this.N_2).intValue()).N(((Boolean)this.N_1).booleanValue());
    }

    @Override
    public class09064 N() {
        return (class09064)this.N_0;
    }

    @Override
    public void N(class11202 class112022) {
        this.N_2 = class112022.N((class09064)this.N_0);
    }

    @Override
    public boolean N(class09076 class090762) {
        return class090762.u(((Integer)this.N_2).intValue()) != null;
    }
}

