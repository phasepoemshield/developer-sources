/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.gui.image.ImageRenderer
 *  minecraft.class00392
 *  minecraft.class01894
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.gui.image.ImageRenderer;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class01894;

public interface OptionDescription$Builder {
    public OptionDescription$Builder image(class01894 var1, float var2, float var3, int var4, int var5, int var6, int var7);

    public OptionDescription$Builder image(Path var1, class01894 var2);

    public OptionDescription$Builder image(class01894 var1, int var2, int var3);

    public OptionDescription build();

    public OptionDescription$Builder text(class00392 ... var1);

    public OptionDescription$Builder text(Collection<? extends class00392> var1);

    @Deprecated
    public OptionDescription$Builder gifImage(class01894 var1);

    @Deprecated
    public OptionDescription$Builder gifImage(Path var1, class01894 var2);

    public OptionDescription$Builder webpImage(Path var1, class01894 var2);

    public OptionDescription$Builder webpImage(class01894 var1);

    public OptionDescription$Builder customImage(CompletableFuture<Optional<ImageRenderer>> var1);

    default public OptionDescription$Builder customImage(ImageRenderer imageRenderer) {
        return this.customImage(CompletableFuture.completedFuture(Optional.of(imageRenderer)));
    }
}

