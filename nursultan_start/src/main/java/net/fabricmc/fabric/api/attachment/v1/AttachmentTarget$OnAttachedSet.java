/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.attachment.v1;

import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface AttachmentTarget$OnAttachedSet<A> {
    public void onAttachedSet(@Nullable A var1, @Nullable A var2);
}

