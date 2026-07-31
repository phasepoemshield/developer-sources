package l;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.component.type.ProfileComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.text.Text;

public class Helper294 implements Helper465 {
   private final String displayName;
   private final NbtCompound nbt;
   private final Item material;
   private final int price;
   private final PotionContentsComponent potionContents;
   private final List<Text> loreTexts;
   private final Helper361 settings;
   private boolean enabled;

   public Helper294(String var1, NbtCompound var2, Item var3, int var4, PotionContentsComponent var5, List<Text> var6) {
      this.displayName = var1;
      this.nbt = var2;
      this.material = var3;
      this.price = var4;
      this.potionContents = var5;
      this.loreTexts = var6;
      this.enabled = true;
      this.settings = new Helper361(var4, var3, var1);
      Helper31.method477().method479(var1, this.settings);
   }

   public Helper294(String var1, NbtCompound var2, Item var3, int var4) {
      this(var1, var2, var3, var4, null, null);
   }

   @Override
   public String method364() {
      return this.displayName;
   }

   @Override
   public ItemStack method365() {
      ItemStack var1 = new ItemStack(this.material);
      var1.set(DataComponentTypes.CUSTOM_NAME, Text.literal(this.displayName));
      if (this.material == Items.POTION) {
         String var3 = this.displayName;

         int var2 = switch (var3) {
            case "Зелье отрыжки" -> 16735488;
            case "Зелье серной кислоты" -> 49664;
            case "Зелье вспышки" -> 16777215;
            case "Зелье мочи Флеша" -> 6092799;
            case "Зелье победителя" -> 65280;
            case "Зелье агента" -> 16775936;
            case "Зелье медика" -> 16711902;
            case "Зелье киллера" -> 16711680;
            default -> 3694022;
         };
         var1.set(DataComponentTypes.POTION_CONTENTS, new PotionContentsComponent(Optional.empty(), Optional.of(var2), List.of(), Optional.empty()));
      } else if (this.potionContents != null) {
         var1.set(DataComponentTypes.POTION_CONTENTS, this.potionContents);
      }

      if (this.loreTexts != null) {
         var1.set(DataComponentTypes.LORE, new LoreComponent(this.loreTexts));
      }

      if (this.material == Items.TOTEM_OF_UNDYING) {
         var1.set(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true);
      }

      if (this.nbt != null) {
         NbtCompound var10 = this.nbt.copy();
         if (this.material == Items.PLAYER_HEAD && var10.contains("SkullOwner", 10)) {
            NbtCompound var11 = var10.getCompound("SkullOwner");
            UUID var12 = var11.getUuid("Id");
            GameProfile var5 = new GameProfile(var12, "");
            if (var11.contains("Properties", 10)) {
               NbtCompound var6 = var11.getCompound("Properties");
               if (var6.contains("textures", 9)) {
                  NbtList var7 = var6.getList("textures", 10);
                  if (!var7.isEmpty()) {
                     NbtCompound var8 = var7.getCompound(0);
                     String var9 = var8.getString("Value");
                     var5.getProperties().put("textures", new Property("textures", var9));
                  }
               }
            }

            var1.set(DataComponentTypes.PROFILE, new ProfileComponent(var5));
            var10.remove("SkullOwner");
         }

         if (!var10.isEmpty()) {
            var1.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(var10));
         }
      }

      return var1;
   }

   @Override
   public int method366() {
      return this.price;
   }

   @Override
   public boolean isEnabled() {
      return this.enabled;
   }

   @Override
   public void method367(boolean var1) {
      this.enabled = var1;
   }

   @Override
   public Helper361 method368() {
      return this.settings;
   }
}
