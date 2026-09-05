/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01894
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.attachment.v1;

import com.mojang.serialization.Codec;
import java.util.function.Supplier;
import minecraft.class01894;
import org.jspecify.annotations.Nullable;

public interface AttachmentType<A> {
    public class01894 identifier();

    public boolean isSynced();

    public @Nullable Supplier<A> initializer();

    public boolean copyOnDeath();

    default public boolean isPersistent() {
        return this.persistenceCodec() != null;
    }

    public @Nullable Codec<A> persistenceCodec();
}

