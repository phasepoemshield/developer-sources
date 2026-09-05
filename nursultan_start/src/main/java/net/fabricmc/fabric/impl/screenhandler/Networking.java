/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class04206
 *  minecraft.class04247
 *  minecraft.class04770
 *  minecraft.class07482
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback
 *  net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry
 *  net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking
 *  net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory
 *  net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.screenhandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class04206;
import minecraft.class04247;
import minecraft.class04770;
import minecraft.class07482;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.fabricmc.fabric.impl.screenhandler.Networking$OpenScreenPayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Networking
implements ModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"fabric-screen-handler-api-v1/server");
    public static final class01894 OPEN_ID = class01894.N((String)"fabric-screen-handler-api-v1", (String)"open_screen");
    public static final Map<class01894, class02362<? super class04247, ?>> CODEC_BY_ID = new HashMap();

    private static <T> void forEachEntry(class00751<T> class007512, BiConsumer<T, class01894> biConsumer) {
        for (Object e : class007512) {
            biConsumer.accept(e, class007512.y(e));
        }
        RegistryEntryAddedCallback.event(class007512).register((n, class018942, object) -> biConsumer.accept(object, class018942));
    }

    public static <D> void sendOpenPacket(class04770 class047702, ExtendedScreenHandlerFactory<D> extendedScreenHandlerFactory, class07482 class074822, int n) {
        Objects.requireNonNull(class047702, "player is null");
        Objects.requireNonNull(extendedScreenHandlerFactory, "factory is null");
        Objects.requireNonNull(class074822, "handler is null");
        class01894 class018942 = class04206.T.y((Object)class074822.N());
        if (class018942 == null) {
            LOGGER.warn("Trying to open unregistered screen handler {}", (Object)class074822);
            return;
        }
        class02362<? super class04247, ?> class023622 = Objects.requireNonNull(CODEC_BY_ID.get(class018942), () -> "Codec for " + String.valueOf(class018942) + " is not registered!");
        Object object = extendedScreenHandlerFactory.getScreenOpeningData(class047702);
        ServerPlayNetworking.send((class04770)class047702, new Networking$OpenScreenPayload<Object>(class018942, n, extendedScreenHandlerFactory.method_5476(), class023622, object));
    }

    public void onInitialize() {
        PayloadTypeRegistry.playS2C().register(Networking$OpenScreenPayload.ID, Networking$OpenScreenPayload.CODEC);
        Networking.forEachEntry(class04206.T, (class058512, class018942) -> {
            if (class058512 instanceof ExtendedScreenHandlerType) {
                ExtendedScreenHandlerType extendedScreenHandlerType = (ExtendedScreenHandlerType)class058512;
                CODEC_BY_ID.put((class01894)class018942, (class02362<class04247, ?>)extendedScreenHandlerType.getPacketCodec());
            }
        });
    }
}

