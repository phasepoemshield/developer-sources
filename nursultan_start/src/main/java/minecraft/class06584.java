/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10623
 *  Nursultan.class10625
 *  Nursultan.class11383
 *  Nursultan.class11938
 *  baritone.api.utils.accessor.IItemStack
 *  com.google.common.collect.Lists
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalIntRef
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.viaversion.viafabricplus.features.item.r1_14_4_enchantment_tooltip.Enchantments1_14_4
 *  com.viaversion.viafabricplus.injection.access.item.attack_damage.IDisplayDefault
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.util.ItemUtil
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.Protocol1_21_4To1_21_5
 *  minecraft.class00380
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00500
 *  minecraft.class00679
 *  minecraft.class00717
 *  minecraft.class00743
 *  minecraft.class01194
 *  minecraft.class01235
 *  minecraft.class01929
 *  minecraft.class02204
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02477
 *  minecraft.class02480
 *  minecraft.class02484
 *  minecraft.class02509
 *  minecraft.class02666
 *  minecraft.class02678
 *  minecraft.class02694
 *  minecraft.class02695
 *  minecraft.class02700
 *  minecraft.class02706
 *  minecraft.class02710
 *  minecraft.class02764
 *  minecraft.class02831
 *  minecraft.class02833
 *  minecraft.class02834
 *  minecraft.class02854
 *  minecraft.class03220
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class03767
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04506
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class04830
 *  minecraft.class04995
 *  minecraft.class05018
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05442
 *  minecraft.class05487
 *  minecraft.class06244
 *  minecraft.class06338
 *  minecraft.class06495
 *  minecraft.class06497
 *  minecraft.class06501
 *  minecraft.class06646
 *  minecraft.class06912
 *  minecraft.class06937
 *  minecraft.class07001
 *  minecraft.class07041
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07072
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07304
 *  minecraft.class07310
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07468
 *  minecraft.class07471
 *  minecraft.class07709
 *  minecraft.class07741
 *  minecraft.class08036
 *  minecraft.class08153
 *  minecraft.class08174
 *  minecraft.class08186
 *  minecraft.class08197
 *  minecraft.class08208
 *  minecraft.class08209
 *  minecraft.class08562
 *  minecraft.class08609
 *  minecraft.class08721
 *  minecraft.class08725
 *  minecraft.class08983
 *  net.caffeinemc.mods.lithium.common.util.change_tracking.ChangePublisher
 *  net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber
 *  net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber$CountChangeSubscriber
 *  net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber$EnchantmentSubscriber
 *  net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber$Multi
 *  net.caffeinemc.mods.lithium.mixin.util.accessors.ItemStackAccessor
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback
 *  net.fabricmc.fabric.api.event.player.ItemEvents
 *  net.fabricmc.fabric.api.event.player.ItemEvents$UseCallback
 *  net.fabricmc.fabric.api.event.player.ItemEvents$UseOnCallback
 *  net.fabricmc.fabric.api.item.v1.CustomDamageHandler
 *  net.fabricmc.fabric.api.item.v1.FabricItemStack
 *  net.fabricmc.fabric.impl.item.ComponentTooltipAppenderRegistryImpl
 *  net.fabricmc.fabric.impl.item.ItemExtensions
 *  net.fabricmc.fabric.impl.item.VanillaTooltipAppenderOrder
 *  org.apache.commons.lang3.function.TriConsumer
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  squeek.appleskin.client.TooltipOverlayHandler
 */
package minecraft;

import Nursultan.class10623;
import Nursultan.class10625;
import Nursultan.class11383;
import Nursultan.class11938;
import baritone.api.utils.accessor.IItemStack;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.viaversion.viafabricplus.features.item.r1_14_4_enchantment_tooltip.Enchantments1_14_4;
import com.viaversion.viafabricplus.injection.access.item.attack_damage.IDisplayDefault;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.util.ItemUtil;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.Protocol1_21_4To1_21_5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import minecraft.class00380;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00500;
import minecraft.class00679;
import minecraft.class00717;
import minecraft.class00743;
import minecraft.class01194;
import minecraft.class01235;
import minecraft.class01929;
import minecraft.class02204;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02477;
import minecraft.class02480;
import minecraft.class02484;
import minecraft.class02509;
import minecraft.class02666;
import minecraft.class02678;
import minecraft.class02694;
import minecraft.class02695;
import minecraft.class02700;
import minecraft.class02706;
import minecraft.class02710;
import minecraft.class02764;
import minecraft.class02831;
import minecraft.class02833;
import minecraft.class02834;
import minecraft.class02854;
import minecraft.class03220;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04506;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class04830;
import minecraft.class04995;
import minecraft.class05018;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05442;
import minecraft.class05487;
import minecraft.class06244;
import minecraft.class06338;
import minecraft.class06495;
import minecraft.class06497;
import minecraft.class06501;
import minecraft.class06509;
import minecraft.class06541;
import minecraft.class06557;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06591;
import minecraft.class06646;
import minecraft.class06912;
import minecraft.class06937;
import minecraft.class07001;
import minecraft.class07041;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07072;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07304;
import minecraft.class07310;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07468;
import minecraft.class07471;
import minecraft.class07709;
import minecraft.class07741;
import minecraft.class08036;
import minecraft.class08153;
import minecraft.class08174;
import minecraft.class08186;
import minecraft.class08197;
import minecraft.class08208;
import minecraft.class08209;
import minecraft.class08562;
import minecraft.class08609;
import minecraft.class08721;
import minecraft.class08725;
import minecraft.class08983;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangePublisher;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber;
import net.caffeinemc.mods.lithium.mixin.util.accessors.ItemStackAccessor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.fabric.api.event.player.ItemEvents;
import net.fabricmc.fabric.api.item.v1.CustomDamageHandler;
import net.fabricmc.fabric.api.item.v1.FabricItemStack;
import net.fabricmc.fabric.impl.item.ComponentTooltipAppenderRegistryImpl;
import net.fabricmc.fabric.impl.item.ItemExtensions;
import net.fabricmc.fabric.impl.item.VanillaTooltipAppenderOrder;
import org.apache.commons.lang3.function.TriConsumer;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import squeek.appleskin.client.TooltipOverlayHandler;

@Environment(value=EnvType.CLIENT)
public final class class06584
implements class02700,
IItemStack,
ChangePublisher,
ChangeSubscriber,
ItemStackAccessor,
FabricItemStack {
    private static final List<class00392> m = List.of(class00392.L((String)"item.op_warning.line1").N(new class06541[]{class06541.field_1061, class06541.field_1067}), class00392.L((String)"item.op_warning.line2").N(class06541.field_1061), class00392.L((String)"item.op_warning.line3").N(class06541.field_1061));
    private static final class00392 P = class00392.L((String)"item.unbreakable").N(class06541.field_1078);
    private static final class00392 s = class00392.L((String)"item.intangible").N(class06541.field_1080);
    public static final MapCodec<class06584> N = MapCodec.recursive((String)"ItemStack", codec -> RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06581.u.fieldOf("id").forGetter(class06584::Z), (App)class06338.N((int)1, (int)99).fieldOf("count").orElse((Object)1).forGetter(class06584::c), (App)class02678.y.optionalFieldOf("components", (Object)class02678.N).forGetter(class065842 -> class065842.W.M())).apply(instance, class06584::new)));
    public static final Codec<class06584> y = Codec.lazyInitialized(() -> N.codec());
    public static final Codec<class06584> L = Codec.lazyInitialized(() -> RecordCodecBuilder.create(instance -> instance.group((App)class06581.u.fieldOf("id").forGetter(class06584::Z), (App)class02678.y.optionalFieldOf("components", (Object)class02678.N).forGetter(class065842 -> class065842.W.M())).apply(instance, (class035562, class026782) -> new class06584((class03556<class06581>)class035562, 1, (class02678)class026782))));
    public static final Codec<class06584> u = y.validate(class06584::N);
    public static final Codec<class06584> i = L.validate(class06584::N);
    public static final Codec<class06584> R = class06338.M(y).xmap(optional -> optional.orElse(E), class065842 -> class065842.R() ? Optional.empty() : Optional.of(class065842));
    public static final Codec<class06584> M = class06581.u.xmap(class06584::new, class06584::Z);
    public static final class02362<class04247, class06584> B = class06584.y((class02362<class04247, class02678>)class02678.L);
    public static final class02362<class04247, class06584> Z = class06584.y((class02362<class04247, class02678>)class02678.u);
    public static final class02362<class04247, class06584> z = new class06557();
    public static final class02362<class04247, List<class06584>> U = B.N_33(class02389.N(class00743::method_37434));
    private static final Logger T = LogUtils.getLogger();
    public static final class06584 E = new class06584((Void)null);
    private static final class00392 b = class00392.L((String)"item.disabled").N(class06541.field_1061);
    private int j;
    private int v;
    @Deprecated
    private final @Nullable class06581 n;
    public final class02509 W;
    private @Nullable class07049 t;
    private int G;
    private ChangeSubscriber l;
    private int d;

    public @Nullable class00392 w() {
        String string;
        class00392 class003922 = (class00392)this.method_58694(class02484.B);
        if (class003922 != null) {
            return class003922;
        }
        class02706 class027062 = (class02706)this.method_58694(class02484.NL);
        if (class027062 != null && !class05018.B((String)(string = (String)class027062.u().N()))) {
            return class00392.y((String)string);
        }
        return null;
    }

    public static boolean L(class06584 class065842, class06584 class065843) {
        if (!class065842.N(class065843.B())) {
            return false;
        }
        if (class065842.R() && class065843.R()) {
            return true;
        }
        return Objects.equals(class065842.W, class065843.W);
    }

    public class06584 L(int n) {
        if (this.R()) {
            return E;
        }
        class06584 class065842 = this.t();
        class065842.i(n);
        return class065842;
    }

    public class02695 L() {
        return !this.R() ? this.B().R() : class02695.N;
    }

    public boolean L(class06584 class065842) {
        class02764 class027642 = (class02764)this.method_58694(class02484.q);
        return class027642 != null && class027642.N(class065842);
    }

    public void M(int n) {
        this.i(this.c() + n);
    }

    public class06584 M() {
        if (this.R()) {
            return E;
        }
        class06584 class065842 = this.t();
        this.i(0);
        return class065842;
    }

    public int P() {
        return class04995.N((int)((Integer)this.a_(class02484.i, 0)), (int)0, (int)this.s());
    }

    public @Nullable class07049 K() {
        return !this.R() ? this.t : null;
    }

    public boolean T() {
        return this.W() && this.P() >= this.s();
    }

    public boolean Q() {
        Boolean bl = (Boolean)this.method_58694(class02484.G);
        if (bl != null) {
            return bl;
        }
        return this.B().L(this);
    }

    public class06584(class07310 class073102) {
        this(class073102, 1);
    }

    public class06584(class03556<class06581> class035562, int n, class02678 class026782) {
        this((class07310)class035562.N(), n, class02509.N((class02695)((class06581)class035562.N()).R(), (class02678)class026782));
    }

    public class06584(class03556<class06581> class035562) {
        this((class07310)class035562.N(), 1);
    }

    private class06584(@Nullable Void void_) {
        this.n = null;
        this.W = new class02509(class02695.N);
    }

    public class06584(class07310 class073102, int n) {
        this(class073102, n, new class02509(class073102.B().R()));
    }

    public class06584(class03556<class06581> class035562, int n) {
        this((class07310)class035562.N(), n);
    }

    private class06584(class07310 class073102, int n, class02509 class025092) {
        this.n = class073102.B();
        this.j = n;
        this.W = class025092;
    }

    public String toString() {
        return this.c() + " " + String.valueOf(this.B());
    }

    public void B(int n) {
        this.M(-n);
    }

    public class06581 B() {
        return this.R() ? class06570.N : this.n;
    }

    private void F() {
        ((ChangePublisher)this.W).lithium$subscribe((ChangeSubscriber)this, 0);
    }

    public boolean I() {
        return !((class02710)this.a_(class02484.P, class02710.N)).u();
    }

    public class02710 J() {
        return (class02710)this.a_(class02484.P, class02710.N);
    }

    public class03556<class06581> Z() {
        return this.B().i();
    }

    public class00392 V() {
        class05216 class052162 = class00392.i().y(this.d());
        if (this.L(class02484.B)) {
            class052162.N(class06541.field_1056);
        }
        class05216 class052163 = class00390.N((class00392)class052162);
        if (!this.R()) {
            class052163.N(this.O().N()).N(class004052 -> class004052.N((class00395)new class00380(this)));
        }
        return class052163;
    }

    public class08186 e() {
        return (class08186)this.a_(class02484.a, class08186.N);
    }

    private static /* synthetic */ Optional i(class06584 class065842) {
        return class065842.R() ? Optional.empty() : Optional.of(class065842);
    }

    public class02695 i() {
        return !this.R() ? this.W.Z() : class02695.N;
    }

    public void i(int n) {
        this.N(n, (CallbackInfo)null);
        this.j = n;
    }

    public boolean b() {
        return this.W() && this.P() >= this.s() - 1;
    }

    public int s() {
        return (Integer)this.a_(class02484.u, 0);
    }

    public int c() {
        return this.R() ? 0 : this.j;
    }

    public int n() {
        return this.B().z(this);
    }

    public boolean l() {
        return this.B().M(this);
    }

    public class00392 d() {
        class00392 class003922 = this.w();
        if (class003922 != null) {
            return class003922;
        }
        return this.k();
    }

    public boolean m() {
        return this.W() && this.P() > 0;
    }

    public boolean o() {
        return this.t instanceof class00679;
    }

    private void p() {
        this.G = this.n == null ? -1 : this.n.hashCode() + this.P();
    }

    public class00392 k() {
        return this.B().N(this);
    }

    public class06584 t() {
        if (this.R()) {
            return E;
        }
        class06584 class065842 = new class06584(this.B(), this.j, this.W.B());
        class065842.u(this.H());
        return class065842;
    }

    public boolean g() {
        if (!this.L(class02484.J)) {
            return false;
        }
        class02710 class027102 = (class02710)this.method_58694(class02484.P);
        return class027102 != null && class027102.u();
    }

    public int v() {
        return this.B().Z(this);
    }

    public boolean j() {
        return this.B().B(this);
    }

    public @Nullable class00679 q() {
        return this.t instanceof class00679 ? (class00679)this.K() : null;
    }

    public int U() {
        return (Integer)this.a_(class02484.L, 1);
    }

    public Stream<class03530<class06581>> z() {
        return this.B().i().L();
    }

    public class02678 u() {
        return !this.R() ? this.W.M() : class02678.N;
    }

    public void u(int n) {
        this.v = n;
    }

    private class02477 y(class02477 class024772, class06591 class065912, class08562 class085622, class06497 class064972, Consumer consumer, LocalIntRef localIntRef) {
        this.N(class024772, class065912, class085622, consumer, class064972, localIntRef);
        return class024772;
    }

    public void y(class02678 class026782) {
        this.W.N(class026782);
    }

    public <T> @Nullable T y(class02477<? extends T> class024772) {
        return (T)this.W.L(class024772);
    }

    public static int y(@Nullable class06584 class065842) {
        if (class065842 != null) {
            int n = 31 + class065842.B().hashCode();
            return 31 * n + class065842.y().hashCode();
        }
        return 0;
    }

    private static /* synthetic */ class06584 y(Optional optional) {
        return optional.orElse(E);
    }

    private void y(class06591 class065912, @Nullable class08036 class080362, class06497 class064972, CallbackInfoReturnable callbackInfoReturnable) {
        ((ItemTooltipCallback)ItemTooltipCallback.EVENT.invoker()).getTooltip(this, class065912, class064972, (List)callbackInfoReturnable.getReturnValue());
    }

    private static class02362<class04247, class06584> y(class02362<class04247, class02678> class023622) {
        return new class10625(class023622);
    }

    public class06584 y(int n, @Nullable class07438 class074382) {
        class06584 class065842 = this.L(n);
        this.N(n, class074382);
        return class065842;
    }

    public void y(class07299 class072992, class07438 class074382, int n) {
        class08174 class081742;
        class08209 class082092 = (class08209)this.method_58694(class02484.w);
        if (class082092 != null && class082092.N(n)) {
            class082092.N(class074382.method_59922(), class074382, this, 5);
        }
        if ((class081742 = (class08174)this.method_58694(class02484.X)) != null && !class072992.method_8608()) {
            class081742.N(this, n, class074382, class074382.method_6058().N());
            return;
        }
        this.B().N(class072992, class074382, this, n);
    }

    public boolean y(class06646 class066462) {
        class03220 class032202 = (class03220)this.method_58694(class02484.T);
        return class032202 != null && class032202.N(class066462);
    }

    public void lithium$notify(class02509 class025092, int n) {
        if (class025092 != this.W) {
            throw new IllegalStateException("Invalid publisher, expected " + String.valueOf(this.W) + " but got " + String.valueOf(class025092));
        }
        if (this.l != null) {
            this.l.lithium$notify((Object)this, this.d);
        }
    }

    public void y(class02695 class026952) {
        this.W.N(class026952);
    }

    public class02695 y() {
        return !this.R() ? this.W : class02695.N;
    }

    public static boolean y(class06584 class065842, class06584 class065843) {
        return class065842.N(class065843.B());
    }

    private void y(class06591 class065912, class08562 class085622, @Nullable class08036 class080362, class06497 class064972, Consumer consumer, CallbackInfo callbackInfo, LocalIntRef localIntRef) {
        this.N(null, class065912, class085622, consumer, class064972, localIntRef);
    }

    private class06584 y(class07310 class073102, int n) {
        return new class06584((class03556<class06581>)class073102.B().i(), n, this.W.M());
    }

    public void y(int n) {
        this.N(class02484.i, Integer.valueOf(class04995.N((int)n, (int)0, (int)this.s())));
        this.N((CallbackInfo)null);
    }

    public void y(class07438 class074382, class07438 class074383) {
        this.B().y(this, class074382, class074383);
        class08609 class086092 = (class08609)this.method_58694(class02484.g);
        if (class086092 != null) {
            this.N(class086092.N(), class074383, class07085.field_6173);
        }
    }

    public boolean y(class00500 class005002) {
        return this.B().y(this, class005002);
    }

    public boolean E() {
        return this.U() > 1 && (!this.W() || !this.m());
    }

    private boolean N(class06581 class065812, class06584 class065842, class06591 class065912, class08562 class085622, Consumer consumer, class06497 class064972) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            class07001 class070012 = ItemUtil.getTagOrNull((class06584)this);
            class07001 class070013 = class070012 == null ? null : class070012.m(ItemUtil.vvNbtName(Protocol1_21_4To1_21_5.class, (String)"backup"));
            return class070013 == null || !class070013.y("hide_additional_tooltip");
        }
        return true;
    }

    public void N(class00717 class007172) {
        this.B().N(class007172);
    }

    private void N(CallbackInfo callbackInfo) {
        this.p();
    }

    public boolean N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362) {
        return this.B().N(this, class005002, class072992, class072092, (class07438)class080362);
    }

    private void N(class02477 class024772, Object object, CallbackInfoReturnable callbackInfoReturnable) {
        ChangeSubscriber changeSubscriber;
        if (class024772 == class02484.P && (changeSubscriber = this.l) instanceof ChangeSubscriber.EnchantmentSubscriber) {
            ((ChangeSubscriber.EnchantmentSubscriber)changeSubscriber).lithium$notifyAfterEnchantmentChange((Object)this, this.d);
        }
    }

    public boolean N(class07072 class070722) {
        class08721 class087212 = (class08721)this.method_58694(class02484.Q);
        return class087212 == null || !class087212.N(class070722);
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        class11383 class113832 = class11383.N((class06584)this);
        class11938.L().L((Object)class113832);
    }

    private void N(Consumer consumer, class08562 class085622, class08036 class080362, CallbackInfo callbackInfo) {
        class06584 class065842 = this;
        ((IDisplayDefault)class02831.N()).viaFabricPlus$setItemEnchantments(class07323.y((class06584)class065842));
    }

    private void N(class06591 class065912, class08562 class085622, @Nullable class08036 class080362, class06497 class064972, Consumer consumer, CallbackInfo callbackInfo, LocalIntRef localIntRef) {
        this.N(class02484.b, class065912, class085622, consumer, class064972, localIntRef);
    }

    private void N(class06584 class065842, int n, class04782 class047822, class04770 class047702, Consumer consumer, Operation operation, class07438 class074382, class07085 class070852) {
        CustomDamageHandler customDamageHandler = ((ItemExtensions)this.B()).fabric_getCustomDamageHandler();
        if (customDamageHandler != null && !class074382.method_56992()) {
            MutableBoolean mutableBoolean = new MutableBoolean(false);
            n = customDamageHandler.damage(this, n, class074382, class070852, () -> {
                mutableBoolean.setTrue();
                this.B(1);
                consumer.accept(this.B());
            });
            if (mutableBoolean.booleanValue()) {
                return;
            }
        }
        operation.call(new Object[]{class065842, n, class047822, class047702, consumer});
    }

    private void N(class06584 class065842, int n, class04782 class047822, class04770 class047702, Consumer consumer, Operation operation, LocalRef localRef, LocalRef localRef2) {
        this.N(class065842, n, class047822, class047702, consumer, operation, (class07438)localRef.get(), (class07085)localRef2.get());
    }

    private class02477 N(class02477 class024772, class06591 class065912, class08562 class085622, class06497 class064972, Consumer consumer, LocalIntRef localIntRef) {
        this.N(class024772, class065912, class085622, consumer, class064972, localIntRef);
        return class024772;
    }

    private void N(class02477 class024772, class06591 class065912, class08562 class085622, Consumer consumer, class06497 class064972, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_14_4)) {
            return;
        }
        class07001 class070012 = ItemUtil.getTagOrNull((class06584)this);
        if (class070012 == null) {
            return;
        }
        if (class024772 == class02484.P) {
            this.N("Enchantments", class070012, class065912, consumer);
            callbackInfo.cancel();
        } else if (class024772 == class02484.p) {
            this.N("StoredEnchantments", class070012, class065912, consumer);
            callbackInfo.cancel();
        }
    }

    private class07082 N(class06581 class065812, class07299 class072992, class08036 class080362, class07050 class070502, Operation operation) {
        class07082 class070822 = ((ItemEvents.UseCallback)ItemEvents.USE.invoker()).use(class072992, class080362, class070502);
        if (class070822 != null) {
            return class070822;
        }
        return (class07082)operation.call(new Object[]{class065812, class072992, class080362, class070502});
    }

    private class07082 N(class06581 class065812, class06501 class065012, Operation operation) {
        class07082 class070822 = ((ItemEvents.UseOnCallback)ItemEvents.USE_ON.invoker()).useOn(class065012);
        if (class070822 != null) {
            return class070822;
        }
        return (class07082)operation.call(new Object[]{class065812, class065012});
    }

    private void N(String string, class07001 class070012, class06591 class065912, Consumer consumer) {
        class01929 class019292 = class065912.N();
        class07741 class077412 = class070012.P(string).orElse(null);
        if (class077412 == null) {
            return;
        }
        Iterator iterator = class077412.iterator();
        while (iterator.hasNext()) {
            class07001 class070013 = (class07001)((class07709)iterator.next());
            Enchantments1_14_4.getOrEmpty((String)class070013.y("id", "")).ifPresent(class059462 -> {
                int n = class070013.y("lvl", 0);
                if (class019292 != null) {
                    class019292.y(class04227.yR).N(class059462).ifPresent(class035292 -> consumer.accept(class07304.N((class03556)class035292, (int)class04995.N((int)n, (int)Short.MIN_VALUE, (int)Short.MAX_VALUE))));
                }
            });
        }
    }

    public void N(int n, @Nullable class07438 class074382) {
        if (class074382 == null || !class074382.method_56992()) {
            this.B(n);
        }
    }

    private void N(int n, CallbackInfo callbackInfo) {
        if (n != this.j) {
            ChangeSubscriber changeSubscriber = this.l;
            if (changeSubscriber instanceof ChangeSubscriber.CountChangeSubscriber) {
                ((ChangeSubscriber.CountChangeSubscriber)changeSubscriber).lithium$notifyCount((Object)this, this.d, n);
            }
            if (n == 0) {
                ((ChangePublisher)this.W).lithium$unsubscribe((ChangeSubscriber)this);
                if (this.l != null) {
                    this.l.lithium$forceUnsubscribe((Object)this, this.d);
                    this.l = null;
                    this.d = 0;
                }
            }
        }
    }

    public void lithium$forceUnsubscribe(class02509 class025092, int n) {
        if (class025092 != this.W) {
            throw new IllegalStateException("Invalid publisher, expected " + String.valueOf(this.W) + " but got " + String.valueOf(class025092));
        }
        this.l.lithium$forceUnsubscribe((Object)this, this.d);
        this.l = null;
        this.d = 0;
    }

    private void N(class06591 class065912, class08036 class080362, class06497 class064972, CallbackInfoReturnable callbackInfoReturnable) {
        if (TooltipOverlayHandler.INSTANCE != null) {
            TooltipOverlayHandler.INSTANCE.onItemTooltip(this, class080362, class065912, class064972, (List)callbackInfoReturnable.getReturnValue());
        }
    }

    public class07072 N(class07438 class074382, Supplier<class07072> supplier) {
        return Optional.ofNullable((class02204)this.method_58694(class02484.z)).flatMap(class022042 -> class022042.N((class01929)class074382.method_56673())).map(class035562 -> new class07072(class035562, (class07049)class074382)).or(() -> Optional.ofNullable(this.B().N(class074382))).orElseGet(supplier);
    }

    private void N(@Nullable class02477 class024772, class06591 class065912, class08562 class085622, Consumer consumer, class06497 class064972, LocalIntRef localIntRef) {
        class02477 class024773;
        if (!ComponentTooltipAppenderRegistryImpl.hasModdedEntries()) {
            return;
        }
        if (localIntRef.get() == 0) {
            ComponentTooltipAppenderRegistryImpl.onFirst((class06584)this, (class06591)class065912, (class08562)class085622, (Consumer)consumer, (class06497)class064972);
        }
        List list = VanillaTooltipAppenderOrder.getVanillaOrder();
        if (localIntRef.get() > list.size()) {
            return;
        }
        do {
            HashSet<class02477> hashSet;
            if (localIntRef.get() > 0) {
                class024773 = (class02477)list.get(localIntRef.get() - 1);
                hashSet = new HashSet<class02477>();
                hashSet.add(class024773);
                ComponentTooltipAppenderRegistryImpl.onAfter((class06584)this, (class02477)class024773, (class06591)class065912, (class08562)class085622, (Consumer)consumer, (class06497)class064972, hashSet);
            }
            if (localIntRef.get() == list.size()) {
                localIntRef.set(localIntRef.get() + 1);
                break;
            }
            class024773 = (class02477)list.get(localIntRef.get());
            hashSet = new HashSet();
            hashSet.add(class024773);
            ComponentTooltipAppenderRegistryImpl.onBefore((class06584)this, (class02477)class024773, (class06591)class065912, (class08562)class085622, (Consumer)consumer, (class06497)class064972, hashSet);
            localIntRef.set(localIntRef.get() + 1);
        } while (class024773 != class024772);
        if (class024772 == null) {
            ComponentTooltipAppenderRegistryImpl.onLast((class06584)this, (class06591)class065912, (class08562)class085622, (Consumer)consumer, (class06497)class064972);
        }
    }

    private boolean N(boolean bl, class06591 class065912, class08562 class085622, @Nullable class08036 class080362, class06497 class064972, Consumer consumer, LocalIntRef localIntRef) {
        if (!bl) {
            this.N(null, class065912, class085622, consumer, class064972, localIntRef);
        }
        return bl;
    }

    public static DataResult<class06584> N(class06584 class065842) {
        DataResult<class06244> dataResult = class06584.N(class065842.y());
        if (dataResult.isError()) {
            return dataResult.map(class062442 -> class065842);
        }
        if (class065842.c() > class065842.U()) {
            return DataResult.error(() -> "Item stack with stack size of " + class065842.c() + " was larger than maximum: " + class065842.U());
        }
        return DataResult.success((Object)class065842);
    }

    public void N(int n, class07438 class074382, class07050 class070502) {
        this.N(n, class074382, class070502.N());
    }

    public void N(int n, class07438 class074382, class07085 class070852) {
        class07299 class072992 = class074382.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class07299 class072993 = class074382 instanceof class04770 ? (class072992 = (class04770)class074382) : null;
            Consumer<class06581> consumer = class065812 -> class074382.method_20235(class065812, class070852);
            class07299 class072994 = class072993;
            class04782 class047823 = class047822;
            int n2 = n;
            class06584 class065842 = this;
            Operation operation = objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)5, (String)"[net.minecraft.class_1799, int, net.minecraft.class_3218, net.minecraft.class_3222, java.util.function.Consumer]");
                Object[] objectArray2 = objectArray;
                ((class06584)objectArray[0]).N((int)((Integer)objectArray2[1]), (class04782)objectArray2[2], (class04770)objectArray2[3], (Consumer<class06581>)((Consumer)objectArray2[4]));
                return null;
            };
            LocalRefImpl localRefImpl = new LocalRefImpl();
            LocalRefImpl localRefImpl2 = new LocalRefImpl();
            localRefImpl.init((Object)class074382);
            localRefImpl2.init((Object)class070852);
            this.N(class065842, n2, class047823, (class04770)class072994, consumer, operation, (LocalRef)localRefImpl, (LocalRef)localRefImpl2);
            class070852 = (class07085)localRefImpl2.dispose();
            class074382 = (class07438)localRefImpl.dispose();
        }
    }

    public class06584 N(int n, class07310 class073102, class07438 class074382, class07085 class070852) {
        this.N(n, class074382, class070852);
        if (this.R()) {
            class06584 class065842 = this.y(class073102, 1);
            if (class065842.W()) {
                class065842.y(0);
            }
            return class065842;
        }
        return this;
    }

    public boolean N(class06937 class069372, class05442 class054422, class08036 class080362) {
        return this.B().N(this, class069372, class054422, class080362);
    }

    public void N(int n, class04782 class047822, @Nullable class04770 class047702, Consumer<class06581> consumer) {
        int n2 = this.N(n, class047822, class047702);
        if (n2 != 0) {
            this.N(this.P() + n2, class047702, consumer);
        }
    }

    private int N(int n, class04782 class047822, @Nullable class04770 class047702) {
        if (!this.W()) {
            return 0;
        }
        if (class047702 != null && class047702.method_56992()) {
            return 0;
        }
        if (n > 0) {
            return class07323.N((class04782)class047822, (class06584)this, (int)n);
        }
        return n;
    }

    private void N(int n, @Nullable class04770 class047702, Consumer<class06581> consumer) {
        if (class047702 != null) {
            class06912.n.N(class047702, this, n);
        }
        this.y(n);
        if (this.T()) {
            class06581 class065812 = this.B();
            this.B(1);
            consumer.accept(class065812);
        }
    }

    public void N(int n, class08036 class080362) {
        if (class080362 instanceof class04770) {
            class04770 class047702 = (class04770)class080362;
            int n2 = this.N(n, class047702.method_51469(), class047702);
            if (n2 == 0) {
                return;
            }
            int n3 = Math.min(this.P() + n2, this.s() - 1);
            this.N(n3, class047702, (class06581 class065812) -> {});
        }
    }

    public class06584 N(class07310 class073102) {
        return this.N(class073102, this.c());
    }

    public class06584 N(class07310 class073102, int n) {
        if (this.R()) {
            return E;
        }
        return this.y(class073102, n);
    }

    public static boolean N(class06584 class065842, class06584 class065843) {
        if (class065842 == class065843) {
            return true;
        }
        if (class065842.c() != class065843.c()) {
            return false;
        }
        return class06584.L(class065842, class065843);
    }

    @Deprecated
    public static boolean N(List<class06584> list, List<class06584> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); ++i) {
            if (class06584.N(list.get(i), list2.get(i))) continue;
            return false;
        }
        return true;
    }

    public boolean N(class06584 class065842, class06937 class069372, class05442 class054422, class08036 class080362, class04803 class048032) {
        return this.B().N(this, class065842, class069372, class054422, class080362, class048032);
    }

    public boolean N(class07438 class074382, class07438 class074383) {
        class06581 class065812 = this.B();
        class065812.N(this, class074382, class074383);
        if (this.L(class02484.g)) {
            if (class074383 instanceof class08036) {
                ((class08036)class074383).method_7259(class01235.L.y((Object)class065812));
            }
            return true;
        }
        return false;
    }

    public static class02362<class04247, class06584> N(class02362<class04247, class06584> class023622) {
        return new class10623(class023622);
    }

    public class07082 N(class08036 class080362, class07438 class074382, class07050 class070502) {
        class07082 class070822;
        class08725 class087252 = (class08725)this.method_58694(class02484.o);
        if (class087252 != null && class087252.z() && (class070822 = class087252.N(class080362, class074382, this)) != class07082.i) {
            return class070822;
        }
        return this.B().N(this, class080362, class074382, class070502);
    }

    public class06584 N(int n) {
        int n2 = Math.min(n, this.c());
        class06584 class065842 = this.L(n2);
        this.B(n2);
        return class065842;
    }

    public boolean N(class03530<class06581> class035302) {
        return this.B().i().N(class035302);
    }

    public boolean N(class06581 class065812) {
        return this.B() == class065812;
    }

    public boolean N(Predicate<class03556<class06581>> predicate) {
        return predicate.test((class03556<class06581>)this.B().i());
    }

    public Optional<class04830> N() {
        return this.B().U(this);
    }

    public boolean N(class02477<?> class024772) {
        return !this.R() && this.W.y(class024772);
    }

    public static DataResult<class06244> N(class02695 class026952) {
        if (class026952.N(class02484.u) && (Integer)class026952.a_(class02484.L, (Object)1) > 1) {
            return DataResult.error(() -> "Item cannot be both damageable and stackable");
        }
        for (class06584 class065842 : ((class02854)class026952.a_(class02484.NG, (Object)class02854.N)).u()) {
            int n;
            int n2 = class065842.c();
            if (n2 <= (n = class065842.U())) continue;
            return DataResult.error(() -> "Item stack with count of " + n2 + " was larger than maximum: " + n);
        }
        return DataResult.success((Object)class06244.field_17274);
    }

    public boolean N(class03767 class037672) {
        return this.R() || this.B().N(class037672);
    }

    public float N(class00500 class005002) {
        return this.B().N(this, class005002);
    }

    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class06584 class065842 = this.t();
        boolean bl = this.N((class07438)class080362) <= 0;
        class07050 class070503 = class070502;
        class08036 class080363 = class080362;
        class07299 class072993 = class072992;
        class06581 class065812 = this.B();
        class07082 class070822 = this.N(class065812, class072993, class080363, class070503, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)4, (String)"[net.minecraft.class_1792, net.minecraft.class_1937, net.minecraft.class_1657, net.minecraft.class_1268]");
            Object[] objectArray2 = objectArray;
            return ((class06581)objectArray[0]).N((class07299)objectArray2[1], (class08036)objectArray2[2], (class07050)objectArray2[3]);
        });
        if (bl && class070822 instanceof class07041) {
            class07041 class070412;
            return class070412.N((class070412 = (class07041)class070822).u() == null ? this.N((class07438)class080362, class065842) : class070412.u().N((class07438)class080362, class065842));
        }
        return class070822;
    }

    public class06584 N(class07299 class072992, class07438 class074382) {
        this.N((CallbackInfoReturnable)null);
        class06584 class065842 = this.t();
        return this.B().N(this, class072992, class074382).N(class074382, class065842);
    }

    private class06584 N(class07438 class074382, class06584 class065842) {
        class08197 class081972 = (class08197)class065842.method_58694(class02484.k);
        class08208 class082082 = (class08208)class065842.method_58694(class02484.Y);
        int n = class065842.c();
        class06584 class065843 = this;
        if (class081972 != null) {
            class065843 = class081972.N(class065843, n, class074382.method_56992(), arg_0 -> ((class07438)class074382).method_64399(arg_0));
        }
        if (class082082 != null) {
            class082082.N(class065842, class074382);
        }
        return class065843;
    }

    public class07082 N(class06501 class065012) {
        class08036 class080362 = class065012.method_8036();
        class07209 class072092 = class065012.method_8037();
        if (class080362 != null && !class080362.method_31549().i && !this.N(new class06646((class05487)class065012.method_8045(), class072092, false))) {
            return class07082.i;
        }
        class06581 class065812 = this.B();
        class06501 class065013 = class065012;
        class06581 class065813 = class065812;
        class07082 class070822 = this.N(class065813, class065013, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_1792, net.minecraft.class_1838]");
            return ((class06581)objectArray[0]).N((class06501)objectArray[1]);
        });
        if (class080362 != null && class070822 instanceof class07041 && ((class07041)class070822).L()) {
            class080362.method_7259(class01235.L.y((Object)class065812));
        }
        return class070822;
    }

    public boolean N(class03543<class06581> class035432) {
        return class035432.N(this.Z());
    }

    public boolean N(class03556<class06581> class035562) {
        return this.B().i() == class035562;
    }

    public <T> @Nullable T N(class02477<T> class024772, T t, UnaryOperator<T> unaryOperator) {
        Object object = this.a_(class024772, t);
        return this.N(class024772, unaryOperator.apply(object));
    }

    public void N(class02678 class026782) {
        class02678 class026783 = this.W.M();
        this.W.N(class026782);
        Optional optional = class06584.N(this).error();
        if (optional.isPresent()) {
            T.error("Failed to apply component patch '{}' to item: '{}'", (Object)class026782, (Object)((DataResult.Error)optional.get()).message());
            this.W.y(class026783);
        }
    }

    public void N(class07085 class070852, BiConsumer<class03556<class07468>, class07471> biConsumer) {
        ((class02833)this.a_(class02484.b, class02833.N)).N(class070852, biConsumer);
        class07323.N((class06584)this, (class07085)class070852, biConsumer);
    }

    public void N(class02834 class028342, TriConsumer<class03556<class07468>, class07471, class02831> triConsumer) {
        ((class02833)this.a_(class02484.b, class02833.N)).N(class028342, triConsumer);
        class07323.N((class06584)this, (class02834)class028342, (T class035562, U class074712) -> triConsumer.accept(class035562, class074712, (Object)class02831.N()));
    }

    public <T, U> @Nullable T N(class02477<T> class024772, T t, U u, BiFunction<T, U, T> biFunction) {
        return this.N(class024772, biFunction.apply(this.a_(class024772, t), u));
    }

    public <T> void N(class02477<T> class024772, class02666 class026662) {
        this.N(class024772, class026662.method_58694(class024772));
    }

    public <T> @Nullable T N(class02480<T> class024802) {
        return (T)this.W.N(class024802);
    }

    public <T extends class02694> void N(class02477<T> class024772, class06591 class065912, class08562 class085622, Consumer<class00392> consumer, class06497 class064972) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class024772, class065912, class085622, consumer, class064972, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class02694 class026942 = (class02694)this.method_58694(class024772);
        if (class026942 != null && class085622.N(class024772)) {
            class026942.N(class065912, consumer, class064972, (class02666)this.W);
        }
    }

    public List<class00392> N(class06591 class065912, @Nullable class08036 class080362, class06497 class064972) {
        class08562 class085622 = (class08562)this.a_(class02484.v, class08562.L);
        if (!class064972.y() && class085622.N()) {
            boolean bl = this.B().N(this, class080362);
            List<Object> list = bl ? m : List.of();
            CallbackInfoReturnable callbackInfoReturnable = list;
            callbackInfoReturnable = new CallbackInfoReturnable("", false, callbackInfoReturnable);
            this.N(class065912, class080362, class064972, callbackInfoReturnable);
            return list;
        }
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(this.Y());
        this.N(class065912, class085622, class080362, class064972, arrayList::add);
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = arrayList2;
        arrayList3 = new CallbackInfoReturnable("", false, (Object)arrayList3);
        this.N(class065912, class080362, class064972, (CallbackInfoReturnable)arrayList3);
        ArrayList arrayList4 = arrayList2;
        this.y(class065912, class080362, class064972, new CallbackInfoReturnable("", false, (Object)arrayList4));
        return arrayList2;
    }

    public void N(class06591 class065912, class08562 class085622, @Nullable class08036 class080362, class06497 class064972, Consumer<class00392> class064973) {
        int n;
        class03220 class032202;
        class03220 class032203;
        LocalIntRefImpl localIntRefImpl = new LocalIntRefImpl();
        localIntRefImpl.init(0);
        class06497 class064974 = class064972;
        class06497 class064975 = class064973;
        class08562 class085623 = class085622;
        class06591 class065913 = class065912;
        Object object = this;
        class06581 class065812 = this.B();
        if (this.N(class065812, (class06584)object, class065913, class085623, (Consumer)class064975, class064974)) {
            class065812.N((class06584)object, class065913, class085623, (Consumer<class00392>)class064975, class064974);
        }
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.NK;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.NZ;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.f;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.Nd;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.Nk;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.NG;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.Nv;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.Nt;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.NL;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.x;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.NT;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.Ns;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.h;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.NE;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.Nu;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.p;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.P;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.F;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.Nb;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.W;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        this.N(class065912, class085622, class080362, class064972, (Consumer)class064973, null, (LocalIntRef)localIntRefImpl);
        this.N((Consumer<class00392>)class064973, class085622, class080362);
        this.N(class02484.l, s, class085622, (Consumer<class00392>)class064973);
        this.N(class02484.R, P, class085622, (Consumer<class00392>)class064973);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.NU;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.NN;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.Nl;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        class064975 = class064972;
        class085623 = class064973;
        class065913 = class085622;
        object = class065912;
        class065812 = class02484.NR;
        this.N(this.N((class02477)class065812, class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl), (class06591)object, (class08562)class065913, (Consumer<class00392>)class085623, class064975);
        if ((this.N(class06570.Rb) || this.N(class06570.Yl)) && class085622.N(this.y((class02477)(class065812 = class02484.NB), class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl))) {
            class032203 = (class08983)this.method_58694(class02484.NB);
            class04506.N((class08983)class032203, (Consumer)class064973, (String)"SpawnData");
        }
        if ((class032203 = (class03220)this.method_58694(class02484.T)) != null && class085622.N(this.y((class02477)(class065812 = class02484.T), class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl))) {
            class064973.accept(class05220.N);
            class064973.accept(class03220.L);
            class032203.N((Consumer)class064973);
        }
        if ((class032202 = (class03220)this.method_58694(class02484.s)) != null && class085622.N(this.y((class02477)(class065812 = class02484.s), class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl))) {
            class064973.accept(class05220.N);
            class064973.accept(class03220.u);
            class032202.N((Consumer)class064973);
        }
        if (this.N(class064972.N(), class065912, class085622, class080362, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl)) {
            if (this.m() && class085622.N(this.y((class02477)(class065812 = class02484.i), class065912, class085622, class064972, (Consumer)class064973, (LocalIntRef)localIntRefImpl))) {
                class064973.accept(class00392.N((String)"item.durability", (Object[])new Object[]{this.s() - this.P(), this.s()}));
            }
            class06581 class065813 = this.B();
            this.y(class065912, class085622, class080362, class064972, (Consumer)class064973, null, (LocalIntRef)localIntRefImpl);
            class064973.accept(class00392.y((String)class04206.B.y((Object)class065813).toString()).N(class06541.field_1063));
            n = this.W.u();
            if (n > 0) {
                class064973.accept(class00392.N((String)"item.components", (Object[])new Object[]{n}).N(class06541.field_1063));
            }
        }
        if (class080362 != null && !this.B().N(class080362.method_73183().method_45162())) {
            class064973.accept(b);
        }
        if ((n = this.B().N(this, class080362)) != 0) {
            m.forEach(class064973);
        }
    }

    private void N(class02477<?> class024772, class00392 class003922, class08562 class085622, Consumer<class00392> consumer) {
        if (this.L(class024772) && class085622.N(class024772)) {
            consumer.accept(class003922);
        }
    }

    private void N(Consumer<class00392> consumer, class08562 class085622, @Nullable class08036 class080362) {
        this.N(consumer, class085622, class080362, null);
        if (!class085622.N(class02484.b)) {
            return;
        }
        for (class02834 class028342 : class02834.values()) {
            MutableBoolean mutableBoolean = new MutableBoolean(true);
            this.N(class028342, (TriConsumer<class03556<class07468>, class07471, class02831>)((TriConsumer)(class035562, class074712, class028312) -> {
                if (class028312 == class02831.y()) {
                    return;
                }
                if (mutableBoolean.isTrue()) {
                    consumer.accept(class05220.N);
                    consumer.accept((class00392)class00392.L((String)("item.modifiers." + class028342.method_15434())).N(class06541.field_1080));
                    mutableBoolean.setFalse();
                }
                class028312.N(consumer, class080362, class035562, class074712);
            }));
        }
    }

    public void N(class03556<class07304> class035562, int n) {
        class07323.N((class06584)this, (T class027152) -> class027152.y(class035562, n));
    }

    public void N(@Nullable class07049 class070492) {
        if (!this.R()) {
            this.t = class070492;
        }
    }

    public void N(class07299 class072992, class07049 class070492, @Nullable class07085 class070852) {
        if (this.v > 0) {
            --this.v;
        }
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.B().N(this, class047822, class070492, class070852);
        }
    }

    public void N(class08036 class080362, int n) {
        class080362.method_7342(class01235.y.y((Object)this.B()), n);
        this.B().L(this, class080362);
    }

    public void N(class07299 class072992, class00500 class005002, class07209 class072092, class08036 class080362) {
        class06581 class065812 = this.B();
        if (class065812.N(this, class072992, class005002, class072092, (class07438)class080362)) {
            class080362.method_7259(class01235.L.y((Object)class065812));
        }
    }

    public void N(class07299 class072992) {
        this.B().N(this, class072992);
    }

    @Deprecated
    public static int N(List<class06584> list) {
        int n = 0;
        for (class06584 class065842 : list) {
            n = n * 31 + class06584.y(class065842);
        }
        return n;
    }

    public static MapCodec<class06584> N(String string) {
        return y.lenientOptionalFieldOf(string).xmap(optional -> optional.orElse(E), class065842 -> class065842.R() ? Optional.empty() : Optional.of(class065842));
    }

    public static boolean N(class06584 class065842, class06584 class065843, Predicate<class02477<?>> predicate) {
        if (class065842 == class065843) {
            return true;
        }
        if (class065842.c() != class065843.c()) {
            return false;
        }
        if (!class065842.N(class065843.B())) {
            return false;
        }
        if (class065842.R() && class065843.R()) {
            return true;
        }
        if (class065842.W.u() != class065843.W.u()) {
            return false;
        }
        for (class02477 class024772 : class065842.W.y()) {
            Object object = class065842.W.method_58694(class024772);
            Object object2 = class065843.W.method_58694(class024772);
            if (object == null || object2 == null) {
                return false;
            }
            if (Objects.equals(object, object2) || predicate.test(class024772)) continue;
            return false;
        }
        return true;
    }

    public void N(class07049 class070492, class03529<class01194> class035292) {
        class08153 class081532 = (class08153)this.method_58694(class02484.M);
        if (class081532 != null && class081532.y()) {
            class070492.method_32876(class035292);
        }
    }

    public void N(class07299 class072992, class07438 class074382, int n) {
        class06584 class065842;
        class06584 class065843 = this.t();
        if (this.B().N(this, class072992, class074382, n) && (class065842 = this.N(class074382, class065843)) != this) {
            class074382.method_6122(class074382.method_6058(), class065842);
        }
    }

    public <T> @Nullable T N(class02477<T> class024772, @Nullable T t) {
        Object object = this.W.y(class024772, t);
        this.N((class02477)class024772, (Object)t, (CallbackInfoReturnable)null);
        return (T)object;
    }

    public boolean N(class06646 class066462) {
        class03220 class032202 = (class03220)this.method_58694(class02484.s);
        return class032202 != null && class032202.N(class066462);
    }

    public int N(class07438 class074382) {
        return this.B().N(this, class074382);
    }

    public boolean W() {
        return this.L(class02484.u) && !this.L(class02484.R) && this.L(class02484.i);
    }

    public boolean R() {
        return this == E || this.n == class06570.N || this.j <= 0;
    }

    public void R(int n) {
        if (!this.R() && this.c() > n) {
            this.i(n);
        }
    }

    public class06495 O() {
        class06495 class064952 = (class06495)this.a_(class02484.m, class06495.field_8906);
        if (!this.I()) {
            return class064952;
        }
        return switch (class064952) {
            case class06495.field_8906, class06495.field_8907 -> class06495.field_8903;
            case class06495.field_8903 -> class06495.field_8904;
            default -> class064952;
        };
    }

    public int H() {
        return this.v;
    }

    public class06509 G() {
        return this.B().y(this);
    }

    public class00392 Y() {
        class05216 class052162 = class00392.i().y(this.d()).N(this.O().N());
        if (this.L(class02484.B)) {
            class052162.N(class06541.field_1056);
        }
        return class052162;
    }

    public int lithium$unsubscribe(ChangeSubscriber changeSubscriber) {
        if (this.R()) {
            throw new IllegalStateException("Cannot unsubscribe from an empty ItemStack!");
        }
        int n = ChangeSubscriber.dataOf((ChangeSubscriber)this.l, (ChangeSubscriber)changeSubscriber, (int)this.d);
        this.d = ChangeSubscriber.dataWithout((ChangeSubscriber)this.l, (ChangeSubscriber)changeSubscriber, (int)this.d);
        this.l = ChangeSubscriber.without((ChangeSubscriber)this.l, (ChangeSubscriber)changeSubscriber);
        if (this.l == null) {
            ((ChangePublisher)this.W).lithium$unsubscribe((ChangeSubscriber)this);
        }
        return n;
    }

    public void lithium$subscribe(ChangeSubscriber changeSubscriber, int n) {
        if (this.R()) {
            throw new IllegalStateException("Cannot subscribe to an empty ItemStack!");
        }
        if (this.l == null) {
            this.F();
        }
        this.l = ChangeSubscriber.combine((ChangeSubscriber)this.l, (int)this.d, (ChangeSubscriber)changeSubscriber, (int)n);
        this.d = this.l instanceof ChangeSubscriber.Multi ? 0 : n;
    }

    public int getBaritoneHash() {
        if (this.G == 0) {
            this.p();
        }
        return this.G;
    }

    public /* synthetic */ class06581 lithium$getItem() {
        return this.n;
    }

    public void lithium$unsubscribeWithData(ChangeSubscriber changeSubscriber, int n) {
        if (this.R()) {
            throw new IllegalStateException("Cannot unsubscribe from an empty ItemStack!");
        }
        this.d = ChangeSubscriber.dataWithout((ChangeSubscriber)this.l, (ChangeSubscriber)changeSubscriber, (int)this.d, (int)n, (boolean)true);
        this.l = ChangeSubscriber.without((ChangeSubscriber)this.l, (ChangeSubscriber)changeSubscriber, (int)n, (boolean)true);
        if (this.l == null) {
            ((ChangePublisher)this.W).lithium$unsubscribe((ChangeSubscriber)this);
        }
    }

    public boolean lithium$isSubscribedWithData(ChangeSubscriber changeSubscriber, int n) {
        if (this.R()) {
            throw new IllegalStateException("Cannot be subscribed to an empty ItemStack!");
        }
        return ChangeSubscriber.containsSubscriber((ChangeSubscriber)this.l, (int)this.d, (ChangeSubscriber)changeSubscriber, (int)n);
    }
}

