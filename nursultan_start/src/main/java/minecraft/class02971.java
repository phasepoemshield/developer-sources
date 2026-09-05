/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import org.jspecify.annotations.Nullable;

abstract class class02971
implements BasicFileAttributes {
    private static final FileTime N = FileTime.fromMillis(0L);

    class02971() {
    }

    @Override
    public long size() {
        return 0L;
    }

    @Override
    public FileTime lastAccessTime() {
        return N;
    }

    @Override
    public FileTime creationTime() {
        return N;
    }

    @Override
    public boolean isSymbolicLink() {
        return false;
    }

    @Override
    public boolean isOther() {
        return false;
    }

    @Override
    public FileTime lastModifiedTime() {
        return N;
    }

    @Override
    public @Nullable Object fileKey() {
        return null;
    }
}

