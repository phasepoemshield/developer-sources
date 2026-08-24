package oxxxde

import com.mojang.brigadier.arguments.ArgumentType
import com.mojang.brigadier.builder.LiteralArgumentBuilder
import com.mojang.brigadier.builder.RequiredArgumentBuilder
import net.minecraft.class_637

// $VF: Compiled from heavy
public companion object اث {
   public fun <T> argument(name: String, type: ArgumentType<Any>): RequiredArgumentBuilder<class_637, Any> {
      val var10000: RequiredArgumentBuilder = RequiredArgumentBuilder.argument(name, type)
      return var10000
   }

   public fun literal(name: String): LiteralArgumentBuilder<class_637> {
      val var10000: LiteralArgumentBuilder = LiteralArgumentBuilder.literal(name)
      return var10000
   }
}
