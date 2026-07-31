package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.client.EventPacket;
import fun.nexisdlc.client.events.impl.client.TickEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionAdd(name = "AutoTP", alias = "Auto TP", category = Category.Utilities, description = "Автоматически принимает телепортацию от игроков")
public class AutoTP extends Function {
    public BooleanSetting onlyFriends = new BooleanSetting("Только друзья", true);

    private static final String[] TELEPORT_MESSAGES = new String[]{
            "has requested teleport",
            "просит телепортироваться",
            "хочет телепортироваться к вам",
            "просит к вам телепортироваться",
            "просит тп",
            "запросил телепортацию"
    };
    private static final Pattern NAME_PATTERN = Pattern.compile("(?i)\\b([a-z0-9_]{3,16})\\b");

    private boolean canAccept;
    private long lastAcceptMs;
    private int tickCounter;

    public AutoTP() {
        addSettings(onlyFriends);
    }

    @EventHandler
    public void onPacket(EventPacket e) {
        if (e.getPacket() instanceof GameMessageS2CPacket m) {
            String message = m.content().getString();
            if (!isTeleportMessage(message)) {
                return;
            }

            String name = extractName(message);
            boolean validPlayer = !onlyFriends.get()
                    || (name != null && Nexis.getInstance().getFriendStorage().isFriend(name))
                    || Nexis.getInstance().getFriendStorage().getFriends().stream()
                    .anyMatch(friend -> containsName(message, friend.getName()));

            canAccept = validPlayer;
        }
    }

    @EventHandler
    public void onTick(TickEvent e) {
        if (mc.player == null) {
            return;
        }

        tickCounter++;
        
        // Проверяем каждые 10 тиков (примерно 0.5 секунды)
        if (tickCounter < 10) {
            return;
        }
        
        tickCounter = 0;

        if (canAccept) {
            long now = System.currentTimeMillis();
            if (now - lastAcceptMs < 500L) {
                return;
            }
            lastAcceptMs = now;
            mc.player.networkHandler.sendChatCommand("tpaccept");
            canAccept = false;
        }
    }

    boolean isTeleportMessage(String message) {
        String lower = message.toLowerCase(Locale.ROOT);
        return Arrays.stream(TELEPORT_MESSAGES).anyMatch(lower::contains);
    }

    private static String extractName(String message) {
        String clean = message.replaceAll("§.", " ");
        Matcher matcher = NAME_PATTERN.matcher(clean);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private static boolean containsName(String message, String name) {
        if (name == null || name.isEmpty()) return false;
        String pattern = "(?i)(^|\\b)" + Pattern.quote(name) + "(\\b|$)";
        return message.replaceAll("§.", " ").matches(".*" + pattern + ".*");
    }
}
