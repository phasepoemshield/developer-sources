package jnr.constants.platform.aix;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Errno.java
public enum Errno implements Constant {
   ESOCKTNOSUPPORT(63L),
   ESTALE(52L),
   E2BIG(7L),
   ENOTBLK(15L),
   ENOENT(2L),
   EAFNOSUPPORT(66L),
   ERANGE(34L),
   EOVERFLOW(127L),
   EINTR(4L),
   EHOSTDOWN(80L),
   ENOLCK(49L),
   EMSGSIZE(59L),
   ESPIPE(29L),
   ELOOP(85L),
   EUSERS(84L),
   ENOTTY(25L),
   ENOSR(118L),
   ECONNRESET(73L),
   EISDIR(21L),
   EIDRM(36L),
   EFBIG(27L),
   EEXIST(17L),
   ENOPROTOOPT(61L),
   EAGAIN(11L),
   ETXTBSY(26L),
   EPROTO(121L),
   ENODEV(19L),
   ECHILD(10L),
   EIO(5L),
   ENETRESET(71L),
   ESHUTDOWN(77L),
   EINPROGRESS(55L),
   ENOTCONN(76L),
   EMULTIHOP(125L),
   ETOOMANYREFS(115L),
   EBADMSG(120L),
   EPROTOTYPE(60L),
   ESRCH(3L),
   EALREADY(56L),
   EFAULT(14L),
   ENAMETOOLONG(86L),
   ENOEXEC(8L),
   EINVAL(22L),
   EXDEV(18L),
   ENOSPC(28L),
   ENOTSOCK(57L),
   ENOSTR(123L),
   EOPNOTSUPP(64L),
   EDOM(33L),
   ENOMSG(35L),
   ETIMEDOUT(78L),
   EREMOTE(93L),
   EACCES(13L),
   EDESTADDRREQ(58L),
   ENOTDIR(20L),
   EMFILE(24L),
   ENOLINK(126L),
   EPIPE(32L),
   ENOMEM(12L),
   EADDRINUSE(67L),
   ENXIO(6L),
   ENFILE(23L),
   EPROTONOSUPPORT(62L),
   EISCONN(75L),
   ENETDOWN(69L),
   EILSEQ(116L),
   ENOTEMPTY(17L),
   EADDRNOTAVAIL(68L),
   EHOSTUNREACH(81L),
   EBUSY(16L),
   EDEADLK(45L),
   ENOSYS(109L),
   EMLINK(31L),
   EPFNOSUPPORT(65L),
   EWOULDBLOCK(11L),
   ECONNREFUSED(79L),
   EPERM(1L),
   ENODATA(122L),
   ETIME(119L),
   ENOBUFS(74L),
   ENETUNREACH(70L),
   EDQUOT(88L),
   EROFS(30L),
   EBADF(9L),
   ECONNABORTED(72L);

   public static final long MIN_VALUE = 1L;
   private final long value;
   public static final long MAX_VALUE = 127L;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final String toString() {
      return Errno.StringTable.descriptions.get(this);
   }

   Errno(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   // $VF: Compiled from Errno.java
   static final class StringTable {
      public static final Map<Errno, String> descriptions = generateTable();

      public static final Map<Errno, String> generateTable() {
         Map<Errno, String> map = new EnumMap<>(Errno.class);
         map.put(Errno.EPERM, "Not owner");
         map.put(Errno.ENOENT, "No such file or directory");
         map.put(Errno.ESRCH, "No such process");
         map.put(Errno.EINTR, "Interrupted system call");
         map.put(Errno.EIO, "I/O error");
         map.put(Errno.ENXIO, "No such device or address");
         map.put(Errno.E2BIG, "Arg list too long");
         map.put(Errno.ENOEXEC, "Exec format error");
         map.put(Errno.EBADF, "Bad file number");
         map.put(Errno.ECHILD, "No child processes");
         map.put(Errno.EDEADLK, "Deadlock condition if locked");
         map.put(Errno.ENOMEM, "Not enough space");
         map.put(Errno.EACCES, "Permission denied");
         map.put(Errno.EFAULT, "Bad address");
         map.put(Errno.ENOTBLK, "Block device required");
         map.put(Errno.EBUSY, "Device busy");
         map.put(Errno.EEXIST, "File exists");
         map.put(Errno.EXDEV, "Cross-device link");
         map.put(Errno.ENODEV, "No such device");
         map.put(Errno.ENOTDIR, "Not a directory");
         map.put(Errno.EISDIR, "Is a directory");
         map.put(Errno.EINVAL, "Invalid argument");
         map.put(Errno.ENFILE, "File table overflow");
         map.put(Errno.EMFILE, "Too many open files");
         map.put(Errno.ENOTTY, "Not a typewriter");
         map.put(Errno.ETXTBSY, "Text file busy");
         map.put(Errno.EFBIG, "File too large");
         map.put(Errno.ENOSPC, "No space left on device");
         map.put(Errno.ESPIPE, "Illegal seek");
         map.put(Errno.EROFS, "Read-only file system");
         map.put(Errno.EMLINK, "Too many links");
         map.put(Errno.EPIPE, "Broken pipe");
         map.put(Errno.EDOM, "Argument out of domain");
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
         map.put(Errno.EAFNOSUPPORT, "Addr family not supported by protocol");
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
         map.put(Errno.ETIMEDOUT, "Connection timed out");
         map.put(Errno.ECONNREFUSED, "Connection refused");
         map.put(Errno.ELOOP, "Too many levels of symbolic links");
         map.put(Errno.ENAMETOOLONG, "File name too long");
         map.put(Errno.EHOSTDOWN, "Host is down");
         map.put(Errno.EHOSTUNREACH, "No route to host");
         map.put(Errno.ENOTEMPTY, "File exists");
         map.put(Errno.EUSERS, "Too many users");
         map.put(Errno.EDQUOT, "Disk quota exceeded");
         map.put(Errno.ESTALE, "Missing file or filesystem");
         map.put(Errno.EREMOTE, "Item is not local to host");
         map.put(Errno.ENOLCK, "No locks available");
         map.put(Errno.ENOSYS, "Function not implemented");
         map.put(Errno.EOVERFLOW, "Value too large to be stored in data type");
         map.put(Errno.EIDRM, "Identifier removed");
         map.put(Errno.ENOMSG, "No message of desired type");
         map.put(Errno.EILSEQ, "Invalid wide character");
         map.put(Errno.EBADMSG, "Next message has wrong type");
         map.put(Errno.EMULTIHOP, "Multihop is not allowed");
         map.put(Errno.ENODATA, "No message on stream head read q");
         map.put(Errno.ENOLINK, "The server link has been severed");
         map.put(Errno.ENOSR, "Out of STREAMS resources");
         map.put(Errno.ENOSTR, "fd not associated with a stream");
         map.put(Errno.EPROTO, "Error in protocol");
         map.put(Errno.ETIME, "System call timed out");
         return map;
      }
   }
}
