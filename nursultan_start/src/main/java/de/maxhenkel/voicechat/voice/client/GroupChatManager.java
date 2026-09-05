/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.gui.GameProfileUtils
 *  minecraft.class01054
 *  minecraft.class01631
 *  minecraft.class01894
 *  minecraft.class06202
 *  minecraft.class08394
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.GameProfileUtils;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.GroupPlayerIconOrientation;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import minecraft.class01054;
import minecraft.class01631;
import minecraft.class01894;
import minecraft.class06202;
import minecraft.class08394;

public class GroupChatManager {
    private static final class01894 TALK_OUTLINE = class01894.N((String)"voicechat", (String)"icons/talk_outline");
    private static final class01894 SPEAKER_OFF_ICON = class01894.N((String)"voicechat", (String)"icons/speaker_small_off");

    public static void renderIcons(class01054 class010542) {
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientVoicechat == null) {
            return;
        }
        class06202 class062022 = class06202.Nq();
        List<PlayerState> list = GroupChatManager.getGroupMembers((Boolean)VoicechatClient.CLIENT_CONFIG.showOwnGroupIcon.get());
        class010542.i().pushMatrix();
        int n = (Integer)VoicechatClient.CLIENT_CONFIG.groupPlayerIconPosX.get();
        int n2 = (Integer)VoicechatClient.CLIENT_CONFIG.groupPlayerIconPosY.get();
        if (n < 0) {
            class010542.i().translate((float)class062022.Nt().P(), 0.0f);
        }
        if (n2 < 0) {
            class010542.i().translate(0.0f, (float)class062022.Nt().s());
        }
        class010542.i().translate((float)n, (float)n2);
        float f = ((Double)VoicechatClient.CLIENT_CONFIG.groupHudIconScale.get()).floatValue();
        class010542.i().scale(f, f);
        boolean bl = ((GroupPlayerIconOrientation)((Object)VoicechatClient.CLIENT_CONFIG.groupPlayerIconOrientation.get())).equals((Object)GroupPlayerIconOrientation.VERTICAL);
        for (int i = 0; i < list.size(); ++i) {
            PlayerState playerState = list.get(i);
            class010542.i().pushMatrix();
            if (bl) {
                if (n2 < 0) {
                    class010542.i().translate(0.0f, (float)i * -11.0f);
                } else {
                    class010542.i().translate(0.0f, (float)i * 11.0f);
                }
            } else if (n < 0) {
                class010542.i().translate((float)i * -11.0f, 0.0f);
            } else {
                class010542.i().translate((float)i * 11.0f, 0.0f);
            }
            if (clientVoicechat.getTalkCache().isTalking(playerState.getUuid())) {
                class010542.N(class08394.Na, TALK_OUTLINE, 16, 16, 0, 0, n < 0 ? -10 : 0, n2 < 0 ? -10 : 0, 10, 10);
            }
            class01631 class016312 = GameProfileUtils.getSkin((UUID)playerState.getUuid());
            class010542.N(class08394.Na, class016312.N().y(), n < 0 ? -9 : 1, n2 < 0 ? -9 : 1, 8.0f, 8.0f, 8, 8, 64, 64);
            class010542.N(class08394.Na, class016312.N().y(), n < 0 ? -9 : 1, n2 < 0 ? -9 : 1, 40.0f, 8.0f, 8, 8, 64, 64);
            if (playerState.isDisabled()) {
                class010542.i().pushMatrix();
                class010542.i().translate(n < 0 ? -9.0f : 1.0f, n2 < 0 ? -9.0f : 1.0f);
                class010542.i().scale(0.5f, 0.5f);
                class010542.N(class08394.Na, SPEAKER_OFF_ICON, 0, 0, 16, 16);
                class010542.i().popMatrix();
            }
            class010542.i().popMatrix();
        }
        class010542.i().popMatrix();
    }

    public static List<PlayerState> getGroupMembers(boolean bl) {
        ArrayList<PlayerState> arrayList = new ArrayList<PlayerState>();
        UUID uUID = ClientManager.getPlayerStateManager().getGroupID();
        if (uUID == null) {
            return arrayList;
        }
        for (PlayerState playerState : ClientManager.getPlayerStateManager().getPlayerStates(bl)) {
            if (!playerState.hasGroup() || !playerState.getGroup().equals(uUID)) continue;
            arrayList.add(playerState);
        }
        arrayList.sort(Comparator.comparing(PlayerState::getName));
        return arrayList;
    }

    public static List<PlayerState> getGroupMembers() {
        return GroupChatManager.getGroupMembers(true);
    }
}

