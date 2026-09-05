/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.gui.image.ImageRenderer
 */
package dev.isxander.yacl3.config.v2.impl.autogen;

import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.CustomImage$CustomImageFactory;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.gui.image.ImageRenderer;
import java.util.concurrent.CompletableFuture;

public class EmptyCustomImageFactory
implements CustomImage$CustomImageFactory<Object> {
    @Override
    public CompletableFuture<ImageRenderer> createImage(Object object, ConfigField<Object> configField, OptionAccess optionAccess) {
        throw new IllegalStateException();
    }
}

