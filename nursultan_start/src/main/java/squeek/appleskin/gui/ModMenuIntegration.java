/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.terraformersmc.modmenu.api.ConfigScreenFactory
 *  com.terraformersmc.modmenu.api.ModMenuApi
 *  me.shedaniel.autoconfig.AutoConfigClient
 *  minecraft.class05096
 *  net.fabricmc.loader.api.FabricLoader
 */
package squeek.appleskin.gui;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfigClient;
import minecraft.class05096;
import net.fabricmc.loader.api.FabricLoader;
import squeek.appleskin.gui.AutoConfigIntegration;

public class ModMenuIntegration
implements ModMenuApi {
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        if (FabricLoader.getInstance().isModLoaded("cloth-config")) {
            return class050962 -> (class05096)AutoConfigClient.getConfigScreen(AutoConfigIntegration.class, (class05096)class050962).get();
        }
        throw new RuntimeException("cloth-config not loaded");
    }
}

