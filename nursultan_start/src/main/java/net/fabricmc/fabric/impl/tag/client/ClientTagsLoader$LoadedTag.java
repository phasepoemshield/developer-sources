/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class03530
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.tag.client;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class01894;
import minecraft.class03530;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class ClientTagsLoader$LoadedTag
extends Record {
    final Set<class01894> completeIds;
    private final Set<class03530<?>> immediateChildTags;
    private final Set<class01894> immediateChildIds;

    public ClientTagsLoader$LoadedTag(Set<class01894> set, Set<class03530<?>> set2, Set<class01894> set3) {
        this.completeIds = set;
        this.immediateChildTags = set2;
        this.immediateChildIds = set3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ClientTagsLoader$LoadedTag.class, "completeIds;immediateChildTags;immediateChildIds", "completeIds", "immediateChildTags", "immediateChildIds"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ClientTagsLoader$LoadedTag.class, "completeIds;immediateChildTags;immediateChildIds", "completeIds", "immediateChildTags", "immediateChildIds"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ClientTagsLoader$LoadedTag.class, "completeIds;immediateChildTags;immediateChildIds", "completeIds", "immediateChildTags", "immediateChildIds"}, this);
    }

    public Set<class01894> immediateChildIds() {
        return this.immediateChildIds;
    }

    public Set<class03530<?>> immediateChildTags() {
        return this.immediateChildTags;
    }

    public Set<class01894> completeIds() {
        return this.completeIds;
    }
}

