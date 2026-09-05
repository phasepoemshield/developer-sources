/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04770
 */
package net.fabricmc.fabric.api.attachment.v1;

import java.util.function.BiPredicate;
import minecraft.class04770;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget;

@FunctionalInterface
public interface AttachmentSyncPredicate
extends BiPredicate<AttachmentTarget, class04770> {
    public static AttachmentSyncPredicate all() {
        return (attachmentTarget, class047702) -> true;
    }

    public static AttachmentSyncPredicate targetOnly() {
        return (attachmentTarget, class047702) -> attachmentTarget == class047702;
    }

    public static AttachmentSyncPredicate allButTarget() {
        return (attachmentTarget, class047702) -> attachmentTarget != class047702;
    }
}

