/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00780
 *  minecraft.class00869
 *  minecraft.class02730
 *  minecraft.class03202
 *  minecraft.class03556
 *  minecraft.class04688
 *  minecraft.class05795
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07295
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
import minecraft.class00500;
import minecraft.class00780;
import minecraft.class00869;
import minecraft.class02730;
import minecraft.class03202;
import minecraft.class03556;
import minecraft.class04688;
import minecraft.class05795;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07295;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class class07942
implements class07295,
FabricRenderState {
    public class07209 N = class07209.field_10980;
    public class07209 y = class07209.field_10980;
    public class00500 L = class00869.N.W();
    public @Nullable class03556<class00780> u;
    public class07295 i = class02730.field_52611;
    private @Nullable Map R;

    public void setData(RenderStateDataKey renderStateDataKey, Object object) {
        if (this.R == null) {
            this.R = new Reference2ObjectOpenHashMap();
        }
        this.R.put(renderStateDataKey, object);
    }

    public int method_31607() {
        return this.y.method_10264();
    }

    public class00500 method_8320(class07209 class072092) {
        if (class072092.equals((Object)this.y)) {
            return this.L;
        }
        return class00869.N.W();
    }

    public class04688 method_8316(class07209 class072092) {
        return this.method_8320(class072092).Y();
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

    public boolean hasBiomes() {
        return this.u != null;
    }

    public float method_24852(class07211 class072112, boolean bl) {
        return this.i.method_24852(class072112, bl);
    }

    public @Nullable class00394 method_8321(class07209 class072092) {
        return null;
    }

    public class05795 method_22336() {
        return this.i.method_22336();
    }

    public int method_31605() {
        return 1;
    }

    public int method_23752(class07209 class072092, class03202 class032022) {
        if (this.u == null) {
            return -1;
        }
        return class032022.getColor((class00780)this.u.N(), (double)class072092.method_10263(), (double)class072092.method_10260());
    }

    public class03556 getBiomeFabric(class07209 class072092) {
        return this.u;
    }
}

