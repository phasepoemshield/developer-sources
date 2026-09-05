/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09956
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class00389
 *  minecraft.class00394
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00515
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01231
 *  minecraft.class02733
 *  minecraft.class02995
 *  minecraft.class03767
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04689
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05074
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class06551
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06898
 *  minecraft.class06925
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07302
 *  minecraft.class07307
 *  minecraft.class07310
 *  minecraft.class07752
 *  minecraft.class08005
 *  minecraft.class08036
 *  minecraft.class08400
 *  minecraft.class08713
 *  minecraft.class08791
 *  net.caffeinemc.mods.lithium.common.block.entity.ShapeUpdateHandlingBlockBehaviour
 *  net.fabricmc.fabric.mixin.content.registry.BlockBehaviourAccessor
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09956;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00515;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01231;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class02995;
import minecraft.class03767;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04689;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05074;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class06551;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06898;
import minecraft.class06925;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07302;
import minecraft.class07307;
import minecraft.class07310;
import minecraft.class07752;
import minecraft.class08005;
import minecraft.class08036;
import minecraft.class08400;
import minecraft.class08713;
import minecraft.class08791;
import net.caffeinemc.mods.lithium.common.block.entity.ShapeUpdateHandlingBlockBehaviour;
import net.fabricmc.fabric.mixin.content.registry.BlockBehaviourAccessor;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class01354
implements class02995,
ShapeUpdateHandlingBlockBehaviour,
BlockBehaviourAccessor {
    public static final class07211[] g = new class07211[]{class07211.field_11039, class07211.field_11034, class07211.field_11043, class07211.field_11035, class07211.field_11033, class07211.field_11036};
    protected final boolean I;
    protected final float J;
    protected final boolean o;
    protected final class07752 q;
    protected final float K;
    public float V;
    protected final float e;
    protected final boolean H;
    protected final class03767 c;
    public final class01362 X;
    protected final Optional<class05946<class05074>> a;
    protected final String p;

    public final String w() {
        return this.p;
    }

    protected class00494 L(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.y_4(class005002, class072902, class072092, class060922);
    }

    protected abstract class00891 P();

    public class01354(class01362 class013622) {
        this.I = class013622.L;
        this.a = class013622.B();
        this.p = class013622.T();
        this.J = class013622.R;
        this.o = class013622.Z;
        this.q = class013622.u;
        this.K = class013622.z;
        this.V = class013622.U;
        this.e = class013622.E;
        this.H = class013622.Q;
        this.c = class013622.O;
        this.X = class013622;
    }

    public abstract class06581 B();

    protected boolean i(class00500 class005002) {
        return false;
    }

    public class01362 n() {
        return this.X;
    }

    protected float l() {
        return 0.2f;
    }

    public final Optional<class05946<class05074>> d() {
        return this.a;
    }

    public class04689 k() {
        return this.X.y.apply(this.P().W());
    }

    protected static <B extends class00891> RecordCodecBuilder<B, class01362> t() {
        return class01362.N.fieldOf("properties").forGetter(class01354::n);
    }

    protected class07752 j(class00500 class005002) {
        return this.q;
    }

    public class00494 z(class00500 class005002) {
        return class005002.R((class07290)class00515.field_12294, class07209.field_10980);
    }

    public class00494 u(class00500 class005002, class07290 class072902, class07209 class072092) {
        return this.y_4(class005002, class072902, class072092, class06092.N());
    }

    protected class04688 u(class00500 class005002) {
        return class04684.N.M();
    }

    protected boolean y(class00500 class005002) {
        return !class00891.N((class00494)class005002.R((class07290)class00515.field_12294, class07209.field_10980)) && class005002.Y().W();
    }

    protected boolean y(class00500 class005002, class00500 class005003, class07211 class072112) {
        return false;
    }

    protected int y(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return 0;
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
    }

    protected float y(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.W(class072902, class072092) ? 0.2f : 1.0f;
    }

    public static <B extends class00891> MapCodec<B> y(Function<class01362, B> function) {
        return RecordCodecBuilder.mapCodec(instance -> instance.group(class01354.t()).apply((Applicative)instance, function));
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.I ? class005002.R(class072902, class072092) : class00389.N();
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
    }

    protected abstract MapCodec<? extends class00891> N();

    protected float N(class00500 class005002, class08036 class080362, class07290 class072902, class07209 class072092) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class080362, class072902, class072092, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueF();
        }
        float f = class005002.i(class072902, class072092);
        if (f == -1.0f) {
            return 0.0f;
        }
        int n = class080362.method_7305(class005002) ? 30 : 100;
        return class080362.method_7351(class005002) / f / (float)n;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06584 class065842, boolean bl) {
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return class00389.y();
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class07049 class070492) {
        return class00389.y();
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
    }

    protected void N(class07299 class072992, class00500 class005002, class06183 class061832, class08005 class080052) {
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return new class06584((class07310)this.B());
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        switch (class087912) {
            case field_50: {
                return !class005002.W((class07290)class00515.field_12294, class07209.field_10980);
            }
            case field_48: {
                return class005002.Y().N(class01231.N);
            }
            case field_51: {
                return !class005002.W((class07290)class00515.field_12294, class07209.field_10980);
            }
        }
        return false;
    }

    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return 0;
    }

    @class09956(N="entityInside")
    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
    }

    protected void N(class00500 class005002, class07284 class072842, class07209 class072092, int n, int n2) {
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        this.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692, null);
        return class005002;
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return class005002;
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002;
    }

    protected boolean N(class00500 class005002, class06942 class069422) {
        return class005002.d() && (class069422.method_8041().R() || !class069422.method_8041().N(this.B()));
    }

    protected boolean N(class00500 class005002, class04651 class046512) {
        return class005002.d() || !class005002.B();
    }

    protected List<class06584> N(class00500 class005002, class04160 class041602) {
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        class04162 class041622 = class041602.N(class06551.Z, (Object)class005002).N(class06925.j);
        return class041622.N().method_8503().yd().N(this.a.get()).N(class041622);
    }

    protected boolean N(class00500 class005002, class07299 class072992, class07209 class072092, int n, int n2) {
        return false;
    }

    protected boolean N(class00500 class005002) {
        return false;
    }

    public class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        return class07082.R;
    }

    private void N(class00500 class005002, class08036 class080362, class07290 class072902, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_6tor1_4_7)) {
            float f = class005002.i(class072902, class072092);
            if (f == -1.0f) {
                callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.0f));
            } else if (!class080362.method_7305(class005002)) {
                callbackInfoReturnable.setReturnValue((Object)Float.valueOf(1.0f / f / 100.0f));
            } else {
                callbackInfoReturnable.setReturnValue((Object)Float.valueOf(class080362.method_7351(class005002) / f / 30.0f));
            }
        }
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        return class07082.i;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
    }

    private void N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692, CallbackInfoReturnable callbackInfoReturnable) {
        this.lithium$handleShapeUpdate(class054872, class005002, class072092, class072093, class005003);
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return 0;
    }

    protected @Nullable class06237 N(class00500 class005002, class07299 class072992, class07209 class072092) {
        return null;
    }

    protected long N(class00500 class005002, class07209 class072092) {
        return class04995.N((class00753)class072092);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class07307 class073072, BiConsumer<class06584, class07209> biConsumer) {
        if (class005002.P() || class073072.y() == class07302.field_47331) {
            return;
        }
        class00891 class008912 = class005002.i();
        boolean bl = class073072.L() instanceof class08036;
        if (class008912.N(class073072)) {
            class00394 class003942 = class005002.k() ? class047822.method_8321(class072092) : null;
            class04160 class041602 = new class04160(class047822).N(class06551.B, (Object)class06889.y((class00753)class072092)).N(class06551.U, (Object)class06584.E).y(class06551.z, (Object)class003942).y(class06551.N, (Object)class073072.u());
            if (class073072.y() == class07302.field_40879) {
                class041602.N(class06551.E, (Object)Float.valueOf(class073072.i()));
            }
            class005002.N(class047822, class072092, class06584.E, bl);
            class005002.N(class041602).forEach(class065842 -> biConsumer.accept((class06584)class065842, class072092));
        }
        class047822.method_8652(class072092, class00869.N.W(), 3);
        class008912.N_5(class047822, class072092, class073072);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return true;
    }

    protected boolean a_(class00500 class005002) {
        return false;
    }

    protected boolean a_(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class00891.N((class00494)class005002.M(class072902, class072092));
    }

    protected void a_(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362) {
    }

    protected float G() {
        return 0.25f;
    }

    public float Y() {
        return this.X.M;
    }

    protected class06898 d_(class00500 class005002) {
        return class06898.field_11458;
    }

    protected boolean i_(class00500 class005002) {
        return false;
    }

    protected class00494 b_(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class00389.N();
    }

    protected int b_(class00500 class005002) {
        if (class005002.t()) {
            return 15;
        }
        return class005002.Z() ? 0 : 1;
    }

    protected boolean e_(class00500 class005002) {
        return this.o;
    }

    public /* synthetic */ boolean callHasRandomTicks(class00500 class005002) {
        return this.e_(class005002);
    }

    public class03767 method_45322() {
        return this.c;
    }
}

