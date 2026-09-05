/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.ModInitializer
 */
package net.fabricmc.loader.impl.game.minecraft;

import java.io.File;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.impl.FabricLoaderImpl;

public final class Hooks {
    public static final String INTERNAL_NAME = "net/fabricmc/loader/impl/game/minecraft/Hooks";
    public static final String FABRIC = "fabric";
    public static final String VANILLA = "vanilla";
    public static String appletMainClass;

    public static void setGameInstance(Object object) {
        FabricLoaderImpl.INSTANCE.setGameInstance(object);
    }

    public static String insertBranding(String string) {
        if (string == null || string.isEmpty()) {
            return FABRIC;
        }
        return VANILLA.equals(string) ? FABRIC : string + ",fabric";
    }

    public static void startClient(File file, Object object) {
        if (file == null) {
            file = new File(".");
        }
        FabricLoaderImpl fabricLoaderImpl = FabricLoaderImpl.INSTANCE;
        fabricLoaderImpl.prepareModInit(file.toPath(), object);
        fabricLoaderImpl.invokeEntrypoints("main", ModInitializer.class, ModInitializer::onInitialize);
        fabricLoaderImpl.invokeEntrypoints("client", ClientModInitializer.class, ClientModInitializer::onInitializeClient);
    }

    public static void startServer(File file, Object object) {
        if (file == null) {
            file = new File(".");
        }
        FabricLoaderImpl fabricLoaderImpl = FabricLoaderImpl.INSTANCE;
        fabricLoaderImpl.prepareModInit(file.toPath(), object);
        fabricLoaderImpl.invokeEntrypoints("main", ModInitializer.class, ModInitializer::onInitialize);
    }

    private Hooks() {
    }
}

