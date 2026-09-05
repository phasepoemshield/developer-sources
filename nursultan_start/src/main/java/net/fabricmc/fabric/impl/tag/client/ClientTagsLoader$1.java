/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01208
 *  minecraft.class01894
 *  minecraft.class03530
 *  minecraft.class05946
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.tag.client;

import java.util.Collection;
import java.util.HashSet;
import minecraft.class01208;
import minecraft.class01894;
import minecraft.class03530;
import minecraft.class05946;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.tag.client.ClientTagsImpl;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
class ClientTagsLoader$1
implements class01208<class01894> {
    final /* synthetic */ HashSet val$immediateChildIds;
    final /* synthetic */ class03530 val$tagKey;
    final /* synthetic */ HashSet val$immediateChildTags;

    public /* synthetic */ @Nullable Object method_43948(class01894 class018942, boolean bl) {
        return this.element(class018942, bl);
    }

    public @Nullable Collection<class01894> method_43949(class01894 class018942) {
        class03530 class035302 = class03530.N((class05946)this.val$tagKey.N(), (class01894)class018942);
        this.val$immediateChildTags.add(class035302);
        return ClientTagsImpl.getOrCreatePartiallySyncedTag(class035302).completeIds;
    }

    ClientTagsLoader$1(HashSet hashSet, class03530 class035302, HashSet hashSet2) {
        this.val$immediateChildIds = hashSet;
        this.val$tagKey = class035302;
        this.val$immediateChildTags = hashSet2;
    }

    public @Nullable class01894 element(class01894 class018942, boolean bl) {
        this.val$immediateChildIds.add(class018942);
        return class018942;
    }
}

