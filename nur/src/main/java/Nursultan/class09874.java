package Nursultan;

import java.util.ArrayList;
import java.util.List;

record class09874(List<String> segments) {
   @Override
   public String toString() {
      return String.join("/", this.segments);
   }

   class09874 y(String var1) {
      ArrayList var2 = new ArrayList(this.segments.size() + 1);
      var2.addAll(this.segments);
      var2.add(var1);
      return new class09874(List.copyOf(var2));
   }

   public List<String> N() {
      return this.segments;
   }

   static class09874 N(String var0) {
      return new class09874(List.of(class09853.N(var0, "rootKey")));
   }
}
