/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class03063
 *  minecraft.class07074
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08141
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState
 *  net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class03063;
import minecraft.class07074;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08141;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class class00985
implements FabricRenderState {
    public class07209 R = class07209.field_10980;
    public class00500 M = class00869.N.W();
    public class00404<?> B = class00404.field_55992;
    public int Z;
    public @Nullable class08141 z;
    private @Nullable Map N;

    public void setData(RenderStateDataKey renderStateDataKey, Object object) {
        if (this.N == null) {
            this.N = new Reference2ObjectOpenHashMap();
        }
        this.N.put(renderStateDataKey, object);
    }

    public static void N(class00394 class003942, class00985 class009852, @Nullable class08141 class081412) {
        class009852.R = class003942.d();
        class009852.M = class003942.w();
        class009852.B = class003942.O();
        class009852.Z = class003942.G() != null ? class03063.N((class07295)class003942.G(), (class07209)class003942.d()) : 0xF000F0;
        class009852.z = class081412;
    }

    public void N(class07074 class070742) {
        class070742.N("BlockEntityRenderState", (Object)this.getClass().getCanonicalName());
        class070742.N("Position", (Object)this.R);
        class070742.N("Block state", () -> ((class00500)this.M).toString());
    }

    public @Nullable Object getData(RenderStateDataKey renderStateDataKey) {
        return this.N == null ? null : this.N.get(renderStateDataKey);
    }

    public void clearExtraData() {
        if (this.N != null) {
            this.N.clear();
        }
    }

    public Object getDataOrDefault(RenderStateDataKey renderStateDataKey, Object object) {
        return this.N == null ? object : this.N.getOrDefault(renderStateDataKey, object);
    }
}

