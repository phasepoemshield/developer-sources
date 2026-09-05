/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class04453
 *  minecraft.class04790
 *  org.jspecify.annotations.Nullable
 */
package net.irisshaders.iris.mixinterface;

import minecraft.class01421;
import minecraft.class04453;
import minecraft.class04790;
import net.irisshaders.iris.pathways.HandRenderer;
import org.jspecify.annotations.Nullable;

public interface ItemInHandInterface {
    default public void iris$renderHandsWithCustomRenderer(HandRenderer handRenderer, float f, class01421 class014212, class04790 class047902, @Nullable class04453 class044532, int n) {
        throw new AssertionError();
    }
}

