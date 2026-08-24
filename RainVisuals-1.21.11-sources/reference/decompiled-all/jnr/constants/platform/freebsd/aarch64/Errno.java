package jnr.constants.platform.freebsd.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Errno.java
public enum Errno implements Constant {
   EIO(5L),
   ENOTCONN(57L),
   EACCES(13L),
   ENOTRECOVERABLE(95L),
   EILSEQ(86L),
   ERPCMISMATCH(73L),
   EMULTIHOP(90L),
   EDEADLK(11L),
   EUSERS(68L),
   ECANCELED(85L),
   EPFNOSUPPORT(46L),
   ENOPROTOOPT(42L),
   EEXIST(17L),
   ESTALE(70L),
   ECHILD(10L),
   EBADF(9L),
   EIDRM(82L),
   EPROCUNAVAIL(76L),
   EOPNOTSUPP(45L),
   ENETUNREACH(51L),
   ENOTCAPABLE(93L),
   ENOSPC(28L),
   ECONNABORTED(53L),
   ENOSYS(78L),
   ETXTBSY(26L),
   EFBIG(27L),
   E2BIG(7L),
   ECONNRESET(54L),
   EOWNERDEAD(96L),
   ENOTEMPTY(66L),
   ENOMEM(12L),
   EDOM(33L),
   ECONNREFUSED(61L),
   EISCONN(56L),
   EISDIR(21L),
   ENOBUFS(55L),
   ENOLCK(77L),
   ENOLINK(91L),
   ESPIPE(29L),
   ENOATTR(87L),
   EDOOFUS(88L),
   EREMOTE(71L),
   EPERM(1L),
   EPROTOTYPE(41L),
   ENXIO(6L),
   ENOTSOCK(38L),
   ENOENT(2L),
   EDESTADDRREQ(39L),
   ECAPMODE(94L),
   ENEEDAUTH(81L),
   EADDRNOTAVAIL(49L),
   ENETRESET(52L),
   ENOTBLK(15L),
   EXDEV(18L),
   ETOOMANYREFS(59L),
   ENETDOWN(50L),
   ENOMSG(83L),
   EPROTONOSUPPORT(43L),
   EBADRPC(72L),
   EMSGSIZE(40L),
   EMLINK(31L),
   ENOTDIR(20L),
   EPIPE(32L),
   EMFILE(24L),
   ERANGE(34L),
   ENODEV(19L),
   ENFILE(23L),
   ENOEXEC(8L),
   EWOULDBLOCK(35L),
   EPROGUNAVAIL(74L),
   EADDRINUSE(48L),
   EPROGMISMATCH(75L),
   EAFNOSUPPORT(47L),
   EHOSTDOWN(64L),
   EFTYPE(79L),
   ENOTSUP(45L),
   EOVERFLOW(84L),
   EBUSY(16L),
   ESRCH(3L),
   EFAULT(14L),
   ELOOP(62L),
   ESHUTDOWN(58L),
   EINTR(4L),
   EDQUOT(69L),
   EINVAL(22L),
   EAGAIN(35L),
   EBADMSG(89L),
   EPROTO(92L),
   EPROCLIM(67L),
   ENOTTY(25L),
   EHOSTUNREACH(65L),
   ESOCKTNOSUPPORT(44L),
   EALREADY(37L),
   ETIMEDOUT(60L),
   EAUTH(80L),
   EINPROGRESS(36L),
   ENAMETOOLONG(63L),
   EROFS(30L);

   public static final long MAX_VALUE = 96L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final String toString() {
      return Errno.StringTable.descriptions.get(this);
   }

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
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
         map.put(Errno.EBUSY, "Device busy");
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
         map.put(Errno.EOPNOTSUPP, "Operation not supported");
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
         map.put(Errno.EMULTIHOP, "Multihop attempted");
         map.put(Errno.ENOLINK, "Link has been severed");
         map.put(Errno.EPROTO, "Protocol error");
         map.put(Errno.ECANCELED, "Operation canceled");
         map.put(Errno.ENOTRECOVERABLE, "State not recoverable");
         map.put(Errno.EOWNERDEAD, "Previous owner died");
         map.put(Errno.EAUTH, "Authentication error");
         map.put(Errno.EBADRPC, "RPC struct is bad");
         map.put(Errno.EDOOFUS, "Programming error");
         map.put(Errno.EFTYPE, "Inappropriate file type or format");
         map.put(Errno.ENEEDAUTH, "Need authenticator");
         map.put(Errno.ENOATTR, "Attribute not found");
         map.put(Errno.ENOTSUP, "Operation not supported");
         map.put(Errno.EPROCLIM, "Too many processes");
         map.put(Errno.EPROCUNAVAIL, "Bad procedure for program");
         map.put(Errno.EPROGMISMATCH, "Program version wrong");
         map.put(Errno.EPROGUNAVAIL, "RPC prog. not avail");
         map.put(Errno.ERPCMISMATCH, "RPC version wrong");
         map.put(Errno.ECAPMODE, "Not permitted in capability mode");
         map.put(Errno.ENOTCAPABLE, "Capabilities insufficient");
         return map;
      }
   }
}
