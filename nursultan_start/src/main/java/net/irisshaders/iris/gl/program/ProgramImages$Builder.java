/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.blaze3d.opengl.GlStateManager
 */
package net.irisshaders.iris.gl.program;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntSupplier;
import net.irisshaders.iris.gl.image.ImageBinding;
import net.irisshaders.iris.gl.image.ImageHolder;
import net.irisshaders.iris.gl.image.ImageLimits;
import net.irisshaders.iris.gl.program.GlUniform1iCall;
import net.irisshaders.iris.gl.program.ProgramImages;
import net.irisshaders.iris.gl.texture.InternalTextureFormat;

public final class ProgramImages$Builder
implements ImageHolder {
    private final int program;
    private final ImmutableList.Builder<ImageBinding> images;
    private final List<GlUniform1iCall> calls;
    private final int maxImageUnits;
    private int nextImageUnit;

    ProgramImages$Builder(int n) {
        this.program = n;
        this.images = ImmutableList.builder();
        this.calls = new ArrayList<GlUniform1iCall>();
        this.nextImageUnit = 0;
        this.maxImageUnits = ImageLimits.get().getMaxImageUnits();
    }

    public ProgramImages build() {
        return new ProgramImages((ImmutableList<ImageBinding>)this.images.build(), this.calls);
    }

    @Override
    public void addTextureImage(IntSupplier intSupplier, InternalTextureFormat internalTextureFormat, String string) {
        int n = GlStateManager._glGetUniformLocation((int)this.program, (CharSequence)string);
        if (n == -1) {
            return;
        }
        if (this.nextImageUnit >= this.maxImageUnits) {
            if (this.maxImageUnits == 0) {
                throw new IllegalStateException("Image units are not supported on this platform, but a shader program attempted to reference " + string + ".");
            }
            throw new IllegalStateException("No more available texture units while activating image " + string + ". Only " + this.maxImageUnits + " image units are available.");
        }
        if (internalTextureFormat == InternalTextureFormat.RGBA) {
            internalTextureFormat = InternalTextureFormat.RGBA8;
        }
        this.images.add((Object)new ImageBinding(this.nextImageUnit, internalTextureFormat.getGlFormat(), intSupplier));
        this.calls.add(new GlUniform1iCall(n, this.nextImageUnit));
        ++this.nextImageUnit;
    }

    @Override
    public boolean hasImage(String string) {
        return GlStateManager._glGetUniformLocation((int)this.program, (CharSequence)string) != -1;
    }
}

