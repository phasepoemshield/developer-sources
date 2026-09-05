package org.wild.mixin.acceser;

import net.minecraft.class_1735;
import net.minecraft.class_465;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_465.class})
public interface HandledScreenAccessor {
   @Accessor("x")
   int litka$getX();

   @Accessor("y")
   int litka$getY();

   @Accessor("focusedSlot")
   class_1735 litka$getFocusedSlot();

   @Invoker("getSlotAt")
   class_1735 getSlotAtPosition(double var1, double var3);
}
