package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.item.ItemStack;

public class Helper381 {
   final String id;
   final String displayName;
   final ItemStack displayStack;
   final List<String> loreKeywords;
   final List<String> requiredKeywords = new ArrayList<>();
   final Map<String, Integer> requiredLoreEnchantments = new HashMap<>();
   final boolean checkByName;
   final boolean checkByItem;
   int buyPrice;

   public Helper381(String var1, String var2, ItemStack var3, List<String> var4, int var5, boolean var6, boolean var7) {
      this.id = var1;
      this.displayName = var2;
      this.displayStack = var3;
      this.loreKeywords = var4;
      this.buyPrice = var5;
      this.checkByName = var6;
      this.checkByItem = var7;
   }

   Helper381 method3795(String... var1) {
      this.requiredKeywords.addAll(Arrays.asList(var1));
      return this;
   }

   Helper381 method3796(String var1, int var2) {
      this.requiredLoreEnchantments.put(var1, var2);
      return this;
   }

   public String method3797() {
      return this.id;
   }

   public String method3798() {
      return this.displayName;
   }

   public ItemStack method3799() {
      return this.displayStack;
   }

   public List<String> method3800() {
      return this.loreKeywords;
   }

   public List<String> method3801() {
      return this.requiredKeywords;
   }

   public Map<String, Integer> method3802() {
      return this.requiredLoreEnchantments;
   }

   public boolean method3803() {
      return this.checkByName;
   }

   public boolean method3804() {
      return this.checkByItem;
   }

   public int method3805() {
      return this.buyPrice;
   }
}
