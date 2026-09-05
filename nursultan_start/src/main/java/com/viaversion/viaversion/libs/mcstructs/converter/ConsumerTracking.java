/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.viaversion.viaversion.libs.mcstructs.converter;

import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface ConsumerTracking {
    default public void setCurrentConsumer(Consumer<String> consumer) {
    }

    default public ConsumerTracking forkIfDefault() {
        return this;
    }

    @Nullable
    default public Consumer<String> currentConsumer() {
        return null;
    }
}

