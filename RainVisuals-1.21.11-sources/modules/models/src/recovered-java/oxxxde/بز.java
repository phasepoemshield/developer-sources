/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotakbaz.rain.client.figura.FiguraAvatarInstaller;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062b\u062f;
import oxxxde.\u062f\u0633;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u0016\u00a8\u0006\u001b"}, d2={"Loxxxde/\u0628\u0632;", "", "<init>", "()V", "", "search", "", "Loxxxde/\u0637\u0646;", "cards", "(Ljava/lang/String;)Ljava/util/List;", "", "refreshAvatarsIfNeeded", "rebuildCards", "avatar", "", "matchesSearch", "(Lkotakbaz/rain/client/figura/FiguraAvatarInstaller$AvatarEntry;)Z", "avatars", "Ljava/util/List;", "normalizedSearch", "Ljava/lang/String;", "installRunning", "Z", "", "catalogRevision", "I", "dirty", "rain-visuals"})
public final class \u0628\u0632 {
    @Nullable
    private List<FiguraAvatarInstaller.AvatarEntry> avatars;
    private boolean installRunning;
    private int catalogRevision = -1;
    private boolean dirty = true;
    @NotNull
    private String normalizedSearch = "";
    @NotNull
    private List<FiguraAvatarInstaller.AvatarEntry> cards = CollectionsKt.emptyList();

    @NotNull
    public final List<FiguraAvatarInstaller.AvatarEntry> cards(@NotNull String search) {
        Intrinsics.checkNotNullParameter(search, "search");
        this.refreshAvatarsIfNeeded();
        if (!Intrinsics.areEqual(this.normalizedSearch, search)) {
            this.normalizedSearch = search;
            this.dirty = true;
        }
        if (this.dirty) {
            this.rebuildCards();
        }
        return this.cards;
    }

    /*
     * WARNING - void declaration
     */
    private final void rebuildCards() {
        void var4_5;
        void $this$filterTo$iv$iv;
        void $this$filter$iv;
        List<FiguraAvatarInstaller.AvatarEntry> list = this.avatars;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        Iterable iterable = list;
        \u0628\u0632 \u0628\u06322 = this;
        boolean $i$f$filter = false;
        void var3_4 = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        for (Object element$iv$iv : $this$filterTo$iv$iv) {
            FiguraAvatarInstaller.AvatarEntry p0 = (FiguraAvatarInstaller.AvatarEntry)element$iv$iv;
            boolean bl = false;
            if (!this.matchesSearch(p0)) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        \u0628\u06322.cards = (List)var4_5;
        this.dirty = false;
    }

    private final void refreshAvatarsIfNeeded() {
        boolean running = \u062f\u0633.isRunning();
        int revision = \u062f\u0633.getCatalogRevision();
        if (this.avatars != null && this.installRunning == running) {
            if (this.catalogRevision == revision) {
                return;
            }
        }
        List<FiguraAvatarInstaller.AvatarEntry> list = \u062f\u0633.getBundledAvatars();
        Intrinsics.checkNotNullExpressionValue(list, "getBundledAvatars(...)");
        Iterable $this$sortedBy$iv = list;
        boolean $i$f$sortedBy = false;
        this.avatars = CollectionsKt.sortedWith($this$sortedBy$iv, new \u062b\u062f());
        this.installRunning = running;
        this.catalogRevision = revision;
        this.dirty = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean matchesSearch(FiguraAvatarInstaller.AvatarEntry avatar) {
        if (StringsKt.isBlank(this.normalizedSearch)) {
            return true;
        }
        String string = avatar.id();
        Intrinsics.checkNotNullExpressionValue(string, "id(...)");
        String string2 = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        if (StringsKt.contains$default((CharSequence)string2, this.normalizedSearch, false, 2, null)) return true;
        String string3 = avatar.name();
        Intrinsics.checkNotNullExpressionValue(string3, "name(...)");
        String string4 = string3.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string4, "toLowerCase(...)");
        if (StringsKt.contains$default((CharSequence)string4, this.normalizedSearch, false, 2, null)) return true;
        String string5 = avatar.description();
        Intrinsics.checkNotNullExpressionValue(string5, "description(...)");
        String string6 = string5.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string6, "toLowerCase(...)");
        if (!StringsKt.contains$default((CharSequence)string6, this.normalizedSearch, false, 2, null)) return false;
        return true;
    }
}

