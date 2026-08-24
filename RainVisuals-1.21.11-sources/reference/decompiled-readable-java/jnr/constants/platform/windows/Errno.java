/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Errno
extends Enum<Errno>
implements Constant {
    public static final /* enum */ Errno ENAMETOOLONG;
    public static final /* enum */ Errno ECONNABORTED;
    private final long value;
    public static final /* enum */ Errno ESRCH;
    public static final /* enum */ Errno ENOTSOCK;
    public static final /* enum */ Errno ENODEV;
    public static final /* enum */ Errno ENOTCONN;
    public static final /* enum */ Errno EEXIST;
    public static final /* enum */ Errno EADDRINUSE;
    public static final /* enum */ Errno EILSEQ;
    public static final /* enum */ Errno EIO;
    public static final /* enum */ Errno ENOEXEC;
    public static final /* enum */ Errno ERANGE;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ Errno ENOTEMPTY;
    public static final /* enum */ Errno EMLINK;
    public static final /* enum */ Errno EAFNOSUPPORT;
    public static final /* enum */ Errno EDEADLOCK;
    public static final /* enum */ Errno ENOTTY;
    public static final /* enum */ Errno EISDIR;
    public static final /* enum */ Errno EINTR;
    public static final /* enum */ Errno EADDRNOTAVAIL;
    public static final /* enum */ Errno ENFILE;
    public static final /* enum */ Errno ENOTDIR;
    public static final /* enum */ Errno ECONNREFUSED;
    public static final /* enum */ Errno EFAULT;
    public static final /* enum */ Errno EDESTADDRREQ;
    public static final /* enum */ Errno EFBIG;
    public static final /* enum */ Errno ENXIO;
    public static final /* enum */ Errno ENETRESET;
    public static final /* enum */ Errno ENOSYS;
    public static final /* enum */ Errno EIDRM;
    public static final /* enum */ Errno ENOSR;
    public static final /* enum */ Errno EMSGSIZE;
    public static final /* enum */ Errno EINVAL;
    public static final /* enum */ Errno EOWNERDEAD;
    public static final /* enum */ Errno ENOPROTOOPT;
    public static final /* enum */ Errno EDEADLK;
    public static final /* enum */ Errno EDOM;
    public static final /* enum */ Errno EOPNOTSUPP;
    public static final /* enum */ Errno EOVERFLOW;
    public static final /* enum */ Errno ENOBUFS;
    public static final /* enum */ Errno EALREADY;
    public static final /* enum */ Errno EHOSTUNREACH;
    public static final /* enum */ Errno EWOULDBLOCK;
    public static final /* enum */ Errno ENOLINK;
    public static final /* enum */ Errno ECHILD;
    public static final /* enum */ Errno ENOMSG;
    public static final /* enum */ Errno ENETUNREACH;
    public static final /* enum */ Errno ELOOP;
    public static final /* enum */ Errno EPIPE;
    public static final /* enum */ Errno ENOMEM;
    public static final /* enum */ Errno EXDEV;
    public static final /* enum */ Errno ENOLCK;
    public static final /* enum */ Errno EBUSY;
    public static final /* enum */ Errno EMFILE;
    public static final /* enum */ Errno EPERM;
    public static final /* enum */ Errno ENOTRECOVERABLE;
    public static final /* enum */ Errno EISCONN;
    public static final /* enum */ Errno EAGAIN;
    public static final /* enum */ Errno EROFS;
    public static final /* enum */ Errno ETXTBSY;
    public static final /* enum */ Errno EACCES;
    public static final /* enum */ Errno EPROTO;
    public static final /* enum */ Errno ENETDOWN;
    public static final /* enum */ Errno ENOTSUP;
    public static final /* enum */ Errno EPROTOTYPE;
    public static final /* enum */ Errno EINPROGRESS;
    public static final /* enum */ Errno ENODATA;
    public static final /* enum */ Errno ESPIPE;
    public static final /* enum */ Errno EBADF;
    public static final /* enum */ Errno ECANCELED;
    public static final long MAX_VALUE = 140L;
    public static final /* enum */ Errno EBADMSG;
    public static final /* enum */ Errno ENOENT;
    public static final /* enum */ Errno ECONNRESET;
    public static final /* enum */ Errno EPROTONOSUPPORT;
    public static final /* enum */ Errno ETIMEDOUT;
    public static final /* enum */ Errno ENOSPC;
    public static final /* enum */ Errno ENOSTR;
    private static final /* synthetic */ Errno[] $VALUES;
    public static final /* enum */ Errno ETIME;
    public static final /* enum */ Errno E2BIG;

    @Override
    public final long longValue() {
        return this.value;
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
        EDEADLK = new Errno(36L);
        ENOMEM = new Errno(12L);
        EACCES = new Errno(13L);
        EFAULT = new Errno(14L);
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
        ETXTBSY = new Errno(139L);
        EFBIG = new Errno(27L);
        ENOSPC = new Errno(28L);
        ESPIPE = new Errno(29L);
        EROFS = new Errno(30L);
        EMLINK = new Errno(31L);
        EPIPE = new Errno(32L);
        EDOM = new Errno(33L);
        ERANGE = new Errno(34L);
        EWOULDBLOCK = new Errno(140L);
        EAGAIN = new Errno(11L);
        EINPROGRESS = new Errno(112L);
        EALREADY = new Errno(103L);
        ENOTSOCK = new Errno(128L);
        EDESTADDRREQ = new Errno(109L);
        EMSGSIZE = new Errno(115L);
        EPROTOTYPE = new Errno(136L);
        ENOPROTOOPT = new Errno(123L);
        EPROTONOSUPPORT = new Errno(135L);
        EOPNOTSUPP = new Errno(130L);
        EAFNOSUPPORT = new Errno(102L);
        EADDRINUSE = new Errno(100L);
        EADDRNOTAVAIL = new Errno(101L);
        ENETDOWN = new Errno(116L);
        ENETUNREACH = new Errno(118L);
        ENETRESET = new Errno(117L);
        ECONNABORTED = new Errno(106L);
        ECONNRESET = new Errno(108L);
        ENOBUFS = new Errno(119L);
        EISCONN = new Errno(113L);
        ENOTCONN = new Errno(126L);
        ETIMEDOUT = new Errno(138L);
        ECONNREFUSED = new Errno(107L);
        ELOOP = new Errno(114L);
        ENAMETOOLONG = new Errno(38L);
        EHOSTUNREACH = new Errno(110L);
        ENOTEMPTY = new Errno(41L);
        ENOLCK = new Errno(39L);
        ENOSYS = new Errno(40L);
        EOVERFLOW = new Errno(132L);
        EIDRM = new Errno(111L);
        ENOMSG = new Errno(122L);
        EILSEQ = new Errno(42L);
        EBADMSG = new Errno(104L);
        ENODATA = new Errno(120L);
        ENOLINK = new Errno(121L);
        ENOSR = new Errno(124L);
        ENOSTR = new Errno(125L);
        EPROTO = new Errno(134L);
        ETIME = new Errno(137L);
        EDEADLOCK = new Errno(36L);
        ECANCELED = new Errno(105L);
        ENOTRECOVERABLE = new Errno(127L);
        EOWNERDEAD = new Errno(133L);
        ENOTSUP = new Errno(129L);
        Errno[] errnoArray = new Errno[79];
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
        errnoArray[14] = EBUSY;
        errnoArray[15] = EEXIST;
        errnoArray[16] = EXDEV;
        errnoArray[17] = ENODEV;
        errnoArray[18] = ENOTDIR;
        errnoArray[19] = EISDIR;
        errnoArray[20] = EINVAL;
        errnoArray[21] = ENFILE;
        errnoArray[22] = EMFILE;
        errnoArray[23] = ENOTTY;
        errnoArray[24] = ETXTBSY;
        errnoArray[25] = EFBIG;
        errnoArray[26] = ENOSPC;
        errnoArray[27] = ESPIPE;
        errnoArray[28] = EROFS;
        errnoArray[29] = EMLINK;
        errnoArray[30] = EPIPE;
        errnoArray[31] = EDOM;
        errnoArray[32] = ERANGE;
        errnoArray[33] = EWOULDBLOCK;
        errnoArray[34] = EAGAIN;
        errnoArray[35] = EINPROGRESS;
        errnoArray[36] = EALREADY;
        errnoArray[37] = ENOTSOCK;
        errnoArray[38] = EDESTADDRREQ;
        errnoArray[39] = EMSGSIZE;
        errnoArray[40] = EPROTOTYPE;
        errnoArray[41] = ENOPROTOOPT;
        errnoArray[42] = EPROTONOSUPPORT;
        errnoArray[43] = EOPNOTSUPP;
        errnoArray[44] = EAFNOSUPPORT;
        errnoArray[45] = EADDRINUSE;
        errnoArray[46] = EADDRNOTAVAIL;
        errnoArray[47] = ENETDOWN;
        errnoArray[48] = ENETUNREACH;
        errnoArray[49] = ENETRESET;
        errnoArray[50] = ECONNABORTED;
        errnoArray[51] = ECONNRESET;
        errnoArray[52] = ENOBUFS;
        errnoArray[53] = EISCONN;
        errnoArray[54] = ENOTCONN;
        errnoArray[55] = ETIMEDOUT;
        errnoArray[56] = ECONNREFUSED;
        errnoArray[57] = ELOOP;
        errnoArray[58] = ENAMETOOLONG;
        errnoArray[59] = EHOSTUNREACH;
        errnoArray[60] = ENOTEMPTY;
        errnoArray[61] = ENOLCK;
        errnoArray[62] = ENOSYS;
        errnoArray[63] = EOVERFLOW;
        errnoArray[64] = EIDRM;
        errnoArray[65] = ENOMSG;
        errnoArray[66] = EILSEQ;
        errnoArray[67] = EBADMSG;
        errnoArray[68] = ENODATA;
        errnoArray[69] = ENOLINK;
        errnoArray[70] = ENOSR;
        errnoArray[71] = ENOSTR;
        errnoArray[72] = EPROTO;
        errnoArray[73] = ETIME;
        errnoArray[74] = EDEADLOCK;
        errnoArray[75] = ECANCELED;
        errnoArray[76] = ENOTRECOVERABLE;
        errnoArray[77] = EOWNERDEAD;
        errnoArray[78] = ENOTSUP;
        $VALUES = errnoArray;
    }

    private Errno(long value) {
        this.value = value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static Errno valueOf(String name) {
        return Enum.valueOf(Errno.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static Errno[] values() {
        return (Errno[])$VALUES.clone();
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public final int value() {
        return (int)this.value;
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
            map.put(EINTR, "Interrupted function call");
            map.put(EIO, "Input/output error");
            map.put(ENXIO, "No such device or address");
            map.put(E2BIG, "Arg list too long");
            map.put(ENOEXEC, "Exec format error");
            map.put(EBADF, "Bad file descriptor");
            map.put(ECHILD, "No child processes");
            map.put(EDEADLK, "Resource deadlock avoided");
            map.put(ENOMEM, "Not enough space");
            map.put(EACCES, "Permission denied");
            map.put(EFAULT, "Bad address");
            map.put(EBUSY, "Resource device");
            map.put(EEXIST, "File exists");
            map.put(EXDEV, "Improper link");
            map.put(ENODEV, "No such device");
            map.put(ENOTDIR, "Not a directory");
            map.put(EISDIR, "Is a directory");
            map.put(EINVAL, "Invalid argument");
            map.put(ENFILE, "Too many open files in system");
            map.put(EMFILE, "Too many open files");
            map.put(ENOTTY, "Inappropriate I/O control operation");
            map.put(ETXTBSY, "Unknown error");
            map.put(EFBIG, "File too large");
            map.put(ENOSPC, "No space left on device");
            map.put(ESPIPE, "Invalid seek");
            map.put(EROFS, "Read-only file system");
            map.put(EMLINK, "Too many links");
            map.put(EPIPE, "Broken pipe");
            map.put(EDOM, "Domain error");
            map.put(ERANGE, "Result too large");
            map.put(EWOULDBLOCK, "Unknown error");
            map.put(EAGAIN, "Resource temporarily unavailable");
            map.put(EINPROGRESS, "Unknown error");
            map.put(EALREADY, "Unknown error");
            map.put(ENOTSOCK, "Unknown error");
            map.put(EDESTADDRREQ, "Unknown error");
            map.put(EMSGSIZE, "Unknown error");
            map.put(EPROTOTYPE, "Unknown error");
            map.put(ENOPROTOOPT, "Unknown error");
            map.put(EPROTONOSUPPORT, "Unknown error");
            map.put(EOPNOTSUPP, "Unknown error");
            map.put(EAFNOSUPPORT, "Unknown error");
            map.put(EADDRINUSE, "Unknown error");
            map.put(EADDRNOTAVAIL, "Unknown error");
            map.put(ENETDOWN, "Unknown error");
            map.put(ENETUNREACH, "Unknown error");
            map.put(ENETRESET, "Unknown error");
            map.put(ECONNABORTED, "Unknown error");
            map.put(ECONNRESET, "Unknown error");
            map.put(ENOBUFS, "Unknown error");
            map.put(EISCONN, "Unknown error");
            map.put(ENOTCONN, "Unknown error");
            map.put(ETIMEDOUT, "Unknown error");
            map.put(ECONNREFUSED, "Unknown error");
            map.put(ELOOP, "Unknown error");
            map.put(ENAMETOOLONG, "Filename too long");
            map.put(EHOSTUNREACH, "Unknown error");
            map.put(ENOTEMPTY, "Directory not empty");
            map.put(ENOLCK, "No locks available");
            map.put(ENOSYS, "Function not implemented");
            map.put(EOVERFLOW, "Unknown error");
            map.put(EIDRM, "Unknown error");
            map.put(ENOMSG, "Unknown error");
            map.put(EILSEQ, "Illegal byte sequence");
            map.put(EBADMSG, "Unknown error");
            map.put(ENODATA, "Unknown error");
            map.put(ENOLINK, "Unknown error");
            map.put(ENOSR, "Unknown error");
            map.put(ENOSTR, "Unknown error");
            map.put(EPROTO, "Unknown error");
            map.put(ETIME, "Unknown error");
            map.put(EDEADLOCK, "Resource deadlock avoided");
            map.put(ECANCELED, "Unknown error");
            map.put(ENOTRECOVERABLE, "Unknown error");
            map.put(EOWNERDEAD, "Unknown error");
            map.put(ENOTSUP, "Unknown error");
            return map;
        }
    }
}

