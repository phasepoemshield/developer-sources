/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.net.ClientServerNetManager
 *  de.maxhenkel.voicechat.net.JoinGroupPacket
 *  de.maxhenkel.voicechat.net.Packet
 *  de.maxhenkel.voicechat.voice.common.ClientGroup
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06601
 *  minecraft.class08394
 */
package de.maxhenkel.voicechat.gui;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.gui.VoiceChatScreenBase;
import de.maxhenkel.voicechat.net.ClientServerNetManager;
import de.maxhenkel.voicechat.net.JoinGroupPacket;
import de.maxhenkel.voicechat.net.Packet;
import de.maxhenkel.voicechat.voice.common.ClientGroup;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06601;
import minecraft.class08394;

public class EnterPasswordScreen
extends VoiceChatScreenBase {
    private static final class01894 TEXTURE = class01894.N((String)"voicechat", (String)"textures/gui/gui_enter_password.png");
    private static final class00392 TITLE = class00392.L((String)"gui.voicechat.enter_password.title");
    private static final class00392 JOIN_GROUP = class00392.L((String)"message.voicechat.join_group");
    private static final class00392 ENTER_GROUP_PASSWORD = class00392.L((String)"message.voicechat.enter_group_password");
    private static final class00392 PASSWORD = class00392.L((String)"message.voicechat.password");
    private class04927 password;
    private class05362 joinGroup;
    private ClientGroup group;

    public EnterPasswordScreen(ClientGroup clientGroup) {
        super(TITLE, 195, 74);
        this.group = clientGroup;
    }

    @Override
    public void method_25426() {
        super.method_25426();
        this.hoverAreas.clear();
        this.method_37067();
        Objects.requireNonNull(this.field_22793);
        this.password = new class04927(this.field_22793, this.guiLeft + 7, this.guiTop + 7 + (9 + 5) * 2 - 5, this.xSize - 14, 14, (class00392)class00392.i());
        this.password.method_1880(32);
        this.password.method_1890(string -> string.isEmpty() || Voicechat.GROUP_REGEX.matcher((CharSequence)string).matches());
        this.method_37063((class04654)this.password);
        this.joinGroup = class05362.method_46430((class00392)JOIN_GROUP, class053622 -> this.joinGroup()).N(this.guiLeft + 7, this.guiTop + this.ySize - 20 - 7, this.xSize - 14, 20).N();
        this.method_37063((class04654)this.joinGroup);
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
            this.joinGroup();
            return true;
        }
        return false;
    }

    public void method_25393() {
        super.method_25393();
        this.joinGroup.field_22763 = !this.password.method_1882().isEmpty();
    }

    @Override
    public void method_25420(class01054 class010542, int n, int n2, float f) {
        class010542.N(class08394.Na, TEXTURE, this.guiLeft, this.guiTop, 0.0f, 0.0f, this.xSize, this.ySize, 256, 256);
    }

    public void method_25410(int n, int n2) {
        String string = this.password.method_1882();
        this.method_25423(n, n2);
        this.password.method_1852(string);
    }

    private void joinGroup() {
        if (!this.password.method_1882().isEmpty()) {
            ClientServerNetManager.sendToServer((Packet)new JoinGroupPacket(this.group.getId(), this.password.method_1882()));
        }
    }

    @Override
    public void renderForeground(class01054 class010542, int n, int n2, float f) {
        class010542.N(this.field_22793, ENTER_GROUP_PASSWORD, this.guiLeft + this.xSize / 2 - this.field_22793.N((class05936)ENTER_GROUP_PASSWORD) / 2, this.guiTop + 7, -12566464, false);
        Objects.requireNonNull(this.field_22793);
        class010542.N(this.field_22793, PASSWORD, this.guiLeft + 8, this.guiTop + 7 + 9 + 5, -12566464, false);
    }
}

