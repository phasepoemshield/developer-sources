package Nursultan;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class class09327 {
   public Object N_0;

   public boolean L(String var1) {
      return ((Map)this.N_0).containsKey(var1);
   }

   public Stream<String> L() {
      return ((Map)this.N_0).keySet().stream();
   }

   public class09327() {
      this.i();
      this.N_0 = new LinkedHashMap();
   }

   private void i() {
   }

   public List<class09332> y() {
      return List.copyOf(((Map)this.N_0).values());
   }

   public boolean y(String var1) {
      class09332 var2 = (class09332)((Map)this.N_0).remove(var1);
      if (var2 == null) {
         return false;
      } else {
         class11938.L().L(class11353.y(var2));
         class11938.L().L(class11364.N(class09378.FRIENDS));
         return true;
      }
   }

   public Optional<class09332> N(String var1) {
      return Optional.ofNullable((class09332)((Map)this.N_0).get(var1));
   }

   public boolean N(String var1, long var2) {
      if (((Map)this.N_0).containsKey(var1)) {
         return false;
      } else {
         class09332 var4 = new class09332(var1, var2);
         ((Map)this.N_0).put(var1, var4);
         class11938.L().L(class11353.N(var4));
         class11938.L().L(class11364.N(class09378.FRIENDS));
         return true;
      }
   }

   public void N() {
      if (!((Map)this.N_0).isEmpty()) {
         ((Map)this.N_0).clear();
         class11938.L().L(class11353.L());
         class11938.L().L(class11364.N(class09378.FRIENDS));
      }
   }
}
