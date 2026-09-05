/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.LinkedListMultimap
 *  com.google.common.collect.ListMultimap
 *  com.google.gson.FieldNamingPolicy
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class08392
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.metadata.ModMetadata
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.terraformersmc.modmenu;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import com.terraformersmc.modmenu.api.UpdateChecker;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.config.ModMenuConfig$GameMenuButtonStyle;
import com.terraformersmc.modmenu.config.ModMenuConfig$TitleMenuButtonStyle;
import com.terraformersmc.modmenu.config.ModMenuConfigManager;
import com.terraformersmc.modmenu.event.ModMenuEventHandler;
import com.terraformersmc.modmenu.util.EnumToLowerCaseJsonConverter;
import com.terraformersmc.modmenu.util.ModMenuScreenTexts;
import com.terraformersmc.modmenu.util.NullScreenFactory;
import com.terraformersmc.modmenu.util.UpdateCheckerUtil;
import com.terraformersmc.modmenu.util.mod.Mod;
import com.terraformersmc.modmenu.util.mod.Mod$Badge;
import com.terraformersmc.modmenu.util.mod.fabric.FabricDummyParentMod;
import com.terraformersmc.modmenu.util.mod.fabric.FabricMod;
import com.terraformersmc.modmenu.util.mod.quilt.QuiltMod;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import minecraft.class00392;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class08392;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.ModMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModMenu
implements ClientModInitializer {
    public static final String MOD_ID = "modmenu";
    public static final String GITHUB_REF = "TerraformersMC/ModMenu";
    public static Logger LOGGER = LoggerFactory.getLogger((String)"Mod Menu");
    public static final Gson GSON;
    public static final Gson GSON_MINIFIED;
    public static final Map<String, Mod> MODS;
    public static final Map<String, Mod> ROOT_MODS;
    public static final ListMultimap<Mod, Mod> PARENT_MAP;
    private static final Map<String, ConfigScreenFactory<?>> configScreenFactories;
    private static final List<ModMenuApi> apiImplementations;
    private static int cachedDisplayedModCount;
    public static final boolean RUNNING_QUILT;
    public static final boolean DEV_ENVIRONMENT;
    public static final boolean TEXT_PLACEHOLDER_COMPAT;

    public static void checkForUpdates() {
        UpdateCheckerUtil.checkForUpdates();
    }

    public static void clearModCountCache() {
        cachedDisplayedModCount = -1;
    }

    public static boolean hasConfigScreen(String string) {
        return ModMenu.getConfigScreenFactory(string) != null;
    }

    public static class05096 getConfigScreen(String string, class05096 class050962) {
        ConfigScreenFactory<?> configScreenFactory = ModMenu.getConfigScreenFactory(string);
        if (configScreenFactory != null) {
            return configScreenFactory.create(class050962);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void onInitializeClient() {
        Object object22;
        ModMenuConfigManager.initializeConfig();
        HashSet<String> hashSet = new HashSet<String>();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        FabricLoader.getInstance().getEntrypointContainers(MOD_ID, ModMenuApi.class).forEach(entrypointContainer -> {
            ModMetadata modMetadata = entrypointContainer.getProvider().getMetadata();
            String string = modMetadata.getId();
            try {
                ModMenuApi modMenuApi = (ModMenuApi)entrypointContainer.getEntrypoint();
                ConfigScreenFactory<?> configScreenFactory = modMenuApi.getModConfigScreenFactory();
                if (!(configScreenFactory instanceof NullScreenFactory)) {
                    configScreenFactories.put(string, configScreenFactory);
                }
                apiImplementations.add(modMenuApi);
                hashMap.put(string, modMenuApi.getUpdateChecker());
                hashMap2.putAll(modMenuApi.getProvidedUpdateCheckers());
                modMenuApi.attachModpackBadges(hashSet::add);
            }
            catch (Throwable throwable) {
                LOGGER.error("Mod {} provides a broken implementation of ModMenuApi", (Object)string, (Object)throwable);
            }
        });
        for (Object object22 : FabricLoader.getInstance().getAllMods()) {
            void object3;
            FabricMod fabricMod = RUNNING_QUILT ? new QuiltMod((ModContainer)object22, hashSet) : new FabricMod((ModContainer)object22, hashSet);
            UpdateChecker updateChecker = (UpdateChecker)hashMap.get(fabricMod.getId());
            if (updateChecker == null) {
                UpdateChecker updateChecker2 = (UpdateChecker)hashMap2.get(fabricMod.getId());
            }
            MODS.put(fabricMod.getId(), fabricMod);
            fabricMod.setUpdateChecker((UpdateChecker)object3);
        }
        ModMenu.checkForUpdates();
        HashMap hashMap3 = new HashMap();
        object22 = new HashSet();
        for (Mod mod : MODS.values()) {
            Mod mod2;
            String string = mod.getParent();
            if (string == null) {
                ROOT_MODS.put(mod.getId(), mod);
                continue;
            }
            ((HashSet)object22).clear();
            while (true) {
                if ((mod2 = MODS.getOrDefault(string, (Mod)hashMap3.get(string))) == null && mod instanceof FabricMod) {
                    mod2 = new FabricDummyParentMod((FabricMod)mod, string);
                    hashMap3.put(string, mod2);
                }
                String string2 = string = mod2 != null ? mod2.getParent() : null;
                if (string == null) break;
                if (((HashSet)object22).contains(string)) {
                    LOGGER.warn("Mods contain each other as parents: {}", object22);
                    mod2 = null;
                    break;
                }
                ((HashSet)object22).add(string);
            }
            if (mod2 == null) {
                ROOT_MODS.put(mod.getId(), mod);
                continue;
            }
            PARENT_MAP.put((Object)mod2, (Object)mod);
        }
        MODS.putAll(hashMap3);
        ModMenuEventHandler.register();
    }

    public static class00392 createModsButtonText(boolean bl) {
        boolean bl2;
        ModMenuConfig$TitleMenuButtonStyle modMenuConfig$TitleMenuButtonStyle = ModMenuConfig.MODS_BUTTON_STYLE.getValue();
        ModMenuConfig$GameMenuButtonStyle modMenuConfig$GameMenuButtonStyle = ModMenuConfig.GAME_MENU_BUTTON_STYLE.getValue();
        boolean bl3 = bl ? modMenuConfig$TitleMenuButtonStyle == ModMenuConfig$TitleMenuButtonStyle.ICON : (bl2 = modMenuConfig$GameMenuButtonStyle == ModMenuConfig$GameMenuButtonStyle.ICON);
        boolean bl4 = bl ? modMenuConfig$TitleMenuButtonStyle == ModMenuConfig$TitleMenuButtonStyle.SHRINK : modMenuConfig$GameMenuButtonStyle == ModMenuConfig$GameMenuButtonStyle.REPLACE;
        class05216 class052162 = ModMenuScreenTexts.TITLE.L();
        if (ModMenuConfig.MOD_COUNT_LOCATION.getValue().isOnModsButton() && !bl2) {
            String string = ModMenu.getDisplayedModCount();
            if (bl4) {
                class052162.y((class00392)class00392.y((String)" ")).y((class00392)class00392.N((String)"modmenu.loaded.short", (Object[])new Object[]{string}));
            } else {
                Object object;
                String string2 = "modmenu.loaded." + string;
                Object object2 = object = class08392.N((String)string2) ? string2 : "modmenu.loaded";
                if (ModMenuConfig.EASTER_EGGS.getValue() && class08392.N((String)(string2 + ".secret"))) {
                    object = string2 + ".secret";
                }
                class052162.y((class00392)class00392.y((String)" ")).y((class00392)class00392.N((String)object, (Object[])new Object[]{string}));
            }
        }
        return class052162;
    }

    public static boolean areModUpdatesAvailable() {
        if (!ModMenuConfig.UPDATE_CHECKER.getValue()) {
            return false;
        }
        for (Mod mod : MODS.values()) {
            if (mod.isHidden() || !ModMenuConfig.SHOW_LIBRARIES.getValue() && mod.getBadges().contains((Object)Mod$Badge.LIBRARY) || !mod.hasUpdate() && !mod.getChildHasUpdate()) continue;
            return true;
        }
        return false;
    }

    private static ConfigScreenFactory<?> getConfigScreenFactory(String string) {
        if (ModMenuConfig.HIDDEN_CONFIGS.getValue().contains(string)) {
            return null;
        }
        for (ModMenuApi modMenuApi : apiImplementations) {
            Map<String, ConfigScreenFactory<?>> map = modMenuApi.getProvidedConfigScreenFactories();
            if (map.isEmpty()) continue;
            map.forEach(configScreenFactories::putIfAbsent);
        }
        return configScreenFactories.get(string);
    }

    public static String getDisplayedModCount() {
        if (cachedDisplayedModCount == -1) {
            boolean bl = ModMenuConfig.COUNT_CHILDREN.getValue();
            boolean bl2 = ModMenuConfig.COUNT_LIBRARIES.getValue();
            boolean bl3 = ModMenuConfig.COUNT_HIDDEN_MODS.getValue();
            cachedDisplayedModCount = Math.toIntExact(MODS.values().stream().filter(mod -> {
                boolean bl4;
                boolean bl5 = bl4 = mod.getParent() != null;
                if (!bl && bl4) {
                    return false;
                }
                boolean bl6 = mod.getBadges().contains((Object)Mod$Badge.LIBRARY);
                if (!bl2 && bl6) {
                    return false;
                }
                return bl3 || !mod.isHidden();
            }).count());
        }
        return NumberFormat.getInstance().format(cachedDisplayedModCount);
    }

    static {
        GsonBuilder builder = new GsonBuilder().registerTypeHierarchyAdapter(Enum.class, (Object)new EnumToLowerCaseJsonConverter()).setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        GSON = builder.setPrettyPrinting().create();
        GSON_MINIFIED = builder.create();
        MODS = new HashMap<String, Mod>();
        ROOT_MODS = new HashMap<String, Mod>();
        PARENT_MAP = LinkedListMultimap.create();
        configScreenFactories = new HashMap();
        apiImplementations = new ArrayList<ModMenuApi>();
        cachedDisplayedModCount = -1;
        RUNNING_QUILT = FabricLoader.getInstance().isModLoaded("quilt_loader");
        DEV_ENVIRONMENT = FabricLoader.getInstance().isDevelopmentEnvironment();
        TEXT_PLACEHOLDER_COMPAT = FabricLoader.getInstance().isModLoaded("placeholder-api");
    }
}

