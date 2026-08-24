/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ServerInfo
 */
package oxxxde;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.client.network.ServerInfo;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0636\u0643;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\u0006J\r\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"Loxxxde/\u0636\u0647;", "", "<init>", "()V", "", "hasActiveWorld", "()Z", "isFunTime", "isHolyWorld", "isSingleplayer", "isFunTimeContext", "isHolyWorldContext", "", "token", "isCurrentServerMatching", "(Ljava/lang/String;)Z", "rain-visuals"})
public final class \u0636\u0647 {
    @NotNull
    public static final \u0636\u0647 INSTANCE = new \u0636\u0647();

    public final boolean hasActiveWorld() {
        return \u0636\u0643.getMc().player != null && \u0636\u0643.getMc().world != null;
    }

    private \u0636\u0647() {
    }

    public final boolean isFunTimeContext() {
        return this.isSingleplayer() || this.isFunTime();
    }

    public final boolean isSingleplayer() {
        return this.hasActiveWorld() && \u0636\u0643.getMc().isInSingleplayer();
    }

    public final boolean isHolyWorld() {
        return this.isCurrentServerMatching("holyworld");
    }

    public final boolean isHolyWorldContext() {
        return this.isSingleplayer() || this.isHolyWorld();
    }

    public final boolean isCurrentServerMatching(@NotNull String token) {
        String string;
        Object object;
        block10: {
            block9: {
                block8: {
                    block7: {
                        Intrinsics.checkNotNullParameter(token, "token");
                        if (!this.hasActiveWorld()) break block7;
                        if (!\u0636\u0643.getMc().isInSingleplayer()) break block8;
                    }
                    return false;
                }
                boolean bl = ((CharSequence)token).length() == 0;
                if (bl) {
                    return true;
                }
                object = \u0636\u0643.getMc().getCurrentServerEntry();
                if (object == null) break block9;
                String string2 = ((ServerInfo)object).address;
                if (string2 == null) break block9;
                String string3 = ((Object)StringsKt.trim((CharSequence)string2)).toString();
                if (string3 == null) break block9;
                String it = string = string3;
                boolean bl2 = false;
                String string4 = ((CharSequence)it).length() > 0 ? string : null;
                if (string4 == null) break block9;
                String string5 = string4;
                Locale locale = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
                String string6 = string5.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(string6, "toLowerCase(...)");
                string = string6;
                if (string != null) break block10;
            }
            return false;
        }
        String address = string;
        CharSequence charSequence = address;
        object = token;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string7 = ((String)object).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string7, "toLowerCase(...)");
        return StringsKt.contains$default(charSequence, string7, false, 2, null);
    }

    public final boolean isFunTime() {
        return this.isCurrentServerMatching("funtime");
    }
}

