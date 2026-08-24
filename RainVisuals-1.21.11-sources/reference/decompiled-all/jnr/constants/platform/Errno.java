package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from Errno.java
public enum Errno implements Constant {
   EMLINK,
   EALREADY,
   ENOLINK,
   EHWPOISON,
   EDEADLK,
   EKEYEXPIRED,
   EXFULL,
   EBFONT,
   EL3HLT,
   EWOULDBLOCK,
   ESPIPE,
   ENOLCK,
   EDESTADDRREQ,
   ENFILE,
   EFTYPE,
   EPFNOSUPPORT,
   EFBIG,
   ETIMEDOUT,
   ENOPKG,
   EIPSEC,
   ERPCMISMATCH,
   ENOTUNIQ,
   __UNKNOWN_CONSTANT__,
   EREMOTE,
   EBADMSG,
   ESTALE,
   EUNATCH,
   ESOCKTNOSUPPORT,
   ENOATTR,
   EOVERFLOW,
   EKEYREJECTED,
   ENODEV,
   ENOMEDIUM,
   EPROGMISMATCH,
   ENOSPC,
   ENOTCAPABLE,
   ENOSR,
   ENOANO,
   ENONET,
   ENOENT,
   ENOKEY,
   ENODATA,
   EDOOFUS,
   EBADR,
   ENETDOWN,
   ECAPMODE,
   EIO,
   ENOSYS,
   EL3RST,
   EISNAM,
   ENETUNREACH,
   EOWNERDEAD,
   ENOMSG,
   EBADRQC,
   ENEEDAUTH,
   ELIBSCN,
   EBADE,
   EPERM,
   ENOTDIR,
   ELIBEXEC,
   EUSERS,
   EMEDIUMTYPE,
   ENOPROTOOPT,
   ESRCH,
   EDEADLOCK,
   EPIPE,
   ECONNREFUSED,
   ENOTSOCK,
   ECONNABORTED,
   ETXTBSY,
   ESHUTDOWN,
   ENOSTR,
   ECOMM,
   ELIBACC,
   EPROGUNAVAIL,
   EILSEQ,
   ENAMETOOLONG,
   EFAULT,
   EXDEV,
   EPROCLIM,
   EINTR,
   EPROTONOSUPPORT,
   ENOCSI,
   ESRMNT,
   EISCONN,
   ERESTART,
   ENAVAIL,
   ELOOP,
   ELNRNG,
   ENOTBLK,
   EAFNOSUPPORT,
   ETOOMANYREFS,
   E2BIG,
   EHOSTDOWN,
   ENOMEM,
   EPROCUNAVAIL,
   EOPNOTSUPP,
   EADDRINUSE,
   EL2NSYNC,
   EIDRM,
   ELIBBAD,
   EREMOTEIO,
   ENOTEMPTY,
   EBADFD,
   EINPROGRESS,
   EDOTDOT,
   EREMCHG,
   ENOTRECOVERABLE,
   ENXIO,
   EKEYREVOKED,
   ENOEXEC,
   EDOM,
   EADDRNOTAVAIL,
   ENETRESET,
   ESTRPIPE,
   EADV,
   ECHILD,
   EBADRPC,
   EBADF,
   EHOSTUNREACH,
   ELIBMAX,
   EAUTH,
   EL2HLT,
   ENOTNAM,
   ECANCELED,
   EBADSLT,
   ETIME,
   ERANGE,
   EACCES,
   EROFS,
   ENOTTY,
   ERFKILL,
   ECHRNG,
   EBUSY,
   ENOBUFS,
   EDQUOT,
   EISDIR,
   ECONNRESET,
   EMSGSIZE,
   EPROTO,
   EAGAIN,
   EMFILE,
   EUCLEAN,
   EMULTIHOP,
   EEXIST,
   EINVAL,
   ENOTSUP,
   ENOTCONN,
   EPROTOTYPE;

   private static final ConstantResolver<Errno> resolver = ConstantResolver.getResolver(Errno.class, 20000, 20999);

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   public static Errno valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   public final String description() {
      return resolver.description(this);
   }
}
