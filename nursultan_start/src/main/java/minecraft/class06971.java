/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class07360
 *  minecraft.class08165
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState
 *  net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import minecraft.class07360;
import minecraft.class08165;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class06971
implements FabricRenderState {
    public class07360 N = class07360.field_64385;
    public boolean y;
    public float L;
    public float u;
    public float i;
    public float R;
    public float M;
    public int B;
    public class08165 Z = class08165.field_63425;
    public int z;
    public float U;
    public float E;
    public float W;
    private @Nullable Map m;

    public void setData(RenderStateDataKey renderStateDataKey, Object object) {
        if (this.m == null) {
            this.m = new Reference2ObjectOpenHashMap();
        }
        this.m.put(renderStateDataKey, object);
    }

    private void N(CallbackInfo callbackInfo) {
        ((FabricRenderState)this).clearExtraData();
    }

    public void N() {
        this.N = class07360.field_64385;
        this.N(null);
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
}

