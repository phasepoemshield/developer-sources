/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11938
 *  minecraft.class06889
 */
package Nursultan;

import Nursultan.class11464;
import Nursultan.class11481;
import Nursultan.class11938;
import java.time.Duration;
import minecraft.class06889;

public class class11479
extends class11481 {
    public Object y_0;
    public boolean y_init;

    public class11479(String string, class06889 class068892, Duration duration, String string2) {
        super(string, class068892, string2);
        this.u();
        this.y_0 = class11938.j().y() + class11464.u((int)duration.getSeconds());
    }

    public int Z() {
        this.u();
        return (Integer)this.y_0;
    }

    @Override
    public boolean U() {
        return false;
    }

    @Override
    public boolean z() {
        this.u();
        return super.z() || class11938.j().y() > (Integer)this.y_0;
    }

    private void u() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = 0;
        }
    }
}

