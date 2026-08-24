package oxxxde

import kotlin.math.MathKt
import net.minecraft.client.font.TextRenderer
import net.minecraft.client.gl.RenderPipelines
import net.minecraft.client.gui.DrawContext
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ItemStack
import net.minecraft.util.Arm
import net.minecraft.util.Identifier

// $VF: Compiled from heavy
public object خص : دِ("ArmorHUD", ظن.getHUD(), "Отображение состояния брони") {
   private final val showDamage: خذ = دِ.boolean$default(خص.INSTANCE, "Отображать прочность", true, null, 4, null)
   private const val DURABILITY_TEXT_SCALE: Float = 0.75F
   @JvmStatic
   private Identifier hotbarTexture;

   private fun durabilityColor(percent: Float): Int {
      return if (percent > 0.55F) -11141291 else (if (percent > 0.25F) -171 else -43691)
   }

   @JvmStatic
   fun {
      val var10000: Identifier = Identifier.ofVanilla("textures/gui/sprites/hud/hotbar.png")
      hotbarTexture = var10000
   }

   fun drawArmorSlot(startX: DrawContext, index: ItemStack, hotbarY: Int, context: Int, stack: Int) {
      if (!stack.isEmpty()) {
         val x: Int = startX + index * 20 + 3
         val y: Int = hotbarY + 3
         if (showDamage.getValue()) {
            this.drawDurability(context, stack, x, hotbarY - 7)
         }

         context.drawItem(stack, x, y)
         context.drawStackOverlay(ضك.getMc().textRenderer, stack, x, y, null)
      }
   }

   fun drawBackground(context: DrawContext, y: Int, startX: Int) {
      context.drawTexture(RenderPipelines.GUI_TEXTURED, hotbarTexture, startX, y, 0.0F, 0.0F, 61, 22, 182, 22)
      context.drawTexture(RenderPipelines.GUI_TEXTURED, hotbarTexture, startX + 60, y, 160.0F, 0.0F, 22, 22, 182, 22)
   }

   fun renderInGameHud(context: DrawContext) {
      if (this.isEnabled()) {
         val var10000: ClientPlayerEntity = ضك.getMc().player
         if (var10000 != null) {
            val hotbarX: Int = (ضك.getMc().getWindow().getScaledWidth() - 182) / 2
            val hotbarY: Int = ضك.getMc().getWindow().getScaledHeight() - 22
            val startX: Int = hotbarX + 190 + (if (var10000.getMainArm() === Arm.LEFT && !ضق.INSTANCE.shouldKeepLeftOffhandSlotInHud()) 28 else 0)
            this.drawBackground(context, startX, hotbarY)
            var var10002: ItemStack = var10000.getEquippedStack(EquipmentSlot.HEAD)
            this.drawArmorSlot(context, var10002, 0, startX, hotbarY)
            var10002 = var10000.getEquippedStack(EquipmentSlot.CHEST)
            this.drawArmorSlot(context, var10002, 1, startX, hotbarY)
            var10002 = var10000.getEquippedStack(EquipmentSlot.LEGS)
            this.drawArmorSlot(context, var10002, 2, startX, hotbarY)
            var10002 = var10000.getEquippedStack(EquipmentSlot.FEET)
            this.drawArmorSlot(context, var10002, 3, startX, hotbarY)
         }
      }
   }

   fun drawDurability(context: DrawContext, y: ItemStack, stack: Int, x: Int) {
      if (stack.isDamageable()) {
         val max: Int = RangesKt.coerceAtLeast(stack.getMaxDamage(), 1)
         val value: java.lang.String = java.lang.String.valueOf(RangesKt.coerceAtLeast(max - stack.getDamage(), 0))
         val color: Int = this.durabilityColor((float)(max - stack.getDamage()) / (float)max)
         val var10000: Float = (x + 8) / 0.75F
         val var10001: TextRenderer = ضك.getMc().textRenderer
         val textX: Int = MathKt.roundToInt(var10000 - (float)var10001.getWidth(value) / 2.0F)
         val var12: Int = MathKt.roundToInt((float)y / 0.75F)
         context.getMatrices().pushMatrix()
         context.getMatrices().scale(0.75F, 0.75F)
         context.drawTextWithShadow(ضك.getMc().textRenderer, value, textX, var12, color)
         context.getMatrices().popMatrix()
      }
   }
}
