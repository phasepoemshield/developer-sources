package oxxxde

import com.mojang.brigadier.CommandDispatcher
import com.mojang.brigadier.builder.LiteralArgumentBuilder
import net.minecraft.class_637

// $VF: Compiled from heavy
public open class اه(name: String) {
   public final val name: String
   protected final val singleSuccess: Int
   @JvmStatic
   public اث Companion = اث(null);

   public open fun execute(builder: LiteralArgumentBuilder<class_637>) {
   }

   public fun register(dispatcher: CommandDispatcher<class_637>) {
      val builder: LiteralArgumentBuilder = LiteralArgumentBuilder.literal(this.name)
      this.execute(builder)
      dispatcher.register(builder)
   }

   init {
      this.name = name
      this.singleSuccess = 1
   }
}
