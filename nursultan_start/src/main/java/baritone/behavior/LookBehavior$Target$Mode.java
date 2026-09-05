/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.Settings
 */
package baritone.behavior;

import baritone.Baritone;
import baritone.api.Settings;
import baritone.api.utils.IPlayerContext;

enum LookBehavior$Target$Mode {
    CLIENT,
    SERVER,
    NONE;


    static LookBehavior$Target$Mode resolve(IPlayerContext iPlayerContext, boolean bl) {
        Settings settings = Baritone.settings();
        boolean bl2 = (Boolean)settings.antiCheatCompatibility.value;
        boolean bl3 = (Boolean)settings.blockFreeLook.value;
        if (iPlayerContext.player().method_6128()) {
            return (Boolean)settings.elytraFreeLook.value != false ? SERVER : CLIENT;
        }
        if (((Boolean)settings.freeLook.value).booleanValue()) {
            if (bl) {
                return bl3 ? SERVER : CLIENT;
            }
            return bl2 ? SERVER : NONE;
        }
        return CLIENT;
    }
}

