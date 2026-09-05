/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09399
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class00734
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01894
 *  minecraft.class03662
 *  minecraft.class06069
 *  minecraft.class06581
 *  minecraft.class08388
 *  minecraft.class08931
 *  net.caffeinemc.mods.sodium.client.render.frapi.mesh.MutableMeshImpl
 *  net.caffeinemc.mods.sodium.client.render.frapi.render.AccessLayerRenderState
 *  net.caffeinemc.mods.sodium.client.render.frapi.render.QuadToPosPipe
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState
 *  net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey
 *  net.irisshaders.iris.mixinterface.ItemContextState
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class09399;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Consumer;
import minecraft.class00734;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01894;
import minecraft.class03662;
import minecraft.class06069;
import minecraft.class06581;
import minecraft.class08388;
import minecraft.class08931;
import net.caffeinemc.mods.sodium.client.render.frapi.mesh.MutableMeshImpl;
import net.caffeinemc.mods.sodium.client.render.frapi.render.AccessLayerRenderState;
import net.caffeinemc.mods.sodium.client.render.frapi.render.QuadToPosPipe;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import net.irisshaders.iris.mixinterface.ItemContextState;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class08898
implements FabricRenderState,
ItemContextState {
    class03662 N = class03662.field_4315;
    private int L;
    private boolean u;
    private boolean i;
    private @Nullable class00734 R;
    public class08931[] y = new class08931[]{new class08931(this)};
    private @Nullable Map M;
    private class06581 B;
    private class01894 Z;

    public void L() {
        this.u = true;
    }

    public class00734 M() {
        class00734 class007342;
        if (this.R != null) {
            return this.R;
        }
        class09399 class093992 = new class09399();
        this.N(arg_0 -> ((class09399)class093992).N(arg_0));
        this.R = class007342 = class093992.N();
        return class007342;
    }

    public void setData(RenderStateDataKey renderStateDataKey, Object object) {
        if (this.M == null) {
            this.M = new Reference2ObjectOpenHashMap();
        }
        this.M.put(renderStateDataKey, object);
    }

    public boolean B() {
        return this.i;
    }

    private class08931 Z() {
        return this.y[0];
    }

    public boolean i() {
        return this.L == 0;
    }

    public boolean u() {
        return this.u;
    }

    public void y() {
        this.y(null);
        this.N = class03662.field_4315;
        for (int i = 0; i < this.L; ++i) {
            this.y[i].N();
        }
        this.L = 0;
        this.u = false;
        this.i = false;
        this.R = null;
        this.N((CallbackInfo)null);
    }

    private void y(CallbackInfo callbackInfo) {
        this.B = null;
        this.Z = null;
    }

    public void N(boolean bl) {
        this.i = bl;
    }

    public void N(int n) {
        int n2 = this.L + n;
        int n3 = this.y.length;
        if (n2 > n3) {
            this.y = Arrays.copyOf(this.y, n2);
            for (int i = n3; i < n2; ++i) {
                this.y[i] = new class08931(this);
            }
        }
    }

    private void N(CallbackInfo callbackInfo) {
        ((FabricRenderState)this).clearExtraData();
    }

    public void N(Object object) {
    }

    private void N(Consumer consumer, CallbackInfo callbackInfo, Vector3f vector3f, class08931 class089312, Matrix4f matrix4f, LocalRef localRef) {
        MutableMeshImpl mutableMeshImpl = ((AccessLayerRenderState)class089312).fabric_getMutableMesh();
        if (mutableMeshImpl.size() > 0) {
            QuadToPosPipe quadToPosPipe = (QuadToPosPipe)localRef.get();
            if (quadToPosPipe == null) {
                quadToPosPipe = new QuadToPosPipe(consumer, vector3f);
                localRef.set((Object)quadToPosPipe);
            }
            quadToPosPipe.matrix = matrix4f;
            mutableMeshImpl.forEachMutable((Consumer)quadToPosPipe);
        }
    }

    public void N(Consumer<Vector3fc> consumer) {
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init(null);
        Vector3f vector3f = new Vector3f();
        class01423 class014232 = new class01423();
        for (int i = 0; i < this.L; ++i) {
            class08931 class089312 = this.y[i];
            class089312.u.N(this.N.L(), class014232);
            Matrix4f matrix4f = class014232.N();
            for (Vector3fc vector3fc : (Vector3fc[])class089312.i.get()) {
                consumer.accept((Vector3fc)vector3f.set(vector3fc).mulPosition((Matrix4fc)matrix4f));
            }
            this.N(consumer, null, vector3f, class089312, matrix4f, (LocalRef)localRefImpl);
            class014232.L();
        }
    }

    public @Nullable class08388 N(class06069 class060692) {
        if (this.L == 0) {
            return null;
        }
        return this.y[class060692.y((int)this.L)].L;
    }

    public class08931 N() {
        this.N(1);
        return this.y[this.L++];
    }

    public void N(class01421 class014212, class01237 class012372, int n, int n2, int n3) {
        for (int i = 0; i < this.L; ++i) {
            this.y[i].N(class014212, class012372, n, n2, n3);
        }
    }

    public @Nullable Object getData(RenderStateDataKey renderStateDataKey) {
        return this.M == null ? null : this.M.get(renderStateDataKey);
    }

    public class06581 getDisplayItem() {
        return this.B;
    }

    public void clearExtraData() {
        if (this.M != null) {
            this.M.clear();
        }
    }

    public Object getDataOrDefault(RenderStateDataKey renderStateDataKey, Object object) {
        return this.M == null ? object : this.M.getOrDefault(renderStateDataKey, object);
    }

    public boolean R() {
        return this.Z().y;
    }

    public void setDisplayItem(class06581 class065812, class01894 class018942) {
        this.B = class065812;
        this.Z = class018942;
    }

    public class01894 getDisplayItemModel() {
        return this.Z;
    }
}

