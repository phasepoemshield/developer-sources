/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  net.fabricmc.loader.api.FabricLoader
 */
package de.maxhenkel.voicechat.permission;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.permission.FabricPermissionManager$1;
import de.maxhenkel.voicechat.permission.Permission;
import de.maxhenkel.voicechat.permission.PermissionManager;
import de.maxhenkel.voicechat.permission.PermissionType;
import net.fabricmc.loader.api.FabricLoader;

public class FabricPermissionManager
extends PermissionManager {
    static Boolean loaded;

    @Override
    public Permission createPermissionInternal(String string, String string2, PermissionType permissionType) {
        return new FabricPermissionManager$1(this, string, string2, permissionType);
    }

    static boolean isFabricPermissionsAPILoaded() {
        if (loaded == null && (loaded = Boolean.valueOf(FabricLoader.getInstance().isModLoaded("fabric-permissions-api-v0"))).booleanValue()) {
            Voicechat.LOGGER.info("Using Fabric Permissions API", new Object[0]);
        }
        return loaded;
    }
}

