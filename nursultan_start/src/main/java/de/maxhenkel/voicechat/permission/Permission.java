/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.permission;

import de.maxhenkel.voicechat.permission.PermissionType;
import minecraft.class04770;

public interface Permission {
    public boolean hasPermission(class04770 var1);

    public PermissionType getPermissionType();
}

