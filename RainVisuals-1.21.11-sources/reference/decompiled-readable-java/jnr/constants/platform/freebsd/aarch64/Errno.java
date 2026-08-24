/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.freebsd.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Errno
extends Enum<Errno>
implements Constant {
    public static final /* enum */ Errno EIO;
    public static final /* enum */ Errno ENOTCONN;
    public static final /* enum */ Errno EACCES;
    public static final /* enum */ Errno ENOTRECOVERABLE;
    public static final /* enum */ Errno EILSEQ;
    public static final /* enum */ Errno ERPCMISMATCH;
    public static final /* enum */ Errno EMULTIHOP;
    public static final /* enum */ Errno EDEADLK;
    public static final /* enum */ Errno EUSERS;
    public static final /* enum */ Errno ECANCELED;
    public static final /* enum */ Errno EPFNOSUPPORT;
    public static final /* enum */ Errno ENOPROTOOPT;
    public static final /* enum */ Errno EEXIST;
    public static final /* enum */ Errno ESTALE;
    public static final /* enum */ Errno ECHILD;
    public static final /* enum */ Errno EBADF;
    public static final /* enum */ Errno EIDRM;
    public static final /* enum */ Errno EPROCUNAVAIL;
    public static final /* enum */ Errno EOPNOTSUPP;
    public static final /* enum */ Errno ENETUNREACH;
    public static final /* enum */ Errno ENOTCAPABLE;
    public static final /* enum */ Errno ENOSPC;
    public static final /* enum */ Errno ECONNABORTED;
    public static final /* enum */ Errno ENOSYS;
    public static final /* enum */ Errno ETXTBSY;
    public static final /* enum */ Errno EFBIG;
    public static final /* enum */ Errno E2BIG;
    public static final /* enum */ Errno ECONNRESET;
    public static final /* enum */ Errno EOWNERDEAD;
    public static final /* enum */ Errno ENOTEMPTY;
    public static final /* enum */ Errno ENOMEM;
    public static final /* enum */ Errno EDOM;
    public static final /* enum */ Errno ECONNREFUSED;
    public static final /* enum */ Errno EISCONN;
    public static final /* enum */ Errno EISDIR;
    public static final /* enum */ Errno ENOBUFS;
    public static final /* enum */ Errno ENOLCK;
    public static final /* enum */ Errno ENOLINK;
    public static final /* enum */ Errno ESPIPE;
    public static final /* enum */ Errno ENOATTR;
    public static final /* enum */ Errno EDOOFUS;
    public static final /* enum */ Errno EREMOTE;
    public static final /* enum */ Errno EPERM;
    public static final /* enum */ Errno EPROTOTYPE;
    public static final /* enum */ Errno ENXIO;
    public static final /* enum */ Errno ENOTSOCK;
    public static final /* enum */ Errno ENOENT;
    public static final /* enum */ Errno EDESTADDRREQ;
    public static final /* enum */ Errno ECAPMODE;
    public static final /* enum */ Errno ENEEDAUTH;
    public static final /* enum */ Errno EADDRNOTAVAIL;
    public static final /* enum */ Errno ENETRESET;
    public static final /* enum */ Errno ENOTBLK;
    public static final long MAX_VALUE = 96L;
    public static final /* enum */ Errno EXDEV;
    public static final /* enum */ Errno ETOOMANYREFS;
    public static final /* enum */ Errno ENETDOWN;
    public static final /* enum */ Errno ENOMSG;
    public static final /* enum */ Errno EPROTONOSUPPORT;
    private final long value;
    public static final /* enum */ Errno EBADRPC;
    public static final /* enum */ Errno EMSGSIZE;
    public static final /* enum */ Errno EMLINK;
    public static final /* enum */ Errno ENOTDIR;
    private static final /* synthetic */ Errno[] $VALUES;
    public static final /* enum */ Errno EPIPE;
    public static final /* enum */ Errno EMFILE;
    public static final /* enum */ Errno ERANGE;
    public static final /* enum */ Errno ENODEV;
    public static final /* enum */ Errno ENFILE;
    public static final /* enum */ Errno ENOEXEC;
    public static final /* enum */ Errno EWOULDBLOCK;
    public static final /* enum */ Errno EPROGUNAVAIL;
    public static final /* enum */ Errno EADDRINUSE;
    public static final /* enum */ Errno EPROGMISMATCH;
    public static final /* enum */ Errno EAFNOSUPPORT;
    public static final /* enum */ Errno EHOSTDOWN;
    public static final /* enum */ Errno EFTYPE;
    public static final /* enum */ Errno ENOTSUP;
    public static final /* enum */ Errno EOVERFLOW;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ Errno EBUSY;
    public static final /* enum */ Errno ESRCH;
    public static final /* enum */ Errno EFAULT;
    public static final /* enum */ Errno ELOOP;
    public static final /* enum */ Errno ESHUTDOWN;
    public static final /* enum */ Errno EINTR;
    public static final /* enum */ Errno EDQUOT;
    public static final /* enum */ Errno EINVAL;
    public static final /* enum */ Errno EAGAIN;
    public static final /* enum */ Errno EBADMSG;
    public static final /* enum */ Errno EPROTO;
    public static final /* enum */ Errno EPROCLIM;
    public static final /* enum */ Errno ENOTTY;
    public static final /* enum */ Errno EHOSTUNREACH;
    public static final /* enum */ Errno ESOCKTNOSUPPORT;
    public static final /* enum */ Errno EALREADY;
    public static final /* enum */ Errno ETIMEDOUT;
    public static final /* enum */ Errno EAUTH;
    public static final /* enum */ Errno EINPROGRESS;
    public static final /* enum */ Errno ENAMETOOLONG;
    public static final /* enum */ Errno EROFS;

    @Override
    public final long longValue() {
        return this.value;
    }

    public static Errno valueOf(String name) {
        return Enum.valueOf(Errno.class, name);
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public final int value() {
        return (int)this.value;
    }

    static {
        EPERM = new Errno(1L);
        ENOENT = new Errno(2L);
        ESRCH = new Errno(3L);
        EINTR = new Errno(4L);
        EIO = new Errno(5L);
        ENXIO = new Errno(6L);
        E2BIG = new Errno(7L);
        ENOEXEC = new Errno(8L);
        EBADF = new Errno(9L);
        ECHILD = new Errno(10L);
        EDEADLK = new Errno(11L);
        ENOMEM = new Errno(12L);
        EACCES = new Errno(13L);
        EFAULT = new Errno(14L);
        ENOTBLK = new Errno(15L);
        EBUSY = new Errno(16L);
        EEXIST = new Errno(17L);
        EXDEV = new Errno(18L);
        ENODEV = new Errno(19L);
        ENOTDIR = new Errno(20L);
        EISDIR = new Errno(21L);
        EINVAL = new Errno(22L);
        ENFILE = new Errno(23L);
        EMFILE = new Errno(24L);
        ENOTTY = new Errno(25L);
        ETXTBSY = new Errno(26L);
        EFBIG = new Errno(27L);
        ENOSPC = new Errno(28L);
        ESPIPE = new Errno(29L);
        EROFS = new Errno(30L);
        EMLINK = new Errno(31L);
        EPIPE = new Errno(32L);
        EDOM = new Errno(33L);
        ERANGE = new Errno(34L);
        EWOULDBLOCK = new Errno(35L);
        EAGAIN = new Errno(35L);
        EINPROGRESS = new Errno(36L);
        EALREADY = new Errno(37L);
        ENOTSOCK = new Errno(38L);
        EDESTADDRREQ = new Errno(39L);
        EMSGSIZE = new Errno(40L);
        EPROTOTYPE = new Errno(41L);
        ENOPROTOOPT = new Errno(42L);
        EPROTONOSUPPORT = new Errno(43L);
        ESOCKTNOSUPPORT = new Errno(44L);
        EOPNOTSUPP = new Errno(45L);
        EPFNOSUPPORT = new Errno(46L);
        EAFNOSUPPORT = new Errno(47L);
        EADDRINUSE = new Errno(48L);
        EADDRNOTAVAIL = new Errno(49L);
        ENETDOWN = new Errno(50L);
        ENETUNREACH = new Errno(51L);
        ENETRESET = new Errno(52L);
        ECONNABORTED = new Errno(53L);
        ECONNRESET = new Errno(54L);
        ENOBUFS = new Errno(55L);
        EISCONN = new Errno(56L);
        ENOTCONN = new Errno(57L);
        ESHUTDOWN = new Errno(58L);
        ETOOMANYREFS = new Errno(59L);
        ETIMEDOUT = new Errno(60L);
        ECONNREFUSED = new Errno(61L);
        ELOOP = new Errno(62L);
        ENAMETOOLONG = new Errno(63L);
        EHOSTDOWN = new Errno(64L);
        EHOSTUNREACH = new Errno(65L);
        ENOTEMPTY = new Errno(66L);
        EUSERS = new Errno(68L);
        EDQUOT = new Errno(69L);
        ESTALE = new Errno(70L);
        EREMOTE = new Errno(71L);
        ENOLCK = new Errno(77L);
        ENOSYS = new Errno(78L);
        EOVERFLOW = new Errno(84L);
        EIDRM = new Errno(82L);
        ENOMSG = new Errno(83L);
        EILSEQ = new Errno(86L);
        EBADMSG = new Errno(89L);
        EMULTIHOP = new Errno(90L);
        ENOLINK = new Errno(91L);
        EPROTO = new Errno(92L);
        ECANCELED = new Errno(85L);
        ENOTRECOVERABLE = new Errno(95L);
        EOWNERDEAD = new Errno(96L);
        EAUTH = new Errno(80L);
        EBADRPC = new Errno(72L);
        EDOOFUS = new Errno(88L);
        EFTYPE = new Errno(79L);
        ENEEDAUTH = new Errno(81L);
        ENOATTR = new Errno(87L);
        ENOTSUP = new Errno(45L);
        EPROCLIM = new Errno(67L);
        EPROCUNAVAIL = new Errno(76L);
        EPROGMISMATCH = new Errno(75L);
        EPROGUNAVAIL = new Errno(74L);
        ERPCMISMATCH = new Errno(73L);
        ECAPMODE = new Errno(94L);
        ENOTCAPABLE = new Errno(93L);
        Errno[] errnoArray = new Errno[98];
        errnoArray[0] = EPERM;
        errnoArray[1] = ENOENT;
        errnoArray[2] = ESRCH;
        errnoArray[3] = EINTR;
        errnoArray[4] = EIO;
        errnoArray[5] = ENXIO;
        errnoArray[6] = E2BIG;
        errnoArray[7] = ENOEXEC;
        errnoArray[8] = EBADF;
        errnoArray[9] = ECHILD;
        errnoArray[10] = EDEADLK;
        errnoArray[11] = ENOMEM;
        errnoArray[12] = EACCES;
        errnoArray[13] = EFAULT;
        errnoArray[14] = ENOTBLK;
        errnoArray[15] = EBUSY;
        errnoArray[16] = EEXIST;
        errnoArray[17] = EXDEV;
        errnoArray[18] = ENODEV;
        errnoArray[19] = ENOTDIR;
        errnoArray[20] = EISDIR;
        errnoArray[21] = EINVAL;
        errnoArray[22] = ENFILE;
        errnoArray[23] = EMFILE;
        errnoArray[24] = ENOTTY;
        errnoArray[25] = ETXTBSY;
        errnoArray[26] = EFBIG;
        errnoArray[27] = ENOSPC;
        errnoArray[28] = ESPIPE;
        errnoArray[29] = EROFS;
        errnoArray[30] = EMLINK;
        errnoArray[31] = EPIPE;
        errnoArray[32] = EDOM;
        errnoArray[33] = ERANGE;
        errnoArray[34] = EWOULDBLOCK;
        errnoArray[35] = EAGAIN;
        errnoArray[36] = EINPROGRESS;
        errnoArray[37] = EALREADY;
        errnoArray[38] = ENOTSOCK;
        errnoArray[39] = EDESTADDRREQ;
        errnoArray[40] = EMSGSIZE;
        errnoArray[41] = EPROTOTYPE;
        errnoArray[42] = ENOPROTOOPT;
        errnoArray[43] = EPROTONOSUPPORT;
        errnoArray[44] = ESOCKTNOSUPPORT;
        errnoArray[45] = EOPNOTSUPP;
        errnoArray[46] = EPFNOSUPPORT;
        errnoArray[47] = EAFNOSUPPORT;
        errnoArray[48] = EADDRINUSE;
        errnoArray[49] = EADDRNOTAVAIL;
        errnoArray[50] = ENETDOWN;
        errnoArray[51] = ENETUNREACH;
        errnoArray[52] = ENETRESET;
        errnoArray[53] = ECONNABORTED;
        errnoArray[54] = ECONNRESET;
        errnoArray[55] = ENOBUFS;
        errnoArray[56] = EISCONN;
        errnoArray[57] = ENOTCONN;
        errnoArray[58] = ESHUTDOWN;
        errnoArray[59] = ETOOMANYREFS;
        errnoArray[60] = ETIMEDOUT;
        errnoArray[61] = ECONNREFUSED;
        errnoArray[62] = ELOOP;
        errnoArray[63] = ENAMETOOLONG;
        errnoArray[64] = EHOSTDOWN;
        errnoArray[65] = EHOSTUNREACH;
        errnoArray[66] = ENOTEMPTY;
        errnoArray[67] = EUSERS;
        errnoArray[68] = EDQUOT;
        errnoArray[69] = ESTALE;
        errnoArray[70] = EREMOTE;
        errnoArray[71] = ENOLCK;
        errnoArray[72] = ENOSYS;
        errnoArray[73] = EOVERFLOW;
        errnoArray[74] = EIDRM;
        errnoArray[75] = ENOMSG;
        errnoArray[76] = EILSEQ;
        errnoArray[77] = EBADMSG;
        errnoArray[78] = EMULTIHOP;
        errnoArray[79] = ENOLINK;
        errnoArray[80] = EPROTO;
        errnoArray[81] = ECANCELED;
        errnoArray[82] = ENOTRECOVERABLE;
        errnoArray[83] = EOWNERDEAD;
        errnoArray[84] = EAUTH;
        errnoArray[85] = EBADRPC;
        errnoArray[86] = EDOOFUS;
        errnoArray[87] = EFTYPE;
        errnoArray[88] = ENEEDAUTH;
        errnoArray[89] = ENOATTR;
        errnoArray[90] = ENOTSUP;
        errnoArray[91] = EPROCLIM;
        errnoArray[92] = EPROCUNAVAIL;
        errnoArray[93] = EPROGMISMATCH;
        errnoArray[94] = EPROGUNAVAIL;
        errnoArray[95] = ERPCMISMATCH;
        errnoArray[96] = ECAPMODE;
        errnoArray[97] = ENOTCAPABLE;
        $VALUES = errnoArray;
    }

    public static Errno[] values() {
        return (Errno[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private Errno(long value) {
        this.value = value;
    }

    static final class StringTable {
        public static final Map<Errno, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<Errno, String> generateTable() {
            EnumMap<Errno, String> map = new EnumMap<Errno, String>(Errno.class);
            map.put(EPERM, "Operation not permitted");
            map.put(ENOENT, "No such file or directory");
            map.put(ESRCH, "No such process");
            map.put(EINTR, "Interrupted system call");
            map.put(EIO, "Input/output error");
            map.put(ENXIO, "Device not configured");
            map.put(E2BIG, "Argument list too long");
            map.put(ENOEXEC, "Exec format error");
            map.put(EBADF, "Bad file descriptor");
            map.put(ECHILD, "No child processes");
            map.put(EDEADLK, "Resource deadlock avoided");
            map.put(ENOMEM, "Cannot allocate memory");
            map.put(EACCES, "Permission denied");
            map.put(EFAULT, "Bad address");
            map.put(ENOTBLK, "Block device required");
            map.put(EBUSY, "Device busy");
            map.put(EEXIST, "File exists");
            map.put(EXDEV, "Cross-device link");
            map.put(ENODEV, "Operation not supported by device");
            map.put(ENOTDIR, "Not a directory");
            map.put(EISDIR, "Is a directory");
            map.put(EINVAL, "Invalid argument");
            map.put(ENFILE, "Too many open files in system");
            map.put(EMFILE, "Too many open files");
            map.put(ENOTTY, "Inappropriate ioctl for device");
            map.put(ETXTBSY, "Text file busy");
            map.put(EFBIG, "File too large");
            map.put(ENOSPC, "No space left on device");
            map.put(ESPIPE, "Illegal seek");
            map.put(EROFS, "Read-only file system");
            map.put(EMLINK, "Too many links");
            map.put(EPIPE, "Broken pipe");
            map.put(EDOM, "Numerical argument out of domain");
            map.put(ERANGE, "Result too large");
            map.put(EWOULDBLOCK, "Resource temporarily unavailable");
            map.put(EAGAIN, "Resource temporarily unavailable");
            map.put(EINPROGRESS, "Operation now in progress");
            map.put(EALREADY, "Operation already in progress");
            map.put(ENOTSOCK, "Socket operation on non-socket");
            map.put(EDESTADDRREQ, "Destination address required");
            map.put(EMSGSIZE, "Message too long");
            map.put(EPROTOTYPE, "Protocol wrong type for socket");
            map.put(ENOPROTOOPT, "Protocol not available");
            map.put(EPROTONOSUPPORT, "Protocol not supported");
            map.put(ESOCKTNOSUPPORT, "Socket type not supported");
            map.put(EOPNOTSUPP, "Operation not supported");
            map.put(EPFNOSUPPORT, "Protocol family not supported");
            map.put(EAFNOSUPPORT, "Address family not supported by protocol family");
            map.put(EADDRINUSE, "Address already in use");
            map.put(EADDRNOTAVAIL, "Can't assign requested address");
            map.put(ENETDOWN, "Network is down");
            map.put(ENETUNREACH, "Network is unreachable");
            map.put(ENETRESET, "Network dropped connection on reset");
            map.put(ECONNABORTED, "Software caused connection abort");
            map.put(ECONNRESET, "Connection reset by peer");
            map.put(ENOBUFS, "No buffer space available");
            map.put(EISCONN, "Socket is already connected");
            map.put(ENOTCONN, "Socket is not connected");
            map.put(ESHUTDOWN, "Can't send after socket shutdown");
            map.put(ETOOMANYREFS, "Too many references: can't splice");
            map.put(ETIMEDOUT, "Operation timed out");
            map.put(ECONNREFUSED, "Connection refused");
            map.put(ELOOP, "Too many levels of symbolic links");
            map.put(ENAMETOOLONG, "File name too long");
            map.put(EHOSTDOWN, "Host is down");
            map.put(EHOSTUNREACH, "No route to host");
            map.put(ENOTEMPTY, "Directory not empty");
            map.put(EUSERS, "Too many users");
            map.put(EDQUOT, "Disc quota exceeded");
            map.put(ESTALE, "Stale NFS file handle");
            map.put(EREMOTE, "Too many levels of remote in path");
            map.put(ENOLCK, "No locks available");
            map.put(ENOSYS, "Function not implemented");
            map.put(EOVERFLOW, "Value too large to be stored in data type");
            map.put(EIDRM, "Identifier removed");
            map.put(ENOMSG, "No message of desired type");
            map.put(EILSEQ, "Illegal byte sequence");
            map.put(EBADMSG, "Bad message");
            map.put(EMULTIHOP, "Multihop attempted");
            map.put(ENOLINK, "Link has been severed");
            map.put(EPROTO, "Protocol error");
            map.put(ECANCELED, "Operation canceled");
            map.put(ENOTRECOVERABLE, "State not recoverable");
            map.put(EOWNERDEAD, "Previous owner died");
            map.put(EAUTH, "Authentication error");
            map.put(EBADRPC, "RPC struct is bad");
            map.put(EDOOFUS, "Programming error");
            map.put(EFTYPE, "Inappropriate file type or format");
            map.put(ENEEDAUTH, "Need authenticator");
            map.put(ENOATTR, "Attribute not found");
            map.put(ENOTSUP, "Operation not supported");
            map.put(EPROCLIM, "Too many processes");
            map.put(EPROCUNAVAIL, "Bad procedure for program");
            map.put(EPROGMISMATCH, "Program version wrong");
            map.put(EPROGUNAVAIL, "RPC prog. not avail");
            map.put(ERPCMISMATCH, "RPC version wrong");
            map.put(ECAPMODE, "Not permitted in capability mode");
            map.put(ENOTCAPABLE, "Capabilities insufficient");
            return map;
        }
    }
}

