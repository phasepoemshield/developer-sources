/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.gui.image.ImageRenderer
 */
package dev.isxander.yacl3.config.v2.api.autogen;

import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.gui.image.ImageRenderer;
import java.util.concurrent.CompletableFuture;

public interface CustomImage$CustomImageFactory<T> {
    public CompletableFuture<ImageRenderer> createImage(T var1, ConfigField<T> var2, OptionAccess var3);
}

