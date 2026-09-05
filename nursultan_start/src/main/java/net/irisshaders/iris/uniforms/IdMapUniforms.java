/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntFunction
 *  minecraft.class07050
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.shaderpack.IdMap
 *  net.irisshaders.iris.shaderpack.materialmap.NamespacedId
 */
package net.irisshaders.iris.uniforms;

import it.unimi.dsi.fastutil.objects.Object2IntFunction;
import minecraft.class07050;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.shaderpack.IdMap;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.uniforms.FrameUpdateNotifier;
import net.irisshaders.iris.uniforms.IdMapUniforms$HeldItemSupplier;

public final class IdMapUniforms {
    private IdMapUniforms() {
    }

    public static void addIdMapUniforms(FrameUpdateNotifier frameUpdateNotifier, UniformHolder uniformHolder, IdMap idMap, boolean bl) {
        IdMapUniforms$HeldItemSupplier idMapUniforms$HeldItemSupplier = new IdMapUniforms$HeldItemSupplier(class07050.field_5808, (Object2IntFunction<NamespacedId>)idMap.getItemIdMap(), bl);
        IdMapUniforms$HeldItemSupplier idMapUniforms$HeldItemSupplier2 = new IdMapUniforms$HeldItemSupplier(class07050.field_5810, (Object2IntFunction<NamespacedId>)idMap.getItemIdMap(), false);
        frameUpdateNotifier.addListener(idMapUniforms$HeldItemSupplier::update);
        frameUpdateNotifier.addListener(idMapUniforms$HeldItemSupplier2::update);
        uniformHolder.uniform1i(UniformUpdateFrequency.PER_FRAME, "heldItemId", idMapUniforms$HeldItemSupplier::getIntID).uniform1i(UniformUpdateFrequency.PER_FRAME, "heldItemId2", idMapUniforms$HeldItemSupplier2::getIntID).uniform1i(UniformUpdateFrequency.PER_FRAME, "heldBlockLightValue", idMapUniforms$HeldItemSupplier::getLightValue).uniform1i(UniformUpdateFrequency.PER_FRAME, "heldBlockLightValue2", idMapUniforms$HeldItemSupplier2::getLightValue).uniform3f(UniformUpdateFrequency.PER_FRAME, "heldBlockLightColor", idMapUniforms$HeldItemSupplier::getLightColor).uniform3f(UniformUpdateFrequency.PER_FRAME, "heldBlockLightColor2", idMapUniforms$HeldItemSupplier2::getLightColor);
    }
}

