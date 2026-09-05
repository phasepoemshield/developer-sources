/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3dc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger;

import org.joml.Vector3dc;

public record CameraMovement(Vector3dc start, Vector3dc end) {
    public boolean hasChanged() {
        return !this.start.equals((Object)this.end);
    }
}

