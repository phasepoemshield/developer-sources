/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07280
 *  minecraft.class07299
 *  minecraft.class07664
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07280;
import minecraft.class07299;
import minecraft.class07664;
import org.jspecify.annotations.Nullable;

public class class06671
implements class00381<class07280> {
    public static final class02362<class00667, class06671> N = class00381.N(class06671::N, class06671::new);
    private final double y;
    private final double L;
    private final double u;
    private final int i;
    private final class07664 R;
    private final class07664 M;
    private final boolean B;

    private class06671(class00667 class006672) {
        this.R = (class07664)class006672.y(class07664.class);
        this.y = class006672.readDouble();
        this.L = class006672.readDouble();
        this.u = class006672.readDouble();
        this.B = class006672.readBoolean();
        if (this.B) {
            this.i = class006672.E();
            this.M = (class07664)class006672.y(class07664.class);
        } else {
            this.i = 0;
            this.M = null;
        }
    }

    public class06671(class07664 class076642, class07049 class070492, class07664 class076643) {
        this.R = class076642;
        this.i = class070492.method_5628();
        this.M = class076643;
        class06889 class068892 = class076643.N(class070492);
        this.y = class068892.M;
        this.L = class068892.B;
        this.u = class068892.Z;
        this.B = true;
    }

    public class06671(class07664 class076642, double d, double d2, double d3) {
        this.R = class076642;
        this.y = d;
        this.L = d2;
        this.u = d3;
        this.i = 0;
        this.B = false;
        this.M = null;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class07664 N() {
        return this.R;
    }

    private void N(class00667 class006672) {
        class006672.N((Enum)this.R);
        class006672.writeDouble(this.y);
        class006672.writeDouble(this.L);
        class006672.writeDouble(this.u);
        class006672.writeBoolean(this.B);
        if (this.B) {
            class006672.L(this.i);
            class006672.N((Enum)this.M);
        }
    }

    public @Nullable class06889 N(class07299 class072992) {
        if (this.B) {
            class07049 class070492 = class072992.method_8469(this.i);
            if (class070492 == null) {
                return new class06889(this.y, this.L, this.u);
            }
            return this.M.N(class070492);
        }
        return new class06889(this.y, this.L, this.u);
    }

    public class02897<class06671> method_65080() {
        return class04248.NW;
    }
}

