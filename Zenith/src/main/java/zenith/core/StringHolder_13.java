package zenith;

public class StringHolder_13 {
   private final String ModuleManager;
   private final int NotificationsHolder;
   private final String floatHolder_3;
   private final String MinecraftClientHolder_5;

   StringHolder_13(String s) {
      String[] astring = s.split(" +", 3);
      if (astring.length < 2) {
         throw new IllegalArgumentException();
      } else {
         this.ModuleManager = astring[0];
         this.NotificationsHolder = Integer.parseInt(astring[1]);
         this.floatHolder_3 = astring.length == 3 ? astring[2] : null;
         this.MinecraftClientHolder_5 = s;
      }
   }

   public String ZenithInternal039() {
      return this.ModuleManager;
   }

   public int SecretKeySpecHolder() {
      return this.NotificationsHolder;
   }

   public String StringHolder_24() {
      return this.floatHolder_3;
   }

   @Override
   public String toString() {
      return this.MinecraftClientHolder_5;
   }
}
