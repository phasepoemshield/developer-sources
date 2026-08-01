package fat.releon.mixins.client.screen;

import l.ClientIndication;
import l.Helper283;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({DrawContext.class})
public class DrawContextMixin {
   public DrawContextMixin() {
   }

   @Unique
   private static void releon$pushTint(ItemStack var0) {
      ClientIndication var1 = ClientIndication.method2427();
      if (var1 != null && var1.method2430(var0)) {
         Helper283.method2776(var1.method2431(var0), var1.method2432(var0), var1.method2433(var0), var1.method2434());
      }
   }

   @Unique
   private static void releon$popTint(ItemStack var0) {
      ClientIndication var1 = ClientIndication.method2427();
      if (var1 != null && var1.method2430(var0)) {
         Helper283.method2777();
      }
   }

   @Inject(
      method = {"drawItem(Lnet/minecraft/item/ItemStack;II)V"},
      at = {@At("HEAD")}
   )
   private void releon$beforeDrawItem(ItemStack var1, int var2, int var3, CallbackInfo var4) {
      releon$pushTint(var1);
   }

   @Inject(
      method = {"drawItem(Lnet/minecraft/item/ItemStack;II)V"},
      at = {@At("RETURN")}
   )
   private void releon$afterDrawItem(ItemStack var1, int var2, int var3, CallbackInfo var4) {
      releon$popTint(var1);
   }

   @Inject(
      method = {"drawItem(Lnet/minecraft/item/ItemStack;III)V"},
      at = {@At("HEAD")}
   )
   private void releon$beforeDrawItemSeed(ItemStack var1, int var2, int var3, int var4, CallbackInfo var5) {
      releon$pushTint(var1);
   }

   @Inject(
      method = {"drawItem(Lnet/minecraft/item/ItemStack;III)V"},
      at = {@At("RETURN")}
   )
   private void releon$afterDrawItemSeed(ItemStack var1, int var2, int var3, int var4, CallbackInfo var5) {
      releon$popTint(var1);
   }

   @Inject(
      method = {"drawItem(Lnet/minecraft/item/ItemStack;IIII)V"},
      at = {@At("HEAD")}
   )
   private void releon$beforeDrawItemSeedZ(ItemStack var1, int var2, int var3, int var4, int var5, CallbackInfo var6) {
      releon$pushTint(var1);
   }

   @Inject(
      method = {"drawItem(Lnet/minecraft/item/ItemStack;IIII)V"},
      at = {@At("RETURN")}
   )
   private void releon$afterDrawItemSeedZ(ItemStack var1, int var2, int var3, int var4, int var5, CallbackInfo var6) {
      releon$popTint(var1);
   }

   @Inject(
      method = {"drawItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;III)V"},
      at = {@At("HEAD")}
   )
   private void releon$beforeDrawItemEntity(LivingEntity var1, ItemStack var2, int var3, int var4, int var5, CallbackInfo var6) {
      releon$pushTint(var2);
   }

   @Inject(
      method = {"drawItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;III)V"},
      at = {@At("RETURN")}
   )
   private void releon$afterDrawItemEntity(LivingEntity var1, ItemStack var2, int var3, int var4, int var5, CallbackInfo var6) {
      releon$popTint(var2);
   }

   @Inject(
      method = {"drawItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;III)V"},
      at = {@At("HEAD")}
   )
   private void releon$beforeDrawItemWorld(LivingEntity var1, World var2, ItemStack var3, int var4, int var5, int var6, CallbackInfo var7) {
      releon$pushTint(var3);
   }

   @Inject(
      method = {"drawItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;III)V"},
      at = {@At("RETURN")}
   )
   private void releon$afterDrawItemWorld(LivingEntity var1, World var2, ItemStack var3, int var4, int var5, int var6, CallbackInfo var7) {
      releon$popTint(var3);
   }

   @Inject(
      method = {"drawItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;IIII)V"},
      at = {@At("HEAD")}
   )
   private void releon$beforeDrawItemWorldZ(LivingEntity var1, World var2, ItemStack var3, int var4, int var5, int var6, int var7, CallbackInfo var8) {
      releon$pushTint(var3);
   }

   @Inject(
      method = {"drawItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;IIII)V"},
      at = {@At("RETURN")}
   )
   private void releon$afterDrawItemWorldZ(LivingEntity var1, World var2, ItemStack var3, int var4, int var5, int var6, int var7, CallbackInfo var8) {
      releon$popTint(var3);
   }
}
