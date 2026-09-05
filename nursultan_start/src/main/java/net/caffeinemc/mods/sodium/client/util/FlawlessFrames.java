/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;

public class FlawlessFrames {
    private static final Set<Object> ACTIVE = Collections.newSetFromMap(new ConcurrentHashMap());
    private static final Function<String, Consumer<Boolean>> PROVIDER = string -> {
        Object object = new Object();
        return bl -> {
            if (bl.booleanValue()) {
                ACTIVE.add(object);
            } else {
                ACTIVE.remove(object);
            }
        };
    };

    public static Function<String, Consumer<Boolean>> getProvider() {
        return PROVIDER;
    }

    public static boolean isActive() {
        return !ACTIVE.isEmpty();
    }
}

