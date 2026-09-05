/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00772
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00772;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06999
extends class00891 {
    public static final MapCodec<class06999> N = class06999.y(class06999::new);
    public static final int y = 8;
    public static final class08071 L = class06665.NK;
    private static final class00494[] i = class00891.N((int)8, n -> class00891.y((double)16.0, (double)0.0, (double)(n * 2)));
    public static final int u = 5;
    private static final class00494[] R;

    protected class00494 L(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return i[(Integer)class005002.L((class08092)L)];
    }

    public class06999(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Integer.valueOf(1)));
    }

    protected class00494 u(class00500 class005002, class07290 class072902, class07209 class072092) {
        return i[(Integer)class005002.L((class08092)L)];
    }

    protected float y(class00500 class005002, class07290 class072902, class07209 class072092) {
        return (Integer)class005002.L((class08092)L) == 8 ? 0.2f : 1.0f;
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (class047822.method_8314(class00772.field_9282, class072092) > 11) {
            class06999.y((class00500)class005002, (class07299)class047822, (class07209)class072092);
            class047822.method_8650(class072092, false);
        }
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return i[(Integer)class005002.L((class08092)L) - 1];
    }

    public @Nullable class00500 N(class06942 class069422) {
        class00500 class005002 = class069422.method_8045().method_8320(class069422.method_8037());
        if (class005002.N((class00891)this)) {
            int n = (Integer)class005002.L((class08092)L);
            return (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(Math.min(8, n + 1)));
        }
        return super.N(class069422);
    }

    protected boolean N(class00500 class005002, class06942 class069422) {
        int n = (Integer)class005002.L((class08092)L);
        if (class069422.method_8041().N(this.B()) && n < 8) {
            if (class069422.y()) {
                return class069422.method_8038() == class07211.field_11036;
            }
            return true;
        }
        return n == 1;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L});
    }

    public MapCodec<class06999> N() {
        return N;
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        if (class087912 == class08791.field_50) {
            return (Integer)class005002.L((class08092)L) < 5;
        }
        return false;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return i[(Integer)class005002.L((class08092)L)];
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (!class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfoReturnable.setReturnValue((Object)R[(Integer)class005002.L((class08092)L) - 1]);
        }
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class00500 class005003 = class054872.method_8320(class072092.method_10074());
        if (class005003.N(class01210.LJ)) {
            return false;
        }
        if (class005003.N(class01210.Lo)) {
            return true;
        }
        return class00891.N((class00494)class005003.M((class07290)class054872, class072092.method_10074()), (class07211)class07211.field_11036) || class005003.N((class00891)this) && (Integer)class005003.L((class08092)L) == 8;
    }

    protected boolean a_(class00500 class005002) {
        return true;
    }
}

