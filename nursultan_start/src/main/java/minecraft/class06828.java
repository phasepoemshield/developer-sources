/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  minecraft.class03386
 *  minecraft.class06202
 *  minecraft.class08188
 *  minecraft.class08627
 *  minecraft.class08918
 */
package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import minecraft.class03386;
import minecraft.class06202;
import minecraft.class06812;
import minecraft.class06823;
import minecraft.class06830;
import minecraft.class06833;
import minecraft.class06835;
import minecraft.class06845;
import minecraft.class06856;
import minecraft.class08188;
import minecraft.class08627;
import minecraft.class08918;

public final class class06828 {
    public final RenderPipeline N;
    final Map<String, class06845> y;
    final class06835 L;
    public final class06856 u;
    final class06823 i;
    final boolean R;
    final boolean M;
    final boolean B;
    final boolean Z;
    final int z;
    final class06833 U;

    class06828(RenderPipeline renderPipeline, Map<String, class06845> map, boolean bl, boolean bl2, class06833 class068332, class06856 class068562, class06835 class068352, class06823 class068232, boolean bl3, boolean bl4, int n) {
        this.N = renderPipeline;
        this.y = map;
        this.u = class068562;
        this.L = class068352;
        this.R = bl;
        this.M = bl2;
        this.i = class068232;
        this.U = class068332;
        this.B = bl3;
        this.Z = bl4;
        this.z = n;
    }

    public String toString() {
        return "RenderSetup[layeringTransform=" + String.valueOf(this.U) + ", textureTransform=" + String.valueOf(this.L) + ", textures=" + String.valueOf(this.y) + ", outlineProperty=" + String.valueOf((Object)this.i) + ", useLightmap=" + this.R + ", useOverlay=" + this.M + "]";
    }

    public Map<String, class06830> N() {
        if (this.y.isEmpty() && !this.M && !this.R) {
            return Collections.emptyMap();
        }
        HashMap<String, class06830> hashMap = new HashMap<String, class06830>();
        if (this.M) {
            hashMap.put("Sampler1", new class06830(((class03386)class06202.Nq().i_5).b().N(), RenderSystem.getSamplerCache().N(FilterMode.LINEAR)));
        }
        if (this.R) {
            hashMap.put("Sampler2", new class06830(((class03386)class06202.Nq().i_5).T().N(), RenderSystem.getSamplerCache().N(FilterMode.LINEAR)));
        }
        class08627 class086272 = class06202.Nq().NO();
        for (Map.Entry<String, class06845> entry : this.y.entrySet()) {
            class08918 class089182 = class086272.y(entry.getValue().N());
            class08188 class081882 = entry.getValue().y().get();
            hashMap.put(entry.getKey(), new class06830(class089182.method_71659(), class081882 != null ? class081882 : class089182.method_75484()));
        }
        return hashMap;
    }

    public static class06812 N(RenderPipeline renderPipeline) {
        return new class06812(renderPipeline);
    }
}

