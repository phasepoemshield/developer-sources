/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.logging.LogUtils
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02022
 *  minecraft.class02028
 *  minecraft.class04673
 *  minecraft.class07211
 *  minecraft.class08388
 *  minecraft.class08626
 *  minecraft.class08838
 *  minecraft.class08877
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  net.fabricmc.fabric.api.renderer.v1.model.MeshBakedGeometry
 *  net.fabricmc.fabric.api.util.TriState
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class01894;
import minecraft.class02022;
import minecraft.class02028;
import minecraft.class04673;
import minecraft.class07211;
import minecraft.class08388;
import minecraft.class08496;
import minecraft.class08529;
import minecraft.class08626;
import minecraft.class08838;
import minecraft.class08877;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.model.MeshBakedGeometry;
import net.fabricmc.fabric.api.util.TriState;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public final class class08431
extends Record
implements class08877 {
    private final class08496 quads;
    private final boolean useAmbientOcclusion;
    private final class08388 particleIcon;
    private static final Logger u = LogUtils.getLogger();

    public class08388 L() {
        return this.particleIcon;
    }

    public class08431(class08496 class084962, boolean bl, class08388 class083882) {
        this.quads = class084962;
        this.useAmbientOcclusion = bl;
        this.particleIcon = class083882;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08431.class, "quads;useAmbientOcclusion;particleIcon", "quads", "useAmbientOcclusion", "particleIcon"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08431.class, "quads;useAmbientOcclusion;particleIcon", "quads", "useAmbientOcclusion", "particleIcon"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08431.class, "quads;useAmbientOcclusion;particleIcon", "quads", "useAmbientOcclusion", "particleIcon"}, this);
    }

    public boolean y() {
        return this.useAmbientOcclusion;
    }

    private static void N(class02028 class020282, class01894 class018942, class04673 class046732, CallbackInfoReturnable callbackInfoReturnable, class08496 class084962, LocalRef localRef) {
        if (class084962 instanceof MeshBakedGeometry) {
            ((MeshBakedGeometry)class084962).getMesh().forEach(quadView -> {
                if (quadView.atlas() != QuadAtlas.BLOCK) {
                    Multimap multimap = (Multimap)localRef.get();
                    if (multimap == null) {
                        multimap = HashMultimap.create();
                        localRef.set((Object)multimap);
                    }
                    class08388 class083882 = class020282.y().spriteFinder(quadView.atlas()).find(quadView);
                    multimap.put((Object)class083882.method_45852(), (Object)class083882.method_45851().method_45816());
                }
            });
        }
    }

    public class08496 N() {
        return this.quads;
    }

    public List<class02022> N(@Nullable class07211 class072112) {
        return this.quads.method_68049(class072112);
    }

    public static class08877 N(class02028 class020282, class01894 class018942, class04673 class046732) {
        class08529 class085292 = class020282.N(class018942);
        class08838 class088382 = class085292.B();
        boolean bl = class085292.u();
        class08388 class083882 = class085292.N(class088382, class020282);
        class08496 class084962 = class085292.N(class088382, class020282, class046732);
        Multimap multimap = null;
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init(multimap);
        class08431.N(class020282, class018942, class046732, null, class084962, (LocalRef)localRefImpl);
        multimap = (Multimap)localRefImpl.dispose();
        Iterator<class02022> var9 = class084962.method_68048().iterator();
        while (var9.hasNext()) {
            class08388 class083883 = var9.next().E();
            if (class083883.method_45852().equals((Object)class08626.N)) continue;
            if (multimap == null) {
                multimap = HashMultimap.create();
            }
            multimap.put((Object)class083883.method_45852(), (Object)class083883.method_45851().method_45816());
        }
        if (multimap != null) {
            u.warn("Rejecting block model {}, since it contains sprites from outside of supported atlas: {}", (Object)class018942, (Object)multimap);
            return class020282.N();
        }
        return new class08431(class084962, bl, class083882);
    }

    public void emitQuads(QuadEmitter quadEmitter, /*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable Predicate predicate) {
        class08496 class084962 = this.quads;
        if (class084962 instanceof MeshBakedGeometry) {
            MeshBakedGeometry meshBakedGeometry = (MeshBakedGeometry)class084962;
            if (this.useAmbientOcclusion) {
                meshBakedGeometry.getMesh().outputTo(quadEmitter);
            } else {
                quadEmitter.pushTransform(mutableQuadView -> {
                    if (mutableQuadView.ambientOcclusion() == TriState.DEFAULT) {
                        mutableQuadView.ambientOcclusion(TriState.FALSE);
                    }
                    return true;
                });
                meshBakedGeometry.getMesh().outputTo(quadEmitter);
                quadEmitter.popTransform();
            }
        } else {
            super.emitQuads(quadEmitter, predicate);
        }
    }
}

