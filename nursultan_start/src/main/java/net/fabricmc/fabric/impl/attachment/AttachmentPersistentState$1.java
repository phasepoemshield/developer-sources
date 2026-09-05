/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Encoder
 *  minecraft.class04489
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04782
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class08303
 *  minecraft.class08329
 */
package net.fabricmc.fabric.impl.attachment;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import minecraft.class04489;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04782;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class08303;
import minecraft.class08329;
import net.fabricmc.fabric.impl.attachment.AttachmentPersistentState;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;

class AttachmentPersistentState$1
implements Encoder<AttachmentPersistentState> {
    final /* synthetic */ class04489 val$reporterContext;
    final /* synthetic */ class04782 val$world;

    AttachmentPersistentState$1(class04489 class044892, class04782 class047822) {
        this.val$reporterContext = class044892;
        this.val$world = class047822;
    }

    public <T> DataResult<T> encode(AttachmentPersistentState attachmentPersistentState, DynamicOps<T> dynamicOps, T t) {
        try (class04495 class044952 = new class04495(this.val$reporterContext, AttachmentPersistentState.LOGGER);){
            class08303 class083032 = class08303.N((class04490)class044952);
            ((AttachmentTargetImpl)this.val$world).fabric_writeAttachmentsToNbt((class08329)class083032);
            DataResult dataResult = DataResult.success((Object)class07713.N.N(dynamicOps, (class07709)class083032.y()));
            return dataResult;
        }
    }
}

