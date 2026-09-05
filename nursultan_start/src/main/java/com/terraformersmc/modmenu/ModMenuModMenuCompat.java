/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05630
 *  minecraft.class05716
 *  minecraft.class06202
 */
package com.terraformersmc.modmenu;

import com.terraformersmc.modmenu.ModMenu;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import com.terraformersmc.modmenu.api.UpdateChecker;
import com.terraformersmc.modmenu.gui.ModMenuOptionsScreen;
import com.terraformersmc.modmenu.util.mod.fabric.FabricLoaderUpdateChecker;
import com.terraformersmc.modmenu.util.mod.quilt.QuiltLoaderUpdateChecker;
import java.util.Map;
import minecraft.class05630;
import minecraft.class05716;
import minecraft.class06202;

public class ModMenuModMenuCompat
implements ModMenuApi {
    @Override
    public Map<String, ConfigScreenFactory<?>> getProvidedConfigScreenFactories() {
        return Map.of("minecraft", class050962 -> new class05716(class050962, (class05630)class06202.Nq().i_7));
    }

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return ModMenuOptionsScreen::new;
    }

    @Override
    public Map<String, UpdateChecker> getProvidedUpdateCheckers() {
        if (ModMenu.RUNNING_QUILT) {
            return Map.of("quilt_loader", new QuiltLoaderUpdateChecker());
        }
        return Map.of("fabricloader", new FabricLoaderUpdateChecker());
    }
}

