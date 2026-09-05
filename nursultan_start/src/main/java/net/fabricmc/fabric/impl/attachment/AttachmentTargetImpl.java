/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01042
 *  minecraft.class04770
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentTarget
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentType
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.attachment;

import java.util.Map;
import java.util.function.Consumer;
import minecraft.class01042;
import minecraft.class04770;
import minecraft.class08299;
import minecraft.class08329;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo;
import org.jspecify.annotations.Nullable;

public interface AttachmentTargetImpl
extends AttachmentTarget {
    public static void transfer(AttachmentTarget attachmentTarget, AttachmentTarget attachmentTarget2, boolean bl) {
        Map<AttachmentType<?>, ?> map = ((AttachmentTargetImpl)attachmentTarget).fabric_getAttachments();
        if (map == null) {
            return;
        }
        for (Map.Entry<AttachmentType<?>, ?> entry : map.entrySet()) {
            AttachmentType<?> attachmentType = entry.getKey();
            if (bl && !attachmentType.copyOnDeath()) continue;
            attachmentTarget2.setAttached(attachmentType, entry.getValue());
        }
    }

    default public AttachmentTargetInfo<?> fabric_getSyncTargetInfo() {
        throw new UnsupportedOperationException("Sync target info was not retrieved on server!");
    }

    default public @Nullable Map<AttachmentType<?>, ?> fabric_getAttachments() {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public boolean fabric_shouldTryToSync() {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public void fabric_markChanged(AttachmentType<?> attachmentType) {
    }

    default public void fabric_syncChange(AttachmentType<?> attachmentType, AttachmentChange attachmentChange) {
    }

    default public boolean fabric_hasPersistentAttachments() {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    public class01042 fabric_getDynamicRegistryManager();

    default public void fabric_writeAttachmentsToNbt(class08329 class083292) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public void fabric_readAttachmentsFromNbt(class08299 class082992) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public void fabric_computeInitialSyncChanges(class04770 class047702, Consumer<AttachmentChange> consumer) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }
}

