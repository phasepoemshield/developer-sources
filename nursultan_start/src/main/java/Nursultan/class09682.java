/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.terraformersmc.modmenu.api.ConfigScreenFactory
 *  com.terraformersmc.modmenu.api.ModMenuApi
 */
package Nursultan;

import Nursultan.class09663;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

public class class09682
implements ModMenuApi {
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return class050962 -> new class09663(class050962);
    }
}

