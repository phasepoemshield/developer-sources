/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin._Assertions;
import kotlin.collections.AbstractIterator;
import kotlin.io.AccessDeniedException;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003$%&B\u001b\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007B\u008b\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u00128\u0010\u0013\u001a4\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0006\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0015\u0010\u001bJ!\u0010\n\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0004\b\n\u0010\u001dJ'\u0010\u0013\u001a\u00020\u00002\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0004\b\u0013\u0010\u001eJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\b\u00a2\u0006\u0004\b\f\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010 R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010!RF\u0010\u0013\u001a4\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\"R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010#\u00a8\u0006'"}, d2={"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", "Lkotlin/io/FileWalkDirection;", "direction", "<init>", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "Lkotlin/Function1;", "", "onEnter", "", "onLeave", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "f", "Ljava/io/IOException;", "e", "onFail", "", "maxDepth", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "", "iterator", "()Ljava/util/Iterator;", "depth", "(I)Lkotlin/io/FileTreeWalk;", "function", "(Lkotlin/jvm/functions/Function1;)Lkotlin/io/FileTreeWalk;", "(Lkotlin/jvm/functions/Function2;)Lkotlin/io/FileTreeWalk;", "Lkotlin/io/FileWalkDirection;", "I", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "Ljava/io/File;", "DirectoryState", "FileTreeWalkIterator", "WalkState", "kotlin-stdlib"})
public final class FileTreeWalk
implements Sequence<File> {
    private final int maxDepth;
    @NotNull
    private final FileWalkDirection direction;
    @NotNull
    private final File start;
    @Nullable
    private final Function1<File, Boolean> onEnter;
    @Nullable
    private final Function2<File, IOException, Unit> onFail;
    @Nullable
    private final Function1<File, Unit> onLeave;

    private FileTreeWalk(File start, FileWalkDirection direction, Function1<? super File, Boolean> onEnter, Function1<? super File, Unit> onLeave, Function2<? super File, ? super IOException, Unit> onFail, int maxDepth) {
        this.start = start;
        this.direction = direction;
        this.onEnter = onEnter;
        this.onLeave = onLeave;
        this.onFail = onFail;
        this.maxDepth = maxDepth;
    }

    /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int n, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 2) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        if ((n2 & 0x20) != 0) {
            n = Integer.MAX_VALUE;
        }
        this(file, fileWalkDirection, function1, function12, function2, n);
    }

    @NotNull
    public final FileTreeWalk onFail(@NotNull Function2<? super File, ? super IOException, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, function, this.maxDepth);
    }

    @NotNull
    public final FileTreeWalk maxDepth(int depth) {
        if (depth <= 0) {
            throw new IllegalArgumentException("depth must be positive, but was " + depth + '.');
        }
        return new FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, this.onFail, depth);
    }

    @NotNull
    public final FileTreeWalk onEnter(@NotNull Function1<? super File, Boolean> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.start, this.direction, function, this.onLeave, this.onFail, this.maxDepth);
    }

    @Override
    @NotNull
    public Iterator<File> iterator() {
        return new FileTreeWalkIterator();
    }

    public FileTreeWalk(@NotNull File start, @NotNull FileWalkDirection direction) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter((Object)direction, "direction");
        this(start, direction, null, null, null, 0, 32, null);
    }

    public /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 2) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        this(file, fileWalkDirection);
    }

    @NotNull
    public final FileTreeWalk onLeave(@NotNull Function1<? super File, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.start, this.direction, this.onEnter, function, this.onFail, this.maxDepth);
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2={"Lkotlin/io/FileTreeWalk$DirectoryState;", "Lkotlin/io/FileTreeWalk$WalkState;", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"})
    private static abstract class DirectoryState
    extends WalkState {
        public DirectoryState(@NotNull File rootDir) {
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
            super(rootDir);
            if (_Assertions.ENABLED) {
                boolean bl = rootDir.isDirectory();
                if (_Assertions.ENABLED) {
                    if (!bl) {
                        boolean bl2 = false;
                        String string = "rootDir must be verified to be directory beforehand.";
                        throw new AssertionError((Object)string);
                    }
                }
            }
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\n"}, d2={"Lkotlin/io/FileTreeWalk$WalkState;", "", "Ljava/io/File;", "root", "<init>", "(Ljava/io/File;)V", "step", "()Ljava/io/File;", "Ljava/io/File;", "getRoot", "kotlin-stdlib"})
    private static abstract class WalkState {
        @NotNull
        private final File root;

        @NotNull
        public final File getRoot() {
            return this.root;
        }

        public WalkState(@NotNull File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.root = root;
        }

        @Nullable
        public abstract File step();
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0012\u0013\u0014B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0082\u0010\u00a2\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0015"}, d2={"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "<init>", "(Lkotlin/io/FileTreeWalk;)V", "", "computeNext", "()V", "root", "Lkotlin/io/FileTreeWalk$DirectoryState;", "directoryState", "(Ljava/io/File;)Lkotlin/io/FileTreeWalk$DirectoryState;", "gotoNext", "()Ljava/io/File;", "Ljava/util/ArrayDeque;", "Lkotlin/io/FileTreeWalk$WalkState;", "state", "Ljava/util/ArrayDeque;", "BottomUpDirectoryState", "SingleFileState", "TopDownDirectoryState", "kotlin-stdlib"})
    private final class FileTreeWalkIterator
    extends AbstractIterator<File> {
        @NotNull
        private final ArrayDeque<WalkState> state = new ArrayDeque();

        private final File gotoNext() {
            while (true) {
                File file;
                block7: {
                    block6: {
                        WalkState topState;
                        if (this.state.peek() == null) {
                            return null;
                        }
                        file = topState.step();
                        if (file == null) {
                            this.state.pop();
                            continue;
                        }
                        if (Intrinsics.areEqual(file, topState.getRoot())) break block6;
                        if (!file.isDirectory()) break block6;
                        if (this.state.size() < FileTreeWalk.this.maxDepth) break block7;
                    }
                    return file;
                }
                this.state.push(this.directoryState(file));
            }
        }

        private final DirectoryState directoryState(File root) {
            DirectoryState directoryState;
            switch (WhenMappings.$EnumSwitchMapping$0[FileTreeWalk.this.direction.ordinal()]) {
                case 1: {
                    directoryState = new TopDownDirectoryState(root);
                    break;
                }
                case 2: {
                    directoryState = new BottomUpDirectoryState(root);
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return directoryState;
        }

        @Override
        protected void computeNext() {
            File nextFile = this.gotoNext();
            if (nextFile != null) {
                this.setNext(nextFile);
            } else {
                this.done();
            }
        }

        public FileTreeWalkIterator() {
            if (FileTreeWalk.this.start.isDirectory()) {
                this.state.push(this.directoryState(FileTreeWalk.this.start));
            } else if (FileTreeWalk.this.start.isFile()) {
                this.state.push(new SingleFileState(FileTreeWalk.this.start));
            } else {
                this.done();
            }
        }

        @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2={"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "Ljava/io/File;", "rootDir", "<init>", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "step", "()Ljava/io/File;", "", "fileIndex", "I", "", "fileList", "[Ljava/io/File;", "", "rootVisited", "Z", "kotlin-stdlib"})
        private final class TopDownDirectoryState
        extends DirectoryState {
            private boolean rootVisited;
            @Nullable
            private File[] fileList;
            private int fileIndex;

            public TopDownDirectoryState(File rootDir) {
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                super(rootDir);
            }

            @Override
            @Nullable
            public File step() {
                block11: {
                    block8: {
                        block9: {
                            block10: {
                                block7: {
                                    if (!this.rootVisited) {
                                        Function1 function1 = FileTreeWalk.this.onEnter;
                                        boolean bl = function1 != null ? !((Boolean)function1.invoke(this.getRoot())).booleanValue() : false;
                                        if (bl) {
                                            return null;
                                        }
                                        this.rootVisited = true;
                                        return this.getRoot();
                                    }
                                    if (this.fileList == null) break block7;
                                    Intrinsics.checkNotNull(this.fileList);
                                    if (this.fileIndex >= this.fileList.length) break block8;
                                }
                                if (this.fileList != null) break block9;
                                this.fileList = this.getRoot().listFiles();
                                if (this.fileList == null) {
                                    Function2 function2 = FileTreeWalk.this.onFail;
                                    if (function2 != null) {
                                        function2.invoke(this.getRoot(), new AccessDeniedException(this.getRoot(), null, "Cannot list files in a directory", 2, null));
                                    }
                                }
                                if (this.fileList == null) break block10;
                                Intrinsics.checkNotNull(this.fileList);
                                if (this.fileList.length != 0) break block9;
                            }
                            Function1 function1 = FileTreeWalk.this.onLeave;
                            if (function1 != null) {
                                function1.invoke(this.getRoot());
                            }
                            return null;
                        }
                        Intrinsics.checkNotNull(this.fileList);
                        int n = this.fileIndex;
                        this.fileIndex = n + 1;
                        return this.fileList[n];
                    }
                    Function1 function1 = FileTreeWalk.this.onLeave;
                    if (function1 == null) break block11;
                    function1.invoke(this.getRoot());
                }
                return null;
            }
        }

        @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState;", "Lkotlin/io/FileTreeWalk$WalkState;", "Ljava/io/File;", "rootFile", "<init>", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "step", "()Ljava/io/File;", "", "visited", "Z", "kotlin-stdlib"})
        private final class SingleFileState
        extends WalkState {
            private boolean visited;

            @Override
            @Nullable
            public File step() {
                if (this.visited) {
                    return null;
                }
                this.visited = true;
                return this.getRoot();
            }

            public SingleFileState(File rootFile) {
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                super(rootFile);
                if (_Assertions.ENABLED) {
                    boolean bl = rootFile.isFile();
                    if (_Assertions.ENABLED) {
                        if (!bl) {
                            boolean bl2 = false;
                            String string = "rootFile must be verified to be file beforehand.";
                            throw new AssertionError((Object)string);
                        }
                    }
                }
            }
        }

        @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\n\u00a8\u0006\u0012"}, d2={"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "Ljava/io/File;", "rootDir", "<init>", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "step", "()Ljava/io/File;", "", "failed", "Z", "", "fileIndex", "I", "", "fileList", "[Ljava/io/File;", "rootVisited", "kotlin-stdlib"})
        private final class BottomUpDirectoryState
        extends DirectoryState {
            private boolean failed;
            private int fileIndex;
            @Nullable
            private File[] fileList;
            private boolean rootVisited;

            @Override
            @Nullable
            public File step() {
                block7: {
                    if (!this.failed && this.fileList == null) {
                        Function1 function1 = FileTreeWalk.this.onEnter;
                        boolean bl = function1 != null ? !((Boolean)function1.invoke(this.getRoot())).booleanValue() : false;
                        if (bl) {
                            return null;
                        }
                        this.fileList = this.getRoot().listFiles();
                        if (this.fileList == null) {
                            Function2 function2 = FileTreeWalk.this.onFail;
                            if (function2 != null) {
                                function2.invoke(this.getRoot(), new AccessDeniedException(this.getRoot(), null, "Cannot list files in a directory", 2, null));
                            }
                            this.failed = true;
                        }
                    }
                    if (this.fileList != null) {
                        Intrinsics.checkNotNull(this.fileList);
                        if (this.fileIndex < this.fileList.length) {
                            Intrinsics.checkNotNull(this.fileList);
                            int n = this.fileIndex;
                            this.fileIndex = n + 1;
                            return this.fileList[n];
                        }
                    }
                    if (!this.rootVisited) {
                        this.rootVisited = true;
                        return this.getRoot();
                    }
                    Function1 function1 = FileTreeWalk.this.onLeave;
                    if (function1 == null) break block7;
                    function1.invoke(this.getRoot());
                }
                return null;
            }

            public BottomUpDirectoryState(File rootDir) {
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                super(rootDir);
            }
        }

        @Metadata(mv={1, 9, 0}, k=3, xi=48)
        public final class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] nArray = new int[FileWalkDirection.values().length];
                try {
                    nArray[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                }
                catch (NoSuchFieldError noSuchFieldError) {
                    // empty catch block
                }
                try {
                    nArray[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                }
                catch (NoSuchFieldError noSuchFieldError) {
                    // empty catch block
                }
                $EnumSwitchMapping$0 = nArray;
            }
        }
    }
}

