package oxxxde

import java.awt.Color
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import kotakbaz.rain.mixin.BossBarHudAccessor
import net.minecraft.client.gui.hud.BossBarHud
import net.minecraft.client.network.ClientPlayNetworkHandler
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.network.PlayerListEntry
import org.joml.Vector4f
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object تأ : دِ("Watermark", ظن.getHUD(), "Отображение полезной информации") {
   private const val CLIENT_ICON: String = "a"
   private const val POSITION_CENTER: Int = 0

   private final val rightParts: Array<عب> by LazyKt.lazy(
      LazyThreadSafetyMode.NONE,
      { 
         arrayOf(
            عب("j", رَ.INSTANCE.getICON(), 0.0F, طغ.INSTANCE.TITLE_COLOR, 0.0F, 0.0F),
            عب(cachedFpsText, رَ.INSTANCE.getGS_MEDIUM(), 0.0F, طغ.INSTANCE.TITLE_COLOR, 0.0F, 0.0F),
            عب("fps", رَ.INSTANCE.getGS_REGULAR(), 0.0F, طغ.INSTANCE.VALUE_COLOR, 0.0F, 0.0F),
            عب("l", رَ.INSTANCE.getICON(), 0.0F, طغ.INSTANCE.TITLE_COLOR, 0.0F, 0.0F),
            عب(cachedTimeText, رَ.INSTANCE.getGS_MEDIUM(), 0.0F, طغ.INSTANCE.TITLE_COLOR, 0.0F, 0.0F)
         )
      }
   )

   private final val currentBounds: ط = ط(0.0F, 0.0F, 0.0F, 0.0F)

   private final val timeParts: Array<عب> by LazyKt.lazy(LazyThreadSafetyMode.NONE, { 
      arrayOf(INSTANCE.getRightParts()[3], INSTANCE.getRightParts()[4])
   })

   private const val PING_ICON: String = "k"
   private final var cachedPing: Int = Integer.MIN_VALUE
   private final val position: ظي = دِ.mode$default(INSTANCE, "Позиция", CollectionsKt.listOf("По центру", "Слева"), 0, null, 12, null)
   private const val FPS_ICON: String = "j"
   private final val bossBarOffsetAnimation: سط = سط()
   private const val USER_ICON: String = "w"
   private const val POSITION_LEFT: Int = 1
   private final val normalHeaderColor: Color =
      Color(
         طغ.INSTANCE.HEADER_COLOR.getRed(),
         طغ.INSTANCE.HEADER_COLOR.getGreen(),
         طغ.INSTANCE.HEADER_COLOR.getBlue(),
         RangesKt.coerceIn((int)((float)طغ.INSTANCE.HEADER_COLOR.getAlpha() * 0.9F), 0, 255)
      )
      private final var cachedFps: Int = Integer.MIN_VALUE
   private const val BOSS_BAR_START_Y: Float = 12.0F
   private final val dividerColor: Color = Color(255, 255, 255, 100)
   private const val TIME_ICON: String = "l"
   private final var positionAnimationTarget: Float = java.lang.Float.NaN
   private final var cachedMinute: Long = java.lang.Long.MIN_VALUE

   private final val roleParts: Array<عب> by LazyKt.lazy(LazyThreadSafetyMode.NONE, { 
      arrayOf(INSTANCE.getLeftParts()[0], INSTANCE.getLeftParts()[1])
   })

   private final val centerParts: Array<عب> by LazyKt.lazy(LazyThreadSafetyMode.NONE, { 
      arrayOf(عب("a", رَ.INSTANCE.getICON(), 0.0F, طغ.INSTANCE.TITLE_COLOR, 0.0F, 0.0F))
   })

   private const val BOSS_BAR_ANIMATION_MILLIS: Long = 180L
   private final val timeFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm")
   private const val POSITION_ANIMATION_MILLIS: Long = 240L
   private const val BOSS_BAR_STEP: Float = 19.0F
   private final var cachedPingText: String = "--"
   private const val BOSS_BAR_HEIGHT: Float = 10.0F

   private final val pingParts: Array<عب> by LazyKt.lazy(LazyThreadSafetyMode.NONE, { 
      arrayOf(INSTANCE.getLeftParts()[2], INSTANCE.getLeftParts()[3], INSTANCE.getLeftParts()[4])
   })

   private final val leftParts: Array<عب> by LazyKt.lazy(LazyThreadSafetyMode.NONE, { 
      val var0: Array<عب> = arrayOfNulls(5)
      var0[0] = عب("w", رَ.INSTANCE.getICON(), 0.0F, طغ.INSTANCE.TITLE_COLOR, 0.0F, 0.0F)
      val var10004: java.lang.String = رغ.getRole()
      var0[1] = عب(var10004, رَ.INSTANCE.getGS_MEDIUM(), 0.0F, طغ.INSTANCE.TITLE_COLOR, 0.0F, 0.0F)
      var0[2] = عب("k", رَ.INSTANCE.getICON(), 0.0F, طغ.INSTANCE.TITLE_COLOR, 0.0F, 0.0F)
      var0[3] = عب(cachedPingText, رَ.INSTANCE.getGS_MEDIUM(), 0.0F, طغ.INSTANCE.TITLE_COLOR, 0.0F, 0.0F)
      var0[4] = عب("ms", رَ.INSTANCE.getGS_REGULAR(), 0.0F, طغ.INSTANCE.VALUE_COLOR, 0.0F, 0.0F)
      var0
   })

   private final val fpsParts: Array<عب> by LazyKt.lazy(LazyThreadSafetyMode.NONE, { 
      arrayOf(INSTANCE.getRightParts()[0], INSTANCE.getRightParts()[1], INSTANCE.getRightParts()[2])
   })

   private final var cachedTimeText: String = "--:--"
   private final val leftLogoRound: Vector4f = Vector4f()
   private final val positionAnimation: سط = سط()
   private final var cachedFpsText: String = "0"
   private final val currentLogoBounds: ط = ط(0.0F, 0.0F, 0.0F, 0.0F)
   private final val layout: ظل = ظل(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 16383, null)

   public override fun onEnable() {
      bossBarOffsetAnimation.snap((double)this.desiredTopY())
      val target: Float = if (position.selectedIndex == 1) 1.0F else 0.0F
      positionAnimation.snap((double)target)
      positionAnimationTarget = target
   }

   private fun partWidth(part: عب): Float {
      val sizeBits: Int = java.lang.Float.floatToRawIntBits(part.size)
      if (!(part.measuredText == part.text) || part.measuredSizeBits != sizeBits) {
         part.measuredText = part.text
         part.measuredSizeBits = sizeBits
         part.measuredWidth = جً.getWidth$default(part.getFont(), part.text, part.size, 0.0F, 4, null)
      }

      return part.measuredWidth
   }

   @Commando
   public fun onRender(event: ثآ) {
      val layout: ظل = this.buildLayout()
      val alpha: Float = RangesKt.coerceIn(1.0F - ذج.INSTANCE.tabProgress * (1.0F - layout.leftProgress), 0.0F, 1.0F)
      if (!(alpha <= 0.0F)) {
         val panelColor: Color = this.withAlpha(طغ.INSTANCE.PANEL_COLOR, alpha)
         val headerColor: Color = if (alpha >= 0.999F) normalHeaderColor else this.withAlpha(طغ.INSTANCE.HEADER_COLOR, alpha * 0.9F)
         ذر.INSTANCE
            .getBLURRED_RECT()
            .priority(صؤ.HUD_RECT)
            .color(panelColor)
            .mix(0.9F)
            .round(طغ.INSTANCE.scaled(6.0F))
            .draw(layout.x, layout.y, layout.width, layout.height)
            val var10000: جء = ذر.INSTANCE.getBLURRED_RECT().priority(صؤ.HUD_RECT).color(headerColor).mix(0.9F)
         val var10001: Vector4f = leftLogoRound.set(طغ.INSTANCE.scaled(6.0F) * layout.leftProgress, 0.0F, طغ.INSTANCE.scaled(6.0F) * layout.leftProgress, 0.0F)
         var10000.round(var10001).draw(layout.centerBackgroundX, layout.y, layout.centerWidth, layout.height)
         this.drawParts(this.getCenterParts(), layout.centerX, layout.y, alpha)
         val centeredContentAlpha: Float = alpha * (1.0F - layout.leftProgress)
         if (centeredContentAlpha > 0.001F) {
            this.drawParts(this.getLeftParts(), layout.leftX, layout.y, centeredContentAlpha)
            this.drawParts(this.getRightParts(), layout.rightX, layout.y, centeredContentAlpha)
            this.drawDivider(layout.leftX + this.measure(this.getLeftParts(), 2) + طغ.INSTANCE.scaled(4.5F), layout.y, layout.height, centeredContentAlpha)
            this.drawDivider(layout.rightX + this.measure(this.getRightParts(), 3) + طغ.INSTANCE.scaled(4.5F), layout.y, layout.height, centeredContentAlpha)
         }

         val var9: Float = alpha * layout.leftProgress
         if (var9 > 0.001F) {
            this.drawParts(this.getRoleParts(), layout.roleX, layout.y, var9)
            this.drawParts(this.getFpsParts(), layout.fpsX, layout.y, var9)
            this.drawParts(this.getPingParts(), layout.pingX, layout.y, var9)
            this.drawParts(this.getTimeParts(), layout.timeX, layout.y, var9)
            this.drawDivider(layout.roleX + measure$default(this, this.getRoleParts(), 0, 2, null) + طغ.INSTANCE.scaled(4.5F), layout.y, layout.height, var9)
            this.drawDivider(layout.fpsX + measure$default(this, this.getFpsParts(), 0, 2, null) + طغ.INSTANCE.scaled(4.5F), layout.y, layout.height, var9)
            this.drawDivider(layout.pingX + measure$default(this, this.getPingParts(), 0, 2, null) + طغ.INSTANCE.scaled(4.5F), layout.y, layout.height, var9)
         }
      }
   }

   private fun desiredTopY(): Float {
      return Math.max(طغ.INSTANCE.scaled(5.0F), this.bossBarBottom() + طغ.INSTANCE.scaled(4.0F))
   }

   private fun drawParts(parts: Array<عب>, startX: Float, topY: Float, alpha: Float) {
      var cursor: Float = startX
      var index: Int = 0

      for (var7 in parts.length..index) {
         val part: عب = parts[index]
         جً.drawText$default(
            parts[index].getFont().priority(صؤ.HUD_TEXT),
            parts[index].text,
            cursor,
            topY + parts[index].topOffset,
            parts[index].size,
            this.withAlpha(parts[index].color, alpha),
            0.0F,
            0.0F,
            0.0F,
            0,
            0.0F,
            992,
            null
         )
         cursor += this.partWidth(part)
         if (index != ArraysKt.getLastIndex(parts)) {
            cursor += part.spacingAfter
         }
      }
   }

   fun getTimeParts(): Array<عب> {
      timeParts$delegate.value as Array<عب>
   }

   private fun measure(parts: Array<عب>, limit: Int = parts.length): Float {
      var width: Float = 0.0F
      val lastIndex: Int = limit + -1

      repeat(limit) { index ->
         val part: عب = parts[index]
         width += this.partWidth(parts[index])
         if (index != lastIndex) {
            width += part.spacingAfter
         }
      }

      return width
   }

   private fun lerp(from: Float, to: Float, progress: Float): Float {
      return from + (to - from) * progress
   }

   fun getLeftParts(): Array<عب> {
      leftParts$delegate.value as Array<عب>
   }

   fun getRightParts(): Array<عب> {
      rightParts$delegate.value as Array<عب>
   }

   fun getCenterParts(): Array<عب> {
      centerParts$delegate.value as Array<عب>
   }

   public override fun onDisable() {
      bossBarOffsetAnimation.snap((double)this.desiredTopY())
   }

   private fun configurePart(part: عب, size: Float, topOffset: Float, spacingAfter: Float) {
      part.size = size
      part.topOffset = topOffset
      part.spacingAfter = spacingAfter
   }

   private fun sessionUuid(): UUID? {
      val var1: تأ = this

      var `$this$sessionUuid_u24lambda_u240`: تأ
      try {
         `$this$sessionUuid_u24lambda_u240` = var1
         `$this$sessionUuid_u24lambda_u240` = (تأ)Result.constructor_impl/* $VF was: constructor-impl */(ضك.getMc().getSession().getUuidOrNull())
      } catch (var4: java.lang.Throwable) {
         `$this$sessionUuid_u24lambda_u240` = (تأ)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var4))
      }

      return (if (isFailure) null else `$this$sessionUuid_u24lambda_u240`) as UUID
   }

   fun getPingParts(): Array<عب> {
      pingParts$delegate.value as Array<عب>
   }

   private fun updatePositionProgress(): Float {
      val target: Float = if (position.selectedIndex == 1) 1.0F else 0.0F
      if (!(Math.abs(positionAnimationTarget) <= java.lang.Float.MAX_VALUE)) {
         positionAnimation.snap((double)target)
         positionAnimationTarget = target
      } else if (positionAnimationTarget != target) {
         positionAnimation.run(target, 240L, رض.SINE_OUT)
         positionAnimationTarget = target
      }

      positionAnimation.update()
      return RangesKt.coerceIn(positionAnimation.get(), 0.0F, 1.0F)
   }

   fun getRoleParts(): Array<عب> {
      roleParts$delegate.value as Array<عب>
   }

   private fun getPing(): Int {
      var var2: UUID
      run label31@{
         val var10000: ClientPlayerEntity = ضك.getMc().player
         if (var10000 != null) {
            var2 = var10000.getUuid()
            if (var2 != null) {
               return@label31
            }
         }

         var2 = this.sessionUuid()
         if (var2 == null) {
            return -1
         }
      }

      val var3: ClientPlayNetworkHandler = ضك.getMc().getNetworkHandler()
      if (var3 != null) {
         val var4: PlayerListEntry = var3.getPlayerListEntry(var2)
         if (var4 != null) {
            return RangesKt.coerceAtLeast(var4.getLatency(), 0)
         }
      }

      return -1
   }

   public fun anchorTopY(): Float {
      return this.animatedTopY()
   }

   private fun withAlpha(color: Color, factor: Float): Color {
      return if (factor >= 0.999F) color else بح.INSTANCE.multiplyAlpha(color, factor)
   }

   fun getFpsParts(): Array<عب> {
      fpsParts$delegate.value as Array<عب>
   }

   private fun centeredTopOffset(font: جً, size: Float, containerHeight: Float): Float {
      return (containerHeight - font.getMetrics().lineHeight * size) * 0.5F
   }

   private fun buildLayout(): ظل {
      this.refreshDynamicText()
      val margin: Float = طغ.INSTANCE.margin()
      val height: Float = طغ.INSTANCE.headerTextSize() + margin * 2.2F
      val y: Float = this.animatedTopY()
      val valueSize: Float = طغ.INSTANCE.scaled(7.0F)
      val unitSize: Float = طغ.INSTANCE.scaled(5.0F)
      val sideIconSize: Float = طغ.INSTANCE.scaled(7.0F)
      val centerIconSize: Float = طغ.INSTANCE.scaled(12.0F) * 0.8F
      val valueY: Float = this.centeredTopOffset(رَ.INSTANCE.getGS_MEDIUM(), valueSize, height)
      val unitY: Float = this.centeredTopOffset(رَ.INSTANCE.getGS_REGULAR(), unitSize, height) + طغ.INSTANCE.scaled(1.0F)
      val sideIconY: Float = this.centeredTopOffset(رَ.INSTANCE.getICON(), sideIconSize, height)
      val centerIconY: Float = this.centeredTopOffset(رَ.INSTANCE.getICON(), centerIconSize, height)
      this.configurePart(this.getLeftParts()[0], sideIconSize, sideIconY, طغ.INSTANCE.scaled(3.2F))
      this.configurePart(this.getLeftParts()[1], valueSize, valueY, طغ.INSTANCE.scaled(10.0F))
      this.configurePart(this.getLeftParts()[2], sideIconSize, sideIconY, طغ.INSTANCE.scaled(3.2F))
      this.configurePart(this.getLeftParts()[3], valueSize, valueY, طغ.INSTANCE.scaled(0.5F))
      this.configurePart(this.getLeftParts()[4], unitSize, unitY, 0.0F)
      this.configurePart(this.getCenterParts()[0], centerIconSize, centerIconY, 0.0F)
      this.configurePart(this.getRightParts()[0], sideIconSize, sideIconY, طغ.INSTANCE.scaled(3.2F))
      this.configurePart(this.getRightParts()[1], valueSize, valueY, طغ.INSTANCE.scaled(0.5F))
      this.configurePart(this.getRightParts()[2], unitSize, unitY, طغ.INSTANCE.scaled(10.0F))
      this.configurePart(this.getRightParts()[3], sideIconSize, sideIconY, طغ.INSTANCE.scaled(3.2F))
      this.configurePart(this.getRightParts()[4], valueSize, valueY, 0.0F)
      val leftWidth: Float = measure$default(this, this.getLeftParts(), 0, 2, null)
      val rightWidth: Float = measure$default(this, this.getRightParts(), 0, 2, null)
      val centerIconWidth: Float = measure$default(this, this.getCenterParts(), 0, 2, null)
      val centerWidth: Float = centerIconWidth + margin * 2.0F
      val roleWidth: Float = measure$default(this, this.getRoleParts(), 0, 2, null)
      val pingWidth: Float = measure$default(this, this.getPingParts(), 0, 2, null)
      val fpsWidth: Float = measure$default(this, this.getFpsParts(), 0, 2, null)
      val timeWidth: Float = measure$default(this, this.getTimeParts(), 0, 2, null)
      val groupGap: Float = طغ.INSTANCE.scaled(10.0F)
      val leftProgress: Float = this.updatePositionProgress()
      val centeredWidth: Float = margin * 2.0F + leftWidth + rightWidth + centerWidth + margin * 4.0F
      val leftWidthTotal: Float = centerWidth + roleWidth + fpsWidth + pingWidth + timeWidth + groupGap * 3.0F + margin * 3.0F
      val x: Float = this.lerp(
         (float)ضك.getMc().getWindow().getScaledWidth() / 2.0F - centerWidth / 2.0F - leftWidth - margin * 3.0F, طغ.INSTANCE.scaled(5.0F), leftProgress
      )
      val width: Float = this.lerp(centeredWidth, leftWidthTotal, leftProgress)
      val centeredLogoOffset: Float = leftWidth + margin * 3.0F
      val centerBackgroundX: Float = x + this.lerp(leftWidth + margin * 3.0F, 0.0F, leftProgress)
      val centerX: Float = centerBackgroundX + centerWidth / 2.0F - centerIconWidth / 2.5F
      layout.leftX = x + margin * 1.5F
      layout.rightX = x + centeredLogoOffset + centerWidth + margin * 1.5F
      layout.roleX = x + centerWidth + margin * 1.5F
      layout.fpsX = layout.roleX + roleWidth + groupGap
      layout.pingX = layout.fpsX + fpsWidth + groupGap
      layout.timeX = layout.pingX + pingWidth + groupGap
      layout.x = x
      layout.y = y
      layout.width = width
      layout.height = height
      layout.centerX = centerX
      layout.centerBackgroundX = centerBackgroundX
      layout.centerWidth = centerWidth
      layout.leftProgress = leftProgress
      return layout
   }

   public fun currentBounds(): ط {
      val layout: ظل = this.buildLayout()
      currentBounds.x = layout.x
      currentBounds.y = layout.y
      currentBounds.width = layout.width
      currentBounds.height = layout.height
      return currentBounds
   }

   public fun currentLogoBounds(): ط {
      val layout: ظل = this.buildLayout()
      currentLogoBounds.x = layout.centerBackgroundX
      currentLogoBounds.y = layout.y
      currentLogoBounds.width = layout.centerWidth
      currentLogoBounds.height = layout.height
      return currentLogoBounds
   }

   private fun animatedTopY(): Float {
      val baseY: Float = طغ.INSTANCE.scaled(5.0F)
      bossBarOffsetAnimation.run((double)this.desiredTopY(), 180L, رض.SINE_OUT, true)
      bossBarOffsetAnimation.update()
      return Math.max(baseY, bossBarOffsetAnimation.get())
   }

   private fun bossBarBottom(): Float {
      if (صِ.INSTANCE.isEnabled() && صِ.INSTANCE.getNoBossBar().getValue()) {
         return 0.0F
      } else {
         val var3: BossBarHud = ضك.getMc().inGameHud.getBossBarHud()
         val var10000: BossBarHudAccessor = var3 as? BossBarHudAccessor
         if ((var3 as? BossBarHudAccessor) != null) {
            val var4: java.util.Map = var10000.rain$getBossBars()
            if (var4 != null) {
               if (var4.isEmpty()) {
                  return 0.0F
               }

               val visibleBars: Int = this.visibleBossBarCount(var4.size())
               if (visibleBars <= 0) {
                  return 0.0F
               }

               return 12.0F + (visibleBars + -1) * 19.0F + 10.0F
            }
         }

         return 0.0F
      }
   }

   private fun visibleBossBarCount(totalBossBars: Int): Int {
      if (totalBossBars <= 0) {
         return 0
      } else {
         val heightLimit: Int = ضك.getMc().getWindow().getScaledHeight() / 3
         var visible: Int = 0
         var nextBarY: Byte = 12

         while (visible < totalBossBars) {
            visible++
            nextBarY += 19
            if (nextBarY >= heightLimit) {
               break
            }
         }

         return visible
      }
   }

   private fun drawDivider(x: Float, y: Float, height: Float, alpha: Float) {
      ذر.INSTANCE
         .getBLURRED_RECT()
         .priority(صؤ.HUD_RECT)
         .color(this.withAlpha(dividerColor, alpha))
         .mix(0.9F)
         .round(0.0F)
         .draw(x, y + height / 2.0F - height / 3.5F / 2.0F, طغ.INSTANCE.scaled(1.2F), height / 3.5F)
      }

   private fun refreshDynamicText() {
      val fps: Int = RangesKt.coerceAtLeast(ضك.getMc().getCurrentFps(), 0)
      if (fps != cachedFps) {
         cachedFps = fps
         cachedFpsText = java.lang.String.valueOf(fps)
         this.getRightParts()[1].text = cachedFpsText
      }

      val ping: Int = this.getPing()
      if (ping != cachedPing) {
         cachedPing = ping
         cachedPingText = if (ping >= 0) java.lang.String.valueOf(ping) else "--"
         this.getLeftParts()[3].text = cachedPingText
      }

      val minute: Long = System.currentTimeMillis() / 60000L
      if (minute != cachedMinute) {
         cachedMinute = minute
         val var10000: java.lang.String = LocalTime.now().format(timeFormatter)
         cachedTimeText = var10000
         this.getRightParts()[4].text = cachedTimeText
      }
   }
}
