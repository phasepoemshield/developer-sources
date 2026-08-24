package kotakbaz.rain.ui.mainmenu.changelog

import java.awt.Color
import java.util.ArrayList
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import oxxxde.بغ
import oxxxde.جِ
import oxxxde.حظ
import oxxxde.دا
import oxxxde.ذر
import oxxxde.رَ
import oxxxde.ضة

// $VF: Compiled from heavy
public class ChangeLogs {
   private final val logs: ArrayList<حظ> = ArrayList()
   @Deprecated
   @JvmStatic
   public float WIDTH = 192.0F;
   @Deprecated
   @JvmStatic
   public float Y = 24.0F;
   @Deprecated
   @JvmStatic
   public float X = 24.0F;
   @Deprecated
   @JvmStatic
   public float GAP = 5.0F;
   private final var scroll: Float
   @Deprecated
   @JvmStatic
   public float HEIGHT = 130.0F;
   @JvmStatic
   private ضة Companion = ضة(null);
   @Deprecated
   @JvmStatic
   public float CARD_BORDER = 0.33F;

   public fun onScroll(mouseX: Double, mouseY: Double, verticalAmount: Double): Boolean {
      if (!this.contains((float)mouseX, (float)mouseY)) {
         return false
      } else {
         val scrollMin: Float = Math.min(0.0F, 92.5F - this.contentHeight())
         if (scrollMin >= 0.0F) {
            return false
         } else {
            this.scroll = RangesKt.coerceIn(this.scroll + (float)verticalAmount * 10.0F, scrollMin, 0.0F)
            return true
         }
      }
   }

   private fun contains(mouseX: Float, mouseY: Float): Boolean {
      return mouseX >= 24.0F && mouseX <= 216.0F && mouseY >= 24.0F && mouseY <= 154.0F
   }

   public fun render() {
      this.card(24.0F, 24.0F, 192.0F, 130.0F, 7.0F, this.rgba(12, 12, 12, 220))
      this.iconText("l", 32.0F, 32.0F, 5.0F, rgba$default(this, 154, 154, 154, 0, 8, null))
      this.text("Recent Updates", 41.0F, 31.25F, 6.0F, rgba$default(this, 154, 154, 154, 0, 8, null))
      val contentHeight: Float = this.contentHeight()
      val scrollMin: Float = Math.min(0.0F, 92.5F - contentHeight)
      this.scroll = RangesKt.coerceIn(this.scroll, scrollMin, 0.0F)
      this.drawScrollBar(49.0F, 92.5F, contentHeight, scrollMin)
      var yPos: Float = 0.0F
      yPos = 49.0F + this.scroll
      جِ.INSTANCE.start(24.0F, 49.0F, 192.0F, 92.5F)

      for (`element$iv` in this.logs) {
         val version: ChangeLogVersion = `element$iv` as ChangeLogVersion
         val var10002: Float = yPos + 2.75F - 0.25F
         val var10006: Color = Color.WHITE
         this.rect(31.75F, var10002, 2.5F, 2.5F, 1.25F, var10006)
         this.text(version.version, 38.0F, yPos - 0.5F, 6.2F, rgba$default(this, 220, 220, 220, 0, 8, null))
         yPos = yPos + 14.0F

         for (`element$ivx` in version.items) {
            val item: ChangeLogItem = `element$ivx` as ChangeLogItem
            val itemColor: Color = this.itemColor(`element$ivx` as ChangeLogItem)
            this.iconText(this.itemIcon(`element$ivx` as ChangeLogItem), 31.25F, yPos - 0.6F, 5.3F, itemColor)
            this.text(item.text, 41.0F, yPos - 0.1F, 6.1F, itemColor)
            yPos += 12.0F
         }

         val var21: Float = yPos + 7.5F
         this.rect(29.0F, yPos + 7.5F, 172.0F, 0.5F, 0.0F, rgba$default(this, 35, 35, 35, 0, 8, null))
         yPos = var21 + 10.0F
      }

      جِ.INSTANCE.end()
   }

   private fun card(x: Float, y: Float, w: Float, h: Float, r: Float, color: Color) {
      this.rect(x, y, w, h, r, this.rgba(255, 255, 255, 20))
      this.rect(x + 0.33F, y + 0.33F, w - 0.66F, h - 0.66F, RangesKt.coerceAtLeast(r - 0.33F, 0.0F), color)
   }

   private fun itemIcon(item: دا): String {
      val var2: java.lang.String = item.type
      return if (var2 == "+") "h" else (if (var2 == "-") "i" else "l")
   }

   private fun itemColor(item: دا): Color {
      val var10000: Color
      if (item.type == "-") {
         var10000 = rgba$default(this, 120, 120, 120, 0, 8, null)
      } else {
         var10000 = Color.WHITE
      }

      return var10000
   }

   private fun drawScrollBar(contentTop: Float, viewHeight: Float, contentHeight: Float, scrollMin: Float) {
      if (!(contentHeight <= viewHeight)) {
         val handleHeight: Float = Math.max(25.0F, viewHeight * (viewHeight / contentHeight))
         val handleOffset: Float = (viewHeight - handleHeight) * (if (scrollMin == 0.0F) 0.0F else this.scroll / scrollMin)
         this.rect(208.5F, contentTop, 1.0F, viewHeight, 2.0F, rgba$default(this, 20, 20, 20, 0, 8, null))
         this.rect(208.5F, contentTop + handleOffset, 1.0F, handleHeight, 3.0F, rgba$default(this, 45, 45, 45, 0, 8, null))
      }
   }

   private fun text(s: String, x: Float, y: Float, size: Float, color: Color) {
      رَ.INSTANCE.GS_MEDIUM.priority(ClientRenderPipeline.GUI_TEXT).size(size).color(color).drawText(s, x, y)
   }

   private fun iconText(s: String, x: Float, y: Float, size: Float, color: Color) {
      رَ.INSTANCE.ICON.priority(ClientRenderPipeline.GUI_TEXT).size(size).color(color).drawText(s, x, y)
   }

   private fun rect(x: Float, y: Float, w: Float, h: Float, r: Float, color: Color) {
      ذر.INSTANCE.BASIC_RECT.priority(ClientRenderPipeline.GUI_RECT).round(r).color(color).draw(x, y, w, h)
   }

   private fun rgba(r: Int, g: Int, b: Int, a: Int = 255): Color {
      return Color(r, g, b, a)
   }

   public fun add(version: حظ): بغ {
      this.logs.add(version)
      return this
   }

   private fun contentHeight(): Float {
      var height: Float = 0.0F

      for (`element$iv` in this.logs) {
         height = height + 14.0F + (`element$iv` as ChangeLogVersion).items.size() * 12.0F + 17.5F
      }

      return height
   }
}
