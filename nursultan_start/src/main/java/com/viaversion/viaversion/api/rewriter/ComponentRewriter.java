/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.libs.gson.JsonElement;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface ComponentRewriter {
    public void passthroughAndProcess(PacketWrapper var1);

    public JsonElement processText(UserConnection var1, @Nullable String var2);

    public void processText(UserConnection var1, @Nullable JsonElement var2);

    public void handleShowItem(UserConnection var1, CompoundTag var2);

    public void processTag(UserConnection var1, @Nullable Tag var2);
}

