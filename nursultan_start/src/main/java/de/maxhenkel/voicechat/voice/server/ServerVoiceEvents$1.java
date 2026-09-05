/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  minecraft.class00392
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.voice.server;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.voice.server.ServerVoiceEvents;
import java.util.Timer;
import java.util.TimerTask;
import minecraft.class00392;
import minecraft.class04770;

class ServerVoiceEvents$1
extends TimerTask {
    final /* synthetic */ Timer val$timer;
    final /* synthetic */ class04770 val$serverPlayer;
    final /* synthetic */ ServerVoiceEvents this$0;

    ServerVoiceEvents$1(ServerVoiceEvents serverVoiceEvents, Timer timer, class04770 class047702) {
        this.this$0 = serverVoiceEvents;
        this.val$timer = timer;
        this.val$serverPlayer = class047702;
    }

    @Override
    public void run() {
        this.val$timer.cancel();
        this.val$timer.purge();
        if (!this.val$serverPlayer.method_51469().method_8503().Nj()) {
            return;
        }
        if (!this.val$serverPlayer.field_13987.method_48106()) {
            return;
        }
        if (!this.this$0.isCompatible(this.val$serverPlayer)) {
            CommonCompatibilityManager.INSTANCE.execute(this.val$serverPlayer.method_51469().method_8503(), () -> class047702.field_13987.method_52396((class00392)class00392.y((String)((String)Voicechat.TRANSLATIONS.forceVoicechatKickMessage.get()).formatted(new Object[]{CommonCompatibilityManager.INSTANCE.getModName(), CommonCompatibilityManager.INSTANCE.getModVersion()}))));
        }
    }
}

