/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00672
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class02131
 *  minecraft.class02148
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06129
 *  minecraft.class06273
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07048
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07055
 *  minecraft.class07062
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07150
 *  minecraft.class07299
 *  minecraft.class07328
 *  minecraft.class07427
 *  minecraft.class07438
 *  minecraft.class07617
 *  minecraft.class07952
 *  minecraft.class07956
 *  minecraft.class07957
 *  minecraft.class07962
 *  minecraft.class07988
 *  minecraft.class07989
 *  minecraft.class07999
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Collection;
import minecraft.class00672;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class02131;
import minecraft.class02148;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06129;
import minecraft.class06273;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07048;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07055;
import minecraft.class07062;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07150;
import minecraft.class07299;
import minecraft.class07328;
import minecraft.class07427;
import minecraft.class07438;
import minecraft.class07464;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07617;
import minecraft.class07952;
import minecraft.class07956;
import minecraft.class07957;
import minecraft.class07962;
import minecraft.class07988;
import minecraft.class07989;
import minecraft.class07999;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class07550
extends class07150 {
    private static final class02131<Integer> N = class03289.N(class07550.class, (class04383)class02154.y);
    private static final class02131<Boolean> y = class03289.N(class07550.class, (class04383)class02154.U);
    private static final class02131<Boolean> L = class03289.N(class07550.class, (class04383)class02154.U);
    private static final boolean u = false;
    private static final boolean i = false;
    private static final short R = 30;
    private static final byte M = 3;
    private int B;
    private int Z;
    private int W = 30;
    private int T = 3;
    private boolean b;

    public static class05300 M() {
        return class07150.Y().N(class05298.l, 0.25);
    }

    public int method_5850() {
        if (this.T() == null) {
            return this.method_56993(0.0f);
        }
        return this.method_56993(this.method_6032() - 1.0f);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)-1);
        class042932.N(y, (Object)false);
        class042932.N(L, (Object)false);
    }

    public void method_5773() {
        if (this.method_5805()) {
            int n;
            this.B = this.Z;
            if (this.W()) {
                this.N(1);
            }
            if ((n = this.E()) > 0 && this.Z == 0) {
                this.method_5783(class04909.Bq, 1.0f, 0.5f);
                this.method_32876((class03556)class01194.q);
            }
            this.Z += n;
            if (this.Z < 0) {
                this.Z = 0;
            }
            if (this.Z >= this.W) {
                this.Z = this.W;
                this.v();
            }
        }
        super.method_5773();
    }

    public boolean method_5747(double d, float f, class07072 class070722) {
        boolean bl = super.method_5747(d, f, class070722);
        this.Z += (int)(d * 1.5);
        if (this.Z > this.W - 5) {
            this.Z = this.W - 5;
        }
        return bl;
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("powered", this.B());
        class083292.N("Fuse", (short)this.W);
        class083292.N("ExplosionRadius", (byte)this.T);
        class083292.N("ignited", this.W());
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.field_6011.N(y, (Object)class082992.N("powered", false));
        this.W = class082992.N("Fuse", (short)30);
        this.T = class082992.N("ExplosionRadius", (byte)3);
        if (class082992.N("ignited", false)) {
            this.m();
        }
    }

    public void method_5800(class04782 class047822, class00672 class006722) {
        super.method_5800(class047822, class006722);
        this.field_6011.N(y, (Object)true);
    }

    public boolean method_5874(class04782 class047822, class07438 class074382, class07072 class070722) {
        if (this.method_27071(class047822) && this.B() && !this.b) {
            class074382.method_72396(class047822, class070722, false, class06273.yu, class065842 -> {
                class074382.method_5775(class047822, class065842);
                this.b = true;
            });
        }
        return super.method_5874(class047822, class074382, class070722);
    }

    public class07550(class07078<? extends class07550> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public boolean B() {
        return (Boolean)this.field_6011.N(y);
    }

    private void n() {
        Collection var1 = this.method_6026();
        if (!var1.isEmpty()) {
            class07048 class070482 = new class07048(this.method_73183(), this.method_23317(), this.method_23318(), this.method_23321());
            class070482.N(2.5f);
            class070482.L(-0.5f);
            class070482.L(10);
            class070482.N(300);
            class070482.y(0.25f);
            class070482.u(-class070482.N() / (float)class070482.u());
            for (class07055 class070552 : var1) {
                class070482.N(new class07055(class070552));
            }
            this.method_73183().method_8649((class07049)class070482);
        }
    }

    public void m() {
        this.field_6011.N(L, (Object)true);
    }

    private class04891 t() {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_1)) {
            return class04909.Uc;
        }
        return class04909.Ul;
    }

    private void v() {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            float f = this.B() ? 2.0f : 1.0f;
            ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_1 = true;
            class047822.method_8437((class07049)this, this.method_23317(), this.method_23318(), this.method_23321(), (float)this.T * f, class07328.field_40890);
            this.n();
            this.method_60699(class047822, class07062.field_26998);
            this.method_31472();
        }
    }

    public float u(float f) {
        return class04995.B((float)f, (float)this.B, (float)this.Z) / (float)(this.W - 2);
    }

    public void y(@Nullable class07438 class074382) {
        if (class074382 instanceof class02148) {
            return;
        }
        super.y(class074382);
    }

    public int E() {
        return (Integer)this.field_6011.N(N);
    }

    public void N(int n) {
        this.field_6011.N(N, (Object)n);
    }

    protected class07082 N(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (class065842.N(class01226.ya)) {
            class04891 class048912 = class065842.N(class06570.GZ) ? this.t() : class04909.Uc;
            this.method_73183().method_43128((class07049)class080362, this.method_23317(), this.method_23318(), this.method_23321(), class048912, this.method_5634(), 1.0f, this.field_5974.z() * 0.4f + 0.8f);
            if (!this.method_73183().method_8608()) {
                this.m();
                if (!class065842.W()) {
                    class065842.B(1);
                } else {
                    class065842.N(1, (class07438)class080362, class070502.N());
                }
            }
            return class07082.N;
        }
        return super.N(class080362, class070502);
    }

    public boolean W() {
        return (Boolean)this.field_6011.N(L);
    }

    protected void l_() {
        this.e.N(1, (class07473)new class07427((class07079)this));
        this.e.N(2, (class07473)new class07988(this));
        this.e.N(3, new class07464<class06129>((class07475)((Object)this), class06129.class, 6.0f, 1.0, 1.2));
        this.e.N(3, new class07464<class07617>((class07475)((Object)this), class07617.class, 6.0f, 1.0, 1.2));
        this.e.N(4, (class07473)new class07999((class07475)((Object)this), 1.0, false));
        this.e.N(5, (class07473)new class07957((class07475)((Object)this), 0.8));
        this.e.N(6, (class07473)new class07962((class07079)this, class08036.class, 8.0f));
        this.e.N(6, (class07473)new class07956((class07079)this));
        this.H.N(1, (class07473)new class07952((class07079)this, class08036.class, true));
        this.H.N(2, (class07473)new class07989((class07475)((Object)this), new Class[0]));
    }

    public class04891 method_6002() {
        return class04909.BJ;
    }

    public boolean method_6121(class04782 class047822, class07049 class070492) {
        return true;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.Bo;
    }
}

