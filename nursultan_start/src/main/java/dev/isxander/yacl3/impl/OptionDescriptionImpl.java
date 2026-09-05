/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.gui.image.ImageRenderer
 *  minecraft.class00392
 */
package dev.isxander.yacl3.impl;

import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.gui.image.ImageRenderer;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;

public record OptionDescriptionImpl(class00392 text, CompletableFuture<Optional<ImageRenderer>> image) implements OptionDescription
{
}

