/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.networking;

import java.util.Set;
import minecraft.class01894;
import org.jspecify.annotations.Nullable;

public interface FabricRegistryByteBuf {
    public void fabric_setSendableConfigurationChannels(Set<class01894> var1);

    public @Nullable Set<class01894> fabric_getSendableConfigurationChannels();
}

