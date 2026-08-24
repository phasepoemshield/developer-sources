/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0011\u00a8\u0006\u0014"}, d2={"Lkotlin/io/path/LinkFollowing;", "", "<init>", "()V", "", "followLinks", "", "Ljava/nio/file/LinkOption;", "toLinkOptions", "(Z)[Ljava/nio/file/LinkOption;", "", "Ljava/nio/file/FileVisitOption;", "toVisitOptions", "(Z)Ljava/util/Set;", "followLinkOption", "[Ljava/nio/file/LinkOption;", "followVisitOption", "Ljava/util/Set;", "nofollowLinkOption", "nofollowVisitOption", "kotlin-stdlib-jdk7"})
public final class LinkFollowing {
    @NotNull
    public static final LinkFollowing INSTANCE = new LinkFollowing();
    @NotNull
    private static final Set<FileVisitOption> followVisitOption;
    @NotNull
    private static final LinkOption[] nofollowLinkOption;
    @NotNull
    private static final LinkOption[] followLinkOption;
    @NotNull
    private static final Set<FileVisitOption> nofollowVisitOption;

    static {
        LinkOption[] linkOptionArray = new LinkOption[1];
        linkOptionArray[0] = LinkOption.NOFOLLOW_LINKS;
        nofollowLinkOption = linkOptionArray;
        boolean $i$f$emptyArray = false;
        followLinkOption = new LinkOption[0];
        nofollowVisitOption = SetsKt.emptySet();
        followVisitOption = SetsKt.setOf(FileVisitOption.FOLLOW_LINKS);
    }

    @NotNull
    public final Set<FileVisitOption> toVisitOptions(boolean followLinks) {
        return followLinks ? followVisitOption : nofollowVisitOption;
    }

    @NotNull
    public final LinkOption[] toLinkOptions(boolean followLinks) {
        return followLinks ? followLinkOption : nofollowLinkOption;
    }

    private LinkFollowing() {
    }
}

