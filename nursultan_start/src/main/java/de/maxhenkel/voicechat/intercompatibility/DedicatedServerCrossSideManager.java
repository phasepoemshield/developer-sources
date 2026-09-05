/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  minecraft.class02796
 */
package de.maxhenkel.voicechat.intercompatibility;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.intercompatibility.CrossSideManager;
import minecraft.class02796;

public class DedicatedServerCrossSideManager
extends CrossSideManager {
    @Override
    public boolean shouldRunVoiceChatServer(class02796 class027962) {
        return true;
    }

    @Override
    public boolean useNatives() {
        return (Boolean)Voicechat.SERVER_CONFIG.useNatives.get();
    }

    @Override
    public int getMtuSize() {
        return (Integer)Voicechat.SERVER_CONFIG.voiceChatMtuSize.get();
    }
}

