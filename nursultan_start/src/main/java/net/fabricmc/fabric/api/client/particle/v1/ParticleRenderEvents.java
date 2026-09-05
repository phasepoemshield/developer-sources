/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.client.particle.v1;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleRenderEvents$AllowBlockDustTint;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class ParticleRenderEvents {
    public static final Event<ParticleRenderEvents$AllowBlockDustTint> ALLOW_BLOCK_DUST_TINT = EventFactory.createArrayBacked(ParticleRenderEvents$AllowBlockDustTint.class, particleRenderEvents$AllowBlockDustTintArray -> (class005002, class034482, class072092) -> {
        for (ParticleRenderEvents$AllowBlockDustTint particleRenderEvents$AllowBlockDustTint : particleRenderEvents$AllowBlockDustTintArray) {
            if (particleRenderEvents$AllowBlockDustTint.allowBlockDustTint(class005002, class034482, class072092)) continue;
            return false;
        }
        return true;
    });

    private ParticleRenderEvents() {
    }
}

