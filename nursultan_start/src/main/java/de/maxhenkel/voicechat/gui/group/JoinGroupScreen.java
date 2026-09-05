/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04654
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06541
 *  minecraft.class08394
 */
package de.maxhenkel.voicechat.gui.group;

import de.maxhenkel.voicechat.gui.CreateGroupScreen;
import de.maxhenkel.voicechat.gui.VoiceChatScreenBase;
import de.maxhenkel.voicechat.gui.group.JoinGroupList;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04654;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06541;
import minecraft.class08394;

public class JoinGroupScreen
extends VoiceChatScreenBase {
    protected static final class01894 TEXTURE = class01894.N((String)"voicechat", (String)"textures/gui/gui_join_group.png");
    protected static final class00392 TITLE = class00392.L((String)"gui.voicechat.join_create_group.title");
    protected static final class00392 CREATE_GROUP = class00392.L((String)"message.voicechat.create_group_button");
    protected static final class00392 JOIN_CREATE_GROUP = class00392.L((String)"message.voicechat.join_create_group");
    protected static final class00392 NO_GROUPS = class00392.L((String)"message.voicechat.no_groups").N(class06541.field_1080);
    protected static final int HEADER_SIZE = 16;
    protected static final int FOOTER_SIZE = 32;
    protected static final int UNIT_SIZE = 18;
    protected static final int CELL_HEIGHT = 36;
    protected JoinGroupList groupList;
    protected class05362 createGroup;
    protected int units;

    public JoinGroupScreen() {
        super(TITLE, 236, 0);
    }

    @Override
    public void method_25426() {
        super.method_25426();
        this.guiLeft += 2;
        this.guiTop = 32;
        int n = class04995.u((float)2.2222223f);
        this.units = Math.max(n, (this.field_22790 - 16 - 32 - this.guiTop * 2) / 18);
        this.ySize = 16 + this.units * 18 + 32;
        if (this.groupList != null) {
            this.groupList.updateSize(this.field_22789, this.units * 18, 0, this.guiTop + 16);
        } else {
            this.groupList = new JoinGroupList(this, this.field_22789, this.units * 18, this.guiTop + 16, 36);
        }
        this.method_25429((class04654)this.groupList);
        this.createGroup = class05362.method_46430((class00392)CREATE_GROUP, class053622 -> this.field_22787.N((class05096)new CreateGroupScreen())).N(this.guiLeft + 7, this.guiTop + this.ySize - 20 - 7, this.xSize - 14, 20).N();
        this.method_37063((class04654)this.createGroup);
    }

    @Override
    public void method_25420(class01054 class010542, int n, int n2, float f) {
        class010542.N(class08394.Na, TEXTURE, this.guiLeft, this.guiTop, 0.0f, 0.0f, this.xSize, 16, 256, 256);
        for (int i = 0; i < this.units; ++i) {
            class010542.N(class08394.Na, TEXTURE, this.guiLeft, this.guiTop + 16 + 18 * i, 0.0f, 16.0f, this.xSize, 18, 256, 256);
        }
        class010542.N(class08394.Na, TEXTURE, this.guiLeft, this.guiTop + 16 + 18 * this.units, 0.0f, 34.0f, this.xSize, 32, 256, 256);
        class010542.N(class08394.Na, TEXTURE, this.guiLeft + 10, this.guiTop + 16 + 6 - 2, (float)this.xSize, 0.0f, 12, 12, 256, 256);
    }

    @Override
    public void renderForeground(class01054 class010542, int n, int n2, float f) {
        class010542.N(this.field_22793, JOIN_CREATE_GROUP, this.guiLeft + this.xSize / 2 - this.field_22793.N((class05936)JOIN_CREATE_GROUP) / 2, this.guiTop + 5, -12566464, false);
        if (!this.groupList.isEmpty()) {
            this.groupList.method_25394(class010542, n, n2, f);
        } else {
            int n3 = this.field_22789 / 2;
            int n4 = this.guiTop + 16 + this.units * 18 / 2;
            Objects.requireNonNull(this.field_22793);
            class010542.N(this.field_22793, NO_GROUPS, n3, n4 - 9 / 2, -1);
        }
    }
}

