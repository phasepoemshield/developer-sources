/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 */
package net.fabricmc.fabric.impl.tag;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import net.fabricmc.fabric.impl.tag.TagAliasGroup;

public final class TagAliasLoader$Data
extends Record {
    private final class01894 groupId;
    final TagAliasGroup<?> group;

    public class01894 groupId() {
        return this.groupId;
    }

    protected TagAliasLoader$Data(class01894 class018942, TagAliasGroup<?> tagAliasGroup) {
        this.groupId = class018942;
        this.group = tagAliasGroup;
    }

    public TagAliasGroup<?> group() {
        return this.group;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{TagAliasLoader$Data.class, "groupId;group", "groupId", "group"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{TagAliasLoader$Data.class, "groupId;group", "groupId", "group"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{TagAliasLoader$Data.class, "groupId;group", "groupId", "group"}, this);
    }
}

