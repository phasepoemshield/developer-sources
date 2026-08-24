package org.zenith.module;

import org.zenith.core.NbtItemSpec;
import org.zenith.core.EnchantItemSpec;
import org.zenith.core.ItemServiceBase;
import org.zenith.event.Event18Ext4;
import org.zenith.event.SprintStateEvent;
import org.zenith.util.Item;

import org.zenith.core.ColorAnimator;
import org.zenith.core.UiAnimation;
import org.zenith.core.BotFeatureRegistry;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;

final class AutoSwap_Var165 {
   public final AutoSwap val071;
   public String string61;
   public String string62;
   public ItemStack itemStack8;

   public AutoSwap_Var165(AutoSwap var1) {
      this.val071 = var1;
      this.string61 = "minecraft:air";
   }

   public void clear() {
      this.string61 = "minecraft:air";
      this.string62 = null;
      this.itemStack8 = null;
   }

   public void ColorAnimator(ItemStack var1) {
      if (this.val071.NbtItemSpec(var1)) {
         this.clear();
      } else {
         ItemStack itemstack = this.val071.EnchantItemSpec(var1);
         this.string61 = Registries.ITEM.getId(itemstack.getItem()).toString();
         this.string62 = this.val071.ItemServiceBase(itemstack);
         this.itemStack8 = itemstack;
      }
   }

   public ItemStack AutoZamok() {
      if (this.itemStack8 != null) {
         return this.itemStack8;
      } else {
         ItemStack itemstack = this.val071.Event18Ext4(this.string62);
         if (itemstack.isEmpty()) {
            itemstack = this.val071.SprintStateEvent(this.string61);
         }

         this.itemStack8 = itemstack;
         return itemstack;
      }
   }

   public JsonObject save() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("item", this.string61 == null ? "minecraft:air" : this.string61);
      String s = this.string62;
      if ((s == null || s.isBlank()) && this.itemStack8 != null && !this.itemStack8.isEmpty()) {
         s = this.val071.ItemServiceBase(this.itemStack8);
      }

      if (s != null && !s.isBlank()) {
         jsonobject.addProperty("stack", s);
      }

      return jsonobject;
   }

   public void UiAnimation(JsonElement var1) {
      this.clear();
      if (var1 != null) {
         if (var1.isJsonPrimitive()) {
            this.string61 = var1.getAsString();
         } else if (var1.isJsonObject()) {
            JsonObject jsonobject = var1.getAsJsonObject();
            this.string61 = jsonobject.has("item") ? jsonobject.get("item").getAsString() : "minecraft:air";
            this.string62 = jsonobject.has("stack") ? jsonobject.get("stack").getAsString() : null;
            ItemStack itemstack = this.val071.Event18Ext4(this.string62);
            if (!itemstack.isEmpty()) {
               this.itemStack8 = itemstack;
               this.string61 = Registries.ITEM.getId(itemstack.getItem()).toString();
            }
         }
      }
   }
}
