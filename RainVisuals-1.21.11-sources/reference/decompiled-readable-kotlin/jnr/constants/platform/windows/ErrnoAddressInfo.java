package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from ErrnoAddressInfo.java
public enum ErrnoAddressInfo implements Constant {
   EAI_FAIL(11003L),
   EAI_FAMILY(10047L),
   EAI_BADFLAGS(10022L),
   EAI_SOCKTYPE(10044L),
   EAI_NONAME(11001L),
   EAI_MEMORY(8L),
   EAI_NODATA(11004L),
   EAI_SERVICE(10109L),
   EAI_AGAIN(11002L);

   public static final long MIN_VALUE = 8L;
   private final long value;
   public static final long MAX_VALUE = 11004L;

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return ErrnoAddressInfo.StringTable.descriptions.get(this);
   }

   ErrnoAddressInfo(long value) {
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
   public final long longValue() {
      return this.value;
   }

   // $VF: Compiled from ErrnoAddressInfo.java
   static final class StringTable {
      public static final Map<ErrnoAddressInfo, String> descriptions = generateTable();

      public static final Map<ErrnoAddressInfo, String> generateTable() {
         Map<ErrnoAddressInfo, String> map = new EnumMap<>(ErrnoAddressInfo.class);
         map.put(ErrnoAddressInfo.EAI_AGAIN, "EAI_AGAIN");
         map.put(ErrnoAddressInfo.EAI_BADFLAGS, "EAI_BADFLAGS");
         map.put(ErrnoAddressInfo.EAI_FAIL, "EAI_FAIL");
         map.put(ErrnoAddressInfo.EAI_FAMILY, "EAI_FAMILY");
         map.put(ErrnoAddressInfo.EAI_MEMORY, "EAI_MEMORY");
         map.put(ErrnoAddressInfo.EAI_NODATA, "EAI_NODATA");
         map.put(ErrnoAddressInfo.EAI_NONAME, "EAI_NONAME");
         map.put(ErrnoAddressInfo.EAI_SERVICE, "EAI_SERVICE");
         map.put(ErrnoAddressInfo.EAI_SOCKTYPE, "EAI_SOCKTYPE");
         return map;
      }
   }
}
