/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Group$Type
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.api.Group;

public class GroupImpl$TypeImpl
implements Group.Type {
    public static short toInt(Group.Type type) {
        if (type == OPEN) {
            return 1;
        }
        if (type == ISOLATED) {
            return 2;
        }
        return 0;
    }

    public static Group.Type fromInt(short s) {
        if (s == 1) {
            return OPEN;
        }
        if (s == 2) {
            return ISOLATED;
        }
        return NORMAL;
    }
}

