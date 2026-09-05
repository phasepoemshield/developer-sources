/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04370
 */
package com.terraformersmc.modmenu.config;

import com.terraformersmc.modmenu.api.UpdateChannel;
import com.terraformersmc.modmenu.config.FileOnlyConfig;
import com.terraformersmc.modmenu.config.ModMenuConfig$GameMenuButtonStyle;
import com.terraformersmc.modmenu.config.ModMenuConfig$ModCountLocation;
import com.terraformersmc.modmenu.config.ModMenuConfig$Sorting;
import com.terraformersmc.modmenu.config.ModMenuConfig$TitleMenuButtonStyle;
import com.terraformersmc.modmenu.config.option.BooleanConfigOption;
import com.terraformersmc.modmenu.config.option.EnumConfigOption;
import com.terraformersmc.modmenu.config.option.OptionConvertible;
import com.terraformersmc.modmenu.config.option.StringSetConfigOption;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import minecraft.class04370;

public class ModMenuConfig {
    public static final EnumConfigOption<ModMenuConfig$Sorting> SORTING = new EnumConfigOption<ModMenuConfig$Sorting>("sorting", ModMenuConfig$Sorting.ASCENDING);
    public static final BooleanConfigOption COUNT_LIBRARIES = new BooleanConfigOption("count_libraries", true);
    public static final BooleanConfigOption COMPACT_LIST = new BooleanConfigOption("compact_list", false);
    public static final BooleanConfigOption COUNT_CHILDREN = new BooleanConfigOption("count_children", true);
    public static final EnumConfigOption<ModMenuConfig$TitleMenuButtonStyle> MODS_BUTTON_STYLE = new EnumConfigOption<ModMenuConfig$TitleMenuButtonStyle>("mods_button_style", ModMenuConfig$TitleMenuButtonStyle.CLASSIC);
    public static final EnumConfigOption<ModMenuConfig$GameMenuButtonStyle> GAME_MENU_BUTTON_STYLE = new EnumConfigOption<ModMenuConfig$GameMenuButtonStyle>("game_menu_button_style", ModMenuConfig$GameMenuButtonStyle.REPLACE);
    public static final BooleanConfigOption COUNT_HIDDEN_MODS = new BooleanConfigOption("count_hidden_mods", true);
    public static final EnumConfigOption<ModMenuConfig$ModCountLocation> MOD_COUNT_LOCATION = new EnumConfigOption<ModMenuConfig$ModCountLocation>("mod_count_location", ModMenuConfig$ModCountLocation.TITLE_SCREEN);
    public static final BooleanConfigOption HIDE_MOD_LINKS = new BooleanConfigOption("hide_mod_links", false);
    public static final BooleanConfigOption SHOW_LIBRARIES = new BooleanConfigOption("show_libraries", false);
    public static final BooleanConfigOption HIDE_MOD_LICENSE = new BooleanConfigOption("hide_mod_license", false);
    public static final BooleanConfigOption HIDE_BADGES = new BooleanConfigOption("hide_badges", false);
    public static final BooleanConfigOption HIDE_MOD_CREDITS = new BooleanConfigOption("hide_mod_credits", false);
    public static final BooleanConfigOption EASTER_EGGS = new BooleanConfigOption("easter_eggs", true);
    public static final BooleanConfigOption RANDOM_JAVA_COLORS = new BooleanConfigOption("random_java_colors", false);
    public static final BooleanConfigOption TRANSLATE_NAMES = new BooleanConfigOption("translate_names", true);
    public static final BooleanConfigOption TRANSLATE_DESCRIPTIONS = new BooleanConfigOption("translate_descriptions", true);
    public static final BooleanConfigOption UPDATE_CHECKER = new BooleanConfigOption("update_checker", true);
    public static final BooleanConfigOption BUTTON_UPDATE_BADGE = new BooleanConfigOption("button_update_badge", true);
    public static final EnumConfigOption<UpdateChannel> UPDATE_CHANNEL = new EnumConfigOption<UpdateChannel>("update_channel", UpdateChannel.RELEASE);
    public static final BooleanConfigOption QUICK_CONFIGURE = new BooleanConfigOption("quick_configure", true);
    @FileOnlyConfig
    public static final BooleanConfigOption MODIFY_TITLE_SCREEN = new BooleanConfigOption("modify_title_screen", true);
    @FileOnlyConfig
    public static final BooleanConfigOption MODIFY_GAME_MENU = new BooleanConfigOption("modify_game_menu", true);
    @FileOnlyConfig
    public static final BooleanConfigOption HIDE_CONFIG_BUTTONS = new BooleanConfigOption("hide_config_buttons", false);
    @FileOnlyConfig
    public static final BooleanConfigOption CONFIG_MODE = new BooleanConfigOption("config_mode", false);
    @FileOnlyConfig
    public static final BooleanConfigOption DISABLE_DRAG_AND_DROP = new BooleanConfigOption("disable_drag_and_drop", false);
    @FileOnlyConfig
    public static final StringSetConfigOption HIDDEN_MODS = new StringSetConfigOption("hidden_mods", new HashSet<String>());
    @FileOnlyConfig
    public static final StringSetConfigOption HIDDEN_CONFIGS = new StringSetConfigOption("hidden_configs", new HashSet<String>());
    @FileOnlyConfig
    public static final StringSetConfigOption DISABLE_UPDATE_CHECKER = new StringSetConfigOption("disable_update_checker", new HashSet<String>());

    public static class04370<?>[] asOptions() {
        ArrayList arrayList = new ArrayList();
        for (Field field : ModMenuConfig.class.getDeclaredFields()) {
            if (!Modifier.isStatic(field.getModifiers()) || !Modifier.isFinal(field.getModifiers()) || !OptionConvertible.class.isAssignableFrom(field.getType()) || field.isAnnotationPresent(FileOnlyConfig.class)) continue;
            try {
                arrayList.add(((OptionConvertible)field.get(null)).asOption());
            }
            catch (IllegalAccessException illegalAccessException) {
                illegalAccessException.printStackTrace();
            }
        }
        return (class04370[])arrayList.toArray(class04370[]::new);
    }
}

