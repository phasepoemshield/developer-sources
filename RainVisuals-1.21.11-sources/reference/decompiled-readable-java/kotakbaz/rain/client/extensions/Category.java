/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u00020\u0016H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u0002H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b\u00a8\u0006 "}, d2={"Loxxxde/\u0638\u0635;", "", "", "name", "icon", "desc", "searchPlaceholder", "searchFieldIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotakbaz/rain/client/extensions/Category;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getIcon", "getDesc", "getSearchPlaceholder", "getSearchFieldIcon", "rain-visuals"})
public final class Category {
    @NotNull
    private final String searchFieldIcon;
    @NotNull
    private final String desc;
    @NotNull
    private final String icon;
    @NotNull
    private final String searchPlaceholder;
    @NotNull
    private final String name;

    @NotNull
    public String toString() {
        return "Category(name=" + this.name + ", icon=" + this.icon + ", desc=" + this.desc + ", searchPlaceholder=" + this.searchPlaceholder + ", searchFieldIcon=" + this.searchFieldIcon + ")";
    }

    public /* synthetic */ Category(String string, String string2, String string3, String string4, String string5, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 8) != 0) {
            string4 = "\u041f\u043e\u0438\u0441\u043a..";
        }
        if ((n & 0x10) != 0) {
            string5 = "g";
        }
        this(string, string2, string3, string4, string5);
    }

    public Category(@NotNull String name, @NotNull String icon, @NotNull String desc, @NotNull String searchPlaceholder, @NotNull String searchFieldIcon) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(searchPlaceholder, "searchPlaceholder");
        Intrinsics.checkNotNullParameter(searchFieldIcon, "searchFieldIcon");
        this.name = name;
        this.icon = icon;
        this.desc = desc;
        this.searchPlaceholder = searchPlaceholder;
        this.searchFieldIcon = searchFieldIcon;
    }

    @NotNull
    public final String component2() {
        return this.icon;
    }

    @NotNull
    public final Category copy(@NotNull String name, @NotNull String icon, @NotNull String desc, @NotNull String searchPlaceholder, @NotNull String searchFieldIcon) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(searchPlaceholder, "searchPlaceholder");
        Intrinsics.checkNotNullParameter(searchFieldIcon, "searchFieldIcon");
        return new Category(name, icon, desc, searchPlaceholder, searchFieldIcon);
    }

    public static /* synthetic */ Category copy$default(Category category, String string, String string2, String string3, String string4, String string5, int n, Object object) {
        if ((n & 1) != 0) {
            string = category.name;
        }
        if ((n & 2) != 0) {
            string2 = category.icon;
        }
        if ((n & 4) != 0) {
            string3 = category.desc;
        }
        if ((n & 8) != 0) {
            string4 = category.searchPlaceholder;
        }
        if ((n & 0x10) != 0) {
            string5 = category.searchFieldIcon;
        }
        return category.copy(string, string2, string3, string4, string5);
    }

    @NotNull
    public final String getSearchFieldIcon() {
        return this.searchFieldIcon;
    }

    @NotNull
    public final String component4() {
        return this.searchPlaceholder;
    }

    @NotNull
    public final String component3() {
        return this.desc;
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Category)) {
            return false;
        }
        Category category = (Category)other;
        if (!Intrinsics.areEqual(this.name, category.name)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.icon, category.icon)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.desc, category.desc)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.searchPlaceholder, category.searchPlaceholder)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.searchFieldIcon, category.searchFieldIcon)) {
            return false;
        }
        return true;
    }

    @NotNull
    public final String getSearchPlaceholder() {
        return this.searchPlaceholder;
    }

    public int hashCode() {
        int result = this.name.hashCode();
        result = result * 31 + this.icon.hashCode();
        result = result * 31 + this.desc.hashCode();
        result = result * 31 + this.searchPlaceholder.hashCode();
        result = result * 31 + this.searchFieldIcon.hashCode();
        return result;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String component5() {
        return this.searchFieldIcon;
    }
}

