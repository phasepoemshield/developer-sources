/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Group$Type
 *  minecraft.class00392
 */
package de.maxhenkel.voicechat.gui;

import de.maxhenkel.voicechat.api.Group;
import minecraft.class00392;

public enum GroupType {
    NORMAL((class00392)class00392.L((String)"message.voicechat.group_type.normal"), (class00392)class00392.L((String)"message.voicechat.group_type.normal.description"), Group.Type.NORMAL),
    OPEN((class00392)class00392.L((String)"message.voicechat.group_type.open"), (class00392)class00392.L((String)"message.voicechat.group_type.open.description"), Group.Type.OPEN),
    ISOLATED((class00392)class00392.L((String)"message.voicechat.group_type.isolated"), (class00392)class00392.L((String)"message.voicechat.group_type.isolated.description"), Group.Type.ISOLATED);

    private final class00392 translation;
    private final class00392 description;
    private final Group.Type type;

    private GroupType(class00392 class003922, class00392 class003923, Group.Type type) {
        this.translation = class003922;
        this.description = class003923;
        this.type = type;
    }

    public Group.Type getType() {
        return this.type;
    }

    public static GroupType fromType(Group.Type type) {
        for (GroupType groupType : GroupType.values()) {
            if (groupType.getType() != type) continue;
            return groupType;
        }
        return NORMAL;
    }

    public class00392 getDescription() {
        return this.description;
    }

    public class00392 getTranslation() {
        return this.translation;
    }
}

