/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.event.lifecycle.v1;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents$TagsLoaded;

public final class CommonLifecycleEvents {
    public static final Event<CommonLifecycleEvents$TagsLoaded> TAGS_LOADED = EventFactory.createArrayBacked(CommonLifecycleEvents$TagsLoaded.class, commonLifecycleEvents$TagsLoadedArray -> (class010422, bl) -> {
        for (CommonLifecycleEvents$TagsLoaded commonLifecycleEvents$TagsLoaded : commonLifecycleEvents$TagsLoadedArray) {
            commonLifecycleEvents$TagsLoaded.onTagsLoaded(class010422, bl);
        }
    });

    private CommonLifecycleEvents() {
    }
}

