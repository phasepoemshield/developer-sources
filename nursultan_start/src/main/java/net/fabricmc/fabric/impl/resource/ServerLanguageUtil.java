/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01603
 *  net.fabricmc.fabric.impl.resource.pack.ModNioPackResources
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 */
package net.fabricmc.fabric.impl.resource;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class01603;
import net.fabricmc.fabric.impl.resource.pack.ModNioPackResources;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;

public final class ServerLanguageUtil {
    private static final String ASSETS_PREFIX = class01603.field_14188.N() + "/";

    private ServerLanguageUtil() {
    }

    public static Collection<Path> getModLanguageFiles() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ModContainer modContainer : FabricLoader.getInstance().getAllMods()) {
            if (modContainer.getMetadata().getType().equals("builtin")) continue;
            Map map = ModNioPackResources.readNamespaces((List)modContainer.getRootPaths(), (String)modContainer.getMetadata().getId());
            for (String string : (Set)map.get(class01603.field_14188)) {
                modContainer.findPath(ASSETS_PREFIX + string + "/lang/en_us.json").filter(path -> Files.isRegularFile(path, new LinkOption[0])).ifPresent(linkedHashSet::add);
            }
        }
        return Collections.unmodifiableCollection(linkedHashSet);
    }
}

