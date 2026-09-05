/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  javax.annotation.Nullable
 *  minecraft.class04770
 *  minecraft.class08159
 *  minecraft.class08179
 *  minecraft.class08195
 */
package de.maxhenkel.voicechat.permission;

import javax.annotation.Nullable;
import minecraft.class04770;
import minecraft.class08159;
import minecraft.class08179;
import minecraft.class08195;

public enum PermissionType {
    EVERYONE,
    NOONE,
    OPS;


    boolean hasPermission(@Nullable class04770 class047702) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> true;
            case 1 -> false;
            case 2 -> class047702 != null && class047702.method_75004().hasPermission((class08159)new class08179(class08195.field_63199));
        };
    }
}

