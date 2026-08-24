package org.zenith.module;

import org.zenith.util.Item;
import org.zenith.core.VisualSettingsStore;

import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

record EntityESP_Var159(String string20, Text text3, boolean boolean71, boolean boolean72, boolean boolean73, boolean boolean74, boolean boolean75, boolean boolean76, boolean boolean77, Vec3d vec3d9, Box box3, float float53, int int113, List<ItemStack> list35, List<ItemStack> list36, ItemStack itemStack6) {

   public String key() {
      return this.string20;
   }

   public Text name() {
      return this.text3;
   }

   public boolean boolean198() {
      return this.boolean71;
   }

   public boolean float370() {
      return this.boolean72;
   }

   public boolean float371() {
      return this.boolean73;
   }

   public boolean vec3d44() {
      return this.boolean74;
   }

   public boolean box10() {
      return this.boolean75;
   }

   public boolean int448() {
      return this.boolean76;
   }

   public boolean float359() {
      return this.boolean77;
   }

   public Vec3d VisualSettingsStore() {
      return this.vec3d9;
   }

   public Box int449() {
      return this.box3;
   }

   public float Item() {
      return this.float53;
   }

   public int int450() {
      return this.int113;
   }

   public List<ItemStack> double151() {
      return this.list35;
   }

   public List<ItemStack> double152() {
      return this.list36;
   }

   public ItemStack double153() {
      return this.itemStack6;
   }
}
