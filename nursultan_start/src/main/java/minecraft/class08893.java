/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.TextureFormat
 *  it.unimi.dsi.fastutil.ints.Int2IntArrayMap
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.IntIterator
 *  net.irisshaders.iris.mixinterface.GpuTextureInterface
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import minecraft.class08882;
import net.irisshaders.iris.mixinterface.GpuTextureInterface;
import org.jspecify.annotations.Nullable;

public class class08893
extends GpuTexture
implements GpuTextureInterface {
    private static final int L = -1;
    public final int N;
    private int u = -1;
    private int i = -1;
    private @Nullable Int2IntMap R;
    protected boolean y;
    private int M;
    private boolean B;

    public void L() {
        --this.M;
        if (this.y && this.M == 0) {
            this.u();
        }
    }

    public class08893(int n, String string, TextureFormat textureFormat, int n2, int n3, int n4, int n5, int n6) {
        super(n, string, textureFormat, n2, n3, n4, n5);
        this.N = n6;
    }

    public void close() {
        if (this.y) {
            return;
        }
        this.y = true;
        if (this.M == 0) {
            this.u();
        }
    }

    private void u() {
        GlStateManager._deleteTexture((int)this.N);
        if (this.u != -1) {
            GlStateManager._glDeleteFramebuffers((int)this.u);
        }
        if (this.R != null) {
            IntIterator intIterator = this.R.values().iterator();
            while (intIterator.hasNext()) {
                GlStateManager._glDeleteFramebuffers((int)((Integer)intIterator.next()));
            }
        }
    }

    public void y() {
        ++this.M;
    }

    public int N() {
        return this.N;
    }

    private int N(class08882 class088822, int n) {
        int n2 = class088822.y();
        class088822.N(n2, this.N, n, 0, 0);
        return n2;
    }

    public int N(class08882 class088822, @Nullable GpuTexture gpuTexture) {
        int n2;
        int n3 = n2 = gpuTexture == null ? 0 : ((class08893)gpuTexture).N;
        if (this.i == n2) {
            return this.u;
        }
        if (this.u == -1) {
            this.u = this.N(class088822, n2);
            this.i = n2;
            return this.u;
        }
        if (this.R == null) {
            this.R = new Int2IntArrayMap();
        }
        return this.R.computeIfAbsent(n2, n -> this.N(class088822, n));
    }

    public int iris$getGlId() {
        return this.N();
    }

    public boolean isClosed() {
        return this.y;
    }

    public void iris$markMipmapNonLinear() {
        this.B = true;
    }
}

