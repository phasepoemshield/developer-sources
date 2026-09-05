/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  it.unimi.dsi.fastutil.ints.Int2IntArrayMap
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.IntIterator
 *  minecraft.class08882
 *  minecraft.class08893
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import minecraft.class08882;
import minecraft.class08893;
import org.jspecify.annotations.Nullable;

public class class09006
extends GpuTextureView {
    private static final int N = -1;
    private boolean y;
    private int L = -1;
    private int u = -1;
    private @Nullable Int2IntMap i;

    public class09006(class08893 class088932, int n, int n2) {
        super((GpuTexture)class088932, n, n2);
        class088932.y();
    }

    public void close() {
        if (!this.y) {
            this.y = true;
            this.texture().L();
            if (this.L != -1) {
                GlStateManager._glDeleteFramebuffers((int)this.L);
            }
            if (this.i != null) {
                IntIterator intIterator = this.i.values().iterator();
                while (intIterator.hasNext()) {
                    GlStateManager._glDeleteFramebuffers((int)((Integer)intIterator.next()));
                }
            }
        }
    }

    private int N(class08882 class088822, int n) {
        int n2 = class088822.y();
        class088822.N(n2, this.texture().N, n, this.baseMipLevel(), 0);
        return n2;
    }

    public int N(class08882 class088822, @Nullable GpuTexture gpuTexture) {
        int n2;
        int n3 = n2 = gpuTexture == null ? 0 : ((class08893)gpuTexture).N;
        if (this.u == n2) {
            return this.L;
        }
        if (this.L == -1) {
            this.L = this.N(class088822, n2);
            this.u = n2;
            return this.L;
        }
        if (this.i == null) {
            this.i = new Int2IntArrayMap();
        }
        return this.i.computeIfAbsent(n2, n -> this.N(class088822, n));
    }

    public boolean isClosed() {
        return this.y;
    }
}

