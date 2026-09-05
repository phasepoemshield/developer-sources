/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00886
 *  minecraft.class00891
 *  minecraft.class01231
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class04160
 *  minecraft.class04206
 *  minecraft.class04651
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class05487
 *  minecraft.class05787
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06898
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00886;
import minecraft.class00891;
import minecraft.class01231;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class04160;
import minecraft.class04206;
import minecraft.class04651;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class05487;
import minecraft.class05787;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06898;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07117
extends class00891
implements class00886 {
    private static final Codec<class05787> R = class04206.L.T().comapFlatMap(class046512 -> class046512 instanceof class05787 ? DataResult.success((Object)((class05787)class046512)) : DataResult.error(() -> "Not a flowing fluid: " + String.valueOf(class046512)), class057872 -> class057872);
    public static final MapCodec<class07117> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)R.fieldOf("fluid").forGetter(class071172 -> class071172.L), (App)class07117.t()).apply(instance, class07117::new));
    public static final class08071 y = class06665.Nf;
    protected final class05787 L;
    private final List<class04688> M;
    public static final class00494 u = class00891.y((double)16.0, (double)0.0, (double)8.0);
    public static final ImmutableList<class07211> i = ImmutableList.of((Object)((Object)class07211.field_11033), (Object)((Object)class07211.field_11035), (Object)((Object)class07211.field_11043), (Object)((Object)class07211.field_11034), (Object)((Object)class07211.field_11039));

    public class07117(class05787 class057872, class01362 class013622) {
        super(class013622);
        this.L = class057872;
        this.M = Lists.newArrayList();
        this.M.add(class057872.N(false));
        for (int i = 1; i < 8; ++i) {
            this.M.add(class057872.N(8 - i, false));
        }
        this.M.add(class057872.N(8, true));
        this.P((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Integer.valueOf(0)));
    }

    protected class04688 u(class00500 class005002) {
        int n = (Integer)class005002.L((class08092)y);
        return this.M.get(Math.min(n, 8));
    }

    protected boolean y(class00500 class005002) {
        return false;
    }

    protected boolean y(class00500 class005002, class00500 class005003, class07211 class072112) {
        return class005003.Y().N().N((class04651)this.L);
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        if (class060922.u()) {
            return class00389.y();
        }
        if (class060922.N(u, class072092, true) && (Integer)class005002.L((class08092)y) == 0 && class060922.N(class072902.method_8316(class072092.method_10084()), class005002.Y())) {
            return u;
        }
        return class00389.N();
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class005002.Y().N(class047822, class072092, class060692);
    }

    public class06584 N(@Nullable class07438 class074382, class07284 class072842, class07209 class072092, class00500 class005002) {
        if ((Integer)class005002.L((class08092)y) == 0) {
            class072842.method_8652(class072092, class00869.N.W(), 11);
            return new class06584((class07310)this.L.N());
        }
        return class06584.E;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    private void N(class07284 class072842, class07209 class072092) {
        class072842.N(1501, class072092, 0);
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
            callbackInfoReturnable.setReturnValue((Object)class00389.N());
        }
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (this.N(class072992, class072092, class005002)) {
            class072992.N(class072092, class005002.Y().N(), this.L.N((class05487)class072992));
        }
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return class00389.N();
    }

    protected List<class06584> N(class00500 class005002, class04160 class041602) {
        return Collections.emptyList();
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return !this.L.N(class01231.y);
    }

    public MapCodec<class07117> N() {
        return N;
    }

    private boolean N(class07299 class072992, class07209 class072092, class00500 class005002) {
        if (this.L.N(class01231.y)) {
            boolean bl = class072992.method_8320(class072092.method_10074()).N(class00869.ik);
            for (class07211 class072112 : i) {
                class07209 class072093 = class072092.method_10093(class072112.b());
                if (class072992.method_8316(class072093).N(class01231.N)) {
                    class00891 class008912 = class072992.method_8316(class072092).u() ? class00869.LV : class00869.W;
                    class072992.method_8501(class072092, class008912.W());
                    this.N((class07284)class072992, class072092);
                    return false;
                }
                if (!bl || !class072992.method_8320(class072093).N(class00869.mf)) continue;
                class072992.method_8501(class072092, class00869.iY.W());
                this.N((class07284)class072992, class072092);
                return false;
            }
        }
        return true;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class005002.Y().u() || class005003.Y().u()) {
            class087132.N(class072092, class005002.Y().N(), this.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (this.N(class072992, class072092, class005002)) {
            class072992.N(class072092, class005002.Y().N(), this.L.N((class05487)class072992));
        }
    }

    public Optional<class04891> s_() {
        return this.L.z();
    }

    protected class06898 d_(class00500 class005002) {
        return class06898.field_11455;
    }

    protected boolean e_(class00500 class005002) {
        return class005002.Y().M();
    }
}

