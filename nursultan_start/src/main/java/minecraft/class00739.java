/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.injection.ViaFabricPlusMixinPlugin
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00389
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class05854
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06704
 *  minecraft.class06889
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07003
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07111
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07234
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07482
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08400
 *  minecraft.class08791
 *  net.caffeinemc.mods.lithium.common.block.entity.ShapeUpdateHandlingBlockBehaviour
 *  net.caffeinemc.mods.lithium.common.hopper.UpdateReceiver
 *  net.caffeinemc.mods.lithium.common.world.blockentity.BlockEntityGetter
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.injection.ViaFabricPlusMixinPlugin;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class05854;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06704;
import minecraft.class06889;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07003;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07111;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07234;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08400;
import minecraft.class08791;
import net.caffeinemc.mods.lithium.common.block.entity.ShapeUpdateHandlingBlockBehaviour;
import net.caffeinemc.mods.lithium.common.hopper.UpdateReceiver;
import net.caffeinemc.mods.lithium.common.world.blockentity.BlockEntityGetter;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00739
extends class07796
implements ShapeUpdateHandlingBlockBehaviour {
    public static final MapCodec<class00739> N = class00739.y(class00739::new);
    public static final class08064<class07211> y = class06665.A;
    public static final class06667 L = class06665.Z;
    private final Function<class00500, class00494> u;
    private final Map<class07211, class00494> i;
    private static final class00494 R;
    private static final class00494 M;
    private boolean B;

    public class00739(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11033)).y((class08092)L, (Comparable)Boolean.valueOf(true)));
        class00494 class004942 = class00891.y((double)12.0, (double)11.0, (double)16.0);
        this.u = this.y(class004942);
        this.i = ImmutableMap.builderWithExpectedSize((int)5).putAll(class00389.L((class00494)class00389.N((class00494)class004942, (class00494)class00891.N((double)4.0, (double)8.0, (double)10.0, (double)0.0, (double)4.0)))).put((Object)class07211.field_11033, (Object)class004942).build();
    }

    public class00494 z(class00500 class005002) {
        this.B = true;
        return super.z(class005002);
    }

    private Function<class00500, class00494> y(class00494 class004942) {
        class00494 class004943 = class00389.N((class00494)class00389.N((class00494)class00891.y((double)16.0, (double)10.0, (double)16.0), (class00494)class00891.y((double)8.0, (double)4.0, (double)10.0)), (class00494)class004942, (class07003)class07003.i);
        Map var4 = class00389.L((class00494)class00891.N((double)4.0, (double)4.0, (double)8.0, (double)0.0, (double)8.0), (class06889)new class06889(8.0, 6.0, 8.0).L(0.0625));
        return this.N(class005002 -> class00389.N((class00494)class004943, (class00494)class00389.N((class00494)((class00494)var4.get(class005002.L(y))), (class00494)class00389.y(), (class07003)class07003.Z)), new class08092[]{L});
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L});
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class07234) {
            class07234.N((class07299)class072992, (class07209)class072092, (class00500)class005002, (class07049)class070492, (class07234)((class07234)class003942));
        }
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(y)));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    public MapCodec<class00739> N() {
        return N;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfoReturnable.setReturnValue((Object)R);
        }
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ViaFabricPlusMixinPlugin.MORE_CULLING_PRESENT && this.B) {
            this.B = false;
        } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfoReturnable.setReturnValue((Object)M);
        }
    }

    private void N(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl, CallbackInfo callbackInfo) {
        if (class072992.method_8320(class072092) != class005002) {
            for (class07211 class072112 : g) {
                class00394 class003942 = ((BlockEntityGetter)class072992).lithium$getLoadedExistingBlockEntity(class072092.method_10093(class072112));
                if (!(class003942 instanceof UpdateReceiver)) continue;
                ((UpdateReceiver)class003942).lithium$invalidateCacheOnNeighborUpdate(class072112 == class07211.field_11033);
            }
        }
    }

    private void N(class05487 class054872, class00500 class005002, class07209 class072092, class07209 class072093) {
        class00394 class003942;
        boolean bl;
        class07211 class072112 = (class07211)class005002.L(y);
        boolean bl2 = bl = class072093.method_10264() == class072092.method_10264() + 1;
        if ((bl || class072093.method_10263() == class072092.method_10263() + class072112.P() && class072093.method_10264() == class072092.method_10264() + class072112.s() && class072093.method_10260() == class072092.method_10260() + class072112.T()) && (class003942 = ((BlockEntityGetter)class054872).lithium$getLoadedExistingBlockEntity(class072092)) instanceof UpdateReceiver) {
            ((UpdateReceiver)class003942).lithium$invalidateCacheOnNeighborUpdate(bl);
        }
    }

    private void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, class02733 class027332, boolean bl, CallbackInfo callbackInfo) {
        class00394 class003942;
        if (!class072992.method_8608() && (class003942 = ((BlockEntityGetter)class072992).lithium$getLoadedExistingBlockEntity(class072092)) instanceof UpdateReceiver) {
            ((UpdateReceiver)class003942).lithium$invalidateCacheOnUndirectedNeighborUpdate();
        }
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        class00394 class003942;
        if (!class072992.method_8608() && (class003942 = class072992.method_8321(class072092)) instanceof class07234) {
            class07234 class072342 = (class07234)class003942;
            class080362.method_17355((class06237)class072342);
            class080362.method_7281(class01235.NR);
        }
        return class07082.N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return this.u.apply(class005002);
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (class005003.N(class005002.i())) {
            return;
        }
        this.N(class072992, class072092, class005002);
        this.N(class005002, class072992, class072092, class005003, bl, null);
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class072992.method_8608() ? null : class00739.N(class004042, (class00404)class00404.field_11888, class07234::N);
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class07234(class072092, class005002);
    }

    public class00500 N(class06942 class069422) {
        class07211 class072112 = class069422.method_8038().b();
        return (class00500)((class00500)this.W().y(y, (Comparable)(class072112.z() == class07185.field_11052 ? class07211.field_11033 : class072112))).y((class08092)L, (Comparable)Boolean.valueOf(true));
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return class07482.N((class00394)class072992.method_8321(class072092));
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        class06704.N((class00500)class005002, (class07299)class047822, (class07209)class072092);
    }

    private void N(class07299 class072992, class07209 class072092, class00500 class005002) {
        boolean bl;
        boolean bl2 = bl = !class072992.W(class072092);
        if (bl != (Boolean)class005002.L((class08092)L)) {
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(bl)), 2);
        }
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        this.N(class005002, class072992, class072092, class008912, class027332, bl, null);
        this.N(class072992, class072092, class005002);
    }

    public void lithium$handleShapeUpdate(class05487 class054872, class00500 class005002, class07209 class072092, class07209 class072093, class00500 class005003) {
        if (!class054872.method_8608() && class005003.i() instanceof class05854) {
            this.N(class054872, class005002, class072092, class072093);
        }
    }

    protected class00494 b_(class00500 class005002, class07290 class072902, class07209 class072092) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return this.i.get(class005002.L(y));
    }
}

