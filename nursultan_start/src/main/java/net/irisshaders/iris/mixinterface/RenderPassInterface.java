/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.mixinterface;

import net.irisshaders.iris.mixinterface.CustomPass;

public interface RenderPassInterface {
    default public void iris$setCustomPass(CustomPass customPass) {
        throw new UnsupportedOperationException();
    }

    default public CustomPass iris$getCustomPass() {
        throw new UnsupportedOperationException();
    }
}

