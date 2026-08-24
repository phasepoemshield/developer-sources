package oxxxde

import java.awt.Color
import net.minecraft.client.MinecraftClient
import net.minecraft.client.gui.Click
import net.minecraft.client.gui.DrawContext
import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen
import net.minecraft.client.gui.screen.option.OptionsScreen
import net.minecraft.client.gui.screen.world.SelectWorldScreen
import net.minecraft.text.Text
import net.minecraft.util.Util

// $VF: Compiled from heavy
public class جذ : Screen(Text.literal("Rain Visuals") as Text) {
   @Deprecated
   @JvmStatic
   public float MAIN_ICON_GLOW_MAX_ALPHA = 0.16F;
   @Deprecated
   @JvmStatic
   public float TITLE_X = 906.0F;
   @Deprecated
   @JvmStatic
   public float BUTTON_ICON_Y_OFFSET = 0.0F;
   private final val hoverProgress: FloatArray
   @Deprecated
   @JvmStatic
   public float BACKGROUND_WIDTH = 3840.0F;
   @Deprecated
   @JvmStatic
   public float MAIN_ICON_SIZE = 85.0F;
   @JvmStatic
   private تو Companion = تو(null);
   @Deprecated
   @JvmStatic
   public float BUTTON_THIRD_Y = 654.0F;
   @Deprecated
   @JvmStatic
   public long MAIN_ICON_GLOW_PERIOD_MS = 2400L;
   @Deprecated
   @JvmStatic
   public float VERSION_GAP = 6.0F;
   @Deprecated
   @JvmStatic
   public float TITLE_SIZE = 16.3F;
   @Deprecated
   @JvmStatic
   public float MAIN_ICON_GLOW_MIN_ALPHA = 0.09F;
   @Deprecated
   @JvmStatic
   public float BUTTON_HEIGHT = 60.0F;
   @Deprecated
   @JvmStatic
   public float DESIGN_HEIGHT = 1080.0F;
   @Deprecated
   @JvmStatic
   public float SPLIT_BUTTON_LEFT_X = 780.0F;
   @Deprecated
   @JvmStatic
   public float WELCOME_TEXT_SIZE = 15.0F;
   @Deprecated
   @JvmStatic
   public float BUTTON_ICON_RIGHT_PADDING = 19.0F;
   @Deprecated
   @JvmStatic
   public float BUTTON_Y = 510.0F;
   @Deprecated
   @JvmStatic
   public float BUTTON_TEXT_Y_OFFSET = -1.0F;
   @Deprecated
   @JvmStatic
   public float TITLE_SMOOTHNESS = 0.6F;
   @Deprecated
   @JvmStatic
   public float HOVER_SPEED = 0.12F;
   @Deprecated
   @JvmStatic
   public float BUTTON_WIDTH = 360.0F;
   @Deprecated
   @JvmStatic
   public float BUTTON_SECOND_Y = 582.0F;
   @Deprecated
   @JvmStatic
   public float DESIGN_WIDTH = 1920.0F;
   @Deprecated
   @JvmStatic
   public float BACKGROUND_HEIGHT = 2160.0F;
   @Deprecated
   @JvmStatic
   public float WELCOME_TEXT_Y_OFFSET = 28.0F;
   @Deprecated
   @JvmStatic
   public float MAIN_ICON_CENTER_Y = 215.0F;
   @Deprecated
   @JvmStatic
   public float BUTTON_RADIUS = 22.0F;
   @Deprecated
   @JvmStatic
   public float TITLE_Y = 302.0F;

   private final val buttons: List<تض> by LazyKt.lazy({ 
      val var10000: MinecraftClient = MinecraftClient.getInstance()
      CollectionsKt.listOf(تض(عا(780.0F, 510.0F, 360.0F, 60.0F), "Одиночная игра", "c", رَ.INSTANCE.getICON(), { 
         `$mc`.setScreen(SelectWorldScreen(`this$0`) as Screen)
         Unit.INSTANCE
      }), تض(عا(780.0F, 582.0F, 360.0F, 60.0F), "Мультиплеер", "w", رَ.INSTANCE.getICON(), { 
         `$mc`.setScreen(MultiplayerScreen(`this$0`) as Screen)
         Unit.INSTANCE
      }), تض(عا(780.0F, 654.0F, 360.0F, 60.0F), "Аккаунты", "X", رَ.INSTANCE.getICON2(), { 
         `this$0`.openIASScreen()
         Unit.INSTANCE
      }), تض(عا(780.0F, 726.0F, 174.0F, 60.0F), "Настройки", "P", رَ.INSTANCE.getICON2(), { 
         `$mc`.setScreen(OptionsScreen(`this$0`, `$mc`.options) as Screen)
         Unit.INSTANCE
      }), تض(عا(966.0F, 726.0F, 174.0F, 60.0F), "Выйти", "V", رَ.INSTANCE.getICON2(), { 
         `$mc`.scheduleStop()
         Unit.INSTANCE
      }))
   })
      private final get() {
         return this.buttons$delegate.value as MutableList<تض>
      }


   @Deprecated
   @JvmStatic
   public float VERSION_SIZE = 14.0F;
   @Deprecated
   @JvmStatic
   public float MAIN_ICON_GLOW_MIN_SCALE = 1.32F;
   @Deprecated
   @JvmStatic
   public float SPLIT_BUTTON_RIGHT_X = 966.0F;
   @Deprecated
   @JvmStatic
   public float BUTTON_TEXT_SIZE = 16.0F;
   @Deprecated
   @JvmStatic
   public float MAIN_ICON_GLOW_MAX_SCALE = 1.62F;
   @Deprecated
   @JvmStatic
   public float BUTTON_X = 780.0F;
   @Deprecated
   @JvmStatic
   public float BUTTON_FOREGROUND_INSET = 0.75F;
   @Deprecated
   @JvmStatic
   public float SPLIT_BUTTON_WIDTH = 174.0F;
   @Deprecated
   @JvmStatic
   public float BUTTON_TEXT_SMOOTHNESS = 0.6F;
   @Deprecated
   @JvmStatic
   public float SPLIT_BUTTON_Y = 726.0F;
   @Deprecated
   @JvmStatic
   public float BUTTON_TEXT_LEFT_PADDING = 24.0F;
   @Deprecated
   @JvmStatic
   public float BUTTON_ICON_SIZE = 19.0F;
   @Deprecated
   @JvmStatic
   public float MAIN_ICON_LAYOUT_SCALE = 2.0F;

   private fun renderMainIconGlow() {
      val var10000: ض = شس.INSTANCE.get("main_menu_icon_glow")
      if (var10000 != null) {
         val uniformScale: Float = Math.min((float)this.width / 1920.0F, (float)this.height / 1080.0F)
         val pulse: Float = (float)((Math.sin((double)(Util.getMeasuringTimeMs() % 2400L) / 2400.0 * Math.PI * 2.0) + 1.0) * 0.5)
         val glowSize: Float = 170.0F * uniformScale * this.lerp(1.32F, 1.62F, pulse)
         val glowAlpha: Float = this.lerp(0.09F, 0.16F, pulse)
         val centerX: Float = this.width * 0.5F
         val centerY: Float = 215.0F * uniformScale
         val var11: جث = ذر.INSTANCE.getTEXTURE_RECT().priority(صؤ.GUI_RECT).texture(var10000.getTexId())
         val var10001: Float = centerX - glowSize * 0.5F
         val var10002: Float = centerY - glowSize * 0.5F
         val var10005: Color = Color.WHITE
         جث.draw$default(var11, var10001, var10002, glowSize, glowSize, var10005, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, glowAlpha, 1984, null)
      }
   }

   private fun renderBackground() {
      val screenAspect: Float = (float)this.width / this.height
      var drawWidth: Float = 0.0F
      var drawHeight: Float = 0.0F
      if (screenAspect > 1.7777778F) {
         drawWidth = this.width
         drawHeight = this.width / 1.7777778F
      } else {
         drawWidth = this.height * 1.7777778F
         drawHeight = this.height
      }

      val x: Float = (this.width - drawWidth) / 2.0F
      val y: Float = (this.height - drawHeight) / 2.0F
      val var10000: ض = شس.INSTANCE.get("main_menu_background")
      if (var10000 != null) {
         val var11: جث = ذر.INSTANCE.getTEXTURE_RECT().priority(صؤ.GUI_RECT).texture(var10000.getTexId())
         val var10001: Float = x - 2.0F
         val var10002: Float = y - 2.0F
         val var10003: Float = drawWidth + 4.0F
         val var10004: Float = drawHeight + 4.0F
         val var10005: Color = Color.WHITE
         جث.draw$default(var11, var10001, var10002, var10003, var10004, var10005, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 0.0F, 2752, null)
      }
   }

   public open fun shouldCloseOnEsc(): Boolean {
      return false
   }

   fun mouseClicked(bl: Click, event: Boolean): Boolean {
      val scaleX: Float = this.width / 1920.0F
      val scaleY: Float = this.height / 1080.0F
      val mouseX: Double = event.x()
      val mouseY: Double = event.y()

      for (`element$iv` in this.buttons) {
         val btn: تض = `element$iv` as تض
         val x: Float = (`element$iv` as تض).getRect().x * scaleX
         val y: Float = (`element$iv` as تض).getRect().y * scaleY
         if (mouseX >= x && mouseX <= x + btn.getRect().width * scaleX && mouseY >= y && mouseY <= y + btn.getRect().height * scaleY) {
            btn.action()
            true
         }
      }

      super.mouseClicked(event, bl)
   }

   private fun renderMainIcon() {
      val uniformScale: Float = Math.min((float)this.width / 1920.0F, (float)this.height / 1080.0F)
      طئ.enqueueA(
         (float)this.width * 0.5F + 170.0F * uniformScale * 0.13F,
         215.0F * uniformScale - 170.0F * uniformScale * 0.5F,
         170.0F * uniformScale,
         Color.WHITE.getRGB()
      )
   }

   private fun renderButtons() {
      val scaleX: Float = this.width / 1920.0F
      val scaleY: Float = this.height / 1080.0F
      val uniformScale: Float = Math.min(scaleX, (float)this.height / 1080.0F)
      val radius: Float = 22.0F * uniformScale
      val foregroundInset: Float = 0.75F * uniformScale
      val foregroundRadius: Float = 21.25F * uniformScale
      val textOffsetY: Float = 21.0F
      val `$this$forEachIndexed$iv`: java.lang.Iterable = this.buttons
      var `index$iv`: Int = 0

      for (`item$iv` in `$this$forEachIndexed$iv`) {
         val var13: Int = `index$iv`++
         if (var13 < 0) {
            CollectionsKt.throwIndexOverflow()
         }

         val btn: تض = `item$iv` as تض
         val t: Float = this.hoverProgress[var13]
         val x: Float = btn.getRect().x * scaleX
         val y: Float = btn.getRect().y * scaleY
         val bw: Float = btn.getRect().width * scaleX
         val bh: Float = btn.getRect().height * scaleY
         val bgAlpha: Int = (int)this.lerp(26, 255, t)
         val fgR: Int = (int)this.lerp(23.0F, 255.0F, t)
         val fgAlpha: Int = (int)this.lerp(255, 255, t)
         val outlineColor: Color = Color(255, 255, 255, bgAlpha)
         val foregroundColor: Color = Color(fgR, fgR, fgR, fgAlpha)
         ذر.INSTANCE.getBASIC_RECT().priority(صؤ.GUI_RECT).color(outlineColor).round(radius).draw(x, y, bw, bh)
         ذر.INSTANCE
            .getBASIC_RECT()
            .priority(صؤ.GUI_RECT)
            .color(foregroundColor)
            .round(foregroundRadius)
            .draw(x + foregroundInset, y + foregroundInset, bw - foregroundInset * 2.0F, bh - foregroundInset * 2.0F)
            val contentAlpha: Int = (int)this.lerp(64, 255, t)
         val contentR: Int = (int)this.lerp(255, 0, t)
         val contentColor: Color = Color(contentR, contentR, contentR, contentAlpha)
         جً.drawText$default(
            رَ.INSTANCE.getGS_MEDIUM().priority(صؤ.GUI_TEXT),
            btn.text,
            (btn.getRect().x + 24.0F) * scaleX,
            (btn.getRect().y + textOffsetY) * scaleY,
            16.0F * uniformScale,
            contentColor,
            0.0F,
            0.6F,
            0.0F,
            0,
            0.0F,
            928,
            null
         )
         جً.drawText$default(
            btn.getFont().priority(صؤ.GUI_TEXT),
            btn.icon,
            (btn.getRect().x + btn.getRect().width - 19.0F) * scaleX - جً.getWidth$default(btn.getFont(), btn.icon, 19.0F * uniformScale, 0.0F, 4, null),
            (btn.getRect().y + 20.5F + 0.0F) * scaleY,
            19.0F * uniformScale,
            contentColor,
            0.0F,
            0.6F,
            0.0F,
            0,
            0.0F,
            928,
            null
         )
      }
   }

   private fun lerp(a: Int, b: Int, t: Float): Float {
      return a + (b - a) * t
   }

   private fun openIASScreen() {
      try {
         val var10000: Any = Class.forName("ru.vidtu.ias.screen.AccountScreen").getConstructor(Screen.class).newInstance(this)
         MinecraftClient.getInstance().setScreen(var10000 as Screen)
      } catch (var5: Exception) {
         var5.printStackTrace()
      }
   }

   private fun lerp(a: Float, b: Float, t: Float): Float {
      return a + (b - a) * t
   }

   fun shouldPause(): Boolean {
      false
   }

   private fun renderWelcome() {
      val scaleX: Float = this.width / 1920.0F
      val scaleY: Float = this.height / 1080.0F
      val textSize: Float = 15.0F * Math.min(scaleX, (float)this.height / 1080.0F)
      val fullText: java.lang.String = "Добро пожаловать, ${رغ.getUsername()}"
      جً.drawText$default(
         رَ.INSTANCE.getGS_MEDIUM().priority(صؤ.GUI_TEXT),
         fullText,
         960.0F * scaleX - جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), fullText, textSize, 0.0F, 4, null) / 2.0F,
         482.0F * scaleY,
         textSize,
         Color(255, 255, 255, 160),
         0.0F,
         0.6F,
         0.0F,
         0,
         0.0F,
         928,
         null
      )
   }

   private fun renderTitle() {
      val scaleX: Float = this.width / 1920.0F
      val scaleY: Float = this.height / 1080.0F
      val uniformScale: Float = Math.min(scaleX, (float)this.height / 1080.0F)
      val x: Float = 906.0F * scaleX
      val y: Float = 302.0F * scaleY
      val titleSize: Float = 16.3F * uniformScale
      val versionSize: Float = 14.0F * uniformScale
      val versionY: Float = y + رَ.INSTANCE.getGS_MEDIUM().getHeight(titleSize) + 6.0F * uniformScale
      val versionX: Float = x
         + (
               جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), "RAIN VISUALS", titleSize, 0.0F, 4, null)
                  - جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), "1.21.11", versionSize, 0.0F, 4, null)
            )
            * 0.5F
            val var10000: جً = رَ.INSTANCE.getGS_MEDIUM().priority(صؤ.GUI_TEXT)
      val var10005: Color = Color.WHITE
      جً.drawText$default(var10000, "RAIN VISUALS", x, y, titleSize, var10005, 0.0F, 0.6F, 0.0F, 0, 0.0F, 928, null)
      جً.drawText$default(
         رَ.INSTANCE.getGS_MEDIUM().priority(صؤ.GUI_TEXT),
         "1.21.11",
         versionX,
         versionY,
         versionSize,
         Color(255, 255, 255, 128),
         0.0F,
         0.6F,
         0.0F,
         0,
         0.0F,
         928,
         null
      )
   }

   fun render(context: DrawContext, mouseX: Int, mouseY: Int, delta: Float) {
      ذخ.INSTANCE.ensureLoaded()
      this.updateHover(mouseX, mouseY)
      this.renderBackground()
      this.renderMainIconGlow()
      this.renderMainIcon()
      this.renderTitle()
      this.renderWelcome()
      this.renderButtons()
   }

   private fun updateHover(mouseX: Int, mouseY: Int) {
      val scaleX: Float = this.width / 1920.0F
      val scaleY: Float = this.height / 1080.0F
      val `$this$forEachIndexed$iv`: java.lang.Iterable = this.buttons
      var `index$iv`: Int = 0

      for (`item$iv` in `$this$forEachIndexed$iv`) {
         val var10: Int = `index$iv`++
         if (var10 < 0) {
            CollectionsKt.throwIndexOverflow()
         }

         val btn: تض = `item$iv` as تض
         val x: Float = (`item$iv` as تض).getRect().x * scaleX
         val y: Float = (`item$iv` as تض).getRect().y * scaleY
         this.hoverProgress[var10] = RangesKt.coerceIn(
            this.hoverProgress[var10]
               + (
                  if ((float)mouseX >= x
                        && (float)mouseX <= x + btn.getRect().width * scaleX
                        && (float)mouseY >= y
                        && (float)mouseY <= y + btn.getRect().height * scaleY)
                     0.12F
                     else
                     -0.12F
               ),
            0.0F,
            1.0F
         )
      }
   }
}
