/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.TargetInfoHud
 *  Nursultan.class09819
 *  Nursultan.class11887
 *  Nursultan.class11903
 *  Nursultan.class11905
 *  Nursultan.class11934
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.TargetInfoHud;
import Nursultan.class09819;
import Nursultan.class11887;
import Nursultan.class11903;
import Nursultan.class11905;
import Nursultan.class11934;
import java.time.Duration;
import minecraft.class07438;

public class class11754
implements class09819 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    public class11754() {
        this.y();
        this.N_1 = new class11934(class11903.FORWARDS);
        this.N_2 = Float.valueOf(Float.NaN);
    }

    float u() {
        return ((class11934)this.N_1).E().floatValue();
    }

    private void y() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = Float.valueOf(0.0f);
        }
    }

    public boolean N(float f) {
        ((class11934)this.N_1).N();
        return true;
    }

    void N(class07438 class074382, float f) {
        if ((class07438)this.N_0 != class074382) {
            boolean bl = (class07438)this.N_0 == null;
            this.N_0 = class074382;
            this.N_2 = Float.valueOf(f);
            ((class11934)this.N_1).N((double)f, bl ? Duration.ZERO : (Duration)TargetInfoHud.U_1, (class11887)class11905.u_4);
            return;
        }
        if (Float.compare(((Float)this.N_2).floatValue(), f) == 0) {
            return;
        }
        this.N_2 = Float.valueOf(f);
        ((class11934)this.N_1).N((double)f, (Duration)TargetInfoHud.U_1, (class11887)class11905.u_4);
    }

    public boolean N() {
        return ((class11934)this.N_1).M();
    }
}

