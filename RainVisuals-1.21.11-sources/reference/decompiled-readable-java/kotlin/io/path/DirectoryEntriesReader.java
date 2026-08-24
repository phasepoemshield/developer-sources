/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.io.path.LinkFollowing;
import kotlin.io.path.PathNode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u0013\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2={"Lkotlin/io/path/DirectoryEntriesReader;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "", "followLinks", "<init>", "(Z)V", "dir", "Ljava/nio/file/attribute/BasicFileAttributes;", "attrs", "Ljava/nio/file/FileVisitResult;", "preVisitDirectory", "(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", "Lkotlin/io/path/PathNode;", "directoryNode", "", "readEntries", "(Lkotlin/io/path/PathNode;)Ljava/util/List;", "file", "visitFile", "Lkotlin/io/path/PathNode;", "Lkotlin/collections/ArrayDeque;", "entries", "Lkotlin/collections/ArrayDeque;", "Z", "getFollowLinks", "()Z", "kotlin-stdlib-jdk7"})
final class DirectoryEntriesReader
extends SimpleFileVisitor<Path> {
    @Nullable
    private PathNode directoryNode;
    @NotNull
    private ArrayDeque<PathNode> entries;
    private final boolean followLinks;

    @Override
    @NotNull
    public FileVisitResult visitFile(@NotNull Path file, @NotNull BasicFileAttributes attrs) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        PathNode fileEntry = new PathNode(file, null, this.directoryNode);
        this.entries.add(fileEntry);
        FileVisitResult fileVisitResult = super.visitFile(file, attrs);
        Intrinsics.checkNotNullExpressionValue((Object)fileVisitResult, "visitFile(...)");
        return fileVisitResult;
    }

    public DirectoryEntriesReader(boolean followLinks) {
        this.followLinks = followLinks;
        this.entries = new ArrayDeque();
    }

    @Override
    @NotNull
    public FileVisitResult preVisitDirectory(@NotNull Path dir, @NotNull BasicFileAttributes attrs) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        PathNode directoryEntry = new PathNode(dir, attrs.fileKey(), this.directoryNode);
        this.entries.add(directoryEntry);
        FileVisitResult fileVisitResult = super.preVisitDirectory(dir, attrs);
        Intrinsics.checkNotNullExpressionValue((Object)fileVisitResult, "preVisitDirectory(...)");
        return fileVisitResult;
    }

    @NotNull
    public final List<PathNode> readEntries(@NotNull PathNode directoryNode) {
        Intrinsics.checkNotNullParameter(directoryNode, "directoryNode");
        this.directoryNode = directoryNode;
        Files.walkFileTree(directoryNode.getPath(), LinkFollowing.INSTANCE.toVisitOptions(this.followLinks), 1, this);
        this.entries.removeFirst();
        ArrayDeque<PathNode> arrayDeque = this.entries;
        ArrayDeque<PathNode> it = arrayDeque;
        boolean bl = false;
        this.entries = new ArrayDeque();
        return arrayDeque;
    }

    public final boolean getFollowLinks() {
        return this.followLinks;
    }
}

