package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Errno.java
public enum Errno implements Constant {
   ELIBSCN(85L),
   ENETRESET(129L),
   ENETDOWN(127L),
   ENOTSUP(48L),
   EINVAL(22L),
   ENOTCONN(134L),
   EUSERS(94L),
   EREMCHG(82L),
   EBADMSG(77L),
   EOPNOTSUPP(122L),
   EEXIST(17L),
   ENODATA(61L),
   EPROTOTYPE(98L),
   ENOMEM(12L),
   ENOSPC(28L),
   EL2NSYNC(38L),
   EBFONT(57L),
   ENOPKG(65L),
   EADDRNOTAVAIL(126L),
   ENOTSOCK(95L),
   ENOTBLK(15L),
   E2BIG(7L),
   ETOOMANYREFS(144L),
   ESTRPIPE(92L),
   ESRMNT(69L),
   EDESTADDRREQ(96L),
   ENOENT(2L),
   ENOEXEC(8L),
   ECONNABORTED(130L),
   ETIMEDOUT(145L),
   EBUSY(16L),
   ESOCKTNOSUPPORT(121L),
   ENAMETOOLONG(78L),
   EINTR(4L),
   EL2HLT(44L),
   EHOSTDOWN(147L),
   EUNATCH(42L),
   ENOSYS(89L),
   EREMOTE(66L),
   EXFULL(52L),
   EBADSLT(55L),
   ESTALE(151L),
   EFBIG(27L),
   ENODEV(19L),
   ENONET(64L),
   ECONNRESET(131L),
   EMSGSIZE(97L),
   EMFILE(24L),
   ENFILE(23L),
   ERANGE(34L),
   EDOM(33L),
   EPROTO(71L),
   ESRCH(3L),
   EDEADLOCK(56L),
   EACCES(13L),
   ENOLCK(46L),
   ENOBUFS(132L),
   ELIBACC(83L),
   ENOTEMPTY(93L),
   ESHUTDOWN(143L),
   ELIBMAX(86L),
   EWOULDBLOCK(11L),
   EIO(5L),
   ESPIPE(29L),
   EDQUOT(49L),
   ELOOP(90L),
   EMLINK(31L),
   ENOTUNIQ(80L),
   ENOPROTOOPT(99L),
   ENOMSG(35L),
   EHOSTUNREACH(148L),
   ENOCSI(43L),
   ECHILD(10L),
   ENOTDIR(20L),
   EBADE(50L),
   EADV(68L),
   EL3HLT(39L),
   ELNRNG(41L),
   EIDRM(36L),
   ECANCELED(47L),
   EPFNOSUPPORT(123L),
   EMULTIHOP(74L),
   EBADRQC(54L),
   EISDIR(21L),
   ERESTART(91L),
   EBADFD(81L),
   EILSEQ(88L),
   EAFNOSUPPORT(124L),
   EALREADY(149L),
   ETXTBSY(26L),
   EFAULT(14L),
   EDEADLK(45L),
   ECONNREFUSED(146L),
   EOWNERDEAD(58L),
   ENOTTY(25L),
   EADDRINUSE(125L),
   ETIME(62L),
   EPROTONOSUPPORT(120L),
   ECOMM(70L),
   ENOANO(53L),
   ENETUNREACH(128L),
   ENOSR(63L),
   EINPROGRESS(150L),
   ENOTRECOVERABLE(59L),
   EROFS(30L),
   EAGAIN(11L),
   ECHRNG(37L),
   EBADF(9L),
   EPERM(1L),
   EISCONN(133L),
   EPIPE(32L),
   ENOSTR(60L),
   EBADR(51L),
   ENXIO(6L),
   EOVERFLOW(79L),
   ELIBEXEC(87L),
   EXDEV(18L),
   EL3RST(40L),
   ELIBBAD(84L),
   ENOLINK(67L);

   private final long value;
   public static final long MAX_VALUE = 151L;
   public static final long MIN_VALUE = 1L;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   Errno(long value) {
      this.value = value;
   }

   @Override
   public final String toString() {
      return Errno.StringTable.descriptions.get(this);
   }

   @Override
   public final long longValue() {
      return this.value;
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
         map.put(Errno.EDEADLK, "Deadlock situation detected/avoided");
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
         map.put(Errno.ENOTTY, "Inappropriate ioctl for device");
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
         map.put(Errno.ENOPROTOOPT, "Option not supported by protocol");
         map.put(Errno.EPROTONOSUPPORT, "Protocol not supported");
         map.put(Errno.ESOCKTNOSUPPORT, "Socket type not supported");
         map.put(Errno.EOPNOTSUPP, "Operation not supported on transport endpoint");
         map.put(Errno.EPFNOSUPPORT, "Protocol family not supported");
         map.put(Errno.EAFNOSUPPORT, "Address family not supported by protocol family");
         map.put(Errno.EADDRINUSE, "Address already in use");
         map.put(Errno.EADDRNOTAVAIL, "Cannot assign requested address");
         map.put(Errno.ENETDOWN, "Network is down");
         map.put(Errno.ENETUNREACH, "Network is unreachable");
         map.put(Errno.ENETRESET, "Network dropped connection because of reset");
         map.put(Errno.ECONNABORTED, "Software caused connection abort");
         map.put(Errno.ECONNRESET, "Connection reset by peer");
         map.put(Errno.ENOBUFS, "No buffer space available");
         map.put(Errno.EISCONN, "Transport endpoint is already connected");
         map.put(Errno.ENOTCONN, "Transport endpoint is not connected");
         map.put(Errno.ESHUTDOWN, "Cannot send after socket shutdown");
         map.put(Errno.ETOOMANYREFS, "Too many references: cannot splice");
         map.put(Errno.ETIMEDOUT, "Connection timed out");
         map.put(Errno.ECONNREFUSED, "Connection refused");
         map.put(Errno.ELOOP, "Number of symbolic links encountered during path name traversal exceeds MAXSYMLINKS");
         map.put(Errno.ENAMETOOLONG, "File name too long");
         map.put(Errno.EHOSTDOWN, "Host is down");
         map.put(Errno.EHOSTUNREACH, "No route to host");
         map.put(Errno.ENOTEMPTY, "Directory not empty");
         map.put(Errno.EUSERS, "Too many users");
         map.put(Errno.EDQUOT, "Disc quota exceeded");
         map.put(Errno.ESTALE, "Stale NFS file handle");
         map.put(Errno.EREMOTE, "Object is remote");
         map.put(Errno.ENOLCK, "No record locks available");
         map.put(Errno.ENOSYS, "Operation not applicable");
         map.put(Errno.EOVERFLOW, "Value too large for defined data type");
         map.put(Errno.EIDRM, "Identifier removed");
         map.put(Errno.ENOMSG, "No message of desired type");
         map.put(Errno.EILSEQ, "Illegal byte sequence");
         map.put(Errno.EBADMSG, "Not a data message");
         map.put(Errno.EMULTIHOP, "Multihop attempted");
         map.put(Errno.ENODATA, "No data available");
         map.put(Errno.ENOLINK, "Link has been severed");
         map.put(Errno.ENOSR, "Out of stream resources");
         map.put(Errno.ENOSTR, "Not a stream device");
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
         map.put(Errno.EBADE, "Checksum failure");
         map.put(Errno.EBADR, "Too fragmented");
         map.put(Errno.EXFULL, "Message tables full");
         map.put(Errno.ENOANO, "Cryptographic key not available");
         map.put(Errno.EBADRQC, "Bad request code");
         map.put(Errno.EBADSLT, "Invalid slot");
         map.put(Errno.EDEADLOCK, "File locking deadlock");
         map.put(Errno.EBFONT, "Bad font file format");
         map.put(Errno.ENONET, "Machine is not on the network");
         map.put(Errno.ENOPKG, "Package not installed");
         map.put(Errno.EADV, "Advertise error");
         map.put(Errno.ESRMNT, "Srmount error");
         map.put(Errno.ECOMM, "Communication error on send");
         map.put(Errno.ENOTUNIQ, "Name not unique on network");
         map.put(Errno.EBADFD, "File descriptor in bad state");
         map.put(Errno.EREMCHG, "Remote address changed");
         map.put(Errno.ELIBACC, "Can not access a needed shared library");
         map.put(Errno.ELIBBAD, "Accessing a corrupted shared library");
         map.put(Errno.ELIBSCN, ".lib section in a.out corrupted");
         map.put(Errno.ELIBMAX, "Attempting to link in more shared libraries than system limit");
         map.put(Errno.ELIBEXEC, "Can not exec a shared library directly");
         map.put(Errno.ERESTART, "Error 91");
         map.put(Errno.ESTRPIPE, "Error 92");
         map.put(Errno.ECANCELED, "Operation canceled");
         map.put(Errno.ENOTRECOVERABLE, "Lock is not recoverable");
         map.put(Errno.EOWNERDEAD, "Owner of the lock died");
         map.put(Errno.ENOTSUP, "Operation not supported");
         return map;
      }
   }
}
