/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.terraformersmc.modmenu.api.ConfigScreenFactory
 *  com.terraformersmc.modmenu.api.ModMenuApi
 *  me.shedaniel.autoconfig.AutoConfig
 *  minecraft.class05096
 */
package dev.caoimhe.compactchat.modmenu;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import dev.caoimhe.compactchat.config.Configuration;
import me.shedaniel.autoconfig.AutoConfig;
import minecraft.class05096;

public class ModMenuIntegration
implements ModMenuApi {
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return class050962 -> (class05096)AutoConfig.getConfigScreen(Configuration.class, (class05096)class050962).get();
    }
}

