/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  de.maxhenkel.voicechat.api.Group$Type
 *  de.maxhenkel.voicechat.voice.common.PlayerState
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01631
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class08394
 */
package de.maxhenkel.voicechat.gui.group;

import com.google.common.collect.Lists;
import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.gui.GameProfileUtils;
import de.maxhenkel.voicechat.gui.GroupType;
import de.maxhenkel.voicechat.gui.group.JoinGroupEntry$Group;
import de.maxhenkel.voicechat.gui.widgets.ListScreenEntryBase;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01631;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class08394;

public class JoinGroupEntry
extends ListScreenEntryBase<JoinGroupEntry> {
    protected static final class01894 LOCK = class01894.N((String)"voicechat", (String)"icons/lock");
    protected static final class00392 GROUP_MEMBERS = class00392.L((String)"message.voicechat.group_members").N(class06541.field_1080);
    protected static final class00392 NO_GROUP_MEMBERS = class00392.L((String)"message.voicechat.no_group_members").N(class06541.field_1080);
    protected static final int SKIN_SIZE = 12;
    protected static final int PADDING = 4;
    protected static final int BG_FILL = class02566.y((int)255, (int)74, (int)74, (int)74);
    protected static final int BG_FILL_SELECTED = class02566.y((int)255, (int)90, (int)90, (int)90);
    protected static final int PLAYER_NAME_COLOR = class02566.y((int)255, (int)255, (int)255, (int)255);
    protected final class05096 parent;
    protected final class06202 minecraft;
    protected final JoinGroupEntry$Group group;

    public JoinGroupEntry(class05096 class050962, JoinGroupEntry$Group joinGroupEntry$Group) {
        this.parent = class050962;
        this.minecraft = class06202.Nq();
        this.group = joinGroupEntry$Group;
    }

    public JoinGroupEntry$Group getGroup() {
        return this.group;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3;
        int n4 = this.method_73380();
        int n5 = this.method_73382();
        int n6 = this.method_73387();
        int n7 = this.method_73384();
        if (bl) {
            class010542.N(n4, n5, n4 + n6, n5 + n7, BG_FILL_SELECTED);
        } else {
            class010542.N(n4, n5, n4 + n6, n5 + n7, BG_FILL);
        }
        boolean bl2 = this.group.group.hasPassword();
        if (bl2) {
            class010542.i().pushMatrix();
            class010542.i().translate((float)(n4 + 4), (float)n5 + (float)n7 / 2.0f - 8.0f);
            class010542.i().scale(1.3333334f, 1.3333334f);
            class010542.N(class08394.Na, LOCK, 16, 16, 0, 0, 0, 0, 12, 12);
            class010542.i().popMatrix();
        }
        class05216 class052162 = class00392.y((String)this.group.group.getName());
        class01590 class015902 = (class01590)this.minecraft.i_3;
        int n8 = n4 + 4 + (bl2 ? 20 : 0);
        int n9 = n5 + n7 / 2;
        Objects.requireNonNull((class01590)this.minecraft.i_3);
        class010542.N(class015902, (class00392)class052162, n8, n9 - 9 / 2, PLAYER_NAME_COLOR, false);
        int n10 = ((class01590)this.minecraft.i_3).N((class05936)class052162) + (bl2 ? 20 : 0);
        int n11 = (n6 - (4 + n10 + 4 + 4)) / 13;
        int n12 = 2;
        for (int i = 0; i < this.group.members.size(); ++i) {
            PlayerState playerState = this.group.members.get(i);
            n3 = i / n12;
            int n13 = i % n12;
            if (i >= n11 * n12) break;
            int n14 = n4 + n6 - 12 - 4 - n3 * 13;
            int n15 = n5 + n7 / 2 - 13 + 13 * n13;
            class010542.i().pushMatrix();
            class010542.i().translate((float)n14, (float)n15);
            float f2 = 1.5f;
            class010542.i().scale(f2, f2);
            class01631 class016312 = GameProfileUtils.getSkin(playerState.getUuid());
            class010542.N(class08394.Na, class016312.N().y(), 0, 0, 8.0f, 8.0f, 8, 8, 64, 64);
            class010542.N(class08394.Na, class016312.N().y(), 0, 0, 40.0f, 8.0f, 8, 8, 64, 64);
            class010542.i().popMatrix();
        }
        if (!bl) {
            return;
        }
        ArrayList arrayList = Lists.newArrayList();
        if (this.group.getGroup().getType().equals((Object)Group.Type.NORMAL)) {
            arrayList.add(class00392.N((String)"message.voicechat.group_title", (Object[])new Object[]{class00392.y((String)this.group.getGroup().getName())}).method_30937());
        } else {
            arrayList.add(class00392.N((String)"message.voicechat.group_type_title", (Object[])new Object[]{class00392.y((String)this.group.getGroup().getName()), GroupType.fromType(this.group.getGroup().getType()).getTranslation()}).method_30937());
        }
        if (this.group.getMembers().isEmpty()) {
            arrayList.add(NO_GROUP_MEMBERS.method_30937());
        } else {
            arrayList.add(GROUP_MEMBERS.method_30937());
            int n16 = 10;
            for (n3 = 0; n3 < this.group.getMembers().size(); ++n3) {
                if (n3 >= n16) {
                    arrayList.add(class00392.N((String)"message.voicechat.more_members", (Object[])new Object[]{this.group.getMembers().size() - n16}).N(class06541.field_1080).method_30937());
                    break;
                }
                PlayerState playerState = this.group.getMembers().get(n3);
                arrayList.add(class00392.y((String)("  " + playerState.getName())).N(class06541.field_1080).method_30937());
            }
        }
        class010542.y((class01590)this.minecraft.i_3, (List)arrayList, n, n2);
    }
}

