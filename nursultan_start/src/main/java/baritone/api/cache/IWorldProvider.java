/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.cache;

import baritone.api.cache.IWorldData;
import java.util.function.Consumer;

public interface IWorldProvider {
    default public void ifWorldLoaded(Consumer<IWorldData> consumer) {
        IWorldData iWorldData = this.getCurrentWorld();
        if (iWorldData != null) {
            consumer.accept(iWorldData);
        }
    }

    public IWorldData getCurrentWorld();
}

