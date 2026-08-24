package oxxxde

import net.minecraft.client.MinecraftClient
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.network.ClientPlayerInteractionManager
import net.minecraft.client.world.ClientWorld

// $VF: Compiled from heavy
fun getWorld(): ClientWorld {
   val var10000: ClientWorld = getMc().world
   var10000
}

fun getInteractionManager(): ClientPlayerInteractionManager {
   val var10000: ClientPlayerInteractionManager = getMc().interactionManager
   var10000
}

fun getPlayer(): ClientPlayerEntity {
   val var10000: ClientPlayerEntity = getMc().player
   var10000
}

fun getMc(): MinecraftClient {
   val var10000: MinecraftClient = MinecraftClient.getInstance()
   var10000
}
