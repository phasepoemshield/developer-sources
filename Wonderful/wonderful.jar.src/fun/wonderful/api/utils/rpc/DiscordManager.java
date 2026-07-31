package fun.wonderful.api.utils.rpc;

import fun.wonderful.api.QClient;
import fun.wonderful.api.utils.rpc.utils.DiscordEventHandlers;
import fun.wonderful.api.utils.rpc.utils.DiscordRPC;
import fun.wonderful.api.utils.rpc.utils.DiscordRichPresence;
import fun.wonderful.client.modules.impl.render.base.implement.WaterMark;
import lombok.Generated;

public class DiscordManager
implements QClient {
    private DiscordDaemonThread discordDaemonThread;
    private long APPLICATION_ID;
    private boolean running;
    private String image;
    private String site;
    private String telegram;
    String state = "";
    public static DiscordRichPresence discordRichPresence = new DiscordRichPresence();
    public static DiscordRPC discordRPC = DiscordRPC.INSTANCE;

    private void cppInit() {
        this.discordDaemonThread = new DiscordDaemonThread();
        this.APPLICATION_ID = 1480864732553547786L;
        this.running = true;
        this.image = "https://raw.githubusercontent.com/dezolator1/discordrpc/main/Comp-1_42_30fps.gif";
        this.site = "https://wonderfulclient.ru/";
        this.telegram = "https://t.me/wonderfulclient";
    }

    public void init() {
        this.cppInit();
        DiscordEventHandlers handlers = new DiscordEventHandlers.Builder().build();
        DiscordRPC.INSTANCE.Discord_Initialize(String.valueOf(this.APPLICATION_ID), handlers, true, "");
        DiscordManager.discordRichPresence.startTimestamp = System.currentTimeMillis() / 1000L;
        discordRPC.Discord_UpdatePresence(discordRichPresence);
        new Thread(() -> {
            while (this.running) {
                try {
                    DiscordManager.discordRichPresence.details = "Name » " + WaterMark.getUsername();
                    DiscordManager.discordRichPresence.state = "UID » " + WaterMark.getUID();
                    DiscordManager.discordRichPresence.largeImageKey = this.image;
                    DiscordManager.discordRichPresence.button_label_1 = "Купить";
                    DiscordManager.discordRichPresence.button_url_1 = this.site;
                    DiscordManager.discordRichPresence.button_label_2 = "Телеграмм";
                    DiscordManager.discordRichPresence.button_url_2 = this.telegram;
                    DiscordRPC.INSTANCE.Discord_UpdatePresence(discordRichPresence);
                    Thread.sleep(2000L);
                }
                catch (InterruptedException ignored) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }, "Discord-RPC-Updater").start();
        this.discordDaemonThread.start();
    }

    public DiscordManager start() {
        this.init();
        return this;
    }

    public void stopRPC() {
        this.running = false;
        DiscordRPC.INSTANCE.Discord_Shutdown();
        if (this.discordDaemonThread != null) {
            this.discordDaemonThread.interrupt();
        }
    }

    @Generated
    public DiscordDaemonThread getDiscordDaemonThread() {
        return this.discordDaemonThread;
    }

    @Generated
    public long getAPPLICATION_ID() {
        return this.APPLICATION_ID;
    }

    @Generated
    public boolean isRunning() {
        return this.running;
    }

    @Generated
    public String getImage() {
        return this.image;
    }

    @Generated
    public String getSite() {
        return this.site;
    }

    @Generated
    public String getTelegram() {
        return this.telegram;
    }

    @Generated
    public String getState() {
        return this.state;
    }

    private class DiscordDaemonThread
    extends Thread {
        private DiscordDaemonThread() {
        }

        @Override
        public void run() {
            this.setName("Discord-RPC");
            try {
                while (DiscordManager.this.running) {
                    DiscordRPC.INSTANCE.Discord_RunCallbacks();
                    Thread.sleep(15000L);
                }
            }
            catch (Exception exception) {
                DiscordManager.this.stopRPC();
            }
            super.run();
        }
    }
}