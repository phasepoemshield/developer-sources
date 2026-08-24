/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix.windows;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.posix.windows.CommonFileInformation;

public class WindowsFileInformation
extends CommonFileInformation {
    final Struct.UnsignedLong ulow;
    final Struct.UnsignedLong uhigh;
    final Struct.UnsignedLong ahigh;
    final Struct.UnsignedLong dwFileAttributes = new Struct.UnsignedLong(this);
    final Struct.UnsignedLong nFileSizeHigh;
    final Struct.UnsignedLong nFileSizeLow;
    final Struct.UnsignedLong chigh;
    final Struct.UnsignedLong clow = new Struct.UnsignedLong(this);
    final Struct.UnsignedLong alow;

    @Override
    public long getFileSizeLow() {
        return this.nFileSizeLow.longValue();
    }

    public WindowsFileInformation(Runtime runtime) {
        super(runtime);
        this.chigh = new Struct.UnsignedLong(this);
        this.alow = new Struct.UnsignedLong(this);
        this.ahigh = new Struct.UnsignedLong(this);
        this.ulow = new Struct.UnsignedLong(this);
        this.uhigh = new Struct.UnsignedLong(this);
        this.nFileSizeHigh = new Struct.UnsignedLong(this);
        this.nFileSizeLow = new Struct.UnsignedLong(this);
    }

    @Override
    public CommonFileInformation.HackyFileTime getLastWriteTime() {
        return new CommonFileInformation.HackyFileTime(this, this.uhigh, this.ulow);
    }

    @Override
    public CommonFileInformation.HackyFileTime getCreationTime() {
        return new CommonFileInformation.HackyFileTime(this, this.chigh, this.clow);
    }

    @Override
    public long getFileSizeHigh() {
        return this.nFileSizeHigh.longValue();
    }

    @Override
    public CommonFileInformation.HackyFileTime getLastAccessTime() {
        return new CommonFileInformation.HackyFileTime(this, this.ahigh, this.alow);
    }

    @Override
    public int getFileAttributes() {
        return this.dwFileAttributes.intValue();
    }
}

