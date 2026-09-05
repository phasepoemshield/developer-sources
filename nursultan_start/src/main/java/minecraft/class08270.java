/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10944
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class01894
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState
 *  net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10944;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import minecraft.class01894;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class class08270
implements FabricRenderState {
    public @Nullable class01894 N;
    public final List<class10944> y = new ArrayList<class10944>();
    private @Nullable Map L;

    public void setData(RenderStateDataKey renderStateDataKey, Object object) {
        if (this.L == null) {
            this.L = new Reference2ObjectOpenHashMap();
        }
        this.L.put(renderStateDataKey, object);
    }

    public @Nullable Object getData(RenderStateDataKey renderStateDataKey) {
        return this.L == null ? null : this.L.get(renderStateDataKey);
    }

    public void clearExtraData() {
        if (this.L != null) {
            this.L.clear();
        }
    }

    public Object getDataOrDefault(RenderStateDataKey renderStateDataKey, Object object) {
        return this.L == null ? object : this.L.getOrDefault(renderStateDataKey, object);
    }
}

