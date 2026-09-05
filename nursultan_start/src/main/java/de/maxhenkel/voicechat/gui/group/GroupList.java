/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.common.PlayerState
 *  minecraft.class01202
 *  minecraft.class05096
 *  minecraft.class06202
 */
package de.maxhenkel.voicechat.gui.group;

import de.maxhenkel.voicechat.gui.group.GroupEntry;
import de.maxhenkel.voicechat.gui.group.GroupScreen;
import de.maxhenkel.voicechat.gui.widgets.ListScreenListBase;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import minecraft.class01202;
import minecraft.class05096;
import minecraft.class06202;

public class GroupList
extends ListScreenListBase<GroupEntry> {
    protected final class05096 parent;

    public GroupList(class05096 class050962, int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
        this.parent = class050962;
        this.updateMembers();
    }

    public static void update() {
        class05096 class050962 = (class05096)class06202.Nq().v_3;
        if (class050962 instanceof GroupScreen) {
            GroupScreen groupScreen = (GroupScreen)class050962;
            groupScreen.groupList.updateMembers();
        }
    }

    private static /* synthetic */ boolean lambda$updateMembers$0(PlayerState playerState, GroupEntry groupEntry) {
        return groupEntry.getState().getUuid().equals(playerState.getUuid());
    }

    private boolean isInGroup(PlayerState playerState, UUID uUID) {
        return playerState.hasGroup() && playerState.getGroup().equals(uUID);
    }

    public void updateMembers() {
        List list = ClientManager.getPlayerStateManager().getPlayerStates(true);
        UUID uUID = ClientManager.getPlayerStateManager().getGroupID();
        if (uUID == null) {
            this.method_25339();
            this.field_22740.N(null);
            return;
        }
        boolean bl = false;
        LinkedList<GroupEntry> linkedList = new LinkedList<GroupEntry>();
        for (GroupEntry groupEntry2 : this.method_25396()) {
            PlayerState playerState = ClientManager.getPlayerStateManager().getState(groupEntry2.getState().getUuid());
            if (playerState == null) {
                linkedList.add(groupEntry2);
                bl = true;
                continue;
            }
            groupEntry2.setState(playerState);
            if (this.isInGroup(playerState, uUID)) continue;
            linkedList.add(groupEntry2);
            bl = true;
        }
        for (GroupEntry groupEntry2 : linkedList) {
            this.method_25330((class01202)groupEntry2);
        }
        for (GroupEntry groupEntry2 : list) {
            if (!this.isInGroup((PlayerState)groupEntry2, uUID) || !this.method_25396().stream().noneMatch(arg_0 -> GroupList.lambda$updateMembers$0((PlayerState)groupEntry2, arg_0))) continue;
            this.method_25321((class01202)new GroupEntry(this.parent, (PlayerState)groupEntry2));
            bl = true;
        }
        if (bl) {
            this.method_73372(Comparator.comparing(groupEntry -> groupEntry.getState().getName()));
        }
    }
}

