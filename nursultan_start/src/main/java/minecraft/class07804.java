/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.injection.ViaFabricPlusMixinPlugin
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00389
 *  minecraft.class00392
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00701
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class03965
 *  minecraft.class05880
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07082
 *  minecraft.class07101
 *  minecraft.class07185
 *  minecraft.class07204
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07497
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.injection.ViaFabricPlusMixinPlugin;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import minecraft.class00389;
import minecraft.class00392;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00701;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class03965;
import minecraft.class05880;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07082;
import minecraft.class07101;
import minecraft.class07185;
import minecraft.class07204;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07497;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07804
extends class07204 {
    public static final MapCodec<class07804> N = class07804.y(class07804::new);
    public static final class08064<class07211> y = class07101.R;
    private static final Map<class07185, class00494> L = class00389.N((class00494)class00389.N((class00494)class00891.y((double)12.0, (double)0.0, (double)4.0), (class00494[])new class00494[]{class00891.N((double)8.0, (double)10.0, (double)4.0, (double)5.0), class00891.N((double)4.0, (double)8.0, (double)5.0, (double)10.0), class00891.N((double)10.0, (double)16.0, (double)10.0, (double)16.0)}));
    private static final class00392 u = class00392.L((String)"container.repair");
    private static final float i = 2.0f;
    private static final int R = 40;
    private static final class00494 M;
    private static final class00494 B;
    private boolean Z;

    public class07804(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11043));
    }

    public static @Nullable class00500 Z(class00500 class005002) {
        if (class005002.N(class00869.BK)) {
            return (class00500)class00869.BV.W().y(y, (Comparable)((class07211)class005002.L(y)));
        }
        if (class005002.N(class00869.BV)) {
            return (class00500)class00869.Be.W().y(y, (Comparable)((class07211)class005002.L(y)));
        }
        return null;
    }

    protected class00494 z(class00500 class005002) {
        this.Z = true;
        return super.z(class005002);
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    public int N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.N((class07290)class072902, (class07209)class072092).NU;
    }

    public MapCodec<class07804> N() {
        return N;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ViaFabricPlusMixinPlugin.MORE_CULLING_PRESENT && this.Z) {
            this.Z = false;
        } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfoReturnable.setReturnValue((Object)(((class07211)class005002.L(y)).z() == class07185.field_11048 ? M : B));
        }
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return L.get(((class07211)class005002.L(y)).z());
    }

    protected @Nullable class06237 N(class00500 class005002, class07299 class072992, class07209 class072092) {
        return new class03965((n, class080442, class080362) -> new class07497(n, class080442, class05880.N((class07299)class072992, (class07209)class072092)), u);
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (!class072992.method_8608()) {
            class080362.method_17355(class005002.N(class072992, class072092));
            class080362.method_7281(class01235.Ng);
        }
        return class07082.N;
    }

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y(y, (Comparable)class069422.method_8042().R());
    }

    public class07072 N(class07049 class070492) {
        return class070492.method_48923().y(class070492);
    }

    public void N(class07299 class072992, class07209 class072092, class00701 class007012) {
        if (!class007012.method_5701()) {
            class072992.N(1029, class072092, 0);
        }
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, class00500 class005003, class00701 class007012) {
        if (!class007012.method_5701()) {
            class072992.N(1031, class072092, 0);
        }
    }

    protected void N(class00701 class007012) {
        class007012.N(2.0f, 40);
    }
}

