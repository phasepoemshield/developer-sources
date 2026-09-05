/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  minecraft.class01590
 *  minecraft.class03054
 *  minecraft.class06419
 *  minecraft.class06451
 *  minecraft.class06465
 */
package Nursultan;

import Nursultan.class10579;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import minecraft.class01590;
import minecraft.class03054;
import minecraft.class06419;
import minecraft.class06451;
import minecraft.class06465;

public class class10578
implements class10579 {
    boolean N;
    final /* synthetic */ int y;
    final /* synthetic */ int L;
    final /* synthetic */ int u;
    final /* synthetic */ class06465 i;
    final /* synthetic */ float R;
    final /* synthetic */ int M;
    final /* synthetic */ class06451 B;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10578(class06451 class064512, int n, int n2, int n3, class06465 class064652, float f, int n4) {
        this.B = class064512;
        this.y = n;
        this.L = n2;
        this.u = n3;
        this.i = class064652;
        this.R = f;
        this.M = n4;
    }

    @Override
    public void accept(class06419 class064192, int n, float f) {
        boolean bl;
        int n2 = this.y - n * this.L;
        int n3 = n2 - this.L;
        int n4 = n2 - this.u;
        boolean bl2 = this.i.N(n4, f * this.R, class064192.y());
        this.N |= bl2;
        if (class064192.u()) {
            bl = this.N;
            this.N = false;
        } else {
            bl = false;
        }
        class03054 class030542 = this.N(class064192.L());
        if (class030542 != null) {
            this.i.N(-4, n3, -2, n2, f * this.R, class030542);
            if (class030542.R() != null) {
                int n5 = class064192.N((class01590)this.B.L.i_3);
                int n6 = n4 + this.M;
                this.i.N(n5, n6, bl, class030542, class030542.R());
            }
        }
    }

    private class03054 N(class03054 class030542) {
        if (VisualSettings.INSTANCE.hideSignatureIndicator.isEnabled()) {
            return null;
        }
        return class030542;
    }
}

