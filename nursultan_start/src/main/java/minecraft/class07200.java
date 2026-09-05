/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicates
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class06092
 *  minecraft.class06646
 *  minecraft.class06649
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06670
 *  minecraft.class06684
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07101
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08791
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.function.Predicate;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class06092;
import minecraft.class06646;
import minecraft.class06649;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06670;
import minecraft.class06684;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08791;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07200
extends class00891 {
    public static final MapCodec<class07200> N = class07200.y(class07200::new);
    public static final class08064<class07211> y = class07101.R;
    public static final class06667 L = class06665.U;
    private static final class00494 u = class00891.y((double)16.0, (double)0.0, (double)13.0);
    private static final class00494 i = class00389.N((class00494)u, (class00494)class00891.y((double)8.0, (double)13.0, (double)16.0));
    private static @Nullable class06649 R;
    private static final class00494 M;
    private static final class00494 B;
    private static final class00494 Z;

    public class07200(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)((Object)class07211.field_11043))).y((class08092)L, (Comparable)Boolean.valueOf(false)));
    }

    public class00494 z(class00500 class005002) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return u;
        }
        return super.z(class005002);
    }

    public static class06649 y() {
        if (R == null) {
            R = class06684.N().N(new String[]{"?vvv?", ">???<", ">???<", ">???<", "?^^^?"}).N('?', class06646.N((Predicate)class06670.N)).N('^', class06646.N((Predicate)class06670.N((class00891)class00869.Mm).N((class08092)L, (Predicate)Predicates.equalTo((Object)true)).N(y, (Predicate)Predicates.equalTo((Object)((Object)class07211.field_11035))))).N('>', class06646.N((Predicate)class06670.N((class00891)class00869.Mm).N((class08092)L, (Predicate)Predicates.equalTo((Object)true)).N(y, (Predicate)Predicates.equalTo((Object)((Object)class07211.field_11039))))).N('v', class06646.N((Predicate)class06670.N((class00891)class00869.Mm).N((class08092)L, (Predicate)Predicates.equalTo((Object)true)).N(y, (Predicate)Predicates.equalTo((Object)((Object)class07211.field_11043))))).N('<', class06646.N((Predicate)class06670.N((class00891)class00869.Mm).N((class08092)L, (Predicate)Predicates.equalTo((Object)true)).N(y, (Predicate)Predicates.equalTo((Object)((Object)class07211.field_11034))))).y();
        }
        return R;
    }

    public class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            return (Boolean)class005002.L((class08092)L) != false ? B : u;
        }
        return super.y_4(class005002, class072902, class072092, class060922);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L});
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfoReturnable.setReturnValue((Object)u);
        } else if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            callbackInfoReturnable.setReturnValue((Object)Z);
        }
    }

    public MapCodec<class07200> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return (Boolean)class005002.L((class08092)L) != false ? i : u;
    }

    public class00500 N(class06942 class069422) {
        return (class00500)((class00500)this.W().y(y, (Comparable)((Object)class069422.method_8042().b()))).y((class08092)L, (Comparable)Boolean.valueOf(false));
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)((Object)class005002.L(y))));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)((Object)class069932.N((class07211)((Object)class005002.L(y)))));
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            return 15;
        }
        return 0;
    }

    protected boolean a_(class00500 class005002) {
        return true;
    }
}

