/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler;
import de.maxhenkel.voicechat.voice.client.ClientVoicechatConnection;
import de.maxhenkel.voicechat.voice.common.AuthenticatePacket;
import de.maxhenkel.voicechat.voice.common.ConnectionCheckPacket;
import de.maxhenkel.voicechat.voice.common.NetworkMessage;
import de.maxhenkel.voicechat.voice.common.Utils;

class ClientVoicechatConnection$AuthThread
extends Thread {
    private boolean running = true;
    private int authLogMessageCount;
    private int validateLogMessageCount;
    final /* synthetic */ ClientVoicechatConnection this$0;

    public ClientVoicechatConnection$AuthThread(ClientVoicechatConnection clientVoicechatConnection) {
        this.this$0 = clientVoicechatConnection;
        this.setDaemon(true);
        this.setName("VoiceChatAuthenticationThread");
        ClientVoicechatConnection$AuthThread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new VoicechatUncaughtExceptionHandler());
    }

    @Override
    public void run() {
        while (!(!this.running || this.this$0.authenticated && this.this$0.connected)) {
            if (!this.this$0.authenticated) {
                this.validateLogMessageCount = 0;
                if (this.authLogMessageCount < 10) {
                    Voicechat.LOGGER.info("Trying to authenticate voice chat connection", new Object[0]);
                    ++this.authLogMessageCount;
                } else if (this.authLogMessageCount == 10) {
                    Voicechat.LOGGER.warn("Trying to authenticate voice chat connection (this message will not be logged again)", new Object[0]);
                    ++this.authLogMessageCount;
                }
                this.this$0.sendToServer(new NetworkMessage(new AuthenticatePacket(this.this$0.data.getPlayerUUID(), this.this$0.data.getSecret())));
            } else {
                this.authLogMessageCount = 0;
                if (this.validateLogMessageCount < 10) {
                    Voicechat.LOGGER.info("Trying to validate voice chat connection", new Object[0]);
                    ++this.validateLogMessageCount;
                } else if (this.validateLogMessageCount == 10) {
                    Voicechat.LOGGER.warn("Trying to validate voice chat connection (this message will not be logged again)", new Object[0]);
                    ++this.validateLogMessageCount;
                }
                this.this$0.sendToServer(new NetworkMessage(new ConnectionCheckPacket()));
            }
            Utils.sleep(1000);
        }
    }

    public void close() {
        this.running = false;
    }
}

