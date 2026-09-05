/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09051
 *  minecraft.class00044
 *  minecraft.class00169
 *  minecraft.class04453
 *  minecraft.class04909
 *  minecraft.class09033
 */
package minecraft;

import Nursultan.class09051;
import minecraft.class00044;
import minecraft.class00169;
import minecraft.class04453;
import minecraft.class04909;
import minecraft.class09033;

public class class00020
implements class00169 {
    public static final float N = 0.01f;
    public static final float y = 0.001f;
    public static final float L = 1.0E-4f;
    private static final int u = 0;
    private final class04453 i;
    private final class09033 R;
    private int M = 0;

    public class00020(class04453 class044532, class09033 class090332) {
        this.i = class044532;
        this.R = class090332;
    }

    public void N() {
        --this.M;
        if (this.M <= 0 && this.i.method_5869()) {
            float f = this.i.method_73183().field_9229.z();
            if (f < 1.0E-4f) {
                this.M = 0;
                this.R.N((class00044)new class09051(this.i, class04909.Q));
            } else if (f < 0.001f) {
                this.M = 0;
                this.R.N((class00044)new class09051(this.i, class04909.Y));
            } else if (f < 0.01f) {
                this.M = 0;
                this.R.N((class00044)new class09051(this.i, class04909.k));
            }
        }
    }
}

