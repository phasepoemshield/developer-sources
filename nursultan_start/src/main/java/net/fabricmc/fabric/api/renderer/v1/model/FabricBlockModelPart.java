/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 *  minecraft.class08877
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.renderer.VanillaBlockModelPartEncoder
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.renderer.v1.model;

import java.util.function.Predicate;
import minecraft.class07211;
import minecraft.class08877;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.impl.renderer.VanillaBlockModelPartEncoder;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface FabricBlockModelPart {
    default public void emitQuads(QuadEmitter quadEmitter, Predicate<@Nullable class07211> predicate) {
        VanillaBlockModelPartEncoder.emitQuads((class08877)((class08877)this), (QuadEmitter)quadEmitter, predicate);
    }
}

