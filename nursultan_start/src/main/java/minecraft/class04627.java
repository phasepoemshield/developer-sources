/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class05444
 *  minecraft.class05445
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07430
 *  minecraft.class07473
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class04626;
import minecraft.class05444;
import minecraft.class05445;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07475;
import org.jspecify.annotations.Nullable;

class class04627
extends class07473 {
    final /* synthetic */ class04626 N;

    public void L() {
        class06889 class068892 = this.M();
        if (class068892 != null) {
            class04626.i(this.N).N(class04626.u(this.N).N(class07209.method_49638((class00737)class068892), 1), 1.0);
        }
    }

    private @Nullable class06889 M() {
        class06889 class068892 = this.N.Ng() && !this.N.y(this.N.C, this.Z()) ? class06889.y((class00753)this.N.C).u(this.N.method_73189()).u() : this.N.method_5828(0.0f);
        int n = 8;
        class06889 class068893 = class05445.N((class07475)this.N, (int)8, (int)7, (double)class068892.M, (double)class068892.Z, (float)1.5707964f, (int)3, (int)1);
        if (class068893 != null) {
            return class068893;
        }
        return class05444.N((class07475)this.N, (int)8, (int)4, (int)-2, (double)class068892.M, (double)class068892.Z, (double)1.5707963705062866);
    }

    class04627(class04626 class046262) {
        this.N = class046262;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    private int Z() {
        int n = this.N.Y() || this.N.v() ? 24 : 16;
        return 48 - n;
    }

    public boolean y() {
        return class04626.L(this.N).E();
    }

    public boolean N() {
        return class04626.N(this.N).U() && class04626.y(this.N).y(10) == 0;
    }
}

