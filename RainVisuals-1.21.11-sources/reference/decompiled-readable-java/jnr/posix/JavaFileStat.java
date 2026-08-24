/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;
import jnr.posix.AbstractJavaFileStat;
import jnr.posix.FileStat;
import jnr.posix.JavaSecuredFile;
import jnr.posix.POSIX;
import jnr.posix.POSIXHandler;

public class JavaFileStat
extends AbstractJavaFileStat {
    short st_mode;
    DosFileAttributes dosAttrs;
    BasicFileAttributes attrs;
    PosixFileAttributes posixAttrs;

    @Override
    public boolean isExecutableReal() {
        return this.isExecutable();
    }

    @Override
    public boolean isExecutable() {
        if (this.posixAttrs != null) {
            Set<PosixFilePermission> permissions = this.posixAttrs.permissions();
            return permissions.contains((Object)PosixFilePermission.OWNER_EXECUTE) || permissions.contains((Object)PosixFilePermission.GROUP_EXECUTE) || permissions.contains((Object)PosixFilePermission.OTHERS_EXECUTE);
        }
        return false;
    }

    @Override
    public long mtime() {
        return (int)(this.attrs.lastModifiedTime().toMillis() / 1000L);
    }

    private static short calculateSymlink(File file, short st_mode) throws IOException {
        short s;
        if (file.getAbsoluteFile().getParentFile() == null) {
            return st_mode;
        }
        File absoluteParent = file.getAbsoluteFile().getParentFile();
        File canonicalParent = absoluteParent.getCanonicalFile();
        if (canonicalParent.getAbsolutePath().equals(absoluteParent.getAbsolutePath()) && !file.getAbsolutePath().equalsIgnoreCase(file.getCanonicalPath())) {
            st_mode = (short)(st_mode | 0xA000);
            return st_mode;
        }
        file = new JavaSecuredFile(canonicalParent.getAbsolutePath() + "/" + file.getName());
        if (!file.getAbsolutePath().equalsIgnoreCase(file.getCanonicalPath())) {
            s = (short)(st_mode | 0xA000);
        }
        return s;
    }

    private short calculateMode(File file, short st_mode) {
        short s;
        if (file.canRead()) {
            st_mode = (short)(st_mode | 0x124);
        }
        if (file.canWrite()) {
            st_mode = (short)(st_mode | 0x92);
            st_mode = (short)(st_mode & 0xFFFFFFED);
        }
        if (file.isDirectory()) {
            st_mode = (short)(st_mode | 0x4000);
        } else if (file.isFile()) {
            st_mode = (short)(st_mode | 0x8000);
        }
        if (this.posixAttrs != null && this.posixAttrs.isSymbolicLink()) {
            st_mode = (short)(st_mode | 0xA000);
        } else {
            try {
                s = JavaFileStat.calculateSymlink(file, st_mode);
            }
            catch (IOException iOException) {
            }
        }
        return s;
    }

    @Override
    public boolean isFile() {
        return this.attrs.isRegularFile();
    }

    @Override
    public boolean isOwned() {
        return this.posix.geteuid() == this.uid();
    }

    @Override
    public boolean isIdentical(FileStat other) {
        Object key = this.attrs.fileKey();
        if (key != null && other instanceof JavaFileStat) {
            JavaFileStat otherStat = (JavaFileStat)other;
            return key.equals(otherStat.attrs.fileKey());
        }
        this.handler.unimplementedError("identical file detection");
        return false;
    }

    @Override
    public boolean isEmpty() {
        return this.attrs.size() == 0L;
    }

    @Override
    public boolean isGroupOwned() {
        return this.groupMember(this.gid());
    }

    @Override
    public long st_size() {
        return this.attrs.size();
    }

    @Override
    public boolean isWritable() {
        if (this.posixAttrs != null) {
            Set<PosixFilePermission> permissions = this.posixAttrs.permissions();
            return permissions.contains((Object)PosixFilePermission.OWNER_WRITE) || permissions.contains((Object)PosixFilePermission.GROUP_WRITE) || permissions.contains((Object)PosixFilePermission.OTHERS_WRITE);
        }
        if (this.dosAttrs != null) {
            return !this.dosAttrs.isReadOnly();
        }
        int mode = this.mode();
        if ((mode & 0x80) != 0) {
            return true;
        }
        if ((mode & 0x10) != 0) {
            return true;
        }
        if ((mode & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isReadable() {
        if (this.posixAttrs != null) {
            Set<PosixFilePermission> permissions = this.posixAttrs.permissions();
            return permissions.contains((Object)PosixFilePermission.OWNER_READ) || permissions.contains((Object)PosixFilePermission.GROUP_READ) || permissions.contains((Object)PosixFilePermission.OTHERS_READ);
        }
        int mode = this.mode();
        if ((mode & 0x100) != 0) {
            return true;
        }
        if ((mode & 0x20) != 0) {
            return true;
        }
        if ((mode & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public long atime() {
        return (int)(this.attrs.lastAccessTime().toMillis() / 1000L);
    }

    /*
     * WARNING - void declaration
     */
    public void setup(String filePath) {
        void var2_2;
        JavaSecuredFile file = new JavaSecuredFile(filePath);
        Path path = file.toPath();
        try {
            try {
                LinkOption[] linkOptionArray = new LinkOption[1];
                linkOptionArray[0] = LinkOption.NOFOLLOW_LINKS;
                this.posixAttrs = Files.readAttributes(path, PosixFileAttributes.class, linkOptionArray);
                this.attrs = this.posixAttrs;
            }
            catch (UnsupportedOperationException uoe) {
                try {
                    LinkOption[] linkOptionArray = new LinkOption[1];
                    linkOptionArray[0] = LinkOption.NOFOLLOW_LINKS;
                    this.dosAttrs = Files.readAttributes(path, DosFileAttributes.class, linkOptionArray);
                    this.attrs = this.dosAttrs;
                }
                catch (UnsupportedOperationException uoe2) {
                    LinkOption[] linkOptionArray = new LinkOption[1];
                    linkOptionArray[0] = LinkOption.NOFOLLOW_LINKS;
                    this.attrs = Files.readAttributes(path, BasicFileAttributes.class, linkOptionArray);
                }
            }
        }
        catch (IOException ioe) {
            this.attrs = new PreNIO2FileAttributes(file);
        }
        this.st_mode = this.calculateMode((File)var2_2, (short)0);
    }

    @Override
    public int mode() {
        return this.st_mode & 0xFFFF;
    }

    public JavaFileStat(POSIX posix, POSIXHandler handler) {
        super(posix, handler);
    }

    @Override
    public long ctime() {
        return (int)(this.attrs.creationTime().toMillis() / 1000L);
    }

    @Override
    public boolean isDirectory() {
        return this.attrs.isDirectory();
    }

    @Override
    public boolean isWritableReal() {
        return this.isWritable();
    }

    @Override
    public boolean isROwned() {
        return this.posix.getuid() == this.uid();
    }

    @Override
    public boolean isReadableReal() {
        return this.isReadable();
    }

    @Override
    public boolean isSymlink() {
        if (this.posixAttrs != null) {
            return this.posixAttrs.isSymbolicLink();
        }
        return (this.mode() & 0xA000) == 40960;
    }

    private class PreNIO2FileAttributes
    implements BasicFileAttributes {
        final int st_mtime;
        final boolean directory;
        final long st_size;
        final boolean regularFile;
        final int st_ctime;

        @Override
        public boolean isOther() {
            return !(this.isRegularFile() || this.isDirectory() || this.isSymbolicLink());
        }

        @Override
        public boolean isSymbolicLink() {
            return (JavaFileStat.this.st_mode & 0xA000) != 0;
        }

        @Override
        public FileTime lastModifiedTime() {
            return FileTime.fromMillis(this.st_mtime);
        }

        @Override
        public boolean isDirectory() {
            return (JavaFileStat.this.st_mode & 0x4000) != 0;
        }

        PreNIO2FileAttributes(File file) {
            this.st_size = file.length();
            this.st_mtime = (int)(file.lastModified() / 1000L);
            this.st_ctime = file.getParentFile() != null ? (int)(file.getParentFile().lastModified() / 1000L) : this.st_mtime;
            this.regularFile = file.isFile();
            this.directory = file.isDirectory();
        }

        @Override
        public FileTime creationTime() {
            return FileTime.fromMillis(this.st_mtime);
        }

        @Override
        public boolean isRegularFile() {
            return (JavaFileStat.this.st_mode & 0x8000) != 0;
        }

        @Override
        public long size() {
            return this.st_size;
        }

        @Override
        public FileTime lastAccessTime() {
            return this.lastModifiedTime();
        }

        @Override
        public Object fileKey() {
            return null;
        }
    }
}

