/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00392
 *  minecraft.class01055
 *  minecraft.class01057
 *  minecraft.class01093
 *  minecraft.class01247
 *  minecraft.class01603
 *  minecraft.class01612
 *  minecraft.class01622
 *  minecraft.class01623
 *  minecraft.class03776
 *  minecraft.class03794
 *  minecraft.class04173
 *  minecraft.class04548
 *  minecraft.class07529
 *  minecraft.class08735
 *  net.fabricmc.fabric.api.resource.v1.pack.ModPackResources
 *  net.fabricmc.fabric.api.resource.v1.pack.PackActivationType
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.metadata.CustomValue
 *  net.fabricmc.loader.api.metadata.CustomValue$CvObject
 *  net.fabricmc.loader.api.metadata.CustomValue$CvType
 *  net.fabricmc.loader.api.metadata.ModMetadata
 *  org.apache.commons.io.IOUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.resource.pack;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class01055;
import minecraft.class01057;
import minecraft.class01093;
import minecraft.class01247;
import minecraft.class01603;
import minecraft.class01612;
import minecraft.class01622;
import minecraft.class01623;
import minecraft.class03776;
import minecraft.class03794;
import minecraft.class04173;
import minecraft.class04548;
import minecraft.class07529;
import minecraft.class08735;
import net.fabricmc.fabric.api.resource.v1.pack.ModPackResources;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.fabric.impl.resource.pack.FabricPack;
import net.fabricmc.fabric.impl.resource.pack.ModNioPackResources;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesSorter;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil$Order;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.CustomValue;
import net.fabricmc.loader.api.metadata.ModMetadata;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ModPackResourcesUtil {
    public static final Gson GSON = new Gson();
    private static final Logger LOGGER = LoggerFactory.getLogger(ModPackResourcesUtil.class);
    private static final String LOAD_ORDER_KEY = "fabric:resource_load_order";

    private ModPackResourcesUtil() {
    }

    public static class00392 getName(ModMetadata modMetadata) {
        if (modMetadata.getId() != null) {
            return class00392.y((String)modMetadata.getId());
        }
        return class00392.N((String)"pack.name.fabricMod", (Object[])new Object[]{modMetadata.getId()});
    }

    public static void refreshAutoEnabledPacks(List<class01055> list, Map<String, class01055> map) {
        LOGGER.debug("[Fabric] Starting internal pack sorting with: {}", (Object)list.stream().map(class01055::M).toList());
        list.removeIf(class010552 -> ((FabricPack)class010552).fabric$isHidden());
        LOGGER.debug("[Fabric] Removed all internal packs, result: {}", (Object)list.stream().map(class01055::M).toList());
        ListIterator<class01055> listIterator = list.listIterator();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        while (listIterator.hasNext()) {
            class01055 class010553 = listIterator.next();
            linkedHashSet.add(class010553.M());
            for (class01055 class010554 : map.values()) {
                FabricPack fabricPack = (FabricPack)class010554;
                if (!fabricPack.fabric$isHidden() || !fabricPack.fabric$parentsEnabled(linkedHashSet) || !linkedHashSet.add(class010554.M())) continue;
                listIterator.add(class010554);
                LOGGER.debug("[Fabric] cur @ {}, auto-enabled {}, currently enabled: {}", new Object[]{class010553.M(), class010554.M(), linkedHashSet});
            }
        }
        LOGGER.debug("[Fabric] Final sorting result: {}", (Object)list.stream().map(class01055::M).toList());
    }

    public static JsonObject getMetadataPackJson(class08735 class087352, class00392 class003922, class01603 class016032) {
        return ((JsonElement)class01612.N((class01603)class016032).encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)ModPackResourcesUtil.getMetadataPack(class087352, class003922)).getOrThrow()).getAsJsonObject();
    }

    public static List<ModPackResources> getModResourcePacks(FabricLoader fabricLoader, class01603 class016032, @Nullable String string) {
        ModPackResourcesSorter modPackResourcesSorter = new ModPackResourcesSorter();
        Collection collection = fabricLoader.getAllMods();
        List list = collection.stream().map(ModContainer::getMetadata).map(ModMetadata::getId).toList();
        for (ModContainer modContainer : collection) {
            ModNioPackResources modNioPackResources;
            ModMetadata modMetadata = modContainer.getMetadata();
            String string2 = modMetadata.getId();
            if (modMetadata.getType().equals("builtin") || (modNioPackResources = ModNioPackResources.create(string2, modContainer, string, class016032, PackActivationType.ALWAYS_ENABLED, true)) == null) continue;
            modPackResourcesSorter.addPack(modNioPackResources);
            CustomValue customValue = modMetadata.getCustomValue(LOAD_ORDER_KEY);
            if (customValue == null) continue;
            if (customValue.getType() == CustomValue.CvType.OBJECT) {
                CustomValue.CvObject cvObject = customValue.getAsObject();
                ModPackResourcesUtil.addLoadOrdering(cvObject, list, modPackResourcesSorter, ModPackResourcesUtil$Order.BEFORE, string2);
                ModPackResourcesUtil.addLoadOrdering(cvObject, list, modPackResourcesSorter, ModPackResourcesUtil$Order.AFTER, string2);
                continue;
            }
            LOGGER.error("[Fabric] Resource load order should be an object");
        }
        return modPackResourcesSorter.getPacks();
    }

    public static class01247 createTestServerSettings(List<String> list, List<String> list2) {
        HashSet hashSet = new HashSet();
        ModResourcePackCreator modResourcePackCreator = new ModResourcePackCreator(class01603.field_14190);
        modResourcePackCreator.method_14453(class010552 -> hashSet.add(class010552.M()));
        ArrayList<String> arrayList = new ArrayList<String>();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if (!hashSet.contains(string)) continue;
            arrayList.add(string);
            iterator.remove();
        }
        list.addAll(arrayList);
        return new class01247(list, list2);
    }

    public static class01623 createClientManager() {
        return new class01623(new class01057[]{new class01093(new class04173(path -> true)), new ModResourcePackCreator(class01603.field_14190, true)});
    }

    public static String serializeMetadata(class08735 class087352, String string, class01603 class016032) {
        JsonObject jsonObject = ModPackResourcesUtil.getMetadataPackJson(class087352, (class00392)class00392.y((String)string), class016032);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add("pack", (JsonElement)jsonObject);
        return GSON.toJson((JsonElement)jsonObject2);
    }

    public static boolean containsDefault(String string, boolean bl) {
        return "pack.mcmeta".equals(string) || bl && "pack.png".equals(string);
    }

    public static class01612 getMetadataPack(class08735 class087352, class00392 class003922) {
        return new class01612(class003922, new class04548((Comparable)class087352));
    }

    public static InputStream openDefault(ModContainer modContainer, class01603 class016032, String string) throws IOException {
        switch (string) {
            case "pack.mcmeta": {
                String string2 = Objects.requireNonNullElse(modContainer.getMetadata().getId(), "");
                String string3 = ModPackResourcesUtil.serializeMetadata(class07529.y().method_70592(class016032), string2, class016032);
                return IOUtils.toInputStream((String)string3, (Charset)StandardCharsets.UTF_8);
            }
            case "pack.png": {
                Optional optional = modContainer.getMetadata().getIconPath(512).flatMap(arg_0 -> ((ModContainer)modContainer).findPath(arg_0));
                if (optional.isPresent()) {
                    return Files.newInputStream((Path)optional.get(), new OpenOption[0]);
                }
                return ModPackResourcesUtil.getDefaultIcon();
            }
        }
        return null;
    }

    public static InputStream getDefaultIcon() throws IOException {
        Optional optional = FabricLoader.getInstance().getModContainer("fabric-resource-loader-v1").flatMap(modContainer -> modContainer.getMetadata().getIconPath(512).flatMap(arg_0 -> ((ModContainer)modContainer).findPath(arg_0)));
        if (optional.isPresent()) {
            return Files.newInputStream((Path)optional.get(), new OpenOption[0]);
        }
        return null;
    }

    public static void addLoadOrdering(CustomValue.CvObject cvObject, List<String> list, ModPackResourcesSorter modPackResourcesSorter, ModPackResourcesUtil$Order modPackResourcesUtil$Order, String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        CustomValue customValue = cvObject.get(modPackResourcesUtil$Order.jsonKey);
        if (customValue == null) {
            return;
        }
        switch (customValue.getType()) {
            case STRING: {
                arrayList.add(customValue.getAsString());
                break;
            }
            case ARRAY: {
                for (CustomValue customValue2 : customValue.getAsArray()) {
                    if (customValue2.getType() != CustomValue.CvType.STRING) continue;
                    arrayList.add(customValue2.getAsString());
                }
                break;
            }
            default: {
                LOGGER.error("[Fabric] {} should be a string or an array", (Object)modPackResourcesUtil$Order.jsonKey);
                return;
            }
        }
        arrayList.stream().filter(list::contains).forEach(string2 -> modPackResourcesSorter.addLoadOrdering((String)string2, string, modPackResourcesUtil$Order));
    }

    public static class03776 createDefaultDataConfiguration() {
        ModResourcePackCreator modResourcePackCreator = new ModResourcePackCreator(class01603.field_14190);
        ArrayList arrayList = new ArrayList();
        modResourcePackCreator.method_14453(arrayList::add);
        ArrayList<String> arrayList2 = new ArrayList<String>(class01247.N.N());
        ArrayList<String> arrayList3 = new ArrayList<String>(class01247.N.y());
        for (class01055 class010552 : arrayList) {
            if (class010552.E() == ModResourcePackCreator.RESOURCE_PACK_SOURCE) {
                arrayList2.add(class010552.M());
                continue;
            }
            class01622 class016222 = class010552.R();
            try {
                ModNioPackResources modNioPackResources;
                if (class016222 instanceof ModNioPackResources && (modNioPackResources = (ModNioPackResources)class016222).getActivationType().isEnabledByDefault()) {
                    arrayList2.add(class010552.M());
                    continue;
                }
                arrayList3.add(class010552.M());
            }
            finally {
                if (class016222 == null) continue;
                class016222.close();
            }
        }
        return new class03776(new class01247(arrayList2, arrayList3), class03794.B);
    }
}

