/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class03448
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class05946
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.tag.client;

import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import minecraft.class00751;
import minecraft.class03448;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class05946;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.tag.client.ClientTagsLoader;
import net.fabricmc.fabric.impl.tag.client.ClientTagsLoader$LoadedTag;

@Environment(value=EnvType.CLIENT)
public class ClientTagsImpl {
    private static final Map<class03530<?>, ClientTagsLoader$LoadedTag> LOCAL_TAG_HIERARCHY = new ConcurrentHashMap();

    public static <T> Optional<? extends class00751<T>> getRegistry(class03530<T> class035302) {
        Optional optional;
        Objects.requireNonNull(class035302);
        if (class06202.Nq() != null && (class03448)class06202.Nq().T_3 != null && ((class03448)class06202.Nq().T_3).method_30349() != null && (optional = ((class03448)class06202.Nq().T_3).method_30349().method_46759(class035302.N())).isPresent()) {
            return optional;
        }
        return class04206.NF.y(class035302.N().N());
    }

    public static <T> Optional<class03556<T>> getRegistryEntry(class03530<T> class035302, T t) {
        Optional<class00751<T>> optional = ClientTagsImpl.getRegistry(class035302);
        if (optional.isEmpty() || !class035302.u(optional.get().i())) {
            return Optional.empty();
        }
        class00751<T> class007512 = optional.get();
        Optional optional2 = class007512.u(t);
        return optional2.map(arg_0 -> class007512.y(arg_0));
    }

    public static <T> boolean isInWithLocalFallback(class03530<T> class035302, class03556<T> class035562) {
        return ClientTagsImpl.isInWithLocalFallback(class035302, class035562, new HashSet<class03530<T>>());
    }

    private static <T> boolean isInWithLocalFallback(class03530<T> class035302, class03556<T> class035562, Set<class03530<T>> set) {
        if (set.contains(class035302)) {
            return false;
        }
        set.add(class035302);
        Optional<class00751<T>> optional = ClientTagsImpl.getRegistry(class035302);
        if (optional.isPresent() && optional.get().N(class035302).isPresent()) {
            return class035562.N(class035302);
        }
        if (class035562.i().isEmpty()) {
            return false;
        }
        ClientTagsLoader$LoadedTag clientTagsLoader$LoadedTag = ClientTagsImpl.getOrCreatePartiallySyncedTag(class035302);
        if (clientTagsLoader$LoadedTag.immediateChildIds().contains(((class05946)class035562.i().get()).N())) {
            return true;
        }
        for (class03530<?> class035303 : clientTagsLoader$LoadedTag.immediateChildTags()) {
            if (ClientTagsImpl.isInWithLocalFallback(class035303, class035562, set)) {
                return true;
            }
            set.add(class035303);
        }
        return false;
    }

    public static ClientTagsLoader$LoadedTag getOrCreatePartiallySyncedTag(class03530<?> class035302) {
        ClientTagsLoader$LoadedTag clientTagsLoader$LoadedTag = LOCAL_TAG_HIERARCHY.get(class035302);
        if (clientTagsLoader$LoadedTag == null) {
            clientTagsLoader$LoadedTag = ClientTagsLoader.loadTag(class035302);
            LOCAL_TAG_HIERARCHY.put(class035302, clientTagsLoader$LoadedTag);
        }
        return clientTagsLoader$LoadedTag;
    }
}

