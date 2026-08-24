package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from ErrnoAddressInfo.java
public enum ErrnoAddressInfo implements Constant {
   EAI_FAMILY,
   EAI_FAIL,
   EAI_AGAIN,
   EAI_NODATA,
   EAI_MAX,
   EAI_BADHINTS,
   EAI_PROTOCOL,
   EAI_BADFLAGS,
   EAI_OVERFLOW,
   EAI_ADDRFAMILY,
   EAI_SERVICE,
   EAI_SYSTEM,
   EAI_NONAME,
   __UNKNOWN_CONSTANT__,
   EAI_MEMORY,
   EAI_SOCKTYPE;

   private static final ConstantResolver<ErrnoAddressInfo> resolver = ConstantResolver.getResolver(ErrnoAddressInfo.class, 20000, 29999);

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   public final String description() {
      return resolver.description(this);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   public static ErrnoAddressInfo valueOf(long value) {
      return resolver.valueOf(value);
   }
}
