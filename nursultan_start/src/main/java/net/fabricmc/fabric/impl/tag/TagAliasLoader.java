/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.DataResult$Success
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00751
 *  minecraft.class01012
 *  minecraft.class01073
 *  minecraft.class01079
 *  minecraft.class01894
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02003
 *  minecraft.class03069
 *  minecraft.class03530
 *  minecraft.class05946
 *  minecraft.class08326
 *  net.fabricmc.fabric.api.resource.v1.ResourceLoader
 *  net.fabricmc.fabric.api.resource.v1.reloader.SimpleResourceReloader
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.tag;

import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import minecraft.class00751;
import minecraft.class01012;
import minecraft.class01073;
import minecraft.class01079;
import minecraft.class01894;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02003;
import minecraft.class03069;
import minecraft.class03530;
import minecraft.class05946;
import minecraft.class08326;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.reloader.SimpleResourceReloader;
import net.fabricmc.fabric.impl.tag.SimpleRegistryExtension;
import net.fabricmc.fabric.impl.tag.TagAliasEnabledRegistryWrapper;
import net.fabricmc.fabric.impl.tag.TagAliasGroup;
import net.fabricmc.fabric.impl.tag.TagAliasLoader$Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class TagAliasLoader
extends SimpleResourceReloader<Map<class05946<? extends class00751<?>>, List<TagAliasLoader$Data>>> {
    public static final class01894 ID = class01894.N((String)"fabric-tag-api-v1", (String)"tag_alias_groups");
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"fabric-tag-api-v1");

    /*
     * Loose catch block
     */
    protected Map<class05946<? extends class00751<?>>, List<TagAliasLoader$Data>> prepare(class01073 class010732) {
        HashMap hashMap = new HashMap();
        class01929 class019292 = (class01929)class010732.N(ResourceLoader.RELOADER_REGISTRY_LOOKUP_KEY);
        Iterator iterator = class019292.y().iterator();
        while (iterator.hasNext()) {
            class05946 class059463 = (class05946)iterator.next();
            class03069 class030692 = class03069.N((String)TagAliasLoader.getDirectory(class059463));
            for (Map.Entry entry : class030692.N(class010732.N()).entrySet()) {
                class01894 class018942 = (class01894)entry.getKey();
                class01894 class018943 = class030692.y(class018942);
                try {
                    BufferedReader bufferedReader = ((class01079)entry.getValue()).method_43039();
                    try {
                        DataResult dataResult;
                        JsonElement jsonElement = class08326.N((Reader)bufferedReader);
                        Codec codec = TagAliasGroup.codec(class059463);
                        Objects.requireNonNull(codec.parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement));
                        int n = 0;
                        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{DataResult.Success.class, DataResult.Error.class}, (Object)dataResult, (int)n)) {
                            default: {
                                throw new MatchException(null, null);
                            }
                            case 0: {
                                Object object;
                                DataResult.Success success = (DataResult.Success)dataResult;
                                Object object2 = object = (TagAliasGroup)((Object)success.value());
                                Object object3 = object = success.lifecycle();
                                object = new TagAliasLoader$Data(class018943, (TagAliasGroup<?>)((Object)object2));
                                hashMap.computeIfAbsent(class059463, class059462 -> new ArrayList()).add(object);
                                break;
                            }
                            case 1: {
                                Object object = (DataResult.Error)dataResult;
                                LOGGER.error("[Fabric] Couldn't parse tag alias group file '{}' from '{}': {}", new Object[]{class018943, class018942, object.message()});
                                break;
                            }
                        }
                        continue;
                        catch (Throwable throwable) {
                            throw new MatchException(throwable.toString(), throwable);
                        }
                    }
                    finally {
                        if (bufferedReader == null) continue;
                        ((Reader)bufferedReader).close();
                    }
                }
                catch (JsonParseException | IOException throwable) {
                    LOGGER.error("[Fabric] Couldn't parse tag alias group file '{}' from '{}'", new Object[]{class018943, class018942, throwable});
                }
            }
        }
        return hashMap;
    }

    protected void apply(Map<class05946<? extends class00751<?>>, List<TagAliasLoader$Data>> map, class01073 class010732) {
        for (Map.Entry<class05946<class00751<?>>, List<TagAliasLoader$Data>> entry : map.entrySet()) {
            HashMap hashMap = new HashMap();
            for (TagAliasLoader$Data tagAliasLoader$Data : entry.getValue()) {
                HashSet hashSet = new HashSet(tagAliasLoader$Data.group.tags());
                for (class03530<?> class035302 : tagAliasLoader$Data.group.tags()) {
                    Set set2 = (Set)hashMap.get(class035302);
                    if (set2 != null) {
                        hashSet.addAll(set2);
                        for (class03530 class035303 : set2) {
                            hashMap.put(class035303, hashSet);
                        }
                    }
                    hashMap.put(class035302, hashSet);
                }
            }
            hashMap.values().removeIf(set -> set.size() == 1);
            class01921 class019212 = ((class01929)class010732.N(ResourceLoader.RELOADER_REGISTRY_LOOKUP_KEY)).y(entry.getKey());
            if (class019212 instanceof TagAliasEnabledRegistryWrapper) {
                TagAliasEnabledRegistryWrapper object = (TagAliasEnabledRegistryWrapper)class019212;
                object.fabric_loadTagAliases(hashMap);
                continue;
            }
            throw new ClassCastException("[Fabric] Couldn't apply tag aliases to registry wrapper %s (%s) since it doesn't implement TagAliasEnabledRegistryWrapper".formatted(new Object[]{class019212, entry.getKey().N()}));
        }
    }

    public static <T> void applyToDynamicRegistries(class02003<T> class020032, T t) {
        Iterator iterator = class020032.N(t).method_40311().iterator();
        while (iterator.hasNext()) {
            class00751 class007512 = ((class01012)iterator.next()).y();
            if (class007512 instanceof SimpleRegistryExtension) {
                SimpleRegistryExtension simpleRegistryExtension = (SimpleRegistryExtension)class007512;
                simpleRegistryExtension.fabric_applyPendingTagAliases();
                simpleRegistryExtension.fabric_refreshTags();
                continue;
            }
            throw new ClassCastException("[Fabric] Couldn't apply pending tag aliases to registry %s (%s) since it doesn't implement SimpleRegistryExtension".formatted(new Object[]{class007512, class007512.getClass().getName()}));
        }
    }

    private static String getDirectory(class05946<? extends class00751<?>> class059462) {
        Object object = "fabric/tag_alias/";
        class01894 class018942 = class059462.N();
        if (!"minecraft".equals(class018942.y())) {
            object = (String)object + class018942.y() + "/";
        }
        return (String)object + class018942.N();
    }
}

