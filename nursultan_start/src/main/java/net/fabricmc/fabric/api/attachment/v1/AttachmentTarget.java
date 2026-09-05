/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.attachment.v1;

import java.util.Objects;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget$OnAttachedSet;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.api.event.Event;
import org.jspecify.annotations.Nullable;

public interface AttachmentTarget {
    public static final String NBT_ATTACHMENT_KEY = "fabric:attachments";

    default public <A> A getAttachedOrCreate(AttachmentType<A> attachmentType) {
        Supplier<A> supplier = attachmentType.initializer();
        if (supplier == null) {
            throw new IllegalArgumentException("Single-argument getAttachedOrCreate is reserved for attachment types with default initializers");
        }
        return this.getAttachedOrCreate(attachmentType, supplier);
    }

    default public <A> A getAttachedOrCreate(AttachmentType<A> attachmentType, Supplier<A> supplier) {
        A a = this.getAttached(attachmentType);
        if (a != null) {
            return a;
        }
        A a2 = Objects.requireNonNull(supplier.get(), "initializer result cannot be null");
        this.setAttached(attachmentType, a2);
        return a2;
    }

    default public boolean hasAttached(AttachmentType<?> attachmentType) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public <A> Event<AttachmentTarget$OnAttachedSet<A>> onAttachedSet(AttachmentType<A> attachmentType) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public <A> @Nullable A setAttached(AttachmentType<A> attachmentType, @Nullable A a) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public <A> @Nullable A getAttached(AttachmentType<A> attachmentType) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public <A> A getAttachedOrSet(AttachmentType<A> attachmentType, A a) {
        Objects.requireNonNull(a, "default value cannot be null");
        A a2 = this.getAttached(attachmentType);
        if (a2 != null) {
            return a2;
        }
        this.setAttached(attachmentType, a);
        return a;
    }

    default public <A> A getAttachedOrThrow(AttachmentType<A> attachmentType) {
        return Objects.requireNonNull(this.getAttached(attachmentType), "No value was attached");
    }

    default public <A> A getAttachedOrElse(AttachmentType<A> attachmentType, @Nullable A a) {
        A a2 = this.getAttached(attachmentType);
        return a2 == null ? a : a2;
    }

    default public <A> @Nullable A removeAttached(AttachmentType<A> attachmentType) {
        return this.setAttached(attachmentType, null);
    }

    default public <A> @Nullable A modifyAttached(AttachmentType<A> attachmentType, UnaryOperator<A> unaryOperator) {
        return this.setAttached(attachmentType, unaryOperator.apply(this.getAttached(attachmentType)));
    }

    default public <A> A getAttachedOrGet(AttachmentType<A> attachmentType, Supplier<A> supplier) {
        Objects.requireNonNull(supplier, "default value supplier cannot be null");
        A a = this.getAttached(attachmentType);
        return a == null ? supplier.get() : a;
    }
}

