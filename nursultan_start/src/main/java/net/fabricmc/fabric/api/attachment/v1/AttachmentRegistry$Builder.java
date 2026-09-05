/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class04247
 */
package net.fabricmc.fabric.api.attachment.v1;

import com.mojang.serialization.Codec;
import java.util.function.Supplier;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class04247;
import net.fabricmc.fabric.api.attachment.v1.AttachmentSyncPredicate;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;

public interface AttachmentRegistry$Builder<A> {
    public AttachmentType<A> buildAndRegister(class01894 var1);

    public AttachmentRegistry$Builder<A> persistent(Codec<A> var1);

    public AttachmentRegistry$Builder<A> initializer(Supplier<A> var1);

    public AttachmentRegistry$Builder<A> copyOnDeath();

    public AttachmentRegistry$Builder<A> syncWith(class02362<? super class04247, A> var1, AttachmentSyncPredicate var2);
}

