/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix.windows;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.posix.windows.CommonFileInformation;

public class WindowsByHandleFileInformation
extends CommonFileInformation {
    final Struct.Unsigned32 nFileIndexLow;
    final Struct.Unsigned32 nFileSizeLow;
    final Struct.Unsigned32 dwFileAttributes = new Struct.Unsigned32(this);
    final Struct.UnsignedLong chigh = new Struct.UnsignedLong(this);
    final Struct.UnsignedLong ulow;
    final Struct.Unsigned32 nFileSizeHigh;
    final Struct.UnsignedLong alow;
    final Struct.UnsignedLong uhigh;
    final Struct.UnsignedLong clow = new Struct.UnsignedLong(this);
    final Struct.Unsigned32 nNumberOfLinks;
    final Struct.Unsigned32 dwVolumeSerialNumber;
    final Struct.UnsignedLong ahigh = new Struct.UnsignedLong(this);
    final Struct.Unsigned32 nFileIndexHigh;

    @Override
    public int getFileAttributes() {
        return this.dwFileAttributes.intValue();
    }

    @Override
    public CommonFileInformation.HackyFileTime getLastAccessTime() {
        return new CommonFileInformation.HackyFileTime(this.ahigh, this.alow);
    }

    @Override
    public CommonFileInformation.HackyFileTime getCreationTime() {
        return new CommonFileInformation.HackyFileTime(this.chigh, this.clow);
    }

    public WindowsByHandleFileInformation(Runtime runtime) {
        super(runtime);
        this.alow = new Struct.UnsignedLong(this);
        this.uhigh = new Struct.UnsignedLong(this);
        this.ulow = new Struct.UnsignedLong(this);
        this.dwVolumeSerialNumber = new Struct.Unsigned32(this);
        this.nFileSizeHigh = new Struct.Unsigned32(this);
        this.nFileSizeLow = new Struct.Unsigned32(this);
        this.nNumberOfLinks = new Struct.Unsigned32(this);
        this.nFileIndexHigh = new Struct.Unsigned32(this);
        this.nFileIndexLow = new Struct.Unsigned32(this);
    }

    @Override
    public long getFileSizeHigh() {
        return this.nFileSizeHigh.intValue();
    }

    @Override
    public CommonFileInformation.HackyFileTime getLastWriteTime() {
        return new CommonFileInformation.HackyFileTime(this.uhigh, this.ulow);
    }

    @Override
    public long getFileSizeLow() {
        return this.nFileSizeLow.intValue();
    }
}

