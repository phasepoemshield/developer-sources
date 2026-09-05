/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class01894
 *  minecraft.class02733
 *  minecraft.class03556
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07237
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08071
 *  minecraft.class08089
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class01894;
import minecraft.class02733;
import minecraft.class03556;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07237;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08071;
import minecraft.class08089;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06867
extends class00891 {
    public static final MapCodec<class06867> N = class06867.y(class06867::new);
    public static final class08064<class08089> y = class06665.yU;
    public static final class06667 L = class06665.k;
    public static final class08071 u = class06665.NS;
    public static final int i = 3;

    public class06867(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)class08089.field_12648)).y((class08092)u, (Comparable)Integer.valueOf(0))).y((class08092)L, (Comparable)Boolean.valueOf(false)));
    }

    public static float y(int n) {
        return (float)Math.pow(2.0, (double)(n - 12) / 12.0);
    }

    protected boolean N(class00500 class005002, class07299 class072992, class07209 class072092, int n, int n2) {
        class03556 var8;
        float f;
        class08089 class080892 = (class08089)class005002.L(y);
        if (class080892.y()) {
            int n3 = (Integer)class005002.L((class08092)u);
            f = class06867.y(n3);
            class072992.method_8406((class07126)class07107.Ni, (double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 1.2, (double)class072092.method_10260() + 0.5, (double)n3 / 24.0, 0.0, 0.0);
        } else {
            f = 1.0f;
        }
        if (class080892.L()) {
            class01894 class018942 = this.N(class072992, class072092);
            if (class018942 == null) {
                return false;
            }
            class03556 class035562 = class03556.N((Object)class04891.N((class01894)class018942));
        } else {
            var8 = class080892.N();
        }
        class072992.method_8465(null, (double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, var8, class04911.field_15247, 3.0f, f, class072992.field_9229.B());
        return true;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (!class072992.method_8608()) {
            class005002 = (class00500)class005002.N((class08092)u);
            class072992.method_8652(class072092, class005002, 3);
            this.N((class07049)class080362, class005002, class072992, class072092);
            class080362.method_7281(class01235.NZ);
        }
        return class07082.N;
    }

    private @Nullable class01894 N(class07299 class072992, class07209 class072092) {
        class00394 class003942 = class072992.method_8321(class072092.method_10084());
        if (class003942 instanceof class07237) {
            return ((class07237)class003942).L();
        }
        return null;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, u});
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_4)) {
            callbackInfoReturnable.setReturnValue((Object)class07082.N);
        }
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112.z() == class07185.field_11052) {
            return this.N(class054872, class072092, class005002);
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public class00500 N(class06942 class069422) {
        return this.N((class05487)class069422.method_8045(), class069422.method_8037(), this.W());
    }

    private class00500 N(class05487 class054872, class07209 class072092, class00500 class005002) {
        class08089 class080892 = class054872.method_8320(class072092.method_10084()).I();
        if (class080892.u()) {
            return (class00500)class005002.y(y, (Comparable)class080892);
        }
        class08089 class080893 = class054872.method_8320(class072092.method_10074()).I();
        class08089 class080894 = class080893.u() ? class08089.field_12648 : class080893;
        return (class00500)class005002.y(y, (Comparable)class080894);
    }

    public MapCodec<class06867> N() {
        return N;
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        if (class065842.N(class01226.yp) && class061832.i() == class07211.field_11036) {
            return class07082.i;
        }
        return super.N(class065842, class005002, class072992, class072092, class080362, class070502, class061832);
    }

    private void N(@Nullable class07049 class070492, class00500 class005002, class07299 class072992, class07209 class072092) {
        if (((class08089)class005002.L(y)).u() || class072992.method_8320(class072092.method_10084()).P()) {
            class072992.method_8427(class072092, (class00891)this, 0, 0);
            class072992.N(class070492, (class03556)class01194.o, class072092);
        }
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        boolean bl2 = class072992.W(class072092);
        if (bl2 != (Boolean)class005002.L((class08092)L)) {
            if (bl2) {
                this.N(null, class005002, class072992, class072092);
            }
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(bl2)), 3);
        }
    }

    protected void a_(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362) {
        if (class072992.method_8608()) {
            return;
        }
        this.N((class07049)class080362, class005002, class072992, class072092);
        class080362.method_7281(class01235.NB);
    }
}

