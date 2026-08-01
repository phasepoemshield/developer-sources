package l;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Helper315 implements Helper205<Boolean> {
   public static final Helper315 INSTANCE = new Helper315();
   public static final List<String> TRUTHY_VALUES = Arrays.asList("1", "true", "yes", "t", "y", "on", "enable");
   public static final List<String> FALSY_VALUES = Arrays.asList("0", "false", "no", "f", "n", "off", "disable");

   public Helper315() {
   }

   @Override
   public Class<Boolean> method1766() {
      return Boolean.class;
   }

   public Boolean method1763(Helper204 var1) {
      String var2 = var1.method393();
      if (TRUTHY_VALUES.contains(var2.toLowerCase(Locale.US))) {
         return true;
      } else if (FALSY_VALUES.contains(var2.toLowerCase(Locale.US))) {
         return false;
      } else {
         throw new IllegalArgumentException("invalid boolean");
      }
   }
}
