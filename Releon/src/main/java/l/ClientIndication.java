package l;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;

public class ClientIndication extends Helper242 {
   private static final List<Helper251> DEFAULT_TALISMAN_RULES = List.of(
      new Helper251(new Color(255, 80, 80, 255).getRGB(), "+2 Броня", "+2 Твердость брони", "+3 урон", "+4 Максимальное здоровье"),
      new Helper251(new Color(170, 80, 255, 255).getRGB(), "+10% Скорость", "+7 Урон", "-4 Максимальное здоровье"),
      new Helper251(new Color(191, 255, 0, 255).getRGB(), "+10% Скорость", "+4 Урон", "+2 Максимальное здоровье", "+10% Скорость атаки", "-3 Броня"),
      new Helper251(new Color(247, 255, 0, 255).getRGB(), "+5 Урон", "-4 Максимальное здоровье"),
      new Helper251(new Color(74, 163, 126, 255).getRGB(), "+2 Урон", "+2 Броня", "-4 Максимальное здоровье"),
      new Helper251(new Color(104, 40, 40, 255).getRGB(), "+2.5 Урон", "+10% Скорость атаки"),
      new Helper251(new Color(243, 243, 243, 255).getRGB(), "+1.5 Броня", "+1.5 Максимальное здоровье"),
      new Helper251(new Color(4, 50, 223, 255).getRGB(), "+15% Скорость", "+2 Максимальное здоровье", "+15% Скорость атаки")
   );
   private final Setting7 colorSetting = new Setting7("Р¦РІРµС‚", "Р¦РІРµС‚ Р·Р°Р»РёРІРєРё СЂСѓРє Рё РїСЂРµРґРјРµС‚Р°")
      .method2550(new Color(205, 120, 255, 255).getRGB());
   private final Setting2 alphaSetting = new Setting2("Alpha", "РџСЂРѕР·СЂР°С‡РЅРѕСЃС‚СЊ Р·Р°Р»РёРІРєРё").method2086(1.0F).method2078(0.05F, 1.0F);
   private final Setting3 mainHandSetting = new Setting3("РћСЃРЅРѕРІРЅР°СЏ СЂСѓРєР°", "РљСЂР°СЃРёС‚СЊ РѕСЃРЅРѕРІРЅСѓСЋ СЂСѓРєСѓ").method2201(true);
   private final Setting3 offHandSetting = new Setting3("Р’С‚РѕСЂР°СЏ СЂСѓРєР°", "РљСЂР°СЃРёС‚СЊ РІС‚РѕСЂСѓСЋ СЂСѓРєСѓ").method2201(true);

   public static ClientIndication method2427() {
      return Helper222.method1979(ClientIndication.class);
   }

   public ClientIndication() {
      super("ClientIndication", "ClientIndication", Helper269.RENDER);
      this.setup(new Helper264[0]);
   }

   public boolean method2428(Hand var1, ItemStack var2) {
      if (!this.isState() || mc == null || mc.player == null || !mc.options.getPerspective().isFirstPerson()) {
         return false;
      } else {
         return var1 == Hand.MAIN_HAND
            ? this.mainHandSetting.method2200() && this.method2436(var2) != -1
            : this.offHandSetting.method2200() && this.method2436(var2) != -1;
      }
   }

   public boolean method2429(ItemStack var1) {
      return this.isState() && this.offHandSetting.method2200() && this.method2436(var1) != -1;
   }

   public boolean method2430(ItemStack var1) {
      return this.isState() && this.method2436(var1) != -1;
   }

   public float method2431(ItemStack var1) {
      return (this.method2435(var1) >> 16 & 0xFF) / 255.0F;
   }

   public float method2432(ItemStack var1) {
      return (this.method2435(var1) >> 8 & 0xFF) / 255.0F;
   }

   public float method2433(ItemStack var1) {
      return (this.method2435(var1) & 0xFF) / 255.0F;
   }

   public float method2434() {
      return this.alphaSetting.method2082();
   }

   public int method2435(ItemStack var1) {
      int var2 = this.method2436(var1);
      return var2 != -1 ? var2 : this.colorSetting.method2553();
   }

   private int method2436(ItemStack var1) {
      if (var1 != null && !var1.isEmpty()) {
         List var2 = this.method2437(var1);

         for (Helper251 var4 : DEFAULT_TALISMAN_RULES) {
            if (var4.method2424(var2)) {
               return var4.method2425();
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private List<String> method2437(ItemStack var1) {
      ArrayList var2 = new ArrayList();
      LoreComponent var3 = var1.get(DataComponentTypes.LORE);
      if (var3 == null) {
         return var2;
      } else {
         for (Text var5 : var3.lines()) {
            String var6 = this.method2438(var5.getString());
            if (!var6.isEmpty()) {
               var2.add(var6);
            }
         }

         return var2;
      }
   }

   private String method2438(String var1) {
      return var1 == null ? "" : var1.toLowerCase(Locale.ROOT).trim().replace('ё', 'е');
   }
}
