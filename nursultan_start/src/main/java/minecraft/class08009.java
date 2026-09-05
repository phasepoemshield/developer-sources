/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03244
 *  minecraft.class04293
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  minecraft.class08636
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class03244;
import minecraft.class04293;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import minecraft.class08636;
import org.jspecify.annotations.Nullable;

public class class08009
extends class07049
implements class03244 {
    public static final int N = 20;
    public static final int y = 2;
    public static final int L = 14;
    private static final int u = 0;
    private int i = 0;
    private boolean R;
    private int M = 22;
    private boolean B;
    private @Nullable class08372<class07438> Z;

    protected void method_5693(class04293 class042932) {
    }

    public void method_5773() {
        super.method_5773();
        if (this.method_73183().method_8608()) {
            if (this.B) {
                --this.M;
                if (this.M == 14) {
                    for (int i = 0; i < 12; ++i) {
                        double d = this.method_23317() + (this.field_5974.U() * 2.0 - 1.0) * (double)this.method_17681() * 0.5;
                        double d2 = this.method_23318() + 0.05 + this.field_5974.U();
                        double d3 = this.method_23321() + (this.field_5974.U() * 2.0 - 1.0) * (double)this.method_17681() * 0.5;
                        double d4 = (this.field_5974.U() * 2.0 - 1.0) * 0.3;
                        double d5 = 0.3 + this.field_5974.U() * 0.3;
                        double d6 = (this.field_5974.U() * 2.0 - 1.0) * 0.3;
                        this.method_73183().method_8406((class07126)class07107.M, d, d2 + 1.0, d3, d4, d5, d6);
                    }
                }
            }
        } else if (--this.i < 0) {
            if (this.i == -8) {
                List var1 = this.method_73183().N(class07438.class, this.method_5829().L(0.2, 0.0, 0.2));
                for (class07438 class074382 : var1) {
                    this.y(class074382);
                }
            }
            if (!this.R) {
                this.method_73183().method_8421((class07049)this, (byte)4);
                this.R = true;
            }
            if (--this.M < 0) {
                this.method_31472();
            }
        }
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        return false;
    }

    protected void method_5652(class08329 class083292) {
        class083292.N("Warmup", this.i);
        class08372.N(this.Z, (class08329)class083292, (String)"Owner");
    }

    protected void method_5749(class08299 class082992) {
        this.i = class082992.N("Warmup", 0);
        this.Z = class08372.N((class08299)class082992, (String)"Owner");
    }

    public void method_5711(byte by) {
        super.method_5711(by);
        if (by == 4) {
            this.B = true;
            if (!this.method_5701()) {
                this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.Uz, this.method_5634(), 1.0f, this.field_5974.z() * 0.2f + 0.85f, false);
            }
        }
    }

    public class08009(class07078<? extends class08009> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class08009(class07299 class072992, double d, double d2, double d3, float f, int n, class07438 class074382) {
        this((class07078<? extends class08009>)class07078.D, class072992);
        this.i = n;
        this.N(class074382);
        this.method_36456(f * 57.295776f);
        this.method_5814(d, d2, d3);
    }

    private void y(class07438 class074382) {
        class07438 class074383 = this.z();
        if (!class074382.method_5805() || class074382.method_5655() || class074382 == class074383) {
            return;
        }
        if (class074383 == null) {
            class074382.method_64419(this.method_48923().T(), 6.0f);
        } else {
            class04782 class047822;
            if (class074383.method_5722((class07049)class074382)) {
                return;
            }
            class07072 class070722 = this.method_48923().L((class07049)this, (class07049)class074383);
            class07299 class072992 = this.method_73183();
            if (class072992 instanceof class04782 && class074382.method_64397(class047822 = (class04782)class072992, class070722, 6.0f)) {
                class07323.N((class04782)class047822, (class07049)class074382, (class07072)class070722);
            }
        }
    }

    public @Nullable class07438 z() {
        return class08372.y(this.Z, (class07299)this.method_73183());
    }

    public float N(float f) {
        if (!this.B) {
            return 0.0f;
        }
        int n = this.M - 2;
        if (n <= 0) {
            return 1.0f;
        }
        return 1.0f - ((float)n - f) / 20.0f;
    }

    public void N(@Nullable class07438 class074382) {
        this.Z = class08372.N((class08636)class074382);
    }
}

