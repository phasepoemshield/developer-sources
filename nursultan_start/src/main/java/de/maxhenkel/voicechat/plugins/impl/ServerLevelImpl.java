/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.ServerLevel
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  minecraft.class04782
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.api.ServerLevel;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import java.util.Objects;
import minecraft.class04782;

public class ServerLevelImpl
implements ServerLevel {
    private final class04782 serverLevel;

    public ServerLevelImpl(class04782 class047822) {
        this.serverLevel = class047822;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ServerLevelImpl serverLevelImpl = (ServerLevelImpl)object;
        return Objects.equals(this.serverLevel, serverLevelImpl.serverLevel);
    }

    public int hashCode() {
        return this.serverLevel != null ? this.serverLevel.hashCode() : 0;
    }

    public class04782 getRawServerLevel() {
        return this.serverLevel;
    }

    public Object getServerLevel() {
        return CommonCompatibilityManager.INSTANCE.createRawApiLevel(this.serverLevel);
    }
}

