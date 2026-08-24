/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ru.ocz.protection.annotation.Compile
 */
package oxxxde;

import kotakbaz.rain.event.events.ChatMessageEvent;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627;
import oxxxde.\u0632\u0645;
import oxxxde.\u0634\u0652;
import oxxxde.\u0636\u0647;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.annotation.Compile;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\u0003R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2={"Loxxxde/\u0630\u0650;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u062f\u0634;", "event", "", "onChatMessage", "(Lkotakbaz/rain/event/events/ChatMessageEvent;)V", "onDisable", "Lkotlin/text/Regex;", "commandPattern", "Lkotlin/text/Regex;", "rain-visuals"})
public final class \u0630\u0650
extends Module {
    @NotNull
    public static final \u0630\u0650 INSTANCE = new \u0630\u0650();
    @NotNull
    private static final Regex commandPattern = new Regex("^/an(\\d{1,4})$", RegexOption.IGNORE_CASE);

    @Commando
    @Compile
    public final void onChatMessage(@NotNull ChatMessageEvent chatMessageEvent) {
        Intrinsics.checkNotNullParameter(chatMessageEvent, "event");
        if (!chatMessageEvent.getSend()) {
            return;
        }
        MatchResult matchResult = commandPattern.matchEntire(((Object)StringsKt.trim((CharSequence)chatMessageEvent.getText())).toString());
        if (matchResult == null) {
            return;
        }
        Integer n = StringsKt.toIntOrNull(matchResult.getGroupValues().get(1));
        if (n == null) {
            return;
        }
        int n2 = n;
        chatMessageEvent.setCancel(true);
        \u0634\u0652.INSTANCE.request(n2);
    }

    private \u0630\u0650() {
        super("HwAnarchyHelper", \u0638\u0646.getPLAYER(), "\u041f\u0435\u0440\u0435\u0445\u043e\u0434\u0438\u0442 \u043d\u0430 \u041b\u0430\u0439\u0442 \u0430\u043d\u0430\u0440\u0445\u0438\u044e HolyWorld \u043a\u043e\u043c\u0430\u043d\u0434\u043e\u0439 /an<\u043d\u043e\u043c\u0435\u0440>");
    }

    @Override
    public void onDisable() {
        \u0634\u0652.INSTANCE.cancel();
    }

    static {
        INSTANCE.addVisibleInGuiCondition(new \u0632\u0645(\u0636\u0647.INSTANCE));
        INSTANCE.addAvailabilityCondition(new \u0627(\u0636\u0647.INSTANCE));
    }
}

