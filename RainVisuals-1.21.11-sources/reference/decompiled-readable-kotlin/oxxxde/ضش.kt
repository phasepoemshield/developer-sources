package oxxxde

import java.awt.Color
import kotakbaz.rain.client.draggable.Draggable
import kotakbaz.rain.client.draggable.HudAlignment$Axis
import kotakbaz.rain.client.draggable.HudAlignment$Pos
import kotakbaz.rain.client.util.animations.AnimationUtil
import kotakbaz.rain.client.util.render.display.BasicRectRenderer
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import kotakbaz.rain.client.util.render.font.Font
import kotlin.jvm.internal.Ref
import net.minecraft.client.gui.screen.ChatScreen
import org.lwjgl.glfw.GLFW

// $VF: Compiled from heavy
public object ضش {
   private final var guideX: Float?
   @JvmStatic
   private Draggable active;
   private final var guideY: Float?
   @JvmStatic
   private AnimationUtil alpha = AnimationUtil(0.0F, 1, null);
   private const val SNAP: Float = 5.0F
   private final var free: Boolean

   private fun line(x: Float, y: Float, w: Float, h: Float, a: Float) {
      val var10000: BasicRectRenderer = ذر.INSTANCE.BASIC_RECT.priority(ClientRenderPipeline.HUD_RECT)
      val var10001: بح = بح.INSTANCE
      val var10002: Color = Color.WHITE
      var10000.color(var10001.setAlpha(var10002, 0.55F * a)).round(0.0F).draw(x, y, w, h)
   }

   public fun render() {
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
      // 000: invokestatic oxxxde/ضك.getMc ()Lnet/minecraft/client/MinecraftClient;
      // 003: getfield net/minecraft/client/MinecraftClient.currentScreen Lnet/minecraft/client/gui/screen/Screen;
      // 006: instanceof net/minecraft/client/gui/screen/ChatScreen
      // 009: ifeq 073
      // 00c: getstatic oxxxde/ثٌ.INSTANCE Loxxxde/ثٌ;
      // 00f: invokevirtual oxxxde/ثٌ.getDraggables ()Ljava/util/LinkedHashMap;
      // 012: invokevirtual java/util/LinkedHashMap.values ()Ljava/util/Collection;
      // 015: dup
      // 016: ldc "<get-values>(...)"
      // 018: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 01b: checkcast java/lang/Iterable
      // 01e: astore 2
      // 01f: bipush 0
      // 020: nop
      // 021: istore 3
      // 022: aload 2
      // 023: nop
      // 024: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 029: astore 4
      // 02b: aload 4
      // 02d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 032: ifeq 06b
      // 035: aload 4
      // 037: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 03c: astore 5
      // 03e: aload 5
      // 040: checkcast kotakbaz/rain/client/draggable/Draggable
      // 043: astore 6
      // 045: bipush 0
      // 046: nop
      // 047: istore 7
      // 049: aload 6
      // 04b: invokevirtual kotakbaz/rain/client/draggable/Draggable.isDragging ()Z
      // 04e: ifeq 061
      // 051: aload 6
      // 053: invokevirtual kotakbaz/rain/client/draggable/Draggable.getModule ()Lkotakbaz/rain/module/Module;
      // 056: invokevirtual kotakbaz/rain/module/Module.isEnabled ()Z
      // 059: ifeq 061
      // 05c: bipush 1
      // 05d: nop
      // 05e: goto 063
      // 061: bipush 0
      // 062: nop
      // 063: ifeq 02b
      // 066: aload 5
      // 068: goto 06d
      // 06b: aconst_null
      // 06c: nop
      // 06d: checkcast kotakbaz/rain/client/draggable/Draggable
      // 070: goto 075
      // 073: aconst_null
      // 074: nop
      // 075: astore 1
      // 076: getstatic oxxxde/ضش.alpha Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 079: aload 1
      // 07a: ifnull 082
      // 07d: fconst_1
      // 07e: nop
      // 07f: goto 084
      // 082: fconst_0
      // 083: nop
      // 084: ldc 120.0
      // 086: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 089: astore 3
      // 08a: new oxxxde/و
      // 08d: dup
      // 08e: aload 3
      // 08f: nop
      // 090: invokespecial oxxxde/و.<init> (Loxxxde/بف;)V
      // 093: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 096: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 099: fstore 2
      // 09a: fload 2
      // 09b: ldc 0.01
      // 09d: fcmpg
      // 09e: ifgt 0a2
      // 0a1: return
      // 0a2: invokestatic oxxxde/ضك.getMc ()Lnet/minecraft/client/MinecraftClient;
      // 0a5: invokevirtual net/minecraft/client/MinecraftClient.getWindow ()Lnet/minecraft/client/util/Window;
      // 0a8: invokevirtual net/minecraft/client/util/Window.getScaledWidth ()I
      // 0ab: i2f
      // 0ac: fstore 3
      // 0ad: invokestatic oxxxde/ضك.getMc ()Lnet/minecraft/client/MinecraftClient;
      // 0b0: invokevirtual net/minecraft/client/MinecraftClient.getWindow ()Lnet/minecraft/client/util/Window;
      // 0b3: invokevirtual net/minecraft/client/util/Window.getScaledHeight ()I
      // 0b6: i2f
      // 0b7: fstore 4
      // 0b9: getstatic oxxxde/ضش.free Z
      // 0bc: ifne 10c
      // 0bf: getstatic oxxxde/ضش.guideX Ljava/lang/Float;
      // 0c2: dup
      // 0c3: ifnull 0e4
      // 0c6: checkcast java/lang/Number
      // 0c9: invokevirtual java/lang/Number.floatValue ()F
      // 0cc: fstore 7
      // 0ce: bipush 0
      // 0cf: nop
      // 0d0: istore 8
      // 0d2: getstatic oxxxde/ضش.INSTANCE Loxxxde/ضش;
      // 0d5: fload 7
      // 0d7: fconst_0
      // 0d8: nop
      // 0d9: fconst_1
      // 0da: nop
      // 0db: fload 4
      // 0dd: fload 2
      // 0de: invokespecial oxxxde/ضش.line (FFFFF)V
      // 0e1: goto 0e6
      // 0e4: pop
      // 0e5: nop
      // 0e6: getstatic oxxxde/ضش.guideY Ljava/lang/Float;
      // 0e9: dup
      // 0ea: ifnull 10a
      // 0ed: checkcast java/lang/Number
      // 0f0: invokevirtual java/lang/Number.floatValue ()F
      // 0f3: fstore 7
      // 0f5: bipush 0
      // 0f6: nop
      // 0f7: istore 8
      // 0f9: getstatic oxxxde/ضش.INSTANCE Loxxxde/ضش;
      // 0fc: fconst_0
      // 0fd: nop
      // 0fe: fload 7
      // 100: fload 3
      // 101: fconst_1
      // 102: nop
      // 103: fload 2
      // 104: invokespecial oxxxde/ضش.line (FFFFF)V
      // 107: goto 10c
      // 10a: pop
      // 10b: nop
      // 10c: aload 0
      // 10d: fload 3
      // 10e: fload 4
      // 110: fload 2
      // 111: invokespecial oxxxde/ضش.hint (FFF)V
      // 114: aload 1
      // 115: ifnonnull 11d
      // 118: aconst_null
      // 119: nop
      // 11a: putstatic oxxxde/ضش.active Lkotakbaz/rain/client/draggable/Draggable;
      // 11d: return
   }

   private fun snapAxis(pos: Float, size: Float, vertical: Boolean): رً {
      val screen: Int = if (vertical) ضك.getMc().getWindow().getScaledWidth() else ضك.getMc().getWindow().getScaledHeight()
      val best: Ref.FloatRef = Ref.FloatRef()
      best.element = 5.0F
      val delta: Ref.FloatRef = Ref.FloatRef()
      val guide: Ref.ObjectRef = Ref.ObjectRef()
      snapAxis$test(pos, size, best, delta, guide, (float)screen / 2.0F)
      val var10000: java.util.Collection = ثٌ.INSTANCE.draggables.values()

      for (`element$iv` in var10000) {
         val it: Draggable = `element$iv` as Draggable
         if (`element$iv` as Draggable != active
            && (`element$iv` as Draggable).module.isEnabled()
            && !((`element$iv` as Draggable).width <= 0.0F)
            && !((`element$iv` as Draggable).height <= 0.0F)) {
            val p: Float = if (vertical) it.x else it.y
            val s: Float = if (vertical) it.width else it.height
            snapAxis$test(pos, size, best, delta, guide, p)
            snapAxis$test(pos, size, best, delta, guide, p + s / 2.0F)
            snapAxis$test(pos, size, best, delta, guide, p + s)
         }
      }

      return HudAlignment$Axis(pos + delta.element, guide.element as java.lang.Float)
   }

   private fun altDown(): Boolean {
      val handle: Long = ضك.getMc().getWindow().getHandle()
      return GLFW.glfwGetKey(handle, 342) == 1 || GLFW.glfwGetKey(handle, 346) == 1
   }

   private fun clearGuides() {
      guideX = null
      guideY = null
   }

   private fun hint(width: Float, height: Float, a: Float) {
      val text: java.lang.String = if (free) "Свободное перемещение" else "Зажмите ALT для свободного перемещения"
      val size: Float = طغ.INSTANCE.scaled(7.5F)
      val padX: Float = طغ.INSTANCE.scaled(8.0F)
      val padY: Float = طغ.INSTANCE.scaled(4.5F)
      val boxW: Float = Font.getWidth$default(رَ.INSTANCE.GS_MEDIUM, text, size, 0.0F, 4, null) + padX * 2.0F
      val boxH: Float = size + padY * 2.0F
      val x: Float = width / 2.0F - boxW / 2.0F
      val y: Float = height - 40.0F - boxH - طغ.INSTANCE.scaled(18.0F)
      ذر.INSTANCE.BLURRED_RECT
         .priority(ClientRenderPipeline.HUD_RECT)
         .color(بح.INSTANCE.setAlpha(طغ.INSTANCE.PANEL_COLOR, 0.82F * a))
         .mix(0.9F)
         .round(boxH / 2.0F)
         .draw(x, y, boxW, boxH)
         رَ.INSTANCE.GS_MEDIUM
         .priority(ClientRenderPipeline.HUD_TEXT)
         .size(size)
         .color(بح.INSTANCE.setAlpha(طغ.INSTANCE.TITLE_COLOR, a))
         .drawText(text, x + padX, y + padY - طغ.INSTANCE.scaled(0.6F))
      }

   @JvmStatic
   fun `snapAxis$test$anchor`(value: Float, best: Ref.FloatRef, `$target`: Ref.FloatRef, guide: Ref.ObjectRef<java.lang.Float>, delta: Float) {
      val dist: Float = Math.abs(value - `$target`)
      if (dist < best.element) {
         best.element = dist
         delta.element = `$target` - value
         guide.element = (T)`$target`
      }
   }

   public fun snap(drag: ظذ, x: Float, y: Float): دآ {
      active = drag
      free = this.altDown()
      if (!free && !(drag.width <= 0.0F) && !(drag.height <= 0.0F)) {
         val var7: HudAlignment$Axis = this.snapAxis(x, drag.width, true)
         val sy: HudAlignment$Axis = this.snapAxis(y, drag.height, false)
         guideX = var7.guide
         guideY = sy.guide
         return HudAlignment$Pos(var7.pos, sy.pos)
      } else {
         val sx: HudAlignment$Pos = HudAlignment$Pos(x, y)
         INSTANCE.clearGuides()
         return sx
      }
   }

   @JvmStatic
   fun `snapAxis$test`(`$size`: Float, delta: Float, target: Ref.FloatRef, guide: Ref.FloatRef, best: Ref.ObjectRef<java.lang.Float>, `$pos`: Float) {
      snapAxis$test$anchor(target, best, delta, guide, `$pos`)
      snapAxis$test$anchor(target, best, delta, guide, `$pos` + `$size` / 2.0F)
      snapAxis$test$anchor(target, best, delta, guide, `$pos` + `$size`)
   }
}
