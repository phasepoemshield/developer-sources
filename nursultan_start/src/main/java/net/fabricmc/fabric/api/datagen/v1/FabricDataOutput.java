/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01996
 *  net.fabricmc.loader.api.ModContainer
 */
package net.fabricmc.fabric.api.datagen.v1;

import java.nio.file.Path;
import minecraft.class01996;
import net.fabricmc.loader.api.ModContainer;

public final class FabricDataOutput
extends class01996 {
    private final ModContainer modContainer;
    private final boolean strictValidation;

    public ModContainer getModContainer() {
        return this.modContainer;
    }

    public FabricDataOutput(ModContainer modContainer, Path path, boolean bl) {
        super(path);
        this.modContainer = modContainer;
        this.strictValidation = bl;
    }

    public boolean isStrictValidationEnabled() {
        return this.strictValidation;
    }

    public String getModId() {
        return this.getModContainer().getMetadata().getId();
    }
}

