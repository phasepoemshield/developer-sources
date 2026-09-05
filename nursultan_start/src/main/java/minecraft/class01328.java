/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07086
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01317;
import minecraft.class04782;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07086;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public class class01328 {
    public static final class01328 N = class01328.N();
    private static final double y = 2.0;
    private final boolean L;
    private double u = -1.0;
    private boolean i = true;
    private boolean R = true;
    private @Nullable class01317 M;

    public class01328 L() {
        class01328 class013282 = this.L ? class01328.N() : class01328.y();
        class013282.u = this.u;
        class013282.i = this.i;
        class013282.R = this.R;
        class013282.M = this.M;
        return class013282;
    }

    private class01328(boolean bl) {
        this.L = bl;
    }

    public class01328 i() {
        this.R = false;
        return this;
    }

    public class01328 u() {
        this.i = false;
        return this;
    }

    public static class01328 y() {
        return new class01328(false);
    }

    public static class01328 N() {
        return new class01328(true);
    }

    public boolean N(class04782 class047822, @Nullable class07438 class074382, class07438 class074383) {
        if (class074382 == class074383) {
            return false;
        }
        if (!class074383.method_36608()) {
            return false;
        }
        if (this.M != null && !this.M.method_18303(class074383, class047822)) {
            return false;
        }
        if (class074382 == null) {
            if (this.L && (!class074383.method_33190() || class047822.y() == class07086.field_5801)) {
                return false;
            }
        } else {
            class07079 class070792;
            if (this.L && (!class074382.method_18395(class074383) || !class074382.method_5973(class074383.method_5864()) || class074382.method_5722((class07049)class074383))) {
                return false;
            }
            if (this.u > 0.0) {
                double d = this.R ? class074383.method_18390((class07049)class074382) : 1.0;
                double d2 = Math.max(this.u * d, 2.0);
                if (class074382.method_5649(class074383.method_23317(), class074383.method_23318(), class074383.method_23321()) > d2 * d2) {
                    return false;
                }
            }
            if (this.i && class074382 instanceof class07079 && !(class070792 = (class07079)class074382).C().N((class07049)class074383)) {
                return false;
            }
        }
        return true;
    }

    public class01328 N(@Nullable class01317 class013172) {
        this.M = class013172;
        return this;
    }

    public class01328 N(double d) {
        this.u = d;
        return this;
    }
}

