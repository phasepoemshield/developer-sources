/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shadows;

import net.irisshaders.iris.shadows.ShadowRenderer;

public class ShadowRenderingState {
    public static int getRenderDistance() {
        return ShadowRenderer.renderDistance;
    }

    public static boolean areShadowsCurrentlyBeingRendered() {
        return ShadowRenderer.ACTIVE;
    }
}

