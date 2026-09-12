package Nursultan;

public interface class11686 {
   default boolean y(String var1) {
      for (String var5 : this.N()) {
         if (var1.contains(var5)) {
            return true;
         }
      }

      return false;
   }

   String[] N();

   void N(String var1);
}
