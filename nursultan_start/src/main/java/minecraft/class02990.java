/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import minecraft.class02973;

class class02990
implements BasicFileAttributeView {
    final /* synthetic */ class02973 N;

    class02990(class02973 class029732) {
        this.N = class029732;
    }

    @Override
    public String name() {
        return "basic";
    }

    @Override
    public void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        throw new ReadOnlyFileSystemException();
    }

    @Override
    public BasicFileAttributes readAttributes() throws IOException {
        return this.N.U();
    }
}

