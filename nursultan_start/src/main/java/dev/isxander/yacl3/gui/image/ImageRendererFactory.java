/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.gui.image;

import dev.isxander.yacl3.gui.image.ImageRendererFactory$ImageSupplier;

public interface ImageRendererFactory {
    default public boolean requiresOffThreadPreparation() {
        return true;
    }

    public ImageRendererFactory$ImageSupplier prepareImage() throws Exception;
}

