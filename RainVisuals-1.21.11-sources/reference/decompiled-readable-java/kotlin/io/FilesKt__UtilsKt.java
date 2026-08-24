/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FilePathComponents;
import kotlin.io.FileSystemException;
import kotlin.io.FilesKt;
import kotlin.io.FilesKt__FileTreeWalkKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.io.NoSuchFileException;
import kotlin.io.OnErrorAction;
import kotlin.io.TerminateException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000>\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u001a1\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007\u00a2\u0006\u0004\b\u0007\u0010\u0006\u001a?\u0010\u000f\u001a\u00020\t*\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0015\u001a\u00020\t*\u00020\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0018\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u0018\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0000\u00a2\u0006\u0004\b\u0018\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u00020\u0003*\u00020\u0003\u00a2\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d*\b\u0012\u0004\u0012\u00020\u00030\u001dH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010\u001b\u001a\u00020 *\u00020 H\u0002\u00a2\u0006\u0004\b\u001e\u0010!\u001a\u0019\u0010#\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003\u00a2\u0006\u0004\b#\u0010$\u001a\u001b\u0010%\u001a\u0004\u0018\u00010\u0003*\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003\u00a2\u0006\u0004\b%\u0010$\u001a\u0019\u0010&\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003\u00a2\u0006\u0004\b&\u0010$\u001a\u0019\u0010(\u001a\u00020\u0003*\u00020\u00032\u0006\u0010'\u001a\u00020\u0003\u00a2\u0006\u0004\b(\u0010$\u001a\u0019\u0010(\u001a\u00020\u0003*\u00020\u00032\u0006\u0010'\u001a\u00020\u0000\u00a2\u0006\u0004\b(\u0010)\u001a\u0019\u0010*\u001a\u00020\u0003*\u00020\u00032\u0006\u0010'\u001a\u00020\u0003\u00a2\u0006\u0004\b*\u0010$\u001a\u0019\u0010*\u001a\u00020\u0003*\u00020\u00032\u0006\u0010'\u001a\u00020\u0000\u00a2\u0006\u0004\b*\u0010)\u001a\u0019\u0010+\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\u0004\b+\u0010\u0019\u001a\u0019\u0010+\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0000\u00a2\u0006\u0004\b+\u0010\u001a\u001a\u0019\u0010,\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003\u00a2\u0006\u0004\b,\u0010-\u001a\u001d\u0010/\u001a\u0004\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b.\u0010-\"\u0015\u00102\u001a\u00020\u0000*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b0\u00101\"\u0015\u00104\u001a\u00020\u0000*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b3\u00101\"\u0015\u00106\u001a\u00020\u0000*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b5\u00101\u00a8\u00067"}, d2={"", "prefix", "suffix", "Ljava/io/File;", "directory", "createTempDir", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;", "createTempFile", "target", "", "overwrite", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "onError", "copyRecursively", "(Ljava/io/File;Ljava/io/File;ZLkotlin/jvm/functions/Function2;)Z", "", "bufferSize", "copyTo", "(Ljava/io/File;Ljava/io/File;ZI)Ljava/io/File;", "deleteRecursively", "(Ljava/io/File;)Z", "other", "endsWith", "(Ljava/io/File;Ljava/io/File;)Z", "(Ljava/io/File;Ljava/lang/String;)Z", "normalize", "(Ljava/io/File;)Ljava/io/File;", "", "normalize$FilesKt__UtilsKt", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/io/FilePathComponents;", "(Lkotlin/io/FilePathComponents;)Lkotlin/io/FilePathComponents;", "base", "relativeTo", "(Ljava/io/File;Ljava/io/File;)Ljava/io/File;", "relativeToOrNull", "relativeToOrSelf", "relative", "resolve", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "resolveSibling", "startsWith", "toRelativeString", "(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;", "toRelativeStringOrNull$FilesKt__UtilsKt", "toRelativeStringOrNull", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "extension", "getInvariantSeparatorsPath", "invariantSeparatorsPath", "getNameWithoutExtension", "nameWithoutExtension", "kotlin-stdlib"}, xs="kotlin/io/FilesKt")
class FilesKt__UtilsKt
extends FilesKt__FileTreeWalkKt {
    @NotNull
    public static final String getInvariantSeparatorsPath(@NotNull File $this$invariantSeparatorsPath) {
        String string;
        Intrinsics.checkNotNullParameter($this$invariantSeparatorsPath, "<this>");
        if (File.separatorChar != '/') {
            String string2 = $this$invariantSeparatorsPath.getPath();
            Intrinsics.checkNotNullExpressionValue(string2, "getPath(...)");
            string = StringsKt.replace$default(string2, File.separatorChar, '/', false, 4, null);
        } else {
            String string3 = $this$invariantSeparatorsPath.getPath();
            string = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "getPath(...)");
        }
        return string;
    }

    @NotNull
    public static final String getNameWithoutExtension(@NotNull File $this$nameWithoutExtension) {
        Intrinsics.checkNotNullParameter($this$nameWithoutExtension, "<this>");
        String string = $this$nameWithoutExtension.getName();
        Intrinsics.checkNotNullExpressionValue(string, "getName(...)");
        return StringsKt.substringBeforeLast$default(string, ".", null, 2, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @NotNull
    public static final File copyTo(@NotNull File $this$copyTo, @NotNull File target, boolean overwrite, int bufferSize) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$copyTo, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!$this$copyTo.exists()) {
            throw new NoSuchFileException($this$copyTo, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!overwrite) {
                throw new FileAlreadyExistsException($this$copyTo, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new FileAlreadyExistsException($this$copyTo, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if ($this$copyTo.isDirectory()) {
            if (!target.mkdirs()) {
                throw new FileSystemException($this$copyTo, target, "Failed to create target directory.");
            }
        } else {
            File file = target.getParentFile();
            if (file != null) {
                file.mkdirs();
            }
            Closeable closeable = new FileInputStream($this$copyTo);
            Throwable throwable = null;
            try {
                long l;
                FileInputStream input = (FileInputStream)closeable;
                boolean bl = false;
                Closeable closeable2 = new FileOutputStream(target);
                Throwable throwable2 = null;
                try {
                    FileOutputStream output = (FileOutputStream)closeable2;
                    boolean bl2 = false;
                    l = ByteStreamsKt.copyTo(input, output, bufferSize);
                }
                catch (Throwable throwable3) {
                    throwable2 = throwable3;
                    throw throwable3;
                }
                finally {
                    CloseableKt.closeFinally(closeable2, throwable2);
                }
                long l2 = l;
            }
            catch (Throwable throwable4) {
                throwable = throwable4;
                throw throwable4;
            }
            finally {
                CloseableKt.closeFinally(closeable, throwable);
            }
        }
        return var1_1;
    }

    public static final boolean endsWith(@NotNull File $this$endsWith, @NotNull String other) {
        Intrinsics.checkNotNullParameter($this$endsWith, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return FilesKt.endsWith($this$endsWith, new File(other));
    }

    /*
     * WARNING - void declaration
     */
    public static final boolean copyRecursively(@NotNull File $this$copyRecursively, @NotNull File target, boolean overwrite, @NotNull Function2<? super File, ? super IOException, ? extends OnErrorAction> onError) {
        Intrinsics.checkNotNullParameter($this$copyRecursively, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (!$this$copyRecursively.exists()) {
            return onError.invoke($this$copyRecursively, new NoSuchFileException($this$copyRecursively, null, "The source file doesn't exist.", 2, null)) != OnErrorAction.TERMINATE;
        }
        try {
            Iterator<File> iterator2 = FilesKt.walkTopDown($this$copyRecursively).onFail((Function2<? super File, ? super IOException, Unit>)new Function2<File, IOException, Unit>(onError){
                final /* synthetic */ Function2<File, IOException, OnErrorAction> $onError;

                public final void invoke(@NotNull File f, @NotNull IOException e) {
                    Intrinsics.checkNotNullParameter(f, "f");
                    Intrinsics.checkNotNullParameter(e, "e");
                    if (this.$onError.invoke(f, e) == OnErrorAction.TERMINATE) {
                        throw new TerminateException(f);
                    }
                }
                {
                    this.$onError = $onError;
                    super(2);
                }
            }).iterator();
            while (iterator2.hasNext()) {
                void var5_6;
                File src = iterator2.next();
                if (!src.exists()) {
                    if (onError.invoke(src, new NoSuchFileException(src, null, "The source file doesn't exist.", 2, null)) != OnErrorAction.TERMINATE) continue;
                    return false;
                }
                String relPath = FilesKt.toRelativeString(src, $this$copyRecursively);
                File dstFile = new File(target, relPath);
                if (dstFile.exists()) {
                    if (src.isDirectory()) {
                        if (!dstFile.isDirectory()) {
                        }
                    } else {
                        boolean stillExists = !overwrite ? true : (dstFile.isDirectory() ? !FilesKt.deleteRecursively(dstFile) : !dstFile.delete());
                        if (stillExists) {
                            if (onError.invoke(dstFile, new FileAlreadyExistsException(src, dstFile, "The destination file already exists.")) != OnErrorAction.TERMINATE) continue;
                            return false;
                        }
                    }
                }
                if (src.isDirectory()) {
                    dstFile.mkdirs();
                    continue;
                }
                if (FilesKt.copyTo$default(src, dstFile, overwrite, 0, 4, null).length() == src.length()) continue;
                if (onError.invoke((File)var5_6, new IOException("Source file wasn't copied completely, length of destination file differs.")) != OnErrorAction.TERMINATE) continue;
                return false;
            }
            return true;
        }
        catch (TerminateException terminateException) {
            return false;
        }
    }

    @NotNull
    public static final String getExtension(@NotNull File $this$extension) {
        Intrinsics.checkNotNullParameter($this$extension, "<this>");
        String string = $this$extension.getName();
        Intrinsics.checkNotNullExpressionValue(string, "getName(...)");
        return StringsKt.substringAfterLast(string, '.', "");
    }

    @NotNull
    public static final File resolveSibling(@NotNull File $this$resolveSibling, @NotNull String relative) {
        Intrinsics.checkNotNullParameter($this$resolveSibling, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return FilesKt.resolveSibling($this$resolveSibling, new File(relative));
    }

    @NotNull
    public static final File relativeTo(@NotNull File $this$relativeTo, @NotNull File base) {
        Intrinsics.checkNotNullParameter($this$relativeTo, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        return new File(FilesKt.toRelativeString($this$relativeTo, base));
    }

    public static final boolean startsWith(@NotNull File $this$startsWith, @NotNull String other) {
        Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return FilesKt.startsWith($this$startsWith, new File(other));
    }

    public static /* synthetic */ File copyTo$default(File file, File file2, boolean bl, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        if ((n2 & 4) != 0) {
            n = 8192;
        }
        return FilesKt.copyTo(file, file2, bl, n);
    }

    public static /* synthetic */ File createTempDir$default(String string, String string2, File file, int n, Object object) {
        if ((n & 1) != 0) {
            string = "tmp";
        }
        if ((n & 2) != 0) {
            string2 = null;
        }
        if ((n & 4) != 0) {
            file = null;
        }
        return FilesKt.createTempDir(string, string2, file);
    }

    @NotNull
    public static final File resolve(@NotNull File $this$resolve, @NotNull String relative) {
        Intrinsics.checkNotNullParameter($this$resolve, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return FilesKt.resolve($this$resolve, new File(relative));
    }

    public static final boolean endsWith(@NotNull File $this$endsWith, @NotNull File other) {
        Intrinsics.checkNotNullParameter($this$endsWith, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        FilePathComponents components = FilesKt.toComponents($this$endsWith);
        FilePathComponents otherComponents = FilesKt.toComponents(other);
        if (otherComponents.isRooted()) {
            return Intrinsics.areEqual($this$endsWith, other);
        }
        int shift = components.getSize() - otherComponents.getSize();
        return shift < 0 ? false : ((Object)components.getSegments().subList(shift, components.getSize())).equals(otherComponents.getSegments());
    }

    /*
     * WARNING - void declaration
     */
    public static final boolean startsWith(@NotNull File $this$startsWith, @NotNull File other) {
        void var3_3;
        Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        FilePathComponents components = FilesKt.toComponents($this$startsWith);
        FilePathComponents otherComponents = FilesKt.toComponents(other);
        if (!Intrinsics.areEqual(components.getRoot(), otherComponents.getRoot())) {
            return false;
        }
        return components.getSize() < otherComponents.getSize() ? false : ((Object)components.getSegments().subList(0, otherComponents.getSize())).equals(var3_3.getSegments());
    }

    @Nullable
    public static final File relativeToOrNull(@NotNull File $this$relativeToOrNull, @NotNull File base) {
        File file;
        Intrinsics.checkNotNullParameter($this$relativeToOrNull, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String string = FilesKt__UtilsKt.toRelativeStringOrNull$FilesKt__UtilsKt($this$relativeToOrNull, base);
        if (string != null) {
            String string2 = string;
            String p0 = string2;
            boolean bl = false;
            file = new File(p0);
        } else {
            file = null;
        }
        return file;
    }

    /*
     * WARNING - void declaration
     */
    public static final boolean deleteRecursively(@NotNull File $this$deleteRecursively) {
        void var4_4;
        void $this$fold$iv;
        Intrinsics.checkNotNullParameter($this$deleteRecursively, "<this>");
        Sequence sequence = FilesKt.walkBottomUp($this$deleteRecursively);
        boolean initial$iv = true;
        boolean $i$f$fold = false;
        boolean accumulator$iv = initial$iv;
        for (Object element$iv : $this$fold$iv) {
            File it = (File)element$iv;
            boolean res = accumulator$iv;
            boolean bl = false;
            accumulator$iv = (it.delete() || !it.exists()) && res;
        }
        return (boolean)var4_4;
    }

    /*
     * WARNING - void declaration
     */
    private static final List<File> normalize$FilesKt__UtilsKt(List<? extends File> $this$normalize) {
        void var1_1;
        List list = new ArrayList($this$normalize.size());
        Iterator<? extends File> iterator2 = $this$normalize.iterator();
        while (iterator2.hasNext()) {
            File file = iterator2.next();
            String string = file.getName();
            if (Intrinsics.areEqual(string, ".")) continue;
            if (Intrinsics.areEqual(string, "..")) {
                if (!list.isEmpty() && !Intrinsics.areEqual(((File)CollectionsKt.last(list)).getName(), "..")) {
                    list.remove(list.size() - 1);
                    continue;
                }
                list.add(file);
                continue;
            }
            list.add(file);
        }
        return var1_1;
    }

    @NotNull
    public static final String toRelativeString(@NotNull File $this$toRelativeString, @NotNull File base) {
        Intrinsics.checkNotNullParameter($this$toRelativeString, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String string = FilesKt__UtilsKt.toRelativeStringOrNull$FilesKt__UtilsKt($this$toRelativeString, base);
        if (string == null) {
            throw new IllegalArgumentException("this and base files have different roots: " + $this$toRelativeString + " and " + base + '.');
        }
        return string;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @NotNull
    public static final File resolve(@NotNull File $this$resolve, @NotNull File relative) {
        File file;
        Intrinsics.checkNotNullParameter($this$resolve, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        if (FilesKt.isRooted(relative)) {
            return relative;
        }
        String string = $this$resolve.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String baseName = string;
        if (!(((CharSequence)baseName).length() == 0)) {
            if (!StringsKt.endsWith$default((CharSequence)baseName, File.separatorChar, false, 2, null)) {
                void var1_1;
                file = new File(baseName + File.separatorChar + var1_1);
                return file;
            }
        }
        file = new File(baseName + relative);
        return file;
    }

    public static /* synthetic */ boolean copyRecursively$default(File file, File file2, boolean bl, Function2 function2, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        if ((n & 4) != 0) {
            function2 = copyRecursively.1.INSTANCE;
        }
        return FilesKt.copyRecursively(file, file2, bl, function2);
    }

    @NotNull
    public static final File relativeToOrSelf(@NotNull File $this$relativeToOrSelf, @NotNull File base) {
        File file;
        Intrinsics.checkNotNullParameter($this$relativeToOrSelf, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String string = FilesKt__UtilsKt.toRelativeStringOrNull$FilesKt__UtilsKt($this$relativeToOrSelf, base);
        if (string != null) {
            String string2 = string;
            String p0 = string2;
            boolean bl = false;
            file = new File(p0);
        } else {
            File file2;
            file = file2;
        }
        return file;
    }

    @Deprecated(message="Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @NotNull
    public static final File createTempDir(@NotNull String prefix, @Nullable String suffix, @Nullable File directory) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        File dir = File.createTempFile(prefix, suffix, directory);
        dir.delete();
        if (dir.mkdir()) {
            Intrinsics.checkNotNull(dir);
            return dir;
        }
        throw new IOException("Unable to create temporary directory " + dir + '.');
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final File resolveSibling(@NotNull File $this$resolveSibling, @NotNull File relative) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$resolveSibling, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        FilePathComponents components = FilesKt.toComponents($this$resolveSibling);
        File parentSubPath = components.getSize() == 0 ? new File("..") : components.subPath(0, components.getSize() - 1);
        return FilesKt.resolve(FilesKt.resolve(components.getRoot(), parentSubPath), (File)var1_1);
    }

    private static final FilePathComponents normalize$FilesKt__UtilsKt(FilePathComponents $this$normalize) {
        return new FilePathComponents($this$normalize.getRoot(), FilesKt__UtilsKt.normalize$FilesKt__UtilsKt($this$normalize.getSegments()));
    }

    /*
     * WARNING - void declaration
     */
    private static final String toRelativeStringOrNull$FilesKt__UtilsKt(File $this$toRelativeStringOrNull, File base) {
        void var10_10;
        File file;
        FilePathComponents thisComponents = FilesKt__UtilsKt.normalize$FilesKt__UtilsKt(FilesKt.toComponents($this$toRelativeStringOrNull));
        FilePathComponents baseComponents = FilesKt__UtilsKt.normalize$FilesKt__UtilsKt(FilesKt.toComponents(base));
        if (!Intrinsics.areEqual(thisComponents.getRoot(), baseComponents.getRoot())) {
            return null;
        }
        int baseCount = baseComponents.getSize();
        int thisCount = thisComponents.getSize();
        File $this$toRelativeStringOrNull_u24lambda_u241 = file = $this$toRelativeStringOrNull;
        boolean bl = false;
        int i = 0;
        int maxSameCount = Math.min(thisCount, baseCount);
        while (i < maxSameCount) {
            if (!Intrinsics.areEqual(thisComponents.getSegments().get(i), baseComponents.getSegments().get(i))) break;
            ++var10_10;
        }
        void sameCount = var10_10;
        StringBuilder res = new StringBuilder();
        int i2 = baseCount - 1;
        if (sameCount <= i2) {
            while (true) {
                void var8_8;
                if (Intrinsics.areEqual(baseComponents.getSegments().get(i2).getName(), "..")) {
                    return null;
                }
                res.append("..");
                if (i2 != sameCount) {
                    res.append(File.separatorChar);
                }
                if (i2 == sameCount) break;
                --var8_8;
            }
        }
        if (sameCount < thisCount) {
            if (sameCount < baseCount) {
                res.append(File.separatorChar);
            }
            Iterable iterable = CollectionsKt.drop((Iterable)thisComponents.getSegments(), (int)sameCount);
            Appendable appendable = res;
            String string = File.separator;
            Intrinsics.checkNotNullExpressionValue(string, "separator");
            CollectionsKt.joinTo$default(iterable, appendable, string, null, null, 0, null, null, 124, null);
        }
        return ((StringBuilder)((Object)file)).toString();
    }

    public static /* synthetic */ File createTempFile$default(String string, String string2, File file, int n, Object object) {
        if ((n & 1) != 0) {
            string = "tmp";
        }
        if ((n & 2) != 0) {
            string2 = null;
        }
        if ((n & 4) != 0) {
            file = null;
        }
        return FilesKt.createTempFile(string, string2, file);
    }

    @Deprecated(message="Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @NotNull
    public static final File createTempFile(@NotNull String prefix, @Nullable String suffix, @Nullable File directory) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        File file = File.createTempFile(prefix, suffix, directory);
        Intrinsics.checkNotNullExpressionValue(file, "createTempFile(...)");
        return file;
    }

    @NotNull
    public static final File normalize(@NotNull File $this$normalize) {
        FilePathComponents filePathComponents;
        Intrinsics.checkNotNullParameter($this$normalize, "<this>");
        FilePathComponents $this$normalize_u24lambda_u245 = filePathComponents = FilesKt.toComponents($this$normalize);
        boolean bl = false;
        File file = $this$normalize_u24lambda_u245.getRoot();
        Iterable iterable = FilesKt__UtilsKt.normalize$FilesKt__UtilsKt($this$normalize_u24lambda_u245.getSegments());
        String string = File.separator;
        Intrinsics.checkNotNullExpressionValue(string, "separator");
        return FilesKt.resolve(file, CollectionsKt.joinToString$default(iterable, string, null, null, 0, null, null, 62, null));
    }
}

