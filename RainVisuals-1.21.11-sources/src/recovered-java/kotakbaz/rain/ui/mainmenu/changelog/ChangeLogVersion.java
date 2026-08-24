/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.mainmenu.changelog;

import java.util.List;
import kotakbaz.rain.ui.mainmenu.changelog.ChangeLogItem;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2={"Loxxxde/\u062d\u0638;", "", "", "version", "", "Loxxxde/\u062f\u0627;", "entries", "<init>", "(Ljava/lang/String;[Lkotakbaz/rain/ui/mainmenu/changelog/ChangeLogItem;)V", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "rain-visuals"})
public final class ChangeLogVersion {
    @NotNull
    private final List<ChangeLogItem> items;
    @NotNull
    private final String version;

    public ChangeLogVersion(@NotNull String version, ChangeLogItem ... entries) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.version = version;
        this.items = ArraysKt.asList(entries);
    }

    @NotNull
    public final List<ChangeLogItem> getItems() {
        return this.items;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }
}

