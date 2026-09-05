/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  minecraft.class01894
 *  minecraft.class07001
 *  minecraft.class07709
 */
package net.fabricmc.fabric.impl.registry.sync;

import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.LinkedHashMap;
import java.util.Map;
import minecraft.class01894;
import minecraft.class07001;
import minecraft.class07709;

public class RegistryMapSerializer {
    public static final int VERSION = 1;

    public static class07001 toNbt(Map<class01894, Object2IntMap<class01894>> map) {
        class07001 class070012 = new class07001();
        map.forEach((class018942, object2IntMap) -> {
            class07001 class070013 = new class07001();
            for (Object2IntMap.Entry entry : object2IntMap.object2IntEntrySet()) {
                class070013.N(((class01894)entry.getKey()).toString(), entry.getIntValue());
            }
            class070012.N(class018942.toString(), (class07709)class070013);
        });
        class07001 class070013 = new class07001();
        class070013.N("version", 1);
        class070013.N("registries", (class07709)class070012);
        return class070013;
    }

    public static Map<class01894, Object2IntMap<class01894>> fromNbt(class07001 class070012) {
        class07001 class070013 = (class07001)class070012.W("registries").orElseThrow();
        LinkedHashMap<class01894, Object2IntMap<class01894>> linkedHashMap = new LinkedHashMap<class01894, Object2IntMap<class01894>>();
        for (String string : class070013.i()) {
            Object2IntLinkedOpenHashMap object2IntLinkedOpenHashMap = new Object2IntLinkedOpenHashMap();
            class07001 class070014 = (class07001)class070013.W(string).orElseThrow();
            for (String string2 : class070014.i()) {
                object2IntLinkedOpenHashMap.put((Object)class01894.N((String)string2), class070014.y(string2, 0));
            }
            linkedHashMap.put(class01894.N((String)string), (Object2IntMap<class01894>)object2IntLinkedOpenHashMap);
        }
        return linkedHashMap;
    }
}

