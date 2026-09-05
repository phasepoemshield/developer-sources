/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.terraformersmc.modmenu.api.ConfigScreenFactory
 *  com.terraformersmc.modmenu.api.ModMenuApi
 */
package jerozgen.languagereload.config;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import jerozgen.languagereload.config.ConfigScreen;

public class ModMenuEntrypoint
implements ModMenuApi {
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return ConfigScreen::new;
    }
}

