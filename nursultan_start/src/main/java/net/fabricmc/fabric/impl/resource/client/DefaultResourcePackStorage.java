/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  com.google.gson.stream.JsonReader
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01055
 *  minecraft.class01622
 *  minecraft.class07001
 *  minecraft.class07713
 *  minecraft.class07726
 *  minecraft.class07742
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.resource.pack.FabricPack
 *  net.fabricmc.fabric.impl.resource.pack.ModNioPackResources
 *  net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator
 *  net.fabricmc.loader.api.FabricLoader
 *  org.slf4j.Logger
 */
package net.fabricmc.fabric.impl.resource.client;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import minecraft.class01055;
import minecraft.class01622;
import minecraft.class07001;
import minecraft.class07713;
import minecraft.class07726;
import minecraft.class07742;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.resource.pack.FabricPack;
import net.fabricmc.fabric.impl.resource.pack.ModNioPackResources;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;

@Environment(value=EnvType.CLIENT)
public final class DefaultResourcePackStorage {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final Path DATA_DIR = FabricLoader.getInstance().getGameDir().resolve("data");
    private static final Path TRACKER_FILE_PATH = DATA_DIR.resolve("fabric_default_resource_packs.json");
    private static final Path OLD_TRACKER_FILE_PATH = DATA_DIR.resolve("fabricDefaultResourcePacks.dat");
    private static final Codec<Set<String>> CODEC = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.listOf().fieldOf("values").forGetter(List::copyOf)).apply((Applicative)instance, Set::copyOf));

    private static void write(Set<String> set) {
        try {
            Files.writeString(TRACKER_FILE_PATH, (CharSequence)((JsonElement)CODEC.encodeStart((DynamicOps)JsonOps.INSTANCE, set).getOrThrow()).toString(), new OpenOption[0]);
        }
        catch (Exception exception) {
            LOGGER.warn("[Fabric Resource Loader] Could not read {}", (Object)TRACKER_FILE_PATH.toAbsolutePath(), (Object)exception);
        }
    }

    /*
     * Enabled aggressive exception aggregation
     */
    private static Set<String> read() {
        if (Files.exists(TRACKER_FILE_PATH, new LinkOption[0])) {
            try (BufferedReader bufferedReader = Files.newBufferedReader(TRACKER_FILE_PATH);){
                Set set;
                try (JsonReader jsonReader = new JsonReader((Reader)bufferedReader);){
                    set = (Set)CODEC.parse((DynamicOps)JsonOps.INSTANCE, (Object)JsonParser.parseReader((JsonReader)jsonReader)).getOrThrow();
                }
                return set;
            }
            catch (Exception exception) {
                LOGGER.warn("[Fabric Resource Loader] Could not read {}", (Object)TRACKER_FILE_PATH.toAbsolutePath(), (Object)exception);
            }
        }
        if (Files.exists(OLD_TRACKER_FILE_PATH, new LinkOption[0])) {
            try {
                class07001 class070012 = class07742.N((Path)OLD_TRACKER_FILE_PATH, (class07726)class07726.L());
                return CODEC.parse((DynamicOps)class07713.N, (Object)class070012).result().orElse(Set.of());
            }
            catch (Exception exception) {
                LOGGER.warn("[Fabric Resource Loader] Could not read {}", (Object)OLD_TRACKER_FILE_PATH.toAbsolutePath(), (Object)exception);
            }
        }
        return Set.of();
    }

    public static List<String> process(Collection<String> collection) {
        if (Files.notExists(DATA_DIR, new LinkOption[0])) {
            try {
                Files.createDirectories(DATA_DIR, new FileAttribute[0]);
            }
            catch (IOException iOException) {
                LOGGER.warn("[Fabric Resource Loader] Could not create data directory: {}", (Object)DATA_DIR.toAbsolutePath());
            }
        }
        HashSet<String> hashSet = new HashSet<String>(DefaultResourcePackStorage.read());
        HashSet<String> hashSet2 = new HashSet<String>(hashSet);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>(collection);
        ArrayList arrayList = new ArrayList();
        ModResourcePackCreator.CLIENT_RESOURCE_PACK_PROVIDER.method_14453(arrayList::add);
        for (class01055 class010552 : arrayList) {
            if (((FabricPack)class010552).fabric$isHidden()) continue;
            class01622 class016222 = class010552.R();
            try {
                ModNioPackResources modNioPackResources;
                if (!(class016222 instanceof ModNioPackResources) || !(modNioPackResources = (ModNioPackResources)class016222).getActivationType().isEnabledByDefault()) continue;
                if (hashSet.add(modNioPackResources.method_14409())) {
                    linkedHashSet.add(class010552.M());
                    continue;
                }
                hashSet2.remove(modNioPackResources.method_14409());
            }
            finally {
                if (class016222 == null) continue;
                class016222.close();
            }
        }
        hashSet.removeAll(hashSet2);
        DefaultResourcePackStorage.write(hashSet);
        return new ArrayList<String>(linkedHashSet);
    }
}

