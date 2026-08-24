package oxxxde

import net.minecraft.client.network.ClientPlayNetworkHandler
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.network.packet.Packet
import net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket
import net.minecraft.util.PlayerInput
import ru.ocz.protection.annotation.Compile
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
@RecompileFormat
public object ذك : دِ("ShiftTap", ظن.getPLAYER(), "Авто-шифт при ударах по цели") {
   private const val SNEAK_TICKS: Int = 2
   private final var restorePending: Boolean
   private final var sneakTicksLeft: Int

   @Commando
   @Compile
   public fun onUpdate(event: سح) {
      if (ضك.getMc().player != null) {
         if (sneakTicksLeft > 0) {
            this.applySneakState(true)
            sneakTicksLeft--
         } else if (restorePending) {
            this.applySneakState(this.isSneakKeyPressed())
            restorePending = false
         }
      }
   }

   public override fun onEnable() {
      this.resetState()
   }

   private fun startSneakBurst() {
      if (ضك.getMc().player != null) {
         sneakTicksLeft = 2
         restorePending = true
         this.applySneakState(true)
      }
   }

   public override fun onDisable() {
      sneakTicksLeft = 0
      restorePending = false
      this.applySneakState(this.isSneakKeyPressed())
   }

   @Commando
   public fun onAttack(event: ذم) {
      this.startSneakBurst()
   }

   @JvmStatic
   fun {
      اُ.moduleOnFuntime$default(اُ.INSTANCE, INSTANCE, null, 2, null)
   }

   private fun isSneakKeyPressed(): Boolean {
      return ضك.getMc().options.sneakKey.isPressed()
   }

   private fun resetState() {
      sneakTicksLeft = 0
      restorePending = false
   }

   private fun applySneakState(sneaking: Boolean) {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 != null) {
         val var5: PlayerInput = var10000.input.playerInput
         val updated: PlayerInput = PlayerInput(var5.forward(), var5.backward(), var5.left(), var5.right(), var5.jump(), sneaking, var5.sprint())
         var10000.input.playerInput = updated
         var10000.setSneaking(sneaking)
         val var6: ClientPlayNetworkHandler = ضك.getMc().getNetworkHandler()
         if (var6 != null) {
            var6.sendPacket(PlayerInputC2SPacket(updated) as Packet)
         }
      }
   }
}
