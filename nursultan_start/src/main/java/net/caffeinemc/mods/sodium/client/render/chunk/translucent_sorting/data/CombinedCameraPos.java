/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3dc
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import org.joml.Vector3dc;
import org.joml.Vector3fc;

public interface CombinedCameraPos {
    public Vector3dc getAbsoluteCameraPos();

    public Vector3fc getRelativeCameraPos();
}

