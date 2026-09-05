/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class00985
 *  minecraft.class06959
 *  minecraft.class06964
 *  minecraft.class06966
 *  minecraft.class06969
 *  minecraft.class06971
 *  minecraft.class06973
 *  minecraft.class08800
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState
 *  net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import minecraft.class00985;
import minecraft.class06959;
import minecraft.class06964;
import minecraft.class06966;
import minecraft.class06969;
import minecraft.class06971;
import minecraft.class06973;
import minecraft.class08800;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class05932
implements FabricRenderState {
    public class06959 N = new class06959();
    public final List<class08800> y = new ArrayList<class08800>();
    public final List<class00985> L = new ArrayList<class00985>();
    public boolean u;
    public @Nullable class06973 i;
    public final List<class06964> R = new ArrayList<class06964>();
    public final class06966 M = new class06966();
    public final class06969 B = new class06969();
    public final class06971 Z = new class06971();
    public long z;
    private @Nullable Map U;

    public void setData(RenderStateDataKey renderStateDataKey, Object object) {
        if (this.U == null) {
            this.U = new Reference2ObjectOpenHashMap();
        }
        this.U.put(renderStateDataKey, object);
    }

    private void N(CallbackInfo callbackInfo) {
        ((FabricRenderState)this).clearExtraData();
    }

    public void N() {
        this.y.clear();
        this.L.clear();
        this.R.clear();
        this.u = false;
        this.i = null;
        this.M.N();
        this.B.N();
        this.Z.N();
        this.z = 0L;
        this.N(null);
    }

    public @Nullable Object getData(RenderStateDataKey renderStateDataKey) {
        return this.U == null ? null : this.U.get(renderStateDataKey);
    }

    public void clearExtraData() {
        if (this.U != null) {
            this.U.clear();
        }
    }

    public Object getDataOrDefault(RenderStateDataKey renderStateDataKey, Object object) {
        return this.U == null ? object : this.U.getOrDefault(renderStateDataKey, object);
    }
}

