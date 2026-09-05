/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMaps
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  java.lang.MatchException
 *  minecraft.class00500
 *  minecraft.class00507
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class03552
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class05946
 *  minecraft.class08092
 *  minecraft.class08743
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.shaderpack.materialmap.TagEntry
 */
package net.irisshaders.iris.shaderpack.materialmap;

import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import minecraft.class00500;
import minecraft.class00507;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class03552;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class05946;
import minecraft.class08092;
import minecraft.class08743;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.platform.IrisPlatformHelpers;
import net.irisshaders.iris.shaderpack.materialmap.BlockEntry;
import net.irisshaders.iris.shaderpack.materialmap.BlockRenderType;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.TagEntry;

public class BlockMaterialMapping {
    private static boolean checkState(class00500 class005002, Map<class08092<?>, String> map) {
        for (Map.Entry<class08092<?>, String> entry : map.entrySet()) {
            String string;
            class08092<?> class080922 = entry.getKey();
            String string2 = entry.getValue();
            if (string2.equals(string = class080922.y(class005002.L(class080922)))) continue;
            return false;
        }
        return true;
    }

    private static /* synthetic */ void lambda$createBlockStateIdMap$0(Object2IntMap object2IntMap, int n, List list) {
        for (BlockEntry blockEntry : list) {
            BlockMaterialMapping.addBlockStates(blockEntry, (Object2IntMap<class00500>)object2IntMap, n);
        }
    }

    private static /* synthetic */ void lambda$createBlockStateIdMap$1(Object2IntMap object2IntMap, int n, List list) {
        for (TagEntry tagEntry : list) {
            BlockMaterialMapping.addTag(tagEntry, (Object2IntMap<class00500>)object2IntMap, n);
        }
    }

    private static /* synthetic */ void lambda$createBlockTypeMap$5(Map map, NamespacedId namespacedId, BlockRenderType blockRenderType) {
        class01894 class018942 = class01894.N((String)namespacedId.getNamespace(), (String)namespacedId.getName());
        class00891 class008912 = (class00891)class04206.i.L(class018942).map(class03556::N).orElse(class00869.N);
        map.put(class008912, blockRenderType);
    }

    public static Map<class00891, BlockRenderType> createBlockTypeMap(Map<NamespacedId, BlockRenderType> map) {
        if (map.isEmpty()) {
            return Object2ObjectMaps.emptyMap();
        }
        Reference2ReferenceOpenHashMap reference2ReferenceOpenHashMap = new Reference2ReferenceOpenHashMap();
        map.forEach((arg_0, arg_1) -> BlockMaterialMapping.lambda$createBlockTypeMap$5((Map)reference2ReferenceOpenHashMap, arg_0, arg_1));
        return reference2ReferenceOpenHashMap;
    }

    private static void addTag(TagEntry tagEntry, Object2IntMap<class00500> object2IntMap, int n) {
        List list = class04206.i.U().filter(class035522 -> class035522.B().y().y().equalsIgnoreCase(tagEntry.id().getNamespace()) && class035522.B().y().N().equalsIgnoreCase(tagEntry.id().getName())).toList();
        if (list.isEmpty()) {
            if (IrisPlatformHelpers.getInstance().isDevelopmentEnvironment()) {
                Iris.logger.warn("Failed to find the tag " + String.valueOf(tagEntry.id()));
            }
        } else if (list.size() > 1) {
            Iris.logger.fatal("You've broke the system; congrats. More than one tag matched " + String.valueOf(tagEntry.id()));
        } else {
            class04206.i.u(((class03552)list.getFirst()).B()).forEach(class035562 -> {
                Map map = tagEntry.propertyPredicates();
                if (map.isEmpty()) {
                    for (class00500 class005002 : ((class00891)class035562.N()).E().N()) {
                        object2IntMap.putIfAbsent((Object)class005002, n);
                    }
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                class00507 class005072 = ((class00891)class035562.N()).E();
                map.forEach((string, string2) -> {
                    class08092 class080922 = class005072.N(string);
                    if (class080922 == null) {
                        Iris.logger.warn("Error while parsing the block ID map entry for tag \"block." + n + "\":");
                        Iris.logger.warn("- The block " + String.valueOf(((class05946)class035562.i().get()).N()) + " has no property with the name " + string + ", ignoring!");
                        return;
                    }
                    linkedHashMap.put((class08092<?>)class080922, (String)string2);
                });
                for (class00500 class005003 : class005072.N()) {
                    if (!BlockMaterialMapping.checkState(class005003, linkedHashMap)) continue;
                    object2IntMap.putIfAbsent((Object)class005003, n);
                }
            });
        }
    }

    public static class08743 convertBlockToRenderType(BlockRenderType blockRenderType) {
        if (blockRenderType == null) {
            return null;
        }
        return switch (blockRenderType) {
            default -> throw new MatchException(null, null);
            case BlockRenderType.SOLID -> class08743.field_60923;
            case BlockRenderType.CUTOUT -> class08743.field_60925;
            case BlockRenderType.CUTOUT_MIPPED -> class08743.field_60925;
            case BlockRenderType.TRANSLUCENT -> class08743.field_60926;
        };
    }

    public static Object2IntMap<class00500> createBlockStateIdMap(Int2ObjectLinkedOpenHashMap<List<BlockEntry>> int2ObjectLinkedOpenHashMap, Int2ObjectLinkedOpenHashMap<List<TagEntry>> int2ObjectLinkedOpenHashMap2) {
        Object2IntLinkedOpenHashMap object2IntLinkedOpenHashMap = new Object2IntLinkedOpenHashMap();
        object2IntLinkedOpenHashMap.defaultReturnValue(-1);
        int2ObjectLinkedOpenHashMap.forEach((arg_0, arg_1) -> BlockMaterialMapping.lambda$createBlockStateIdMap$0((Object2IntMap)object2IntLinkedOpenHashMap, arg_0, arg_1));
        int2ObjectLinkedOpenHashMap2.forEach((arg_0, arg_1) -> BlockMaterialMapping.lambda$createBlockStateIdMap$1((Object2IntMap)object2IntLinkedOpenHashMap, arg_0, arg_1));
        return object2IntLinkedOpenHashMap;
    }

    private static void addBlockStates(BlockEntry blockEntry, Object2IntMap<class00500> object2IntMap, int n) {
        class01894 class018942;
        NamespacedId namespacedId = blockEntry.id();
        try {
            class018942 = class01894.N((String)namespacedId.getNamespace(), (String)namespacedId.getName());
        }
        catch (Exception exception) {
            throw new IllegalStateException("Failed to get entry for " + n, exception);
        }
        class00891 class008912 = (class00891)class04206.i.L(class018942).map(class03556::N).orElse(class00869.N);
        if (class008912 == class00869.N) {
            return;
        }
        Map<String, String> map = blockEntry.propertyPredicates();
        if (map.isEmpty()) {
            for (class00500 class005002 : class008912.E().N()) {
                object2IntMap.putIfAbsent((Object)class005002, n);
            }
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        class00507 class005072 = class008912.E();
        map.forEach((string, string2) -> {
            class08092 class080922 = class005072.N(string);
            if (class080922 == null) {
                Iris.logger.warn("Error while parsing the block ID map entry for \"block." + n + "\":");
                Iris.logger.warn("- The block " + String.valueOf(class018942) + " has no property with the name " + string + ", ignoring!");
                return;
            }
            linkedHashMap.put((class08092<?>)class080922, (String)string2);
        });
        for (class00500 class005003 : class005072.N()) {
            if (!BlockMaterialMapping.checkState(class005003, linkedHashMap)) continue;
            object2IntMap.putIfAbsent((Object)class005003, n);
        }
    }
}

