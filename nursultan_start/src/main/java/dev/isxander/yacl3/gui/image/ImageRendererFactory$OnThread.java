/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.gui.image;

import dev.isxander.yacl3.gui.image.ImageRendererFactory;

public interface ImageRendererFactory$OnThread
extends ImageRendererFactory {
    @Override
    default public boolean requiresOffThreadPreparation() {
        return false;
    }
}

