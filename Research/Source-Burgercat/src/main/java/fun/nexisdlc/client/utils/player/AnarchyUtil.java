package fun.nexisdlc.client.utils.player;

import fun.nexisdlc.client.utils.client.IMinecraft;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardObjective;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnarchyUtil implements IMinecraft {
    private static final Pattern ANARCHY_PATTERN = Pattern.compile("Анархия[\\s-]*(\\d+)");

    public static int getCurrentAnarchy() {
        if (mc.world == null) return -1;
        Scoreboard scoreboard = mc.world.getScoreboard();
        if (scoreboard == null) return -1;
        ScoreboardObjective objective = scoreboard.getObjectiveForSlot(
            net.minecraft.scoreboard.ScoreboardDisplaySlot.SIDEBAR
        );
        if (objective == null) return -1;

        String title = objective.getDisplayName().getString();
        Matcher matcher = ANARCHY_PATTERN.matcher(title);
        if (matcher.find()) {
            try {
                return Integer.parseInt(matcher.group(1));
            } catch (NumberFormatException e) {
                return -1;
            }
        }
        return -1;
    }

    public static boolean isOnAnarchy() {
        return getCurrentAnarchy() != -1;
    }

    public static void joinAnarchy(int number) {
        if (mc.player == null) return;
        mc.player.networkHandler.sendChatMessage("/an" + number);
    }
}
