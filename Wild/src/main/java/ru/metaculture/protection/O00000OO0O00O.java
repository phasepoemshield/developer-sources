package ru.metaculture.protection;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public final class O00000OO0O00O extends O00000OO0O0000<Set<String>> {
   public O00000OO0O00O(O00000OO0O00 o00000OO0O00, MultiSelectSetting o0000000OOOOO) {
      super(Objects.requireNonNull(o00000OO0O00, "model"), O00000000(o00000OO0O00, Objects.requireNonNull(o0000000OOOOO, "setting")));
   }

   private static O00000OO0OO O00000000(O00000OO0O00 o00000OO0O00, MultiSelectSetting o0000000OOOOO) {
      final LinkedHashSet var2 = new LinkedHashSet<>(o0000000OOOOO.O000000000000O != null ? o0000000OOOOO.O000000000000O : Collections.emptyList());
      O00000OO0OO0 var3 = O00000000(o00000OO0O00, var2, new O00000OO0O0000.W233<Set<String>>() {
         public Set<String> O00000000(O00000OO0O00 o00000OO0O00) {
            Object var2x = o00000OO0O00.O000000000O0O();
            return this.O00000000(var2x, var2);
         }

         public void O00000000(O00000OO0O00 o00000OO0O00, Set<String> set) {
            o00000OO0O00.O000000000(this.O00000000(set, var2));
         }

         private LinkedHashSet<String> O00000000(Object object, Set<String> set) {
            LinkedHashSet var3x = new LinkedHashSet();
            Object var4 = null;
            boolean var5 = false;
            if (object instanceof Collection var6) {
               var4 = var6;
               var5 = true;
            } else if (object instanceof Set var7) {
               var4 = var7;
               var5 = true;
            }

            if (var4 != null) {
               for (Object var8 : (Collection)var4) {
                  if (var8 != null) {
                     var3x.add(var8.toString());
                  }
               }
            } else if (object instanceof Object[] var11) {
               var5 = true;

               for (Object var10 : var11) {
                  if (var10 != null) {
                     var3x.add(var10.toString());
                  }
               }
            }

            if (!var5 && set != null) {
               var3x.addAll(set);
            }

            return var3x;
         }
      });
      return new O00000OO0OO(O00000000(o00000OO0O00), O00000000000(), o0000000OOOOO, var3, "New Value");
   }
}
