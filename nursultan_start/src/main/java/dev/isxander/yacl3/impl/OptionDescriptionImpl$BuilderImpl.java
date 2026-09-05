/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionDescription$Builder
 *  dev.isxander.yacl3.debug.DebugProperties
 *  dev.isxander.yacl3.gui.image.ImageRenderer
 *  dev.isxander.yacl3.gui.image.ImageRendererManager
 *  dev.isxander.yacl3.gui.image.impl.AnimatedDynamicTextureImage
 *  dev.isxander.yacl3.gui.image.impl.DynamicTextureImage
 *  dev.isxander.yacl3.gui.image.impl.ResourceTextureImage
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05216
 *  org.apache.commons.lang3.Validate
 */
package dev.isxander.yacl3.impl;

import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.debug.DebugProperties;
import dev.isxander.yacl3.gui.image.ImageRenderer;
import dev.isxander.yacl3.gui.image.ImageRendererManager;
import dev.isxander.yacl3.gui.image.impl.AnimatedDynamicTextureImage;
import dev.isxander.yacl3.gui.image.impl.DynamicTextureImage;
import dev.isxander.yacl3.gui.image.impl.ResourceTextureImage;
import dev.isxander.yacl3.impl.OptionDescriptionImpl;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class05216;
import org.apache.commons.lang3.Validate;

public class OptionDescriptionImpl$BuilderImpl
implements OptionDescription.Builder {
    private final List<class00392> descriptionLines = new ArrayList<class00392>();
    private CompletableFuture<Optional<ImageRenderer>> image = CompletableFuture.completedFuture(Optional.empty());
    private boolean imageUnset = true;

    public OptionDescription.Builder image(class01894 class018942, int n, int n2) {
        Validate.isTrue((boolean)this.imageUnset, (String)"Image already set!", (Object[])new Object[0]);
        Validate.isTrue((n > 0 ? 1 : 0) != 0, (String)"Width must be greater than 0!", (Object[])new Object[0]);
        Validate.isTrue((n2 > 0 ? 1 : 0) != 0, (String)"Height must be greater than 0!", (Object[])new Object[0]);
        this.image = ImageRendererManager.registerOrGetImage((class01894)class018942, () -> ResourceTextureImage.createFactory((class01894)class018942, (float)0.0f, (float)0.0f, (int)n, (int)n2, (int)n, (int)n2)).thenApply(Optional::of);
        this.imageUnset = false;
        return this;
    }

    public OptionDescription.Builder image(class01894 class018942, float f, float f2, int n, int n2, int n3, int n4) {
        Validate.isTrue((boolean)this.imageUnset, (String)"Image already set!", (Object[])new Object[0]);
        Validate.isTrue((n > 0 ? 1 : 0) != 0, (String)"Width must be greater than 0!", (Object[])new Object[0]);
        Validate.isTrue((n2 > 0 ? 1 : 0) != 0, (String)"Height must be greater than 0!", (Object[])new Object[0]);
        this.image = ImageRendererManager.registerOrGetImage((class01894)class018942, () -> ResourceTextureImage.createFactory((class01894)class018942, (float)f, (float)f2, (int)n, (int)n2, (int)n3, (int)n4)).thenApply(Optional::of);
        this.imageUnset = false;
        return this;
    }

    public OptionDescription.Builder image(Path path, class01894 class018942) {
        Validate.isTrue((boolean)this.imageUnset, (String)"Image already set!", (Object[])new Object[0]);
        this.image = ImageRendererManager.registerOrGetImage((class01894)class018942, () -> DynamicTextureImage.fromPath((Path)path, (class01894)class018942, (boolean)DebugProperties.IMAGE_FILTERING)).thenApply(Optional::of);
        this.imageUnset = false;
        return this;
    }

    public OptionDescription build() {
        class05216 class052162 = class00392.i();
        Iterator<class00392> iterator = this.descriptionLines.iterator();
        while (iterator.hasNext()) {
            class052162.y(iterator.next());
            if (!iterator.hasNext()) continue;
            class052162.i("\n");
        }
        return new OptionDescriptionImpl((class00392)class052162, this.image);
    }

    public OptionDescription.Builder text(Collection<? extends class00392> collection) {
        this.descriptionLines.addAll(collection);
        return this;
    }

    public OptionDescription.Builder text(class00392 ... class00392Array) {
        this.descriptionLines.addAll(Arrays.asList(class00392Array));
        return this;
    }

    public OptionDescription.Builder gifImage(Path path, class01894 class018942) {
        Validate.isTrue((boolean)this.imageUnset, (String)"Image already set!", (Object[])new Object[0]);
        this.image = ImageRendererManager.registerOrGetImage((class01894)class018942, () -> AnimatedDynamicTextureImage.createGIFFromPath((Path)path, (class01894)class018942)).thenApply(Optional::of);
        this.imageUnset = false;
        return this;
    }

    public OptionDescription.Builder gifImage(class01894 class018942) {
        Validate.isTrue((boolean)this.imageUnset, (String)"Image already set!", (Object[])new Object[0]);
        this.image = ImageRendererManager.registerOrGetImage((class01894)class018942, () -> AnimatedDynamicTextureImage.createGIFFromTexture((class01894)class018942)).thenApply(Optional::of);
        this.imageUnset = false;
        return this;
    }

    public OptionDescription.Builder webpImage(Path path, class01894 class018942) {
        Validate.isTrue((boolean)this.imageUnset, (String)"Image already set!", (Object[])new Object[0]);
        this.image = ImageRendererManager.registerOrGetImage((class01894)class018942, () -> AnimatedDynamicTextureImage.createWEBPFromPath((Path)path, (class01894)class018942)).thenApply(Optional::of);
        this.imageUnset = false;
        return this;
    }

    public OptionDescription.Builder webpImage(class01894 class018942) {
        Validate.isTrue((boolean)this.imageUnset, (String)"Image already set!", (Object[])new Object[0]);
        this.image = ImageRendererManager.registerOrGetImage((class01894)class018942, () -> AnimatedDynamicTextureImage.createWEBPFromTexture((class01894)class018942)).thenApply(Optional::of);
        this.imageUnset = false;
        return this;
    }

    public OptionDescription.Builder customImage(CompletableFuture<Optional<ImageRenderer>> completableFuture) {
        Validate.notNull(completableFuture, (String)"Image cannot be null!", (Object[])new Object[0]);
        Validate.isTrue((boolean)this.imageUnset, (String)"Image already set!", (Object[])new Object[0]);
        this.image = completableFuture;
        this.imageUnset = false;
        return this;
    }
}

