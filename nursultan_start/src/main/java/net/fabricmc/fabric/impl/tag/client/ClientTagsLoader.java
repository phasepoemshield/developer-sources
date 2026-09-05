/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00751
 *  minecraft.class01208
 *  minecraft.class01215
 *  minecraft.class01894
 *  minecraft.class03530
 *  minecraft.class03932
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class08326
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.tag.client;

import com.google.gson.JsonElement;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashSet;
import minecraft.class00751;
import minecraft.class01208;
import minecraft.class01215;
import minecraft.class01894;
import minecraft.class03530;
import minecraft.class03932;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class08326;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.tag.client.ClientTagsLoader$1;
import net.fabricmc.fabric.impl.tag.client.ClientTagsLoader$LoadedTag;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public class ClientTagsLoader {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"fabric-client-tags-api-v1");

    public static ClientTagsLoader$LoadedTag loadTag(class03530<?> class035302) {
        Object object;
        Iterable<Path> iterable2;
        HashSet hashSet = new HashSet();
        HashSet<Path> hashSet2 = ClientTagsLoader.getTagFiles(class035302.N(), class035302.y());
        for (Iterable<Path> iterable2 : hashSet2) {
            try {
                object = Files.newBufferedReader(iterable2);
                try {
                    JsonElement jsonElement = class08326.N((Reader)object);
                    class01215 class012152 = class03932.N.parse(new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement)).result().orElse(null);
                    if (class012152 == null) continue;
                    if (class012152.y()) {
                        hashSet.clear();
                    }
                    hashSet.addAll(class012152.N());
                }
                finally {
                    if (object == null) continue;
                    ((BufferedReader)object).close();
                }
            }
            catch (IOException iOException) {
                LOGGER.error("Error loading tag: " + String.valueOf(class035302), (Throwable)iOException);
            }
        }
        HashSet hashSet3 = new HashSet();
        iterable2 = new HashSet();
        object = new HashSet();
        for (class01215 class012152 : hashSet) {
            class012152.method_26790((class01208)new ClientTagsLoader$1((HashSet)iterable2, class035302, (HashSet)object), hashSet3::add);
        }
        ((HashSet)object).remove(class035302);
        return new ClientTagsLoader$LoadedTag(Collections.unmodifiableSet(hashSet3), Collections.unmodifiableSet(object), Collections.unmodifiableSet(iterable2));
    }

    private static HashSet<Path> getResourcePaths(String string) {
        HashSet<Path> hashSet = new HashSet<Path>();
        for (ModContainer modContainer : FabricLoader.getInstance().getAllMods()) {
            modContainer.findPath(string).ifPresent(hashSet::add);
        }
        return hashSet;
    }

    private static HashSet<Path> getTagFiles(String string, class01894 class018942) {
        String string2 = "data/%s/%s/%s.json".formatted(new Object[]{class018942.y(), string, class018942.N()});
        return ClientTagsLoader.getResourcePaths(string2);
    }

    private static HashSet<Path> getTagFiles(class05946<? extends class00751<?>> class059462, class01894 class018942) {
        return ClientTagsLoader.getTagFiles(class04227.u(class059462), class018942);
    }
}

