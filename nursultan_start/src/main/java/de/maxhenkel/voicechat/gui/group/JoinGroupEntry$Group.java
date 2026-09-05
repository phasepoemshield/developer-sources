/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.voice.common.ClientGroup
 *  de.maxhenkel.voicechat.voice.common.PlayerState
 */
package de.maxhenkel.voicechat.gui.group;

import de.maxhenkel.voicechat.voice.common.ClientGroup;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import java.util.ArrayList;
import java.util.List;

public class JoinGroupEntry$Group {
    final ClientGroup group;
    final List<PlayerState> members;

    public JoinGroupEntry$Group(ClientGroup clientGroup) {
        this.group = clientGroup;
        this.members = new ArrayList<PlayerState>();
    }

    public ClientGroup getGroup() {
        return this.group;
    }

    public List<PlayerState> getMembers() {
        return this.members;
    }
}

