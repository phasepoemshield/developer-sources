/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04252
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class08007
 *  minecraft.class08008
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Collection;
import java.util.List;
import minecraft.class00500;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04252;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class08007;
import minecraft.class08008;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class07517
extends class08007 {
    private static final class02131<Byte> M = class03289.N(class07517.class, (class04383)class02154.N);
    private static final class02131<Boolean> B = class03289.N(class07517.class, (class04383)class02154.U);
    private static final float Z = 0.99f;
    private static final boolean z = false;
    public boolean u = false;
    public int R;

    public void L() {
        byte by = (Byte)this.field_6011.N(M);
        if (this.y != class08008.field_7593 || by <= 0) {
            super.L();
        }
    }

    protected class06584 M() {
        return new class06584((class07310)class06570.db);
    }

    public class06584 method_59958() {
        return this.B();
    }

    protected void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(M, (Object)0);
        class042932.N(B, (Object)false);
    }

    public void method_5773() {
        if (this.N > 4) {
            this.u = true;
        }
        class07049 class070492 = this.z();
        byte by = (Byte)this.field_6011.N(M);
        if (by > 0 && (this.u || this.W()) && class070492 != null) {
            if (!this.b()) {
                class07299 class072992 = this.method_73183();
                if (class072992 instanceof class04782) {
                    class04782 class047822 = (class04782)class072992;
                    if (this.y == class08008.field_7593) {
                        this.method_5699(class047822, this.R(), 0.1f);
                    }
                }
                this.method_31472();
            } else {
                if (!(class070492 instanceof class08036) && this.method_73189().R(class070492.method_33571()) < (double)class070492.method_17681() + 1.0) {
                    this.method_31472();
                    return;
                }
                this.L(true);
                class06889 class068892 = class070492.method_33571().u(this.method_73189());
                this.method_23327(this.method_23317(), this.method_23318() + class068892.B * 0.015 * (double)by, this.method_23321());
                double d = 0.05 * (double)by;
                this.method_18799(this.method_18798().L(0.95).i(class068892.u().L(d)));
                if (this.R == 0) {
                    this.method_5783(class04909.QC, 10.0f, 1.0f);
                }
                ++this.R;
            }
        }
        super.method_5773();
    }

    public void method_5694(class08036 class080362) {
        if (this.u((class07049)class080362) || this.z() == null) {
            super.method_5694(class080362);
        }
    }

    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("DealtDamage", this.u);
    }

    public boolean method_5727(double d, double d2, double d3) {
        return true;
    }

    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.u = class082992.N("DealtDamage", false);
        this.field_6011.N(M, (Object)this.y(this.B()));
    }

    public class07517(class07299 class072992, class07438 class074382, class06584 class065842) {
        super(class07078.yo, class074382, class072992, class065842, null);
        this.field_6011.N(M, (Object)this.y(class065842));
        this.field_6011.N(B, (Object)class065842.Q());
    }

    public class07517(class07299 class072992, double d, double d2, double d3, class06584 class065842) {
        super(class07078.yo, d, d2, d3, class072992, class065842, class065842);
        this.field_6011.N(M, (Object)this.y(class065842));
        this.field_6011.N(B, (Object)class065842.Q());
    }

    public class07517(class07078<? extends class07517> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    private boolean b() {
        class07049 class070492 = this.z();
        if (class070492 == null || !class070492.method_5805()) {
            return false;
        }
        return !(class070492 instanceof class04770) || !class070492.method_7325();
    }

    public boolean m() {
        return (Boolean)this.field_6011.N(B);
    }

    protected class04891 u() {
        return class04909.Qf;
    }

    protected Collection<class06145> y(class06889 class068892, class06889 class068893) {
        class06145 class061452 = this.N(class068892, class068893);
        if (class061452 != null) {
            return List.of(class061452);
        }
        return List.of();
    }

    private byte y(class06584 class065842) {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            return (byte)class04995.N((int)class07323.L((class04782)((class04782)class072992), (class06584)class065842, (class07049)this), (int)0, (int)127);
        }
        return 0;
    }

    protected float E() {
        return 0.99f;
    }

    protected boolean N(class08036 class080362) {
        return super.N(class080362) || this.W() && this.u((class07049)class080362) && class080362.method_31548().M(this.R());
    }

    protected void N(class04782 class047822, class06183 class061832, class06584 class065842) {
        class06889 class068892 = class061832.u().method_60913(class061832.y());
        class07049 class070492 = this.z();
        class07323.N((class04782)class047822, (class06584)class065842, (class07438)(class070492 instanceof class07438 ? (class07438)class070492 : null), (class07049)this, null, (class06889)class068892, (class00500)class047822.method_8320(class061832.u()), class065812 -> this.method_5768(class047822));
    }

    protected @Nullable class06145 N(class06889 class068892, class06889 class068893) {
        if (this.u) {
            return null;
        }
        return super.N(class068892, class068893);
    }

    protected void N(class06145 class061452) {
        class04782 class047822;
        class07049 class070492 = class061452.L();
        float f = 8.0f;
        class07049 class070493 = this.z();
        class07072 class070722 = this.method_48923().N((class07049)this, (class07049)(class070493 == null ? this : class070493));
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class047822 = (class04782)class072992;
            f = class07323.N((class04782)class047822, (class06584)this.method_59958(), (class07049)class070492, (class07072)class070722, (float)f);
        }
        this.u = true;
        if (class070492.method_64420(class070722, f)) {
            if (class070492.method_5864() == class07078.F) {
                return;
            }
            class072992 = this.method_73183();
            if (class072992 instanceof class04782) {
                class047822 = (class04782)class072992;
                class07323.N((class04782)class047822, (class07049)class070492, (class07072)class070722, (class06584)this.method_59958(), class065812 -> this.method_5768(class047822));
            }
            if (class070492 instanceof class07438) {
                class047822 = (class07438)class070492;
                this.N((class07438)class047822, class070722);
                this.N((class07438)class047822);
            }
        }
        this.N(class04252.y, class070492, this.i, false);
        this.method_18799(this.method_18798().u(0.02, 0.2, 0.02));
        this.method_5783(class04909.QA, 1.0f, 1.0f);
    }
}

