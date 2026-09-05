/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry$Builder
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentType
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.attachment;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import minecraft.class01894;
import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.impl.attachment.AttachmentRegistryImpl$BuilderImpl;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class AttachmentRegistryImpl {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"fabric-data-attachment-api-v1");
    private static final Map<class01894, AttachmentType<?>> attachmentRegistry = new HashMap();
    private static final Set<class01894> syncableAttachments = new HashSet<class01894>();
    private static final Set<class01894> syncableView = Collections.unmodifiableSet(syncableAttachments);

    public static @Nullable AttachmentType<?> get(class01894 class018942) {
        return attachmentRegistry.get(class018942);
    }

    public static <A> AttachmentRegistry.Builder<A> builder() {
        return new AttachmentRegistryImpl$BuilderImpl();
    }

    public static <A> void register(class01894 class018942, AttachmentType<A> attachmentType) {
        AttachmentType<A> attachmentType2 = attachmentRegistry.put(class018942, attachmentType);
        if (attachmentType2 != null) {
            LOGGER.warn("Encountered duplicate type registration for id {}", (Object)class018942);
            if (attachmentType2.isSynced() && !attachmentType.isSynced()) {
                syncableAttachments.remove(class018942);
            } else if (!attachmentType2.isSynced() && attachmentType.isSynced()) {
                syncableAttachments.add(class018942);
            }
        } else if (attachmentType.isSynced()) {
            syncableAttachments.add(class018942);
        }
    }

    public static Set<class01894> getSyncableAttachments() {
        return syncableView;
    }
}

