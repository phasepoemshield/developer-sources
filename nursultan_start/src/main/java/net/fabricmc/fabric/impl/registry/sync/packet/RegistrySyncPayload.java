/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  minecraft.class00667
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class05946
 *  net.fabricmc.fabric.api.event.registry.RegistryAttribute
 *  net.fabricmc.fabric.api.event.registry.RegistryAttributeHolder
 */
package net.fabricmc.fabric.impl.registry.sync.packet;

import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class05946;
import net.fabricmc.fabric.api.event.registry.RegistryAttribute;
import net.fabricmc.fabric.api.event.registry.RegistryAttributeHolder;
import net.fabricmc.fabric.impl.registry.sync.RegistryAttributeImpl;

public record RegistrySyncPayload(Map<class01894, Object2IntMap<class01894>> registryMap, Map<class01894, EnumSet<RegistryAttribute>> registryAttributes) implements class01659
{
    public static final class01666<RegistrySyncPayload> ID = new class01666(class01894.N((String)"fabric", (String)"registry/sync"));
    public static final class02362<class00667, RegistrySyncPayload> CODEC = class01659.N(RegistrySyncPayload::write, RegistrySyncPayload::read);

    public RegistrySyncPayload(Map<class01894, Object2IntMap<class01894>> map) {
        this(map, RegistrySyncPayload.getRegistryAttributeMap(map));
    }

    private void write(class00667 class006672) {
        Map<String, List<class01894>> map = this.registryMap.keySet().stream().collect(Collectors.groupingBy(class01894::y));
        class006672.L(map.size());
        map.forEach((string, list) -> {
            class006672.N(RegistrySyncPayload.optimizeNamespace(string));
            class006672.L(list.size());
            for (class01894 class018942 : list) {
                class006672.N(class018942.N());
                class006672.writeByte((int)RegistrySyncPayload.encodeRegistryAttributes(this.registryAttributes.getOrDefault(class018942, EnumSet.noneOf(RegistryAttribute.class))));
                Object2IntMap<class01894> object2IntMap = this.registryMap.get(class018942);
                Map map = object2IntMap.object2IntEntrySet().stream().collect(Collectors.groupingBy(entry -> ((class01894)entry.getKey()).y(), LinkedHashMap::new, Collectors.toCollection(ArrayList::new)));
                class006672.L(map.size());
                int n = 0;
                for (Map.Entry entry2 : map.entrySet()) {
                    List list2 = (List)entry2.getValue();
                    list2.sort(Comparator.comparingInt(Object2IntMap.Entry::getIntValue));
                    ArrayList arrayList = new ArrayList();
                    Iterator iterator = list2.iterator();
                    ArrayList<Object2IntMap.Entry> arrayList2 = new ArrayList<Object2IntMap.Entry>();
                    Object2IntMap.Entry entry3 = (Object2IntMap.Entry)iterator.next();
                    arrayList2.add(entry3);
                    while (iterator.hasNext()) {
                        entry3 = (Object2IntMap.Entry)iterator.next();
                        if (((Object2IntMap.Entry)arrayList2.get(arrayList2.size() - 1)).getIntValue() + 1 != entry3.getIntValue()) {
                            arrayList.add(arrayList2);
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(entry3);
                    }
                    arrayList.add(arrayList2);
                    class006672.N(RegistrySyncPayload.optimizeNamespace((String)entry2.getKey()));
                    class006672.L(arrayList.size());
                    for (List list3 : arrayList) {
                        int n2 = ((Object2IntMap.Entry)list3.get(0)).getIntValue();
                        int n3 = n2 - n;
                        class006672.L(n3);
                        class006672.L(list3.size());
                        for (Object2IntMap.Entry entry4 : list3) {
                            class006672.N(((class01894)entry4.getKey()).N());
                            n = entry4.getIntValue();
                        }
                    }
                }
            }
        });
    }

    private static RegistrySyncPayload read(class00667 class006672) {
        LinkedHashMap<class01894, Object2IntMap<class01894>> linkedHashMap = new LinkedHashMap<class01894, Object2IntMap<class01894>>();
        LinkedHashMap<class01894, EnumSet<RegistryAttribute>> linkedHashMap2 = new LinkedHashMap<class01894, EnumSet<RegistryAttribute>>();
        int n = class006672.E();
        for (int i = 0; i < n; ++i) {
            String string = RegistrySyncPayload.unoptimizeNamespace(class006672.s());
            int n2 = class006672.E();
            for (int j = 0; j < n2; ++j) {
                String string2 = class006672.s();
                EnumSet<RegistryAttribute> enumSet = RegistrySyncPayload.decodeRegistryAttributes(class006672.readByte());
                Object2IntLinkedOpenHashMap object2IntLinkedOpenHashMap = new Object2IntLinkedOpenHashMap();
                int n3 = class006672.E();
                int n4 = 0;
                for (int k = 0; k < n3; ++k) {
                    String string3 = RegistrySyncPayload.unoptimizeNamespace(class006672.s());
                    int n5 = class006672.E();
                    for (int i2 = 0; i2 < n5; ++i2) {
                        int n6 = class006672.E();
                        int n7 = class006672.E();
                        int n8 = n4 + n6 - 1;
                        for (int i3 = 0; i3 < n7; ++i3) {
                            String string4 = class006672.s();
                            object2IntLinkedOpenHashMap.put((Object)class01894.N((String)string3, (String)string4), ++n8);
                        }
                        n4 = n8;
                    }
                }
                class01894 class018942 = class01894.N((String)string, (String)string2);
                linkedHashMap.put(class018942, (Object2IntMap<class01894>)object2IntLinkedOpenHashMap);
                linkedHashMap2.put(class018942, enumSet);
            }
        }
        return new RegistrySyncPayload(linkedHashMap, linkedHashMap2);
    }

    public class01666<RegistrySyncPayload> method_56479() {
        return ID;
    }

    private static Map<class01894, EnumSet<RegistryAttribute>> getRegistryAttributeMap(Map<class01894, Object2IntMap<class01894>> map) {
        LinkedHashMap<class01894, EnumSet<RegistryAttribute>> linkedHashMap = new LinkedHashMap<class01894, EnumSet<RegistryAttribute>>();
        map.forEach((class018942, object2IntMap) -> {
            class05946 class059462 = class05946.N((class01894)class018942);
            RegistryAttributeImpl registryAttributeImpl = (RegistryAttributeImpl)RegistryAttributeHolder.get((class05946)class059462);
            linkedHashMap.put((class01894)class018942, registryAttributeImpl.getAttributes());
        });
        return linkedHashMap;
    }

    private static String unoptimizeNamespace(String string) {
        return string.isEmpty() ? "minecraft" : string;
    }

    private static byte encodeRegistryAttributes(EnumSet<RegistryAttribute> enumSet) {
        byte by = 0;
        if (enumSet.contains(RegistryAttribute.OPTIONAL)) {
            by = (byte)(by | 1);
        }
        return by;
    }

    private static EnumSet<RegistryAttribute> decodeRegistryAttributes(byte by) {
        EnumSet<RegistryAttribute> enumSet = EnumSet.noneOf(RegistryAttribute.class);
        if ((by & 1) != 0) {
            enumSet.add(RegistryAttribute.OPTIONAL);
        }
        return enumSet;
    }

    private static String optimizeNamespace(String string) {
        return string.equals("minecraft") ? "" : string;
    }
}

