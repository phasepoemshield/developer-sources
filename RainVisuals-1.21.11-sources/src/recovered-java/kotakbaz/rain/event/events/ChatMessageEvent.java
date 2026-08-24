/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.event.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0633\u0636;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"Loxxxde/\u062f\u0634;", "Loxxxde/\u0633\u0636;", "", "text", "", "send", "<init>", "(Ljava/lang/String;Z)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Z", "getSend", "()Z", "rain-visuals"})
public final class ChatMessageEvent
extends \u0633\u0636 {
    @NotNull
    private String text;
    private final boolean send;

    public ChatMessageEvent(@NotNull String text, boolean send) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.send = send;
    }

    public final boolean getSend() {
        return this.send;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final void setText(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.text = string;
    }
}

