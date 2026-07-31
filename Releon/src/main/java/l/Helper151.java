package l;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class Helper151 {
   private final Map<String, Helper159> scripts = new ConcurrentHashMap<>();

   public Helper151() {
   }

   public Optional<Helper159> method1260(String var1) {
      return this.method1273(var1) ? Optional.empty() : Optional.of(this.scripts.computeIfAbsent(var1, var0 -> new Helper159()));
   }

   public Helper159 method1261(String var1, Helper159 var2) {
      if (!this.method1273(var1) && var2 != null) {
         return this.scripts.put(var1, var2);
      } else {
         throw new IllegalArgumentException("Script name or instance cannot be null or empty");
      }
   }

   public boolean method1262(String var1) {
      return !this.method1273(var1) && this.scripts.containsKey(var1);
   }

   public boolean method1263(String var1) {
      return !this.method1273(var1) && this.method1260(var1).isPresent() && this.method1260(var1).get().method1317();
   }

   public void method1264(String var1) {
      if (!this.method1273(var1)) {
         this.scripts.remove(var1);
      }
   }

   public void method1265(String var1) {
      if (!this.method1273(var1)) {
         this.scripts.computeIfPresent(var1, (var0, var1x) -> {
            var1x.method1314();
            return (Helper159)var1x;
         });
      }
   }

   public void method1266() {
      this.scripts.forEach((var0, var1) -> var1.method1314());
   }

   public void method1267() {
      this.scripts.clear();
   }

   public void method1268(String var1) {
      this.method1269(var1, () -> true);
   }

   public void method1269(String var1, Supplier<Boolean> var2) {
      if ((Boolean)var2.get() && !this.method1273(var1)) {
         this.scripts.computeIfPresent(var1, (var0, var1x) -> {
            var1x.method1315();
            return (Helper159)var1x;
         });
      }
   }

   public void method1270() {
      this.scripts.values().forEach(Helper159::method1315);
   }

   public Set<String> method1271() {
      return Collections.unmodifiableSet(this.scripts.keySet());
   }

   public Map<String, Helper159> method1272() {
      return Collections.unmodifiableMap(this.scripts);
   }

   private boolean method1273(String var1) {
      return var1 == null || var1.trim().isEmpty();
   }
}
