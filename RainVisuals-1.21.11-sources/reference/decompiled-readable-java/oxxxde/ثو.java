/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.hud.BossBarHud
 *  net.minecraft.client.gui.hud.ClientBossBar
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.text.Text
 *  ru.ocz.protection.annotation.Compile
 */
package oxxxde;

import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotakbaz.rain.event.events.ChatMessageEvent;
import kotakbaz.rain.mixin.BossBarHudAccessor;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.annotation.Compile;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t\u00a2\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2={"Loxxxde/\u062b\u0648;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u062f\u0634;", "event", "", "onMessage", "(Lkotakbaz/rain/event/events/ChatMessageEvent;)V", "", "shouldBlockDisconnectButton", "()Z", "isCombatTagged", "Loxxxde/\u062e\u0630;", "blockButton", "Loxxxde/\u062e\u0630;", "blockCommands", "Lkotlin/text/Regex;", "blockedCommandRegex", "Lkotlin/text/Regex;", "", "", "combatKeywords", "Ljava/util/List;", "rain-visuals"})
public final class \u062b\u0648
extends Module {
    @NotNull
    private static final Regex blockedCommandRegex;
    @NotNull
    private static final BooleanSetting blockButton;
    @NotNull
    private static final BooleanSetting blockCommands;
    @NotNull
    private static final List<String> combatKeywords;
    @NotNull
    public static final \u062b\u0648 INSTANCE;

    /*
     * WARNING - void declaration
     */
    public final boolean isCombatTagged() {
        boolean bl;
        block14: {
            block16: {
                block15: {
                    ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
                    if (clientPlayerEntity == null) {
                        return false;
                    }
                    ClientPlayerEntity player = clientPlayerEntity;
                    ClientWorld clientWorld = \u0636\u0643.getMc().world;
                    if (clientWorld == null) {
                        return false;
                    }
                    ClientWorld world = clientWorld;
                    if (player.isRemoved() || !player.isAlive()) break block15;
                    if (Intrinsics.areEqual(world, player.getEntityWorld())) break block16;
                }
                return false;
            }
            BossBarHud bossBarHud = \u0636\u0643.getMc().inGameHud.getBossBarHud();
            Intrinsics.checkNotNull(bossBarHud, "null cannot be cast to non-null type kotakbaz.rain.mixin.BossBarHudAccessor");
            Collection<ClientBossBar> bossBars = ((BossBarHudAccessor)bossBarHud).rain$getBossBars().values();
            if (bossBars.isEmpty()) {
                return false;
            }
            Iterable $this$any$iv = bossBars;
            boolean $i$f$any = false;
            if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                bl = false;
            } else {
                for (Object element$iv : $this$any$iv) {
                    boolean bl2;
                    block13: {
                        ClientBossBar bossBar = (ClientBossBar)element$iv;
                        boolean bl3 = false;
                        String string = bossBar.getName().getString();
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        CharSequence charSequence = string;
                        Locale locale = Locale.ROOT;
                        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
                        String string2 = charSequence.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
                        charSequence = StringsKt.replace$default(string2, '\u0451', '\u0435', false, 4, null);
                        Regex regex = new Regex("\\s+");
                        String string3 = " ";
                        String normalized = regex.replace(charSequence, string3);
                        Iterable $this$any$iv2 = combatKeywords;
                        boolean $i$f$any2 = false;
                        if ($this$any$iv2 instanceof Collection && ((Collection)$this$any$iv2).isEmpty()) {
                            bl2 = false;
                        } else {
                            for (Object element$iv2 : $this$any$iv2) {
                                void var15_16;
                                CharSequence p0 = (CharSequence)element$iv2;
                                boolean bl4 = false;
                                if (!StringsKt.contains$default((CharSequence)normalized, (CharSequence)var15_16, false, 2, null)) continue;
                                bl2 = true;
                                break block13;
                            }
                            bl2 = false;
                        }
                    }
                    if (!bl2) continue;
                    bl = true;
                    break block14;
                }
                bl = false;
            }
        }
        return bl;
    }

    @Commando
    @Compile
    public final void onMessage(@NotNull ChatMessageEvent chatMessageEvent) {
        Intrinsics.checkNotNullParameter(chatMessageEvent, "event");
        if (!chatMessageEvent.getSend()) {
            return;
        }
        if (!this.isEnabled()) {
            return;
        }
        if (!((Boolean)blockCommands.getValue()).booleanValue()) {
            return;
        }
        if (!this.isCombatTagged()) {
            return;
        }
        if (!blockedCommandRegex.containsMatchIn(((Object)StringsKt.trim((CharSequence)chatMessageEvent.getText())).toString())) {
            return;
        }
        chatMessageEvent.setCancel(true);
        \u0636\u0643.getMc().inGameHud.setOverlayMessage((Text)Text.literal((String)"PvpSafe: /hub \u0437\u0430\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u043d \u0432\u043e \u0432\u0440\u0435\u043c\u044f \u0440\u0435\u0436\u0438\u043c\u0430 \u043f\u0432\u043f"), false);
    }

    private \u062b\u0648() {
        super("PvpSafe", \u0638\u0646.getPLAYER(), "\u0411\u043b\u043e\u043a\u0438\u0440\u0443\u0435\u0442 \u0441\u043b\u0443\u0447\u0430\u0439\u043d\u044b\u0439 \u0432\u044b\u0445\u043e\u0434 \u043f\u0440\u0438 \u043f\u0432\u043f");
    }

    static {
        INSTANCE = new \u062b\u0648();
        blockButton = Module.boolean$default(INSTANCE, "\u0411\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u043a\u043d\u043e\u043f\u043a\u0443", true, null, 4, null);
        blockCommands = Module.boolean$default(INSTANCE, "\u0411\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c /hub", true, null, 4, null);
        blockedCommandRegex = new Regex("^/hub(?:\\s|$)", RegexOption.IGNORE_CASE);
        String[] stringArray = new String[12];
        stringArray[0] = "pvp";
        stringArray[1] = "\u043f\u0432\u043f";
        stringArray[2] = "combat";
        stringArray[3] = "combat mode";
        stringArray[4] = "in combat";
        stringArray[5] = "combat tag";
        stringArray[6] = "combatlog";
        stringArray[7] = "combat cooldown";
        stringArray[8] = "duel";
        stringArray[9] = "\u0434\u0443\u044d\u043b";
        stringArray[10] = "\u0440\u0435\u0436\u0438\u043c \u0431\u043e\u044f";
        stringArray[11] = "\u0432 \u0431\u043e\u044e";
        combatKeywords = CollectionsKt.listOf(stringArray);
    }

    public final boolean shouldBlockDisconnectButton() {
        return this.isEnabled() && ((Boolean)blockButton.getValue()).booleanValue() && this.isCombatTagged();
    }
}

