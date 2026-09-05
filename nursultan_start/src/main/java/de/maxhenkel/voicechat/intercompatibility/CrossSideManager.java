/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02796
 */
package de.maxhenkel.voicechat.intercompatibility;

import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.intercompatibility.DedicatedServerCrossSideManager;
import minecraft.class02796;

public abstract class CrossSideManager {
    private static CrossSideManager instance;

    public static CrossSideManager get() {
        if (instance == null) {
            if (CommonCompatibilityManager.INSTANCE.isDedicatedServer()) {
                instance = new DedicatedServerCrossSideManager();
            } else {
                try {
                    Class<?> clazz = Class.forName("de.maxhenkel.voicechat.intercompatibility.ClientCrossSideManager");
                    instance = (CrossSideManager)clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
            }
        }
        return instance;
    }

    public abstract boolean shouldRunVoiceChatServer(class02796 var1);

    public abstract boolean useNatives();

    public abstract int getMtuSize();
}

