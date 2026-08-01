package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import org.apache.commons.lang3.StringUtils;

public class Helper303 {
   public static final Pattern funTimePricePattern = Pattern.compile("\\$(\\d+(?:[\\s,]\\d{3})*(?:[\\.,]\\d+)?)(?:\\s*([k\\u043am\\u043c]))?\\b", 2);
   private static final Pattern compactPricePattern = Pattern.compile("(\\d+(?:[\\s,.]\\d+)?)(\\s*[k\\u043am\\u043c])\\b", 2);

   public Helper303() {
   }

   public static int method2998(ItemStack var0) {
      if (var0 != null && !var0.isEmpty()) {
         for (String var2 : method3006(var0)) {
            int var3 = method3007(var2);
            if (var3 > 0) {
               return var3;
            }
         }

         ComponentMap var4 = var0.getComponents();
         if (var4 == null) {
            return -1;
         } else {
            String var5 = StringUtils.substringBetween(var4.toString(), "literal{ $", "}[style={color=green}]");
            return method3010(var5);
         }
      } else {
         return -1;
      }
   }

   public static int method2999(ItemStack var0) {
      if (var0 != null && !var0.isEmpty()) {
         int var1 = -1;

         for (String var3 : method3006(var0)) {
            int var4 = method3008(var3);
            if (var4 > var1) {
               var1 = var4;
            }
         }

         ComponentMap var5 = var0.getComponents();
         if (var5 != null) {
            String var6 = StringUtils.substringBetween(var5.toString(), "literal{ $", "}[style={color=green}]");
            int var7 = method3010(var6);
            if (var7 > var1) {
               var1 = var7;
            }
         }

         return var1;
      } else {
         return -1;
      }
   }

   public static String method3000(String var0) {
      return var0 == null
         ? ""
         : var0.toLowerCase(Locale.ROOT)
            .trim()
            .replaceAll("\\u00A7.", "")
            .replaceAll("[^\\p{IsLatin}\\p{IsCyrillic}0-9\\s\\[\\]\\u2605+*]", "")
            .replaceAll("\\s+", " ");
   }

   public static String method3001(String var0) {
      return method3000(var0)
         .replace('ё', 'е')
         .replace("★", "")
         .replace("*", "")
         .replace("[", "")
         .replace("]", "")
         .replace("сфера", "")
         .replaceAll("\\s+", " ")
         .trim();
   }

   public static boolean method3002(ItemStack var0) {
      ItemEnchantmentsComponent var1 = var0.get(DataComponentTypes.ENCHANTMENTS);
      if (var1 != null && !var1.isEmpty()) {
         for (RegistryEntry var3 : var1.getEnchantments()) {
            String var4 = var3.getIdAsString();
            if (var4 != null) {
               String var5 = var4.toLowerCase(Locale.ROOT);
               if (var5.contains("thorns") || var5.contains("шип")) {
                  return true;
               }
            }
         }

         LoreComponent var6 = var0.get(DataComponentTypes.LORE);
         if (var6 != null) {
            for (Text var8 : var6.lines()) {
               String var9 = var8.getString().toLowerCase(Locale.ROOT);
               if (var9.contains("thorns") || var9.contains("шип")) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static boolean method3003(ItemStack var0) {
      if (var0.getItem() != Items.SPLASH_POTION && var0.getItem() != Items.POTION) {
         return false;
      } else {
         PotionContentsComponent var1 = var0.get(DataComponentTypes.POTION_CONTENTS);
         if (var1 == null) {
            return false;
         } else {
            List<net.minecraft.entity.effect.StatusEffectInstance> var2 = var1.customEffects();
            if (var2.isEmpty()) {
               return false;
            } else {
               for (StatusEffectInstance var4 : var2) {
                  int var5 = var4.getAmplifier();
                  if (var4.getEffectType().matchesKey(StatusEffects.STRENGTH.getKey().get()) && var5 >= 3) {
                     return true;
                  }
               }

               return false;
            }
         }
      }
   }

   public static boolean method3004(ItemStack var0) {
      return var0 != null && var0.getItem() instanceof ArmorItem;
   }

   public static boolean method3005(ItemStack var0, ItemStack var1) {
      if (var0.getItem() != var1.getItem()) {
         return false;
      } else if (var0.getItem() == Items.PLAYER_HEAD) {
         String var27 = funTimePricePattern.matcher(var0.getName().getString()).replaceAll("").trim();
         String var28 = var1.getName().getString();
         String var29 = method3001(var27);
         String var30 = method3001(var28);
         return var29.contains(var30) || var30.contains(var29);
      } else if (method3004(var0) && method3002(var0)) {
         return false;
      } else {
         String var2 = funTimePricePattern.matcher(var0.getName().getString()).replaceAll("").trim();
         String var3 = var1.getName().getString();
         String var4 = method3000(var2);
         String var5 = method3000(var3);
         LoreComponent var6 = var0.get(DataComponentTypes.LORE);
         LoreComponent var7 = var1.get(DataComponentTypes.LORE);
         boolean var8 = var7 != null && !var7.lines().isEmpty();
         boolean var9 = false;
         if (var8) {
            for (Text var11 : var7.lines()) {
               String var12 = var11.getString().toLowerCase(Locale.ROOT);
               if (var12.contains("киллер") || var12.contains("killer")) {
                  var9 = true;
                  break;
               }
            }
         }

         if (!var9 || var0.getItem() != Items.SPLASH_POTION && var0.getItem() != Items.POTION) {
            if (!var8) {
               if (!var4.contains(var5) && !var5.contains(var4)) {
                  return false;
               }
            } else {
               List<net.minecraft.text.Text> var31 = var7.lines();
               if (var6 == null || var6.lines().isEmpty()) {
                  return false;
               }

               List<String> var32 = var6.lines().stream().map(var0x -> method3000(var0x.getString())).filter(var0x -> !var0x.isEmpty()).collect(Collectors.toList());
               String var33 = String.join(" ", var32);
               boolean var13 = false;

               for (String var15 : var32) {
                  if (var15.contains("оригинальный предмет") || var15.contains("★")) {
                     var13 = true;
                  }
               }

               int var34 = 0;
               int var35 = 0;

               for (Text var17 : var31) {
                  String var18 = method3000(var17.getString());
                  if (!var18.isEmpty()) {
                     boolean var19 = var18.contains("оригинальный предмет") || var18.contains("★");
                     if (var19) {
                        if (!var13) {
                           return false;
                        }

                        var34++;
                        var35++;
                     } else {
                        var35++;
                        boolean var20 = false;

                        for (String var22 : var32) {
                           if (var22.contains(var18) || var18.contains(var22)) {
                              var20 = true;
                              break;
                           }
                        }

                        if (!var20 && var33.contains(var18)) {
                           var20 = true;
                        }

                        if (var20) {
                           var34++;
                        }
                     }
                  }
               }

               double var36 = var35 > 0 ? (double)var34 / var35 : 1.0;
               if (var36 < 0.5) {
                  return false;
               }

               if (var13) {
                  ItemEnchantmentsComponent var37 = var0.get(DataComponentTypes.ENCHANTMENTS);
                  ItemEnchantmentsComponent var38 = var1.get(DataComponentTypes.ENCHANTMENTS);
                  if (var38 != null && !var38.isEmpty()) {
                     if (var37 == null || var37.isEmpty()) {
                        return false;
                     }

                     HashMap<String, Integer> var39 = new HashMap<>();

                     for (RegistryEntry var42 : var37.getEnchantments()) {
                        String var23 = var42.getIdAsString();
                        if (var23 != null) {
                           String var24 = var23.replace("minecraft:", "").toLowerCase(Locale.ROOT);
                           int var25 = var37.getLevel(var42);
                           var39.put(var24, var25);
                        }
                     }

                     HashMap<String, Integer> var41 = new HashMap<>();

                     for (RegistryEntry var45 : var38.getEnchantments()) {
                        String var48 = var45.getIdAsString();
                        if (var48 != null) {
                           String var50 = var48.replace("minecraft:", "").toLowerCase(Locale.ROOT);
                           int var26 = var38.getLevel(var45);
                           var41.put(var50, var26);
                        }
                     }

                     if (!var41.isEmpty()) {
                        int var44 = 0;

                        for (java.util.Map.Entry<String, Integer> var49 : var41.entrySet()) {
                           Integer var51 = (Integer)var39.get(var49.getKey());
                           if (var51 != null && var51 >= 1) {
                              var44++;
                           }
                        }

                        double var47 = (double)var44 / var41.size();
                        if (var47 < 1.0) {
                           return false;
                        }
                     }
                  }
               }
            }

            return true;
         } else {
            return method3003(var0);
         }
      }
   }

   private static List<String> method3006(ItemStack var0) {
      ArrayList var1 = new ArrayList();
      var1.add(var0.getName().getString());
      LoreComponent var2 = var0.get(DataComponentTypes.LORE);
      if (var2 != null) {
         for (Text var4 : var2.lines()) {
            var1.add(var4.getString());
         }
      }

      return var1;
   }

   private static int method3007(String var0) {
      if (var0 != null && !var0.isBlank()) {
         Matcher var1 = funTimePricePattern.matcher(var0);
         if (var1.find()) {
            return method3009(var1.group(1), var1.group(2));
         } else {
            Matcher var2 = compactPricePattern.matcher(var0);
            return var2.find() ? method3009(var2.group(1), var2.group(2)) : -1;
         }
      } else {
         return -1;
      }
   }

   private static int method3008(String var0) {
      if (var0 != null && !var0.isBlank()) {
         int var1 = -1;
         Matcher var2 = funTimePricePattern.matcher(var0);

         while (var2.find()) {
            int var3 = method3009(var2.group(1), var2.group(2));
            if (var3 > var1) {
               var1 = var3;
            }
         }

         Matcher var5 = compactPricePattern.matcher(var0);

         while (var5.find()) {
            int var4 = method3009(var5.group(1), var5.group(2));
            if (var4 > var1) {
               var1 = var4;
            }
         }

         return var1;
      } else {
         return -1;
      }
   }

   private static int method3009(String var0, String var1) {
      if (var0 != null && !var0.isBlank()) {
         String var2 = var0.replace(" ", "").replace(",", ".");
         String var3 = var1 == null ? "" : var1.trim().toLowerCase(Locale.ROOT);

         try {
            double var4 = Double.parseDouble(var2);
            if ("k".equals(var3) || "к".equals(var3)) {
               return (int)Math.round(var4 * 1000.0);
            } else {
               return !"m".equals(var3) && !"м".equals(var3) ? method3010(var0) : (int)Math.round(var4 * 1000000.0);
            }
         } catch (NumberFormatException var6) {
            return -1;
         }
      } else {
         return -1;
      }
   }

   private static int method3010(String var0) {
      if (var0 != null && !var0.isBlank()) {
         String var1 = var0.replace(" ", "");
         if (var1.matches("\\d{1,3}([,.]\\d{3})+")) {
            var1 = var1.replace(",", "").replace(".", "");
         } else {
            var1 = var1.replace(",", "");
         }

         try {
            return var1.contains(".") ? (int)Math.round(Double.parseDouble(var1)) : Integer.parseInt(var1);
         } catch (NumberFormatException var3) {
            return -1;
         }
      } else {
         return -1;
      }
   }
}
