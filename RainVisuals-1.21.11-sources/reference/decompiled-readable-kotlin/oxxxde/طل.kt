package oxxxde

import com.mojang.blaze3d.textures.GpuTexture
import java.awt.Color
import java.util.ArrayList
import java.util.HashMap
import java.util.Locale
import kotakbaz.rain.client.util.animations.AnimationUtil
import kotakbaz.rain.client.util.other.ScrollUtil
import kotakbaz.rain.client.util.render.display.TextureRectRenderer
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import kotakbaz.rain.client.util.render.font.Font
import kotakbaz.rain.friend.FriendManager$AddResult
import kotakbaz.rain.friend.FriendManager$FriendEntry
import kotakbaz.rain.friend.FriendManager$RemoveResult
import kotakbaz.rain.ui.api.PipelinedRender
import kotakbaz.rain.ui.menu.FriendsCategoryComponent$PanelArea
import kotakbaz.rain.ui.menu.misc.AnimatedListTracker$Item
import kotakbaz.rain.ui.menu.misc.AnimatedTextTransition$Layer
import net.minecraft.client.texture.AbstractTexture
import net.minecraft.client.texture.GlTexture
import org.lwjgl.glfw.GLFW

// $VF: Compiled from heavy
public class طل(panelWidth: Float, contentTopOffset: Float) : اظ, PipelinedRender {
   private final val headOverlayU2: Float
   private final val rowHeight: Float
   private final val panelWidth: Float
   private final var normalizedSearch: String
   private final var inputFocused: Boolean
   private final var cachedTotalHeight: Float
   private final val cardHoverAnimations: HashMap<String, ري>
   private AnimationUtil inputFocusAnimation;
   private final val columns: Int
   private final var renderedFriends: List<جة<ذو>>
   private final var cachedViewHeight: Float
   private final val footerReservedHeight: Float
   private ScrollUtil scroll;
   private final val skinUvScale: Float
   private final val headV2: Float
   private final val emptyTextTransition: حت
   private final val headU1: Float
   private AnimationUtil createButtonAnimation;
   private final val headU2: Float
   private final val badgeSize: Float
   private final val nameFieldMaxLength: Int
   private final val inputHeight: Float
   private final val headV1: Float
   private final val listAnimations: ثّ<String, ذو>
   private AnimationUtil emptyStateAnimation;
   private final val contentTopOffset: Float
   private final var friendNameText: String
   private final val skinTextureSize: Float
   private final val headOverlayU1: Float
   private final val deleteHoverAnimations: HashMap<String, ري>
   private final val headOverlayV1: Float
   private AnimationUtil createButtonHoverAnimation;
   private final val createButtonWidth: Float
   private final val headOverlayV2: Float

   private fun friendCardBounds(area: ثح, position: Float, scrollOffset: Float): ثح {
      val lowerIndex: Int = RangesKt.coerceAtLeast((int)((float)Math.floor((double)position)), 0)
      val upperIndex: Int = RangesKt.coerceAtLeast(lowerIndex + 1, lowerIndex)
      val fraction: Float = RangesKt.coerceIn(position - (float)lowerIndex, 0.0F, 1.0F)
      val lower: FriendsCategoryComponent$PanelArea = this.friendCardBoundsAtIndex(area, lowerIndex, scrollOffset)
      val upper: FriendsCategoryComponent$PanelArea = this.friendCardBoundsAtIndex(area, upperIndex, scrollOffset)
      return FriendsCategoryComponent$PanelArea(
         lower.left + (upper.left - lower.left) * fraction,
         lower.top + (upper.top - lower.top) * fraction,
         lower.width + (upper.width - lower.width) * fraction,
         this.rowHeight
      )
   }

   private fun footerArea(area: ثح): ثح {
      val footerHeight: Float = RangesKt.coerceAtMost(this.footerReservedHeight, area.height)
      return FriendsCategoryComponent$PanelArea(area.left, area.top + area.height - footerHeight, area.width, footerHeight)
   }

   public fun scrollOffsetValue(): Float {
      return this.scroll.value()
   }

   private fun renderList(area: ثح, visibleFriends: List<جة<ذو>>, scrollOffset: Float, mouseX: Int, mouseY: Int) {
      if (!(area.width <= 0.0F) && !(area.height <= 0.0F)) {
         جِ.INSTANCE.start(area.left, area.top, area.width, area.height)

         for (`element$iv` in visibleFriends) {
            val animatedFriend: AnimatedListTracker$Item = `element$iv` as AnimatedListTracker$Item
            val cardBounds: FriendsCategoryComponent$PanelArea = this.friendCardBounds(area, (`element$iv` as AnimatedListTracker$Item).position, scrollOffset)
            if (!(cardBounds.top + this.rowHeight < area.top) && !(cardBounds.top > area.top + area.height)) {
               this.renderRow(
                  animatedFriend.value as FriendManager$FriendEntry,
                  cardBounds.left,
                  cardBounds.top + (1.0F - animatedFriend.presence) * 4.0F,
                  cardBounds.width,
                  mouseX,
                  mouseY,
                  animatedFriend.presence
               )
            }
         }

         جِ.INSTANCE.end()
      }
   }

   private fun contentArea(): ثح {
      val left: Float = this.getX() + this.panelWidth + this.getPadding()
      val right: Float = this.getX() + this.getWidth() - this.panelWidth / 3.0F
      val top: Float = this.getY() + this.contentTopOffset
      return FriendsCategoryComponent$PanelArea(
         left, top, RangesKt.coerceAtLeast(right - left, 0.0F), RangesKt.coerceAtLeast(this.getY() + this.getHeight() - top - this.getPadding(), 0.0F)
      )
   }

   private fun deleteAreaX(cardX: Float, cardWidth: Float): Float {
      return this.deleteIconX(cardX, cardWidth, 8.0F) - (14.0F - Font.getWidth$default(this.getIconFont(), "i", 8.0F, 0.0F, 4, null)) * 0.5F
   }

   private fun deleteIconX(cardX: Float, cardWidth: Float, iconSize: Float): Float {
      return cardX + cardWidth - this.getPadding() * 1.6F - Font.getWidth$default(this.getIconFont(), "i", iconSize, 0.0F, 4, null)
   }

   private fun isShiftDown(): Boolean {
      val handle: Long = ضك.getMc().getWindow().getHandle()
      return GLFW.glfwGetKey(handle, 340) == 1 || GLFW.glfwGetKey(handle, 344) == 1
   }

   private fun insideCreateButton(area: ثح, mouseX: Float, mouseY: Float): Boolean {
      return this.inside(this.createButtonBounds(area), mouseX, mouseY)
   }

   private fun renderRow(friend: ذو, x: Float, y: Float, width: Float, mouseX: Int, mouseY: Int, presence: Float) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.vineflower.kotlin.expr.KFunctionExprent.toJava(KFunctionExprent.java:196)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1151)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:921)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual kotakbaz/rain/friend/FriendManager$FriendEntry.getName ()Ljava/lang/String;
      // 004: astore 8
      // 006: aload 0
      // 007: fload 2
      // 008: fload 3
      // 009: fload 4
      // 00b: aload 0
      // 00c: getfield oxxxde/طل.rowHeight F
      // 00f: iload 5
      // 011: i2f
      // 012: iload 6
      // 014: i2f
      // 015: invokespecial oxxxde/طل.inside (FFFFFF)Z
      // 018: istore 9
      // 01a: iload 9
      // 01c: ifeq 035
      // 01f: aload 0
      // 020: fload 2
      // 021: fload 3
      // 022: fload 4
      // 024: iload 5
      // 026: i2f
      // 027: iload 6
      // 029: i2f
      // 02a: invokespecial oxxxde/طل.isInsideDelete (FFFFF)Z
      // 02d: ifeq 035
      // 030: bipush 1
      // 031: nop
      // 032: goto 037
      // 035: bipush 0
      // 036: nop
      // 037: istore 10
      // 039: aload 0
      // 03a: getfield oxxxde/طل.deleteHoverAnimations Ljava/util/HashMap;
      // 03d: checkcast java/util/Map
      // 040: astore 12
      // 042: aload 8
      // 044: astore 13
      // 046: bipush 0
      // 047: nop
      // 048: istore 14
      // 04a: aload 12
      // 04c: aload 13
      // 04e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 053: astore 15
      // 055: aload 15
      // 057: ifnonnull 07e
      // 05a: bipush 0
      // 05b: nop
      // 05c: istore 16
      // 05e: new kotakbaz/rain/client/util/animations/AnimationUtil
      // 061: dup
      // 062: fconst_0
      // 063: nop
      // 064: bipush 1
      // 065: nop
      // 066: aconst_null
      // 067: nop
      // 068: invokespecial kotakbaz/rain/client/util/animations/AnimationUtil.<init> (FILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 06b: astore 16
      // 06d: aload 12
      // 06f: aload 13
      // 071: aload 16
      // 073: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 078: pop
      // 079: aload 16
      // 07b: goto 080
      // 07e: aload 15
      // 080: nop
      // 081: checkcast kotakbaz/rain/client/util/animations/AnimationUtil
      // 084: astore 11
      // 086: aload 0
      // 087: getfield oxxxde/طل.cardHoverAnimations Ljava/util/HashMap;
      // 08a: checkcast java/util/Map
      // 08d: astore 13
      // 08f: aload 8
      // 091: astore 14
      // 093: bipush 0
      // 094: nop
      // 095: istore 15
      // 097: aload 13
      // 099: aload 14
      // 09b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0a0: astore 16
      // 0a2: aload 16
      // 0a4: ifnonnull 0cb
      // 0a7: bipush 0
      // 0a8: nop
      // 0a9: istore 17
      // 0ab: new kotakbaz/rain/client/util/animations/AnimationUtil
      // 0ae: dup
      // 0af: fconst_0
      // 0b0: nop
      // 0b1: bipush 1
      // 0b2: nop
      // 0b3: aconst_null
      // 0b4: nop
      // 0b5: invokespecial kotakbaz/rain/client/util/animations/AnimationUtil.<init> (FILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 0b8: astore 17
      // 0ba: aload 13
      // 0bc: aload 14
      // 0be: aload 17
      // 0c0: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0c5: pop
      // 0c6: aload 17
      // 0c8: goto 0cd
      // 0cb: aload 16
      // 0cd: nop
      // 0ce: checkcast kotakbaz/rain/client/util/animations/AnimationUtil
      // 0d1: astore 12
      // 0d3: aload 11
      // 0d5: iload 10
      // 0d7: ifeq 0df
      // 0da: fconst_1
      // 0db: nop
      // 0dc: goto 0e1
      // 0df: fconst_0
      // 0e0: nop
      // 0e1: ldc_w 180.0
      // 0e4: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 0e7: astore 14
      // 0e9: new oxxxde/دَ
      // 0ec: dup
      // 0ed: aload 14
      // 0ef: invokespecial oxxxde/دَ.<init> (Loxxxde/بف;)V
      // 0f2: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 0f5: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 0f8: fstore 13
      // 0fa: aload 12
      // 0fc: iload 9
      // 0fe: ifeq 106
      // 101: fconst_1
      // 102: nop
      // 103: goto 108
      // 106: fconst_0
      // 107: nop
      // 108: ldc_w 180.0
      // 10b: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 10e: astore 15
      // 110: new oxxxde/جت
      // 113: dup
      // 114: aload 15
      // 116: invokespecial oxxxde/جت.<init> (Loxxxde/بف;)V
      // 119: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 11c: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 11f: fconst_0
      // 120: nop
      // 121: fconst_1
      // 122: nop
      // 123: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 126: fstore 14
      // 128: aload 0
      // 129: invokevirtual oxxxde/طل.getAlpha ()F
      // 12c: fload 7
      // 12e: fmul
      // 12f: fstore 15
      // 131: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 134: fload 15
      // 136: ldc_w 0.03
      // 139: ldc_w 0.02
      // 13c: fload 14
      // 13e: fmul
      // 13f: fadd
      // 140: fmul
      // 141: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 144: astore 16
      // 146: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 149: fload 15
      // 14b: ldc_w 0.06
      // 14e: ldc_w 0.06
      // 151: fload 14
      // 153: fmul
      // 154: fadd
      // 155: fmul
      // 156: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 159: astore 17
      // 15b: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 15e: fload 15
      // 160: ldc_w 0.08
      // 163: ldc_w 0.025
      // 166: fload 14
      // 168: fmul
      // 169: fadd
      // 16a: fmul
      // 16b: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 16e: astore 18
      // 170: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 173: fload 15
      // 175: ldc_w 0.84
      // 178: fmul
      // 179: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 17c: astore 19
      // 17e: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 181: fload 15
      // 183: ldc_w 0.5
      // 186: fmul
      // 187: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 18a: astore 20
      // 18c: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 18f: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 192: fload 15
      // 194: ldc_w 0.28
      // 197: ldc_w 0.18
      // 19a: fload 13
      // 19c: fmul
      // 19d: fadd
      // 19e: fmul
      // 19f: invokevirtual oxxxde/ثْ.icon (F)Ljava/awt/Color;
      // 1a2: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1a5: fload 15
      // 1a7: ldc_w 0.35
      // 1aa: ldc_w 0.35
      // 1ad: fload 13
      // 1af: fmul
      // 1b0: fadd
      // 1b1: fmul
      // 1b2: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 1b5: fload 13
      // 1b7: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 1ba: astore 21
      // 1bc: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 1bf: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 1c2: aload 0
      // 1c3: invokevirtual oxxxde/طل.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 1c6: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 1c9: aload 16
      // 1cb: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 1ce: ldc_w 4.0
      // 1d1: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 1d4: ldc_w 0.95
      // 1d7: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.mix (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 1da: fconst_1
      // 1db: nop
      // 1dc: aload 17
      // 1de: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 1e1: fload 2
      // 1e2: fload 3
      // 1e3: fload 4
      // 1e5: aload 0
      // 1e6: getfield oxxxde/طل.rowHeight F
      // 1e9: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.draw (FFFF)V
      // 1ec: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 1ef: invokevirtual oxxxde/ذر.getBASIC_RECT ()Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 1f2: aload 0
      // 1f3: invokevirtual oxxxde/طل.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 1f6: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 1f9: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1fc: fload 15
      // 1fe: ldc_w 0.72
      // 201: fmul
      // 202: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 205: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 208: ldc_w 0.3
      // 20b: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 20e: fload 2
      // 20f: fload 4
      // 211: fadd
      // 212: aload 0
      // 213: invokevirtual oxxxde/طل.getPadding ()F
      // 216: ldc_w 1.5
      // 219: fmul
      // 21a: fsub
      // 21b: fload 3
      // 21c: aload 0
      // 21d: invokevirtual oxxxde/طل.getPadding ()F
      // 220: fadd
      // 221: ldc_w 2.5
      // 224: ldc_w 2.5
      // 227: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.draw (FFFF)V
      // 22a: fload 2
      // 22b: aload 0
      // 22c: invokevirtual oxxxde/طل.getPadding ()F
      // 22f: ldc_w 1.3
      // 232: fmul
      // 233: fadd
      // 234: fstore 22
      // 236: fload 3
      // 237: aload 0
      // 238: getfield oxxxde/طل.rowHeight F
      // 23b: aload 0
      // 23c: getfield oxxxde/طل.badgeSize F
      // 23f: fsub
      // 240: ldc_w 0.5
      // 243: fmul
      // 244: fadd
      // 245: fstore 23
      // 247: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 24a: invokevirtual oxxxde/ذر.getBASIC_RECT ()Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 24d: aload 0
      // 24e: invokevirtual oxxxde/طل.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 251: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 254: aload 18
      // 256: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 259: ldc_w 4.0
      // 25c: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 25f: fload 22
      // 261: fload 23
      // 263: aload 0
      // 264: getfield oxxxde/طل.badgeSize F
      // 267: aload 0
      // 268: getfield oxxxde/طل.badgeSize F
      // 26b: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.draw (FFFF)V
      // 26e: aload 0
      // 26f: aload 1
      // 270: fload 22
      // 272: fload 23
      // 274: aload 0
      // 275: getfield oxxxde/طل.badgeSize F
      // 278: fload 15
      // 27a: invokespecial oxxxde/طل.renderFriendFace (Lkotakbaz/rain/friend/FriendManager$FriendEntry;FFFF)V
      // 27d: fload 22
      // 27f: aload 0
      // 280: getfield oxxxde/طل.badgeSize F
      // 283: fadd
      // 284: aload 0
      // 285: invokevirtual oxxxde/طل.getPadding ()F
      // 288: ldc_w 1.15
      // 28b: fmul
      // 28c: fadd
      // 28d: fstore 24
      // 28f: aload 0
      // 290: fload 2
      // 291: fload 4
      // 293: invokespecial oxxxde/طل.deleteAreaX (FF)F
      // 296: aload 0
      // 297: invokevirtual oxxxde/طل.getPadding ()F
      // 29a: ldc_w 0.6
      // 29d: fmul
      // 29e: fsub
      // 29f: fload 24
      // 2a1: fsub
      // 2a2: fconst_0
      // 2a3: nop
      // 2a4: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 2a7: fstore 25
      // 2a9: ldc_w 8.0
      // 2ac: fstore 26
      // 2ae: ldc_w 5.6
      // 2b1: fstore 27
      // 2b3: fload 3
      // 2b4: aload 0
      // 2b5: invokevirtual oxxxde/طل.getPadding ()F
      // 2b8: ldc_w 1.5
      // 2bb: fmul
      // 2bc: fadd
      // 2bd: fstore 28
      // 2bf: fload 28
      // 2c1: aload 0
      // 2c2: invokevirtual oxxxde/طل.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 2c5: fload 26
      // 2c7: invokevirtual kotakbaz/rain/client/util/render/font/Font.getHeight (F)F
      // 2ca: fadd
      // 2cb: aload 0
      // 2cc: invokevirtual oxxxde/طل.getPadding ()F
      // 2cf: ldc_w 1.5
      // 2d2: fdiv
      // 2d3: fadd
      // 2d4: fstore 29
      // 2d6: aload 1
      // 2d7: invokevirtual kotakbaz/rain/friend/FriendManager$FriendEntry.getAddedAt ()Ljava/lang/String;
      // 2da: invokedynamic makeConcatWithConstants (Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "Добавлен: \u0001" ]
      // 2df: astore 30
      // 2e1: aload 0
      // 2e2: invokevirtual oxxxde/طل.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 2e5: aload 0
      // 2e6: invokevirtual oxxxde/طل.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 2e9: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 2ec: aload 0
      // 2ed: aload 8
      // 2ef: fload 25
      // 2f1: fload 26
      // 2f3: invokespecial oxxxde/طل.trimToWidth (Ljava/lang/String;FF)Ljava/lang/String;
      // 2f6: fload 24
      // 2f8: fload 28
      // 2fa: fload 26
      // 2fc: aload 19
      // 2fe: fconst_0
      // 2ff: nop
      // 300: fconst_0
      // 301: nop
      // 302: fconst_0
      // 303: nop
      // 304: bipush 0
      // 305: nop
      // 306: fconst_0
      // 307: nop
      // 308: sipush 992
      // 30b: aconst_null
      // 30c: nop
      // 30d: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 310: aload 0
      // 311: invokevirtual oxxxde/طل.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 314: aload 0
      // 315: invokevirtual oxxxde/طل.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 318: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 31b: aload 0
      // 31c: aload 30
      // 31e: fload 25
      // 320: fload 27
      // 322: invokespecial oxxxde/طل.trimToWidth (Ljava/lang/String;FF)Ljava/lang/String;
      // 325: fload 24
      // 327: fload 29
      // 329: fload 27
      // 32b: aload 20
      // 32d: fconst_0
      // 32e: nop
      // 32f: fconst_0
      // 330: nop
      // 331: fconst_0
      // 332: nop
      // 333: bipush 0
      // 334: nop
      // 335: fconst_0
      // 336: nop
      // 337: sipush 992
      // 33a: aconst_null
      // 33b: nop
      // 33c: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 33f: ldc_w 6.2
      // 342: fstore 31
      // 344: aload 0
      // 345: fload 2
      // 346: fload 4
      // 348: fload 31
      // 34a: invokespecial oxxxde/طل.deleteIconX (FFF)F
      // 34d: fstore 32
      // 34f: fload 3
      // 350: aload 0
      // 351: getfield oxxxde/طل.rowHeight F
      // 354: aload 0
      // 355: invokevirtual oxxxde/طل.getIconFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 358: fload 31
      // 35a: invokevirtual kotakbaz/rain/client/util/render/font/Font.getHeight (F)F
      // 35d: fsub
      // 35e: ldc_w 0.5
      // 361: fmul
      // 362: fadd
      // 363: ldc_w 0.2
      // 366: fsub
      // 367: fstore 33
      // 369: aload 0
      // 36a: invokevirtual oxxxde/طل.getIconFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 36d: aload 0
      // 36e: invokevirtual oxxxde/طل.iconsPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 371: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 374: ldc_w "i"
      // 377: fload 32
      // 379: fload 33
      // 37b: fload 31
      // 37d: aload 21
      // 37f: fconst_0
      // 380: nop
      // 381: fconst_0
      // 382: nop
      // 383: fconst_0
      // 384: nop
      // 385: bipush 0
      // 386: nop
      // 387: fconst_0
      // 388: nop
      // 389: sipush 992
      // 38c: aconst_null
      // 38d: nop
      // 38e: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 391: return
   }

   private fun isAllowedFriendNameKey(keyName: String): Boolean {
      val `$this$all$iv`: java.lang.CharSequence = keyName
      var var4: Int = 0

      var var10000: Boolean
      while (true) {
         if (var4 >= `$this$all$iv`.length()) {
            var10000 = true
            break
         }

         val it: Char = `$this$all$iv`.charAt(var4)
         if (!Character.isLetterOrDigit(it) && it != '_') {
            var10000 = false
            break
         }

         var4++
      }

      return var10000
   }

   private fun trimToWidth(text: String, maxWidth: Float, size: Float): String {
      if (maxWidth <= 0.0F) {
         return ""
      } else if (Font.getWidth$default(this.getDefaultFont(), text, size, 0.0F, 4, null) <= maxWidth) {
         return text
      } else {
         var candidate: java.lang.String = text

         while (candidate.length() > 0 && Font.getWidth$default(this.getDefaultFont(), candidate + "...", size, 0.0F, 4, null) > maxWidth) {
            candidate = StringsKt.dropLast(candidate, 1)
         }

         return if (candidate.length() == 0) "" else "$candidate..."
      }
   }

   private fun contentHeight(size: Int): Float {
      return if (size <= 0)
         0.0F
         else
         (size + this.columns - 1) / this.columns * this.rowHeight + ((size + this.columns - 1) / this.columns + -1) * this.getPadding()
      }

   private fun renderFooter(area: ثح, mouseX: Int, mouseY: Int) {
      if (!(area.width <= 0.0F) && !(area.height <= 0.0F)) {
         val createBounds: FriendsCategoryComponent$PanelArea = this.createButtonBounds(area)
         this.renderInputBox(this.inputBounds(area), this.friendNameText, "Никнейм", "c", this.inputFocused)
         this.renderCreateButton(createBounds, mouseX, mouseY)
      }
   }

   private fun filteredFriends(): List<ذو> {
      val friends: java.util.List = شغ.INSTANCE.getFriendEntries()
      if (StringsKt.isBlank(this.normalizedSearch)) {
         return friends
      } else {
         val `$this$filterTo$iv$iv`: java.lang.Iterable = friends
         val `destination$iv$iv`: java.util.Collection = ArrayList()

         for (`element$iv$iv` in `$this$filterTo$iv$iv`) {
            val var10000: java.lang.String = (`element$iv$iv` as FriendManager$FriendEntry).name.toLowerCase(Locale.ROOT)
            if (StringsKt.contains$default(var10000, this.normalizedSearch, false, 2, null)) {
               `destination$iv$iv`.add(`element$iv$iv`)
            }
         }

         return `destination$iv$iv` as MutableList<FriendManager$FriendEntry>
      }
   }

   public fun scrollWheel(vertical: Float) {
      this.scroll.scroll(vertical * 2.5F)
   }

   private fun isControlDown(): Boolean {
      val handle: Long = ضك.getMc().getWindow().getHandle()
      return GLFW.glfwGetKey(handle, 341) == 1 || GLFW.glfwGetKey(handle, 345) == 1
   }

   private fun isValidFriendName(name: String): Boolean {
      if (!StringsKt.isBlank(name) && name.length() <= this.nameFieldMaxLength) {
         val `$this$all$iv`: java.lang.CharSequence = name
         var var4: Int = 0

         var var10000: Boolean
         while (true) {
            if (var4 >= `$this$all$iv`.length()) {
               var10000 = true
               break
            }

            val it: Char = `$this$all$iv`.charAt(var4)
            if (!Character.isLetterOrDigit(it) && it != '_') {
               var10000 = false
               break
            }

            var4++
         }

         if (var10000) {
            return true
         }
      }

      return false
   }

   private fun inputRowTop(area: ثح): Float {
      return area.top + (area.height - this.inputHeight) * 0.5F
   }

   private fun createButtonBounds(area: ثح): ثح {
      return FriendsCategoryComponent$PanelArea(
         area.left + area.width - this.createButtonWidth, this.inputRowTop(area), this.createButtonWidth, this.inputHeight
      )
   }

   private fun renderFriendFace(friend: ذو, x: Float, y: Float, size: Float, faceAlpha: Float) {
      val var10000: AbstractTexture = ضك.getMc().getTextureManager().getTexture(سؤ.INSTANCE.resolveTexture(friend))
      val var9: GpuTexture = طث.getGlTextureView(var10000).texture()
      val var10: GlTexture = var9 as? GlTexture
      if ((var9 as? GlTexture) != null) {
         val textureId: Int = var10.getGlId()
         val round: Float = size * 0.22F
         this.drawSkinHeadPart(textureId, x, y, size, size * 0.22F, this.headU1, this.headV1, this.headU2, this.headV2, faceAlpha)
         this.drawSkinHeadPart(textureId, x, y, size, round, this.headOverlayU1, this.headOverlayV1, this.headOverlayU2, this.headOverlayV2, faceAlpha)
      }
   }

   public fun resetScroll() {
      this.scroll = ScrollUtil(0.0F, 1, null)
   }

   private fun friendCardBoundsAtIndex(area: ثح, index: Int, scrollOffset: Float): ثح {
      val rowIndex: Int = index / this.columns
      val columnIndex: Int = index % this.columns
      val columnGap: Float = this.getPadding()
      val width: Float = RangesKt.coerceAtLeast((area.width - columnGap * (float)(this.columns - 1)) / (float)this.columns, 0.0F)
      return FriendsCategoryComponent$PanelArea(
         area.left + columnIndex * (width + columnGap), area.top - scrollOffset + rowIndex * (this.rowHeight + this.getPadding()), width, this.rowHeight
      )
   }

   public override fun onKeyPress(mouseX: Int, mouseY: Int, button: Int) {
      super.onKeyPress(mouseX, mouseY, button)
      if (this.inputFocused) {
         if (button == 86 && this.isControlDown()) {
            this.pasteFriendName()
         } else {
            when (button) {
               257, 335 -> {
                  this.createFriend()
                  return
               }
               259 -> {
                  this.friendNameText = StringsKt.dropLast(this.friendNameText, 1)
                  return
               }
               261 -> {
                  this.friendNameText = ""
                  return
               }
               else -> {
                  val var10000: java.lang.String = this.resolveTypedKey(button)
                  if (var10000 != null) {
                     if (this.isAllowedFriendNameKey(var10000)) {
                        this.appendFriendName(var10000)
                     }
                  }
               }
            }
         }
      }
   }

   private fun listArea(area: ثح, footer: ثح): ثح {
      return FriendsCategoryComponent$PanelArea(area.left, area.top, area.width, RangesKt.coerceAtLeast(footer.top - area.top - this.getPadding(), 0.0F))
   }

   private fun drawSkinHeadPart(textureId: Int, x: Float, y: Float, size: Float, round: Float, u1: Float, v1: Float, u2: Float, v2: Float, faceAlpha: Float) {
      val var10000: TextureRectRenderer = ذر.INSTANCE.TEXTURE_RECT.priority(this.iconsPipeline()).texture(textureId).pixelated(this.skinTextureSize)
      val var10005: Color = Color.WHITE
      var10000.draw(x, y, size, size, var10005, round, 0.0F, u1, v2, u2 - u1, v1 - v2, faceAlpha)
   }

   public override fun onMouseScroll(mouseX: Int, mouseY: Int, vertical: Float) {
      super.onMouseScroll(mouseX, mouseY, vertical)
      val area: FriendsCategoryComponent$PanelArea = this.contentArea()
      if (this.inside(this.listArea(area, this.footerArea(area)), (float)mouseX, (float)mouseY)) {
         this.scrollWheel(vertical)
      }
   }

   public fun setScrollProgress(progress: Float, instant: Boolean = false) {
      val max: Float = this.scroll.max()
      if (max <= 0.0F) {
         this.scroll.setValue(0.0F).setTargetValue(0.0F)
      } else {
         val target: Float = -max * RangesKt.coerceIn(progress, 0.0F, 1.0F)
         this.scroll.setTargetValue(target)
         if (instant) {
            this.scroll.setValue(target)
         }
      }
   }

   public fun clearInputFocus() {
      this.inputFocused = false
   }

   private fun insideInputBox(area: ثح, mouseX: Float, mouseY: Float): Boolean {
      return this.inside(this.inputBounds(area), mouseX, mouseY)
   }

   private fun renderInputBox(bounds: ثح, value: String, placeholder: String, icon: String, focused: Boolean) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:770)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:736)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield oxxxde/طل.inputFocusAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 004: iload 5
      // 006: ifeq 00e
      // 009: fconst_1
      // 00a: nop
      // 00b: goto 010
      // 00e: fconst_0
      // 00f: nop
      // 010: ldc_w 190.0
      // 013: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 016: astore 7
      // 018: new oxxxde/زا
      // 01b: dup
      // 01c: aload 7
      // 01e: invokespecial oxxxde/زا.<init> (Loxxxde/بف;)V
      // 021: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 024: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 027: fconst_0
      // 028: nop
      // 029: fconst_1
      // 02a: nop
      // 02b: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 02e: fstore 6
      // 030: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 033: ldc_w 0.01
      // 036: ldc_w 0.03
      // 039: fload 6
      // 03b: fmul
      // 03c: fadd
      // 03d: aload 0
      // 03e: invokevirtual oxxxde/طل.getAlpha ()F
      // 041: fmul
      // 042: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 045: astore 7
      // 047: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 04a: ldc_w 0.07
      // 04d: ldc_w 0.04
      // 050: fload 6
      // 052: fmul
      // 053: fadd
      // 054: aload 0
      // 055: invokevirtual oxxxde/طل.getAlpha ()F
      // 058: fmul
      // 059: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 05c: astore 8
      // 05e: aload 2
      // 05f: nop
      // 060: checkcast java/lang/CharSequence
      // 063: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 066: ifne 06e
      // 069: bipush 1
      // 06a: nop
      // 06b: goto 070
      // 06e: bipush 0
      // 06f: nop
      // 070: istore 9
      // 072: iload 9
      // 074: ifeq 088
      // 077: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 07a: ldc_w 0.76
      // 07d: aload 0
      // 07e: invokevirtual oxxxde/طل.getAlpha ()F
      // 081: fmul
      // 082: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 085: goto 096
      // 088: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 08b: ldc_w 0.45
      // 08e: aload 0
      // 08f: invokevirtual oxxxde/طل.getAlpha ()F
      // 092: fmul
      // 093: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 096: astore 10
      // 098: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 09b: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 09e: ldc_w 0.55
      // 0a1: aload 0
      // 0a2: invokevirtual oxxxde/طل.getAlpha ()F
      // 0a5: fmul
      // 0a6: invokevirtual oxxxde/ثْ.icon (F)Ljava/awt/Color;
      // 0a9: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0ac: ldc_w 0.72
      // 0af: aload 0
      // 0b0: invokevirtual oxxxde/طل.getAlpha ()F
      // 0b3: fmul
      // 0b4: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 0b7: fload 6
      // 0b9: iload 9
      // 0bb: ifeq 0c3
      // 0be: fconst_1
      // 0bf: nop
      // 0c0: goto 0c5
      // 0c3: fconst_0
      // 0c4: nop
      // 0c5: invokestatic java/lang/Math.max (FF)F
      // 0c8: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 0cb: astore 11
      // 0cd: aload 0
      // 0ce: getfield oxxxde/طل.inputHeight F
      // 0d1: ldc_w 0.27
      // 0d4: fmul
      // 0d5: fstore 12
      // 0d7: aload 0
      // 0d8: getfield oxxxde/طل.inputHeight F
      // 0db: ldc_w 0.31
      // 0de: fmul
      // 0df: fstore 13
      // 0e1: aload 1
      // 0e2: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getLeft ()F
      // 0e5: aload 0
      // 0e6: invokevirtual oxxxde/طل.getPadding ()F
      // 0e9: ldc_w 1.15
      // 0ec: fmul
      // 0ed: fadd
      // 0ee: fstore 14
      // 0f0: aload 1
      // 0f1: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getTop ()F
      // 0f4: aload 1
      // 0f5: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getHeight ()F
      // 0f8: fload 13
      // 0fa: fsub
      // 0fb: ldc_w 0.5
      // 0fe: fmul
      // 0ff: fadd
      // 100: fstore 15
      // 102: fload 14
      // 104: aload 0
      // 105: invokevirtual oxxxde/طل.getIconFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 108: aload 4
      // 10a: fload 13
      // 10c: fconst_0
      // 10d: nop
      // 10e: bipush 4
      // 10f: nop
      // 110: aconst_null
      // 111: nop
      // 112: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 115: fadd
      // 116: ldc_w 4.0
      // 119: fadd
      // 11a: fstore 16
      // 11c: aload 1
      // 11d: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getTop ()F
      // 120: aload 1
      // 121: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getHeight ()F
      // 124: fload 12
      // 126: fsub
      // 127: ldc_w 0.46
      // 12a: fmul
      // 12b: fadd
      // 12c: fstore 17
      // 12e: iload 9
      // 130: ifeq 138
      // 133: aload 2
      // 134: nop
      // 135: goto 145
      // 138: iload 5
      // 13a: ifeq 143
      // 13d: ldc_w " "
      // 140: goto 145
      // 143: aload 3
      // 144: nop
      // 145: astore 18
      // 147: aload 1
      // 148: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getWidth ()F
      // 14b: fload 16
      // 14d: aload 1
      // 14e: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getLeft ()F
      // 151: fsub
      // 152: fsub
      // 153: aload 0
      // 154: invokevirtual oxxxde/طل.getPadding ()F
      // 157: ldc_w 1.2
      // 15a: fmul
      // 15b: fsub
      // 15c: fconst_0
      // 15d: nop
      // 15e: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 161: fstore 19
      // 163: aload 0
      // 164: aload 18
      // 166: fload 19
      // 168: fload 12
      // 16a: invokespecial oxxxde/طل.trimToWidth (Ljava/lang/String;FF)Ljava/lang/String;
      // 16d: astore 20
      // 16f: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 172: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Lkotakbaz/rain/client/util/render/font/Font;
      // 175: aload 0
      // 176: invokevirtual oxxxde/طل.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 179: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 17c: astore 21
      // 17e: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 181: invokevirtual oxxxde/ذر.getBASIC_RECT ()Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 184: aload 0
      // 185: invokevirtual oxxxde/طل.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 188: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 18b: aload 7
      // 18d: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 190: ldc_w 4.0
      // 193: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 196: fconst_1
      // 197: nop
      // 198: aload 8
      // 19a: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 19d: aload 1
      // 19e: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getLeft ()F
      // 1a1: aload 1
      // 1a2: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getTop ()F
      // 1a5: aload 1
      // 1a6: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getWidth ()F
      // 1a9: aload 1
      // 1aa: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getHeight ()F
      // 1ad: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.draw (FFFF)V
      // 1b0: aload 0
      // 1b1: invokevirtual oxxxde/طل.getIconFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 1b4: aload 0
      // 1b5: invokevirtual oxxxde/طل.iconsPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 1b8: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 1bb: aload 4
      // 1bd: fload 14
      // 1bf: fload 15
      // 1c1: fload 13
      // 1c3: aload 11
      // 1c5: fconst_0
      // 1c6: nop
      // 1c7: fconst_0
      // 1c8: nop
      // 1c9: fconst_0
      // 1ca: nop
      // 1cb: bipush 0
      // 1cc: nop
      // 1cd: fconst_0
      // 1ce: nop
      // 1cf: sipush 992
      // 1d2: aconst_null
      // 1d3: nop
      // 1d4: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 1d7: aload 21
      // 1d9: aload 20
      // 1db: fload 16
      // 1dd: fload 17
      // 1df: fload 12
      // 1e1: aload 10
      // 1e3: fconst_0
      // 1e4: nop
      // 1e5: fconst_0
      // 1e6: nop
      // 1e7: fconst_0
      // 1e8: nop
      // 1e9: bipush 0
      // 1ea: nop
      // 1eb: fconst_0
      // 1ec: nop
      // 1ed: sipush 992
      // 1f0: aconst_null
      // 1f1: nop
      // 1f2: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 1f5: iload 5
      // 1f7: ifeq 210
      // 1fa: invokestatic java/lang/System.currentTimeMillis ()J
      // 1fd: ldc2_w 450
      // 200: ldiv
      // 201: ldc2_w 2
      // 204: lrem
      // 205: lconst_0
      // 206: nop
      // 207: lcmp
      // 208: ifne 210
      // 20b: bipush 1
      // 20c: nop
      // 20d: goto 212
      // 210: bipush 0
      // 211: nop
      // 212: istore 22
      // 214: iload 22
      // 216: ifne 21a
      // 219: return
      // 21a: iload 9
      // 21c: ifeq 224
      // 21f: aload 20
      // 221: goto 227
      // 224: ldc_w ""
      // 227: astore 23
      // 229: fload 16
      // 22b: aload 21
      // 22d: aload 23
      // 22f: fload 12
      // 231: fconst_0
      // 232: nop
      // 233: bipush 4
      // 234: nop
      // 235: aconst_null
      // 236: nop
      // 237: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 23a: fadd
      // 23b: fconst_1
      // 23c: nop
      // 23d: fadd
      // 23e: fstore 24
      // 240: aload 21
      // 242: ldc_w "|"
      // 245: fload 24
      // 247: fload 17
      // 249: fload 12
      // 24b: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 24e: ldc_w 0.86
      // 251: aload 0
      // 252: invokevirtual oxxxde/طل.getAlpha ()F
      // 255: fmul
      // 256: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 259: fconst_0
      // 25a: nop
      // 25b: fconst_0
      // 25c: nop
      // 25d: fconst_0
      // 25e: nop
      // 25f: bipush 0
      // 260: nop
      // 261: fconst_0
      // 262: nop
      // 263: sipush 992
      // 266: aconst_null
      // 267: nop
      // 268: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 26b: return
   }

   private fun appendFriendName(value: String) {
      if (value.length() != 0) {
         if (this.friendNameText.length() < this.nameFieldMaxLength) {
            this.friendNameText = StringsKt.take("${this.friendNameText}$value", this.nameFieldMaxLength)
         }
      }
   }

   public override fun rectPipeline(): صؤ {
      return ClientRenderPipeline.GUI_RECT
   }

   public override fun iconsPipeline(): صؤ {
      return ClientRenderPipeline.GUI_SPECIAL
   }

   private fun pasteFriendName() {
      val var10000: java.lang.String = GLFW.glfwGetClipboardString(ضك.getMc().getWindow().getHandle())
      if (var10000 != null) {
         val `$this$filterTo$iv$iv`: java.lang.CharSequence = var10000
         val `destination$iv$iv`: Appendable = StringBuilder()
         var `index$iv$iv`: Int = 0

         for (var9 in `$this$filterTo$iv$iv`.length()..`index$iv$iv`) {
            val `element$iv$iv`: Char = `$this$filterTo$iv$iv`.charAt(`index$iv$iv`)
            if (Character.isLetterOrDigit(`element$iv$iv`) || `element$iv$iv` == '_') {
               `destination$iv$iv`.append(`element$iv$iv`)
            }
         }

         this.appendFriendName((`destination$iv$iv` as StringBuilder).toString())
      }
   }

   private fun resolveTypedKey(button: Int): String? {
      var var10000: java.lang.String = GLFW.glfwGetKeyName(button, 0)
      if (var10000 == null) {
         return null
      } else if (!this.isShiftDown()) {
         return var10000
      } else if (var10000 == "-") {
         return "_"
      } else {
         val `$this$all$iv`: java.lang.CharSequence = var10000
         var var5: Int = 0

         while (true) {
            if (var5 >= `$this$all$iv`.length()) {
               var9 = true
               break
            }

            if (!Character.isLetter(`$this$all$iv`.charAt(var5))) {
               var9 = false
               break
            }

            var5++
         }

         if (var9) {
            var10000 = var10000.toUpperCase(Locale.ROOT)
         } else {
            var10000 = var10000
         }

         return var10000
      }
   }

   private fun isInsideDelete(cardX: Float, cardY: Float, cardWidth: Float, mouseX: Float, mouseY: Float): Boolean {
      val areaX: Float = this.deleteAreaX(cardX, cardWidth)
      return mouseX >= areaX
         && mouseX <= areaX + 14.0F
         && mouseY >= cardY + (this.rowHeight - 14.0F) * 0.5F
         && mouseY <= cardY + (this.rowHeight - 14.0F) * 0.5F + 14.0F
      }

   private fun createFriend() {
      if (this.canAddFriend()) {
         if (شغ.INSTANCE.add(StringsKt.trim(this.friendNameText).toString()) === FriendManager$AddResult.ADDED) {
            this.friendNameText = ""
            this.scroll = ScrollUtil(0.0F, 1, null)
         }
      }
   }

   public override fun onMouseClick(mouseX: Int, mouseY: Int, button: Int) {
      super.onMouseClick(mouseX, mouseY, button)
      if (button == 0) {
         val area: FriendsCategoryComponent$PanelArea = this.contentArea()
         if (!this.inside(area, (float)mouseX, (float)mouseY)) {
            this.clearInputFocus()
         } else {
            val footerArea: FriendsCategoryComponent$PanelArea = this.footerArea(area)
            if (this.insideInputBox(footerArea, (float)mouseX, (float)mouseY)) {
               this.inputFocused = true
            } else if (this.insideCreateButton(footerArea, (float)mouseX, (float)mouseY)) {
               this.inputFocused = true
               this.createFriend()
            } else {
               val listArea: FriendsCategoryComponent$PanelArea = this.listArea(area, footerArea)
               if (this.inside(listArea, (float)mouseX, (float)mouseY)) {
                  val `$this$filterTo$iv$iv`: java.lang.Iterable = this.renderedFriends
                  val `element$iv`: java.util.Collection = ArrayList()

                  for (friend in `$this$filterTo$iv$iv`) {
                     if ((friend as AnimatedListTracker$Item).present) {
                        `element$iv`.add(friend)
                     }
                  }

                  for (var19 in `element$iv` as java.util.List) {
                     val var22: FriendManager$FriendEntry = (var19 as AnimatedListTracker$Item).value as FriendManager$FriendEntry
                     val var23: FriendsCategoryComponent$PanelArea = this.friendCardBounds(
                        listArea, (var19 as AnimatedListTracker$Item).position, this.scroll.value()
                     )
                     if (this.inside(var23, (float)mouseX, (float)mouseY)
                        && this.isInsideDelete(var23.left, var23.top, var23.width, (float)mouseX, (float)mouseY)) {
                        if (شغ.INSTANCE.remove(var22.name) === FriendManager$RemoveResult.REMOVED) {
                           this.deleteHoverAnimations.remove(var22.name)
                           this.cardHoverAnimations.remove(var22.name)
                        }

                        this.clearInputFocus()
                        return
                     }
                  }
               }

               this.clearInputFocus()
            }
         }
      }
   }

   public fun setSearchQuery(query: String) {
      val var10000: java.lang.String = StringsKt.trim(query).toString().toLowerCase(Locale.ROOT)
      if (!(var10000 == this.normalizedSearch)) {
         this.normalizedSearch = var10000
         this.scroll = ScrollUtil(0.0F, 1, null)
      }
   }

   public override fun textPipeline(): صؤ {
      return ClientRenderPipeline.GUI_TEXT
   }

   public override fun render(mouseX: Int, mouseY: Int, partialTicks: Float) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.vineflower.kotlin.expr.KFunctionExprent.toJava(KFunctionExprent.java:196)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1151)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:921)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: iload 2
      // 03: nop
      // 04: fload 3
      // 05: invokespecial oxxxde/اظ.render (IIF)V
      // 08: aload 0
      // 09: invokespecial oxxxde/طل.contentArea ()Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;
      // 0c: astore 4
      // 0e: aload 0
      // 0f: aload 4
      // 11: invokespecial oxxxde/طل.footerArea (Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;)Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;
      // 14: astore 5
      // 16: aload 0
      // 17: aload 4
      // 19: aload 5
      // 1b: invokespecial oxxxde/طل.listArea (Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;)Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;
      // 1e: astore 6
      // 20: aload 0
      // 21: invokespecial oxxxde/طل.filteredFriends ()Ljava/util/List;
      // 24: astore 7
      // 26: aload 0
      // 27: aload 0
      // 28: getfield oxxxde/طل.listAnimations Loxxxde/ثّ;
      // 2b: aload 7
      // 2d: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, oxxxde/طل.render$lambda$0 (Lkotakbaz/rain/friend/FriendManager$FriendEntry;)Ljava/lang/String;, (Lkotakbaz/rain/friend/FriendManager$FriendEntry;)Ljava/lang/String; ]
      // 32: invokevirtual oxxxde/ثّ.update (Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
      // 35: putfield oxxxde/طل.renderedFriends Ljava/util/List;
      // 38: aload 0
      // 39: aload 0
      // 3a: aload 7
      // 3c: invokeinterface java/util/List.size ()I 1
      // 41: invokespecial oxxxde/طل.contentHeight (I)F
      // 44: putfield oxxxde/طل.cachedTotalHeight F
      // 47: aload 0
      // 48: aload 6
      // 4a: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getHeight ()F
      // 4d: putfield oxxxde/طل.cachedViewHeight F
      // 50: aload 0
      // 51: getfield oxxxde/طل.scroll Lkotakbaz/rain/client/util/other/ScrollUtil;
      // 54: aload 0
      // 55: getfield oxxxde/طل.cachedTotalHeight F
      // 58: aload 0
      // 59: getfield oxxxde/طل.cachedViewHeight F
      // 5c: fsub
      // 5d: fconst_0
      // 5e: nop
      // 5f: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 62: invokevirtual kotakbaz/rain/client/util/other/ScrollUtil.setMax (F)Lkotakbaz/rain/client/util/other/ScrollUtil;
      // 65: pop
      // 66: aload 0
      // 67: getfield oxxxde/طل.scroll Lkotakbaz/rain/client/util/other/ScrollUtil;
      // 6a: invokevirtual kotakbaz/rain/client/util/other/ScrollUtil.update ()V
      // 6d: aload 0
      // 6e: aload 6
      // 70: aload 0
      // 71: getfield oxxxde/طل.renderedFriends Ljava/util/List;
      // 74: aload 0
      // 75: getfield oxxxde/طل.scroll Lkotakbaz/rain/client/util/other/ScrollUtil;
      // 78: invokevirtual kotakbaz/rain/client/util/other/ScrollUtil.value ()F
      // 7b: iload 1
      // 7c: iload 2
      // 7d: nop
      // 7e: invokespecial oxxxde/طل.renderList (Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;Ljava/util/List;FII)V
      // 81: aload 0
      // 82: getfield oxxxde/طل.emptyStateAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 85: aload 7
      // 87: invokeinterface java/util/List.isEmpty ()Z 1
      // 8c: ifeq 94
      // 8f: fconst_1
      // 90: nop
      // 91: goto 96
      // 94: fconst_0
      // 95: nop
      // 96: ldc_w 190.0
      // 99: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 9c: astore 9
      // 9e: new oxxxde/ً
      // a1: dup
      // a2: aload 9
      // a4: invokespecial oxxxde/ً.<init> (Loxxxde/بف;)V
      // a7: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // aa: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // ad: fconst_0
      // ae: nop
      // af: fconst_1
      // b0: nop
      // b1: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // b4: fstore 8
      // b6: fload 8
      // b8: ldc_w 0.001
      // bb: fcmpl
      // bc: ifle c7
      // bf: aload 0
      // c0: aload 6
      // c2: fload 8
      // c4: invokespecial oxxxde/طل.renderEmptyState (Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;F)V
      // c7: aload 0
      // c8: aload 5
      // ca: iload 1
      // cb: iload 2
      // cc: nop
      // cd: invokespecial oxxxde/طل.renderFooter (Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;II)V
      // d0: return
   }

   private fun canAddFriend(): Boolean {
      val name: java.lang.String = StringsKt.trim(this.friendNameText).toString()
      return this.isValidFriendName(name) && !شغ.INSTANCE.isFriend(name)
   }

   private fun inside(x: Float, y: Float, width: Float, height: Float, mouseX: Float, mouseY: Float): Boolean {
      return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height
   }

   private fun renderCreateButton(bounds: ثح, mouseX: Int, mouseY: Int) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:770)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:736)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial oxxxde/طل.canAddFriend ()Z
      // 004: istore 4
      // 006: aload 0
      // 007: getfield oxxxde/طل.createButtonAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 00a: iload 4
      // 00c: ifeq 014
      // 00f: fconst_1
      // 010: nop
      // 011: goto 016
      // 014: fconst_0
      // 015: nop
      // 016: ldc_w 220.0
      // 019: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 01c: astore 6
      // 01e: new oxxxde/ده
      // 021: dup
      // 022: aload 6
      // 024: invokespecial oxxxde/ده.<init> (Loxxxde/بف;)V
      // 027: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 02a: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 02d: fconst_0
      // 02e: nop
      // 02f: fconst_1
      // 030: nop
      // 031: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 034: fstore 5
      // 036: aload 0
      // 037: getfield oxxxde/طل.createButtonHoverAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 03a: aload 0
      // 03b: aload 1
      // 03c: iload 2
      // 03d: nop
      // 03e: i2f
      // 03f: iload 3
      // 040: nop
      // 041: i2f
      // 042: invokespecial oxxxde/طل.inside (Lkotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea;FF)Z
      // 045: ifeq 04d
      // 048: fconst_1
      // 049: nop
      // 04a: goto 04f
      // 04d: fconst_0
      // 04e: nop
      // 04f: ldc_w 170.0
      // 052: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 055: astore 7
      // 057: new oxxxde/طض
      // 05a: dup
      // 05b: aload 7
      // 05d: invokespecial oxxxde/طض.<init> (Loxxxde/بف;)V
      // 060: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 063: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 066: fconst_0
      // 067: nop
      // 068: fconst_1
      // 069: nop
      // 06a: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 06d: fstore 6
      // 06f: aload 0
      // 070: invokevirtual oxxxde/طل.getAlpha ()F
      // 073: ldc_w 255.0
      // 076: fmul
      // 077: f2i
      // 078: bipush 0
      // 079: nop
      // 07a: sipush 255
      // 07d: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 080: istore 7
      // 082: ldc_w 255.0
      // 085: ldc_w 10.0
      // 088: fload 6
      // 08a: fmul
      // 08b: fsub
      // 08c: f2i
      // 08d: bipush 0
      // 08e: nop
      // 08f: sipush 255
      // 092: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 095: istore 8
      // 097: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 09a: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 09d: ldc_w 0.01
      // 0a0: ldc_w 0.025
      // 0a3: fload 6
      // 0a5: fmul
      // 0a6: fadd
      // 0a7: aload 0
      // 0a8: invokevirtual oxxxde/طل.getAlpha ()F
      // 0ab: fmul
      // 0ac: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 0af: new java/awt/Color
      // 0b2: dup
      // 0b3: iload 8
      // 0b5: iload 8
      // 0b7: iload 8
      // 0b9: iload 7
      // 0bb: invokespecial java/awt/Color.<init> (IIII)V
      // 0be: fload 5
      // 0c0: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 0c3: astore 9
      // 0c5: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 0c8: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0cb: ldc_w 0.07
      // 0ce: ldc_w 0.05
      // 0d1: fload 6
      // 0d3: fmul
      // 0d4: fadd
      // 0d5: aload 0
      // 0d6: invokevirtual oxxxde/طل.getAlpha ()F
      // 0d9: fmul
      // 0da: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 0dd: new java/awt/Color
      // 0e0: dup
      // 0e1: iload 8
      // 0e3: iload 8
      // 0e5: iload 8
      // 0e7: iload 7
      // 0e9: invokespecial java/awt/Color.<init> (IIII)V
      // 0ec: fload 5
      // 0ee: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 0f1: astore 10
      // 0f3: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 0f6: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0f9: ldc_w 0.48
      // 0fc: aload 0
      // 0fd: invokevirtual oxxxde/طل.getAlpha ()F
      // 100: fmul
      // 101: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 104: new java/awt/Color
      // 107: dup
      // 108: bipush 0
      // 109: nop
      // 10a: bipush 0
      // 10b: nop
      // 10c: bipush 0
      // 10d: nop
      // 10e: iload 7
      // 110: invokespecial java/awt/Color.<init> (IIII)V
      // 113: fload 5
      // 115: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 118: astore 11
      // 11a: ldc_w "Добавить"
      // 11d: astore 12
      // 11f: aload 0
      // 120: getfield oxxxde/طل.inputHeight F
      // 123: ldc_w 0.27
      // 126: fmul
      // 127: fstore 13
      // 129: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 12c: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Lkotakbaz/rain/client/util/render/font/Font;
      // 12f: aload 12
      // 131: fload 13
      // 133: fconst_0
      // 134: nop
      // 135: bipush 4
      // 136: nop
      // 137: aconst_null
      // 138: nop
      // 139: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 13c: fstore 14
      // 13e: aload 1
      // 13f: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getLeft ()F
      // 142: aload 1
      // 143: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getWidth ()F
      // 146: fload 14
      // 148: fsub
      // 149: ldc_w 0.5
      // 14c: fmul
      // 14d: fadd
      // 14e: fstore 15
      // 150: aload 1
      // 151: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getTop ()F
      // 154: aload 1
      // 155: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getHeight ()F
      // 158: fload 13
      // 15a: fsub
      // 15b: ldc_w 0.46
      // 15e: fmul
      // 15f: fadd
      // 160: fstore 16
      // 162: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 165: invokevirtual oxxxde/ذر.getBASIC_RECT ()Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 168: aload 0
      // 169: invokevirtual oxxxde/طل.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 16c: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 16f: aload 9
      // 171: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 174: ldc_w 4.0
      // 177: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 17a: fconst_1
      // 17b: nop
      // 17c: aload 10
      // 17e: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 181: aload 1
      // 182: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getLeft ()F
      // 185: aload 1
      // 186: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getTop ()F
      // 189: aload 1
      // 18a: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getWidth ()F
      // 18d: aload 1
      // 18e: invokevirtual kotakbaz/rain/ui/menu/FriendsCategoryComponent$PanelArea.getHeight ()F
      // 191: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.draw (FFFF)V
      // 194: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 197: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Lkotakbaz/rain/client/util/render/font/Font;
      // 19a: aload 0
      // 19b: invokevirtual oxxxde/طل.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 19e: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 1a1: aload 12
      // 1a3: fload 15
      // 1a5: fload 16
      // 1a7: fload 13
      // 1a9: aload 11
      // 1ab: fconst_0
      // 1ac: nop
      // 1ad: fconst_0
      // 1ae: nop
      // 1af: fconst_0
      // 1b0: nop
      // 1b1: bipush 0
      // 1b2: nop
      // 1b3: fconst_0
      // 1b4: nop
      // 1b5: sipush 992
      // 1b8: aconst_null
      // 1b9: nop
      // 1ba: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 1bd: return
   }

   init {
      this.panelWidth = panelWidth
      this.contentTopOffset = contentTopOffset
      this.skinTextureSize = 64.0F
      this.skinUvScale = 0.015625F
      this.headU1 = 8.0F * this.skinUvScale
      this.headV1 = 8.0F * this.skinUvScale
      this.headU2 = 16.0F * this.skinUvScale
      this.headV2 = 16.0F * this.skinUvScale
      this.headOverlayU1 = 40.0F * this.skinUvScale
      this.headOverlayV1 = 8.0F * this.skinUvScale
      this.headOverlayU2 = 48.0F * this.skinUvScale
      this.headOverlayV2 = 16.0F * this.skinUvScale
      this.columns = 2
      this.rowHeight = 33.0F
      this.badgeSize = 18.0F
      this.inputHeight = 22.0F
      this.footerReservedHeight = 30.0F
      this.createButtonWidth = 86.0F
      this.nameFieldMaxLength = 16
      this.deleteHoverAnimations = HashMap<>()
      this.cardHoverAnimations = HashMap<>()
      this.listAnimations = ثّ<>(0.0F, 0.0F, 3, null)
      this.inputFocusAnimation = AnimationUtil(0.0F, 1, null)
      this.createButtonAnimation = AnimationUtil(0.0F, 1, null)
      this.createButtonHoverAnimation = AnimationUtil(0.0F, 1, null)
      this.emptyStateAnimation = AnimationUtil(0.0F, 1, null)
      this.emptyTextTransition = حت(0.0F, 0.0F, 3, null)
      this.renderedFriends = CollectionsKt.emptyList()
      this.scroll = ScrollUtil(0.0F, 1, null)
      this.normalizedSearch = ""
      this.friendNameText = ""
   }

   private fun renderEmptyState(area: ثح, progress: Float) {
      val text: java.lang.String = if (StringsKt.isBlank(this.normalizedSearch)) "Список друзей пуст >_<" else "Ничего не найдено."
      val textSize: Float = 11.0F

      for (`element$iv` in this.emptyTextTransition.update(text)) {
         Font.drawCenteredText$default(
            this.getDefaultFont().priority(this.textPipeline()),
            (`element$iv` as AnimatedTextTransition$Layer).text,
            area.left + area.width * 0.5F,
            area.top + (area.height - textSize) * 0.46F + (`element$iv` as AnimatedTextTransition$Layer).offsetY,
            textSize,
            ثْ.INSTANCE.value(this.getAlpha() * 0.5F * progress * (`element$iv` as AnimatedTextTransition$Layer).alpha),
            0.0F,
            32,
            null
         )
      }
   }

   private fun inside(area: ثح, mouseX: Float, mouseY: Float): Boolean {
      return this.inside(area.left, area.top, area.width, area.height, mouseX, mouseY)
   }

   private fun inputBounds(area: ثح): ثح {
      return FriendsCategoryComponent$PanelArea(
         area.left, this.inputRowTop(area), RangesKt.coerceAtLeast(area.width - this.createButtonWidth - this.getPadding(), 0.0F), this.inputHeight
      )
   }

   public fun scrollViewHeight(): Float {
      return this.cachedViewHeight
   }

   public fun scrollContentHeight(): Float {
      return this.cachedTotalHeight
   }
}
