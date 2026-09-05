/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04410
 *  minecraft.class06166
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package net.fabricmc.fabric.mixin.client.particle;

import java.util.ArrayList;
import java.util.List;
import minecraft.class04410;
import minecraft.class06166;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(value=EnvType.CLIENT)
public interface ParticleEngineAccessor {
    @Accessor(value="field_17820")
    public static List<class06166> getParticleTextureSheets() {
        return new ArrayList<class06166>(class04410.L);
    }
}

