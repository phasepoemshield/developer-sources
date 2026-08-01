package l;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;

public class Helper323 {
   private Set<String> notFoundItems = ConcurrentHashMap.newKeySet();
   private Set<String> processedItems = ConcurrentHashMap.newKeySet();
   private Set<String> sentItems = ConcurrentHashMap.newKeySet();
   private Map<String, Long> lastMessageTime = new ConcurrentHashMap<>();
   private int failedCount = 0;
   private Helper358 autoBuyManager;

   public Helper323(Helper358 var1) {
      this.autoBuyManager = var1;
   }

   public void method3205() {
      this.notFoundItems.clear();
      this.processedItems.clear();
      this.sentItems.clear();
      this.lastMessageTime.clear();
      this.failedCount = 0;
   }

   public void method3206(MinecraftClient var1, int var2, List<Slot> var3, Helper317 var4, Helper321 var5) {
      Slot var6 = this.method3214(var3, var4.itemName, var4.price);
      if (var6 != null) {
         var1.interactionManager.clickSlot(var2, var6.id, 0, SlotActionType.PICKUP, var1.player);
         this.failedCount = 0;
      } else {
         String var7 = var4.itemName + "|" + var4.price;
         if (!this.notFoundItems.contains(var7)) {
            this.notFoundItems.add(var7);
         }

         this.failedCount++;
      }
   }

   public boolean method3207() {
      return this.failedCount > 3;
   }

   public void method3208(MinecraftClient var1, int var2) {
      var1.interactionManager.clickSlot(var2, 49, 0, SlotActionType.PICKUP, var1.player);
      this.notFoundItems.clear();
      this.failedCount = 0;
   }

   public void method3209(MinecraftClient var1, int var2, List<Slot> var3) {
      this.method3218(var1, var2, var3);
   }

   public boolean method3210(MinecraftClient var1, int var2, List<Slot> var3) {
      return this.method3218(var1, var2, var3);
   }

   public boolean method3211(List<Slot> var1) {
      return this.method3219(var1) != null;
   }

   public List<Slot> method3212(List<Slot> var1, List<Helper465> var2) {
      ArrayList<Slot> var3 = new ArrayList<>();

      for (int var4 = 0; var4 <= 44; var4++) {
         Slot var5 = (Slot)var1.get(var4);
         if (!var5.getStack().isEmpty()) {
            ItemStack var6 = var5.getStack();
            if (!Helper303.method3004(var6) || !Helper303.method3002(var6)) {
               int var7 = Helper303.method2999(var6);
               if (var7 > 0) {
                  for (Helper465 var9 : var2) {
                     int var10 = var9.method368().method3592();
                     if (var7 <= var10) {
                        if (var9.method368().method3595()) {
                           int var11 = var6.getCount();
                           if (var11 < var9.method368().method3594()) {
                              continue;
                           }
                        }

                        if (this.method3215(var6, var9)) {
                           var3.add(var5);
                           break;
                        }
                     }
                  }
               }
            }
         }
      }

      var3.sort(Comparator.comparingInt(var0 -> Helper303.method2999(var0.getStack())));
      return var3;
   }

   public void method3213(List<Slot> var1, Helper321 var2) {
      HashMap<String, Integer> var3 = new HashMap<>();

      for (Slot var5 : var1) {
         ItemStack var6 = var5.getStack();
         String var7 = var6.getName().getString();
         String var8 = Helper303.funTimePricePattern.matcher(var7).replaceAll("").trim();
         int var9 = Helper303.method2999(var6);
         String var10 = var8 + "|" + var9;
         var3.put(var8, var3.getOrDefault(var8, 0) + 1);
         if (!this.sentItems.contains(var10)) {
            this.sentItems.add(var10);
            var2.method3185(var8, var9);
         }
      }

      long var11 = System.currentTimeMillis();

      for (Map.Entry<String, Integer> var13 : var3.entrySet()) {
         String var14 = (String)var13.getKey();
         Long var15 = this.lastMessageTime.get(var14);
         if (var15 == null || var11 - var15 > 2000L) {
            this.lastMessageTime.put(var14, var11);
         }
      }
   }

   private Slot method3214(List<Slot> var1, String var2, int var3) {
      String var4 = this.method3217(var2);

      for (int var5 = 0; var5 <= 44; var5++) {
         Slot var6 = (Slot)var1.get(var5);
         if (!var6.getStack().isEmpty()) {
            ItemStack var7 = var6.getStack();
            if (!Helper303.method3004(var7) || !Helper303.method3002(var7)) {
               String var8 = this.method3217(var7.getName().getString());
               int var9 = Helper303.method2999(var7);
               if (var9 == var3 && this.method3216(var8, var4)) {
                  return var6;
               }
            }
         }
      }

      return null;
   }

   private boolean method3215(ItemStack var1, Helper465 var2) {
      String var3 = this.method3217(var1.getName().getString());
      String var4 = this.method3217(var2.method368().method3596());
      if (this.method3216(var3, var4)) {
         return true;
      } else {
         String var5 = this.method3217(var2.method364());
         return this.method3216(var3, var5) ? true : Helper303.method3005(var1, var2.method365());
      }
   }

   private boolean method3216(String var1, String var2) {
      return !var1.isEmpty() && !var2.isEmpty() ? var1.equals(var2) || var1.contains(var2) || var2.contains(var1) : false;
   }

   private String method3217(String var1) {
      String var2 = Helper303.funTimePricePattern.matcher(var1 == null ? "" : var1).replaceAll("").trim();
      return Helper303.method3001(var2);
   }

   private boolean method3218(MinecraftClient var1, int var2, List<Slot> var3) {
      Slot var4 = this.method3219(var3);
      if (var4 == null) {
         return false;
      } else {
         var1.interactionManager.clickSlot(var2, var4.id, 0, SlotActionType.PICKUP, var1.player);
         return true;
      }
   }

   private Slot method3219(List<Slot> var1) {
      return var1.stream()
         .filter(var0 -> !var0.getStack().isEmpty())
         .filter(var0 -> var0.getStack().getItem() == Items.GREEN_STAINED_GLASS_PANE)
         .findFirst()
         .orElse(null);
   }
}
