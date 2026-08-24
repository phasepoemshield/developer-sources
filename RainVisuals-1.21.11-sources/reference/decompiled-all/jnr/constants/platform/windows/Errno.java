package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Errno.java
public enum Errno implements Constant {
   ENAMETOOLONG(38L),
   ECONNABORTED(106L),
   ESRCH(3L),
   ENOTSOCK(128L),
   ENODEV(19L),
   ENOTCONN(126L),
   EEXIST(17L),
   EADDRINUSE(100L),
   EILSEQ(42L),
   EIO(5L),
   ENOEXEC(8L),
   ERANGE(34L),
   ENOTEMPTY(41L),
   EMLINK(31L),
   EAFNOSUPPORT(102L),
   EDEADLOCK(36L),
   ENOTTY(25L),
   EISDIR(21L),
   EINTR(4L),
   EADDRNOTAVAIL(101L),
   ENFILE(23L),
   ENOTDIR(20L),
   ECONNREFUSED(107L),
   EFAULT(14L),
   EDESTADDRREQ(109L),
   EFBIG(27L),
   ENXIO(6L),
   ENETRESET(117L),
   ENOSYS(40L),
   EIDRM(111L),
   ENOSR(124L),
   EMSGSIZE(115L),
   EINVAL(22L),
   EOWNERDEAD(133L),
   ENOPROTOOPT(123L),
   EDEADLK(36L),
   EDOM(33L),
   EOPNOTSUPP(130L),
   EOVERFLOW(132L),
   ENOBUFS(119L),
   EALREADY(103L),
   EHOSTUNREACH(110L),
   EWOULDBLOCK(140L),
   ENOLINK(121L),
   ECHILD(10L),
   ENOMSG(122L),
   ENETUNREACH(118L),
   ELOOP(114L),
   EPIPE(32L),
   ENOMEM(12L),
   EXDEV(18L),
   ENOLCK(39L),
   EBUSY(16L),
   EMFILE(24L),
   EPERM(1L),
   ENOTRECOVERABLE(127L),
   EISCONN(113L),
   EAGAIN(11L),
   EROFS(30L),
   ETXTBSY(139L),
   EACCES(13L),
   EPROTO(134L),
   ENETDOWN(116L),
   ENOTSUP(129L),
   EPROTOTYPE(136L),
   EINPROGRESS(112L),
   ENODATA(120L),
   ESPIPE(29L),
   EBADF(9L),
   ECANCELED(105L),
   EBADMSG(104L),
   ENOENT(2L),
   ECONNRESET(108L),
   EPROTONOSUPPORT(135L),
   ETIMEDOUT(138L),
   ENOSPC(28L),
   ENOSTR(125L),
   ETIME(137L),
   E2BIG(7L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 140L;

   @Override
   public final long longValue() {
      return this.value;
   }

   Errno(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return Errno.StringTable.descriptions.get(this);
   }

   public final int value() {
      return (int)this.value;
   }

   // $VF: Compiled from Errno.java
   static final class StringTable {
      public static final Map<Errno, String> descriptions = generateTable();

      public static final Map<Errno, String> generateTable() {
         Map<Errno, String> map = new EnumMap<>(Errno.class);
         map.put(Errno.EPERM, "Operation not permitted");
         map.put(Errno.ENOENT, "No such file or directory");
         map.put(Errno.ESRCH, "No such process");
         map.put(Errno.EINTR, "Interrupted function call");
         map.put(Errno.EIO, "Input/output error");
         map.put(Errno.ENXIO, "No such device or address");
         map.put(Errno.E2BIG, "Arg list too long");
         map.put(Errno.ENOEXEC, "Exec format error");
         map.put(Errno.EBADF, "Bad file descriptor");
         map.put(Errno.ECHILD, "No child processes");
         map.put(Errno.EDEADLK, "Resource deadlock avoided");
         map.put(Errno.ENOMEM, "Not enough space");
         map.put(Errno.EACCES, "Permission denied");
         map.put(Errno.EFAULT, "Bad address");
         map.put(Errno.EBUSY, "Resource device");
         map.put(Errno.EEXIST, "File exists");
         map.put(Errno.EXDEV, "Improper link");
         map.put(Errno.ENODEV, "No such device");
         map.put(Errno.ENOTDIR, "Not a directory");
         map.put(Errno.EISDIR, "Is a directory");
         map.put(Errno.EINVAL, "Invalid argument");
         map.put(Errno.ENFILE, "Too many open files in system");
         map.put(Errno.EMFILE, "Too many open files");
         map.put(Errno.ENOTTY, "Inappropriate I/O control operation");
         map.put(Errno.ETXTBSY, "Unknown error");
         map.put(Errno.EFBIG, "File too large");
         map.put(Errno.ENOSPC, "No space left on device");
         map.put(Errno.ESPIPE, "Invalid seek");
         map.put(Errno.EROFS, "Read-only file system");
         map.put(Errno.EMLINK, "Too many links");
         map.put(Errno.EPIPE, "Broken pipe");
         map.put(Errno.EDOM, "Domain error");
         map.put(Errno.ERANGE, "Result too large");
         map.put(Errno.EWOULDBLOCK, "Unknown error");
         map.put(Errno.EAGAIN, "Resource temporarily unavailable");
         map.put(Errno.EINPROGRESS, "Unknown error");
         map.put(Errno.EALREADY, "Unknown error");
         map.put(Errno.ENOTSOCK, "Unknown error");
         map.put(Errno.EDESTADDRREQ, "Unknown error");
         map.put(Errno.EMSGSIZE, "Unknown error");
         map.put(Errno.EPROTOTYPE, "Unknown error");
         map.put(Errno.ENOPROTOOPT, "Unknown error");
         map.put(Errno.EPROTONOSUPPORT, "Unknown error");
         map.put(Errno.EOPNOTSUPP, "Unknown error");
         map.put(Errno.EAFNOSUPPORT, "Unknown error");
         map.put(Errno.EADDRINUSE, "Unknown error");
         map.put(Errno.EADDRNOTAVAIL, "Unknown error");
         map.put(Errno.ENETDOWN, "Unknown error");
         map.put(Errno.ENETUNREACH, "Unknown error");
         map.put(Errno.ENETRESET, "Unknown error");
         map.put(Errno.ECONNABORTED, "Unknown error");
         map.put(Errno.ECONNRESET, "Unknown error");
         map.put(Errno.ENOBUFS, "Unknown error");
         map.put(Errno.EISCONN, "Unknown error");
         map.put(Errno.ENOTCONN, "Unknown error");
         map.put(Errno.ETIMEDOUT, "Unknown error");
         map.put(Errno.ECONNREFUSED, "Unknown error");
         map.put(Errno.ELOOP, "Unknown error");
         map.put(Errno.ENAMETOOLONG, "Filename too long");
         map.put(Errno.EHOSTUNREACH, "Unknown error");
         map.put(Errno.ENOTEMPTY, "Directory not empty");
         map.put(Errno.ENOLCK, "No locks available");
         map.put(Errno.ENOSYS, "Function not implemented");
         map.put(Errno.EOVERFLOW, "Unknown error");
         map.put(Errno.EIDRM, "Unknown error");
         map.put(Errno.ENOMSG, "Unknown error");
         map.put(Errno.EILSEQ, "Illegal byte sequence");
         map.put(Errno.EBADMSG, "Unknown error");
         map.put(Errno.ENODATA, "Unknown error");
         map.put(Errno.ENOLINK, "Unknown error");
         map.put(Errno.ENOSR, "Unknown error");
         map.put(Errno.ENOSTR, "Unknown error");
         map.put(Errno.EPROTO, "Unknown error");
         map.put(Errno.ETIME, "Unknown error");
         map.put(Errno.EDEADLOCK, "Resource deadlock avoided");
         map.put(Errno.ECANCELED, "Unknown error");
         map.put(Errno.ENOTRECOVERABLE, "Unknown error");
         map.put(Errno.EOWNERDEAD, "Unknown error");
         map.put(Errno.ENOTSUP, "Unknown error");
         return map;
      }
   }
}
