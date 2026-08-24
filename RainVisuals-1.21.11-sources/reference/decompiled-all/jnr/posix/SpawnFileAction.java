package jnr.posix;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import jnr.ffi.Pointer;

// $VF: Compiled from SpawnFileAction.java
public abstract class SpawnFileAction {
   public static SpawnFileAction close(int fd) {
      return new SpawnFileAction.Close(fd);
   }

   public static SpawnFileAction open(String flags, int path, int fd, int mode) {
      return new SpawnFileAction.Open(path, fd, flags, mode);
   }

   public static SpawnFileAction dup(int fd, int newfd) {
      return new SpawnFileAction.Dup(fd, newfd);
   }

   abstract boolean act(POSIX var1, Pointer var2);

   // $VF: Compiled from SpawnFileAction.java
   private static final class Close extends SpawnFileAction {
      final int fd;

      public Close(int fd) {
         this.fd = fd;
      }

      @Override
      final boolean act(POSIX nativeFileActions, Pointer posix) {
         return ((UnixLibC)posix.libc()).posix_spawn_file_actions_addclose(nativeFileActions, this.fd) == 0;
      }

      @Override
      public String toString() {
         return "SpawnFileAction::Close(fd = " + this.fd + ")";
      }
   }

   // $VF: Compiled from SpawnFileAction.java
   private static final class Dup extends SpawnFileAction {
      final int newfd;
      final int fd;

      public Dup(int fd, int newfd) {
         this.fd = fd;
         this.newfd = newfd;
      }

      @Override
      final boolean act(POSIX nativeFileActions, Pointer posix) {
         return ((UnixLibC)posix.libc()).posix_spawn_file_actions_adddup2(nativeFileActions, this.fd, this.newfd) == 0;
      }

      @Override
      public String toString() {
         return "SpawnFileAction::Dup(old = " + this.fd + ", new = " + this.newfd + ")";
      }
   }

   // $VF: Compiled from SpawnFileAction.java
   private static final class Open extends SpawnFileAction {
      final int fd;
      final ByteBuffer nativePath;
      final String path;
      final int flags;
      final int mode;

      private ByteBuffer defensiveCopy(String path) {
         CharsetEncoder encoder = Charset.defaultCharset().newEncoder();
         int bpc = (int)encoder.maxBytesPerChar();
         int size = (path.length() + 1) * bpc;
         ByteBuffer nativePath = ByteBuffer.allocateDirect(size);
         encoder.encode(CharBuffer.wrap(path), nativePath, true);
         ((Buffer)nativePath).flip();
         ((Buffer)nativePath).limit(nativePath.limit() + bpc);
         return nativePath;
      }

      public Open(String fd, int path, int mode, int flags) {
         this.path = path;
         this.fd = fd;
         this.flags = flags;
         this.mode = mode;
         this.nativePath = this.defensiveCopy(path);
      }

      @Override
      final boolean act(POSIX nativeFileActions, Pointer posix) {
         return ((UnixLibC)posix.libc()).posix_spawn_file_actions_addopen(nativeFileActions, this.fd, this.nativePath, this.flags, this.mode) == 0;
      }

      @Override
      public String toString() {
         return "SpawnFileAction::Open(path = '"
            + this.path
            + "', fd = "
            + this.fd
            + ", flags = "
            + Integer.toHexString(this.flags)
            + ", mode = "
            + Integer.toHexString(this.mode)
            + ")";
      }
   }
}
