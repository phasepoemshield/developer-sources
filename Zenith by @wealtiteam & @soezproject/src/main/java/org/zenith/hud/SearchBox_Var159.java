package org.zenith.hud;

import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;

public enum SearchBox_Var159 {
   val178,
   val179,
   val129,
   val296,
   val180,
   val500,
   val297;

   private SearchBox_Var159() {
   }

   public boolean on23(char var1) {
      return switch (this) {
         case val178 -> true;
         case val179 -> Character.isLetter(var1) && var1 <= 127 && Character.isAlphabetic(var1);
         case val129 -> Character.isLetterOrDigit(var1) && var1 <= 127;
         case val296 -> Character.isLetterOrDigit(var1) && var1 <= 127 || var1 == '_';
         case val180 -> Character.isLetterOrDigit(var1) && var1 <= 127 || var1 == '.' || var1 == ':' || var1 == '-' || var1 == '_';
         case val500 -> String.valueOf(var1).matches("[\u0410-\u042f\u0430-\u044f\u0401\u0451]");
         case val297 -> Character.isDigit(var1);
      };
   }
}
