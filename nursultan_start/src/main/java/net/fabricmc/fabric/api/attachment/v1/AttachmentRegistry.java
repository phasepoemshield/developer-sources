/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01894
 *  net.fabricmc.fabric.impl.attachment.AttachmentRegistryImpl
 */
package net.fabricmc.fabric.api.attachment.v1;

import com.mojang.serialization.Codec;
import java.util.function.Consumer;
import java.util.function.Supplier;
import minecraft.class01894;
import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry$Builder;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.impl.attachment.AttachmentRegistryImpl;

public final class AttachmentRegistry {
    public static <A> AttachmentType<A> create(class01894 class018942) {
        return AttachmentRegistry.create(class018942, attachmentRegistry$Builder -> {});
    }

    public static <A> AttachmentType<A> create(class01894 class018942, Consumer<AttachmentRegistry$Builder<A>> consumer) {
        AttachmentRegistry$Builder attachmentRegistry$Builder = AttachmentRegistryImpl.builder();
        consumer.accept(attachmentRegistry$Builder);
        return attachmentRegistry$Builder.buildAndRegister(class018942);
    }

    private AttachmentRegistry() {
    }

    @Deprecated
    public static <A> AttachmentRegistry$Builder<A> builder() {
        return AttachmentRegistryImpl.builder();
    }

    public static <A> AttachmentType<A> createPersistent(class01894 class018942, Codec<A> codec) {
        return AttachmentRegistry.create(class018942, attachmentRegistry$Builder -> attachmentRegistry$Builder.persistent(codec));
    }

    public static <A> AttachmentType<A> createDefaulted(class01894 class018942, Supplier<A> supplier) {
        return AttachmentRegistry.create(class018942, attachmentRegistry$Builder -> attachmentRegistry$Builder.initializer(supplier));
    }
}

