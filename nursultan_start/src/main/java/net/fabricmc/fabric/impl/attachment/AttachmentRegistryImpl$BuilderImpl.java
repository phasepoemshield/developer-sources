/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class04247
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry$Builder
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentSyncPredicate
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentType
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.attachment;

import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class04247;
import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry;
import net.fabricmc.fabric.api.attachment.v1.AttachmentSyncPredicate;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.impl.attachment.AttachmentRegistryImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl;
import org.jspecify.annotations.Nullable;

public class AttachmentRegistryImpl$BuilderImpl<A>
implements AttachmentRegistry.Builder<A> {
    private @Nullable Supplier<A> defaultInitializer = null;
    private @Nullable Codec<A> persistenceCodec = null;
    private @Nullable class02362<? super class04247, A> packetCodec = null;
    private @Nullable AttachmentSyncPredicate syncPredicate = null;
    private boolean copyOnDeath = false;

    public AttachmentType<A> buildAndRegister(class01894 class018942) {
        Objects.requireNonNull(class018942, "identifier cannot be null");
        if (this.syncPredicate != null) {
            if (class018942.toString().length() > 256) {
                Object[] objectArray = new Object[2];
                objectArray[0] = class018942.toString().length();
                objectArray[1] = 256;
                throw new IllegalArgumentException("Identifier length is too long for a synced attachment type (was %d, maximum is %d)".formatted(objectArray));
            }
        }
        AttachmentTypeImpl<A> attachmentTypeImpl = new AttachmentTypeImpl<A>(class018942, this.defaultInitializer, this.persistenceCodec, this.packetCodec, this.syncPredicate, this.copyOnDeath);
        AttachmentRegistryImpl.register(class018942, attachmentTypeImpl);
        return attachmentTypeImpl;
    }

    public AttachmentRegistry.Builder<A> persistent(Codec<A> codec) {
        Objects.requireNonNull(codec, "codec cannot be null");
        this.persistenceCodec = codec;
        return this;
    }

    public AttachmentRegistry.Builder<A> initializer(Supplier<A> supplier) {
        Objects.requireNonNull(supplier, "initializer cannot be null");
        this.defaultInitializer = supplier;
        return this;
    }

    public AttachmentRegistry.Builder<A> copyOnDeath() {
        this.copyOnDeath = true;
        return this;
    }

    @Deprecated
    public AttachmentRegistry.Builder<A> syncWith(class02362<? super class04247, A> class023622, AttachmentSyncPredicate attachmentSyncPredicate) {
        Objects.requireNonNull(class023622, "packet codec cannot be null");
        Objects.requireNonNull(attachmentSyncPredicate, "sync predicate cannot be null");
        this.packetCodec = class023622;
        this.syncPredicate = attachmentSyncPredicate;
        return this;
    }
}

