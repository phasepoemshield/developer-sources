/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AttackAura
 *  Nursultan.class11787
 */
package Nursultan;

import Nursultan.AttackAura;
import Nursultan.class11787;

public class class11110
extends class11787 {
    public Object L_0;
    public Object L_1;
    public boolean L_init;

    public class11110(AttackAura attackAura, String string, boolean bl, boolean bl2) {
        super(string, bl);
        this.R();
        this.L_0 = attackAura;
        this.L_1 = bl2;
    }

    public void y(Object object) {
    }

    public boolean N() {
        this.R();
        return (Boolean)this.L_1;
    }

    private void R() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_1 = false;
        }
    }
}

