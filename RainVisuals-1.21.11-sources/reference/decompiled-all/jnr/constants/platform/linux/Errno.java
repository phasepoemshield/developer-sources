package jnr.constants.platform.linux;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Errno.java
public enum Errno implements Constant {
   EADDRNOTAVAIL(99L),
   ENOTSUP(95L),
   EMEDIUMTYPE(124L),
   ENETUNREACH(101L),
   EIO(5L),
   ENOSYS(38L),
   EDEADLOCK(35L),
   ECONNREFUSED(111L),
   ENODEV(19L),
   ENETRESET(102L),
   ENOTRECOVERABLE(131L),
   ENOTTY(25L),
   ECHILD(10L),
   ELIBSCN(81L),
   ENOTEMPTY(39L),
   ECANCELED(125L),
   EUNATCH(49L),
   EL3RST(47L),
   ENFILE(23L),
   ENOTBLK(15L),
   ECONNRESET(104L),
   EL2HLT(51L),
   EPFNOSUPPORT(96L),
   EISDIR(21L),
   EINPROGRESS(115L),
   EKEYREVOKED(128L),
   EPIPE(32L),
   EOVERFLOW(75L),
   EIDRM(43L),
   EACCES(13L),
   EOPNOTSUPP(95L),
   EREMOTE(66L),
   EMFILE(24L),
   EALREADY(114L),
   EPERM(1L),
   ENOLCK(37L),
   ENONET(64L),
   EAFNOSUPPORT(97L),
   ETIMEDOUT(110L),
   ENOLINK(67L),
   ECHRNG(44L),
   EKEYREJECTED(129L),
   ENOSTR(60L),
   EADDRINUSE(98L),
   EBADRQC(56L),
   EADV(68L),
   EDOTDOT(73L),
   EMULTIHOP(72L),
   EHOSTUNREACH(113L),
   ENOSR(63L),
   ENOSPC(28L),
   EBADF(9L),
   ERFKILL(132L),
   ETOOMANYREFS(109L),
   EEXIST(17L),
   ENETDOWN(100L),
   ERANGE(34L),
   E2BIG(7L),
   EBADMSG(74L),
   EMSGSIZE(90L),
   ENOPROTOOPT(92L),
   ENOANO(55L),
   ENOBUFS(105L),
   ENOTNAM(118L),
   ENOMEDIUM(123L),
   ETIME(62L),
   ENODATA(61L),
   EL3HLT(46L),
   EDESTADDRREQ(89L),
   EKEYEXPIRED(127L),
   EUSERS(87L),
   ELIBMAX(82L),
   ESTALE(116L),
   ECONNABORTED(103L),
   ETXTBSY(26L),
   ENOMEM(12L),
   ENOENT(2L),
   EROFS(30L),
   EHOSTDOWN(112L),
   ENOCSI(50L),
   EMLINK(31L),
   ENOPKG(65L),
   EFAULT(14L),
   EINVAL(22L),
   EBADE(52L),
   ENAMETOOLONG(36L),
   ENOTUNIQ(76L),
   ELIBBAD(80L),
   ELNRNG(48L),
   EFBIG(27L),
   EBUSY(16L),
   EISNAM(120L),
   EILSEQ(84L),
   EBADSLT(57L),
   EXFULL(54L),
   ENOTDIR(20L),
   ELIBACC(79L),
   EBFONT(59L),
   ESRMNT(69L),
   ENOEXEC(8L),
   EBADFD(77L),
   EL2NSYNC(45L),
   EWOULDBLOCK(11L),
   EBADR(53L),
   EISCONN(106L),
   EHWPOISON(133L),
   ERESTART(85L),
   ESRCH(3L),
   EREMCHG(78L),
   EPROTO(71L),
   EXDEV(18L),
   EDQUOT(122L),
   ESPIPE(29L),
   ESTRPIPE(86L),
   EUCLEAN(117L),
   ENOKEY(126L),
   ENXIO(6L),
   EDEADLK(35L),
   EPROTOTYPE(91L),
   ECOMM(70L),
   ENOTSOCK(88L),
   ENAVAIL(119L),
   ENOMSG(42L),
   EINTR(4L),
   ESOCKTNOSUPPORT(94L),
   EOWNERDEAD(130L),
   EAGAIN(11L),
   EPROTONOSUPPORT(93L),
   ENOTCONN(107L),
   EREMOTEIO(121L),
   ELIBEXEC(83L),
   ESHUTDOWN(108L),
   ELOOP(40L),
   EDOM(33L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 133L;

   @Override
   public final boolean defined() {
      return true;
   }

   Errno(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
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
         map.put(Errno.EINTR, "Interrupted system call");
         map.put(Errno.EIO, "Input/output error");
         map.put(Errno.ENXIO, "No such device or address");
         map.put(Errno.E2BIG, "Argument list too long");
         map.put(Errno.ENOEXEC, "Exec format error");
         map.put(Errno.EBADF, "Bad file descriptor");
         map.put(Errno.ECHILD, "No child processes");
         map.put(Errno.EDEADLK, "Resource deadlock avoided");
         map.put(Errno.ENOMEM, "Cannot allocate memory");
         map.put(Errno.EACCES, "Permission denied");
         map.put(Errno.EFAULT, "Bad address");
         map.put(Errno.ENOTBLK, "Block device required");
         map.put(Errno.EBUSY, "Device or resource busy");
         map.put(Errno.EEXIST, "File exists");
         map.put(Errno.EXDEV, "Invalid cross-device link");
         map.put(Errno.ENODEV, "No such device");
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
         map.put(Errno.ERANGE, "Numerical result out of range");
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
         map.put(Errno.EAFNOSUPPORT, "Address family not supported by protocol");
         map.put(Errno.EADDRINUSE, "Address already in use");
         map.put(Errno.EADDRNOTAVAIL, "Cannot assign requested address");
         map.put(Errno.ENETDOWN, "Network is down");
         map.put(Errno.ENETUNREACH, "Network is unreachable");
         map.put(Errno.ENETRESET, "Network dropped connection on reset");
         map.put(Errno.ECONNABORTED, "Software caused connection abort");
         map.put(Errno.ECONNRESET, "Connection reset by peer");
         map.put(Errno.ENOBUFS, "No buffer space available");
         map.put(Errno.EISCONN, "Transport endpoint is already connected");
         map.put(Errno.ENOTCONN, "Transport endpoint is not connected");
         map.put(Errno.ESHUTDOWN, "Cannot send after transport endpoint shutdown");
         map.put(Errno.ETOOMANYREFS, "Too many references: cannot splice");
         map.put(Errno.ETIMEDOUT, "Connection timed out");
         map.put(Errno.ECONNREFUSED, "Connection refused");
         map.put(Errno.ELOOP, "Too many levels of symbolic links");
         map.put(Errno.ENAMETOOLONG, "File name too long");
         map.put(Errno.EHOSTDOWN, "Host is down");
         map.put(Errno.EHOSTUNREACH, "No route to host");
         map.put(Errno.ENOTEMPTY, "Directory not empty");
         map.put(Errno.EUSERS, "Too many users");
         map.put(Errno.EDQUOT, "Disk quota exceeded");
         map.put(Errno.ESTALE, "Stale file handle");
         map.put(Errno.EREMOTE, "Object is remote");
         map.put(Errno.ENOLCK, "No locks available");
         map.put(Errno.ENOSYS, "Function not implemented");
         map.put(Errno.EOVERFLOW, "Value too large for defined data type");
         map.put(Errno.EIDRM, "Identifier removed");
         map.put(Errno.ENOMSG, "No message of desired type");
         map.put(Errno.EILSEQ, "Invalid or incomplete multibyte or wide character");
         map.put(Errno.EBADMSG, "Bad message");
         map.put(Errno.EMULTIHOP, "Multihop attempted");
         map.put(Errno.ENODATA, "No data available");
         map.put(Errno.ENOLINK, "Link has been severed");
         map.put(Errno.ENOSR, "Out of streams resources");
         map.put(Errno.ENOSTR, "Device not a stream");
         map.put(Errno.EPROTO, "Protocol error");
         map.put(Errno.ETIME, "Timer expired");
         map.put(Errno.ECHRNG, "Channel number out of range");
         map.put(Errno.EL2NSYNC, "Level 2 not synchronized");
         map.put(Errno.EL3HLT, "Level 3 halted");
         map.put(Errno.EL3RST, "Level 3 reset");
         map.put(Errno.ELNRNG, "Link number out of range");
         map.put(Errno.EUNATCH, "Protocol driver not attached");
         map.put(Errno.ENOCSI, "No CSI structure available");
         map.put(Errno.EL2HLT, "Level 2 halted");
         map.put(Errno.EBADE, "Invalid exchange");
         map.put(Errno.EBADR, "Invalid request descriptor");
         map.put(Errno.EXFULL, "Exchange full");
         map.put(Errno.ENOANO, "No anode");
         map.put(Errno.EBADRQC, "Invalid request code");
         map.put(Errno.EBADSLT, "Invalid slot");
         map.put(Errno.EDEADLOCK, "Resource deadlock avoided");
         map.put(Errno.EBFONT, "Bad font file format");
         map.put(Errno.ENONET, "Machine is not on the network");
         map.put(Errno.ENOPKG, "Package not installed");
         map.put(Errno.EADV, "Advertise error");
         map.put(Errno.ESRMNT, "Srmount error");
         map.put(Errno.ECOMM, "Communication error on send");
         map.put(Errno.EDOTDOT, "RFS specific error");
         map.put(Errno.ENOTUNIQ, "Name not unique on network");
         map.put(Errno.EBADFD, "File descriptor in bad state");
         map.put(Errno.EREMCHG, "Remote address changed");
         map.put(Errno.ELIBACC, "Can not access a needed shared library");
         map.put(Errno.ELIBBAD, "Accessing a corrupted shared library");
         map.put(Errno.ELIBSCN, ".lib section in a.out corrupted");
         map.put(Errno.ELIBMAX, "Attempting to link in too many shared libraries");
         map.put(Errno.ELIBEXEC, "Cannot exec a shared library directly");
         map.put(Errno.ERESTART, "Interrupted system call should be restarted");
         map.put(Errno.ESTRPIPE, "Streams pipe error");
         map.put(Errno.EUCLEAN, "Structure needs cleaning");
         map.put(Errno.ENOTNAM, "Not a XENIX named type file");
         map.put(Errno.ENAVAIL, "No XENIX semaphores available");
         map.put(Errno.EISNAM, "Is a named type file");
         map.put(Errno.EREMOTEIO, "Remote I/O error");
         map.put(Errno.ECANCELED, "Operation canceled");
         map.put(Errno.EKEYEXPIRED, "Key has expired");
         map.put(Errno.EKEYREJECTED, "Key was rejected by service");
         map.put(Errno.EKEYREVOKED, "Key has been revoked");
         map.put(Errno.EMEDIUMTYPE, "Wrong medium type");
         map.put(Errno.ENOKEY, "Required key not available");
         map.put(Errno.ENOMEDIUM, "No medium found");
         map.put(Errno.ENOTRECOVERABLE, "State not recoverable");
         map.put(Errno.EOWNERDEAD, "Owner died");
         map.put(Errno.ERFKILL, "Operation not possible due to RF-kill");
         map.put(Errno.ENOTSUP, "Operation not supported");
         map.put(Errno.EHWPOISON, "Memory page has hardware error");
         return map;
      }
   }
}
