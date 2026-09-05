/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class02455
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
import minecraft.class02455;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class06966
implements FabricRenderState {
    public final List<class02455> N = new ArrayList<class02455>();
    public final List<class02455> y = new ArrayList<class02455>();
    public float L;
    public int u;
    private @Nullable Map i;

    public void setData(RenderStateDataKey renderStateDataKey, Object object) {
        if (this.i == null) {
            this.i = new Reference2ObjectOpenHashMap();
        }
        this.i.put(renderStateDataKey, object);
    }

    private void N(CallbackInfo callbackInfo) {
        ((FabricRenderState)this).clearExtraData();
    }

    public void N() {
        this.N.clear();
        this.y.clear();
        this.L = 0.0f;
        this.u = 0;
        this.N(null);
    }

    public @Nullable Object getData(RenderStateDataKey renderStateDataKey) {
        return this.i == null ? null : this.i.get(renderStateDataKey);
    }

    public void clearExtraData() {
        if (this.i != null) {
            this.i.clear();
        }
    }

    public Object getDataOrDefault(RenderStateDataKey renderStateDataKey, Object object) {
        return this.i == null ? object : this.i.getOrDefault(renderStateDataKey, object);
    }
}

