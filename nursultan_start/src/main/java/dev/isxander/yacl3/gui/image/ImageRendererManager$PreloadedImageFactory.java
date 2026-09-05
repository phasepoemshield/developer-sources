/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 */
package dev.isxander.yacl3.gui.image;

import dev.isxander.yacl3.gui.image.ImageRendererFactory;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class01894;

public record ImageRendererManager$PreloadedImageFactory(Predicate<class01894> predicate, Function<class01894, ImageRendererFactory> factory) {
}

