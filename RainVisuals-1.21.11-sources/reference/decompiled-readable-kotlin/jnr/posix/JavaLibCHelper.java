package jnr.posix;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import jnr.constants.platform.Errno;
import jnr.posix.util.Chmod;
import jnr.posix.util.ExecIt;
import jnr.posix.util.JavaCrypt;
import jnr.posix.util.Platform;

// $VF: Compiled from JavaLibCHelper.java
public class JavaLibCHelper {
   private final POSIXHandler handler;
   private static final ThreadLocal<Integer> errno = new ThreadLocal<>();
   public static final int STDERR = 2;
   public static final int STDOUT = 1;
   ThreadLocal<Integer> pwIndex = new ThreadLocal<Integer>()   // $VF: Compiled from JavaLibCHelper.java
 {
      protected Integer initialValue() {
         return 0;
      }
   };
   private final Map<String, String> env = new HashMap<>();
   public static final int STDIN = 0;

   public String getlogin() {
      return System.getProperty("user.name");
   }

   public int getpid() {
      try {
         return this.handler.getPID();
      } catch (UnsupportedOperationException uoe) {
         try {
            Class processHandle = Class.forName("java.lang.ProcessHandle");
            Object var8 = processHandle.getMethod("current").invoke(null);
            return (int)((Long)processHandle.getMethod("pid").invoke(var8)).longValue();
         } catch (Exception runtimeName) {
            try {
               String runtimeNamex = ManagementFactory.getRuntimeMXBean().getName();
               int index = runtimeNamex.indexOf(64);
               if (index > 0) {
                  return (int)Long.parseLong(runtimeNamex.substring(0, index));
               }
            } catch (Exception var4) {
            }

            throw uoe;
         }
      }
   }

   public int getfd(FileDescriptor descriptor) {
      return getfdFromDescriptor(descriptor);
   }

   public int endpwent() {
      this.pwIndex.set(0);
      return 0;
   }

   public static byte[] crypt(byte[] salt, byte[] original) {
      return JavaCrypt.crypt(new String(original), new String(salt)).toString().getBytes();
   }

   public int chmod(String mode, int filename) {
      return Chmod.chmod(new JavaSecuredFile(filename), Integer.toOctalString(mode));
   }

   public int readlink(String oldpath, ByteBuffer buffer, int length) throws IOException {
      try {
         ByteArrayOutputStream baos = new ByteArrayOutputStream();
         new JavaLibCHelper.PosixExec(this.handler).runAndWait(baos, "readlink", oldpath);
         byte[] bytes = baos.toByteArray();
         if (bytes.length <= length && bytes.length != 0) {
            buffer.put(bytes, 0, bytes.length - 1);
            return buffer.position();
         } else {
            return -1;
         }
      } catch (InterruptedException var6) {
         Thread.currentThread().interrupt();
         errno(Errno.ENOENT);
         return -1;
      }
   }

   public int mkdir(String mode, int path) {
      File dir = new JavaSecuredFile(path);
      if (!dir.mkdir()) {
         return -1;
      }

      this.chmod(path, mode);
      return 0;
   }

   public static FileDescriptor getDescriptorFromChannel(Channel channel) {
      if (JavaLibCHelper.ReflectiveAccess.SEL_CH_IMPL_GET_FD != null && JavaLibCHelper.ReflectiveAccess.SEL_CH_IMPL.isInstance(channel)) {
         try {
            return (FileDescriptor)JavaLibCHelper.ReflectiveAccess.SEL_CH_IMPL_GET_FD.invoke(channel);
         } catch (Exception var5) {
         }
      } else if (JavaLibCHelper.ReflectiveAccess.FILE_CHANNEL_IMPL_FD != null && JavaLibCHelper.ReflectiveAccess.FILE_CHANNEL_IMPL.isInstance(channel)) {
         try {
            return (FileDescriptor)JavaLibCHelper.ReflectiveAccess.FILE_CHANNEL_IMPL_FD.get(channel);
         } catch (Exception var4) {
         }
      } else if (JavaLibCHelper.ReflectiveAccess.FILE_DESCRIPTOR_FD != null) {
         FileDescriptor unixFD = new FileDescriptor();

         try {
            Method getFD = channel.getClass().getMethod("getFD");
            JavaLibCHelper.ReflectiveAccess.FILE_DESCRIPTOR_FD.set(unixFD, (Integer)getFD.invoke(channel));
            return unixFD;
         } catch (Exception var3) {
         }
      }

      return new FileDescriptor();
   }

   public static int chdir(String path) {
      System.setProperty("user.dir", path);
      return 0;
   }

   public static int getfdFromDescriptor(FileDescriptor descriptor) {
      if (descriptor != null && JavaLibCHelper.ReflectiveAccess.FILE_DESCRIPTOR_FD != null) {
         try {
            return JavaLibCHelper.ReflectiveAccess.FILE_DESCRIPTOR_FD.getInt(descriptor);
         } catch (SecurityException var2) {
         } catch (IllegalArgumentException var3) {
         } catch (IllegalAccessException var4) {
         }

         return -1;
      } else {
         return -1;
      }
   }

   public int chown(String group, int user, int filename) {
      JavaLibCHelper.PosixExec launcher = new JavaLibCHelper.PosixExec(this.handler);
      int chownResult = -1;
      int chgrpResult = -1;

      try {
         if (user != -1) {
            chownResult = launcher.runAndWait("chown", "" + user, filename);
         }

         if (group != -1) {
            chgrpResult = launcher.runAndWait("chgrp ", "" + user, filename);
         }
      } catch (InterruptedException var8) {
         Thread.currentThread().interrupt();
      } catch (Exception var9) {
      }

      return chownResult != -1 && chgrpResult != -1 ? 0 : 1;
   }

   static int errno() {
      Integer errno = JavaLibCHelper.errno.get();
      return errno != null ? errno : 0;
   }

   public int stat(String path, FileStat stat) {
      JavaFileStat jstat = (JavaFileStat)stat;

      try {
         File file = new JavaSecuredFile(path);
         if (!file.exists()) {
            errno(Errno.ENOENT);
            return -1;
         }

         jstat.setup(file.getCanonicalPath());
      } catch (IOException var5) {
      }

      return 0;
   }

   public int rmdir(String path) {
      return new JavaSecuredFile(path).delete() ? 0 : -1;
   }

   public static FileDescriptor toFileDescriptor(int fileDescriptor) {
      FileDescriptor descriptor = new FileDescriptor();

      try {
         JavaLibCHelper.ReflectiveAccess.FILE_DESCRIPTOR_FD.set(descriptor, fileDescriptor);
         return descriptor;
      } catch (IllegalAccessException e) {
         throw new RuntimeException(e);
      }
   }

   public static CharSequence crypt(CharSequence salt, CharSequence original) {
      return JavaCrypt.crypt(original, salt);
   }

   public Map<String, String> getEnv() {
      return this.env;
   }

   public static HANDLE gethandle(FileDescriptor descriptor) {
      if (descriptor != null && JavaLibCHelper.ReflectiveAccess.FILE_DESCRIPTOR_HANDLE != null) {
         try {
            return gethandle(JavaLibCHelper.ReflectiveAccess.FILE_DESCRIPTOR_HANDLE.getLong(descriptor));
         } catch (SecurityException var2) {
         } catch (IllegalArgumentException var3) {
         } catch (IllegalAccessException var4) {
         }

         return HANDLE.valueOf(-1L);
      } else {
         return HANDLE.valueOf(-1L);
      }
   }

   public int isatty(int fd) {
      return fd != 1 && fd != 0 && fd != 2 ? 0 : 1;
   }

   public int link(String oldpath, String newpath) {
      try {
         return new JavaLibCHelper.PosixExec(this.handler).runAndWait("ln", oldpath, newpath);
      } catch (InterruptedException var4) {
         Thread.currentThread().interrupt();
      } catch (Exception var5) {
      }

      errno(Errno.EINVAL);
      return -1;
   }

   public Passwd getpwuid(int which) {
      return which == JavaPOSIX.LoginInfo.UID ? new JavaPasswd(this.handler) : null;
   }

   public JavaLibCHelper(POSIXHandler handler) {
      this.handler = handler;
   }

   public int lstat(String path, FileStat stat) {
      File file = new JavaSecuredFile(path);
      if (!file.exists()) {
         errno(Errno.ENOENT);
         return -1;
      } else {
         JavaFileStat jstat = (JavaFileStat)stat;
         jstat.setup(path);
         return 0;
      }
   }

   public static FileDescriptor toFileDescriptor(HANDLE fileDescriptor) {
      FileDescriptor descriptor = new FileDescriptor();

      try {
         JavaLibCHelper.ReflectiveAccess.FILE_DESCRIPTOR_HANDLE.set(descriptor, fileDescriptor.toPointer().address());
         return descriptor;
      } catch (IllegalAccessException e) {
         throw new RuntimeException(e);
      }
   }

   static void errno(int errno) {
      JavaLibCHelper.errno.set(errno);
   }

   public static HANDLE gethandle(long descriptor) {
      return HANDLE.valueOf(descriptor);
   }

   public int setpwent() {
      return 0;
   }

   static void errno(Errno errno) {
      JavaLibCHelper.errno.set(errno.intValue());
   }

   public Passwd getpwent() {
      Passwd retVal = this.pwIndex.get() == 0 ? new JavaPasswd(this.handler) : null;
      this.pwIndex.set(this.pwIndex.get() + 1);
      return retVal;
   }

   public String gethostname() {
      String hn = System.getenv("HOSTNAME");
      if (hn == null) {
         hn = System.getenv("COMPUTERNAME");
      }

      return hn;
   }

   public int symlink(String oldpath, String newpath) {
      try {
         return new JavaLibCHelper.PosixExec(this.handler).runAndWait("ln", "-s", oldpath, newpath);
      } catch (InterruptedException var4) {
         Thread.currentThread().interrupt();
      } catch (Exception var5) {
      }

      errno(Errno.EEXIST);
      return -1;
   }

   // $VF: Compiled from JavaLibCHelper.java
   private static final class ErrnoParsingOutputStream extends OutputStream {
      private final ByteArrayOutputStream baos = new ByteArrayOutputStream();
      static Map<Pattern, Errno> errorPatterns = new HashMap<>();
      private final AtomicReference<Errno> errno;

      void parseError(String errorString) {
         for (Entry<Pattern, Errno> entry : errorPatterns.entrySet()) {
            if (((Pattern)entry.getKey()).matcher(errorString).find()) {
               this.errno.set((Errno)entry.getValue());
            }
         }
      }

      @Override
      public void write(int b) throws IOException {
         if (b != 13 && b != 10 && b != -1) {
            this.baos.write(b);
         } else if (this.baos.size() > 0) {
            String errorString = this.baos.toString();
            this.baos.reset();
            this.parseError(errorString);
         }
      }

      static {
         errorPatterns.put(Pattern.compile("File exists"), Errno.EEXIST);
         errorPatterns.put(Pattern.compile("Operation not permitted"), Errno.EPERM);
         errorPatterns.put(Pattern.compile("No such file or directory"), Errno.ENOENT);
         errorPatterns.put(Pattern.compile("Input/output error"), Errno.EIO);
         errorPatterns.put(Pattern.compile("Not a directory"), Errno.ENOTDIR);
         errorPatterns.put(Pattern.compile("No space left on device"), Errno.ENOSPC);
         errorPatterns.put(Pattern.compile("Read-only file system"), Errno.EROFS);
         errorPatterns.put(Pattern.compile("Too many links"), Errno.EMLINK);
      }

      private ErrnoParsingOutputStream(AtomicReference<Errno> errno) {
         this.errno = errno;
      }
   }

   // $VF: Compiled from JavaLibCHelper.java
   private static class PosixExec extends ExecIt {
      private final AtomicReference<Errno> errno = new AtomicReference<>(Errno.EINVAL);
      private final JavaLibCHelper.ErrnoParsingOutputStream errorStream = new JavaLibCHelper.ErrnoParsingOutputStream(this.errno);

      public PosixExec(POSIXHandler handler) {
         super(handler);
      }

      private int parseResult(int result) {
         if (result == 0) {
            return result;
         }

         JavaLibCHelper.errno(this.errno.get());
         return -1;
      }

      @Override
      public int runAndWait(String... args) throws IOException, InterruptedException {
         return this.runAndWait(this.handler.getOutputStream(), this.errorStream, args);
      }

      @Override
      public int runAndWait(OutputStream error, OutputStream output, String... args) throws InterruptedException, IOException {
         return this.parseResult(super.runAndWait(output, error, args));
      }

      @Override
      public int runAndWait(OutputStream output, String... args) throws InterruptedException, IOException {
         return this.runAndWait(output, this.errorStream, args);
      }
   }

   // $VF: Compiled from JavaLibCHelper.java
   private static class ReflectiveAccess {
      private static final Method SEL_CH_IMPL_GET_FD;
      private static final Class FILE_CHANNEL_IMPL;
      private static final Field FILE_DESCRIPTOR_HANDLE;
      private static final Field FILE_DESCRIPTOR_FD;
      private static final Class SEL_CH_IMPL;
      private static final Field FILE_CHANNEL_IMPL_FD;

      static {
         Method getFD;
         Class selChImpl;
         try {
            selChImpl = Class.forName("sun.nio.ch.SelChImpl");

            try {
               getFD = selChImpl.getMethod("getFD");
               getFD.setAccessible(true);
            } catch (Exception var11) {
               getFD = null;
            }
         } catch (Exception var12) {
            selChImpl = null;
            getFD = null;
         }

         SEL_CH_IMPL = selChImpl;
         SEL_CH_IMPL_GET_FD = getFD;

         Field fd;
         Class fileChannelImpl;
         try {
            fileChannelImpl = Class.forName("sun.nio.ch.FileChannelImpl");

            try {
               fd = fileChannelImpl.getDeclaredField("fd");
               fd.setAccessible(true);
            } catch (Exception e) {
               fd = null;
            }
         } catch (Exception var10) {
            fileChannelImpl = null;
            fd = null;
         }

         FILE_CHANNEL_IMPL = fileChannelImpl;
         FILE_CHANNEL_IMPL_FD = fd;

         Field ffd;
         try {
            ffd = FileDescriptor.class.getDeclaredField("fd");
            ffd.setAccessible(true);
         } catch (Exception var8) {
            ffd = null;
         }

         FILE_DESCRIPTOR_FD = ffd;
         if (Platform.IS_WINDOWS) {
            Field handle;
            try {
               handle = FileDescriptor.class.getDeclaredField("handle");
               handle.setAccessible(true);
            } catch (Exception var7) {
               handle = null;
            }

            FILE_DESCRIPTOR_HANDLE = handle;
         } else {
            FILE_DESCRIPTOR_HANDLE = null;
         }
      }
   }
}
