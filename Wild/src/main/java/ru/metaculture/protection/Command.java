package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Supplier;
import lombok.Generated;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public abstract class Command implements MinecraftAccessor {
   private final String O00000000;
   private final String O000000000;
   private final String O0000000000;
   private final Map<String, Supplier<List<String>>> O00000000000 = new HashMap<>();

   public Command(String string, String string2, String string3) {
      this.O00000000 = string;
      this.O000000000 = string2;
      this.O0000000000 = string3;
   }

   @Compile
   protected void O00000000(String string, Supplier<List<String>> supplier) {
      if (string == null || string.isBlank()) {
         return;
      }

      this.O00000000000.put(string.toLowerCase(Locale.ROOT), Objects.requireNonNullElse(supplier, List::of));
   }

   public List<String> O00000000(String[] strings) {
      if (strings.length == 2) {
         return this.O00000000000.keySet().stream().filter(string -> string.startsWith(strings[1].toLowerCase())).toList();
      } else {
         if (strings.length == 3) {
            String var2 = strings[1].toLowerCase(Locale.ROOT);
            if (this.O00000000000.containsKey(var2)) {
               List<String> var3;

               try {
                  var3 = this.O00000000000.get(var2).get();
               } catch (RuntimeException var5) {
                  return List.of();
               }

               return var3 == null
                  ? List.of()
                  : var3.stream()
                     .filter(Objects::nonNull)
                     .filter(string -> string.toLowerCase(Locale.ROOT).startsWith(strings[2].toLowerCase(Locale.ROOT)))
                     .toList();
            }
         }

         return new ArrayList<>();
      }
   }

   public abstract void O000000000(String[] strings);

   @Generated
   public String O00000000() {
      return this.O00000000;
   }

   @Generated
   public String O000000000() {
      return this.O000000000;
   }

   @Generated
   public String O0000000000() {
      return this.O0000000000;
   }

   static {
      Loader.initialize();
   }
}
