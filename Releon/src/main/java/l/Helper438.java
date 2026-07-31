package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Helper438 {
   final String itemId;
   final String searchTerm;
   final List<String> requiredKeywords = new ArrayList<>();
   final Map<String, Integer> requiredEnchantments = new HashMap<>();
   final Map<String, Integer> requiredLoreEnchantments = new HashMap<>();

   Helper438(String var1, String var2) {
      this.itemId = var1;
      this.searchTerm = var2;
   }

   Helper438 method4553(String... var1) {
      this.requiredKeywords.addAll(Arrays.asList(var1));
      return this;
   }

   Helper438 method4554(String var1, int var2) {
      this.requiredEnchantments.put(var1, var2);
      return this;
   }

   Helper438 method4555(String var1, int var2) {
      this.requiredLoreEnchantments.put(var1, var2);
      return this;
   }
}
