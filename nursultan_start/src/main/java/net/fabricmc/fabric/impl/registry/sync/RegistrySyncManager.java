/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.viaversion.viafabricplus.features.footstep_particle.FootStepParticle1_12_2
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class02796
 *  minecraft.class04176
 *  minecraft.class04188
 *  minecraft.class04206
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05946
 *  minecraft.class06541
 *  minecraft.class08774
 *  net.fabricmc.fabric.api.event.registry.RegistryAttribute
 *  net.fabricmc.fabric.api.event.registry.RegistryAttributeHolder
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.registry.sync;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.viaversion.viafabricplus.features.footstep_particle.FootStepParticle1_12_2;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.runtime.SwitchBootstraps;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class02796;
import minecraft.class04176;
import minecraft.class04188;
import minecraft.class04206;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05946;
import minecraft.class06541;
import minecraft.class08774;
import net.fabricmc.fabric.api.event.registry.RegistryAttribute;
import net.fabricmc.fabric.api.event.registry.RegistryAttributeHolder;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking;
import net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl;
import net.fabricmc.fabric.impl.registry.sync.RegistrySyncManager$SyncConfigurationTask;
import net.fabricmc.fabric.impl.registry.sync.RemappableRegistry;
import net.fabricmc.fabric.impl.registry.sync.packet.RegistrySyncPayload;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class RegistrySyncManager {
    public static final boolean DEBUG = Boolean.getBoolean("fabric.registry.debug");
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"FabricRegistrySync");
    private static final boolean DEBUG_WRITE_REGISTRY_DATA = Boolean.getBoolean("fabric.registry.debug.writeContentsAsCsv");
    public static boolean postBootstrap = false;

    public static void configureClient(class04176 class041762, class02796 class027962) {
        if (!DEBUG && class027962.N(new class08774(class041762.method_52404()))) {
            return;
        }
        Map<class01894, Object2IntMap<class01894>> map = RegistrySyncManager.createAndPopulateRegistryMap();
        if (map == null) {
            return;
        }
        if (!ServerConfigurationNetworking.canSend((class04176)class041762, RegistrySyncPayload.ID)) {
            if (RegistrySyncManager.areAllRegistriesOptional(map)) {
                return;
            }
            class00392 class003922 = RegistrySyncManager.getIncompatibleClientText(ServerNetworkingImpl.getAddon(class041762).getClientBrand(), map);
            class041762.method_52396(class003922);
            return;
        }
        class041762.addTask((class04188)new RegistrySyncManager$SyncConfigurationTask(class041762, map));
    }

    private RegistrySyncManager() {
    }

    private static class01894 wrapOperation$dih000$viafabricplus$skipFootStepParticle(class00751 class007512, Object object, Operation operation) {
        class01894 class018942 = (class01894)operation.call(new Object[]{class007512, object});
        if (class018942 == FootStepParticle1_12_2.ID) {
            return null;
        }
        return class018942;
    }

    public static @Nullable Map<class01894, Object2IntMap<class01894>> createAndPopulateRegistryMap() {
        LinkedHashMap<class01894, Object2IntMap<class01894>> linkedHashMap = new LinkedHashMap<class01894, Object2IntMap<class01894>>();
        for (class01894 class018942 : class04206.NF.M()) {
            Object object;
            class00751 class007512;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            class00751 class007513 = (class00751)class04206.NF.N(class018942);
            if (DEBUG_WRITE_REGISTRY_DATA) {
                object5 = new File(".fabric" + File.separatorChar + "debug" + File.separatorChar + "registry");
                boolean bl = true;
                if (!((File)object5).exists() && !((File)object5).mkdirs()) {
                    LOGGER.warn("[fabric-registry-sync debug] Could not create " + ((File)object5).getAbsolutePath() + " directory!");
                    bl = false;
                }
                if (bl && class007513 != null) {
                    object4 = new File((File)object5, class018942.toString().replace(':', '.').replace('/', '.') + ".csv");
                    try {
                        object3 = new FileOutputStream((File)object4);
                        try {
                            object2 = new StringBuilder("Raw ID,String ID,Class Type\n");
                            for (Object e : class007513) {
                                String string = e == null ? "null" : e.getClass().getName();
                                class007512 = class007513;
                                object = e;
                                class01894 class018943 = RegistrySyncManager.wrapOperation$dih000$viafabricplus$skipFootStepParticle(class007512, object, objectArray -> {
                                    WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_2378, java.lang.Object]");
                                    return ((class00751)objectArray[0]).y(objectArray[1]);
                                });
                                if (class018943 == null) continue;
                                int n = class007513.N(e);
                                String string2 = class018943.toString();
                                ((StringBuilder)object2).append("\"").append(n).append("\",\"").append(string2).append("\",\"").append(string).append("\"\n");
                            }
                            ((FileOutputStream)object3).write(((StringBuilder)object2).toString().getBytes(StandardCharsets.UTF_8));
                        }
                        finally {
                            ((FileOutputStream)object3).close();
                        }
                    }
                    catch (IOException iOException) {
                        LOGGER.warn("[fabric-registry-sync debug] Could not write to " + ((File)object4).getAbsolutePath() + "!", (Throwable)iOException);
                    }
                }
            }
            if (!(object5 = RegistryAttributeHolder.get((class05946)class007513.i())).hasAttribute(RegistryAttribute.SYNCED)) {
                LOGGER.debug("Not syncing registry: {}", (Object)class018942);
                continue;
            }
            if (!object5.hasAttribute(RegistryAttribute.MODDED)) {
                LOGGER.debug("Skipping un-modded registry: " + String.valueOf(class018942));
                continue;
            }
            LOGGER.debug("Syncing registry: " + String.valueOf(class018942));
            if (!(class007513 instanceof RemappableRegistry)) continue;
            Object2IntLinkedOpenHashMap object2IntLinkedOpenHashMap = new Object2IntLinkedOpenHashMap();
            object4 = DEBUG ? new IntOpenHashSet() : null;
            object3 = class007513.iterator();
            while (object3.hasNext()) {
                class007512 = class007513;
                object2 = object3.next();
                object = object2;
                Iterator iterator = RegistrySyncManager.wrapOperation$dih000$viafabricplus$skipFootStepParticle(class007512, object, objectArray -> {
                    WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_2378, java.lang.Object]");
                    return ((class00751)objectArray[0]).y(objectArray[1]);
                });
                if (iterator == null) continue;
                int n = class007513.N(object2);
                if (DEBUG) {
                    if (class007513.N((class01894)iterator) != object2) {
                        LOGGER.error("[fabric-registry-sync] Inconsistency detected in " + String.valueOf(class018942) + ": object " + String.valueOf(object2) + " -> string ID " + String.valueOf(iterator) + " -> object " + String.valueOf(class007513.N((class01894)iterator)) + "!");
                    }
                    if (class007513.N(n) != object2) {
                        LOGGER.error("[fabric-registry-sync] Inconsistency detected in " + String.valueOf(class018942) + ": object " + String.valueOf(object2) + " -> integer ID " + n + " -> object " + String.valueOf(class007513.N(n)) + "!");
                    }
                    if (!object4.add(n)) {
                        LOGGER.error("[fabric-registry-sync] Inconsistency detected in " + String.valueOf(class018942) + ": multiple objects hold the raw ID " + n + " (this one is " + String.valueOf(iterator) + ")");
                    }
                }
                object2IntLinkedOpenHashMap.put((Object)iterator, n);
            }
            linkedHashMap.put(class018942, (Object2IntMap<class01894>)object2IntLinkedOpenHashMap);
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    private static class00392 getIncompatibleClientText(@Nullable String string2, Map<class01894, Object2IntMap<class01894>> map) {
        String string3 = string2;
        int n = 0;
        String string4 = switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{"fabric"}, (Object)string3, (int)n)) {
            case 0 -> "Fabric API";
            default -> "Fabric Loader and Fabric API";
        };
        int n2 = 4;
        List list = map.values().stream().map(Object2IntMap::keySet).flatMap(Collection::stream).map(class01894::y).filter(string -> !string.equals("minecraft")).distinct().sorted().toList();
        class05216 class052162 = class00392.y((String)"The following registry entry namespaces may be related:\n\n");
        for (int i = 0; i < Math.min(list.size(), 4); ++i) {
            class052162 = class052162.y((class00392)class00392.y((String)((String)list.get(i))).N(class06541.field_1054));
            class052162 = class052162.y(class05220.n);
        }
        if (list.size() > 4) {
            class052162 = class052162.y((class00392)class00392.y((String)"And %d more...".formatted(new Object[]{list.size() - 4})));
        }
        return class00392.y((String)"This server requires ").y((class00392)class00392.y((String)string4).N(class06541.field_1060)).i(" installed on your client!").y(class05220.n).y((class00392)class052162).y(class05220.n).y(class05220.n).y((class00392)class00392.y((String)"Contact the server's administrator for more information!").N(class06541.field_1065));
    }

    private static boolean areAllRegistriesOptional(Map<class01894, Object2IntMap<class01894>> map) {
        return map.keySet().stream().map(arg_0 -> ((class00751)class04206.NF).N(arg_0)).filter(Objects::nonNull).map(RegistryAttributeHolder::get).allMatch(registryAttributeHolder -> registryAttributeHolder.hasAttribute(RegistryAttribute.OPTIONAL));
    }

    public static void bootstrapRegistries() {
        postBootstrap = true;
    }
}

