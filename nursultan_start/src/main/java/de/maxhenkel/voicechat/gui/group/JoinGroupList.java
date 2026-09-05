/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.net.ClientServerNetManager
 *  de.maxhenkel.voicechat.net.JoinGroupPacket
 *  de.maxhenkel.voicechat.net.Packet
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.common.ClientGroup
 *  de.maxhenkel.voicechat.voice.common.PlayerState
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class03556
 *  minecraft.class04909
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class06613
 */
package de.maxhenkel.voicechat.gui.group;

import de.maxhenkel.voicechat.gui.EnterPasswordScreen;
import de.maxhenkel.voicechat.gui.group.JoinGroupEntry;
import de.maxhenkel.voicechat.gui.group.JoinGroupEntry$Group;
import de.maxhenkel.voicechat.gui.group.JoinGroupScreen;
import de.maxhenkel.voicechat.gui.widgets.ListScreenListBase;
import de.maxhenkel.voicechat.net.ClientServerNetManager;
import de.maxhenkel.voicechat.net.JoinGroupPacket;
import de.maxhenkel.voicechat.net.Packet;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.common.ClientGroup;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class03556;
import minecraft.class04909;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06613;

public class JoinGroupList
extends ListScreenListBase<JoinGroupEntry> {
    protected final class05096 parent;

    public JoinGroupList(class05096 class050962, int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
        this.parent = class050962;
        this.updateGroups();
    }

    public static void update() {
        class05096 class050962 = (class05096)class06202.Nq().v_3;
        if (class050962 instanceof JoinGroupScreen) {
            JoinGroupScreen joinGroupScreen = (JoinGroupScreen)class050962;
            joinGroupScreen.groupList.updateGroups();
        }
    }

    public boolean isEmpty() {
        return this.method_25396().isEmpty();
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        JoinGroupEntry joinGroupEntry = (JoinGroupEntry)this.method_25308(class066132.n(), class066132.t());
        if (joinGroupEntry == null) {
            return false;
        }
        ClientGroup clientGroup = joinGroupEntry.getGroup().getGroup();
        this.field_22740.Nr().N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
        if (clientGroup.hasPassword()) {
            this.field_22740.N((class05096)new EnterPasswordScreen(clientGroup));
        } else {
            ClientServerNetManager.sendToServer((Packet)new JoinGroupPacket(clientGroup.getId(), null));
        }
        return true;
    }

    private void updateGroups() {
        Map<UUID, JoinGroupEntry$Group> map = ClientManager.getGroupManager().getGroups().stream().filter(clientGroup -> !clientGroup.isHidden()).collect(Collectors.toMap(ClientGroup::getId, JoinGroupEntry$Group::new));
        List list = ClientManager.getPlayerStateManager().getPlayerStates(true);
        for (PlayerState playerState : list) {
            JoinGroupEntry$Group joinGroupEntry$Group2;
            if (!playerState.hasGroup() || (joinGroupEntry$Group2 = map.get(playerState.getGroup())) == null) continue;
            joinGroupEntry$Group2.getMembers().add(playerState);
        }
        map.values().forEach(joinGroupEntry$Group -> joinGroupEntry$Group.getMembers().sort(Comparator.comparing(PlayerState::getName)));
        this.method_25314(map.values().stream().map(joinGroupEntry$Group -> new JoinGroupEntry(this.parent, (JoinGroupEntry$Group)joinGroupEntry$Group)).sorted(Comparator.comparing(joinGroupEntry -> joinGroupEntry.getGroup().getGroup().getName())).collect(Collectors.toList()));
    }
}

