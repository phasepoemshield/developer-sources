/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.terraformersmc.modmenu.api.ConfigScreenFactory
 *  com.terraformersmc.modmenu.api.ModMenuApi
 *  com.viaversion.viafabricplus.screen.impl.ProtocolSelectionScreen
 */
package com.viaversion.viafabricplus.base;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import com.viaversion.viafabricplus.screen.impl.ProtocolSelectionScreen;

public final class ModMenuScreenFactory
implements ModMenuApi {
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return class050962 -> ProtocolSelectionScreen.INSTANCE.get(class050962);
    }
}

