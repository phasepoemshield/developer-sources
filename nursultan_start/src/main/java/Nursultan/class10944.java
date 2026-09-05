/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class00392
 *  minecraft.class08388
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState
 *  net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import minecraft.class00392;
import minecraft.class08388;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class class10944
implements FabricRenderState {
    public @Nullable class08388 N;
    public byte y;
    public byte L;
    public byte u;
    public boolean i;
    public @Nullable class00392 R;
    private @Nullable Map M;

    public void setData(RenderStateDataKey renderStateDataKey, Object object) {
        if (this.M == null) {
            this.M = new Reference2ObjectOpenHashMap();
        }
        this.M.put(renderStateDataKey, object);
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

