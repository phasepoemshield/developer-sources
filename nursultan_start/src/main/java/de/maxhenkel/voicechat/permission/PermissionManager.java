/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 */
package de.maxhenkel.voicechat.permission;

import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.permission.Permission;
import de.maxhenkel.voicechat.permission.PermissionType;
import java.util.ArrayList;
import java.util.List;

public abstract class PermissionManager {
    public static PermissionManager INSTANCE = CommonCompatibilityManager.INSTANCE.createPermissionManager();
    public final Permission LISTEN_PERMISSION;
    public final Permission SPEAK_PERMISSION;
    public final Permission GROUPS_PERMISSION;
    public final Permission ADMIN_PERMISSION;
    protected List<Permission> permissions = new ArrayList<Permission>();

    public PermissionManager() {
        this.LISTEN_PERMISSION = this.createPermission("voicechat", "listen", PermissionType.EVERYONE);
        this.SPEAK_PERMISSION = this.createPermission("voicechat", "speak", PermissionType.EVERYONE);
        this.GROUPS_PERMISSION = this.createPermission("voicechat", "groups", PermissionType.EVERYONE);
        this.ADMIN_PERMISSION = this.createPermission("voicechat", "admin", PermissionType.OPS);
    }

    public List<Permission> getPermissions() {
        return this.permissions;
    }

    public Permission createPermission(String string, String string2, PermissionType permissionType) {
        Permission permission = this.createPermissionInternal(string, string2, permissionType);
        this.permissions.add(permission);
        return permission;
    }

    public abstract Permission createPermissionInternal(String var1, String var2, PermissionType var3);
}

