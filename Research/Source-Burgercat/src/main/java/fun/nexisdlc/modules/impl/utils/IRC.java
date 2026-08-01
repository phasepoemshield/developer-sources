package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.utils.client.SoundUtil;
import fun.nexisdlc.client.utils.irc.IRCManager;
import fun.nexisdlc.client.utils.irc.IRCMessage;
import fun.nexisdlc.client.utils.render.color.gradient.GradientUtil;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import lombok.extern.log4j.Log4j2;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import ru.sterford.annotations.NativeCall;

@Log4j2
@FunctionAdd(name = "IRC", alias = "IRC Chat", category = Category.Utilities, description = "IRC чат для общения с другими игроками")
public class IRC extends Function {


    public static BooleanSetting showInChat = new BooleanSetting("Показывать в чате", true);
    public static BooleanSetting showNotifications = new BooleanSetting("Уведомления о подключении", true);
    public static BooleanSetting autoConnect = new BooleanSetting("Авто-подключение", false);
    public static BooleanSetting soundOnMessage = new BooleanSetting("Звук при сообщении", true);

    private static IRCManager ircManager;

    public IRC() {
        addSettings(showInChat, showNotifications, autoConnect, soundOnMessage);
    }

    @Override
    public void onEnable() {
        if (ircManager == null) {
            ircManager = IRCManager.getInstance();
            setupCallbacks();
        }

        String token = ClientContainer.getIrcLease();
        if (token == null || token.isBlank()) {
            sendMessage(Formatting.RED + "IRC lease не выдан сервером");
            setState(false);
            return;
        }

        ircManager.setToken(token);

        ircManager.connect();
    }

    @Override
    public void onDisable() {
        if (ircManager != null) {
            ircManager.disconnect();
        }
    }

    @NativeCall
    private void setupCallbacks() {
        ircManager.setOnMessageListener(this::onIRCMessage);

        ircManager.setOnConnectionListener(new IRCManager.OnConnectionListener() {
            @Override
            public void onConnected() {
                runOnClientThread(() -> {
                    if (showNotifications.get()) {
                        sendMessage(Formatting.GREEN + "IRC: Подключено к серверу!");
                    }
                    log.info("[IRC] Connected to server");
                });
            }

            @Override
            public void onDisconnected() {
                runOnClientThread(() -> {
                    if (showNotifications.get()) {
                        sendMessage(Formatting.RED + "IRC: Отключено от сервера!");
                    }
                    log.info("[IRC] Disconnected from server");
                });
            }

            @Override
            public void onError(String error) {
                runOnClientThread(() -> {
                    sendMessage(Formatting.RED + "IRC: Ошибка - " + error);
                    log.error("[IRC] Error: {}", error);
                });
            }
        });
    }

    private void onIRCMessage(IRCMessage message) {
        runOnClientThread(() -> renderIRCMessage(message));
    }

    private void renderIRCMessage(IRCMessage message) {
        if (!showInChat.get()) return;

        if (mc.world != null && mc.player != null) {
            String roleColor;
            switch (message.getRole()) {
                case "GHOST":
                    roleColor = String.valueOf(Formatting.GRAY);
                    break;
                case "USER":
                    roleColor = String.valueOf(Formatting.AQUA);
                    break;
                case "MEDIA":
                    roleColor = String.valueOf(Formatting.LIGHT_PURPLE);
                    break;
                case "BETA":
                    roleColor = String.valueOf(Formatting.GOLD);
                    break;
                case "MANAGER":
                case "OWNER":
                    roleColor = String.valueOf(Formatting.RED);
                    break;
                default:
                    roleColor = String.valueOf(Formatting.AQUA);
                    break;
            }
            String prefix = message.isBroadcast() ? Formatting.GOLD + "📢 " : Formatting.GRAY + "💬 ";

            String username = roleColor + message.getUsername();


            RoleBadge badge = RoleBadge.fromRoleText(message.getRole());
            MutableText body = Text.empty();


            String msgText = Formatting.WHITE + message.getMessage();

            body.append(Text.literal(username + ": " + msgText));

            MutableText formatted = GradientUtil.formatMessage("[IRC Chat]", body);

            MinecraftClient.getInstance().inGameHud.getChatHud()
                    .addMessage(formatted);

            if (soundOnMessage.get()) {
                SoundUtil.playSound("other/irc", 100f, false);
            }
        }
    }

    public static void sendIRCMessage(String message) {
        if (ircManager != null && ircManager.isConnected()) {
            ircManager.sendMessage(message);
        } else {
            sendMessage(Formatting.RED + "IRC: Не подключено!");
        }
    }

    public static boolean isConnected() {
        return ircManager != null && ircManager.isConnected();
    }

    public static IRCManager getManager() {
        return ircManager;
    }

    private static void runOnClientThread(Runnable runnable) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null || runnable == null) {
            return;
        }
        if (client.isOnThread()) {
            runnable.run();
        } else {
            client.execute(runnable);
        }
    }

    private enum RoleBadge {
        ADMIN(true, ""),
        MODERATOR(true, ""),
        PREMIUM(true, ""),
        DEFAULT(false, "");

        private static final Identifier FONT_ID = Identifier.of("nexis", "font/irc_icons");

        private final boolean badge;
        private final String glyph;

        RoleBadge(boolean badge, String glyph) {
            this.badge = badge;
            this.glyph = glyph;
        }

        public boolean hasBadge() {
            return badge;
        }

        public String getGlyph() {
            return glyph;
        }

        public static RoleBadge fromRoleText(String roleText) {
            String role = roleText == null ? "" : roleText.trim().toLowerCase();

            if (containsAny(role,
                    "owner",
                    "admin",
                    "developer",
                    "админ",
                    "разработ")) {
                return ADMIN;
            }

            if (containsAny(role,
                    "moderator",
                    "moder",
                    "модер")) {
                return MODERATOR;
            }

            if (containsAny(role,
                    "premium",
                    "премиум")) {
                return PREMIUM;
            }
            return DEFAULT;
        }

        private static boolean containsAny(String value, String... tokens) {
            for (String token : tokens) {
                if (value.contains(token)) {
                    return true;
                }
            }
            return false;
        }
    }
}
