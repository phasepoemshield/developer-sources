/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11806
 *  Nursultan.class11816
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class00392
 *  minecraft.class06889
 *  minecraft.class07074
 *  minecraft.class07078
 *  minecraft.class08453
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState
 *  net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class11806;
import Nursultan.class11816;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import minecraft.class00392;
import minecraft.class06889;
import minecraft.class07074;
import minecraft.class07078;
import minecraft.class08453;
import minecraft.class08804;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class class08800
implements class11806,
FabricRenderState {
    public static final int z = 0;
    public class07078<?> U;
    public double E;
    public double W;
    public double m;
    public float P;
    public float s;
    public float T;
    public float b;
    public double j;
    public boolean v;
    public boolean n;
    public boolean t;
    public int G = 0xF000F0;
    public int l = 0;
    public @Nullable class06889 d;
    public @Nullable class00392 w;
    public @Nullable class06889 k;
    public @Nullable List<class08804> Y;
    public float Q;
    public final List<class08453> O;
    private @Nullable Map N;
    private final class11816 y = new class11816();

    public class11816 dataManager() {
        return this.y;
    }

    public void setData(RenderStateDataKey renderStateDataKey, Object object) {
        if (this.N == null) {
            this.N = new Reference2ObjectOpenHashMap();
        }
        this.N.put(renderStateDataKey, object);
    }

    public class08800() {
        this.O = new ArrayList<class08453>();
    }

    public boolean y() {
        return this.l != 0;
    }

    public void N(class07074 class070742) {
        class070742.N("EntityRenderState", (Object)this.getClass().getCanonicalName());
        class070742.N("Entity's Exact location", (Object)String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.E, this.W, this.m));
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

