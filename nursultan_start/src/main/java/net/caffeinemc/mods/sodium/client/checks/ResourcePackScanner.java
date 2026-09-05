/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01089
 *  minecraft.class01592
 *  minecraft.class01597
 *  minecraft.class01603
 *  minecraft.class01622
 *  minecraft.class04154
 *  org.jspecify.annotations.NonNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.caffeinemc.mods.sodium.client.checks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import minecraft.class01089;
import minecraft.class01592;
import minecraft.class01597;
import minecraft.class01603;
import minecraft.class01622;
import minecraft.class04154;
import net.caffeinemc.mods.sodium.client.checks.ResourcePackScanner$ScannedResourcePack;
import net.caffeinemc.mods.sodium.client.checks.SodiumResourcePackMetadata;
import net.caffeinemc.mods.sodium.client.console.Console;
import net.caffeinemc.mods.sodium.client.console.message.MessageLevel;
import org.jspecify.annotations.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourcePackScanner {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"Sodium-ResourcePackScanner");
    private static final Set<String> SHADER_PROGRAM_BLACKLIST = Set.of("rendertype_solid.vsh", "rendertype_solid.fsh", "rendertype_solid.json", "rendertype_cutout_mipped.vsh", "rendertype_cutout_mipped.fsh", "rendertype_cutout_mipped.json", "rendertype_cutout.vsh", "rendertype_cutout.fsh", "rendertype_cutout.json", "rendertype_translucent.vsh", "rendertype_translucent.fsh", "rendertype_translucent.json", "rendertype_tripwire.vsh", "rendertype_tripwire.fsh", "rendertype_tripwire.json", "rendertype_clouds.vsh", "rendertype_clouds.fsh", "rendertype_clouds.json");
    private static final Set<String> SHADER_INCLUDE_BLACKLIST = Set.of("light.glsl", "fog.glsl");

    private static boolean isExternalResourcePack(class01622 class016222) {
        return class016222 instanceof class01592 || class016222 instanceof class01597 || class016222 instanceof class04154;
    }

    private static List<String> determineIgnoredShaders(class01622 class016222) {
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            SodiumResourcePackMetadata sodiumResourcePackMetadata = (SodiumResourcePackMetadata)((Object)class016222.method_14407(SodiumResourcePackMetadata.SERIALIZER));
            if (sodiumResourcePackMetadata != null) {
                arrayList.addAll(sodiumResourcePackMetadata.ignoredShaders());
            }
        }
        catch (IOException iOException) {
            LOGGER.error("Failed to load pack.mcmeta file for resource pack '{}'", (Object)class016222.method_14409());
        }
        return arrayList;
    }

    public static void checkIfCoreShaderLoaded(class01089 class010892) {
        List list = class010892.y().filter(ResourcePackScanner::isExternalResourcePack).map(ResourcePackScanner::scanResources).toList();
        ResourcePackScanner.printToasts(list);
        ResourcePackScanner.printCompatibilityReport(list);
    }

    private static void printCompatibilityReport(Collection<ResourcePackScanner$ScannedResourcePack> collection) {
        StringBuilder stringBuilder = new StringBuilder();
        for (ResourcePackScanner$ScannedResourcePack resourcePackScanner$ScannedResourcePack : collection) {
            if (resourcePackScanner$ScannedResourcePack.shaderPrograms.isEmpty() && resourcePackScanner$ScannedResourcePack.shaderIncludes.isEmpty()) continue;
            stringBuilder.append("- Resource pack: ").append(ResourcePackScanner.getResourcePackName(resourcePackScanner$ScannedResourcePack.resourcePack)).append("\n");
            if (!resourcePackScanner$ScannedResourcePack.shaderPrograms.isEmpty()) {
                ResourcePackScanner.emitProblem(stringBuilder, "The resource pack replaces terrain shaders, which are not supported", "https://github.com/CaffeineMC/sodium/wiki/Resource-Packs", resourcePackScanner$ScannedResourcePack.shaderPrograms);
            }
            if (resourcePackScanner$ScannedResourcePack.shaderIncludes.isEmpty()) continue;
            ResourcePackScanner.emitProblem(stringBuilder, "The resource pack modifies shader include files, which are not fully supported", "https://github.com/CaffeineMC/sodium/wiki/Resource-Packs", resourcePackScanner$ScannedResourcePack.shaderIncludes);
        }
        if (!stringBuilder.isEmpty()) {
            LOGGER.error("The following compatibility issues were found with installed resource packs:\n{}", (Object)stringBuilder);
        }
    }

    private static String getResourcePackName(class01622 class016222) {
        String string = class016222.method_14409();
        return string.startsWith("file/") ? string.substring(5) : string;
    }

    private static void emitProblem(StringBuilder stringBuilder, String string, String string2, List<String> list) {
        stringBuilder.append("\t- Problem found: ").append("\n");
        stringBuilder.append("\t\t- Description:\n\t\t\t").append(string).append("\n");
        stringBuilder.append("\t\t- More information: ").append(string2).append("\n");
        stringBuilder.append("\t\t- Files: ").append("\n");
        for (String string3 : list) {
            stringBuilder.append("\t\t\t- ").append(string3).append("\n");
        }
    }

    private static @NonNull ResourcePackScanner$ScannedResourcePack scanResources(class01622 class016222) {
        List<String> list = ResourcePackScanner.determineIgnoredShaders(class016222);
        if (!list.isEmpty()) {
            LOGGER.warn("Resource pack '{}' indicates the following shaders should be ignored: {}", (Object)ResourcePackScanner.getResourcePackName(class016222), (Object)String.join((CharSequence)", ", list));
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        class016222.method_14408(class01603.field_14188, "minecraft", "shaders", (class018942, class036522) -> {
            String string = class018942.N();
            String string2 = string.substring(string.lastIndexOf(47) + 1);
            if (list.contains(string2)) {
                return;
            }
            if (SHADER_PROGRAM_BLACKLIST.contains(string2)) {
                arrayList.add(string);
            } else if (SHADER_INCLUDE_BLACKLIST.contains(string2)) {
                arrayList2.add(string);
            }
        });
        return new ResourcePackScanner$ScannedResourcePack(class016222, arrayList, arrayList2);
    }

    private static void printToasts(Collection<ResourcePackScanner$ScannedResourcePack> collection) {
        List list = collection.stream().filter(resourcePackScanner$ScannedResourcePack -> !resourcePackScanner$ScannedResourcePack.shaderPrograms.isEmpty()).toList();
        List list2 = collection.stream().filter(resourcePackScanner$ScannedResourcePack -> !resourcePackScanner$ScannedResourcePack.shaderIncludes.isEmpty()).filter(resourcePackScanner$ScannedResourcePack -> !list.contains(resourcePackScanner$ScannedResourcePack)).toList();
        boolean bl = false;
        if (!list.isEmpty()) {
            ResourcePackScanner.showConsoleMessage("sodium.console.core_shaders_error", true, MessageLevel.SEVERE);
            for (ResourcePackScanner$ScannedResourcePack resourcePackScanner$ScannedResourcePack2 : list) {
                ResourcePackScanner.showConsoleMessage(ResourcePackScanner.getResourcePackName(resourcePackScanner$ScannedResourcePack2.resourcePack), false, MessageLevel.SEVERE);
            }
            bl = true;
        }
        if (!list2.isEmpty()) {
            ResourcePackScanner.showConsoleMessage("sodium.console.core_shaders_warn", true, MessageLevel.WARN);
            for (ResourcePackScanner$ScannedResourcePack resourcePackScanner$ScannedResourcePack2 : list2) {
                ResourcePackScanner.showConsoleMessage(ResourcePackScanner.getResourcePackName(resourcePackScanner$ScannedResourcePack2.resourcePack), false, MessageLevel.WARN);
            }
            bl = true;
        }
        if (bl) {
            ResourcePackScanner.showConsoleMessage("sodium.console.core_shaders_info", true, MessageLevel.INFO);
        }
    }

    private static void showConsoleMessage(String string, boolean bl, MessageLevel messageLevel) {
        Console.instance().logMessage(messageLevel, string, bl, 12.5);
    }
}

