/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.mainmenu.changelog;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u00020\u0010H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\u0002H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b\u00a8\u0006\u0017"}, d2={"Loxxxde/\u062f\u0627;", "", "", "type", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lkotakbaz/rain/ui/mainmenu/changelog/ChangeLogItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "getText", "rain-visuals"})
public final class ChangeLogItem {
    @NotNull
    private final String text;
    @NotNull
    private final String type;

    @NotNull
    public final String component2() {
        return this.text;
    }

    public ChangeLogItem(@NotNull String type, @NotNull String text) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(text, "text");
        this.type = type;
        this.text = text;
    }

    @NotNull
    public final String component1() {
        return this.type;
    }

    public static /* synthetic */ ChangeLogItem copy$default(ChangeLogItem changeLogItem, String string, String string2, int n, Object object) {
        if ((n & 1) != 0) {
            string = changeLogItem.type;
        }
        if ((n & 2) != 0) {
            string2 = changeLogItem.text;
        }
        return changeLogItem.copy(string, string2);
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int result = this.type.hashCode();
        result = result * 31 + this.text.hashCode();
        return result;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeLogItem)) {
            return false;
        }
        ChangeLogItem changeLogItem = (ChangeLogItem)other;
        if (!Intrinsics.areEqual(this.type, changeLogItem.type)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.text, changeLogItem.text)) {
            return false;
        }
        return true;
    }

    @NotNull
    public String toString() {
        return "ChangeLogItem(type=" + this.type + ", text=" + this.text + ")";
    }

    @NotNull
    public final ChangeLogItem copy(@NotNull String type, @NotNull String text) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(text, "text");
        return new ChangeLogItem(type, text);
    }
}

