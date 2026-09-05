/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class07211
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState
 *  net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import minecraft.class06982;
import minecraft.class07211;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class06969
implements FabricRenderState {
    public double N;
    public double y;
    public double L;
    public double u;
    public int i;
    public double R;
    private @Nullable Map M;

    public void setData(RenderStateDataKey renderStateDataKey, Object object) {
        if (this.M == null) {
            this.M = new Reference2ObjectOpenHashMap();
        }
        this.M.put(renderStateDataKey, object);
    }

    private void N(CallbackInfo callbackInfo) {
        ((FabricRenderState)this).clearExtraData();
    }

    public List<class06982> N(double d, double d2) {
        return Arrays.stream(new class06982[]{new class06982(class07211.field_11043, d2 - this.L), new class06982(class07211.field_11035, this.u - d2), new class06982(class07211.field_11039, d - this.N), new class06982(class07211.field_11034, this.y - d)}).sorted(Comparator.comparingDouble(class069822 -> class069822.y())).toList();
    }

    public void N() {
        this.R = 0.0;
        this.N(null);
    }

    public @Nullable Object getData(RenderStateDataKey renderStateDataKey) {
        return this.M == null ? null : this.M.get(renderStateDataKey);
    }

    public void clearExtraData() {
        if (this.M != null) {
            this.M.clear();
        }
    }

    public Object getDataOrDefault(RenderStateDataKey renderStateDataKey, Object object) {
        return this.M == null ? object : this.M.getOrDefault(renderStateDataKey, object);
    }
}

