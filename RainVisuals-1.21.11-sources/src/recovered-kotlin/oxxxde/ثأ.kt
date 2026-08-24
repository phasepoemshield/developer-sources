package oxxxde

import com.mojang.blaze3d.textures.GpuTexture
import java.awt.Color
import java.util.Arrays
import java.util.Locale
import kotakbaz.rain.client.draggable.Draggable
import kotakbaz.rain.client.draggable.animation.AnimationUtil
import kotakbaz.rain.client.draggable.animation.Easing
import kotakbaz.rain.client.util.render.display.TextureRectRenderer
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import kotakbaz.rain.client.util.render.font.Font
import kotakbaz.rain.mixin.GameRendererAccessor
import kotakbaz.rain.module.Module
import net.minecraft.client.gui.DrawContext
import net.minecraft.client.gui.screen.ChatScreen
import net.minecraft.client.network.AbstractClientPlayerEntity
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.texture.AbstractTexture
import net.minecraft.client.texture.GlTexture
import net.minecraft.entity.EquipmentSlot
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.scoreboard.ReadableScoreboardScore
import net.minecraft.scoreboard.ScoreHolder
import net.minecraft.scoreboard.Scoreboard
import net.minecraft.scoreboard.ScoreboardCriterion
import net.minecraft.scoreboard.ScoreboardDisplaySlot
import net.minecraft.scoreboard.ScoreboardObjective
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import org.joml.Vector4f
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object ثأ : Module("TargetHUD", HUD, "Информация о вашей цели") {
   @JvmStatic
   private ItemStack[] equipment = arrayOf(ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY);
   private const val BASE_EQUIPMENT_ITEM_SIZE: Float = 10.0F
   private const val FACE_SIZE_UV: Float = 0.125F
   private const val HAT_U: Float = 0.625F
   private const val FACE_START_V: Float = 0.25F
   private const val BASE_EQUIPMENT_ITEM_GAP: Float = 1.0F
   private const val FACE_U: Float = 0.125F
   @JvmStatic
   private Draggable draggable = INSTANCE.draggable(INSTANCE.getName(), 200.0F, 200.0F);
   private const val SHOW_ANIMATION_MILLIS: Long = 180L
   @JvmStatic
   private AnimationUtil healthAnimation = AnimationUtil();
   private const val FACE_SCALE: Float = 0.015625F
   @JvmStatic
   private AnimationUtil showAnimation = AnimationUtil();
   private const val EMPTY_ITEM_ICON: String = "i"
   private final val sideRound: Vector4f = Vector4f()
   private final var cachedHealthBits: Int
   private final var cachedHealthInitialized: Boolean
   private const val EQUIPMENT_FADE_OUT_CUTOFF: Float = 0.18F
   private final var cachedHealthText: String = "0.0"
   private const val HEALTH_ANIMATION_MILLIS: Long = 400L
   private const val BASE_WIDTH: Float = 115.0F
   @JvmStatic
   private Text cachedNameComponent;
   private const val SKIN_TEXTURE_SIZE: Float = 64.0F
   private const val ITEM_RENDER_SIZE: Float = 16.0F
   private const val FACE_HEIGHT_V: Float = -0.125F
   private final var cachedNameText: String = ""
   @JvmStatic
   private PlayerEntity displayTarget;
   private final val nameScroller: بق = بق(0L, 3000L, 250L, 1, null)

   @Commando
   public fun onUpdate(event: سح) {
      ظً.INSTANCE.update()
      var var10000: PlayerEntity = ظً.INSTANCE.currentTarget()
      var10000 = if (var10000 != null) (if (this.isUsableTarget(var10000)) var10000 else null) else null
      val previewTarget: ClientPlayerEntity = if (ضك.getMc().currentScreen is ChatScreen) ضك.getMc().player else null
      var10000 = var10000
      if (var10000 == null) {
         var10000 = previewTarget as PlayerEntity
      }

      val var8: PlayerEntity = displayTarget
      if (var10000 != null) {
         displayTarget = var10000
         val var9: Float = this.healthProgress(var10000)
         if (!(var8 == var10000)) {
            healthAnimation.snap((double)var9)
         } else {
            healthAnimation.run((double)var9, 400L, Easing.SINE_OUT, true)
         }
      }

      showAnimation.run(if (var10000 != null) 1.0 else 0.0, 180L, Easing.SINE_OUT, true)
      if (var10000 == null && showAnimation.get() <= 0.0F) {
         displayTarget = null
         healthAnimation.snap(0.0)
      }
   }

   private fun clearDraggableBounds() {
      draggable.width = 0.0F
      draggable.height = 0.0F
   }

   fun displayedHealth(player: PlayerEntity): Float {
      var scoreboard: Scoreboard
      var var10000: ScoreboardObjective
      run label48@{
         scoreboard = طث.getScoreboard(player)
         val belowName: ScoreboardObjective = scoreboard.getObjectiveForSlot(ScoreboardDisplaySlot.BELOW_NAME)
         if (belowName != null) {
            var10000 = if (this.isHealthObjective(belowName)) belowName else null
            if (var10000 != null) {
               return@label48
            }
         }

         val var15: java.util.Collection = scoreboard.getObjectives()
         val var9: java.util.Iterator = var15.iterator()

         while (true) {
            if (!var9.hasNext()) {
               var10000 = null
               break
            }

            val `element$iv`: Any = var9.next()
            if ((`element$iv` as ScoreboardObjective).getCriterion() == ScoreboardCriterion.HEALTH) {
               var10000 = (ScoreboardObjective)`element$iv`
               break
            }
         }

         var10000 = var10000
         if (var10000 == null) {
            player.getHealth()
         }
      }

      val var5: ReadableScoreboardScore = scoreboard.getScore(player as ScoreHolder, var10000)
      if (var5 != null) var5.getScore() else player.getHealth()
   }

   fun updateEquipment(target: PlayerEntity) {
      equipment[0] = target.getMainHandStack()
      equipment[1] = target.getOffHandStack()
      equipment[2] = target.getEquippedStack(EquipmentSlot.HEAD)
      equipment[3] = target.getEquippedStack(EquipmentSlot.CHEST)
      equipment[4] = target.getEquippedStack(EquipmentSlot.LEGS)
      equipment[5] = target.getEquippedStack(EquipmentSlot.FEET)
   }

   private fun centeredTopOffset(font: جً, size: Float, containerHeight: Float): Float {
      return (containerHeight - font.metrics.lineHeight * size) * 0.5F
   }

   fun drawHead(animation: PlayerEntity, size: Float, x: Float, y: Float, target: Float) {
      val player: AbstractClientPlayerEntity = target as? AbstractClientPlayerEntity
      if ((target as? AbstractClientPlayerEntity) == null) {
         Font.drawCenteredText$default(
            رَ.INSTANCE.GS_MEDIUM.priority(ClientRenderPipeline.HUD_TEXT),
            "?",
            x + size / 2.0F,
            y,
            size * 0.65F,
            this.withAlpha(طغ.INSTANCE.TITLE_COLOR, animation),
            0.0F,
            32,
            null
         )
      } else {
         val var10000: Identifier = player.getSkin().body().id()
         val var11: AbstractTexture = ضك.getMc().getTextureManager().getTexture(var10000)
         val var10: GpuTexture = طث.getGlTextureView(var11).texture()
         val var12: GlTexture = var10 as? GlTexture
         if ((var10 as? GlTexture) != null) {
            val textureId: Int = var12.getGlId()
            val round: Float = size * 0.2F
            val var13: TextureRectRenderer = ذر.INSTANCE.TEXTURE_RECT.priority(ClientRenderPipeline.HUD_SPECIAL).texture(textureId).pixelated(64.0F)
            var var10005: Color = Color.WHITE
            var13.draw(x, y, size, size, var10005, round, 0.0F, 0.125F, 0.25F, 0.125F, -0.125F, animation)
            val var14: TextureRectRenderer = ذر.INSTANCE.TEXTURE_RECT.priority(ClientRenderPipeline.HUD_SPECIAL).texture(textureId).pixelated(64.0F)
            var10005 = Color.WHITE
            var14.draw(x, y, size, size, var10005, round, 0.0F, 0.625F, 0.25F, 0.125F, -0.125F, animation)
         }
      }
   }

   fun drawEquipment(y: Array<ItemStack>, animation: Float, x: Float, emptyColor: Color, itemGap: Float, itemSize: Float, equipment: Float) {
      if (!(animation <= 0.01F)) {
         val crossSize: Float = itemSize * 0.7F
         var itemContext: Any = null
         var index: Int = 0

         for (var11 in equipment.length..index) {
            var var10000: ItemStack = equipment[index]
            val slotX: Float = x + index * (itemSize + itemGap)
            if (var10000.isEmpty()) {
               Font.drawCenteredText$default(
                  رَ.INSTANCE.ICON.priority(ClientRenderPipeline.HUD_TEXT),
                  "i",
                  slotX + itemSize * 0.5F,
                  y + this.centeredTopOffset(رَ.INSTANCE.ICON, crossSize, itemSize),
                  crossSize,
                  emptyColor,
                  0.0F,
                  32,
                  null
               )
            } else {
               var10000 = (ItemStack)itemContext
               if (itemContext == null) {
                  val var15: DrawContext = this.createItemDrawContext()
                  itemContext = var15
                  var10000 = var15
               }

               this.drawItemSprite(var10000, var10000, slotX, y, animation, itemSize)
            }
         }
      }
   }

   fun healthProgress(player: PlayerEntity): Float {
      RangesKt.coerceIn(this.displayedHealth(player) / RangesKt.coerceAtLeast(player.getMaxHealth(), 1.0F), 0.0F, 1.0F)
   }

   fun targetName(target: PlayerEntity): java.lang.String {
      val var10000: Text = target.getName()
      if (var10000 != cachedNameComponent) {
         cachedNameComponent = var10000
         val var3: java.lang.String = var10000.getString()
         cachedNameText = var3
      }

      cachedNameText
   }

   public override fun onDisable() {
      displayTarget = null
      showAnimation.snap(0.0)
      healthAnimation.snap(0.0)
      this.clearDraggableBounds()
   }

   fun isHealthObjective(objective: ScoreboardObjective): Boolean {
      if (objective.getCriterion() == ScoreboardCriterion.HEALTH) {
         true
      } else {
         var var10000: java.lang.String = objective.getName()
         val var6: Locale = Locale.ROOT
         var10000 = var10000.toLowerCase(var6)
         val var8: java.lang.String = objective.getDisplayName().getString()
         val var9: Locale = Locale.ROOT
         val var10: java.lang.String = var8.toLowerCase(var9)
         StringsKt.contains$default(var10000, "health", false, 2, null)
            || var10000 == "hp"
            || StringsKt.contains$default(var10, "health", false, 2, null)
            || StringsKt.contains$default(var10, "hp", false, 2, null)
            || StringsKt.contains$default(var10, "хп", false, 2, null)
            || StringsKt.contains$default(var10, "здоров", false, 2, null)
            || StringsKt.contains$default(var10, "❤", false, 2, null)
            || StringsKt.contains$default(var10, "♥", false, 2, null)
         }
   }

   fun isUsableTarget(player: PlayerEntity): Boolean {
      !player.isRemoved() && player.isAlive() && !player.isInvisible()
   }

   fun createItemDrawContext(): DrawContext {
      val var10000: GameRenderer = ضك.getMc().gameRenderer
      DrawContext(
         ضك.getMc(), (var10000 as GameRendererAccessor).rain$getGuiState(), ضك.getMc().getWindow().getScaledWidth(), ضك.getMc().getWindow().getScaledHeight()
      )
   }

   private fun withAlpha(color: Color, factor: Float): Color {
      return بح.INSTANCE.setAlpha(color, (float)color.getAlpha() / 255.0F * factor)
   }

   private fun healthText(health: Float): String {
      val bits: Int = java.lang.Float.floatToRawIntBits(health)
      if (!cachedHealthInitialized || cachedHealthBits != bits) {
         cachedHealthInitialized = true
         cachedHealthBits = bits
         val var3: Locale = Locale.US
         val var6: Array<Any> = arrayOf(health)
         val var10000: java.lang.String = java.lang.String.format(var3, "%.1f", Arrays.copyOf(var6, var6.length))
         cachedHealthText = var10000
      }

      return cachedHealthText
   }

   fun renderHud(target: PlayerEntity, animation: Float) {
      val x: Float = draggable.x
      val y: Float = draggable.y
      this.updateEquipment(target)
      val width: Float = طغ.INSTANCE.scaled(115.0F)
      val gap: Float = طغ.INSTANCE.margin()
      val headSize: Float = طغ.INSTANCE.scaled(27.0F)
      val height: Float = headSize + gap * 1.5F
      draggable.width = width
      draggable.height = height
      val round: Float = height * 0.25F
      sideRound.set(height * 0.25F, 0.0F, height * 0.25F, 0.0F)
      val offset: Float = gap * 0.9F
      val healthBarHeight: Float = طغ.INSTANCE.scaled(3.0F)
      val healthBarRound: Float = healthBarHeight * 0.2F
      val startX: Float = x + height + offset
      val healthBarWidth: Float = width - height - offset * 2.0F
      val textSize: Float = طغ.INSTANCE.scaled(7.0F)
      val healthUnitSize: Float = textSize * 0.7F
      val healthUnitGap: Float = طغ.INSTANCE.scaled(1.0F)
      val textY: Float = y + offset
      val healthBarY: Float = y + offset + رَ.INSTANCE.GS_MEDIUM.getHeight(textSize) + gap * 0.6F
      val equipmentItemSize: Float = طغ.INSTANCE.scaled(10.0F)
      val equipmentItemGap: Float = طغ.INSTANCE.scaled(1.0F)
      val equipmentX: Float = startX
         + RangesKt.coerceAtLeast(
               healthBarWidth - ((float)equipment.length * equipmentItemSize + (float)RangesKt.coerceAtLeast(equipment.length - 1, 0) * equipmentItemGap), 0.0F
            )
            * 0.5F
            val equipmentY: Float = healthBarY + healthBarHeight + gap * 0.45F
      val panelColor: Color = this.withAlpha(طغ.INSTANCE.PANEL_COLOR, animation)
      val sideColor: Color = this.withAlpha(طغ.INSTANCE.HEADER_COLOR, animation)
      val textColor: Color = this.withAlpha(طغ.INSTANCE.TITLE_COLOR, animation)
      val secondaryColor: Color = this.withAlpha(طغ.INSTANCE.VALUE_COLOR, animation)
      val healthBackColor: Color = بح.INSTANCE.setAlpha(طغ.INSTANCE.HEADER_COLOR, 0.35F * animation)
      val healthColor: Color = this.withAlpha(طغ.INSTANCE.TITLE_COLOR, animation)
      ذر.INSTANCE.BLURRED_RECT.priority(ClientRenderPipeline.HUD_RECT).color(panelColor).mix(0.9F).round(round).draw(x, y, width, height)
      ذر.INSTANCE.BLURRED_RECT.priority(ClientRenderPipeline.HUD_RECT).color(sideColor).mix(0.9F).round(sideRound).draw(x, y, height, height)
      this.drawHead(target, x + gap / 1.2F, y + (height - headSize) / 2.0F, headSize, animation)
      ذر.INSTANCE.BLURRED_RECT
         .priority(ClientRenderPipeline.HUD_RECT)
         .color(healthBackColor)
         .mix(0.9F)
         .round(healthBarRound)
         .draw(startX, healthBarY, healthBarWidth, healthBarHeight)
         ذر.INSTANCE.BLURRED_RECT
         .priority(ClientRenderPipeline.HUD_RECT)
         .color(healthColor)
         .mix(0.9F)
         .round(healthBarRound)
         .draw(startX, healthBarY, healthBarWidth * RangesKt.coerceIn(healthAnimation.get(), 0.0F, 1.0F), healthBarHeight)
         val healthText: java.lang.String = this.healthText(this.displayedHealth(target))
      val healthWidth: Float = Font.getWidth$default(رَ.INSTANCE.GS_MEDIUM, healthText, textSize, 0.0F, 4, null)
      val totalHealthWidth: Float = healthWidth + healthUnitGap + Font.getWidth$default(رَ.INSTANCE.GS_REGULAR, "hp", healthUnitSize, 0.0F, 4, null)
      val healthX: Float = startX + healthBarWidth - totalHealthWidth - طغ.INSTANCE.scaled(1.0F)
      val healthUnitY: Float = textY + (textSize - healthUnitSize)
      بق.draw$default(
         nameScroller,
         رَ.INSTANCE.GS_MEDIUM.priority(ClientRenderPipeline.HUD_TEXT),
         this.targetName(target),
         startX,
         textY,
         textSize,
         textColor,
         RangesKt.coerceAtLeast(healthBarWidth - totalHealthWidth - gap * 0.5F, 0.0F),
         true,
         0.0F,
         256,
         null
      )
      Font.drawText$default(
         رَ.INSTANCE.GS_REGULAR.priority(ClientRenderPipeline.HUD_TEXT),
         healthText,
         healthX + طغ.INSTANCE.scaled(1.0F),
         textY,
         textSize,
         textColor,
         0.0F,
         0.0F,
         0.0F,
         0,
         0.0F,
         992,
         null
      )
      Font.drawText$default(
         رَ.INSTANCE.GS_REGULAR.priority(ClientRenderPipeline.HUD_TEXT),
         "hp",
         healthX + healthWidth + healthUnitGap,
         healthUnitY,
         healthUnitSize,
         secondaryColor,
         0.0F,
         0.0F,
         0.0F,
         0,
         0.0F,
         992,
         null
      )
      this.drawEquipment(equipment, equipmentX, equipmentY, secondaryColor, animation, equipmentItemSize, equipmentItemGap)
   }

   fun drawItemSprite(itemSize: DrawContext, animation: ItemStack, stack: Float, y: Float, context: Float, x: Float) {
      if (!(animation <= 0.01F)) {
         val itemScale: Float = itemSize / 16.0F
         context.getMatrices().pushMatrix()
         context.getMatrices().translate(x, y)
         context.getMatrices().scale(itemScale, itemScale)
         جإ.withAlpha(this.equipmentAnimation(animation), { 
            `$context`.drawItem(`$stack`, 0, 0)
         })
         context.getMatrices().popMatrix()
      }
   }

   private fun equipmentAnimation(hudAnimation: Float): Float {
      return if (showAnimation.toValue > 0.0) hudAnimation else RangesKt.coerceIn((hudAnimation - 0.18F) / 0.82F, 0.0F, 1.0F)
   }

   @Commando
   public fun onOverlayRender(event: ثآ) {
      val preview: Boolean = ضك.getMc().currentScreen is ChatScreen
      if (preview && displayTarget == null) {
         val var10000: ClientPlayerEntity = ضك.getMc().player
         if (var10000 != null) {
            displayTarget = var10000 as PlayerEntity
            healthAnimation.snap((double)INSTANCE.healthProgress(var10000 as PlayerEntity))
            showAnimation.run(1.0, 180L, Easing.SINE_OUT, true)
         }
      }

      showAnimation.update()
      healthAnimation.update()
      val animation: Float = RangesKt.coerceIn(showAnimation.get(), 0.0F, 1.0F)
      var var7: PlayerEntity = displayTarget
      if (displayTarget == null) {
         var7 = (if (preview) ضك.getMc().player else null) as PlayerEntity
      }

      if (var7 == null) {
         if (!preview) {
            this.clearDraggableBounds()
         }
      } else if (animation <= 0.01F && !preview) {
         this.clearDraggableBounds()
      } else {
         this.renderHud(var7, if (preview) RangesKt.coerceAtLeast(animation, 0.01F) else animation)
      }
   }
}
