/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class04247
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentSyncPredicate
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentType
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.attachment;

import com.mojang.serialization.Codec;
import java.util.function.Supplier;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class04247;
import net.fabricmc.fabric.api.attachment.v1.AttachmentSyncPredicate;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import org.jspecify.annotations.Nullable;

public record AttachmentTypeImpl<A>(class01894 identifier, @Nullable Supplier<A> initializer, @Nullable Codec<A> persistenceCodec, @Nullable class02362<? super class04247, A> packetCodec, @Nullable AttachmentSyncPredicate syncPredicate, boolean copyOnDeath) implements AttachmentType<A>
{
    public boolean isSynced() {
        return this.syncPredicate != null;
    }
}

