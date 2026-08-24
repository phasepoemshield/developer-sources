package oxxxde

import java.awt.Color
import net.minecraft.client.gui.screen.ChatScreen
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.util.math.MathHelper
import org.joml.Vector4f
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object ذً : دِ("CoordinatesHUD", ظن.getHUD(), "Отображает ваши координаты") {
   private const val Y_LABEL: String = "Y"
   private const val X_LABEL: String = "X"
   private final val dividerColor: Color
   private final var cachedX: Int = Integer.MIN_VALUE
   private const val Z_LABEL: String = "Z"
   private final var xText: String = "0"
   private const val HUD_ICON: String = "s"
   private final var yText: String = "0"
   private final val iconPanelRound: Vector4f = Vector4f()
   private final var zText: String = "0"
   private final var cachedZ: Int = Integer.MIN_VALUE
   private final var cachedY: Int = Integer.MIN_VALUE
   private final val draggable: ظذ = INSTANCE.draggable(INSTANCE.getName(), 200.0F, 260.0F)

   private fun drawDivider(x: Float, y: Float, height: Float, width: Float, color: Color) {
      ذر.INSTANCE
         .getBLURRED_RECT()
         .priority(صؤ.HUD_RECT)
         .color(color)
         .mix(0.9F)
         .round(0.0F)
         .draw(x, y + height / 2.0F - height / 2.5F / 2.0F, width, height / 2.5F)
      }

   @JvmStatic
   fun {
      val var10000: بح = بح.INSTANCE
      val var10001: Color = Color.WHITE
      dividerColor = var10000.setAlpha(var10001, 0.39F)
   }

   @Commando
   public fun onOverlayRender(event: ثآ) {
      val player: ClientPlayerEntity = ضك.getMc().player
      if (player == null && ضك.getMc().currentScreen !is ChatScreen) {
         draggable.width = 0.0F
         draggable.height = 0.0F
      } else {
         this.updateCoordinateText(
            MathHelper.floor(if (player != null) player.getX() else 0.0),
            MathHelper.floor(if (player != null) player.getY() else 0.0),
            MathHelper.floor(if (player != null) player.getZ() else 0.0)
         )
         this.renderHud()
      }
   }

   private fun drawCoordinatePart(
      label: String,
      value: String,
      x: Float,
      labelY: Float,
      valueY: Float,
      labelSize: Float,
      valueSize: Float,
      labelWidth: Float,
      valueWidth: Float,
      labelValueGap: Float,
      labelColor: Color,
      valueColor: Color
   ): Float {
      جً.drawText$default(رَ.INSTANCE.getGS_REGULAR().priority(صؤ.HUD_TEXT), label, x, labelY, labelSize, labelColor, 0.0F, 0.0F, 0.0F, 0, 0.0F, 992, null)
      val valueX: Float = x + labelWidth + labelValueGap
      جً.drawText$default(
         رَ.INSTANCE.getGS_MEDIUM().priority(صؤ.HUD_TEXT),
         value,
         x + labelWidth + labelValueGap,
         valueY,
         valueSize,
         valueColor,
         0.0F,
         0.0F,
         0.0F,
         0,
         0.0F,
         992,
         null
      )
      return valueX + valueWidth
   }

   private fun renderHud() {
      val x: Float = draggable.x
      val y: Float = draggable.y
      val margin: Float = طغ.INSTANCE.margin()
      val height: Float = طغ.INSTANCE.headerTextSize() + margin * 2.2F
      val iconPanelWidth: Float = height + طغ.INSTANCE.scaled(2.5F)
      val contentPadding: Float = margin * 1.15F
      val labelSize: Float = طغ.INSTANCE.scaled(5.3F)
      val valueSize: Float = طغ.INSTANCE.scaled(7.2F)
      val iconSize: Float = طغ.INSTANCE.scaled(10.0F)
      val labelValueGap: Float = طغ.INSTANCE.scaled(2.2F)
      val sectionGap: Float = طغ.INSTANCE.scaled(5.5F)
      val dividerWidth: Float = طغ.INSTANCE.rowDividerWidth()
      val corner: Float = طغ.INSTANCE.scaled(6.0F)
      val xLabelWidth: Float = جً.getWidth$default(رَ.INSTANCE.getGS_REGULAR(), "X", labelSize, 0.0F, 4, null)
      val yLabelWidth: Float = جً.getWidth$default(رَ.INSTANCE.getGS_REGULAR(), "Y", labelSize, 0.0F, 4, null)
      val zLabelWidth: Float = جً.getWidth$default(رَ.INSTANCE.getGS_REGULAR(), "Z", labelSize, 0.0F, 4, null)
      val xValueWidth: Float = جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), xText, valueSize, 0.0F, 4, null)
      val yValueWidth: Float = جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), yText, valueSize, 0.0F, 4, null)
      val zValueWidth: Float = جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), zText, valueSize, 0.0F, 4, null)
      val separatorWidth: Float = sectionGap * 2.0F + dividerWidth
      val width: Float = iconPanelWidth
         + (
            contentPadding * 2.0F
               + (
                  xLabelWidth
                     + yLabelWidth
                     + zLabelWidth
                     + xValueWidth
                     + yValueWidth
                     + zValueWidth
                     + labelValueGap * 3.0F
                     + (sectionGap * 2.0F + dividerWidth) * 2.0F
               )
         )
         val iconColor: Color = طغ.INSTANCE.TITLE_COLOR
      val labelColor: Color = طغ.INSTANCE.VALUE_COLOR
      val valueColor: Color = طغ.INSTANCE.TITLE_COLOR
      val iconPanelColor: Color = طغ.INSTANCE.HEADER_COLOR
      ذر.INSTANCE.getBLURRED_RECT().priority(صؤ.HUD_RECT).color(طغ.INSTANCE.PANEL_COLOR).mix(0.9F).round(corner).draw(x, y, width, height)
      val var10000: جء = ذر.INSTANCE.getBLURRED_RECT().priority(صؤ.HUD_RECT).color(iconPanelColor).mix(0.9F)
      val var10001: Vector4f = iconPanelRound.set(corner, 0.0F, corner, 0.0F)
      var10000.round(var10001).draw(x, y, iconPanelWidth - طغ.INSTANCE.scaled(2.5F), height)
      جً.drawCenteredText$default(
         رَ.INSTANCE.getICON().priority(صؤ.HUD_TEXT),
         "s",
         x + iconPanelWidth / 2.0F,
         y + this.centeredTopOffset(رَ.INSTANCE.getICON(), iconSize, height),
         iconSize,
         iconColor,
         0.0F,
         32,
         null
      )
      val labelY: Float = y + this.centeredTopOffset(رَ.INSTANCE.getGS_REGULAR(), labelSize, height)
      val valueY: Float = y + this.centeredTopOffset(رَ.INSTANCE.getGS_MEDIUM(), valueSize, height)
      var var32: Float = this.drawCoordinatePart(
         "X",
         xText,
         x + iconPanelWidth + contentPadding - طغ.INSTANCE.scaled(2.5F),
         labelY,
         valueY,
         labelSize,
         valueSize,
         xLabelWidth,
         xValueWidth,
         labelValueGap,
         labelColor,
         valueColor
      )
      this.drawDivider(var32 + sectionGap, y, height, dividerWidth, dividerColor)
      var32 = this.drawCoordinatePart(
         "Y", yText, var32 + separatorWidth, labelY, valueY, labelSize, valueSize, yLabelWidth, yValueWidth, labelValueGap, labelColor, valueColor
      )
      this.drawDivider(var32 + sectionGap, y, height, dividerWidth, dividerColor)
      this.drawCoordinatePart(
         "Z", zText, var32 + separatorWidth, labelY, valueY, labelSize, valueSize, zLabelWidth, zValueWidth, labelValueGap, labelColor, valueColor
      )
      draggable.width = width
      draggable.height = height
   }

   private fun centeredTopOffset(font: جً, size: Float, containerHeight: Float): Float {
      return (containerHeight - font.getMetrics().lineHeight * size) * 0.5F
   }

   public override fun onDisable() {
      draggable.width = 0.0F
      draggable.height = 0.0F
   }

   private fun updateCoordinateText(x: Int, y: Int, z: Int) {
      if (cachedX != x) {
         cachedX = x
         xText = java.lang.String.valueOf(x)
      }

      if (cachedY != y) {
         cachedY = y
         yText = java.lang.String.valueOf(y)
      }

      if (cachedZ != z) {
         cachedZ = z
         zText = java.lang.String.valueOf(z)
      }
   }
}
