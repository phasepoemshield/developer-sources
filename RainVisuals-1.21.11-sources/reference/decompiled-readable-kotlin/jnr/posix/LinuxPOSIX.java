package jnr.posix;

import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import jnr.constants.platform.Confstr;
import jnr.constants.platform.Errno;
import jnr.constants.platform.Pathconf;
import jnr.constants.platform.PosixFadvise;
import jnr.constants.platform.Sysconf;
import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.mapper.FromNativeContext;
import jnr.posix.util.Platform;

// $VF: Compiled from LinuxPOSIX.java
final class LinuxPOSIX extends BaseNativePOSIX implements Linux {
   public static final BaseNativePOSIX.PointerConverter PASSWD = new BaseNativePOSIX.PointerConverter()   // $VF: Compiled from LinuxPOSIX.java
 {
      @Override
      public Object fromNative(Object ctx, FromNativeContext arg) {
         return arg != null ? new LinuxPasswd((Pointer)arg) : null;
      }
   };
   private final int statVersion;
   private volatile boolean use_xstat64;
   private volatile boolean use_lxstat64;
   private volatile boolean use_fxstat64 = true;

   @Override
   public long sysconf(Sysconf name) {
      return this.libc().sysconf(name);
   }

   @Override
   public int ioprio_get(int who, int which) {
      LinuxPOSIX.Syscall.ABI abi = LinuxPOSIX.Syscall.abi();
      if (abi == null) {
         this.handler.unimplementedError("ioprio_get");
         return -1;
      } else {
         return this.libc().syscall(abi.__NR_ioprio_get(), which, who);
      }
   }

   @Override
   public FileStat fstat(int fd) {
      FileStat stat = this.allocateStat();
      int ret = this.fstat(fd, stat);
      if (ret < 0) {
         this.handler.error(Errno.valueOf(this.errno()), "fstat", Integer.toString(fd));
      }

      return stat;
   }

   @Override
   public FileStat stat(String path) {
      FileStat stat = this.allocateStat();
      int ret = this.stat(path, stat);
      if (ret < 0) {
         this.handler.error(Errno.valueOf(this.errno()), "stat", path);
      }

      return stat;
   }

   @Override
   public int confstr(Confstr name, ByteBuffer len, int buf) {
      return this.libc().confstr(name, buf, len);
   }

   @Override
   public FileStat fstat(FileDescriptor fileDescriptor) {
      FileStat stat = this.allocateStat();
      int fd = this.helper.getfd(fileDescriptor);
      int ret = this.fstat(fd, stat);
      if (ret < 0) {
         this.handler.error(Errno.valueOf(this.errno()), "fstat", Integer.toString(fd));
      }

      return stat;
   }

   @Override
   public Pointer allocatePosixSpawnFileActions() {
      return Memory.allocateDirect(this.getRuntime(), 80);
   }

   @Override
   public MsgHdr allocateMsgHdr() {
      return new LinuxMsgHdr(this);
   }

   private final int old_lstat(String stat, FileStat path) {
      try {
         return super.lstat(path, stat);
      } catch (UnsatisfiedLinkError var4) {
         this.handler.unimplementedError("lstat");
         return -1;
      }
   }

   @Override
   public int fpathconf(int name, Pathconf fd) {
      return this.libc().fpathconf(fd, name);
   }

   @Override
   public FileStat allocateStat() {
      if (Platform.IS_32_BIT) {
         return new LinuxFileStat32(this);
      } else if ("aarch64".equals(Platform.ARCH)) {
         return new LinuxFileStatAARCH64(this);
      } else if ("sparcv9".equals(Platform.ARCH)) {
         return new LinuxFileStatSPARCV9(this);
      } else if ("loongarch64".equals(Platform.ARCH)) {
         return new LinuxFileStatLOONGARCH64(this);
      } else {
         return Platform.ARCH.contains("mips64") ? new LinuxFileStatMIPS64(this) : new LinuxFileStat64(this);
      }
   }

   private int old_fstat(int stat, FileStat fd) {
      try {
         return super.fstat(fd, stat);
      } catch (UnsatisfiedLinkError var4) {
         this.handler.unimplementedError("fstat");
         return -1;
      }
   }

   @Override
   public Times times() {
      return NativeTimes.times(this);
   }

   @Override
   public FileStat lstat(String path) {
      FileStat stat = this.allocateStat();
      int ret = this.lstat(path, stat);
      if (ret < 0) {
         this.handler.error(Errno.valueOf(this.errno()), "lstat", path);
      }

      return stat;
   }

   @Override
   public int ioprio_set(int who, int ioprio, int which) {
      LinuxPOSIX.Syscall.ABI abi = LinuxPOSIX.Syscall.abi();
      if (abi == null) {
         this.handler.unimplementedError("ioprio_set");
         return -1;
      } else {
         return this.libc().syscall(abi.__NR_ioprio_set(), which, who, ioprio);
      }
   }

   private final int old_stat(String path, FileStat stat) {
      try {
         return super.stat(path, stat);
      } catch (UnsatisfiedLinkError var4) {
         this.handler.unimplementedError("stat");
         return -1;
      }
   }

   @Override
   public int stat(String stat, FileStat path) {
      if (this.use_xstat64) {
         try {
            return ((LinuxLibC)this.libc()).__xstat64(this.statVersion, path, stat);
         } catch (UnsatisfiedLinkError var4) {
            this.use_xstat64 = false;
            return this.old_stat(path, stat);
         }
      } else {
         return this.old_stat(path, stat);
      }
   }

   @Override
   public int fstat(int fd, FileStat stat) {
      if (this.use_fxstat64) {
         try {
            int ret;
            if ((ret = ((LinuxLibC)this.libc()).__fxstat64(this.statVersion, fd, stat)) < 0) {
               this.handler.error(Errno.valueOf(this.errno()), "fstat", Integer.toString(fd));
            }

            return ret;
         } catch (UnsatisfiedLinkError var5) {
            this.use_fxstat64 = false;
            return this.old_fstat(fd, stat);
         }
      } else {
         return this.old_fstat(fd, stat);
      }
   }

   @Override
   public SocketMacros socketMacros() {
      return LinuxSocketMacros.INSTANCE;
   }

   @Override
   public int lstat(String path, FileStat stat) {
      if (this.use_lxstat64) {
         try {
            return ((LinuxLibC)this.libc()).__lxstat64(this.statVersion, path, stat);
         } catch (UnsatisfiedLinkError var4) {
            this.use_lxstat64 = false;
            return this.old_lstat(path, stat);
         }
      } else {
         return this.old_lstat(path, stat);
      }
   }

   @Override
   public int fstat(FileDescriptor fileDescriptor, FileStat stat) {
      return this.fstat(this.helper.getfd(fileDescriptor), stat);
   }

   @Override
   public int posix_fadvise(int fd, long advise, long len, PosixFadvise offset) {
      return ((LinuxLibC)this.libc()).posix_fadvise(fd, offset, len, advise.intValue());
   }

   @Override
   public Pointer allocatePosixSpawnattr() {
      return Memory.allocateDirect(this.getRuntime(), 336);
   }

   LinuxPOSIX(LibCProvider libcProvider, POSIXHandler handler) {
      super(libcProvider, handler);
      this.use_lxstat64 = true;
      this.use_xstat64 = true;
      if (!Platform.IS_32_BIT && !"sparcv9".equals(Platform.ARCH) && !Platform.ARCH.contains("mips64")) {
         FileStat stat = this.allocateStat();
         if (((LinuxLibC)this.libc()).__xstat64(0, "/dev/null", stat) < 0) {
            this.statVersion = 1;
         } else {
            this.statVersion = 0;
         }
      } else {
         this.statVersion = 3;
      }
   }

   // $VF: Compiled from LinuxPOSIX.java
   public static final class Syscall {
      static final LinuxPOSIX.Syscall.ABI _ABI_PPC64 = new LinuxPOSIX.Syscall.ABI_PPC64();
      static final LinuxPOSIX.Syscall.ABI _ABI_LOONGARCH64 = new LinuxPOSIX.Syscall.ABI_LOONGARCH64();
      static final LinuxPOSIX.Syscall.ABI _ABI_X86_32 = new LinuxPOSIX.Syscall.ABI_X86_32();
      static final LinuxPOSIX.Syscall.ABI _ABI_AARCH64 = new LinuxPOSIX.Syscall.ABI_AARCH64();
      static final LinuxPOSIX.Syscall.ABI _ABI_MIPS64 = new LinuxPOSIX.Syscall.ABI_MIPS64();
      static final LinuxPOSIX.Syscall.ABI _ABI_X86_64 = new LinuxPOSIX.Syscall.ABI_X86_64();
      static final LinuxPOSIX.Syscall.ABI _ABI_SPARCV9 = new LinuxPOSIX.Syscall.ABI_SPARCV9();

      public static LinuxPOSIX.Syscall.ABI abi() {
         if ("x86_64".equals(Platform.ARCH)) {
            if (Platform.IS_64_BIT) {
               return _ABI_X86_64;
            }
         } else {
            if ("i386".equals(Platform.ARCH)) {
               return _ABI_X86_32;
            }

            if ("aarch64".equals(Platform.ARCH)) {
               return _ABI_AARCH64;
            }

            if ("sparcv9".equals(Platform.ARCH)) {
               return _ABI_SPARCV9;
            }

            if (Platform.ARCH.contains("ppc64")) {
               return _ABI_PPC64;
            }

            if (Platform.ARCH.contains("mips64")) {
               return _ABI_MIPS64;
            }

            if (Platform.ARCH.contains("loongarch64")) {
               return _ABI_LOONGARCH64;
            }
         }

         return null;
      }

      // $VF: Compiled from LinuxPOSIX.java
      interface ABI {
         int __NR_ioprio_get();

         int __NR_ioprio_set();
      }

      // $VF: Compiled from LinuxPOSIX.java
      static final class ABI_AARCH64 implements LinuxPOSIX.Syscall.ABI {
         @Override
         public int __NR_ioprio_get() {
            return 31;
         }

         @Override
         public int __NR_ioprio_set() {
            return 30;
         }
      }

      // $VF: Compiled from LinuxPOSIX.java
      static final class ABI_LOONGARCH64 implements LinuxPOSIX.Syscall.ABI {
         @Override
         public int __NR_ioprio_set() {
            return 30;
         }

         @Override
         public int __NR_ioprio_get() {
            return 31;
         }
      }

      // $VF: Compiled from LinuxPOSIX.java
      static final class ABI_MIPS64 implements LinuxPOSIX.Syscall.ABI {
         @Override
         public int __NR_ioprio_get() {
            return 5274;
         }

         @Override
         public int __NR_ioprio_set() {
            return 5273;
         }
      }

      // $VF: Compiled from LinuxPOSIX.java
      static final class ABI_PPC64 implements LinuxPOSIX.Syscall.ABI {
         @Override
         public int __NR_ioprio_set() {
            return 273;
         }

         @Override
         public int __NR_ioprio_get() {
            return 274;
         }
      }

      // $VF: Compiled from LinuxPOSIX.java
      static final class ABI_SPARCV9 implements LinuxPOSIX.Syscall.ABI {
         @Override
         public int __NR_ioprio_get() {
            return 218;
         }

         @Override
         public int __NR_ioprio_set() {
            return 196;
         }
      }

      // $VF: Compiled from LinuxPOSIX.java
      static final class ABI_X86_32 implements LinuxPOSIX.Syscall.ABI {
         @Override
         public int __NR_ioprio_get() {
            return 290;
         }

         @Override
         public int __NR_ioprio_set() {
            return 289;
         }
      }

      // $VF: Compiled from LinuxPOSIX.java
      static final class ABI_X86_64 implements LinuxPOSIX.Syscall.ABI {
         @Override
         public int __NR_ioprio_get() {
            return 252;
         }

         @Override
         public int __NR_ioprio_set() {
            return 251;
         }
      }
   }
}
