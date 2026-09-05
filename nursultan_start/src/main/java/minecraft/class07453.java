/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00502
 *  minecraft.class00753
 *  minecraft.class02131
 *  minecraft.class02145
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04425
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07131
 *  minecraft.class07134
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07633
 *  minecraft.class07955
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class00500;
import minecraft.class00502;
import minecraft.class00753;
import minecraft.class02131;
import minecraft.class02145;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04425;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07131;
import minecraft.class07134;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07438;
import minecraft.class07633;
import minecraft.class07955;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import org.jspecify.annotations.Nullable;

public abstract class class07453
extends class07633
implements class02145 {
    public static final int B = 144;
    private static final int N = 2;
    private static final int y = 3;
    private static final int L = 1;
    private static final boolean u = false;
    protected static final class02131<Byte> Z = class03289.N(class07453.class, (class04383)class02154.N);
    protected static final class02131<Optional<class08372<class07438>>> X = class03289.N(class07453.class, (class04383)class02154.b);
    private boolean i = false;

    public void No() {
        class07438 class074382 = this.L_();
        if (class074382 != null) {
            this.N(class074382.method_24515());
        }
    }

    protected void M(boolean bl) {
        class07134 class071342 = class07107.f;
        if (!bl) {
            class071342 = class07107.NZ;
        }
        for (int i = 0; i < 7; ++i) {
            double d = this.field_5974.E() * 0.02;
            double d2 = this.field_5974.E() * 0.02;
            double d3 = this.field_5974.E() * 0.02;
            this.method_73183().method_8406((class07126)class071342, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), d, d2, d3);
        }
    }

    public @Nullable class00502 method_5781() {
        class07438 class074382;
        class00502 class005022 = super.method_5781();
        if (class005022 != null) {
            return class005022;
        }
        if (this.NQ() && (class074382 = this.Z()) != null) {
            return class074382.method_5781();
        }
        return null;
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(Z, (Object)0);
        class042932.N(X, Optional.empty());
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class08372.N(this.NI(), (class08329)class083292, (String)"Owner");
        class083292.N("Sitting", this.i);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        class08372 class083722 = class08372.N((class08299)class082992, (String)"Owner", (class07299)this.method_73183());
        if (class083722 != null) {
            try {
                this.field_6011.N(X, Optional.of(class083722));
                this.N(true, false);
            }
            catch (Throwable throwable) {
                this.N(false, true);
            }
        } else {
            this.field_6011.N(X, Optional.empty());
            this.N(false, true);
        }
        this.i = class082992.N("Sitting", false);
        this.B(this.i);
    }

    public void method_5711(byte by) {
        if (by == 7) {
            this.M(true);
        } else if (by == 6) {
            this.M(false);
        } else {
            super.method_5711(by);
        }
    }

    protected boolean method_61416(class07049 class070492) {
        if (this.NQ()) {
            class07438 class074382 = this.Z();
            if (class070492 == class074382) {
                return true;
            }
            if (class074382 != null) {
                return class074382.method_61416(class070492);
            }
        }
        return super.method_61416(class070492);
    }

    public class07453(class07078<? extends class07453> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public void B(boolean bl) {
        byte by = (Byte)this.field_6011.N(Z);
        if (bl) {
            this.field_6011.N(Z, (Object)((byte)(by | 1)));
        } else {
            this.field_6011.N(Z, (Object)((byte)(by & 0xFFFFFFFE)));
        }
    }

    public void Z(boolean bl) {
        this.i = bl;
    }

    public boolean L(class07438 class074382) {
        return class074382 == this.L_();
    }

    public boolean g() {
        return true;
    }

    public void u(class08036 class080362) {
        this.N(true, true);
        this.u((class07438)class080362);
        if (class080362 instanceof class04770) {
            class04770 class047702 = (class04770)class080362;
            class06912.d.N(class047702, (class07633)this);
        }
    }

    public void u(@Nullable class07438 class074382) {
        this.field_6011.N(X, Optional.ofNullable(class074382).map(class08372::N));
    }

    private boolean y(class07209 class072092) {
        if (class07955.N((class07079)this, (class07209)class072092) != class04425.field_12) {
            return false;
        }
        class00500 class005002 = this.method_73183().method_8320(class072092.method_10074());
        if (!this.NV() && class005002.i() instanceof class07131) {
            return false;
        }
        class07209 class072093 = class072092.method_10059((class00753)this.method_24515());
        return this.method_73183().method_8587((class07049)this, this.method_5829().N(class072093));
    }

    private boolean N(int n, int n2, int n3) {
        if (!this.y(new class07209(n, n2, n3))) {
            return false;
        }
        this.method_5808((double)n + 0.5, n2, (double)n3 + 0.5, this.method_36454(), this.method_36455());
        this.V.W();
        return true;
    }

    public void N(boolean bl, boolean bl2) {
        byte by = (Byte)this.field_6011.N(Z);
        if (bl) {
            this.field_6011.N(Z, (Object)((byte)(by | 4)));
        } else {
            this.field_6011.N(Z, (Object)((byte)(by & 0xFFFFFFFB)));
        }
        if (bl2) {
            this.NO();
        }
    }

    private void N(class07209 class072092) {
        for (int i = 0; i < 10; ++i) {
            int n = this.field_5974.N(-3, 3);
            int n2 = this.field_5974.N(-3, 3);
            if (Math.abs(n) < 2 && Math.abs(n2) < 2) continue;
            int n3 = this.field_5974.N(-1, 1);
            if (!this.N(class072092.method_10263() + n, class072092.method_10264() + n3, class072092.method_10260() + n2)) continue;
            return;
        }
    }

    public boolean N(class07438 class074382, class07438 class074383) {
        return true;
    }

    public void a_(@Nullable class08372<class07438> class083722) {
        this.field_6011.N(X, Optional.ofNullable(class083722));
    }

    protected void NO() {
    }

    public boolean NQ() {
        return ((Byte)this.field_6011.N(Z) & 4) != 0;
    }

    public final boolean NK() {
        return this.NJ() || this.method_5765() || this.yz() || this.L_() != null && this.L_().method_7325();
    }

    public boolean Ng() {
        return ((Byte)this.field_6011.N(Z) & 1) != 0;
    }

    public boolean NJ() {
        return this.i;
    }

    public @Nullable class08372<class07438> NI() {
        return ((Optional)this.field_6011.N(X)).orElse(null);
    }

    protected boolean NV() {
        return false;
    }

    public boolean Nq() {
        return this.L_() != null && this.method_5858(this.L_()) >= 144.0;
    }

    public boolean method_18395(class07438 class074382) {
        if (this.L(class074382)) {
            return false;
        }
        return super.method_18395(class074382);
    }

    public void method_6078(class07072 class070722) {
        class07438 class074382;
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782 && ((Boolean)((class04782)class072992).method_64395().N(class07305.f)).booleanValue() && (class074382 = this.L_()) instanceof class04770) {
            class072992 = (class04770)class074382;
            class072992.method_64398(this.method_6066().N());
        }
        super.method_6078(class070722);
    }
}

