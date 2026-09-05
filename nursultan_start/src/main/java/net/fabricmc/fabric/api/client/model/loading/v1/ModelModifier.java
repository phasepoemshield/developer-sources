/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import minecraft.class01894;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.Event;

@Environment(value=EnvType.CLIENT)
public final class ModelModifier {
    public static final class01894 OVERRIDE_PHASE = class01894.N((String)"fabric", (String)"override");
    public static final class01894 DEFAULT_PHASE = Event.DEFAULT_PHASE;
    public static final class01894 WRAP_PHASE = class01894.N((String)"fabric", (String)"wrap");
    public static final class01894 WRAP_LAST_PHASE = class01894.N((String)"fabric", (String)"wrap_last");

    private ModelModifier() {
    }
}

