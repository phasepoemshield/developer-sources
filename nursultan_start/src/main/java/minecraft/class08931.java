/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalIntRef
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class00368
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02022
 *  minecraft.class03265
 *  minecraft.class03662
 *  minecraft.class04206
 *  minecraft.class04810
 *  minecraft.class06581
 *  minecraft.class06918
 *  minecraft.class07311
 *  minecraft.class08388
 *  minecraft.class08898
 *  net.caffeinemc.mods.sodium.client.render.frapi.mesh.MutableMeshImpl
 *  net.caffeinemc.mods.sodium.client.render.frapi.render.AccessLayerRenderState
 *  net.caffeinemc.mods.sodium.client.render.frapi.render.OrderedSubmitNodeCollectorExtension
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState
 *  net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey
 *  net.fabricmc.fabric.api.renderer.v1.mesh.MeshView
 *  net.fabricmc.fabric.api.renderer.v1.render.FabricLayerRenderState
 *  net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter
 *  net.irisshaders.iris.mixinterface.ItemContextState
 *  net.irisshaders.iris.shaderpack.materialmap.NamespacedId
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class00368;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02022;
import minecraft.class03265;
import minecraft.class03662;
import minecraft.class04206;
import minecraft.class04810;
import minecraft.class06581;
import minecraft.class06918;
import minecraft.class07311;
import minecraft.class08388;
import minecraft.class08898;
import minecraft.class08915;
import net.caffeinemc.mods.sodium.client.render.frapi.mesh.MutableMeshImpl;
import net.caffeinemc.mods.sodium.client.render.frapi.render.AccessLayerRenderState;
import net.caffeinemc.mods.sodium.client.render.frapi.render.OrderedSubmitNodeCollectorExtension;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshView;
import net.fabricmc.fabric.api.renderer.v1.render.FabricLayerRenderState;
import net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter;
import net.irisshaders.iris.mixinterface.ItemContextState;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class08931
implements AccessLayerRenderState,
FabricRenderState,
FabricLayerRenderState {
    private static final Vector3fc[] M = new Vector3fc[0];
    public static final Supplier<Vector3fc[]> N = () -> M;
    private final List<class02022> B;
    boolean y;
    @Nullable class08388 L;
    class03265 u;
    private @Nullable class07311 Z;
    private class08915 z;
    private int[] U;
    private @Nullable class00368<Object> E;
    private @Nullable Object W;
    Supplier<Vector3fc[]> i;
    final /* synthetic */ class08898 R;
    private @Nullable Map m;
    private class08898 P;
    private final MutableMeshImpl s = new MutableMeshImpl();
    private ItemRenderTypeGetter T = null;

    public void setData(RenderStateDataKey renderStateDataKey, Object object) {
        if (this.m == null) {
            this.m = new Reference2ObjectOpenHashMap();
        }
        this.m.put(renderStateDataKey, object);
    }

    public class08931(class08898 class088982) {
        this.R = class088982;
        this.B = new ArrayList<class02022>();
        this.u = class03265.N;
        this.z = class08915.field_55341;
        this.U = new int[0];
        this.i = N;
        this.N(class088982, null);
    }

    private void y(class01421 class014212, class01237 class012372, int n, int n2, int n3, CallbackInfo callbackInfo, LocalIntRef localIntRef) {
        CapturedRenderingState.INSTANCE.setCurrentBlockEntity(localIntRef.get());
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
    }

    private void y(CallbackInfo callbackInfo) {
        this.s.clear();
        this.T = null;
    }

    public List<class02022> y() {
        return this.B;
    }

    public void N() {
        this.B.clear();
        this.Z = null;
        this.z = class08915.field_55341;
        this.E = null;
        this.W = null;
        Arrays.fill(this.U, -1);
        this.y = false;
        this.L = null;
        this.u = class03265.N;
        this.i = N;
        this.N((CallbackInfo)null);
        this.y(null);
    }

    private void N(class01237 class012372, class01421 class014212, class03662 class036622, int n, int n2, int n3, int[] nArray, List list, class07311 class073112, class08915 class089152) {
        if (this.s.size() > 0 && class012372 instanceof OrderedSubmitNodeCollectorExtension) {
            ((OrderedSubmitNodeCollectorExtension)class012372).fabric_submitItem(class014212, class036622, n, n2, n3, nArray, list, class073112, class089152, (MeshView)this.s, this.T);
        } else {
            class012372.N(class014212, class036622, n, n2, n3, nArray, list, class073112, class089152);
        }
    }

    public void N(boolean bl) {
        this.y = bl;
    }

    public void N(Supplier<Vector3fc[]> supplier) {
        this.i = supplier;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void N(class06581 class065812, class01894 class018942) {
        if (WorldRenderingSettings.INSTANCE.getItemIds() == null) {
            return;
        }
        if (class065812 instanceof class06918) {
            class06918 class069182 = (class06918)class065812;
            if (!(class065812 instanceof class04810)) {
                if (WorldRenderingSettings.INSTANCE.getBlockStateIds() == null) {
                    return;
                }
                CapturedRenderingState.INSTANCE.setCurrentBlockEntity(1);
                CapturedRenderingState.INSTANCE.setCurrentRenderedItem(WorldRenderingSettings.INSTANCE.getBlockStateIds().getOrDefault((Object)class069182.L().W(), 0));
                return;
            }
        }
        class01894 class018943 = class018942 != null ? class018942 : class04206.B.y((Object)class065812);
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(WorldRenderingSettings.INSTANCE.getItemIds().applyAsInt((Object)new NamespacedId(class018943.y(), class018943.N())));
    }

    private void N(class01421 class014212, class01237 class012372, int n, int n2, int n3, CallbackInfo callbackInfo, LocalIntRef localIntRef) {
        localIntRef.set(CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity());
        this.N(((ItemContextState)this.P).getDisplayItem(), ((ItemContextState)this.P).getDisplayItemModel());
    }

    private void N(class08898 class088982, CallbackInfo callbackInfo) {
        this.P = class088982;
    }

    private void N(CallbackInfo callbackInfo) {
        ((FabricRenderState)this).clearExtraData();
    }

    public void N(class08915 class089152) {
        this.z = class089152;
    }

    private static class00368<Object> N(class00368<?> class003682) {
        return class003682;
    }

    public <T> void N(class00368<T> class003682, @Nullable T t) {
        this.E = class08931.N(class003682);
        this.W = t;
    }

    public void N(class03265 class032652) {
        this.u = class032652;
    }

    public void N(class08388 class083882) {
        this.L = class083882;
    }

    void N(class01421 class014212, class01237 class012372, int n, int n2, int n3) {
        LocalIntRefImpl localIntRefImpl = new LocalIntRefImpl();
        localIntRefImpl.init(0);
        this.N(class014212, class012372, n, n2, n3, null, (LocalIntRef)localIntRefImpl);
        class014212.N();
        this.u.N(this.R.N.L(), class014212.L());
        if (this.E != null) {
            this.E.N(this.W, this.R.N, class014212, class012372, n, n2, this.z != class08915.field_55341, n3);
        } else if (this.Z != null) {
            class08915 class089152 = this.z;
            class07311 class073112 = this.Z;
            List<class02022> var14 = this.B;
            int[] nArray = this.U;
            int n4 = n3;
            int n5 = n2;
            int n6 = n;
            class03662 class036622 = this.R.N;
            class01421 class014213 = class014212;
            class01237 class012373 = class012372;
            this.N(class012373, class014213, class036622, n6, n5, n4, nArray, var14, class073112, class089152);
        }
        class014212.y();
        this.y(class014212, class012372, n, n2, n3, null, (LocalIntRef)localIntRefImpl);
    }

    public int[] N(int n) {
        if (n > this.U.length) {
            this.U = new int[n];
            Arrays.fill(this.U, -1);
        }
        return this.U;
    }

    public void N(class07311 class073112) {
        this.Z = class073112;
    }

    public @Nullable Object getData(RenderStateDataKey renderStateDataKey) {
        return this.m == null ? null : this.m.get(renderStateDataKey);
    }

    public void clearExtraData() {
        if (this.m != null) {
            this.m.clear();
        }
    }

    public Object getDataOrDefault(RenderStateDataKey renderStateDataKey, Object object) {
        return this.m == null ? object : this.m.getOrDefault(renderStateDataKey, object);
    }

    public void fabric_setRenderTypeGetter(ItemRenderTypeGetter itemRenderTypeGetter) {
        this.T = itemRenderTypeGetter;
    }

    public MutableMeshImpl fabric_getMutableMesh() {
        return this.s;
    }
}

