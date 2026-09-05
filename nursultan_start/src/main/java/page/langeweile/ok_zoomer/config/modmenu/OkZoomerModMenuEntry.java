/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.terraformersmc.modmenu.api.ConfigScreenFactory
 *  com.terraformersmc.modmenu.api.ModMenuApi
 */
package page.langeweile.ok_zoomer.config.modmenu;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import page.langeweile.ok_zoomer.config.screen.OkZoomerConfigScreen;

public class OkZoomerModMenuEntry
implements ModMenuApi {
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return OkZoomerConfigScreen::new;
    }
}

