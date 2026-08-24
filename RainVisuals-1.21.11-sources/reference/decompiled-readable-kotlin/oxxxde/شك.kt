package oxxxde

import kotakbaz.rain.module.Module
import net.minecraft.client.font.TextRenderer
import net.minecraft.client.gui.DrawContext
import net.minecraft.entity.Entity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.text.Text
import net.minecraft.util.Formatting
import org.joml.Matrix3x2fStack
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
@RecompileFormat
public object شك : Module("CrosshairHP", PLAYER, "Displays target HP under the crosshair") {
   @JvmStatic
   private PlayerEntity target;
   private const val TEXT_Y_OFFSET: Int = 7
   private final var lastAttackAt: Long

   fun isUsableTarget(player: PlayerEntity): Boolean {
      !player.isRemoved() && player.isAlive() && !player.isInvisible()
   }

   fun healthFormatting(health: Float): Formatting {
      if (health <= 5.0F)
         Formatting.RED
         else
         (
            if (health <= 10.0F)
               Formatting.GOLD
               else
               (if (health <= 15.0F) Formatting.YELLOW else (if (health <= 20.0F) Formatting.GREEN else Formatting.DARK_GREEN))
         )
      }

   @Commando
   public fun onAttack(event: ذم) {
      val var3: Entity = event.getEntity()
      val attackedPlayer: PlayerEntity = var3 as? PlayerEntity
      if ((var3 as? PlayerEntity) != null && this.isUsableTarget(var3 as? PlayerEntity)) {
         lastAttackAt = System.currentTimeMillis()
         if (target != attackedPlayer) {
            target = attackedPlayer
         }
      } else {
         lastAttackAt = 0L
      }
   }

   private fun timeSinceLastAttack(): Long {
      return System.currentTimeMillis() - lastAttackAt
   }

   fun renderIndicator(context: DrawContext, target: PlayerEntity) {
      val health: Int = (int)target.getHealth()
      val rendered: java.lang.String = "${this.healthFormatting((float)health)}$health"
      val var10000: TextRenderer = ضك.getMc().textRenderer
      val textWidth: Int = var10000.getWidth(rendered)
      val var10: Int = (int)(ضك.getMc().getWindow().getScaledHeight() / (1.0F * 2.0F))
      val var11: Int = (int)(ضك.getMc().getWindow().getScaledWidth() / (1.0F * 2.0F) - textWidth / 2.0F)
      val var13: Matrix3x2fStack = context.getMatrices()
      var13.pushMatrix()
      if (1.0F > 1.0F) {
         var13.scale(1.0F, 1.0F)
      }

      context.drawText(ضك.getMc().textRenderer, Text.literal(rendered) as Text, var11, var10 + 7, -65536, true)
      var13.popMatrix()
   }

   fun render(context: DrawContext) {
      if (this.isEnabled()) {
         if (this.timeSinceLastAttack() <= 10000L) {
            if (target != null) {
               val player: PlayerEntity = target
               if (this.isUsableTarget(target)) {
                  this.renderIndicator(context, player)
               }
            }
         }
      }
   }

   public override fun onDisable() {
      lastAttackAt = 0L
      target = null
   }
}
