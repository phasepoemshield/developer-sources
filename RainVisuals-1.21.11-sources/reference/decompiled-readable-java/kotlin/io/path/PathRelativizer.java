/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c2\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n \t*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\u000b\u00a8\u0006\r"}, d2={"Lkotlin/io/path/PathRelativizer;", "", "<init>", "()V", "Ljava/nio/file/Path;", "path", "base", "tryRelativeTo", "(Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "emptyPath", "Ljava/nio/file/Path;", "parentPath", "kotlin-stdlib-jdk7"})
final class PathRelativizer {
    @NotNull
    public static final PathRelativizer INSTANCE = new PathRelativizer();
    private static final Path parentPath;
    private static final Path emptyPath;

    static {
        emptyPath = Paths.get("", new String[0]);
        parentPath = Paths.get("..", new String[0]);
    }

    private PathRelativizer() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @NotNull
    public final Path tryRelativeTo(@NotNull Path path, @NotNull Path base) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(base, "base");
        bn = base.normalize();
        pn = path.normalize();
        rn = bn.relativize(pn);
        var7_8 = Math.min(bn.getNameCount(), pn.getNameCount());
        for (i = 0; i < var7_8; ++i) {
            if (!Intrinsics.areEqual(bn.getName(i), PathRelativizer.parentPath)) break;
            if (Intrinsics.areEqual(pn.getName(i), PathRelativizer.parentPath)) continue;
            throw new IllegalArgumentException("Unable to compute relative path");
        }
        if (Intrinsics.areEqual(pn, bn)) ** GOTO lbl-1000
        if (Intrinsics.areEqual(bn, PathRelativizer.emptyPath)) {
            v0 /* !! */  = pn;
        } else lbl-1000:
        // 2 sources

        {
            rnString = rn.toString();
            v1 = rn.getFileSystem().getSeparator();
            Intrinsics.checkNotNullExpressionValue(v1, "getSeparator(...)");
            v0 /* !! */  = StringsKt.endsWith$default(rnString, v1, false, 2, null) ? rn.getFileSystem().getPath(StringsKt.dropLast(rnString, rn.getFileSystem().getSeparator().length()), new String[0]) : var5_5;
        }
        var6_7 = v0 /* !! */ ;
        Intrinsics.checkNotNull(var6_7);
        return var6_7;
    }
}

