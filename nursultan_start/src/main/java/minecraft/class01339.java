/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09956
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  minecraft.class00389
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00522
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01020
 *  minecraft.class01118
 *  minecraft.class01351
 *  minecraft.class01354
 *  minecraft.class01362
 *  minecraft.class01369
 *  minecraft.class02682
 *  minecraft.class02733
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04160
 *  minecraft.class04425
 *  minecraft.class04641
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04689
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06898
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07027
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07111
 *  minecraft.class07137
 *  minecraft.class07190
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07307
 *  minecraft.class07322
 *  minecraft.class07536
 *  minecraft.class07752
 *  minecraft.class07955
 *  minecraft.class08005
 *  minecraft.class08036
 *  minecraft.class08089
 *  minecraft.class08092
 *  minecraft.class08400
 *  minecraft.class08713
 *  minecraft.class08791
 *  net.caffeinemc.mods.lithium.common.ai.pathing.BlockStatePathingCache
 *  net.caffeinemc.mods.lithium.common.block.BlockStateFlagHolder
 *  net.caffeinemc.mods.lithium.common.block.BlockStateFlags
 *  net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate
 *  net.caffeinemc.mods.lithium.common.initialization.BlockInfoInitializer
 *  net.caffeinemc.mods.lithium.common.world.blockview.SingleBlockBlockView
 *  net.caffeinemc.mods.lithium.common.world.blockview.SingleBlockBlockView$SingleBlockViewException
 *  net.fabricmc.fabric.api.event.player.BlockEvents
 *  net.fabricmc.fabric.api.event.player.BlockEvents$UseItemOnCallback
 *  net.fabricmc.fabric.api.event.player.BlockEvents$UseWithoutItemCallback
 *  net.fabricmc.fabric.impl.content.registry.OxidizableBlocksRegistryImpl$RandomTickCacheRefresher
 *  net.fabricmc.fabric.mixin.content.registry.BlockBehaviourAccessor
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.apache.commons.lang3.Validate
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09956;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class00389;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00522;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01020;
import minecraft.class01118;
import minecraft.class01340;
import minecraft.class01351;
import minecraft.class01354;
import minecraft.class01362;
import minecraft.class01369;
import minecraft.class02682;
import minecraft.class02733;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04160;
import minecraft.class04425;
import minecraft.class04641;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04689;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06898;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07027;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07111;
import minecraft.class07137;
import minecraft.class07190;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07307;
import minecraft.class07322;
import minecraft.class07536;
import minecraft.class07752;
import minecraft.class07955;
import minecraft.class08005;
import minecraft.class08036;
import minecraft.class08089;
import minecraft.class08092;
import minecraft.class08400;
import minecraft.class08713;
import minecraft.class08791;
import net.caffeinemc.mods.lithium.common.ai.pathing.BlockStatePathingCache;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlagHolder;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags;
import net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate;
import net.caffeinemc.mods.lithium.common.initialization.BlockInfoInitializer;
import net.caffeinemc.mods.lithium.common.world.blockview.SingleBlockBlockView;
import net.fabricmc.fabric.api.event.player.BlockEvents;
import net.fabricmc.fabric.impl.content.registry.OxidizableBlocksRegistryImpl;
import net.fabricmc.fabric.mixin.content.registry.BlockBehaviourAccessor;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.apache.commons.lang3.Validate;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class01339
extends class00522<class00891, class00500>
implements BlockStatePathingCache,
BlockStateFlagHolder,
OxidizableBlocksRegistryImpl.RandomTickCacheRefresher {
    private static final class07211[] N = class07211.values();
    private static final class00494[] B = (class00494[])class07536.N((Object)new class00494[N.length], class00494Array -> Arrays.fill(class00494Array, class00389.N()));
    private static final class00494[] Z = (class00494[])class07536.N((Object)new class00494[N.length], class00494Array -> Arrays.fill(class00494Array, class00389.y()));
    private final int z;
    private final boolean U;
    private final boolean E;
    private final boolean W;
    @Deprecated
    private final boolean m;
    @Deprecated
    private boolean P;
    private final class04641 s;
    private final class04689 T;
    private final float b;
    private final boolean j;
    private final boolean v;
    private final class01340 n;
    private final class01340 t;
    private final class01340 G;
    private final class01340 l;
    private final class01340 d;
    private final @Nullable class01351 w;
    private final boolean k;
    private final class08089 Y;
    private final boolean Q;
    @class09956(N="cache", y="field_23166")
    public @Nullable class01369 M;
    private class04688 O = class04684.N.M();
    private boolean g;
    private boolean I;
    private class00494 J;
    private class00494[] o;
    private boolean q;
    private int K;
    private class04425 V = null;
    private class04425 e = null;
    private int H = -1;

    public Stream<class03530<class00891>> w() {
        return this.i().s().L();
    }

    public class00494 L(class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.i().L(this.N(), class072902, class072092, class060922);
    }

    public boolean L(class07290 class072902, class07209 class072092, class07211 class072112) {
        return this.N(class072902, class072092, class072112, class01020.field_25822);
    }

    public float L(class07290 class072902, class07209 class072092) {
        float f = this.i().y(this.N(), class072902, class072092);
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, f);
        this.N(class072902, class072092, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueF();
        }
        return f;
    }

    public class00494 M(class07290 class072902, class07209 class072092) {
        if (this.M != null) {
            return this.M.N;
        }
        return this.y(class072902, class072092, class06092.N());
    }

    @Deprecated
    public boolean M() {
        class00891 class008912 = this.i();
        return class008912 != class00869.yw && class008912 != class00869.mS && this.B();
    }

    public boolean P() {
        return this.E;
    }

    @Deprecated
    public boolean T() {
        return this.m;
    }

    public boolean Q() {
        return this.g;
    }

    public class01339(class00891 class008912, Reference2ObjectArrayMap<class08092<?>, Comparable<?>> reference2ObjectArrayMap, MapCodec<class00500> mapCodec) {
        super((Object)class008912, reference2ObjectArrayMap, mapCodec);
        class01362 class013622 = class008912.X;
        this.z = class013622.i.applyAsInt(this.N());
        this.U = class008912.a_(this.N());
        this.E = class013622.m;
        this.W = class013622.P;
        this.m = class013622.s;
        this.s = class013622.j;
        this.T = (class04689)class013622.y.apply(this.N());
        this.b = class013622.M;
        this.j = class013622.B;
        this.v = class013622.W;
        this.n = class013622.l;
        this.t = class013622.d;
        this.G = class013622.w;
        this.l = class013622.k;
        this.d = class013622.Y;
        this.w = class013622.g;
        this.k = class013622.v;
        this.Y = class013622.n;
        this.Q = class013622.t;
    }

    @Deprecated
    public boolean B() {
        return this.P;
    }

    public class00494 B(class07290 class072902, class07209 class072092) {
        return this.i().u(this.N(), class072902, class072092);
    }

    public class08089 I() {
        return this.Y;
    }

    public boolean J() {
        if (this.i() instanceof class07027 && ProtocolTranslator.getTargetVersion().olderThan(ProtocolVersion.v1_14)) {
            return true;
        }
        return this.j;
    }

    public class00494 Z(class07290 class072902, class07209 class072092) {
        return this.i().b_(this.N(), class072902, class072092);
    }

    public boolean Z() {
        return this.q;
    }

    public float i(class07290 class072902, class07209 class072092) {
        float f = this.b;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, f);
        this.y(class072902, class072092, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueF();
        }
        return f;
    }

    public class00891 i() {
        return (class00891)this.u;
    }

    public class06898 b() {
        return this.i().d_(this.N());
    }

    public boolean s() {
        return this.W;
    }

    public class04641 n() {
        return this.s;
    }

    public boolean l() {
        return this.w != null;
    }

    public boolean d() {
        return this.Q;
    }

    public int m() {
        return this.z;
    }

    private boolean o() {
        if (((class00891)this.u).X.b) {
            return true;
        }
        if (((class00891)this.u).X.T) {
            return false;
        }
        if (this.M == null) {
            return false;
        }
        class00494 class004942 = this.M.N;
        if (class004942.method_1110()) {
            return false;
        }
        class00734 class007342 = class004942.method_1107();
        if (class007342.N() >= 0.7291666666666666) {
            return true;
        }
        return class007342.L() >= 1.0;
    }

    public boolean k() {
        return this.i() instanceof class07190;
    }

    public boolean t() {
        return this.I;
    }

    public boolean g() {
        return this.k;
    }

    public boolean v() {
        return this.i().N(this.N());
    }

    public boolean j() {
        return this.i().i_(this.N());
    }

    private int q() {
        if (!BlockStateFlags.ENABLED) {
            throw new IllegalStateException("Tried to access block state flags even though the feature is disabled!");
        }
        BlockInfoInitializer.initializeBlockInfo();
        if (this.H == -1) {
            throw new IllegalStateException("Could not initialize block state flags for " + String.valueOf((Object)this));
        }
        return this.H;
    }

    public class00494 U() {
        return this.J;
    }

    public boolean U(class07290 class072902, class07209 class072092) {
        return this.G.test(this.N(), class072902, class072092);
    }

    public int z() {
        return this.K;
    }

    public boolean z(class07290 class072902, class07209 class072092) {
        return this.t.test(this.N(), class072902, class072092);
    }

    public void u() {
        this.O = ((class00891)this.u).u(this.N());
        this.g = ((class00891)this.u).e_(this.N());
        if (!this.i().m()) {
            this.M = new class01369(this.N());
        }
        this.P = this.o();
        this.J = this.v ? ((class00891)this.u).z(this.N()) : class00389.N();
        this.I = class00891.N((class00494)this.J);
        if (this.J.method_1110()) {
            this.o = B;
        } else if (this.I) {
            this.o = Z;
        } else {
            this.o = new class00494[N.length];
            for (class07211 class072112 : N) {
                this.o[class072112.ordinal()] = this.J.method_20538(class072112);
            }
        }
        this.q = ((class00891)this.u).y(this.N());
        this.K = ((class00891)this.u).b_(this.N());
    }

    public boolean u(class07290 class072902, class07209 class072092) {
        return this.n.test(this.N(), class072902, class072092);
    }

    public boolean y(class07290 class072902, class07209 class072092) {
        return this.d.test(this.N(), class072902, class072092);
    }

    public final boolean y(class07290 class072902, class07209 class072092, class07049 class070492) {
        return this.N(class072902, class072092, class070492, class07211.field_11036);
    }

    public void y(class04782 class047822, class07209 class072092, class06069 class060692) {
        this.i().y_2(this.N(), class047822, class072092, class060692);
    }

    public long y(class07209 class072092) {
        return this.i().N(this.N(), class072092);
    }

    public void y(class07284 class072842, class07209 class072092, int n, int n2) {
        this.i().N(this.N(), class072842, class072092, n, n2);
    }

    public final void y(class07284 class072842, class07209 class072092, int n) {
        this.y(class072842, class072092, n, 512);
    }

    public class00494 y(class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.i().y_4(this.N(), class072902, class072092, class060922);
    }

    public int y(class07290 class072902, class07209 class072092, class07211 class072112) {
        return this.i().y(this.N(), class072902, class072092, class072112);
    }

    private void y(class07290 class072902, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable) {
        class00891 class008912 = this.i();
        if (class008912.equals(class00869.Et) || class008912.equals(class00869.Pn) || class008912.equals(class00869.PM) || class008912.equals(class00869.Pc)) {
            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
                callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.8f));
            }
        } else if (class008912.equals(class00869.yq) || class008912.equals(class00869.yd) || class008912.equals(class00869.yK)) {
            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
                callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.5f));
            }
        } else if (class008912 instanceof class07137) {
            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
                callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.75f));
            } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4)) {
                callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.0f));
            }
        } else if (class008912.equals(class00869.LV) && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_8tob1_8_1)) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(10.0f));
        }
    }

    public boolean E() {
        return this.M == null || this.M.y;
    }

    public boolean E(class07290 class072902, class07209 class072092) {
        return this.l.test(this.N(), class072902, class072092);
    }

    public boolean N(class03530<class00891> class035302, Predicate<class01339> predicate) {
        return this.N(class035302) && predicate.test(this);
    }

    public boolean N(class03543<class00891> class035432) {
        return class035432.N((class03556)this.i().s());
    }

    public boolean N(class03556<class00891> class035562) {
        return this.N((class00891)class035562.N());
    }

    public boolean N(class00500 class005002) {
        return this.i().i(class005002);
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00404<T> class004042) {
        if (this.i() instanceof class07190) {
            return ((class07190)this.i()).N(class072992, this.N(), class004042);
        }
        return null;
    }

    public boolean N(class05487 class054872, class07209 class072092) {
        return this.i().a_(this.N(), class054872, class072092);
    }

    public @Nullable class06237 N(class07299 class072992, class07209 class072092) {
        return this.i().N(this.N(), class072992, class072092);
    }

    public boolean N(class03530<class00891> class035302) {
        return this.i().s().N(class035302);
    }

    public class04689 N(class07290 class072902, class07209 class072092) {
        return this.T;
    }

    public void N(class04782 class047822, class07209 class072092, class07307 class073072, BiConsumer<class06584, class07209> biConsumer) {
        this.i().N(this.N(), class047822, class072092, class073072, biConsumer);
    }

    public void N(class07299 class072992, class00500 class005002, class06183 class061832, class08005 class080052) {
        this.i().N(class072992, class005002, class061832, class080052);
    }

    public class00494 N(class07211 class072112) {
        return this.o[class072112.ordinal()];
    }

    public boolean N(class07290 class072902, class07209 class072092, class07211 class072112, class01020 class010202) {
        if (this.M != null) {
            return this.M.N(class072112, class010202);
        }
        return class010202.N(this.N(), class072902, class072092, class072112);
    }

    public class06584 N(class05487 class054872, class07209 class072092, boolean bl) {
        return this.i().N(class054872, class072092, this.N(), bl);
    }

    protected abstract class00500 N();

    public boolean N(class07290 class072902, class07209 class072092, class07078<?> class070782) {
        return this.i().X.G.test(this.N(), class072902, class072092, class070782);
    }

    public boolean N(class00891 class008912) {
        return this.i() == class008912;
    }

    public boolean N(class05946<class00891> class059462) {
        return this.i().s().N(class059462);
    }

    private void N(class07299 class072992, class08036 class080362, class06183 class061832, CallbackInfoReturnable callbackInfoReturnable) {
        class07082 class070822 = ((BlockEvents.UseWithoutItemCallback)BlockEvents.USE_WITHOUT_ITEM.invoker()).useWithoutItem(this.N(), class072992, class061832.u(), class080362, class061832);
        if (class070822 != null) {
            callbackInfoReturnable.setReturnValue((Object)class070822);
        }
    }

    private void N(class06584 class065842, class07299 class072992, class08036 class080362, class07050 class070502, class06183 class061832, CallbackInfoReturnable callbackInfoReturnable) {
        class07082 class070822 = ((BlockEvents.UseItemOnCallback)BlockEvents.USE_ITEM_ON.invoker()).useItemOn(class065842, this.N(), class072992, class061832.u(), class080362, class070502, class061832);
        if (class070822 != null) {
            callbackInfoReturnable.setReturnValue((Object)class070822);
        }
    }

    public void N(class07290 class072902, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable) {
        float f = ((Float)callbackInfoReturnable.getReturnValue()).floatValue();
        float f2 = WorldRenderingSettings.INSTANCE.getAmbientOcclusionLevel();
        callbackInfoReturnable.setReturnValue((Object)Float.valueOf(1.0f - f2 * (1.0f - f)));
    }

    public void N(class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        this.i().N(this.N(), class072992, class072092, class008912, class027332, bl);
    }

    public float N(class08036 class080362, class07290 class072902, class07209 class072092) {
        return this.i().N(this.N(), class080362, class072902, class072092);
    }

    public boolean N(class07299 class072992, class07209 class072092, int n, int n2) {
        return this.i().N(this.N(), class072992, class072092, n, n2);
    }

    public class00500 N(class07111 class071112) {
        return this.i().N(this.N(), class071112);
    }

    public void N(class04782 class047822, class07209 class072092, boolean bl) {
        this.i().N(this.N(), class047822, class072092, bl);
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, boolean bl) {
        this.i().N_23(this.N(), class072992, class072092, class005002, bl);
    }

    public final void N(class07284 class072842, class07209 class072092, int n, int n2) {
        class07218 class072182 = new class07218();
        for (class07211 class072112 : class01354.g) {
            class072182.N((class00753)class072092, class072112);
            class072842.method_42308(class072112.b(), (class07209)class072182, class072092, this.N(), n, n2);
        }
    }

    public final void N(class07284 class072842, class07209 class072092, int n) {
        this.N(class072842, class072092, n, 512);
    }

    public class00494 N(class07290 class072902, class07209 class072092, class07049 class070492) {
        return this.i().N(this.N(), class072902, class072092, class070492);
    }

    public int N(class07299 class072992, class07209 class072092, class07211 class072112) {
        return this.i().N_24(this.N(), class072992, class072092, class072112);
    }

    public class00494 N(class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.i().N(this.N(), class072902, class072092, class060922);
    }

    public boolean N(class00500 class005002, class07211 class072112) {
        return this.i().y(this.N(), class005002, class072112);
    }

    public int N(class07290 class072902, class07209 class072092, class07211 class072112) {
        return this.i().N_8(this.N(), class072902, class072092, class072112);
    }

    public final boolean N(class07290 class072902, class07209 class072092, class07049 class070492, class07211 class072112) {
        return class00891.N((class00494)this.y(class072902, class072092, class06092.N((class07049)class070492)), (class07211)class072112);
    }

    public class06889 N(class07209 class072092) {
        class01351 class013512 = this.w;
        if (class013512 != null) {
            return class013512.evaluate(this.N(), class072092);
        }
        return class06889.L;
    }

    public List<class06584> N(class04160 class041602) {
        return this.i().N(this.N(), class041602);
    }

    public class07082 N(class06584 class065842, class07299 class072992, class08036 class080362, class07050 class070502, class06183 class061832) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class065842, class072992, class080362, class070502, class061832, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        return this.i().N(class065842, this.N(), class072992, class061832.u(), class080362, class070502, class061832);
    }

    public class07082 N(class07299 class072992, class08036 class080362, class06183 class061832) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class072992, class080362, class061832, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        return this.i().N(this.N(), class072992, class061832.u(), class080362, class061832);
    }

    public void N(class07299 class072992, class07209 class072092, class08036 class080362) {
        this.i().a_(this.N(), class072992, class072092, class080362);
    }

    public class00500 N(class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005002, class06069 class060692) {
        return this.i().N(this.N(), class054872, class087132, class072092, class072112, class072093, class005002, class060692);
    }

    public boolean N(class08791 class087912) {
        return this.i().N(this.N(), class087912);
    }

    public void N(class04782 class047822, class07209 class072092, class06069 class060692) {
        this.i().N(this.N(), class047822, class072092, class060692);
    }

    public class00500 N(class06993 class069932) {
        return this.i().N(this.N(), class069932);
    }

    public boolean N(class04651 class046512) {
        return this.i().N(this.N(), class046512);
    }

    public boolean N(class06942 class069422) {
        return this.i().N(this.N(), class069422);
    }

    public void N(class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        this.i().N(this.N(), class072992, class072092, class070492, class084002, bl);
    }

    public void N(class04782 class047822, class07209 class072092, class06584 class065842, boolean bl) {
        this.i().N(this.N(), class047822, class072092, class065842, bl);
    }

    public boolean W(class07290 class072902, class07209 class072092) {
        if (this.M != null) {
            return this.M.L;
        }
        return this.i().a_(this.N(), class072902, class072092);
    }

    public boolean W() {
        return this.U;
    }

    public class00494 R(class07290 class072902, class07209 class072092) {
        return this.N(class072902, class072092, class06092.N());
    }

    public class03556<class00891> R() {
        return ((class00891)this.u).s();
    }

    public class07752 O() {
        return this.i().j(this.N());
    }

    public boolean G() {
        return this.v;
    }

    public class04688 Y() {
        return this.O;
    }

    public void lithium$initializePathNodeTypeCache() {
        this.V = null;
        this.e = null;
        SingleBlockBlockView singleBlockBlockView = SingleBlockBlockView.of((class00500)this.N(), (class07209)class07209.field_10980);
        try {
            this.V = (class04425)Validate.notNull((Object)class07955.y((class07290)singleBlockBlockView, (class07209)class07209.field_10980), (String)"Block has no common path node type!", (Object[])new Object[0]);
        }
        catch (ClassCastException | SingleBlockBlockView.SingleBlockViewException throwable) {
            this.V = null;
        }
        try {
            this.e = class07955.N((class02682)new class02682((class07322)singleBlockBlockView, null), (int)1, (int)1, (int)1, null);
            if (this.e == null) {
                this.e = class04425.field_7;
            }
        }
        catch (ClassCastException | NullPointerException | SingleBlockBlockView.SingleBlockViewException throwable) {
            this.e = null;
        }
    }

    public void lithium$initializeFlags() {
        TrackedBlockStatePredicate.FULLY_INITIALIZED.set(true);
        int n = 0;
        for (int i = 0; i < BlockStateFlags.FLAGS.length; ++i) {
            if (!BlockStateFlags.FLAGS[i].test((Object)((class00500)this))) continue;
            n |= 1 << i;
        }
        this.H = n;
    }

    public int lithium$getAllFlags() {
        int n = this.H;
        if (n == -1) {
            n = this.q();
        }
        return n;
    }

    public class04425 lithium$getPathNodeType() {
        return this.V;
    }

    public void fabric_api$refreshRandomTickCache() {
        this.g = ((BlockBehaviourAccessor)this.u).callHasRandomTicks(this.N());
    }

    public class04425 lithium$getNeighborPathNodeType() {
        return this.e;
    }
}

