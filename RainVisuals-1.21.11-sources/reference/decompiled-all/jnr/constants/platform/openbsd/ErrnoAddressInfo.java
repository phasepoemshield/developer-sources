package jnr.constants.platform.openbsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from ErrnoAddressInfo.java
public enum ErrnoAddressInfo implements Constant {
   EAI_BADHINTS(-12L),
   EAI_BADFLAGS(-1L),
   EAI_SOCKTYPE(-7L),
   EAI_AGAIN(-3L),
   EAI_FAMILY(-6L),
   EAI_PROTOCOL(-13L),
   EAI_ADDRFAMILY(-9L),
   EAI_MEMORY(-10L),
   EAI_OVERFLOW(-14L),
   EAI_SYSTEM(-11L),
   EAI_NODATA(-5L),
   EAI_NONAME(-2L),
   EAI_FAIL(-4L),
   EAI_SERVICE(-8L);

   public static final long MIN_VALUE = -14L;
   public static final long MAX_VALUE = -1L;
   private final long value;

   @Override
   public final String toString() {
      return ErrnoAddressInfo.StringTable.descriptions.get(this);
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

   ErrnoAddressInfo(long value) {
      this.value = value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   // $VF: Compiled from ErrnoAddressInfo.java
   static final class StringTable {
      public static final Map<ErrnoAddressInfo, String> descriptions = generateTable();

      public static final Map<ErrnoAddressInfo, String> generateTable() {
         Map<ErrnoAddressInfo, String> map = new EnumMap<>(ErrnoAddressInfo.class);
         map.put(ErrnoAddressInfo.EAI_ADDRFAMILY, "EAI_ADDRFAMILY");
         map.put(ErrnoAddressInfo.EAI_AGAIN, "EAI_AGAIN");
         map.put(ErrnoAddressInfo.EAI_BADFLAGS, "EAI_BADFLAGS");
         map.put(ErrnoAddressInfo.EAI_FAIL, "EAI_FAIL");
         map.put(ErrnoAddressInfo.EAI_FAMILY, "EAI_FAMILY");
         map.put(ErrnoAddressInfo.EAI_MEMORY, "EAI_MEMORY");
         map.put(ErrnoAddressInfo.EAI_NODATA, "EAI_NODATA");
         map.put(ErrnoAddressInfo.EAI_NONAME, "EAI_NONAME");
         map.put(ErrnoAddressInfo.EAI_OVERFLOW, "EAI_OVERFLOW");
         map.put(ErrnoAddressInfo.EAI_SERVICE, "EAI_SERVICE");
         map.put(ErrnoAddressInfo.EAI_SOCKTYPE, "EAI_SOCKTYPE");
         map.put(ErrnoAddressInfo.EAI_SYSTEM, "EAI_SYSTEM");
         map.put(ErrnoAddressInfo.EAI_BADHINTS, "EAI_BADHINTS");
         map.put(ErrnoAddressInfo.EAI_PROTOCOL, "EAI_PROTOCOL");
         return map;
      }
   }
}
