/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01055
 *  minecraft.class01057
 *  minecraft.class01061
 *  minecraft.class01090
 *  minecraft.class01283
 *  minecraft.class01603
 *  minecraft.class02267
 *  minecraft.class02268
 *  net.fabricmc.fabric.api.resource.v1.pack.ModPackResources
 *  net.fabricmc.fabric.impl.resource.ResourceLoaderImpl
 *  net.fabricmc.loader.api.FabricLoader
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.resource.pack;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class01055;
import minecraft.class01057;
import minecraft.class01061;
import minecraft.class01090;
import minecraft.class01283;
import minecraft.class01603;
import minecraft.class02267;
import minecraft.class02268;
import net.fabricmc.fabric.api.resource.v1.pack.ModPackResources;
import net.fabricmc.fabric.impl.resource.ResourceLoaderImpl;
import net.fabricmc.fabric.impl.resource.pack.FabricPack;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesFactory;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator$1;
import net.fabricmc.loader.api.FabricLoader;
import org.jspecify.annotations.Nullable;

public class ModResourcePackCreator
implements class01057 {
    public static final String VANILLA = "vanilla";
    private static final String PROGRAMMER_ART = "programmer_art";
    private static final String HIGH_CONTRAST = "high_contrast";
    public static final Set<String> POST_CHANGE_HANDLE_REQUIRED = Set.of("vanilla", "programmer_art", "high_contrast");
    public static final Predicate<Set<String>> BASE_PARENT = set -> set.contains(VANILLA);
    public static final Predicate<Set<String>> PROGRAMMER_ART_PARENT = set -> set.contains(VANILLA) && set.contains(PROGRAMMER_ART);
    public static final Predicate<Set<String>> HIGH_CONTRAST_PARENT = set -> set.contains(VANILLA) && set.contains(HIGH_CONTRAST);
    public static final class01283 RESOURCE_PACK_SOURCE = new ModResourcePackCreator$1();
    public static final ModResourcePackCreator CLIENT_RESOURCE_PACK_PROVIDER = new ModResourcePackCreator(class01603.field_14188);
    public static final int MAX_KNOWN_PACKS = Integer.getInteger("fabric-resource-loader-v1:maxKnownPacks", 1024);
    private final class01603 type;
    private final class02268 activationInfo;
    private final boolean forClientDataPackManager;

    public ModResourcePackCreator(class01603 class016032) {
        this(class016032, false);
    }

    protected ModResourcePackCreator(class01603 class016032, boolean bl) {
        this.type = class016032;
        this.activationInfo = new class02268(!bl, class01090.field_14280, false);
        this.forClientDataPackManager = bl;
    }

    public void method_14453(Consumer<class01055> consumer) {
        this.registerModPack(consumer, null, BASE_PARENT);
        if (this.type == class01603.field_14188) {
            this.registerModPack(consumer, PROGRAMMER_ART, PROGRAMMER_ART_PARENT);
            this.registerModPack(consumer, HIGH_CONTRAST, HIGH_CONTRAST_PARENT);
        }
        ResourceLoaderImpl.registerBuiltinResourcePacks((class01603)this.type, consumer);
    }

    private void registerModPack(Consumer<class01055> consumer, @Nullable String string, Predicate<Set<String>> predicate) {
        List<ModPackResources> list = ModPackResourcesUtil.getModResourcePacks(FabricLoader.getInstance(), this.type, string);
        for (ModPackResources modPackResources : list) {
            class01055 class010552 = class01055.N((class02267)modPackResources.method_56926(), (class01061)new ModPackResourcesFactory(modPackResources), (class01603)this.type, (class02268)this.activationInfo);
            if (class010552 == null) continue;
            if (!this.forClientDataPackManager) {
                ((FabricPack)class010552).fabric$setParentsPredicate(predicate);
            }
            consumer.accept(class010552);
        }
    }
}

