package jnr.posix;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;

// $VF: Compiled from JavaFileStat.java
public class JavaFileStat extends AbstractJavaFileStat {
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
      if (this.posixAttrs == null) {
         return false;
      }

      Set<PosixFilePermission> permissions = this.posixAttrs.permissions();
      return permissions.contains(PosixFilePermission.OWNER_EXECUTE)
         || permissions.contains(PosixFilePermission.GROUP_EXECUTE)
         || permissions.contains(PosixFilePermission.OTHERS_EXECUTE);
   }

   @Override
   public long mtime() {
      return (int)(this.attrs.lastModifiedTime().toMillis() / 1000L);
   }

   private static short calculateSymlink(File file, short st_mode) throws IOException {
      if (file.getAbsoluteFile().getParentFile() == null) {
         return st_mode;
      }

      File absoluteParent = file.getAbsoluteFile().getParentFile();
      File canonicalParent = absoluteParent.getCanonicalFile();
      if (canonicalParent.getAbsolutePath().equals(absoluteParent.getAbsolutePath()) && !file.getAbsolutePath().equalsIgnoreCase(file.getCanonicalPath())) {
         return (short)(st_mode | 40960);
      }

      file = new JavaSecuredFile(canonicalParent.getAbsolutePath() + "/" + file.getName());
      if (!file.getAbsolutePath().equalsIgnoreCase(file.getCanonicalPath())) {
         st_mode = (short)(st_mode | 40960);
      }

      return st_mode;
   }

   private short calculateMode(File st_mode, short file) {
      if (file.canRead()) {
         st_mode = (short)(st_mode | 292);
      }

      if (file.canWrite()) {
         st_mode = (short)(st_mode | 146);
         st_mode = (short)(st_mode & -19);
      }

      if (file.isDirectory()) {
         st_mode = (short)(st_mode | 16384);
      } else if (file.isFile()) {
         st_mode = (short)(st_mode | 32768);
      }

      if (this.posixAttrs != null && this.posixAttrs.isSymbolicLink()) {
         st_mode = (short)(st_mode | 40960);
      } else {
         try {
            st_mode = calculateSymlink(file, st_mode);
         } catch (IOException var4) {
         }
      }

      return st_mode;
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
      } else {
         this.handler.unimplementedError("identical file detection");
         return false;
      }
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
      if (this.posixAttrs == null) {
         if (this.dosAttrs != null) {
            return !this.dosAttrs.isReadOnly();
         } else {
            int var2 = this.mode();
            if ((var2 & 128) != 0) {
               return true;
            } else {
               return (var2 & 16) != 0 ? true : (var2 & 2) != 0;
            }
         }
      } else {
         Set<PosixFilePermission> permissions = this.posixAttrs.permissions();
         return permissions.contains(PosixFilePermission.OWNER_WRITE)
            || permissions.contains(PosixFilePermission.GROUP_WRITE)
            || permissions.contains(PosixFilePermission.OTHERS_WRITE);
      }
   }

   @Override
   public boolean isReadable() {
      if (this.posixAttrs == null) {
         int var2 = this.mode();
         if ((var2 & 256) != 0) {
            return true;
         } else {
            return (var2 & 32) != 0 ? true : (var2 & 4) != 0;
         }
      } else {
         Set<PosixFilePermission> permissions = this.posixAttrs.permissions();
         return permissions.contains(PosixFilePermission.OWNER_READ)
            || permissions.contains(PosixFilePermission.GROUP_READ)
            || permissions.contains(PosixFilePermission.OTHERS_READ);
      }
   }

   @Override
   public long atime() {
      return (int)(this.attrs.lastAccessTime().toMillis() / 1000L);
   }

   public void setup(String filePath) {
      File file = new JavaSecuredFile(filePath);
      Path path = file.toPath();

      try {
         try {
            this.posixAttrs = Files.readAttributes(path, PosixFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            this.attrs = this.posixAttrs;
         } catch (UnsupportedOperationException var7) {
            try {
               this.dosAttrs = Files.readAttributes(path, DosFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               this.attrs = this.dosAttrs;
            } catch (UnsupportedOperationException var6) {
               this.attrs = Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            }
         }
      } catch (IOException var8) {
         this.attrs = new JavaFileStat.PreNIO2FileAttributes(file);
      }

      this.st_mode = this.calculateMode(file, (short)0);
   }

   @Override
   public int mode() {
      return this.st_mode & 65535;
   }

   public JavaFileStat(POSIX handler, POSIXHandler posix) {
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
      return this.posixAttrs != null ? this.posixAttrs.isSymbolicLink() : (this.mode() & 40960) == 40960;
   }

   // $VF: Compiled from JavaFileStat.java
   private class PreNIO2FileAttributes implements BasicFileAttributes {
      final int st_mtime;
      final boolean directory;
      final long st_size;
      final boolean regularFile;
      final int st_ctime;

      @Override
      public boolean isOther() {
         return !this.isRegularFile() && !this.isDirectory() && !this.isSymbolicLink();
      }

      @Override
      public boolean isSymbolicLink() {
         return (JavaFileStat.this.st_mode & 'ꀀ') != 0;
      }

      @Override
      public java.nio.file.attribute.FileTime lastModifiedTime() {
         return java.nio.file.attribute.FileTime.fromMillis(this.st_mtime);
      }

      @Override
      public boolean isDirectory() {
         return (JavaFileStat.this.st_mode & 16384) != 0;
      }

      PreNIO2FileAttributes(File file) {
         this.st_size = file.length();
         this.st_mtime = (int)(file.lastModified() / 1000L);
         if (file.getParentFile() != null) {
            this.st_ctime = (int)(file.getParentFile().lastModified() / 1000L);
         } else {
            this.st_ctime = this.st_mtime;
         }

         this.regularFile = file.isFile();
         this.directory = file.isDirectory();
      }

      @Override
      public java.nio.file.attribute.FileTime creationTime() {
         return java.nio.file.attribute.FileTime.fromMillis(this.st_mtime);
      }

      @Override
      public boolean isRegularFile() {
         return (JavaFileStat.this.st_mode & '耀') != 0;
      }

      @Override
      public long size() {
         return this.st_size;
      }

      @Override
      public java.nio.file.attribute.FileTime lastAccessTime() {
         return this.lastModifiedTime();
      }

      @Override
      public Object fileKey() {
         return null;
      }
   }
}
