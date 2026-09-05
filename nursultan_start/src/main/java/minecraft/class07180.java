/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07617
 *  minecraft.class08036
 */
package minecraft;

import java.util.Iterator;
import java.util.List;
import minecraft.class06889;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07142;
import minecraft.class07155;
import minecraft.class07168;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07617;
import minecraft.class08036;

class class07180
extends class07168 {
    private static final int L = 20;
    private boolean u;
    private int i;
    final /* synthetic */ class07155 N;

    public void L() {
    }

    class07180(class07155 class071552) {
        this.N = class071552;
        super(class071552);
    }

    public void i() {
        class07438 class074382 = this.N.T();
        if (class074382 == null) {
            return;
        }
        this.N.L = new class06889(class074382.method_23317(), class074382.method_23323(0.5), class074382.method_23321());
        if (this.N.method_5829().M((double)0.2f).L(class074382.method_5829())) {
            this.N.method_6121(class07180.N_18((class07299)this.N.method_73183()), (class07049)class074382);
            this.N.i = class07142.field_7318;
            if (!this.N.method_5701()) {
                this.N.method_73183().N(1039, this.N.method_24515(), 0);
            }
        } else if (this.N.field_5976 || ((class07438)this.N).fields_2212a028292fd3c078969e3ee4c71d9e8_0 > 0) {
            this.N.i = class07142.field_7318;
        }
    }

    public void u() {
        this.N.y((class07438)null);
        this.N.i = class07142.field_7318;
    }

    public boolean y() {
        class07438 class074382 = this.N.T();
        if (class074382 == null) {
            return false;
        }
        if (!class074382.method_5805()) {
            return false;
        }
        if (class074382 instanceof class08036) {
            class08036 class080362 = (class08036)class074382;
            if (class074382.method_7325() || class080362.method_68878()) {
                return false;
            }
        }
        if (!this.N()) {
            return false;
        }
        if (this.N.field_6012 > this.i) {
            this.i = this.N.field_6012 + 20;
            List var2 = this.N.method_73183().N(class07617.class, this.N.method_5829().M(16.0), class07042.N);
            Iterator var3 = var2.iterator();
            while (var3.hasNext()) {
                ((class07617)var3.next()).n();
            }
            this.u = !var2.isEmpty();
        }
        return !this.u;
    }

    public boolean N() {
        return this.N.T() != null && this.N.i == class07142.field_7317;
    }
}

