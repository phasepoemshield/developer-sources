/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00002
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05075
 *  minecraft.class05630
 *  minecraft.class06069
 *  minecraft.class06202
 *  minecraft.class09029
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00002;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05075;
import minecraft.class05630;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class09021;
import minecraft.class09029;
import org.jspecify.annotations.Nullable;

public class class09000 {
    private static final int N = 100;
    private final class06069 y = class06069.u();
    private final class06202 L;
    private @Nullable class00044 u;
    private class09021 i;
    private float R = 1.0f;
    private int M = 100;
    private boolean B = false;

    public boolean L(class05075 class050752) {
        if (this.u == null) {
            return false;
        }
        return ((class04891)class050752.N().N()).N().equals((Object)this.u.L());
    }

    public void L() {
        if (this.u != null) {
            this.L.Nr().y(this.u);
            this.u = null;
            this.L.m().u();
        }
        this.M += 100;
    }

    public class09000(class06202 class062022) {
        this.L = class062022;
        this.i = (class09021)((Object)((class05630)class062022.i_7).Nc().method_41753());
    }

    public @Nullable String u() {
        class00002 class000022;
        if (this.u != null && (class000022 = this.u.u()) != null) {
            return class000022.N().i();
        }
        return null;
    }

    public void y(class05075 class050752) {
        if (this.L(class050752)) {
            this.L();
        }
    }

    public void y() {
        if (!this.B) {
            this.L.m().L();
            this.B = true;
        }
    }

    private static boolean N(class05075 class050752, class00044 class000442) {
        return class050752.u() && !((class04891)class050752.N().N()).N().equals((Object)class000442.L());
    }

    public void N() {
        boolean bl;
        float f = this.L.Np();
        if (this.u != null && this.R != f && !(bl = this.N(f))) {
            return;
        }
        class05075 class050752 = this.L.NX();
        if (class050752 == null) {
            this.M = Math.max(this.M, 100);
            return;
        }
        if (this.u != null) {
            if (class09000.N(class050752, this.u)) {
                this.L.Nr().y(this.u);
                this.M = class04995.N((class06069)this.y, (int)0, (int)(class050752.y() / 2));
            }
            if (!this.L.Nr().L(this.u)) {
                this.u = null;
                this.M = Math.min(this.M, this.i.N(class050752, this.y));
            }
        }
        this.M = Math.min(this.M, this.i.N(class050752, this.y));
        if (this.u == null && this.M-- <= 0) {
            this.N(class050752);
        }
    }

    public void N(class09021 class090212) {
        this.i = class090212;
        this.M = this.i.N(this.L.NX(), this.y);
    }

    private boolean N(float f) {
        if (this.u == null) {
            return false;
        }
        if (this.R == f) {
            return true;
        }
        if (this.R < f) {
            this.R += class04995.N((float)this.R, (float)5.0E-4f, (float)0.005f);
            if (this.R > f) {
                this.R = f;
            }
        } else {
            this.R = 0.03f * f + 0.97f * this.R;
            if (Math.abs(this.R - f) < 1.0E-4f || this.R < f) {
                this.R = f;
            }
        }
        this.R = class04995.N((float)this.R, (float)0.0f, (float)1.0f);
        if (this.R <= 1.0E-4f) {
            this.L();
            return false;
        }
        this.L.Nr().N(class04911.field_15253, this.R);
        return true;
    }

    public void N(class05075 class050752) {
        class04891 class048912 = (class04891)class050752.N().N();
        this.u = class00040.N((class04891)class048912);
        switch (class09029.N[this.L.Nr().N(this.u).ordinal()]) {
            case 1: {
                this.L.m().L();
                this.B = true;
                break;
            }
            case 2: {
                this.B = false;
            }
        }
        this.M = Integer.MAX_VALUE;
    }
}

