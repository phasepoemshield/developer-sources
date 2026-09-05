/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class07094
 *  minecraft.class07125
 *  minecraft.class07529
 *  net.fabricmc.loader.api.ModContainer
 */
package net.fabricmc.fabric.api.datagen.v1;

import java.nio.file.Path;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class07094;
import minecraft.class07125;
import minecraft.class07529;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator$Pack;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.loader.api.ModContainer;

public final class FabricDataGenerator
extends class07094 {
    private final ModContainer modContainer;
    private final boolean strictValidation;
    private final FabricDataOutput fabricOutput;
    final CompletableFuture<class01929> registriesFuture;

    public ModContainer getModContainer() {
        return this.modContainer;
    }

    public FabricDataGenerator(Path path, ModContainer modContainer, boolean bl, CompletableFuture<class01929> completableFuture) {
        super(path, class07529.y(), true);
        this.modContainer = Objects.requireNonNull(modContainer);
        this.strictValidation = bl;
        this.fabricOutput = new FabricDataOutput(modContainer, path, bl);
        this.registriesFuture = completableFuture;
    }

    public boolean isStrictValidationEnabled() {
        return this.strictValidation;
    }

    public CompletableFuture<class01929> getRegistries() {
        return this.registriesFuture;
    }

    public String getModId() {
        return this.getModContainer().getMetadata().getId();
    }

    public FabricDataGenerator$Pack createBuiltinResourcePack(class01894 class018942) {
        Path path = this.field_40596.method_45971().resolve("resourcepacks").resolve(class018942.N());
        return new FabricDataGenerator$Pack(this, true, class018942.toString(), new FabricDataOutput(this.modContainer, path, this.strictValidation));
    }

    @Deprecated
    public class07125 method_46564(boolean bl) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public class07125 method_46565(boolean bl, String string) {
        throw new UnsupportedOperationException();
    }

    public FabricDataGenerator$Pack createPack() {
        return new FabricDataGenerator$Pack(this, true, this.modContainer.getMetadata().getName(), this.fabricOutput);
    }
}

