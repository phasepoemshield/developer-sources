package org.wild.mixin.acceser;

import net.minecraft.class_310;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_310.class})
public interface MinecraftClientAccessor {
   @Accessor("attackCooldown")
   void setAttackCooldown(int var1);

   @Accessor("attackCooldown")
   int getAttackCooldown();

   @Accessor("itemUseCooldown")
   void setItemUseCooldown(int var1);

   @Accessor("itemUseCooldown")
   int getItemUseCooldown();

   @Invoker("doAttack")
   boolean invokeDoAttack();

   @Invoker("doItemUse")
   void invokeDoItemUse();

   @Invoker("setWorld")
   void wild$setWorld(class_638 var1);
}
