package org.zenith.core;

import org.zenith.event.GameMessageEvent;

import org.zenith.utility.render.display.base.CornerRadiusF;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextScanner {
   public static final Map<String, String> GameMessageEvent;

   public TextScanner() {
   }

   public static List<ItemSpec> UiAnimation(String var0) {
      List<ItemSpec> arraylist = new ArrayList<>();
      String s = var0.trim();
      if (s.startsWith("[") && s.endsWith("]")) {
         s = s.substring(1, s.length() - 1);
      }

      Pattern pattern = Pattern.compile("(EnchantCustom|EnchantVanilla) \\[checked=([^,]+), level=(\\d+)]");
      Matcher matcher = pattern.matcher(s);

      while (matcher.find()) {
         String s1 = matcher.group(1);
         String s2 = matcher.group(2);
         int i = Integer.parseInt(matcher.group(3));
         String s3 = GameMessageEvent.getOrDefault(s2, s2);
         ItemSpec object;
         if (s1.equals("EnchantCustom")) {
            object = new NbtItemSpec(s3, s2, i);
         } else {
            object = new EnchantItemSpec(s3, s2, i);
         }

         arraylist.add(object);
      }

      return arraylist;
   }

   static {
      Map<String, String> hashmap = new HashMap<>();
      hashmap.put("minecraft:luck_of_the_sea", "\u0412\u0435\u0437\u0443\u0447\u0438\u0439 \u0440\u044b\u0431\u0430\u043a");
      hashmap.put("minecraft:thorns", "\u0428\u0438\u043f\u044b");
      hashmap.put("pinger", "\u041f\u0438\u043d\u0433\u0435\u0440");
      hashmap.put(
         "minecraft:feather_falling", "\u041d\u0435\u0432\u0435\u0441\u043e\u043c\u043e\u0441\u0442\u044c (\u041f\u0430\u0434\u0435\u043d\u0438\u0435)"
      );
      hashmap.put("minecraft:flame", "\u0412\u043e\u0441\u043f\u043b\u0430\u043c\u0435\u043d\u0435\u043d\u0438\u0435");
      hashmap.put(
         "minecraft:binding_curse", "\u041f\u0440\u043e\u043a\u043b\u044f\u0442\u0438\u0435 \u043d\u0435\u0441\u044a\u0451\u043c\u043d\u043e\u0441\u0442\u0438"
      );
      hashmap.put("minecraft:projectile_protection", "\u0417\u0430\u0449\u0438\u0442\u0430 \u043e\u0442 \u0441\u043d\u0430\u0440\u044f\u0434\u043e\u0432");
      hashmap.put("minecraft:smite", "\u041d\u0435\u0431\u0435\u0441\u043d\u0430\u044f \u043a\u0430\u0440\u0430");
      hashmap.put("minecraft:frost_walker", "\u041b\u0435\u0434\u043e\u0445\u043e\u0434");
      hashmap.put(
         "minecraft:punch",
         "\u041e\u0442\u043a\u0438\u0434\u044b\u0432\u0430\u043d\u0438\u0435 (\u0423\u0434\u0430\u0440 \u0441\u0442\u0440\u0435\u043b\u043e\u0439)"
      );
      hashmap.put("minecraft:sharpness", "\u041e\u0441\u0442\u0440\u043e\u0442\u0430");
      hashmap.put("minecraft:efficiency", "\u042d\u0444\u0444\u0435\u043a\u0442\u0438\u0432\u043d\u043e\u0441\u0442\u044c");
      hashmap.put("demolishing", "\u0420\u0430\u0437\u0440\u0443\u0448\u0435\u043d\u0438\u0435");
      hashmap.put("minecraft:lure", "\u041f\u0440\u0438\u043c\u0430\u043d\u043a\u0430");
      hashmap.put("minecraft:fire_aspect", "\u0417\u0430\u0433\u043e\u0432\u043e\u0440 \u043e\u0433\u043d\u044f");
      hashmap.put("minecraft:piercing", "\u0422\u043e\u0447\u043d\u043e\u0441\u0442\u044c");
      hashmap.put("minecraft:unbreaking", "\u041f\u0440\u043e\u0447\u043d\u043e\u0441\u0442\u044c");
      hashmap.put("minecraft:quick_charge", "\u0411\u044b\u0441\u0442\u0440\u0430\u044f \u043f\u0435\u0440\u0435\u0437\u0430\u0440\u044f\u0434\u043a\u0430");
      hashmap.put("minecraft:riptide", "\u0417\u0430\u043c\u0435\u0434\u043b\u0435\u043d\u0438\u0435");
      hashmap.put("minecraft:fortune", "\u0423\u0434\u0430\u0447\u0430");
      hashmap.put("minecraft:fire_protection", "\u041e\u0433\u043d\u0435\u0443\u043f\u043e\u0440\u043d\u043e\u0441\u0442\u044c");
      hashmap.put("minecraft:knockback", "\u041e\u0442\u0431\u0440\u0430\u0441\u044b\u0432\u0430\u043d\u0438\u0435");
      hashmap.put("minecraft:mending", "\u041f\u043e\u0447\u0438\u043d\u043a\u0430");
      hashmap.put("minecraft:power", "\u0421\u0438\u043b\u0430");
      hashmap.put("stupor", "\u0421\u0442\u0443\u043f\u043e\u0440");
      hashmap.put(
         "minecraft:aqua_affinity",
         "\u041f\u043e\u0434\u0432\u043e\u0434\u043d\u0438\u043a (\u0423\u0441\u043a\u043e\u0440\u0435\u043d\u0438\u0435 \u0434\u043e\u0431\u044b\u0447\u0438 \u043f\u043e\u0434 \u0432\u043e\u0434\u043e\u0439)"
      );
      hashmap.put("skilled", "\u041e\u043f\u044b\u0442\u043d\u044b\u0439");
      hashmap.put("minecraft:sweeping_edge", "\u0420\u0430\u0437\u044f\u0449\u0438\u0439 \u043a\u043b\u0438\u043d\u043e\u043a");
      hashmap.put("web", "\u041f\u0430\u0443\u0442\u0438\u043d\u0430");
      hashmap.put("buldozing", "\u0411\u0443\u043b\u044c\u0434\u043e\u0437\u0435\u0440");
      hashmap.put("minecraft:vanishing_curse", "\u041f\u0440\u043e\u043a\u043b\u044f\u0442\u0438\u0435 \u0443\u0442\u0440\u0430\u0442\u044b");
      hashmap.put("smelting", "\u0410\u0432\u0442\u043e\u043f\u043b\u0430\u0432\u043a\u0430");
      hashmap.put("minecraft:blast_protection", "\u0412\u0437\u0440\u044b\u0432\u043e\u0443\u0441\u0442\u043e\u0439\u0447\u0438\u0432\u043e\u0441\u0442\u044c");
      hashmap.put("minecraft:impaling", "\u041f\u0440\u043e\u043d\u0437\u0430\u0442\u0435\u043b\u044c");
      hashmap.put("minecraft:bane_of_arthropods", "\u0411\u0438\u0447 \u0447\u043b\u0435\u043d\u0438\u0441\u0442\u043e\u043d\u043e\u0433\u0438\u0445");
      hashmap.put("detection", "\u0414\u0435\u0442\u0435\u043a\u0446\u0438\u044f");
      hashmap.put("poison", "\u042f\u0434");
      hashmap.put("minecraft:silk_touch", "\u0428\u0451\u043b\u043a\u043e\u0432\u043e\u0435 \u043a\u0430\u0441\u0430\u043d\u0438\u0435");
      hashmap.put("oxidation", "\u041e\u043a\u0438\u0441\u043b\u0435\u043d\u0438\u0435");
      hashmap.put("minecraft:looting", "\u0414\u043e\u0431\u044b\u0447\u0430");
      hashmap.put(
         "minecraft:depth_strider",
         "\u041f\u043e\u0434\u0432\u043e\u0434\u043d\u0438\u043a (\u041f\u043e\u0434\u0432\u043e\u0434\u043d\u0430\u044f \u0445\u043e\u0434\u044c\u0431\u0430)"
      );
      hashmap.put("minecraft:soul_speed", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0434\u0443\u0448\u0438");
      hashmap.put("vampirism", "\u0412\u0430\u043c\u043f\u0438\u0440\u0438\u0437\u043c");
      hashmap.put("magnet", "\u041c\u0430\u0433\u043d\u0438\u0442");
      hashmap.put("minecraft:respiration", "\u041f\u043e\u0434\u0432\u043e\u0434\u043d\u043e\u0435 \u0434\u044b\u0445\u0430\u043d\u0438\u0435");
      hashmap.put("minecraft:loyalty", "\u0412\u0435\u0440\u043d\u043e\u0441\u0442\u044c");
      hashmap.put("returning", "\u0412\u043e\u0437\u0432\u0440\u0430\u0442");
      hashmap.put("pulling", "\u041f\u0440\u0438\u0442\u044f\u0433\u0438\u0432\u0430\u043d\u0438\u0435");
      hashmap.put("minecraft:protection", "\u0417\u0430\u0449\u0438\u0442\u0430");
      hashmap.put("minecraft:infinity", "\u0411\u0435\u0441\u043a\u043e\u043d\u0435\u0447\u043d\u043e\u0441\u0442\u044c");
      hashmap.put("scout", "\u0421\u043a\u0430\u0443\u0442");
      hashmap.put("minecraft:multishot", "\u041c\u043d\u043e\u0433\u043e\u0441\u0442\u0440\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u044c");
      hashmap.put("minecraft:channeling", "\u0413\u0440\u043e\u043c\u043e\u0432\u0435\u0440\u0436\u0435\u0446");
      GameMessageEvent = hashmap;
   }
}
