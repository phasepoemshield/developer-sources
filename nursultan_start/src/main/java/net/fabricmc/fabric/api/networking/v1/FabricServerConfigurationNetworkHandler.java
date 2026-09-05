/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04159
 *  minecraft.class04188
 */
package net.fabricmc.fabric.api.networking.v1;

import minecraft.class04159;
import minecraft.class04188;

public interface FabricServerConfigurationNetworkHandler {
    default public void addTask(class04188 class041882) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public void completeTask(class04159 class041592) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }
}

