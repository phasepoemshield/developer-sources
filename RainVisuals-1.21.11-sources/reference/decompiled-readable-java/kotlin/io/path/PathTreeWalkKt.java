/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.io.path.PathNode;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002\u00a2\u0006\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2={"Ljava/nio/file/Path;", "path", "", "Ljava/nio/file/LinkOption;", "linkOptions", "", "keyOf", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "Lkotlin/io/path/PathNode;", "", "createsCycle", "(Lkotlin/io/path/PathNode;)Z", "kotlin-stdlib-jdk7"})
public final class PathTreeWalkKt {
    private static final boolean createsCycle(PathNode $this$createsCycle) {
        for (PathNode ancestor = $this$createsCycle.getParent(); ancestor != null; ancestor = ancestor.getParent()) {
            if (ancestor.getKey() != null && $this$createsCycle.getKey() != null) {
                if (!Intrinsics.areEqual(ancestor.getKey(), $this$createsCycle.getKey())) continue;
                return true;
            }
            try {
                if (!Files.isSameFile(ancestor.getPath(), $this$createsCycle.getPath())) continue;
                return true;
            }
            catch (IOException iOException) {
                continue;
            }
            catch (SecurityException securityException) {
                // empty catch block
            }
        }
        return false;
    }

    private static final Object keyOf(Path path, LinkOption[] linkOptions) {
        Object object;
        try {
            object = path;
            LinkOption[] linkOptionArray = Arrays.copyOf(linkOptions, linkOptions.length);
            BasicFileAttributes basicFileAttributes = Files.readAttributes((Path)object, BasicFileAttributes.class, Arrays.copyOf(linkOptionArray, linkOptionArray.length));
            Intrinsics.checkNotNullExpressionValue(basicFileAttributes, "readAttributes(...)");
            object = basicFileAttributes.fileKey();
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }

    public static final /* synthetic */ boolean access$createsCycle(PathNode $receiver) {
        return PathTreeWalkKt.createsCycle($receiver);
    }

    public static final /* synthetic */ Object access$keyOf(Path path, LinkOption[] linkOptions) {
        return PathTreeWalkKt.keyOf(path, linkOptions);
    }
}

