package Nursultan;

import minecraft.class02834;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07438;

public class class11785 extends class11817 {
   public class11785(String var1, boolean var2) {
      super(var1, var2);
   }

   public boolean test(class07049 var1) {
      if (this.U()) {
         return true;
      } else if (!var1.method_5767()) {
         return true;
      } else {
         return !(var1 instanceof class07438 var2) ? false : !class11907.N(var2) || this.N(var2);
      }
   }

   public boolean N(class07438 var1) {
      for (class07085 var3 : class02834.field_49219) {
         if (!var1.method_6118(var3).R()) {
            return true;
         }
      }

      return false;
   }
}
