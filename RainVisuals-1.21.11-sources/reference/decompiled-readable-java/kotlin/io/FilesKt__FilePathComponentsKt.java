/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilePathComponents;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0005H\u0000\u00a2\u0006\u0004\b\u000b\u0010\f\"\u0015\u0010\u000e\u001a\u00020\r*\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0012\u001a\u00020\u0005*\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0015\u001a\u00020\u0000*\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2={"", "", "getRootLength$FilesKt__FilePathComponentsKt", "(Ljava/lang/String;)I", "getRootLength", "Ljava/io/File;", "beginIndex", "endIndex", "subPath", "(Ljava/io/File;II)Ljava/io/File;", "Lkotlin/io/FilePathComponents;", "toComponents", "(Ljava/io/File;)Lkotlin/io/FilePathComponents;", "", "isRooted", "(Ljava/io/File;)Z", "getRoot", "(Ljava/io/File;)Ljava/io/File;", "root", "getRootName", "(Ljava/io/File;)Ljava/lang/String;", "rootName", "kotlin-stdlib"}, xs="kotlin/io/FilesKt")
class FilesKt__FilePathComponentsKt {
    @NotNull
    public static final File subPath(@NotNull File $this$subPath, int beginIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$subPath, "<this>");
        return FilesKt.toComponents($this$subPath).subPath(beginIndex, endIndex);
    }

    @NotNull
    public static final String getRootName(@NotNull File $this$rootName) {
        Intrinsics.checkNotNullParameter($this$rootName, "<this>");
        String string = $this$rootName.getPath();
        Intrinsics.checkNotNullExpressionValue(string, "getPath(...)");
        String string2 = string;
        int n = 0;
        String string3 = $this$rootName.getPath();
        Intrinsics.checkNotNullExpressionValue(string3, "getPath(...)");
        int n2 = FilesKt__FilePathComponentsKt.getRootLength$FilesKt__FilePathComponentsKt(string3);
        String string4 = string2.substring(n, n2);
        Intrinsics.checkNotNullExpressionValue(string4, "substring(...)");
        return string4;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final FilePathComponents toComponents(@NotNull File $this$toComponents) {
        void var5_5;
        void var3_6;
        List list;
        Intrinsics.checkNotNullParameter($this$toComponents, "<this>");
        String path = $this$toComponents.getPath();
        Intrinsics.checkNotNull(path);
        int rootLength = FilesKt__FilePathComponentsKt.getRootLength$FilesKt__FilePathComponentsKt(path);
        String string = path;
        int n = 0;
        String string2 = string.substring(n, rootLength);
        Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
        String rootName = string2;
        String string3 = path.substring(rootLength);
        Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
        String subPath = string3;
        boolean bl = ((CharSequence)subPath).length() == 0;
        if (bl) {
            list = CollectionsKt.emptyList();
        } else {
            void var9_10;
            void $this$mapTo$iv$iv;
            char[] cArray = new char[1];
            cArray[0] = File.separatorChar;
            Iterable $this$map$iv = StringsKt.split$default((CharSequence)subPath, cArray, false, 0, 6, null);
            boolean $i$f$map = false;
            Iterable iterable = $this$map$iv;
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            boolean $i$f$mapTo = false;
            for (Object item$iv$iv : $this$mapTo$iv$iv) {
                void var13_14;
                String p0 = (String)item$iv$iv;
                Collection collection = destination$iv$iv;
                boolean bl2 = false;
                collection.add(new File((String)var13_14));
            }
            list = (List)var9_10;
        }
        List list2 = list;
        return new FilePathComponents(new File((String)var3_6), (List<? extends File>)var5_5);
    }

    private static final int getRootLength$FilesKt__FilePathComponentsKt(String $this$getRootLength) {
        int first = StringsKt.indexOf$default((CharSequence)$this$getRootLength, File.separatorChar, 0, false, 4, null);
        if (first == 0) {
            if ($this$getRootLength.length() > 1) {
                if ($this$getRootLength.charAt(1) == File.separatorChar) {
                    first = StringsKt.indexOf$default((CharSequence)$this$getRootLength, File.separatorChar, 2, false, 4, null);
                    if (first >= 0) {
                        if ((first = StringsKt.indexOf$default((CharSequence)$this$getRootLength, File.separatorChar, first + 1, false, 4, null)) >= 0) {
                            return first + 1;
                        }
                        return $this$getRootLength.length();
                    }
                }
            }
            return 1;
        }
        if (first > 0 && $this$getRootLength.charAt(first + -1) == ':') {
            return ++first;
        }
        if (first == -1) {
            if (StringsKt.endsWith$default((CharSequence)$this$getRootLength, ':', false, 2, null)) {
                String string;
                return string.length();
            }
        }
        return 0;
    }

    public static final boolean isRooted(@NotNull File $this$isRooted) {
        Intrinsics.checkNotNullParameter($this$isRooted, "<this>");
        String string = $this$isRooted.getPath();
        Intrinsics.checkNotNullExpressionValue(string, "getPath(...)");
        return FilesKt__FilePathComponentsKt.getRootLength$FilesKt__FilePathComponentsKt(string) > 0;
    }

    @NotNull
    public static final File getRoot(@NotNull File $this$root) {
        Intrinsics.checkNotNullParameter($this$root, "<this>");
        return new File(FilesKt.getRootName($this$root));
    }
}

