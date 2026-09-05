/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 */
package net.raphimc.viabedrock.protocol.model;

import com.viaversion.viaversion.api.minecraft.BlockPosition;

public record BlockChangeEntry(BlockPosition position, int blockState, int flags, long messageEntityUniqueId, int messageType) {
}

