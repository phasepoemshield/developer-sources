/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class05946
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.tag.client.ClientTagsImpl
 */
package net.fabricmc.fabric.api.tag.client.v1;

import java.util.Objects;
import java.util.Set;
import minecraft.class01894;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class05946;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.tag.client.ClientTagsImpl;

@Environment(value=EnvType.CLIENT)
public final class ClientTags {
    private ClientTags() {
    }

    public static <T> boolean isInWithLocalFallback(class03530<T> class035302, class03556<T> class035562) {
        Objects.requireNonNull(class035302);
        Objects.requireNonNull(class035562);
        return ClientTagsImpl.isInWithLocalFallback(class035302, class035562);
    }

    public static <T> boolean isInWithLocalFallback(class03530<T> class035302, T t) {
        Objects.requireNonNull(class035302);
        Objects.requireNonNull(t);
        return ClientTagsImpl.getRegistryEntry(class035302, t).map(class035562 -> ClientTags.isInWithLocalFallback(class035302, class035562)).orElse(false);
    }

    public static Set<class01894> getOrCreateLocalTag(class03530<?> class035302) {
        return ClientTagsImpl.getOrCreatePartiallySyncedTag(class035302).completeIds();
    }

    public static <T> boolean isInLocal(class03530<T> class035302, class05946<T> class059462) {
        Objects.requireNonNull(class035302);
        Objects.requireNonNull(class059462);
        if (class035302.N().N().equals((Object)class059462.y())) {
            Set<class01894> set = ClientTags.getOrCreateLocalTag(class035302);
            return set.contains(class059462.N());
        }
        return false;
    }
}

