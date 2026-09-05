/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00143
 *  minecraft.class00500
 *  minecraft.class01763
 *  minecraft.class05459
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07196
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07473
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00143;
import minecraft.class00500;
import minecraft.class01763;
import minecraft.class05459;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07196;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07473;
import minecraft.class08092;

public abstract class class07449
extends class07473 {
    protected class07079 u;
    protected class07209 i = class07209.field_10980;
    protected boolean R;
    private boolean N;
    private float y;
    private float L;

    public void L() {
        this.N = false;
        this.y = (float)((double)this.i.method_10263() + 0.5 - this.u.method_23317());
        this.L = (float)((double)this.i.method_10260() + 0.5 - this.u.method_23321());
    }

    protected boolean M() {
        if (!this.R) {
            return false;
        }
        class00500 class005002 = this.u.method_73183().method_8320(this.i);
        if (!(class005002.i() instanceof class07196)) {
            this.R = false;
            return false;
        }
        return (Boolean)class005002.L((class08092)class07196.i);
    }

    public class07449(class07079 class070792) {
        this.u = class070792;
        if (!class05459.N((class07079)class070792)) {
            throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
        }
    }

    public boolean B() {
        return true;
    }

    public void i() {
        float f;
        float f2 = (float)((double)this.i.method_10263() + 0.5 - this.u.method_23317());
        if (this.y * f2 + this.L * (f = (float)((double)this.i.method_10260() + 0.5 - this.u.method_23321())) < 0.0f) {
            this.N = true;
        }
    }

    public boolean y() {
        return !this.N;
    }

    protected void N(boolean bl) {
        class00500 class005002;
        if (this.R && (class005002 = this.u.method_73183().method_8320(this.i)).i() instanceof class07196) {
            ((class07196)class005002.i()).N((class07049)this.u, this.u.method_73183(), class005002, this.i, bl);
        }
    }

    public boolean N() {
        if (!class05459.N((class07079)this.u)) {
            return false;
        }
        if (!this.u.field_5976) {
            return false;
        }
        class00143 class001432 = this.u.f().Z();
        if (class001432 == null || class001432.L()) {
            return false;
        }
        for (int i = 0; i < Math.min(class001432.R() + 2, class001432.i()); ++i) {
            class01763 class017632 = class001432.N(i);
            this.i = new class07209(class017632.N, class017632.y + 1, class017632.L);
            if (this.u.method_5649((double)this.i.method_10263(), this.u.method_23318(), (double)this.i.method_10260()) > 2.25) continue;
            this.R = class07196.N((class07299)this.u.method_73183(), (class07209)this.i);
            if (!this.R) continue;
            return true;
        }
        this.i = this.u.method_24515().method_10084();
        this.R = class07196.N((class07299)this.u.method_73183(), (class07209)this.i);
        return this.R;
    }
}

