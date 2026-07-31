package ru.metaculture.protection;

import net.minecraft.block.Blocks;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.attribute.EntityAttributeModifier.Operation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "WaterSpeed",
   O0000000000 = Category.Movement,
   O000000000 = "Ускорение в воде!"
)
public class WaterSpeed extends Module {
   public final ModeSetting O000000000O = new ModeSetting("Режим", "HVH", "HVH");
   private final O0000O00O0 O000000000O00 = new O0000O00O0();
   private final O0000O00O0 O000000000O000 = new O0000O00O0();
   private boolean O000000000O00O = false;
   private boolean O000000000O0O = false;
   float O000000000O0;

   public WaterSpeed() {
      this.O00000000(new Setting[]{this.O000000000O});
   }

   private boolean O0000000000O0() {
      BlockPos var1 = O0000000000.player.getBlockPos();
      BlockPos var2 = var1.up(1);
      BlockPos var3 = var1.up(2);
      boolean var4 = O0000000000.world.getBlockState(var2).getBlock() == Blocks.ICE || O0000000000.world.getBlockState(var3).getBlock() == Blocks.ICE;
      boolean var5 = O0000O00O00O0.O00000000(Blocks.ICE, var1, 1.0F, 1.0F);
      return var4 || var5;
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (!O0000O00O0000O.O00000000()) {
         if (O0000O00O000OO.O00000000()) {
            this.O000000000O00.O00000000();
         }

         if (this.O000000000O.O000000000("FunTime") && O0000000000.player.isTouchingWater()) {
            boolean var2 = O0000000000.options.forwardKey.isPressed();
            RegistryEntry var3 = (RegistryEntry)O0000000000.world
               .getRegistryManager()
               .getOrThrow(RegistryKeys.ENCHANTMENT)
               .getOptional(Enchantments.DEPTH_STRIDER)
               .orElseThrow();
            int var4 = EnchantmentHelper.getEquipmentLevel(var3, O0000000000.player);
            boolean var5 = var4 >= 3;
            ItemStack var6 = O0000000000.player.getOffHandStack();
            boolean var7 = !var6.isEmpty() && var6.getItem() == Items.PLAYER_HEAD;
            boolean var8 = false;
            if (var7) {
               AttributeModifiersComponent var9 = (AttributeModifiersComponent)var6.get(DataComponentTypes.ATTRIBUTE_MODIFIERS);
               if (var9 != null) {
                  var8 = var9.modifiers().stream().anyMatch(entry -> {
                     boolean var1 = entry.slot() == AttributeModifierSlot.OFFHAND || entry.slot() == AttributeModifierSlot.ANY;
                     boolean var2x = entry.attribute() == EntityAttributes.MOVEMENT_SPEED;
                     EntityAttributeModifier var3x = entry.modifier();
                     boolean var4x = var3x.operation() == Operation.ADD_MULTIPLIED_TOTAL || var3x.operation() == Operation.ADD_MULTIPLIED_BASE;
                     return var1 && var2x && var4x && var3x.value() >= 0.14 && var3x.value() <= 0.16;
                  });
               }
            }

            boolean var12 = this.O0000000000O0();
            if (var12 && !this.O000000000O00O && !this.O000000000O0O) {
               this.O000000000O00O = true;
               this.O000000000O0O = true;
               this.O000000000O000.O00000000();
            }

            if (!this.O000000000O00O || !this.O000000000O0O || !this.O000000000O000.O000000000(3000.0)) {
               this.O000000000O0 = 1.0481F;
            } else if (var5 && var12) {
               this.O000000000O0 = 1.175F;
            } else {
               this.O000000000O0 = 1.04839F;
            }

            if (!var12) {
               this.O000000000O00O = false;
               this.O000000000O0O = false;
            }

            if (var2) {
               Vec3d var10 = O0000000000.player.getVelocity();
               O0000000000.player.setVelocity(var10.x * this.O000000000O0, var10.y, var10.z * this.O000000000O0);
            }
         }
      }
   }
}
