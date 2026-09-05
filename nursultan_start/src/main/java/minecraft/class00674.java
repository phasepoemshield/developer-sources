/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01032
 *  minecraft.class01284
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03244
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class07049
 *  minecraft.class07065
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07307
 *  minecraft.class07328
 *  minecraft.class07438
 *  minecraft.class07451
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  minecraft.class08636
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00688;
import minecraft.class00869;
import minecraft.class01032;
import minecraft.class01284;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03244;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class07049;
import minecraft.class07065;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07307;
import minecraft.class07328;
import minecraft.class07438;
import minecraft.class07451;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import minecraft.class08636;
import org.jspecify.annotations.Nullable;

public class class00674
extends class07049
implements class03244 {
    private static final class02131<Integer> y = class03289.N(class00674.class, (class04383)class02154.y);
    private static final class02131<class00500> L = class03289.N(class00674.class, (class04383)class02154.Z);
    private static final short u = 80;
    private static final float i = 4.0f;
    private static final class00500 R = class00869.Ln.W();
    private static final String M = "block_state";
    public static final String N = "fuse";
    private static final String B = "explosion_power";
    private static final class01284 Z = new class00688();
    private @Nullable class08372<class07438> z;
    private boolean U;
    private float E = 4.0f;

    public class00500 L() {
        return (class00500)this.field_6011.N(L);
    }

    protected void method_5693(class04293 class042932) {
        class042932.N(y, (Object)80);
        class042932.N(L, (Object)R);
    }

    public void method_5773() {
        this.method_60698();
        this.method_56990();
        this.method_5784(class07451.field_6308, this.method_18798());
        this.method_61409();
        this.method_18799(this.method_18798().L(0.98));
        if (this.method_24828()) {
            this.method_18799(this.method_18798().u(0.7, -0.5, 0.7));
        }
        int n = this.y() - 1;
        this.N(n);
        if (n <= 0) {
            this.method_31472();
            if (!this.method_73183().method_8608()) {
                this.u();
            }
        } else {
            this.method_5876();
            if (this.method_73183().method_8608()) {
                this.method_73183().method_8406((class07126)class07107.NZ, this.method_23317(), this.method_23318() + 0.5, this.method_23321(), 0.0, 0.0, 0.0);
            }
        }
    }

    public final boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        return false;
    }

    protected class07065 method_33570() {
        return class07065.field_28630;
    }

    protected double method_7490() {
        return 0.04;
    }

    protected void method_5652(class08329 class083292) {
        class083292.N(N, (short)this.y());
        class083292.N(M, class00500.N, (Object)this.L());
        if (this.E != 4.0f) {
            class083292.N(B, this.E);
        }
        class08372.N(this.z, (class08329)class083292, (String)"owner");
    }

    public boolean method_5863() {
        return !this.method_31481();
    }

    protected void method_5749(class08299 class082992) {
        this.N(class082992.N(N, (short)80));
        this.N(class082992.N(M, class00500.N).orElse(R));
        this.E = class04995.N((float)class082992.N(B, 4.0f), (float)0.0f, (float)128.0f);
        this.z = class08372.N((class08299)class082992, (String)"owner");
    }

    public @Nullable class07049 method_5731(class01032 class010322) {
        class07049 class070492 = super.method_5731(class010322);
        if (class070492 instanceof class00674) {
            ((class00674)class070492).N(true);
        }
        return class070492;
    }

    public void method_5878(class07049 class070492) {
        super.method_5878(class070492);
        if (class070492 instanceof class00674) {
            class00674 class006742 = (class00674)class070492;
            this.z = class006742.z;
        }
    }

    public class00674(class07078<? extends class00674> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.field_23807 = true;
    }

    public class00674(class07299 class072992, double d, double d2, double d3, @Nullable class07438 class074382) {
        this((class07078<? extends class00674>)class07078.yg, class072992);
        this.method_5814(d, d2, d3);
        double d4 = class072992.field_9229.U() * 6.2831854820251465;
        this.method_18800(-Math.sin(d4) * 0.02, 0.2f, -Math.cos(d4) * 0.02);
        this.N(80);
        this.field_6014 = d;
        this.field_6036 = d2;
        this.field_5969 = d3;
        this.z = class08372.N((class08636)class074382);
    }

    private void u() {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782 && ((Boolean)((class04782)class072992).method_64395().N(class07305.Nu)).booleanValue()) {
            this.method_73183().method_55117((class07049)this, class07307.N((class07299)this.method_73183(), (class07049)this), (class01284)(this.U ? Z : null), this.method_23317(), this.method_23323(0.0625), this.method_23321(), this.E, false, class07328.field_40891);
        }
    }

    public int y() {
        return (Integer)this.field_6011.N(y);
    }

    public @Nullable class07438 z() {
        return class08372.y(this.z, (class07299)this.method_73183());
    }

    public void N(class00500 class005002) {
        this.field_6011.N(L, (Object)class005002);
    }

    public void N(int n) {
        this.field_6011.N(y, (Object)n);
    }

    private void N(boolean bl) {
        this.U = bl;
    }
}

