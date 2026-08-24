package jnr.posix;

import java.nio.ByteBuffer;
import jnr.ffi.Pointer;
import jnr.ffi.Variable;
import jnr.ffi.annotations.In;
import jnr.ffi.annotations.Out;
import jnr.ffi.annotations.StdCall;
import jnr.ffi.annotations.Transient;
import jnr.ffi.byref.IntByReference;
import jnr.posix.windows.SystemTime;
import jnr.posix.windows.WindowsByHandleFileInformation;
import jnr.posix.windows.WindowsFileInformation;
import jnr.posix.windows.WindowsFindData;

// $VF: Compiled from WindowsLibC.java
public interface WindowsLibC extends LibC {
   int FILE_TYPE_DISK = 1;
   int FILE_TYPE_UNKNOWN = 0;
   int NORMAL_PRIORITY_CLASS = 32;
   int FILE_TYPE_REMOTE = 32768;
   int INFINITE = -1;
   int STD_OUTPUT_HANDLE = -11;
   int FILE_TYPE_PIPE = 3;
   int STD_INPUT_HANDLE = -10;
   int PROCESS_QUERY_INFORMATION = 1024;
   int FILE_TYPE_CHAR = 2;
   int STD_ERROR_HANDLE = -12;
   int CREATE_UNICODE_ENVIRONMENT = 1024;

   @StdCall
   int WaitForSingleObject(HANDLE var1, int var2);

   Variable<Long> _environ();

   @StdCall
   HANDLE CreateFileW(byte[] var1, int var2, int var3, Pointer var4, int var5, int var6, int var7);

   HANDLE OpenProcess(@In int var1, @In int var2, @In int var3);

   int FileTimeToSystemTime(@In FileTime var1, @Out @Transient SystemTime var2);

   int _wmkdir(@In WString var1);

   @StdCall
   boolean CreateHardLinkW(@In WString var1, @In WString var2, @In WString var3);

   HANDLE FindFirstFileW(@In byte[] var1, @Out WindowsFindData var2);

   @StdCall
   boolean SetEnvironmentVariableW(@In WString var1, @In WString var2);

   int GetFileAttributesW(@In WString var1);

   int SetFileAttributesW(@In WString var1, int var2);

   @StdCall
   int GetFileType(HANDLE var1);

   int GetFileInformationByHandle(@In HANDLE var1, @Out @Transient WindowsByHandleFileInformation var2);

   @StdCall
   boolean CreateProcessW(
      byte[] var1,
      @In @Out ByteBuffer var2,
      WindowsSecurityAttributes var3,
      WindowsSecurityAttributes var4,
      int var5,
      int var6,
      @In Pointer var7,
      @In byte[] var8,
      WindowsStartupInfo var9,
      WindowsProcessInformation var10
   );

   int _wstat64(@In WString var1, @Out @Transient FileStat var2);

   int _close(int var1);

   int _getpid();

   int _wstat64(@In byte[] var1, @Out @Transient FileStat var2);

   int GetFileAttributesExW(@In byte[] var1, @In int var2, @Out @Transient WindowsFileInformation var3);

   @StdCall
   boolean GetComputerNameW(@Out ByteBuffer var1, IntByReference var2);

   int GetFileAttributesExW(@In WString var1, @In int var2, @Out @Transient WindowsFileInformation var3);

   int FindClose(HANDLE var1);

   @StdCall
   int GetFileSize(HANDLE var1, @Out IntByReference var2);

   HANDLE FindFirstFileW(@In WString var1, @Out WindowsFindData var2);

   @StdCall
   boolean GetExitCodeProcess(HANDLE var1, @Out IntByReference var2);

   @StdCall
   boolean CloseHandle(HANDLE var1);

   boolean RemoveDirectoryW(@In WString var1);

   int _pipe(int[] var1, int var2, int var3);

   int _wchmod(@In WString var1, int var2);

   @StdCall
   boolean GetExitCodeProcess(HANDLE var1, @Out Pointer var2);

   int _stat64(CharSequence var1, @Out @Transient FileStat var2);

   int _open_osfhandle(HANDLE var1, int var2);

   int _umask(int var1);

   @StdCall
   HANDLE GetStdHandle(int var1);

   int _wchdir(@In WString var1);

   @StdCall
   boolean SetFileTime(HANDLE var1, FileTime var2, FileTime var3, FileTime var4);

   HANDLE _get_osfhandle(int var1);
}
