/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  me.lucko.fabric.api.permissions.v0.Permissions
 *  minecraft.class04770
 *  minecraft.class07049
 */
package de.maxhenkel.voicechat.permission;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.permission.FabricPermissionManager;
import de.maxhenkel.voicechat.permission.Permission;
import de.maxhenkel.voicechat.permission.PermissionType;
import me.lucko.fabric.api.permissions.v0.Permissions;
import minecraft.class04770;
import minecraft.class07049;

class FabricPermissionManager$1
implements Permission {
    final /* synthetic */ String val$modId;
    final /* synthetic */ String val$node;
    final /* synthetic */ PermissionType val$type;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    FabricPermissionManager$1() {
        void var4_-1;
        void var3_-1;
        void var2_-1;
        this.val$modId = var2_-1;
        this.val$node = var3_-1;
        this.val$type = var4_-1;
    }

    @Override
    public boolean hasPermission(class04770 class047702) {
        try {
            if (FabricPermissionManager.isFabricPermissionsAPILoaded()) {
                return Permissions.check((class07049)class047702, (String)(this.val$modId + "." + this.val$node), (boolean)this.val$type.hasPermission(class047702));
            }
        }
        catch (Throwable throwable) {
            FabricPermissionManager.loaded = false;
            Voicechat.LOGGER.warn("Failed to use fabric-permissions-api-v0", throwable);
            Voicechat.LOGGER.info("Disabling fabric-permissions-api-v0 integration", new Object[0]);
        }
        return this.val$type.hasPermission(class047702);
    }

    @Override
    public PermissionType getPermissionType() {
        return this.val$type;
    }
}

