package oxxxde

import com.mojang.blaze3d.textures.GpuTexture
import java.awt.Color
import net.minecraft.client.gui.screen.ChatScreen
import net.minecraft.client.texture.AbstractTexture
import net.minecraft.client.texture.GlTexture
import net.minecraft.util.Identifier
import org.joml.Vector4f
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object بط : دِ("MediaPlayerInfo", ظن.getHUD(), "Отображает инфо от играющей песне") {
   private final val inactiveTitleColor: Color = بح.INSTANCE.setAlpha(طغ.INSTANCE.TITLE_COLOR, 0.72F)
   private final val topPanelRound: Vector4f = Vector4f()
   private final val artworkPlaceholderColor: Color = بح.INSTANCE.setAlpha(طغ.INSTANCE.TITLE_COLOR, 0.12F)
   private final var cachedRemainingText: String = "-0:00"
   private const val CHAT_DRAWER_ANIMATION_MILLIS: Long = 180L
   private const val MODE_FREE: Int = 0
   private final val inactiveBarsColor: Color = بح.INSTANCE.setAlpha(طغ.INSTANCE.TITLE_COLOR, 0.45F)
   private final var cachedRemainingSeconds: Long = java.lang.Long.MIN_VALUE
   private final var lastRefreshAt: Long
   private final val playingBarsTrackColor: Color = بح.INSTANCE.setAlpha(طغ.INSTANCE.TITLE_COLOR, 0.16F)
   private final val mode: ظي = دِ.mode$default(INSTANCE, "Режим", CollectionsKt.listOf("Свободный", "Статичный"), 0, null, 12, null)
   private final val artworkRound: Vector4f = Vector4f()
   private final val inactiveArtistColor: Color = بح.INSTANCE.setAlpha(طغ.INSTANCE.VALUE_COLOR, 0.82F)
   private final val inactiveBarsTrackColor: Color = بح.INSTANCE.setAlpha(طغ.INSTANCE.TITLE_COLOR, 0.08F)
   private final val titleScroller: بق = بق(0L, 0L, 0L, 7, null)
   private final val renderedBounds: ذْ = ذْ(0.0F, 0.0F, 0.0F, 0.0F, 15, null)
   private const val MODE_STATIC: Int = 1
   private final val hudPosition: دض = دض(0.0F, 0.0F, 3, null)
   private const val REFRESH_INTERVAL_MS: Long = 400L
   private final val artistScroller: بق = بق(0L, 0L, 0L, 7, null)
   private final val chatDrawerAnimation: سط = سط()
   private final val drawerRound: Vector4f = Vector4f()
   private final var controlBoundsActive: Boolean
   private final val draggable: ظذ = INSTANCE.draggable(INSTANCE.getName(), 210.0F, 120.0F)
   private final val previousControlBounds: بٍ = بٍ(0.0F, 0.0F, 0.0F, 0.0F, 15, null)
   private final val playPauseControlBounds: بٍ = بٍ(0.0F, 0.0F, 0.0F, 0.0F, 15, null)
   private final val nextControlBounds: بٍ = بٍ(0.0F, 0.0F, 0.0F, 0.0F, 15, null)

   private fun renderHud(preview: Boolean) {
      val margin: Float = طغ.INSTANCE.margin()
      val width: Float = طغ.INSTANCE.scaled(111.0F)
      val height: Float = طغ.INSTANCE.headerTextSize() + margin * 2.2F
      val alpha: Float = this.tabAlpha()
      if (alpha <= 0.0F) {
         this.clearControlBounds()
         draggable.width = 0.0F
         draggable.height = 0.0F
         renderedBounds.clear()
      } else {
         val position: دض = this.resolvePosition(width, height)
         val x: Float = position.x
         val y: Float = position.y
         val drawerProgress: Float = this.currentDrawerProgress(preview)
         val panelCorner: Float = طغ.INSTANCE.scaled(6.0F)
         topPanelRound.set(panelCorner, panelCorner, panelCorner * (1.0F - drawerProgress), panelCorner * (1.0F - drawerProgress))
         val drawerOverlap: Float = طغ.INSTANCE.scaled(4.0F)
         val drawerLift: Float = طغ.INSTANCE.scaled(2.0F)
         val drawerHeight: Float = height + drawerOverlap + drawerLift
         renderedBounds.set(
            x, y, width, height + RangesKt.coerceAtLeast(height + drawerOverlap + drawerLift - drawerOverlap - drawerLift, 0.0F) * drawerProgress
         )
         val artSize: Float = height - margin * 1.45F
         val gap: Float = طغ.INSTANCE.scaled(5.0F)
         val artX: Float = x + margin / 1.5F
         val artY: Float = y + (height - artSize) / 2.0F
         val barsWidth: Float = طغ.INSTANCE.scaled(18.0F)
         val barsGap: Float = طغ.INSTANCE.scaled(1.8F)
         val barWidth: Float = طغ.INSTANCE.scaled(2.0F)
         val maxBarHeight: Float = artSize - margin / 2.0F
         val minBarHeight: Float = طغ.INSTANCE.scaled(2.2F)
         val titleSize: Float = طغ.INSTANCE.scaled(6.0F)
         val artistSize: Float = طغ.INSTANCE.scaled(6.0F)
         val textX: Float = artX + artSize + gap
         val textRight: Float = x + width - barsWidth - طغ.INSTANCE.scaled(5.0F)
         val textWidth: Float = RangesKt.coerceAtLeast(textRight - textX, طغ.INSTANCE.scaled(20.0F))
         val playing: Boolean = تر.getPlaing()
         val titleColor: Color = this.withAlpha(if (playing) طغ.INSTANCE.TITLE_COLOR else inactiveTitleColor, alpha)
         val artistColor: Color = this.withAlpha(if (playing) طغ.INSTANCE.VALUE_COLOR else inactiveArtistColor, alpha)
         val rawArtist: java.lang.String = this.currentArtist()
         val artistGap: Float = if (StringsKt.isBlank(rawArtist)) 0.0F else margin / 1.5F
         val titleText: java.lang.String = this.currentTitle()
         val titleFont: جً = رَ.INSTANCE.getGS_MEDIUM().priority(صؤ.HUD_TEXT)
         val artistFont: جً = رَ.INSTANCE.getGS_REGULAR().priority(صؤ.HUD_TEXT)
         val availableSharedWidth: Float = RangesKt.coerceAtLeast(textWidth - artistGap, 0.0F)
         val halfSharedWidth: Float = availableSharedWidth / 2.0F
         val titleMeasuredWidth: Float = جً.getWidth$default(titleFont, titleText, titleSize, 0.0F, 4, null)
         val artistMeasuredWidth: Float = if (StringsKt.isBlank(rawArtist)) 0.0F else جً.getWidth$default(artistFont, rawArtist, artistSize, 0.0F, 4, null)
         val titleWidth: Float = RangesKt.coerceAtMost(
            if (StringsKt.isBlank(rawArtist))
               textWidth
               else
               (
                  if (titleMeasuredWidth > halfSharedWidth && artistMeasuredWidth > halfSharedWidth)
                     halfSharedWidth
                     else
                     (
                        if (artistMeasuredWidth <= 0.0F)
                           textWidth
                           else
                           (
                              if (titleMeasuredWidth > halfSharedWidth)
                                 RangesKt.coerceAtLeast(availableSharedWidth - artistMeasuredWidth, طغ.INSTANCE.scaled(12.0F))
                                 else
                                 RangesKt.coerceAtLeast(titleMeasuredWidth, طغ.INSTANCE.scaled(12.0F))
                           )
                     )
               ),
            textWidth
         )
         val titleTop: Float = y + this.centeredTopOffset(رَ.INSTANCE.getGS_MEDIUM(), titleSize, height) - طغ.INSTANCE.scaled(0.1F)
         val artistTop: Float = y + this.centeredTopOffset(رَ.INSTANCE.getGS_REGULAR(), artistSize, height)
         this.clearControlBounds()
         if (drawerProgress > 0.001F) {
            this.renderChatDrawer(x, y, width, height, drawerHeight, drawerOverlap, drawerLift, drawerProgress, alpha, playing)
         }

         ذر.INSTANCE
            .getBLURRED_RECT()
            .priority(صؤ.HUD_RECT)
            .color(this.withAlpha(طغ.INSTANCE.PANEL_COLOR, alpha))
            .mix(0.9F)
            .round(topPanelRound)
            .draw(x, y, width, height)
            val artworkCorner: Float = طغ.INSTANCE.scaled(6.0F)
         val artworkSideCorner: Float = طغ.INSTANCE.scaled(4.5F)
         artworkRound.set(artworkCorner, artworkSideCorner, artworkCorner, artworkSideCorner)
         ذر.INSTANCE
            .getBLURRED_RECT()
            .priority(صؤ.HUD_RECT)
            .color(this.withAlpha(طغ.INSTANCE.HEADER_COLOR, alpha))
            .mix(0.9F)
            .round(artworkRound)
            .draw(artX, artY, artSize, artSize)
            this.drawArtwork(artX, artY, artSize, alpha)
         val titleFits: Boolean = titleMeasuredWidth <= titleWidth
         if (titleMeasuredWidth <= titleWidth) {
            جً.drawText$default(titleFont, titleText, textX, titleTop, titleSize, titleColor, 0.0F, 0.0F, 0.0F, 0, 0.0F, 992, null)
         } else {
            بق.draw$default(titleScroller, titleFont, titleText, textX, titleTop, titleSize, titleColor, titleWidth, true, 0.0F, 256, null)
         }

         if (!StringsKt.isBlank(rawArtist)) {
            بق.draw$default(
               artistScroller,
               artistFont,
               rawArtist,
               if (titleFits) textX + titleMeasuredWidth + artistGap else textX + titleWidth + artistGap,
               artistTop,
               artistSize,
               artistColor,
               RangesKt.coerceAtLeast(textRight - (if (titleFits) textX + titleMeasuredWidth + artistGap else textX + titleWidth + artistGap), 0.0F),
               true,
               0.0F,
               256,
               null
            )
         }

         this.drawBars(x + width - barsWidth, artY + margin / 4.0F, barWidth, barsGap, minBarHeight, maxBarHeight, alpha, playing)
         if (mode.selectedIndex == 0) {
            draggable.width = width
            draggable.height = height + RangesKt.coerceAtLeast(drawerHeight - drawerOverlap - drawerLift, 0.0F) * drawerProgress
         } else {
            draggable.width = 0.0F
            draggable.height = 0.0F
         }
      }
   }

   @Commando
   public fun onOverlayRender(event: ثآ) {
      maybeRefreshTrackInfo$default(this, false, 1, null)
      val preview: Boolean = ضك.getMc().currentScreen is ChatScreen
      if (ضك.getMc().player == null && !preview) {
         draggable.width = 0.0F
         draggable.height = 0.0F
         renderedBounds.clear()
      } else {
         this.renderHud(preview)
      }
   }

   public fun onChatClick(mouseX: Int, mouseY: Int, button: Int): Boolean {
      if (button != 0) {
         return false
      } else if (!this.isEnabled()) {
         return false
      } else if (ضك.getMc().currentScreen !is ChatScreen) {
         return false
      } else {
         val x: Float = mouseX
         val y: Float = mouseY
         if (controlBoundsActive && previousControlBounds.contains(x, (float)mouseY)) {
            تر.previousTrack()
            return true
         } else if (controlBoundsActive && playPauseControlBounds.contains(x, y)) {
            تر.playpauseTrack()
            return true
         } else if (controlBoundsActive && nextControlBounds.contains(x, y)) {
            تر.nextTrack()
            return true
         } else {
            return false
         }
      }
   }

   private fun drawArtwork(x: Float, y: Float, size: Float, alpha: Float) {
      val textureId: Identifier = تر.getTextureId()
      if (textureId != null && تر.getTextureWidth() > 0 && تر.getTextureHeight() > 0) {
         val var10000: AbstractTexture = ضك.getMc().getTextureManager().getTexture(textureId)
         val var7: GpuTexture = طث.getGlTextureView(var10000).texture()
         val placeholderColor: GlTexture = var7 as? GlTexture
         if ((var7 as? GlTexture) != null) {
            val var9: جث = ذر.INSTANCE.getTEXTURE_RECT().priority(صؤ.HUD_SPECIAL).texture(placeholderColor.getGlId())
            val var10005: Color = Color.WHITE
            var9.draw(x, y, size, size, var10005, size * 0.2F, 0.0F, 0.0F, 1.0F, 1.0F, -1.0F, alpha)
            return
         }
      }

      ذر.INSTANCE
         .getBLURRED_RECT()
         .priority(صؤ.HUD_RECT)
         .color(this.withAlpha(artworkPlaceholderColor, alpha))
         .mix(0.9F)
         .round(طغ.INSTANCE.scaled(4.0F))
         .draw(x + طغ.INSTANCE.scaled(2.0F), y + طغ.INSTANCE.scaled(2.0F), size - طغ.INSTANCE.scaled(4.0F), size - طغ.INSTANCE.scaled(4.0F))
         جً.drawCenteredText$default(
         رَ.INSTANCE.getGS_MEDIUM().priority(صؤ.HUD_TEXT),
         "M",
         x + size / 2.0F,
         y + this.centeredTopOffset(رَ.INSTANCE.getGS_MEDIUM(), طغ.INSTANCE.scaled(6.5F), size) - طغ.INSTANCE.scaled(0.5F),
         طغ.INSTANCE.scaled(6.5F),
         this.withAlpha(طغ.INSTANCE.TITLE_COLOR, alpha),
         0.0F,
         32,
         null
      )
   }

   public override fun onEnable() {
      this.maybeRefreshTrackInfo(true)
      chatDrawerAnimation.snap(if (ضك.getMc().currentScreen is ChatScreen) 1.0 else 0.0)
   }

   private fun withAlpha(color: Color, factor: Float): Color {
      return if (factor >= 0.999F) color else بح.INSTANCE.setAlpha(color, (float)color.getAlpha() / 255.0F * factor)
   }

   private fun currentDrawerProgress(preview: Boolean): Float {
      chatDrawerAnimation.run(if (preview) 1.0 else 0.0, 180L, رض.SINE_OUT, true)
      chatDrawerAnimation.update()
      return RangesKt.coerceIn(chatDrawerAnimation.get(), 0.0F, 1.0F)
   }

   private fun animatedEnergy(time: Double, index: Int): Float {
      return RangesKt.coerceIn(
         (float)(
            0.18
               + Math.abs(
                     Math.sin(time * 6.2 + (double)index * 0.9) * 0.55
                        + Math.sin(time * 9.4 + (double)index * 1.7 + 1.3) * 0.3
                        + Math.sin(time * 12.8 + (double)index * 2.1 + 2.6) * 0.15
                  )
                  * 0.82
         ),
         0.0F,
         1.0F
      )
   }

   private fun currentTitle(): String {
      return this.sanitize(تر.getTrackTitle(), "Нет трека")
   }

   private fun renderChatDrawer(
      x: Float,
      y: Float,
      width: Float,
      height: Float,
      drawerHeight: Float,
      drawerOverlap: Float,
      drawerLift: Float,
      progress: Float,
      alpha: Float,
      playing: Boolean
   ) {
      val drawerY: Float = y + height - drawerOverlap - drawerLift
      val drawerWidth: Float = RangesKt.coerceAtLeast(width, 0.0F)
      val visibleHeight: Float = drawerHeight * progress
      if (!(drawerWidth <= 0.0F) && !(drawerHeight * progress <= 0.5F)) {
         val drawerBodyTop: Float = drawerY + drawerOverlap + drawerLift
         val drawerBodyHeight: Float = RangesKt.coerceAtLeast(drawerHeight - drawerOverlap - drawerLift, 0.0F)
         val drawerBaseColor: Color = this.withAlpha(طغ.INSTANCE.PANEL_COLOR, progress * alpha)
         val drawerTintColor: Color = this.withAlpha(طغ.INSTANCE.HEADER_COLOR, progress * alpha * 0.9F)
         val drawerCorner: Float = طغ.INSTANCE.scaled(5.0F)
         drawerRound.set(drawerCorner * (1.0F - progress), drawerCorner * (1.0F - progress), drawerCorner, drawerCorner)
         val trackColor: Color = this.withAlpha(طغ.INSTANCE.TITLE_COLOR, 0.12F * progress * alpha)
         val progressColor: Color = this.withAlpha(طغ.INSTANCE.TITLE_COLOR, 0.92F * progress * alpha)
         val titleColor: Color = if (playing)
            this.withAlpha(طغ.INSTANCE.TITLE_COLOR, progress * alpha)
            else
            this.withAlpha(طغ.INSTANCE.TITLE_COLOR, 0.72F * progress * alpha)
            val secondaryColor: Color = if (playing)
            this.withAlpha(طغ.INSTANCE.VALUE_COLOR, progress * alpha)
            else
            this.withAlpha(طغ.INSTANCE.VALUE_COLOR, 0.82F * progress * alpha)
            val timeSize: Float = طغ.INSTANCE.scaled(5.1F)
         val controlSize: Float = طغ.INSTANCE.scaled(5.6F)
         val innerPadding: Float = طغ.INSTANCE.scaled(6.0F)
         val contentShift: Float = (1.0F - progress) * طغ.INSTANCE.scaled(4.0F)
         val timeFont: جً = رَ.INSTANCE.getGS_MEDIUM().priority(صؤ.HUD_TEXT)
         val controlFont: جً = رَ.INSTANCE.getGS_MEDIUM().priority(صؤ.HUD_TEXT)
         val iconControlFont: جً = رَ.INSTANCE.getICON().priority(صؤ.HUD_TEXT)
         val leftText: java.lang.String = تر.getTrackTime()
         val rightText: java.lang.String = this.remainingTimeText()
         val playPauseText: java.lang.String = if (playing) "o" else "p"
         val controlGap: Float = طغ.INSTANCE.scaled(3.0F)
         val previousWidth: Float = جً.getWidth$default(iconControlFont, "m", controlSize, 0.0F, 4, null)
         val playPauseWidth: Float = جً.getWidth$default(iconControlFont, playPauseText, controlSize, 0.0F, 4, null)
         val nextWidth: Float = جً.getWidth$default(iconControlFont, "n", controlSize, 0.0F, 4, null)
         val controlsX: Float = x + drawerWidth - innerPadding - (previousWidth + playPauseWidth + nextWidth + controlGap * 2.0F)
         val rightX: Float = x
            + drawerWidth
            - innerPadding
            - (previousWidth + playPauseWidth + nextWidth + controlGap * 2.0F)
            - طغ.INSTANCE.scaled(6.0F)
            - جً.getWidth$default(timeFont, rightText, timeSize, 0.0F, 4, null)
            val leftX: Float = x + innerPadding
         val progressX: Float = leftX + جً.getWidth$default(timeFont, leftText, timeSize, 0.0F, 4, null) + طغ.INSTANCE.scaled(6.0F)
         val progressWidth: Float = RangesKt.coerceAtLeast(
            RangesKt.coerceAtLeast(rightX - طغ.INSTANCE.scaled(6.0F), progressX) - progressX, طغ.INSTANCE.scaled(12.0F)
         )
         val progressBarHeight: Float = طغ.INSTANCE.scaled(1.8F)
         val progressY: Float = drawerBodyTop + drawerBodyHeight / 2.0F - progressBarHeight / 2.0F + contentShift
         val textY: Float = drawerBodyTop + this.centeredTopOffset(رَ.INSTANCE.getGS_MEDIUM(), timeSize, drawerBodyHeight) + contentShift
         val previousY: Float = drawerBodyTop + this.centeredTopOffset(رَ.INSTANCE.getICON(), controlSize, drawerBodyHeight) + contentShift
         val playPauseY: Float = drawerBodyTop + this.centeredTopOffset(رَ.INSTANCE.getICON(), controlSize, drawerBodyHeight) + contentShift
         val nextY: Float = drawerBodyTop + this.centeredTopOffset(رَ.INSTANCE.getICON(), controlSize, drawerBodyHeight) + contentShift
         val controlPadding: Float = طغ.INSTANCE.scaled(2.5F)
         ذر.INSTANCE.getBLURRED_RECT().priority(صؤ.HUD_RECT).color(drawerBaseColor).mix(0.9F).round(drawerRound).draw(x, drawerY, drawerWidth, visibleHeight)
         ذر.INSTANCE.getBLURRED_RECT().priority(صؤ.HUD_RECT).color(drawerTintColor).mix(0.9F).round(drawerRound).draw(x, drawerY, drawerWidth, visibleHeight)
         جِ.INSTANCE.start(x, drawerY, drawerWidth, visibleHeight)
         جً.drawText$default(timeFont, leftText, leftX, textY, timeSize, titleColor, 0.0F, 0.0F, 0.0F, 0, 0.0F, 992, null)
         جً.drawText$default(timeFont, rightText, rightX, textY, timeSize, secondaryColor, 0.0F, 0.0F, 0.0F, 0, 0.0F, 992, null)
         ذر.INSTANCE
            .getBLURRED_RECT()
            .priority(صؤ.HUD_RECT)
            .color(trackColor)
            .mix(0.9F)
            .round(progressBarHeight / 2.0F)
            .draw(progressX, progressY, progressWidth, progressBarHeight)
            ذر.INSTANCE
            .getBLURRED_RECT()
            .priority(صؤ.HUD_RECT)
            .color(progressColor)
            .mix(0.9F)
            .round(progressBarHeight / 2.0F)
            .draw(progressX, progressY, progressWidth * RangesKt.coerceIn(تر.getProgress(), 0.0F, 1.0F), progressBarHeight)
            previousControlBounds.set(controlsX - controlPadding, drawerBodyTop, previousWidth + controlPadding * 2.0F, drawerBodyHeight)
         جً.drawText$default(iconControlFont, "m", controlsX, previousY, controlSize, titleColor, 0.0F, 0.0F, 0.0F, 0, 0.0F, 992, null)
         val var60: Float = controlsX + (previousWidth + controlGap)
         playPauseControlBounds.set(
            controlsX + (previousWidth + controlGap) - controlPadding, drawerBodyTop, playPauseWidth + controlPadding * 2.0F, drawerBodyHeight
         )
         جً.drawText$default(iconControlFont, playPauseText, var60, playPauseY, controlSize, titleColor, 0.0F, 0.0F, 0.0F, 0, 0.0F, 992, null)
         val var61: Float = var60 + (playPauseWidth + controlGap)
         nextControlBounds.set(var60 + (playPauseWidth + controlGap) - controlPadding, drawerBodyTop, nextWidth + controlPadding * 2.0F, drawerBodyHeight)
         جً.drawText$default(iconControlFont, "n", var61, nextY, controlSize, titleColor, 0.0F, 0.0F, 0.0F, 0, 0.0F, 992, null)
         controlBoundsActive = true
         جِ.INSTANCE.end()
      }
   }

   private fun formatTrackTime(totalSeconds: Long): String {
      return "${totalSeconds / 60L}:${if (totalSeconds % 60L < 10L) "0" else ""}${totalSeconds % 60L}"
   }

   public fun attachedBounds(): ذْ? {
      return if (this.isEnabled() && mode.selectedIndex == 1 && !(renderedBounds.height <= 0.0F)) renderedBounds else null
   }

   private fun clearControlBounds() {
      controlBoundsActive = false
   }

   private fun tabAlpha(): Float {
      return RangesKt.coerceIn(1.0F - ذج.INSTANCE.tabProgress, 0.0F, 1.0F)
   }

   private fun drawBars(x: Float, y: Float, barWidth: Float, gap: Float, minHeight: Float, maxHeight: Float, alpha: Float, playing: Boolean) {
      val time: Double = System.nanoTime() / 1.0E9
      val baseColor: Color = this.withAlpha(if (playing) طغ.INSTANCE.TITLE_COLOR else inactiveBarsColor, alpha)
      val trackColor: Color = this.withAlpha(if (playing) playingBarsTrackColor else inactiveBarsTrackColor, alpha)

      repeat(4) { index ->
         val barHeight: Float = minHeight + (maxHeight - minHeight) * (if (playing) this.animatedEnergy(time, index) else 0.18F + index * 0.03F)
         val barX: Float = x + index * barWidth
         val barY: Float = y + (maxHeight - barHeight)
         ذر.INSTANCE.getBLURRED_RECT().priority(صؤ.HUD_RECT).color(trackColor).mix(0.9F).round(barWidth / 2.0F).draw(barX, y, barWidth, maxHeight)
         ذر.INSTANCE.getBLURRED_RECT().priority(صؤ.HUD_RECT).color(baseColor).mix(0.9F).round(barWidth / 2.0F).draw(barX, barY, barWidth, barHeight)
      }
   }

   private fun centeredTopOffset(font: جً, size: Float, containerHeight: Float): Float {
      return (containerHeight - font.getMetrics().lineHeight * size) * 0.5F
   }

   private fun resolvePosition(width: Float, height: Float): دض {
      if (mode.selectedIndex != 1) {
         hudPosition.x = draggable.x
         hudPosition.y = draggable.y
         return hudPosition
      } else {
         val screenWidth: Float = ضك.getMc().getWindow().getScaledWidth()
         val screenHeight: Float = ضك.getMc().getWindow().getScaledHeight()
         val maxX: Float = RangesKt.coerceAtLeast(screenWidth - width - 3.0F, 3.0F)
         val maxY: Float = RangesKt.coerceAtLeast(screenHeight - height - 3.0F, 3.0F)
         if (تأ.INSTANCE.isEnabled()) {
            val logoBounds: ط = تأ.INSTANCE.currentLogoBounds()
            hudPosition.x = RangesKt.coerceIn(logoBounds.centerX - width / 2.0F, 3.0F, maxX)
            hudPosition.y = RangesKt.coerceIn(logoBounds.y + logoBounds.height + طغ.INSTANCE.scaled(4.0F), 3.0F, maxY)
         } else {
            hudPosition.x = RangesKt.coerceIn((screenWidth - width) / 2.0F, 3.0F, maxX)
            hudPosition.y = RangesKt.coerceIn(تأ.INSTANCE.anchorTopY(), 3.0F, maxY)
         }

         return hudPosition
      }
   }

   private fun sanitize(value: String?, fallback: String): String {
      if (value == null) {
         return fallback
      } else if (StringsKt.isBlank(value)) {
         return fallback
      } else {
         return if (StringsKt.equals(value, "null", true)) fallback else value
      }
   }

   private fun currentArtist(): String {
      return this.sanitize(تر.getArtist(), "Медиа сессия неактивна")
   }

   public override fun onDisable() {
      draggable.width = 0.0F
      draggable.height = 0.0F
      renderedBounds.clear()
      chatDrawerAnimation.snap(0.0)
      this.clearControlBounds()
   }

   private fun remainingTimeText(): String {
      val remaining: Long = RangesKt.coerceAtLeast(RangesKt.coerceAtLeast(تر.getDuration(), 0L) - RangesKt.coerceAtLeast(تر.getPosition(), 0L), 0L)
      if (remaining != cachedRemainingSeconds) {
         cachedRemainingSeconds = remaining
         cachedRemainingText = "-${this.formatTrackTime(remaining)}"
      }

      return cachedRemainingText
   }

   private fun maybeRefreshTrackInfo(force: Boolean = false) {
      val now: Long = System.currentTimeMillis()
      if (force || now - lastRefreshAt >= 400L) {
         lastRefreshAt = now
         تر.updateTrackInfo()
      }
   }
}
