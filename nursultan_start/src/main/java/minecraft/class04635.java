/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 */
package minecraft;

import minecraft.class00737;
import minecraft.class04596;
import minecraft.class04620;
import minecraft.class04626;

class class04635
extends class04596 {
    final /* synthetic */ class04626 y;

    public void L() {
        class04620 class046202 = this.y.NO();
        if (class046202 != null) {
            class046202.N(this.y);
        }
    }

    @Override
    public boolean M() {
        class04620 class046202;
        if (this.y.C != null && this.y.d() && this.y.C.method_19769((class00737)this.y.method_73189(), 2.0) && (class046202 = this.y.NO()) != null) {
            if (class046202.u()) {
                this.y.C = null;
            } else {
                return true;
            }
        }
        return false;
    }

    class04635(class04626 class046262) {
        this.y = class046262;
        super(class046262);
    }

    @Override
    public boolean Z() {
        return false;
    }
}

