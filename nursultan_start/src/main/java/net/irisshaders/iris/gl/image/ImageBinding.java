/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.gl.image;

import java.util.function.IntSupplier;
import net.irisshaders.iris.gl.IrisRenderSystem;

public class ImageBinding {
    private final int imageUnit;
    private final int internalFormat;
    private final IntSupplier textureID;

    public ImageBinding(int n, int n2, IntSupplier intSupplier) {
        this.textureID = intSupplier;
        this.imageUnit = n;
        this.internalFormat = n2;
    }

    public void update() {
        IrisRenderSystem.bindImageTexture(this.imageUnit, this.textureID.getAsInt(), 0, true, 0, 35002, this.internalFormat);
    }
}

