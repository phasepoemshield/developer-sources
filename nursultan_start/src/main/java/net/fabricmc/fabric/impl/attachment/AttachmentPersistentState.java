/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.Encoder
 *  minecraft.class04489
 *  minecraft.class04782
 *  minecraft.class06555
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.attachment;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Encoder;
import minecraft.class04489;
import minecraft.class04782;
import minecraft.class06555;
import net.fabricmc.fabric.impl.attachment.AttachmentPersistentState$1;
import net.fabricmc.fabric.impl.attachment.AttachmentPersistentState$2;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AttachmentPersistentState
extends class06555 {
    static final Logger LOGGER = LoggerFactory.getLogger(AttachmentPersistentState.class);
    public static final String ID = "fabric_attachments";
    private final AttachmentTargetImpl worldTarget;
    private final boolean wasSerialized;

    public AttachmentPersistentState(class04782 class047822) {
        this.worldTarget = (AttachmentTargetImpl)class047822;
        this.wasSerialized = this.worldTarget.fabric_hasPersistentAttachments();
    }

    public boolean method_79() {
        return this.wasSerialized || this.worldTarget.fabric_hasPersistentAttachments();
    }

    public static Codec<AttachmentPersistentState> codec(class04782 class047822) {
        class04489 class044892 = () -> "AttachmentPersistentState @ " + String.valueOf(class047822.method_27983().N());
        return Codec.of((Encoder)new AttachmentPersistentState$1(class044892, class047822), (Decoder)new AttachmentPersistentState$2(class044892, class047822));
    }
}

