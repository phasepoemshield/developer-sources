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

public class class09164
extends class11787 {
    public Object y_0;
    public Object y_1;
    public boolean y_init;

    public class09164(AttackAura attackAura, boolean bl, String string, boolean bl2) {
        super(string, bl2);
        this.i();
        this.y_0 = attackAura;
        this.y_1 = bl;
    }

    private void i() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_1 = false;
        }
    }

    public void y(Object object) {
    }

    public boolean N() {
        this.i();
        return (Boolean)this.y_1;
    }
}

