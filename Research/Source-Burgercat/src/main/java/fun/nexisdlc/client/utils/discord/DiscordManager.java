package fun.nexisdlc.client.utils.discord;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.utils.discord.utils.DiscordEventHandlers;
import fun.nexisdlc.client.utils.discord.utils.DiscordRPC;
import fun.nexisdlc.client.utils.discord.utils.DiscordRichPresence;
import fun.nexisdlc.client.utils.discord.utils.RPCButton;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

@Setter
@Getter
public class DiscordManager {
    private static final Logger LOGGER = LogManager.getLogger("Nexis-DiscordRPC");
    private static final String APPLICATION_ID = "1503445632415961089";

    private final DiscordDaemonThread discordDaemonThread = new DiscordDaemonThread();
    private boolean running = true;
    private DiscordInfo info = new DiscordInfo("Unknown", "", "");
    private Identifier avatarId;

    public void init() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("linux")) {
            return;
        }

        running = true;

        DiscordEventHandlers handlers = new DiscordEventHandlers.Builder()
                .ready((user) -> {
                    ClientContainer.getNexisInstance().getDiscordManager().setInfo(
                            new DiscordInfo(user.username,
                                    "https://cdn.discordapp.com/avatars/" + user.userId + "/" + user.avatar + ".png",
                                    user.userId));

                    String uid = ClientContainer.getUid();
                    String role = ClientContainer.getRole();
                    String username = ClientContainer.getUser();

                    DiscordRichPresence presence = new DiscordRichPresence.Builder()
                            .setStartTimestamp(System.currentTimeMillis() / 1000)
                            .setDetails("★ Логин: " + username)
                            .setState("✦ Айди пользователя: " + uid)
                            .setButtons(RPCButton.create("Телеграм", "https://t.me/NexisNew"),
                                    RPCButton.create("Сайт", "https://nexisdlc.fun"))
                            .build();
                    DiscordRPC.INSTANCE.Discord_UpdatePresence(presence);
                })
                .build();

        try {
            DiscordRPC.INSTANCE.Discord_Initialize(APPLICATION_ID, handlers, true, "");
            if (!discordDaemonThread.isAlive()) {
                discordDaemonThread.setDaemon(true);
                discordDaemonThread.start();
            }
        } catch (Throwable t) {
            running = false;
            LOGGER.error("Не удалось инициализировать Discord RPC", t);
        }
    }

    public void stopRPC() {
        DiscordRPC.INSTANCE.Discord_Shutdown();
        this.running = false;
    }

    public void load() throws IOException {
        if (avatarId == null && !info.avatarUrl.isEmpty()) {
            avatarId = Buffer.registerDynamicTexture("avatar-", Buffer.getHeadFromURL(info.avatarUrl));
        }
    }

    public Identifier getAvatarId() {
        return avatarId;
    }

    private class DiscordDaemonThread extends Thread {
        @Override
        public void run() {
            this.setName("Discord-RPC");
            try {
                MinecraftClient mc = MinecraftClient.getInstance();
                while (mc == null || mc.getTextureManager() == null) {
                    Thread.sleep(500);
                    mc = MinecraftClient.getInstance();
                }

                while (ClientContainer.getNexisInstance().getDiscordManager().isRunning()) {
                    DiscordRPC.INSTANCE.Discord_RunCallbacks();
                    DiscordRPC.INSTANCE.Discord_UpdateConnection();
                    load();
                    Thread.sleep(1500);
                }
            } catch (Exception exception) {
                LOGGER.error("Discord RPC daemon остановлен из-за ошибки", exception);
                stopRPC();
            }
            super.run();
        }
    }

    public record DiscordInfo(String userName, String avatarUrl, String userId) {
    }
}
