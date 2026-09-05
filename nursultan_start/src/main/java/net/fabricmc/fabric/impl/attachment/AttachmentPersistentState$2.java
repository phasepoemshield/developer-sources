/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class01929
 *  minecraft.class04489
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04782
 *  minecraft.class07001
 *  minecraft.class07713
 *  minecraft.class08299
 *  minecraft.class08308
 */
package net.fabricmc.fabric.impl.attachment;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import minecraft.class01929;
import minecraft.class04489;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04782;
import minecraft.class07001;
import minecraft.class07713;
import minecraft.class08299;
import minecraft.class08308;
import net.fabricmc.fabric.impl.attachment.AttachmentPersistentState;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;

class AttachmentPersistentState$2
implements Decoder<AttachmentPersistentState> {
    final /* synthetic */ class04489 val$reporterContext;
    final /* synthetic */ class04782 val$world;

    AttachmentPersistentState$2(class04489 class044892, class04782 class047822) {
        this.val$reporterContext = class044892;
        this.val$world = class047822;
    }

    public <T> DataResult<Pair<AttachmentPersistentState, T>> decode(DynamicOps<T> dynamicOps, T t) {
        try (class04495 class044952 = new class04495(this.val$reporterContext, AttachmentPersistentState.LOGGER);){
            class08299 class082992 = class08308.N((class04490)class044952, (class01929)this.val$world.method_30349(), (class07001)((class07001)dynamicOps.convertTo((DynamicOps)class07713.N, t)));
            ((AttachmentTargetImpl)this.val$world).fabric_readAttachmentsFromNbt(class082992);
            DataResult dataResult = DataResult.success((Object)Pair.of((Object)((Object)new AttachmentPersistentState(this.val$world)), (Object)dynamicOps.empty()));
            return dataResult;
        }
    }
}

