/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util;

import java.util.Collection;

public class ListUtil {
    public static <T> void updateList(Collection<T> collection, Collection<T> collection2, Collection<T> collection3) {
        if (!collection2.isEmpty()) {
            collection.removeAll(collection2);
        }
        if (!collection3.isEmpty()) {
            collection.addAll(collection3);
        }
    }
}

