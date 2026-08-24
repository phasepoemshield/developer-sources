package jnr.posix;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URI;

// $VF: Compiled from JavaSecuredFile.java
public class JavaSecuredFile extends File {
   @Override
   public File getAbsoluteFile() {
      String path = this.getAbsolutePath();
      return path == null ? null : new JavaSecuredFile(path);
   }

   @Override
   public boolean renameTo(File dest) {
      try {
         return super.renameTo(dest);
      } catch (SecurityException e) {
         return false;
      }
   }

   public JavaSecuredFile(URI uri) {
      super(uri);
   }

   public JavaSecuredFile(String pathname) {
      super(pathname);
   }

   @Override
   public boolean createNewFile() throws IOException {
      try {
         return super.createNewFile();
      } catch (SecurityException e) {
         throw new IOException(e);
      }
   }

   @Override
   public boolean setLastModified(long time) {
      try {
         return super.setLastModified(time);
      } catch (SecurityException e) {
         return false;
      }
   }

   @Override
   public File[] listFiles() {
      try {
         return super.listFiles();
      } catch (SecurityException e) {
         return null;
      }
   }

   @Override
   public boolean isFile() {
      try {
         return super.isFile();
      } catch (SecurityException e) {
         return false;
      }
   }

   @Override
   public boolean isHidden() {
      try {
         return super.isHidden();
      } catch (SecurityException e) {
         return false;
      }
   }

   @Override
   public boolean exists() {
      try {
         return super.exists();
      } catch (SecurityException e) {
         return false;
      }
   }

   @Override
   public File getCanonicalFile() throws IOException {
      String path = this.getCanonicalPath();
      return path == null ? null : new JavaSecuredFile(path);
   }

   @Override
   public long lastModified() {
      try {
         return super.lastModified();
      } catch (SecurityException e) {
         return 0L;
      }
   }

   @Override
   public boolean delete() {
      try {
         return super.delete();
      } catch (SecurityException e) {
         return false;
      }
   }

   @Override
   public boolean mkdir() {
      try {
         return super.mkdir();
      } catch (SecurityException e) {
         return false;
      }
   }

   @Override
   public String getCanonicalPath() throws IOException {
      try {
         return super.getCanonicalPath();
      } catch (SecurityException e) {
         throw new IOException(e);
      }
   }

   @Override
   public boolean isDirectory() {
      try {
         return super.isDirectory();
      } catch (SecurityException e) {
         return false;
      }
   }

   @Override
   public String[] list() {
      try {
         return super.list();
      } catch (SecurityException e) {
         return null;
      }
   }

   public JavaSecuredFile(String child, String parent) {
      super(parent, child);
   }

   @Override
   public File[] listFiles(FileFilter filter) {
      try {
         return super.listFiles(filter);
      } catch (SecurityException e) {
         return null;
      }
   }

   @Override
   public boolean canRead() {
      try {
         return super.canRead();
      } catch (SecurityException e) {
         return false;
      }
   }

   @Override
   public boolean mkdirs() {
      try {
         return super.mkdirs();
      } catch (SecurityException e) {
         return false;
      }
   }

   @Override
   public String[] list(FilenameFilter filter) {
      try {
         return super.list(filter);
      } catch (SecurityException e) {
         return null;
      }
   }

   public JavaSecuredFile(File parent, String child) {
      super(parent, child);
   }

   @Override
   public File getParentFile() {
      String path = this.getParent();
      return path == null ? null : new JavaSecuredFile(path);
   }

   @Override
   public boolean setReadOnly() {
      try {
         return super.setReadOnly();
      } catch (SecurityException e) {
         return false;
      }
   }

   @Override
   public long length() {
      try {
         return super.length();
      } catch (SecurityException e) {
         return 0L;
      }
   }

   @Override
   public boolean canWrite() {
      try {
         return super.canWrite();
      } catch (SecurityException e) {
         return false;
      }
   }
}
