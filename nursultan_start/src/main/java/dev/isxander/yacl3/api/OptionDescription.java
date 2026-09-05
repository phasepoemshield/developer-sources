/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.gui.image.ImageRenderer
 *  dev.isxander.yacl3.impl.OptionDescriptionImpl
 *  dev.isxander.yacl3.impl.OptionDescriptionImpl$BuilderImpl
 *  minecraft.class00392
 *  minecraft.class05220
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.api.OptionDescription$Builder;
import dev.isxander.yacl3.gui.image.ImageRenderer;
import dev.isxander.yacl3.impl.OptionDescriptionImpl;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class05220;

public interface OptionDescription {
    public static final OptionDescription EMPTY = new OptionDescriptionImpl(class05220.N, CompletableFuture.completedFuture(Optional.empty()));

    public CompletableFuture<Optional<ImageRenderer>> image();

    public static OptionDescription of(class00392 ... class00392Array) {
        return OptionDescription.createBuilder().text(class00392Array).build();
    }

    public class00392 text();

    public static OptionDescription$Builder createBuilder() {
        return new OptionDescriptionImpl.BuilderImpl();
    }
}

