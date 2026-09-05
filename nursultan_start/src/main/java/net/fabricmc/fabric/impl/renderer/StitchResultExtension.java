/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface StitchResultExtension {
    public @Nullable SpriteFinder fabric_spriteFinderNullable();
}

