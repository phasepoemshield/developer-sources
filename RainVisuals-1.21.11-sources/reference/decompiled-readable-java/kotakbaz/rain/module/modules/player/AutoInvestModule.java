/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.scoreboard.ScoreboardDisplaySlot
 *  net.minecraft.scoreboard.ScoreboardEntry
 *  net.minecraft.scoreboard.ScoreboardObjective
 *  net.minecraft.scoreboard.Team
 *  net.minecraft.text.MutableText
 *  net.minecraft.text.Text
 *  ru.ocz.protection.annotation.Compile
 */
package kotakbaz.rain.module.modules.player;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.TextSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.Team;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0627\u064f;
import oxxxde.\u0635\u0635;
import oxxxde.\u0636\u0643;
import oxxxde.\u0636\u0647;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.annotation.Compile;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\b\u0011\u0010\rJ\u0019\u0010\u0014\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u0003R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b*\u0010\"R\u0016\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b+\u0010\"R\u0016\u0010,\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b,\u0010\"R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b.\u0010/\u00a8\u00060"}, d2={"Loxxxde/\u062b\u0629;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0633\u062d;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "", "configuredInvestAmount", "()Ljava/lang/Long;", "", "hasOpenGui", "()Z", "findSidebarBalance", "", "value", "sanitizeScoreboardLine", "(Ljava/lang/String;)Ljava/lang/String;", "text", "parseLargestPositiveNumber", "(Ljava/lang/String;)Ljava/lang/Long;", "currentBalance", "isInvestmentApplied", "(J)Z", "clearPendingInvestment", "resetState", "", "balanceKeywords", "Ljava/util/List;", "INVEST_COMMAND_COOLDOWN_MS", "J", "INVEST_CONFIRM_TIMEOUT_MS", "INVEST_RETRY_DELAY_MS", "Loxxxde/\u0639\u062a;", "investAmount", "Loxxxde/\u0639\u062a;", "pendingBalanceBeforeInvest", "Ljava/lang/Long;", "pendingInvestAmount", "pendingUntil", "nextInvestAt", "Lkotlin/text/Regex;", "NUMBER_REGEX", "Lkotlin/text/Regex;", "rain-visuals"})
public final class AutoInvestModule
extends Module {
    private static long pendingUntil;
    @NotNull
    public static final AutoInvestModule INSTANCE;
    private static final long INVEST_RETRY_DELAY_MS = 500L;
    @Nullable
    private static Long pendingBalanceBeforeInvest;
    @NotNull
    private static final List<String> balanceKeywords;
    private static long pendingInvestAmount;
    private static final long INVEST_COMMAND_COOLDOWN_MS = 1250L;
    @NotNull
    private static final TextSetting investAmount;
    @NotNull
    private static final Regex NUMBER_REGEX;
    private static final long INVEST_CONFIRM_TIMEOUT_MS = 4000L;
    private static long nextInvestAt;

    static {
        INSTANCE = new AutoInvestModule();
        String[] stringArray = new String[4];
        stringArray[0] = "\u043c\u043e\u043d\u0435\u0442";
        stringArray[1] = "\u0431\u0430\u043b\u0430\u043d\u0441";
        stringArray[2] = "coins";
        stringArray[3] = "balance";
        balanceKeywords = CollectionsKt.listOf(stringArray);
        investAmount = Module.text$default(INSTANCE, "\u0421\u0443\u043c\u043c\u0430", "100000", 16, null, 8, null);
        \u0627\u064f.moduleOnFuntime$default(\u0627\u064f.INSTANCE, INSTANCE, null, 2, null);
        NUMBER_REGEX = new Regex("\\d[\\d\\s.,_]*");
    }

    @Override
    public void onEnable() {
        this.resetState();
    }

    private final boolean isInvestmentApplied(long currentBalance) {
        Long l = pendingBalanceBeforeInvest;
        if (l == null) {
            return false;
        }
        long previousBalance = l;
        long expectedBalance = RangesKt.coerceAtLeast(previousBalance - pendingInvestAmount, 0L);
        return currentBalance <= expectedBalance;
    }

    private static final void findSidebarBalance$addCandidate(LinkedHashSet<String> candidates, String value) {
        String sanitized = INSTANCE.sanitizeScoreboardLine(value);
        boolean bl = ((CharSequence)sanitized).length() > 0;
        if (bl) {
            ((Collection)candidates).add(sanitized);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final Long findSidebarBalance() {
        Long l;
        String string;
        Object v16;
        block17: {
            Object object;
            LinkedHashSet<String> candidates;
            block15: {
                String $this$getScoreHolderTeam$iv;
                void $this$getObjectiveForSlot$iv;
                ClientWorld scoreboard;
                ClientWorld clientWorld = \u0636\u0643.getMc().world;
                if (clientWorld == null || (clientWorld = clientWorld.getScoreboard()) == null) {
                    return null;
                }
                ClientWorld clientWorld2 = scoreboard = clientWorld;
                ScoreboardDisplaySlot slot$iv = ScoreboardDisplaySlot.SIDEBAR;
                boolean $i$f$getObjectiveForSlot = false;
                ScoreboardObjective scoreboardObjective = $this$getObjectiveForSlot$iv.getObjectiveForSlot(slot$iv);
                if (scoreboardObjective == null) {
                    return null;
                }
                ScoreboardObjective objective = scoreboardObjective;
                candidates = new LinkedHashSet<String>();
                AutoInvestModule.findSidebarBalance$addCandidate(candidates, objective.getDisplayName().getString());
                ClientWorld $this$getScoreboardEntries$iv = scoreboard;
                ScoreboardObjective objective$iv = objective;
                boolean $i$f$getScoreboardEntries = false;
                Collection collection = $this$getScoreboardEntries$iv.getScoreboardEntries(objective$iv);
                Intrinsics.checkNotNullExpressionValue(collection, "listPlayerScores(...)");
                Iterable $this$forEach$iv = collection;
                boolean $i$f$forEach = false;
                for (Object element$iv : $this$forEach$iv) {
                    Team $this$decorateName$iv;
                    Team team;
                    ScoreboardEntry entry = (ScoreboardEntry)element$iv;
                    boolean bl = false;
                    AutoInvestModule.findSidebarBalance$addCandidate(candidates, entry.owner());
                    ScoreboardEntry $this$name$iv = entry;
                    boolean $i$f$name = false;
                    Text text = $this$name$iv.name();
                    Intrinsics.checkNotNullExpressionValue(text, "ownerName(...)");
                    AutoInvestModule.findSidebarBalance$addCandidate(candidates, text.getString());
                    Text text2 = entry.display();
                    AutoInvestModule.findSidebarBalance$addCandidate(candidates, text2 != null ? text2.getString() : null);
                    $this$getScoreHolderTeam$iv = scoreboard;
                    Intrinsics.checkNotNullExpressionValue(entry.owner(), "owner(...)");
                    boolean $i$f$getScoreHolderTeam = false;
                    if ($this$getScoreHolderTeam$iv.getScoreHolderTeam((String)team) == null) continue;
                    boolean bl2 = false;
                    AutoInvestModule.findSidebarBalance$addCandidate(candidates, \u0637\u062b.getPrefix(team).getString());
                    AutoInvestModule.findSidebarBalance$addCandidate(candidates, \u0637\u062b.getSuffix(team).getString());
                    Team team2 = team;
                    MutableText mutableText = Text.literal((String)entry.owner());
                    Intrinsics.checkNotNullExpressionValue(mutableText, "literal(...)");
                    Text name$iv = (Text)mutableText;
                    boolean $i$f$decorateName = false;
                    MutableText mutableText2 = $this$decorateName$iv.decorateName(name$iv);
                    Intrinsics.checkNotNullExpressionValue(mutableText2, "getFormattedName(...)");
                    AutoInvestModule.findSidebarBalance$addCandidate(candidates, ((Text)mutableText2).getString());
                    $this$decorateName$iv = team;
                    name$iv = entry;
                    $i$f$decorateName = false;
                    Text text3 = name$iv.name();
                    Intrinsics.checkNotNullExpressionValue(text3, "ownerName(...)");
                    name$iv = text3;
                    $i$f$decorateName = false;
                    MutableText mutableText3 = $this$decorateName$iv.decorateName(name$iv);
                    Intrinsics.checkNotNullExpressionValue(mutableText3, "getFormattedName(...)");
                    AutoInvestModule.findSidebarBalance$addCandidate(candidates, ((Text)mutableText3).getString());
                }
                Iterable $this$firstOrNull$iv = candidates;
                boolean $i$f$firstOrNull = false;
                for (Object element$iv : $this$firstOrNull$iv) {
                    boolean bl;
                    String candidate;
                    block14: {
                        Iterable $this$any$iv;
                        candidate = (String)element$iv;
                        boolean bl3 = false;
                        $this$getScoreHolderTeam$iv = candidate;
                        Locale locale = Locale.ROOT;
                        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
                        Intrinsics.checkNotNullExpressionValue(((String)((Object)$this$any$iv)).toLowerCase(locale), "toLowerCase(...)");
                        $this$any$iv = balanceKeywords;
                        boolean $i$f$any = false;
                        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                            bl = false;
                        } else {
                            for (Object element$iv2 : $this$any$iv) {
                                String normalized;
                                CharSequence p0 = (CharSequence)element$iv2;
                                boolean bl4 = false;
                                if (!StringsKt.contains$default((CharSequence)normalized, p0, false, 2, null)) continue;
                                bl = true;
                                break block14;
                            }
                            bl = false;
                        }
                    }
                    boolean bl5 = bl && INSTANCE.parseLargestPositiveNumber(candidate) != null;
                    if (!bl5) continue;
                    object = element$iv;
                    break block15;
                }
                object = null;
            }
            String exactMatch = (String)object;
            if (exactMatch != null) {
                return this.parseLargestPositiveNumber(exactMatch);
            }
            Iterable $this$firstOrNull$iv = candidates;
            boolean $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                void var9_19;
                void var10_22;
                boolean bl;
                block16: {
                    String candidate = (String)element$iv;
                    boolean bl6 = false;
                    Object $this$any$iv = candidate;
                    Locale locale = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
                    Intrinsics.checkNotNullExpressionValue(((String)$this$any$iv).toLowerCase(locale), "toLowerCase(...)");
                    $this$any$iv = balanceKeywords;
                    boolean $i$f$any = false;
                    if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                        bl = false;
                    } else {
                        Iterator iterator2 = $this$any$iv.iterator();
                        while (iterator2.hasNext()) {
                            void var13_29;
                            Object t = iterator2.next();
                            CharSequence charSequence = (CharSequence)t;
                            boolean bl7 = false;
                            if (!StringsKt.contains$default((CharSequence)var13_29, charSequence, false, 2, null)) continue;
                            bl = true;
                            break block16;
                        }
                        bl = false;
                    }
                }
                boolean bl8 = bl && INSTANCE.parseLargestPositiveNumber((String)var10_22) != null;
                if (!bl8) continue;
                v16 = var9_19;
                break block17;
            }
            v16 = null;
        }
        String string2 = string = (String)v16;
        if (string2 != null) {
            String string3 = string2;
            boolean bl = false;
            l = this.parseLargestPositiveNumber(string3);
        } else {
            l = null;
        }
        return l;
    }

    private final void resetState() {
        this.clearPendingInvestment();
        nextInvestAt = 0L;
    }

    /*
     * WARNING - void declaration
     */
    private final Long parseLargestPositiveNumber(String text) {
        Long l;
        Sequence matches = Regex.findAll$default(NUMBER_REGEX, text, 0, 2, null);
        Object largest = null;
        Sequence $this$forEach$iv = matches;
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv.iterator();
        while (iterator2.hasNext()) {
            void var21_21;
            void var13_13;
            void $this$filterTo$iv$iv;
            Object element$iv = iterator2.next();
            MatchResult match = (MatchResult)element$iv;
            boolean bl = false;
            String $this$filter$iv = match.getValue();
            boolean $i$f$filter = false;
            CharSequence charSequence = $this$filter$iv;
            Appendable destination$iv$iv = new StringBuilder();
            boolean $i$f$filterTo = false;
            int index$iv$iv = 0;
            int n = $this$filterTo$iv$iv.length();
            while (index$iv$iv < n) {
                void var15_15;
                void var18_18;
                char element$iv$iv;
                char p0 = element$iv$iv = $this$filterTo$iv$iv.charAt(index$iv$iv);
                boolean bl2 = false;
                if (Character.isDigit((char)var18_18)) {
                    void var17_17;
                    destination$iv$iv.append((char)var17_17);
                }
                ++var15_15;
            }
            String digits = ((StringBuilder)var13_13).toString();
            Long l2 = StringsKt.toLongOrNull(digits);
            if (l2 == null) {
                continue;
            }
            long candidate = l2;
            if (largest != null) {
                if (candidate <= ((Number)largest).longValue()) continue;
            }
            l = (long)var21_21;
        }
        return l;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final String sanitizeScoreboardLine(String value) {
        if (value == null) return "";
        String string = StringsKt.replace$default(value, '\u00a0', ' ', false, 4, null);
        if (string == null) return "";
        String string2 = ((Object)StringsKt.trim((CharSequence)string)).toString();
        String string3 = string2;
        if (string2 != null) return string3;
        return "";
    }

    private AutoInvestModule() {
        super("AutoInvest", \u0638\u0646.getPLAYER(), "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0441\u043b\u0430\u0436\u0438\u0432\u0430\u0435\u0442 \u0434\u0435\u043d\u044c\u0433\u0438 \u0432 \u043a\u043b\u0430\u043d");
    }

    @Override
    public void onDisable() {
        this.resetState();
    }

    private final void clearPendingInvestment() {
        pendingBalanceBeforeInvest = null;
        pendingInvestAmount = 0L;
        pendingUntil = 0L;
    }

    /*
     * WARNING - void declaration
     */
    private final Long configuredInvestAmount() {
        void $this$filterTo$iv$iv;
        String $this$filter$iv = (String)investAmount.getValue();
        boolean $i$f$filter = false;
        Object object = $this$filter$iv;
        Appendable destination$iv$iv = new StringBuilder();
        boolean $i$f$filterTo = false;
        int n = $this$filterTo$iv$iv.length();
        for (int index$iv$iv = 0; index$iv$iv < n; ++index$iv$iv) {
            char element$iv$iv;
            char p0 = element$iv$iv = $this$filterTo$iv$iv.charAt(index$iv$iv);
            boolean bl = false;
            if (!Character.isDigit(p0)) continue;
            destination$iv$iv.append(element$iv$iv);
        }
        String digits = ((StringBuilder)destination$iv$iv).toString();
        Long l = StringsKt.toLongOrNull(digits);
        if (l == null) {
            return null;
        }
        long amount = l;
        object = amount;
        long it = ((Number)object).longValue();
        boolean bl = false;
        return it > 0L ? object : null;
    }

    private final boolean hasOpenGui() {
        return \u0635\u0635.INSTANCE.getCustomScreen() != null || \u0636\u0643.getMc().currentScreen != null;
    }

    @Commando
    @Compile
    public final void onUpdate(@NotNull PlayerUpdateEvent playerUpdateEvent) {
        Intrinsics.checkNotNullParameter(playerUpdateEvent, "event");
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity != null && \u0636\u0643.getMc().world != null && \u0636\u0647.INSTANCE.isFunTimeContext() && clientPlayerEntity.isAlive() && !clientPlayerEntity.isSpectator()) {
            if (this.hasOpenGui()) {
                return;
            }
            Long l = this.configuredInvestAmount();
            if (l == null) {
                return;
            }
            long l2 = l;
            Long l3 = this.findSidebarBalance();
            if (l3 == null) {
                return;
            }
            long l4 = l3;
            ClientPlayNetworkHandler clientPlayNetworkHandler = \u0636\u0643.getMc().getNetworkHandler();
            if (clientPlayNetworkHandler == null) {
                return;
            }
            long l5 = System.currentTimeMillis();
            if (pendingBalanceBeforeInvest != null) {
                if (this.isInvestmentApplied(l4)) {
                    this.clearPendingInvestment();
                } else {
                    if (l5 < pendingUntil) {
                        return;
                    }
                    this.clearPendingInvestment();
                    nextInvestAt = Math.max(nextInvestAt, l5 + (long)500);
                }
            }
            if (l5 < nextInvestAt) {
                return;
            }
            clientPlayNetworkHandler.sendChatCommand(AutoInvestModule.lamda$onUpdate$1_20fdaf3e(l2));
            pendingBalanceBeforeInvest = l4;
            pendingInvestAmount = l2;
            pendingUntil = l5 + (long)4000;
            nextInvestAt = l5 + (long)1250;
            return;
        }
        this.resetState();
    }

    static /* synthetic */ String lamda$onUpdate$1_20fdaf3e(long l) {
        return "clan invest " + l;
    }
}

