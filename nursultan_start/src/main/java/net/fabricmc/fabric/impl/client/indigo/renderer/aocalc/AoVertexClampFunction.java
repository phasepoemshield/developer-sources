/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.aocalc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.indigo.Indigo;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
interface AoVertexClampFunction {
    public static final AoVertexClampFunction CLAMP_FUNC = Indigo.FIX_EXTERIOR_VERTEX_LIGHTING ? f -> f < 0.0f ? 0.0f : (f > 1.0f ? 1.0f : f) : f -> f;

    public float clamp(float var1);
}

