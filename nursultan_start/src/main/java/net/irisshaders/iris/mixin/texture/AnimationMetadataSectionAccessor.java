/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.mixin.texture;

import java.util.Optional;

public interface AnimationMetadataSectionAccessor {
    public Optional<Integer> getFrameHeight();

    public void setFrameHeight(Optional<Integer> var1);

    public void setFrameWidth(Optional<Integer> var1);

    public Optional<Integer> getFrameWidth();
}

