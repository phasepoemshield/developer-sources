/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class01659
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class06541
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking$Context
 *  net.fabricmc.fabric.api.event.registry.RegistryAttribute
 *  net.fabricmc.fabric.impl.registry.sync.RegistrySyncManager
 *  net.fabricmc.fabric.impl.registry.sync.RemapException
 *  net.fabricmc.fabric.impl.registry.sync.RemappableRegistry
 *  net.fabricmc.fabric.impl.registry.sync.RemappableRegistry$RemapMode
 *  net.fabricmc.fabric.impl.registry.sync.SyncCompletePayload
 *  net.fabricmc.fabric.impl.registry.sync.packet.RegistrySyncPayload
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package net.fabricmc.fabric.impl.client.registry.sync;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletionException;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class01659;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class06541;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking;
import net.fabricmc.fabric.api.event.registry.RegistryAttribute;
import net.fabricmc.fabric.impl.registry.sync.RegistrySyncManager;
import net.fabricmc.fabric.impl.registry.sync.RemapException;
import net.fabricmc.fabric.impl.registry.sync.RemappableRegistry;
import net.fabricmc.fabric.impl.registry.sync.SyncCompletePayload;
import net.fabricmc.fabric.impl.registry.sync.packet.RegistrySyncPayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public final class ClientRegistrySyncHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientRegistrySyncHandler.class);

    private static class00392 getText(Throwable throwable) {
        if (throwable instanceof RemapException) {
            RemapException remapException = (RemapException)throwable;
            class00392 class003922 = remapException.getText();
            if (class003922 != null) {
                return class003922;
            }
        } else if (throwable instanceof CompletionException) {
            CompletionException completionException = (CompletionException)throwable;
            return ClientRegistrySyncHandler.getText(completionException.getCause());
        }
        return class00392.y((String)("Registry remapping failed: " + throwable.getMessage()));
    }

    private ClientRegistrySyncHandler() {
    }

    public static void apply(RegistrySyncPayload registrySyncPayload) throws RemapException {
        ClientRegistrySyncHandler.checkRemoteRemap(registrySyncPayload);
        for (Map.Entry entry : registrySyncPayload.registryMap().entrySet()) {
            class01894 class018942 = (class01894)entry.getKey();
            class00751 class007512 = (class00751)class04206.NF.N(class018942);
            if (class007512 == null && ClientRegistrySyncHandler.isRegistryOptional(class018942, registrySyncPayload)) {
                LOGGER.info("Received registry data for unknown optional registry: {}", (Object)class018942);
                continue;
            }
            if (!(class007512 instanceof RemappableRegistry)) {
                throw new RemapException("Registry " + String.valueOf(class018942) + " is not remappable");
            }
            RemappableRegistry remappableRegistry = (RemappableRegistry)class007512;
            remappableRegistry.remap((Object2IntMap)entry.getValue(), RemappableRegistry.RemapMode.REMOTE);
        }
    }

    private static class00392 missingRegistriesError(List<class01894> list) {
        class05216 class052162 = class00392.i();
        int n = list.size();
        class052162 = n == 1 ? class052162.y((class00392)class00392.L((String)"fabric-registry-sync-v0.unknown-registry.title.singular")) : class052162.y((class00392)class00392.N((String)"fabric-registry-sync-v0.unknown-registry.title.plural", (Object[])new Object[]{n}));
        class052162 = class052162.y((class00392)class00392.L((String)"fabric-registry-sync-v0.unknown-registry.subtitle.1").N(class06541.field_1060));
        class052162 = class052162.y((class00392)class00392.L((String)"fabric-registry-sync-v0.unknown-registry.subtitle.2"));
        int n2 = 4;
        for (int i = 0; i < Math.min(list.size(), 4); ++i) {
            class052162 = class052162.y((class00392)class00392.y((String)list.get(i).toString()).N(class06541.field_1054));
            class052162 = class052162.y(class05220.n);
        }
        if (list.size() > 4) {
            class052162 = class052162.y((class00392)class00392.N((String)"fabric-registry-sync-v0.unknown-registry.footer", (Object[])new Object[]{list.size() - 4}));
        }
        return class052162;
    }

    private static class00392 missingEntriesError(Map<class01894, List<class01894>> map) {
        class05216 class052162 = class00392.i();
        int n = map.values().stream().mapToInt(List::size).sum();
        class052162 = n == 1 ? class052162.y((class00392)class00392.L((String)"fabric-registry-sync-v0.unknown-remote.title.singular")) : class052162.y((class00392)class00392.N((String)"fabric-registry-sync-v0.unknown-remote.title.plural", (Object[])new Object[]{n}));
        class052162 = class052162.y((class00392)class00392.L((String)"fabric-registry-sync-v0.unknown-remote.subtitle.1").N(class06541.field_1060));
        class052162 = class052162.y((class00392)class00392.L((String)"fabric-registry-sync-v0.unknown-remote.subtitle.2"));
        int n2 = 4;
        List list = map.values().stream().flatMap(Collection::stream).map(class01894::y).distinct().sorted().toList();
        for (int i = 0; i < Math.min(list.size(), 4); ++i) {
            class052162 = class052162.y((class00392)class00392.y((String)((String)list.get(i))).N(class06541.field_1054));
            class052162 = class052162.y(class05220.n);
        }
        if (list.size() > 4) {
            class052162 = class052162.y((class00392)class00392.N((String)"fabric-registry-sync-v0.unknown-remote.footer", (Object[])new Object[]{list.size() - 4}));
        }
        return class052162;
    }

    public static void checkRemoteRemap(RegistrySyncPayload registrySyncPayload) throws RemapException {
        Map map = registrySyncPayload.registryMap();
        ArrayList<class01894> arrayList = new ArrayList<class01894>();
        HashMap<class01894, List<class01894>> hashMap = new HashMap<class01894, List<class01894>>();
        for (class01894 object : map.keySet()) {
            Object2IntMap object2IntMap = (Object2IntMap)map.get(object);
            class00751 class007512 = (class00751)class04206.NF.N(object);
            if (class007512 == null) {
                if (ClientRegistrySyncHandler.isRegistryOptional(object, registrySyncPayload)) continue;
                arrayList.add(object);
                continue;
            }
            for (class01894 class018943 : object2IntMap.keySet()) {
                if (class007512.u(class018943)) continue;
                hashMap.computeIfAbsent(object, class018942 -> new ArrayList()).add(class018943);
            }
        }
        if (arrayList.isEmpty() && hashMap.isEmpty()) {
            return;
        }
        if (!arrayList.isEmpty()) {
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            ClientRegistrySyncHandler.handler$dbd000$viafabricplus$ignoreFabricSyncErrors(registrySyncPayload, callbackInfo);
            if (callbackInfo.isCancelled()) {
                return;
            }
            LOGGER.error("Received unknown remote registries from server");
            for (class01894 class018944 : arrayList) {
                LOGGER.error("Received unknown remote registry ({}) from server", (Object)class018944);
            }
        }
        if (!hashMap.isEmpty()) {
            LOGGER.error("Received unknown remote registry entries from server");
            for (Map.Entry entry : hashMap.entrySet()) {
                for (class00751 class007512 : (List)entry.getValue()) {
                    LOGGER.error("Registry entry ({}) is missing from local registry ({})", (Object)class007512, entry.getKey());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            throw new RemapException(ClientRegistrySyncHandler.missingRegistriesError(arrayList));
        }
        throw new RemapException(ClientRegistrySyncHandler.missingEntriesError(hashMap));
    }

    public static void receivePacket(RegistrySyncPayload registrySyncPayload, ClientConfigurationNetworking.Context context) {
        if (!RegistrySyncManager.DEBUG && context.client().q()) {
            context.responseSender().sendPacket((class01659)SyncCompletePayload.INSTANCE);
            return;
        }
        context.client().execute(() -> {
            try {
                ClientRegistrySyncHandler.apply(registrySyncPayload);
                context.responseSender().sendPacket((class01659)SyncCompletePayload.INSTANCE);
            }
            catch (Throwable throwable) {
                LOGGER.error("Registry remapping failed!", throwable);
                context.responseSender().disconnect(ClientRegistrySyncHandler.getText(throwable));
                return;
            }
        });
    }

    private static boolean isRegistryOptional(class01894 class018942, RegistrySyncPayload registrySyncPayload) {
        EnumSet enumSet = (EnumSet)registrySyncPayload.registryAttributes().get(class018942);
        return enumSet.contains(RegistryAttribute.OPTIONAL);
    }

    private static void handler$dbd000$viafabricplus$ignoreFabricSyncErrors(RegistrySyncPayload registrySyncPayload, CallbackInfo callbackInfo) {
        if (((Boolean)DebugSettings.INSTANCE.ignoreFabricSyncErrors.getValue()).booleanValue()) {
            ViaFabricPlusImpl.INSTANCE.getLogger().warn("Ignoring missing registries from Fabric API");
            callbackInfo.cancel();
        }
    }
}

