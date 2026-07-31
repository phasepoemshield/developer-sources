package pulse.modules.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.Team;
import net.minecraft.text.Text;
import pulse.events.ClientTickEvent;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.TokenSetting;

@ModuleInfo(a = "Auto Invest", b = "Automatically invests clan money above the configured limit.", c = ModuleCategory.UTILITIES)
public class AutoInvest extends ClientModule {
    private final TokenSetting limit = new TokenSetting("Limit", "Minimum balance before investing.", TokenSetting.TokenType.PRICE, "1000000", "$");
    private final Pattern numberPattern = Pattern.compile("\\d+");
    private long lastInvestTime = -1;

    @EventHandler
    private void a(ClientTickEvent clientTickEvent) {
        if (c.player == null || c.world == null || c.getNetworkHandler() == null) {
            return;
        }
        long now = System.currentTimeMillis();
        if (this.lastInvestTime > 0L && now - this.lastInvestTime < 5000L) {
            return;
        }
        long balance = readClanBalance();
        long threshold = n();
        if (balance <= 0L || balance < threshold) {
            return;
        }
        c.getNetworkHandler().sendChatCommand("clan invest " + balance);
        this.lastInvestTime = now;
    }

    private long readClanBalance() {
        Scoreboard scoreboard = c.world.getScoreboard();
        ScoreboardObjective objective = scoreboard.getObjectiveForSlot(ScoreboardDisplaySlot.SIDEBAR);
        if (objective == null) {
            return 0L;
        }
        long best = 0L;
        for (Team team : scoreboard.getTeams()) {
            Text prefix = team.getPrefix();
            Text suffix = team.getSuffix();
            String line = (prefix != null ? prefix.getString() : "") + (suffix != null ? suffix.getString() : "");
            String lower = line.toLowerCase();
            if (!(lower.contains("клан") || lower.contains("банк") || lower.contains("баланс") || lower.contains("$") || lower.contains("монет") || lower.contains("clan"))) {
                continue;
            }
            Matcher matcher = this.numberPattern.matcher(line.replace(" ", "").replace(",", "").replace(".", ""));
            while (matcher.find()) {
                try {
                    best = Math.max(best, Long.parseLong(matcher.group()));
                } catch (NumberFormatException ignored) {
                }
            }
        }
        return best;
    }

    private long n() {
        try {
            return Long.parseLong(this.limit.k().replace("$", "").replace(" ", "").replace(",", ""));
        } catch (NumberFormatException e) {
            return 0L;
        }
    }

    private long o() {
        return this.lastInvestTime;
    }

    @Override
    public void f() {
        super.f();
        this.lastInvestTime = -1L;
    }
}
