package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Errno.java
public enum Errno implements Constant {
   EAGAIN(35L),
   EDOM(33L),
   ECANCELED(89L),
   ENOSR(98L),
   EROFS(30L),
   ETIMEDOUT(60L),
   EPIPE(32L),
   ESHUTDOWN(58L),
   EDQUOT(69L),
   ENOSYS(78L),
   ESTALE(70L),
   EISCONN(56L),
   ESOCKTNOSUPPORT(44L),
   ENOTDIR(20L),
   EFAULT(14L),
   EBUSY(16L),
   ERANGE(34L),
   EAFNOSUPPORT(47L),
   EISDIR(21L),
   ENEEDAUTH(81L),
   EINVAL(22L),
   E2BIG(7L),
   ETXTBSY(26L),
   ENETRESET(52L),
   ELOOP(62L),
   EMLINK(31L),
   ENOTSUP(45L),
   EALREADY(37L),
   ENOBUFS(55L),
   EEXIST(17L),
   ENAMETOOLONG(63L),
   EIDRM(90L),
   EPROCUNAVAIL(76L),
   EDEADLK(11L),
   EPFNOSUPPORT(46L),
   ENOPROTOOPT(42L),
   EPROTOTYPE(41L),
   EPERM(1L),
   ENFILE(23L),
   EOVERFLOW(84L),
   ENOTRECOVERABLE(104L),
   ENODATA(96L),
   EACCES(13L),
   EHOSTUNREACH(65L),
   EFBIG(27L),
   EOPNOTSUPP(102L),
   EBADF(9L),
   EWOULDBLOCK(35L),
   ENOTTY(25L),
   EXDEV(18L),
   EPROTONOSUPPORT(43L),
   EPROTO(100L),
   ENOLCK(77L),
   ENOATTR(93L),
   EREMOTE(71L),
   EOWNERDEAD(105L),
   ESRCH(3L),
   ECONNABORTED(53L),
   ENODEV(19L),
   EPROCLIM(67L),
   ENOTEMPTY(66L),
   EBADRPC(72L),
   ENOTBLK(15L),
   ECHILD(10L),
   ENOENT(2L),
   ENOSPC(28L),
   EAUTH(80L),
   ENETUNREACH(51L),
   ECONNREFUSED(61L),
   ETOOMANYREFS(59L),
   EMSGSIZE(40L),
   ENOSTR(99L),
   EHOSTDOWN(64L),
   ENOMSG(91L),
   EDESTADDRREQ(39L),
   ETIME(101L),
   ENXIO(6L),
   EPROGMISMATCH(75L),
   ERPCMISMATCH(73L),
   EIO(5L),
   ENOTCONN(57L),
   EMFILE(24L),
   EINTR(4L),
   EILSEQ(92L),
   EINPROGRESS(36L),
   EFTYPE(79L),
   ECONNRESET(54L),
   EADDRNOTAVAIL(49L),
   ENOMEM(12L),
   EBADMSG(94L),
   ENETDOWN(50L),
   ESPIPE(29L),
   ENOEXEC(8L),
   EPROGUNAVAIL(74L),
   EUSERS(68L),
   ENOTSOCK(38L),
   EMULTIHOP(95L),
   EADDRINUSE(48L),
   ENOLINK(97L);

   private final long value;
   public static final long MAX_VALUE = 105L;
   public static final long MIN_VALUE = 1L;

   @Override
   public final String toString() {
      return Errno.StringTable.descriptions.get(this);
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   Errno(long value) {
      this.value = value;
   }

   // $VF: Compiled from Errno.java
   static final class StringTable {
      public static final Map<Errno, String> descriptions = generateTable();

      public static final Map<Errno, String> generateTable() {
         Map<Errno, String> map = new EnumMap<>(Errno.class);
         map.put(Errno.EPERM, "Operation not permitted");
         map.put(Errno.ENOENT, "No such file or directory");
         map.put(Errno.ESRCH, "No such process");
         map.put(Errno.EINTR, "Interrupted system call");
         map.put(Errno.EIO, "Input/output error");
         map.put(Errno.ENXIO, "Device not configured");
         map.put(Errno.E2BIG, "Argument list too long");
         map.put(Errno.ENOEXEC, "Exec format error");
         map.put(Errno.EBADF, "Bad file descriptor");
         map.put(Errno.ECHILD, "No child processes");
         map.put(Errno.EDEADLK, "Resource deadlock avoided");
         map.put(Errno.ENOMEM, "Cannot allocate memory");
         map.put(Errno.EACCES, "Permission denied");
         map.put(Errno.EFAULT, "Bad address");
         map.put(Errno.ENOTBLK, "Block device required");
         map.put(Errno.EBUSY, "Resource busy");
         map.put(Errno.EEXIST, "File exists");
         map.put(Errno.EXDEV, "Cross-device link");
         map.put(Errno.ENODEV, "Operation not supported by device");
         map.put(Errno.ENOTDIR, "Not a directory");
         map.put(Errno.EISDIR, "Is a directory");
         map.put(Errno.EINVAL, "Invalid argument");
         map.put(Errno.ENFILE, "Too many open files in system");
         map.put(Errno.EMFILE, "Too many open files");
         map.put(Errno.ENOTTY, "Inappropriate ioctl for device");
         map.put(Errno.ETXTBSY, "Text file busy");
         map.put(Errno.EFBIG, "File too large");
         map.put(Errno.ENOSPC, "No space left on device");
         map.put(Errno.ESPIPE, "Illegal seek");
         map.put(Errno.EROFS, "Read-only file system");
         map.put(Errno.EMLINK, "Too many links");
         map.put(Errno.EPIPE, "Broken pipe");
         map.put(Errno.EDOM, "Numerical argument out of domain");
         map.put(Errno.ERANGE, "Result too large");
         map.put(Errno.EWOULDBLOCK, "Resource temporarily unavailable");
         map.put(Errno.EAGAIN, "Resource temporarily unavailable");
         map.put(Errno.EINPROGRESS, "Operation now in progress");
         map.put(Errno.EALREADY, "Operation already in progress");
         map.put(Errno.ENOTSOCK, "Socket operation on non-socket");
         map.put(Errno.EDESTADDRREQ, "Destination address required");
         map.put(Errno.EMSGSIZE, "Message too long");
         map.put(Errno.EPROTOTYPE, "Protocol wrong type for socket");
         map.put(Errno.ENOPROTOOPT, "Protocol not available");
         map.put(Errno.EPROTONOSUPPORT, "Protocol not supported");
         map.put(Errno.ESOCKTNOSUPPORT, "Socket type not supported");
         map.put(Errno.EOPNOTSUPP, "Operation not supported on socket");
         map.put(Errno.EPFNOSUPPORT, "Protocol family not supported");
         map.put(Errno.EAFNOSUPPORT, "Address family not supported by protocol family");
         map.put(Errno.EADDRINUSE, "Address already in use");
         map.put(Errno.EADDRNOTAVAIL, "Can't assign requested address");
         map.put(Errno.ENETDOWN, "Network is down");
         map.put(Errno.ENETUNREACH, "Network is unreachable");
         map.put(Errno.ENETRESET, "Network dropped connection on reset");
         map.put(Errno.ECONNABORTED, "Software caused connection abort");
         map.put(Errno.ECONNRESET, "Connection reset by peer");
         map.put(Errno.ENOBUFS, "No buffer space available");
         map.put(Errno.EISCONN, "Socket is already connected");
         map.put(Errno.ENOTCONN, "Socket is not connected");
         map.put(Errno.ESHUTDOWN, "Can't send after socket shutdown");
         map.put(Errno.ETOOMANYREFS, "Too many references: can't splice");
         map.put(Errno.ETIMEDOUT, "Operation timed out");
         map.put(Errno.ECONNREFUSED, "Connection refused");
         map.put(Errno.ELOOP, "Too many levels of symbolic links");
         map.put(Errno.ENAMETOOLONG, "File name too long");
         map.put(Errno.EHOSTDOWN, "Host is down");
         map.put(Errno.EHOSTUNREACH, "No route to host");
         map.put(Errno.ENOTEMPTY, "Directory not empty");
         map.put(Errno.EUSERS, "Too many users");
         map.put(Errno.EDQUOT, "Disc quota exceeded");
         map.put(Errno.ESTALE, "Stale NFS file handle");
         map.put(Errno.EREMOTE, "Too many levels of remote in path");
         map.put(Errno.ENOLCK, "No locks available");
         map.put(Errno.ENOSYS, "Function not implemented");
         map.put(Errno.EOVERFLOW, "Value too large to be stored in data type");
         map.put(Errno.EIDRM, "Identifier removed");
         map.put(Errno.ENOMSG, "No message of desired type");
         map.put(Errno.EILSEQ, "Illegal byte sequence");
         map.put(Errno.EBADMSG, "Bad message");
         map.put(Errno.EMULTIHOP, "EMULTIHOP (Reserved)");
         map.put(Errno.ENODATA, "No message available on STREAM");
         map.put(Errno.ENOLINK, "ENOLINK (Reserved)");
         map.put(Errno.ENOSR, "No STREAM resources");
         map.put(Errno.ENOSTR, "Not a STREAM");
         map.put(Errno.EPROTO, "Protocol error");
         map.put(Errno.ETIME, "STREAM ioctl timeout");
         map.put(Errno.ECANCELED, "Operation canceled");
         map.put(Errno.ENOTRECOVERABLE, "State not recoverable");
         map.put(Errno.EOWNERDEAD, "Previous owner died");
         map.put(Errno.EAUTH, "Authentication error");
         map.put(Errno.EBADRPC, "RPC struct is bad");
         map.put(Errno.EFTYPE, "Inappropriate file type or format");
         map.put(Errno.ENEEDAUTH, "Need authenticator");
         map.put(Errno.ENOATTR, "Attribute not found");
         map.put(Errno.ENOTSUP, "Operation not supported");
         map.put(Errno.EPROCLIM, "Too many processes");
         map.put(Errno.EPROCUNAVAIL, "Bad procedure for program");
         map.put(Errno.EPROGMISMATCH, "Program version wrong");
         map.put(Errno.EPROGUNAVAIL, "RPC prog. not avail");
         map.put(Errno.ERPCMISMATCH, "RPC version wrong");
         return map;
      }
   }
}
