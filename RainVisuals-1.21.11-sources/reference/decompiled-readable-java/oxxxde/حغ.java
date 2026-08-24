/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.UUID;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062a\u064e;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"Loxxxde/\u062d\u063a;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Ljava/util/UUID;", "uuid", "", "isRainUser", "(Ljava/util/UUID;)Z", "rain-visuals"})
public final class \u062d\u063a
extends Module {
    @NotNull
    public static final \u062d\u063a INSTANCE = new \u062d\u063a();

    static {
        INSTANCE.setVisibleInGui(\u062d\u063a::_init_$lambda$0);
        INSTANCE.setEnabled(true);
    }

    private \u062d\u063a() {
        super("Socials", \u0638\u0646.getPLAYER(), "\u041e\u0442\u043c\u0435\u0447\u0430\u0435\u0442 \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u0435\u0439 Rain \u043d\u0430\u0434 \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u0436\u0430\u043c\u0438");
    }

    private static final boolean _init_$lambda$0() {
        return false;
    }

    public final boolean isRainUser(@NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return this.isEnabled() && \u062a\u064e.INSTANCE.isRainUser(uuid);
    }
}

