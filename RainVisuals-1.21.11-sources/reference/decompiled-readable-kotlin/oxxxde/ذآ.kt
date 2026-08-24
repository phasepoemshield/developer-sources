package oxxxde

import java.util.Locale
import kotakbaz.rain.client.util.animations.AnimationUtil
import kotakbaz.rain.client.util.render.font.Font
import kotakbaz.rain.module.setting.settings.TextSetting
import kotakbaz.rain.ui.menu.settings.ModuleSettingComponent
import org.joml.Vector4f
import org.lwjgl.glfw.GLFW
import ru.ocz.protection.annotation.Compile
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat

// $VF: Compiled from heavy
@RecompileFormat
public class ذآ(setting: عت) : ModuleSettingComponent(setting) {
   private final var lastInputWidth: Float
   private final val boxTextPadding: Float
   private final var lastMaxInputWidth: Float
   private final val inputTextSize: Float
   public open val componentHeight: Float = 15.0F
   private AnimationUtil widthAnim;
   private AnimationUtil focusAnim;
   private final var editing: Boolean
   private final val selectedExpand: Float
   private final val minInputWidth: Float
   private final val titleSize: Float = 6.6F

   @Compile
   public override fun render(mouseX: Int, mouseY: Int, partialTicks: Float) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1151)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:921)
      //
      // Bytecode:
      // 000: aload 0
      // 001: iload 1
      // 002: iload 2
      // 003: fload 3
      // 004: invokespecial kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.render (IIF)V
      // 007: aload 0
      // 008: getfield oxxxde/ذآ.focusAnim Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 00b: aload 0
      // 00c: getfield oxxxde/ذآ.editing Z
      // 00f: i2f
      // 010: ldc 220.0
      // 012: new oxxxde/دذ
      // 015: dup
      // 016: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 019: invokespecial oxxxde/دذ.<init> (Loxxxde/بف;)V
      // 01c: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 01f: fstore 4
      // 021: aload 0
      // 022: ldc 0.03
      // 024: ldc 0.05
      // 026: invokevirtual oxxxde/ذآ.themedSurface (FF)Ljava/awt/Color;
      // 029: astore 5
      // 02b: aload 0
      // 02c: ldc 0.05
      // 02e: ldc 0.08
      // 030: invokevirtual oxxxde/ذآ.themedBorder (FF)Ljava/awt/Color;
      // 033: astore 6
      // 035: aload 0
      // 036: ldc 0.32
      // 038: ldc 1.0
      // 03a: invokevirtual oxxxde/ذآ.themedTitle (FF)Ljava/awt/Color;
      // 03d: astore 7
      // 03f: aload 0
      // 040: ldc 0.3
      // 042: ldc 0.82
      // 044: fload 4
      // 046: ldc 0.1
      // 048: fmul
      // 049: fadd
      // 04a: invokevirtual oxxxde/ذآ.themedValue (FF)Ljava/awt/Color;
      // 04d: astore 8
      // 04f: aload 0
      // 050: ldc 0.18
      // 052: ldc 0.42
      // 054: invokevirtual oxxxde/ذآ.themedValue (FF)Ljava/awt/Color;
      // 057: astore 9
      // 059: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 05c: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 05f: aload 0
      // 060: invokevirtual oxxxde/ذآ.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 063: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 066: aload 5
      // 068: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 06b: ldc 3.0
      // 06d: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 070: ldc 0.95
      // 072: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.mix (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 075: fconst_1
      // 076: aload 6
      // 078: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 07b: aload 0
      // 07c: invokevirtual oxxxde/ذآ.getX ()F
      // 07f: aload 0
      // 080: invokevirtual oxxxde/ذآ.getY ()F
      // 083: aload 0
      // 084: invokevirtual oxxxde/ذآ.getWidth ()F
      // 087: aload 0
      // 088: invokevirtual oxxxde/ذآ.getComponentHeight ()F
      // 08b: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.draw (FFFF)V
      // 08e: aload 0
      // 08f: invokevirtual oxxxde/ذآ.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 092: aload 0
      // 093: invokevirtual oxxxde/ذآ.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 096: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 099: aload 0
      // 09a: invokevirtual oxxxde/ذآ.getSetting ()Lkotakbaz/rain/module/setting/Setting;
      // 09d: checkcast kotakbaz/rain/module/setting/settings/TextSetting
      // 0a0: invokevirtual kotakbaz/rain/module/setting/settings/TextSetting.getName ()Ljava/lang/String;
      // 0a3: aload 0
      // 0a4: invokevirtual oxxxde/ذآ.getX ()F
      // 0a7: aload 0
      // 0a8: invokevirtual oxxxde/ذآ.getPadding ()F
      // 0ab: fadd
      // 0ac: aload 0
      // 0ad: invokevirtual oxxxde/ذآ.getY ()F
      // 0b0: ldc 3.3
      // 0b2: fadd
      // 0b3: aload 0
      // 0b4: getfield oxxxde/ذآ.titleSize F
      // 0b7: aload 7
      // 0b9: fconst_0
      // 0ba: fconst_0
      // 0bb: fconst_0
      // 0bc: bipush 0
      // 0bd: fconst_0
      // 0be: sipush 992
      // 0c1: aconst_null
      // 0c2: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 0c5: aload 0
      // 0c6: invokespecial oxxxde/ذآ.displayTextForSizing ()Ljava/lang/String;
      // 0c9: astore 10
      // 0cb: aload 0
      // 0cc: aload 10
      // 0ce: invokespecial oxxxde/ذآ.inputRect (Ljava/lang/String;)Lorg/joml/Vector4f;
      // 0d1: astore 11
      // 0d3: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0d6: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0d9: aload 0
      // 0da: invokevirtual oxxxde/ذآ.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 0dd: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0e0: aload 5
      // 0e2: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0e5: ldc 2.2
      // 0e7: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0ea: ldc 0.95
      // 0ec: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.mix (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0ef: fconst_1
      // 0f0: aload 6
      // 0f2: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0f5: aload 11
      // 0f7: getfield org/joml/Vector4f.x F
      // 0fa: aload 11
      // 0fc: getfield org/joml/Vector4f.y F
      // 0ff: aload 11
      // 101: getfield org/joml/Vector4f.z F
      // 104: aload 11
      // 106: getfield org/joml/Vector4f.w F
      // 109: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.draw (FFFF)V
      // 10c: aload 0
      // 10d: invokevirtual oxxxde/ذآ.getSetting ()Lkotakbaz/rain/module/setting/Setting;
      // 110: checkcast kotakbaz/rain/module/setting/settings/TextSetting
      // 113: invokevirtual kotakbaz/rain/module/setting/settings/TextSetting.getValue ()Ljava/lang/Object;
      // 116: checkcast java/lang/String
      // 119: astore 12
      // 11b: aload 12
      // 11d: invokeinterface java/lang/CharSequence.length ()I 1
      // 122: ifne 13a
      // 125: aload 0
      // 126: getfield oxxxde/ذآ.editing Z
      // 129: ifeq 133
      // 12c: ldc ""
      // 12e: astore 13
      // 130: goto 149
      // 133: ldc "Text.."
      // 135: astore 13
      // 137: goto 149
      // 13a: aload 0
      // 13b: invokevirtual oxxxde/ذآ.getSetting ()Lkotakbaz/rain/module/setting/Setting;
      // 13e: checkcast kotakbaz/rain/module/setting/settings/TextSetting
      // 141: invokevirtual kotakbaz/rain/module/setting/settings/TextSetting.getValue ()Ljava/lang/Object;
      // 144: checkcast java/lang/String
      // 147: astore 13
      // 149: aload 11
      // 14b: getfield org/joml/Vector4f.z F
      // 14e: aload 0
      // 14f: getfield oxxxde/ذآ.boxTextPadding F
      // 152: fconst_2
      // 153: fmul
      // 154: fsub
      // 155: fconst_1
      // 156: fsub
      // 157: fconst_0
      // 158: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 15b: fstore 14
      // 15d: aload 11
      // 15f: getfield org/joml/Vector4f.z F
      // 162: aload 0
      // 163: getfield oxxxde/ذآ.lastMaxInputWidth F
      // 166: fcmpl
      // 167: iflt 17b
      // 16a: aload 0
      // 16b: aload 13
      // 16d: fload 14
      // 16f: aload 0
      // 170: getfield oxxxde/ذآ.inputTextSize F
      // 173: invokespecial oxxxde/ذآ.trimToFit (Ljava/lang/String;FF)Ljava/lang/String;
      // 176: astore 15
      // 178: goto 17f
      // 17b: aload 13
      // 17d: astore 15
      // 17f: bipush 0
      // 180: istore 16
      // 182: aload 0
      // 183: getfield oxxxde/ذآ.editing Z
      // 186: ifeq 19c
      // 189: invokestatic java/lang/System.currentTimeMillis ()J
      // 18c: ldc2_w 450
      // 18f: ldiv
      // 190: ldc2_w 2
      // 193: lrem
      // 194: lconst_0
      // 195: lcmp
      // 196: ifne 19c
      // 199: bipush 1
      // 19a: istore 16
      // 19c: aload 0
      // 19d: invokevirtual oxxxde/ذآ.getSetting ()Lkotakbaz/rain/module/setting/Setting;
      // 1a0: checkcast kotakbaz/rain/module/setting/settings/TextSetting
      // 1a3: invokevirtual kotakbaz/rain/module/setting/settings/TextSetting.getValue ()Ljava/lang/Object;
      // 1a6: checkcast java/lang/String
      // 1a9: invokeinterface java/lang/CharSequence.length ()I 1
      // 1ae: ifne 1bf
      // 1b1: aload 0
      // 1b2: getfield oxxxde/ذآ.editing Z
      // 1b5: ifne 1bf
      // 1b8: aload 9
      // 1ba: astore 17
      // 1bc: goto 1c3
      // 1bf: aload 8
      // 1c1: astore 17
      // 1c3: aload 0
      // 1c4: getfield oxxxde/ذآ.editing Z
      // 1c7: ifeq 1e8
      // 1ca: aload 0
      // 1cb: invokevirtual oxxxde/ذآ.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 1ce: ldc_w "|"
      // 1d1: aload 0
      // 1d2: getfield oxxxde/ذآ.inputTextSize F
      // 1d5: fconst_0
      // 1d6: bipush 4
      // 1d7: aconst_null
      // 1d8: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 1db: fstore 18
      // 1dd: fload 18
      // 1df: ldc_w 0.5
      // 1e2: fadd
      // 1e3: fstore 19
      // 1e5: goto 1ee
      // 1e8: fconst_0
      // 1e9: fstore 18
      // 1eb: fconst_0
      // 1ec: fstore 19
      // 1ee: aload 0
      // 1ef: invokevirtual oxxxde/ذآ.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 1f2: aload 15
      // 1f4: aload 0
      // 1f5: getfield oxxxde/ذآ.inputTextSize F
      // 1f8: fconst_0
      // 1f9: bipush 4
      // 1fa: aconst_null
      // 1fb: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 1fe: fstore 20
      // 200: aload 11
      // 202: getfield org/joml/Vector4f.x F
      // 205: aload 11
      // 207: getfield org/joml/Vector4f.z F
      // 20a: fconst_2
      // 20b: fdiv
      // 20c: fadd
      // 20d: fload 20
      // 20f: fload 19
      // 211: fadd
      // 212: fconst_2
      // 213: fdiv
      // 214: fsub
      // 215: fstore 21
      // 217: aload 0
      // 218: invokevirtual oxxxde/ذآ.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 21b: aload 0
      // 21c: invokevirtual oxxxde/ذآ.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 21f: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 222: aload 15
      // 224: fload 21
      // 226: aload 11
      // 228: getfield org/joml/Vector4f.y F
      // 22b: ldc_w 1.8
      // 22e: fadd
      // 22f: aload 0
      // 230: getfield oxxxde/ذآ.inputTextSize F
      // 233: aload 17
      // 235: fconst_0
      // 236: fconst_0
      // 237: fconst_0
      // 238: bipush 0
      // 239: fconst_0
      // 23a: sipush 992
      // 23d: aconst_null
      // 23e: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 241: aload 0
      // 242: getfield oxxxde/ذآ.editing Z
      // 245: ifeq 27f
      // 248: iload 16
      // 24a: ifeq 27f
      // 24d: aload 0
      // 24e: invokevirtual oxxxde/ذآ.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 251: aload 0
      // 252: invokevirtual oxxxde/ذآ.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 255: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 258: ldc_w "|"
      // 25b: fload 21
      // 25d: fload 20
      // 25f: fadd
      // 260: ldc_w 0.5
      // 263: fadd
      // 264: aload 11
      // 266: getfield org/joml/Vector4f.y F
      // 269: ldc_w 1.8
      // 26c: fadd
      // 26d: aload 0
      // 26e: getfield oxxxde/ذآ.inputTextSize F
      // 271: aload 8
      // 273: fconst_0
      // 274: fconst_0
      // 275: fconst_0
      // 276: bipush 0
      // 277: fconst_0
      // 278: sipush 992
      // 27b: aconst_null
      // 27c: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 27f: return
   }

   private fun inputRect(displayText: String): Vector4f {
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
      // 001: invokevirtual oxxxde/ذآ.getWidth ()F
      // 004: aload 0
      // 005: invokevirtual oxxxde/ذآ.getPadding ()F
      // 008: fconst_2
      // 009: nop
      // 00a: fmul
      // 00b: fsub
      // 00c: fconst_0
      // 00d: nop
      // 00e: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 011: fstore 2
      // 012: aload 0
      // 013: invokevirtual oxxxde/ذآ.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 016: aload 0
      // 017: invokevirtual oxxxde/ذآ.getSetting ()Lkotakbaz/rain/module/setting/Setting;
      // 01a: checkcast kotakbaz/rain/module/setting/settings/TextSetting
      // 01d: invokevirtual kotakbaz/rain/module/setting/settings/TextSetting.getName ()Ljava/lang/String;
      // 020: aload 0
      // 021: getfield oxxxde/ذآ.titleSize F
      // 024: fconst_0
      // 025: nop
      // 026: bipush 4
      // 027: nop
      // 028: aconst_null
      // 029: nop
      // 02a: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 02d: fstore 3
      // 02e: aload 0
      // 02f: invokevirtual oxxxde/ذآ.getWidth ()F
      // 032: aload 0
      // 033: invokevirtual oxxxde/ذآ.getPadding ()F
      // 036: ldc 3.0
      // 038: fmul
      // 039: fload 3
      // 03a: fadd
      // 03b: fconst_2
      // 03c: nop
      // 03d: fadd
      // 03e: fsub
      // 03f: fconst_0
      // 040: nop
      // 041: fload 2
      // 042: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 045: fstore 4
      // 047: aload 0
      // 048: invokevirtual oxxxde/ذآ.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 04b: aload 1
      // 04c: aload 0
      // 04d: getfield oxxxde/ذآ.inputTextSize F
      // 050: fconst_0
      // 051: nop
      // 052: bipush 4
      // 053: nop
      // 054: aconst_null
      // 055: nop
      // 056: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 059: fstore 5
      // 05b: fload 5
      // 05d: aload 0
      // 05e: getfield oxxxde/ذآ.boxTextPadding F
      // 061: fconst_2
      // 062: nop
      // 063: fmul
      // 064: fadd
      // 065: fstore 6
      // 067: fload 6
      // 069: aload 0
      // 06a: getfield oxxxde/ذآ.editing Z
      // 06d: ifeq 077
      // 070: aload 0
      // 071: getfield oxxxde/ذآ.selectedExpand F
      // 074: goto 079
      // 077: fconst_0
      // 078: nop
      // 079: fadd
      // 07a: fstore 7
      // 07c: aload 0
      // 07d: getfield oxxxde/ذآ.minInputWidth F
      // 080: fload 4
      // 082: invokestatic kotlin/ranges/RangesKt.coerceAtMost (FF)F
      // 085: fstore 8
      // 087: fload 4
      // 089: fconst_0
      // 08a: nop
      // 08b: fcmpg
      // 08c: ifgt 094
      // 08f: fconst_0
      // 090: nop
      // 091: goto 09d
      // 094: fload 7
      // 096: fload 8
      // 098: fload 4
      // 09a: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 09d: fstore 9
      // 09f: fload 9
      // 0a1: aload 0
      // 0a2: getfield oxxxde/ذآ.lastInputWidth F
      // 0a5: fcmpl
      // 0a6: ifle 0af
      // 0a9: ldc_w 70.0
      // 0ac: goto 0b2
      // 0af: ldc_w 240.0
      // 0b2: fstore 10
      // 0b4: aload 0
      // 0b5: getfield oxxxde/ذآ.widthAnim Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 0b8: fload 9
      // 0ba: fload 10
      // 0bc: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 0bf: astore 12
      // 0c1: new oxxxde/حَ
      // 0c4: dup
      // 0c5: aload 12
      // 0c7: invokespecial oxxxde/حَ.<init> (Loxxxde/بف;)V
      // 0ca: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 0cd: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 0d0: fstore 11
      // 0d2: aload 0
      // 0d3: fload 11
      // 0d5: putfield oxxxde/ذآ.lastInputWidth F
      // 0d8: aload 0
      // 0d9: fload 4
      // 0db: putfield oxxxde/ذآ.lastMaxInputWidth F
      // 0de: aload 0
      // 0df: invokevirtual oxxxde/ذآ.getComponentHeight ()F
      // 0e2: ldc_w 0.72
      // 0e5: fmul
      // 0e6: fstore 12
      // 0e8: aload 0
      // 0e9: invokevirtual oxxxde/ذآ.getX ()F
      // 0ec: aload 0
      // 0ed: invokevirtual oxxxde/ذآ.getWidth ()F
      // 0f0: fadd
      // 0f1: aload 0
      // 0f2: invokevirtual oxxxde/ذآ.getPadding ()F
      // 0f5: fsub
      // 0f6: fload 11
      // 0f8: fsub
      // 0f9: fstore 13
      // 0fb: aload 0
      // 0fc: aload 0
      // 0fd: invokevirtual oxxxde/ذآ.getY ()F
      // 100: aload 0
      // 101: invokevirtual oxxxde/ذآ.getComponentHeight ()F
      // 104: fload 12
      // 106: invokevirtual oxxxde/ذآ.calcMidY (FFF)F
      // 109: fstore 14
      // 10b: new org/joml/Vector4f
      // 10e: dup
      // 10f: fload 13
      // 111: fload 14
      // 113: fload 11
      // 115: fload 12
      // 117: invokespecial org/joml/Vector4f.<init> (FFFF)V
      // 11a: areturn
   }

   private fun trimToFit(text: String, maxWidth: Float, size: Float): String {
      if (maxWidth <= 0.0F) {
         return ""
      } else {
         var candidate: java.lang.String = text

         while (candidate.length() > 0 && Font.getWidth$default(this.getDefaultFont(), candidate, size, 0.0F, 4, null) > maxWidth) {
            candidate = StringsKt.dropLast(candidate, 1)
         }

         return candidate
      }
   }

   init {
      this.inputTextSize = 5.9F
      this.boxTextPadding = 4.0F
      this.selectedExpand = 6.0F
      this.minInputWidth = 26.0F
      this.widthAnim = AnimationUtil(0.0F, 1, null)
      this.focusAnim = AnimationUtil(0.0F, 1, null)
      this.lastInputWidth = this.minInputWidth
      this.lastMaxInputWidth = this.minInputWidth
   }

   private fun displayTextForSizing(): String {
      val var1: java.lang.CharSequence = this.getSetting().getValue()
      return (if (var1.length() == 0) "Text.." else var1) as java.lang.String
   }

   public override fun onKeyPress(mouseX: Int, mouseY: Int, button: Int) {
      super.onKeyPress(mouseX, mouseY, button)
      if (this.editing) {
         when (button) {
            32 -> {
               this.getSetting().setText("${this.getSetting().getValue()} ")
               return
            }
            256, 257, 335 -> {
               this.editing = false
               return
            }
            259 -> {
               if (this.getSetting().getValue().length() > 0) {
                  this.getSetting().setText(StringsKt.dropLast(this.getSetting().getValue(), 1))
               }

               return
            }
            261 -> {
               this.getSetting().setText("")
               return
            }
            else -> {
               val var10000: java.lang.String = GLFW.glfwGetKeyName(button, 0)
               if (var10000 != null) {
                  if (var10000.length() == 1 && this.getSetting().getValue().length() <= (this.getSetting() as TextSetting).maxLength) {
                     val var5: TextSetting = this.getSetting()
                     val var10001: Any = this.getSetting().getValue()
                     val var10002: Any = var10000.toLowerCase(Locale.ROOT)
                     var5.setText("$var10001$var10002")
                  }
               }
            }
         }
      }
   }

   @Compile
   public override fun onMouseClick(mouseX: Int, mouseY: Int, button: Int) {
      super.onMouseClick(button, mouseX, mouseY)
      if (mouseY == 0) {
         val var4: Vector4f = this.inputRect(this.displayTextForSizing())
         if (button >= var4.x && button <= var4.x + var4.z && mouseX >= var4.y && mouseX <= var4.y + var4.w) {
            this.editing = true
         } else {
            this.editing = false
         }
      }
   }
}
