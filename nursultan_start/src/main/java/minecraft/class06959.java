/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class07209
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState
 *  net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey
 *  org.joml.Quaternionf
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import minecraft.class06889;
import minecraft.class07209;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.joml.Quaternionf;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class class06959
implements FabricRenderState {
    public class07209 N = class07209.field_10980;
    public class06889 y = new class06889(0.0, 0.0, 0.0);
    public boolean L;
    public class06889 u = new class06889(0.0, 0.0, 0.0);
    public Quaternionf i = new Quaternionf();
    private @Nullable Map R;

    public void setData(RenderStateDataKey renderStateDataKey, Object object) {
        if (this.R == null) {
            this.R = new Reference2ObjectOpenHashMap();
        }
        this.R.put(renderStateDataKey, object);
    }

    public @Nullable Object getData(RenderStateDataKey renderStateDataKey) {
        return this.R == null ? null : this.R.get(renderStateDataKey);
    }

    public void clearExtraData() {
        if (this.R != null) {
            this.R.clear();
        }
    }

    public Object getDataOrDefault(RenderStateDataKey renderStateDataKey, Object object) {
        return this.R == null ? object : this.R.getOrDefault(renderStateDataKey, object);
    }
}

