/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.net.ClientServerNetManager
 *  de.maxhenkel.voicechat.net.CreateGroupPacket
 *  de.maxhenkel.voicechat.net.Packet
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04141
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06366
 *  minecraft.class06601
 *  minecraft.class08394
 */
package de.maxhenkel.voicechat.gui;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.gui.GroupType;
import de.maxhenkel.voicechat.gui.VoiceChatScreenBase;
import de.maxhenkel.voicechat.net.ClientServerNetManager;
import de.maxhenkel.voicechat.net.CreateGroupPacket;
import de.maxhenkel.voicechat.net.Packet;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04141;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06366;
import minecraft.class06601;
import minecraft.class08394;

public class CreateGroupScreen
extends VoiceChatScreenBase {
    private static final class01894 TEXTURE = class01894.N((String)"voicechat", (String)"textures/gui/gui_create_group.png");
    private static final class00392 TITLE = class00392.L((String)"gui.voicechat.create_group.title");
    private static final class00392 CREATE = class00392.L((String)"message.voicechat.create");
    private static final class00392 CREATE_GROUP = class00392.L((String)"message.voicechat.create_group");
    private static final class00392 GROUP_NAME = class00392.L((String)"message.voicechat.group_name");
    private static final class00392 OPTIONAL_PASSWORD = class00392.L((String)"message.voicechat.optional_password");
    private static final class00392 GROUP_TYPE = class00392.L((String)"message.voicechat.group_type");
    private class04927 groupName;
    private class04927 password;
    private GroupType groupType = GroupType.NORMAL;
    private class05362 createGroup;

    private void createGroup() {
        if (!this.groupName.method_1882().isEmpty()) {
            ClientServerNetManager.sendToServer((Packet)new CreateGroupPacket(this.groupName.method_1882(), this.password.method_1882().isEmpty() ? null : this.password.method_1882(), this.groupType.getType()));
        }
    }

    public CreateGroupScreen() {
        super(TITLE, 195, 124);
    }

    @Override
    public void method_25426() {
        super.method_25426();
        this.hoverAreas.clear();
        this.method_37067();
        this.groupName = new class04927(this.field_22793, this.guiLeft + 7, this.guiTop + 30, this.xSize - 14, 14, (class00392)class00392.i());
        this.groupName.method_1880(24);
        this.groupName.method_1890(string -> string.isEmpty() || Voicechat.GROUP_REGEX.matcher((CharSequence)string).matches());
        this.method_37063((class04654)this.groupName);
        this.password = new class04927(this.field_22793, this.guiLeft + 7, this.guiTop + 56, this.xSize - 14, 14, (class00392)class00392.i());
        this.password.method_1880(24);
        this.password.method_1890(string -> string.isEmpty() || Voicechat.GROUP_REGEX.matcher((CharSequence)string).matches());
        this.method_37063((class04654)this.password);
        this.method_37063((class04654)class06366.N(GroupType::getTranslation, (Object)((Object)GroupType.NORMAL)).N((Object[])GroupType.values()).N(groupType -> class04141.N((class00392)groupType.getDescription())).N(this.guiLeft + 6, this.guiTop + 74, this.xSize - 12, 20, GROUP_TYPE, (class063662, groupType) -> {
            this.groupType = groupType;
        }));
        this.createGroup = class05362.method_46430((class00392)CREATE, class053622 -> this.createGroup()).N(this.guiLeft + 6, this.guiTop + this.ySize - 27, this.xSize - 12, 20).N();
        this.method_37063((class04654)this.createGroup);
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.i()) {
            this.field_22787.N(null);
            return true;
        }
        if (super.method_25404(class066012)) {
            return true;
        }
        if (class066012.u()) {
            this.createGroup();
            return true;
        }
        return false;
    }

    public void method_25393() {
        super.method_25393();
        this.createGroup.field_22763 = !this.groupName.method_1882().isEmpty();
    }

    @Override
    public void method_25420(class01054 class010542, int n, int n2, float f) {
        class010542.N(class08394.Na, TEXTURE, this.guiLeft, this.guiTop, 0.0f, 0.0f, this.xSize, this.ySize, 256, 256);
    }

    public void method_25410(int n, int n2) {
        String string = this.groupName.method_1882();
        String string2 = this.password.method_1882();
        this.method_25423(n, n2);
        this.groupName.method_1852(string);
        this.password.method_1852(string2);
    }

    @Override
    public void renderForeground(class01054 class010542, int n, int n2, float f) {
        class010542.N(this.field_22793, CREATE_GROUP, this.guiLeft + this.xSize / 2 - this.field_22793.N((class05936)CREATE_GROUP) / 2, this.guiTop + 7, -12566464, false);
        Objects.requireNonNull(this.field_22793);
        class010542.N(this.field_22793, GROUP_NAME, this.guiLeft + 8, this.guiTop + 7 + 9 + 5, -12566464, false);
        Objects.requireNonNull(this.field_22793);
        class010542.N(this.field_22793, OPTIONAL_PASSWORD, this.guiLeft + 8, this.guiTop + 7 + (9 + 5) * 2 + 10 + 2, -12566464, false);
    }
}

