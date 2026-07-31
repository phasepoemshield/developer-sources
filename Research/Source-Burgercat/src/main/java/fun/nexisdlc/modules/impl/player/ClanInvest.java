package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.client.events.impl.client.EventPacket;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.math.time.StopWatch;
import fun.nexisdlc.client.utils.player.AnarchyUtil;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import fun.nexisdlc.modules.api.settings.impl.StringSetting;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.Team;
import net.minecraft.text.Text;

import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionAdd(
    name = "ClanInvest",
    alias = "Clan Invest",
    category = Category.Player,
    description = "Автоматическое инвестирование в клан при достижении определенной суммы"
)
public class ClanInvest extends Function {

    private enum InvestState {
        IDLE,
        GOING_TO_CLAN,
        INVESTING,
        RETURNING
    }

    private final StringSetting anarchyNumber = new StringSetting("Номер анки", "101", "", true);

    private final StringSetting investAmount = new StringSetting("Сумма инвестиций", "1000", "", true);

    private final SliderSetting checkDelay = new SliderSetting("Задержка проверки", 5f, 1f, 30f, 0.5f);

    private final BooleanSetting useScoreboard = new BooleanSetting("Использовать Scoreboard", true);

    private final BooleanSetting autoInvest = new BooleanSetting("Авто-инвестирование", true);

    private final BooleanSetting notifyUser = new BooleanSetting("Уведомления", true);

    private final StopWatch checkTimer = new StopWatch();
    private final StopWatch moneyCommandTimer = new StopWatch();
    private int lastBalance = 0;
    private boolean hasInvested = false;
    private boolean waitingForMoneyResponse = false;

    private InvestState investState = InvestState.IDLE;
    private int originalAnarchy = -1;
    private long stateStartMs;

    public ClanInvest() {
        addSettings(anarchyNumber, investAmount, checkDelay, useScoreboard, autoInvest, notifyUser);
    }

    @Override
    public void onEnable() {
        super.onEnable();

        if (nullCheck()) {
            toggle();
            return;
        }

        if (notifyUser.get()) {
            sendMessage("§a[ClanInvest] Модуль активирован. Ожидание баланса: " + investAmount.get() + "$");
        }

        checkTimer.reset();
        moneyCommandTimer.reset();
        hasInvested = false;
        lastBalance = 0;
        waitingForMoneyResponse = false;
        investState = InvestState.IDLE;
        originalAnarchy = -1;
        stateStartMs = 0L;
    }

    @Override
    public void onDisable() {
        super.onDisable();

        if (notifyUser.get() && mc.player != null) {
            sendMessage("§e[ClanInvest] Модуль деактивирован.");
        }

        hasInvested = false;
        investState = InvestState.IDLE;
        originalAnarchy = -1;
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck()) return;

        int currentAnarchy = AnarchyUtil.getCurrentAnarchy();
        int clanAnarchy = parseAnarchyNumber();

        switch (investState) {
            case IDLE:
                tickIdle(currentAnarchy, clanAnarchy);
                break;
            case GOING_TO_CLAN:
                tickGoingToClan(currentAnarchy, clanAnarchy);
                break;
            case INVESTING:
                tickInvesting(currentAnarchy);
                break;
            case RETURNING:
                tickReturning(currentAnarchy);
                break;
        }
    }

    private void tickIdle(int currentAnarchy, int clanAnarchy) {
        if (currentAnarchy == -1) return;

        if (!checkTimer.hasReached((long) (checkDelay.get() * 1000))) {
            return;
        }
        checkTimer.reset();

        int currentBalance;
        if (useScoreboard.get()) {
            currentBalance = getBalanceFromScoreboard();
        } else {
            if (!waitingForMoneyResponse && moneyCommandTimer.hasReached(1000)) {
                mc.player.networkHandler.sendChatMessage("/money");
                waitingForMoneyResponse = true;
                moneyCommandTimer.reset();
            }
            currentBalance = lastBalance;
        }

        int requiredAmount;
        try {
            requiredAmount = Integer.parseInt(investAmount.get());
        } catch (NumberFormatException e) {
            return;
        }

        if (currentBalance >= requiredAmount && !hasInvested) {
            if (!autoInvest.get()) {
                if (notifyUser.get()) {
                    sendMessage("§a[ClanInvest] Баланс достиг " + currentBalance + "$! Готов к инвестированию.");
                }
                return;
            }

            if (clanAnarchy == -1) return;

            originalAnarchy = currentAnarchy;

            if (currentAnarchy == clanAnarchy) {
                if (notifyUser.get()) {
                    sendMessage("§a[ClanInvest] Баланс " + currentBalance + "$, инвестирую в клан...");
                }
                performInvest(currentBalance);
                investState = InvestState.INVESTING;
                stateStartMs = System.currentTimeMillis();
            } else {
                if (notifyUser.get()) {
                    sendMessage("§e[ClanInvest] Баланс " + currentBalance + "$, перемещаюсь на анку " + clanAnarchy);
                }
                AnarchyUtil.joinAnarchy(clanAnarchy);
                investState = InvestState.GOING_TO_CLAN;
                stateStartMs = System.currentTimeMillis();
            }
        }

        lastBalance = currentBalance;
    }

    private void tickGoingToClan(int currentAnarchy, int clanAnarchy) {
        if (currentAnarchy == clanAnarchy) {
            if (notifyUser.get()) {
                sendMessage("§a[ClanInvest] Прибыл на анку " + clanAnarchy + ", инвестирую...");
            }
            performInvest(lastBalance);
            investState = InvestState.INVESTING;
            stateStartMs = System.currentTimeMillis();
        } else if (System.currentTimeMillis() - stateStartMs > 5000L) {
            if (notifyUser.get()) {
                sendMessage("§c[ClanInvest] Тайм-аут перемещения на анку " + clanAnarchy);
            }
            investState = InvestState.IDLE;
        }
    }

    private void tickInvesting(int currentAnarchy) {
        if (System.currentTimeMillis() - stateStartMs < 3000L) return;

        int clanAnarchy = parseAnarchyNumber();
        if (originalAnarchy != -1 && originalAnarchy != clanAnarchy) {
            if (notifyUser.get()) {
                sendMessage("§e[ClanInvest] Возвращаюсь на анку " + originalAnarchy);
            }
            AnarchyUtil.joinAnarchy(originalAnarchy);
            investState = InvestState.RETURNING;
            stateStartMs = System.currentTimeMillis();
        } else {
            finishInvestCycle();
        }
    }

    private void tickReturning(int currentAnarchy) {
        if (currentAnarchy == originalAnarchy) {
            if (notifyUser.get()) {
                sendMessage("§a[ClanInvest] Возвращение на анку " + originalAnarchy + " завершено.");
            }
            finishInvestCycle();
        } else if (System.currentTimeMillis() - stateStartMs > 5000L) {
            if (notifyUser.get()) {
                sendMessage("§c[ClanInvest] Тайм-аут возвращения на анку " + originalAnarchy);
            }
            finishInvestCycle();
        }
    }

    private void finishInvestCycle() {
        hasInvested = true;
        investState = InvestState.IDLE;
        originalAnarchy = -1;

        new Thread(() -> {
            try {
                Thread.sleep(10000);
                hasInvested = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private int parseAnarchyNumber() {
        try {
            return Integer.parseInt(anarchyNumber.get());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    @EventHandler
    public void onPacket(EventPacket event) {
        if (event.getPacket() instanceof GameMessageS2CPacket packet) {
            String message = packet.content().getString();

            if (message.contains("Ваш баланс:") || message.contains("баланс:")) {
                int balance = parseBalance(message);
                if (balance != -1) {
                    lastBalance = balance;
                    waitingForMoneyResponse = false;
                }
            }
        }
    }

    private int parseBalance(String text) {
        Matcher m = Pattern.compile("(?i)(?:баланс|монеты|монет|money|\\$|₽)[^0-9]*([0-9.,]+)").matcher(text);
        if (m.find()) {
            String numStr = m.group(1).replace(",", "");
            if (numStr.contains(".")) {
                numStr = numStr.substring(0, numStr.indexOf("."));
            }
            try {
                return Integer.parseInt(numStr);
            } catch (NumberFormatException e) {
                // ignore
            }
        }
        return -1;
    }

    private void performInvest(int amount) {
        if (mc.player == null) return;

        String command = "/clan invest " + amount;
        mc.player.networkHandler.sendChatMessage(command);

        if (notifyUser.get()) {
            sendMessage("§a[ClanInvest] Инвестировано " + amount + "$ в клан!");
        }
    }

    private int getBalanceFromScoreboard() {
        if (mc.world == null) {
            return 0;
        }

        Scoreboard scoreboard = mc.world.getScoreboard();
        if (scoreboard == null) {
            return 0;
        }

        ScoreboardObjective objective = scoreboard.getObjectiveForSlot(
            net.minecraft.scoreboard.ScoreboardDisplaySlot.SIDEBAR
        );

        if (objective == null) {
            return 0;
        }

        Collection<ScoreboardEntry> entries = scoreboard.getScoreboardEntries(objective);

        for (ScoreboardEntry entry : entries) {
            if (entry.hidden()) continue;

            Text displayName = entry.name();
            Team team = scoreboard.getScoreHolderTeam(entry.owner());
            Text formattedText = Team.decorateName(team, displayName);
            String line = formattedText.getString();

            if (line.contains("Баланс:") || line.contains("баланс:") ||
                line.contains("Монеты:") || line.contains("монеты:") ||
                line.contains("Монет:") || line.contains("монет:") ||
                line.contains("Money:") || line.contains("money:") ||
                line.contains("$") || line.contains("₽")) {

                int balance = parseBalance(line);
                if (balance != -1) {
                    return balance;
                }
            }
        }

        return 0;
    }
}
