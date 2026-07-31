package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public interface O00000OO0OO0<T> {
   T O00000000();

   void O00000000(T object);

   T O000000000();

   void O0000000000();

   static O00000OO0OO0<?> O00000000(Setting o0000000OOO00O) {
      Objects.requireNonNull(o0000000OOO00O, "setting");
      if (o0000000OOO00O instanceof BooleanSetting var1) {
         return new O00000OO0OO0<Boolean>() {
            public Boolean O00000000() {
               return var1.O0000000000();
            }

            public void O00000000(Boolean boolean_) {
               if (boolean_ != null) {
                  var1.O000000000(boolean_);
               }
            }

            public Boolean O000000000() {
               return false;
            }

            @Override
            public void O0000000000() {
               var1.O000000000(false);
            }
         };
      } else if (o0000000OOO00O instanceof NumberSetting var2) {
         return new O00000OO0OO0<Double>() {
            public Double O00000000() {
               return (double)var2.O0000000000();
            }

            public void O00000000(Double double_) {
               if (double_ != null) {
                  var2.O00000000000 = double_.floatValue();
               }
            }

            public Double O000000000() {
               return (double)var2.O000000000000;
            }

            @Override
            public void O0000000000() {
               var2.O00000000000 = var2.O000000000000;
            }
         };
      } else if (o0000000OOO00O instanceof ModeSetting var3) {
         return new O00000OO0OO0<String>() {
            public String O00000000() {
               return var3.O0000000000();
            }

            public void O00000000(String string) {
               if (var3.O00000000000.contains(string)) {
                  var3.O000000000000 = string;
                  var3.O00000000000O = var3.O00000000000.indexOf(string);
               }
            }

            public String O000000000() {
               return var3.O00000000000.isEmpty() ? "" : var3.O00000000000.get(0);
            }

            @Override
            public void O0000000000() {
               if (!var3.O00000000000.isEmpty()) {
                  var3.O000000000000 = var3.O00000000000.get(0);
                  var3.O00000000000O = 0;
               }
            }
         };
      } else if (o0000000OOO00O instanceof MultiSelectSetting var4) {
         return new O00000OO0OO0<Set<String>>() {
            public Set<String> O00000000() {
               return new LinkedHashSet<>(var4.O000000000000O != null ? var4.O000000000000O : List.of());
            }

            public void O00000000(Set<String> set) {
               if (set != null) {
                  var4.O000000000000O = new ArrayList<>(set);
               } else {
                  var4.O000000000000O = new ArrayList<>();
               }
            }

            public Set<String> O000000000() {
               return new LinkedHashSet<>();
            }

            @Override
            public void O0000000000() {
               var4.O000000000000O = new ArrayList<>();
            }
         };
      } else {
         return o0000000OOO00O instanceof ColorSetting var5 ? new O00000OO0OO0<O00000OO0O0OO0>() {
            public O00000OO0O0OO0 O00000000() {
               return O00000OO0O0OO0.O00000000(var5.O000000000000(), var5.O0000000000O00, var5.O0000000000O0O, var5.O0000000000OO);
            }

            public void O00000000(O00000OO0O0OO0 o00000OO0O0OO0) {
               if (o00000OO0O0OO0 != null) {
                  var5.O00000000(o00000OO0O0OO0.O00000000());
                  var5.O0000000000O00 = o00000OO0O0OO0.O000000000();
                  var5.O0000000000O0O = o00000OO0O0OO0.O0000000000();
                  var5.O0000000000OO = o00000OO0O0OO0.O00000000000();
               }
            }

            public O00000OO0O0OO0 O000000000() {
               return O00000OO0O0OO0.O00000000(0.0F, 1.0F, 1.0F, 1.0F);
            }

            @Override
            public void O0000000000() {
               var5.O000000000000 = 0.0F;
               var5.O0000000000O00 = 1.0F;
               var5.O0000000000O0O = 1.0F;
               var5.O0000000000OO = 1.0F;
            }
         } : new O00000OO0OO0<Object>() {
            @Override
            public Object O00000000() {
               return null;
            }

            @Override
            public void O00000000(Object object) {
            }

            @Override
            public Object O000000000() {
               return null;
            }

            @Override
            public void O0000000000() {
            }
         };
      }
   }
}
