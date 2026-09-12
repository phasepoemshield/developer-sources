package Nursultan;

import java.util.Map;

record class09748(Map<Long, Integer> pairs) implements class09729 {
   @Override
   public int N(int var1, int var2) {
      Integer var3 = this.pairs.get((long)var1 << 32 | (long)var2 & 4294967295L);
      return var3 == null ? Integer.MIN_VALUE : var3;
   }

   public Map<Long, Integer> N() {
      return this.pairs;
   }
}
