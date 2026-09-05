/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.util.KeyMappings
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.util.KeyMappings;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface RegistryDataRewriter {
    public void handle(PacketWrapper var1);

    public boolean shouldRemoveRegistry(String var1);

    public void sendMissingRegistries(UserConnection var1);

    public void updateDialog(UserConnection var1, CompoundTag var2);

    public boolean hasRegistriesToRemove();

    public @Nullable KeyMappings getMappings(String var1);
}

