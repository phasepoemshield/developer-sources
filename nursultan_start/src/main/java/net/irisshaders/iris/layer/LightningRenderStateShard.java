/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.shaderpack.materialmap.NamespacedId
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 */
package net.irisshaders.iris.layer;

import net.irisshaders.iris.layer.GbufferPrograms;
import net.irisshaders.iris.layer.RenderingWrapper;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;

public class LightningRenderStateShard
implements RenderingWrapper {
    public static final LightningRenderStateShard INSTANCE = new LightningRenderStateShard();
    private static final NamespacedId LIGHT = new NamespacedId("minecraft", "lightning_bolt");
    private static int backupValue = 0;

    @Override
    public void clear() {
        if (WorldRenderingSettings.INSTANCE.getEntityIds() != null) {
            CapturedRenderingState.INSTANCE.setCurrentEntity(backupValue);
            backupValue = 0;
            GbufferPrograms.runFallbackEntityListener();
        }
    }

    @Override
    public void setup() {
        if (WorldRenderingSettings.INSTANCE.getEntityIds() != null) {
            backupValue = CapturedRenderingState.INSTANCE.getCurrentRenderedEntity();
            CapturedRenderingState.INSTANCE.setCurrentEntity(WorldRenderingSettings.INSTANCE.getEntityIds().applyAsInt((Object)LIGHT));
            GbufferPrograms.runFallbackEntityListener();
        }
    }
}

