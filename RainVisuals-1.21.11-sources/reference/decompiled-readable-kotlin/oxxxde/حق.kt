package oxxxde

import java.awt.Color
import java.util.HashMap
import kotakbaz.rain.client.util.animations.AnimationUtil
import kotakbaz.rain.client.util.render.font.Font
import kotakbaz.rain.module.setting.ModeSetting
import kotakbaz.rain.ui.menu.settings.ModuleSettingComponent
import org.joml.Vector4f
import ru.ocz.protection.annotation.Compile
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat

// $VF: Compiled from heavy
@RecompileFormat
public class حق(setting: ظي) : ModuleSettingComponent(setting) {
   private final val optionTextToIconGap: Float
   private AnimationUtil openAnim;
   private final val optionGap: Float
   private final val optionHoverAnims: HashMap<String, ري>
   private final val optionTextLeftPadding: Float
   private final val optionDuration: Float
   private final var open: Boolean
   private AnimationUtil selectorHoverAnim;
   private final val optionHeight: Float
   private final val baseHeight: Float = 15.0F
   private final val iconRightOffsetExtra: Float
   private final val optionTextSize: Float
   private final val optionAnims: HashMap<String, ري>
   private final val openDuration: Float

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
      // 008: invokespecial oxxxde/حق.openProgress ()F
      // 00b: fstore 4
      // 00d: aload 0
      // 00e: ldc 0.03
      // 010: ldc 0.05
      // 012: invokevirtual oxxxde/حق.themedSurface (FF)Ljava/awt/Color;
      // 015: astore 5
      // 017: aload 0
      // 018: ldc 0.05
      // 01a: ldc 0.08
      // 01c: invokevirtual oxxxde/حق.themedBorder (FF)Ljava/awt/Color;
      // 01f: astore 6
      // 021: aload 0
      // 022: ldc 0.32
      // 024: ldc 1.0
      // 026: invokevirtual oxxxde/حق.themedTitle (FF)Ljava/awt/Color;
      // 029: astore 7
      // 02b: aload 0
      // 02c: ldc 0.28
      // 02e: ldc 0.78
      // 030: invokevirtual oxxxde/حق.themedValue (FF)Ljava/awt/Color;
      // 033: astore 8
      // 035: aload 0
      // 036: fload 4
      // 038: invokespecial oxxxde/حق.selectorRect (F)Lorg/joml/Vector4f;
      // 03b: astore 9
      // 03d: aload 9
      // 03f: getfield org/joml/Vector4f.x F
      // 042: fstore 10
      // 044: aload 9
      // 046: getfield org/joml/Vector4f.y F
      // 049: fstore 11
      // 04b: aload 9
      // 04d: getfield org/joml/Vector4f.z F
      // 050: fstore 12
      // 052: aload 9
      // 054: getfield org/joml/Vector4f.w F
      // 057: fstore 13
      // 059: iload 1
      // 05a: i2f
      // 05b: fload 10
      // 05d: fcmpg
      // 05e: iflt 085
      // 061: iload 1
      // 062: i2f
      // 063: fload 10
      // 065: fload 12
      // 067: fadd
      // 068: fcmpl
      // 069: ifgt 085
      // 06c: iload 2
      // 06d: i2f
      // 06e: fload 11
      // 070: fcmpg
      // 071: iflt 085
      // 074: iload 2
      // 075: i2f
      // 076: fload 11
      // 078: fload 13
      // 07a: fadd
      // 07b: fcmpl
      // 07c: ifgt 085
      // 07f: fconst_1
      // 080: fstore 14
      // 082: goto 088
      // 085: fconst_0
      // 086: fstore 14
      // 088: aload 0
      // 089: getfield oxxxde/حق.selectorHoverAnim Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 08c: fload 14
      // 08e: ldc 170.0
      // 090: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 093: astore 33
      // 095: new oxxxde/طْ
      // 098: dup
      // 099: aload 33
      // 09b: invokespecial oxxxde/طْ.<init> (Loxxxde/بف;)V
      // 09e: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 0a1: fconst_0
      // 0a2: ldc 1.0
      // 0a4: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0a7: fstore 14
      // 0a9: aload 0
      // 0aa: invokevirtual oxxxde/حق.getSetting ()Lkotakbaz/rain/module/setting/Setting;
      // 0ad: checkcast kotakbaz/rain/module/setting/ModeSetting
      // 0b0: invokevirtual kotakbaz/rain/module/setting/ModeSetting.getModes ()Ljava/util/List;
      // 0b3: invokeinterface java/util/List.size ()I 1
      // 0b8: i2f
      // 0b9: aload 0
      // 0ba: getfield oxxxde/حق.optionHeight F
      // 0bd: aload 0
      // 0be: getfield oxxxde/حق.optionGap F
      // 0c1: fadd
      // 0c2: fmul
      // 0c3: aload 0
      // 0c4: getfield oxxxde/حق.optionGap F
      // 0c7: fsub
      // 0c8: ldc 4.0
      // 0ca: fadd
      // 0cb: fconst_0
      // 0cc: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 0cf: fstore 15
      // 0d1: aload 0
      // 0d2: invokevirtual oxxxde/حق.getY ()F
      // 0d5: fstore 16
      // 0d7: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0da: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0dd: aload 0
      // 0de: invokevirtual oxxxde/حق.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 0e1: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0e4: aload 5
      // 0e6: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0e9: ldc 3.0
      // 0eb: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0ee: ldc 0.95
      // 0f0: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.mix (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0f3: ldc 1.0
      // 0f5: aload 6
      // 0f7: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0fa: aload 0
      // 0fb: invokevirtual oxxxde/حق.getX ()F
      // 0fe: aload 0
      // 0ff: invokevirtual oxxxde/حق.getY ()F
      // 102: aload 0
      // 103: invokevirtual oxxxde/حق.getWidth ()F
      // 106: aload 0
      // 107: invokevirtual oxxxde/حق.getComponentHeight ()F
      // 10a: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.draw (FFFF)V
      // 10d: aload 0
      // 10e: getfield oxxxde/حق.baseHeight F
      // 111: fstore 17
      // 113: aload 0
      // 114: invokevirtual oxxxde/حق.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 117: aload 0
      // 118: invokevirtual oxxxde/حق.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 11b: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 11e: astore 18
      // 120: aload 0
      // 121: invokevirtual oxxxde/حق.getSetting ()Lkotakbaz/rain/module/setting/Setting;
      // 124: checkcast kotakbaz/rain/module/setting/ModeSetting
      // 127: invokevirtual kotakbaz/rain/module/setting/ModeSetting.getName ()Ljava/lang/String;
      // 12a: astore 19
      // 12c: aload 18
      // 12e: aload 19
      // 130: aload 0
      // 131: invokevirtual oxxxde/حق.getX ()F
      // 134: aload 0
      // 135: invokevirtual oxxxde/حق.getPadding ()F
      // 138: fadd
      // 139: fload 16
      // 13b: ldc 3.3
      // 13d: fadd
      // 13e: fload 17
      // 140: ldc 0.42
      // 142: fmul
      // 143: aload 7
      // 145: fconst_0
      // 146: fconst_0
      // 147: fconst_0
      // 148: bipush 0
      // 149: fconst_0
      // 14a: sipush 992
      // 14d: aconst_null
      // 14e: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 151: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 154: aload 0
      // 155: ldc 0.03
      // 157: fload 14
      // 159: ldc 0.025
      // 15b: fmul
      // 15c: fadd
      // 15d: ldc 0.05
      // 15f: fload 14
      // 161: ldc 0.025
      // 163: fmul
      // 164: fadd
      // 165: invokevirtual oxxxde/حق.alphaByState (FF)F
      // 168: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 16b: astore 34
      // 16d: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 170: aload 0
      // 171: ldc 0.05
      // 173: fload 14
      // 175: ldc 0.05
      // 177: fmul
      // 178: fadd
      // 179: ldc 0.08
      // 17b: fload 14
      // 17d: ldc 0.05
      // 17f: fmul
      // 180: fadd
      // 181: invokevirtual oxxxde/حق.alphaByState (FF)F
      // 184: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 187: astore 35
      // 189: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 18c: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 18f: aload 0
      // 190: invokevirtual oxxxde/حق.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 193: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 196: aload 34
      // 198: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 19b: ldc_w 2.2
      // 19e: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 1a1: ldc 0.95
      // 1a3: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.mix (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 1a6: ldc 1.0
      // 1a8: aload 35
      // 1aa: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 1ad: fload 10
      // 1af: fload 11
      // 1b1: fload 12
      // 1b3: fload 13
      // 1b5: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.draw (FFFF)V
      // 1b8: fload 12
      // 1ba: ldc_w 1.5
      // 1bd: fsub
      // 1be: fconst_0
      // 1bf: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 1c2: pop
      // 1c3: fload 13
      // 1c5: ldc_w 1.5
      // 1c8: fsub
      // 1c9: fconst_0
      // 1ca: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 1cd: pop
      // 1ce: aload 0
      // 1cf: invokevirtual oxxxde/حق.getParentOpenProgress ()F
      // 1d2: pop
      // 1d3: aload 0
      // 1d4: invokevirtual oxxxde/حق.getSetting ()Lkotakbaz/rain/module/setting/Setting;
      // 1d7: checkcast kotakbaz/rain/module/setting/ModeSetting
      // 1da: invokevirtual kotakbaz/rain/module/setting/ModeSetting.getDisplayValue ()Ljava/lang/String;
      // 1dd: astore 19
      // 1df: fload 13
      // 1e1: ldc_w 0.58
      // 1e4: fmul
      // 1e5: fstore 20
      // 1e7: aload 0
      // 1e8: invokevirtual oxxxde/حق.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 1eb: aload 19
      // 1ed: fload 20
      // 1ef: fconst_0
      // 1f0: bipush 4
      // 1f1: aconst_null
      // 1f2: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 1f5: fstore 21
      // 1f7: aload 0
      // 1f8: invokevirtual oxxxde/حق.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 1fb: aload 0
      // 1fc: invokevirtual oxxxde/حق.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 1ff: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 202: astore 18
      // 204: aload 0
      // 205: invokevirtual oxxxde/حق.getPadding ()F
      // 208: pop
      // 209: aload 18
      // 20b: aload 19
      // 20d: fload 10
      // 20f: fload 12
      // 211: ldc_w 2.0
      // 214: fdiv
      // 215: fadd
      // 216: fload 21
      // 218: ldc_w 2.0
      // 21b: fdiv
      // 21c: fsub
      // 21d: fload 16
      // 21f: ldc_w 3.8
      // 222: fadd
      // 223: fload 20
      // 225: aload 8
      // 227: fconst_0
      // 228: fconst_0
      // 229: fconst_0
      // 22a: bipush 0
      // 22b: fconst_0
      // 22c: sipush 992
      // 22f: aconst_null
      // 230: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 233: fload 4
      // 235: ldc_w 0.01
      // 238: fcmpl
      // 239: ifgt 23d
      // 23c: return
      // 23d: aload 0
      // 23e: invokevirtual oxxxde/حق.getPadding ()F
      // 241: fstore 37
      // 243: fload 12
      // 245: fload 37
      // 247: fsub
      // 248: fconst_0
      // 249: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 24c: fstore 36
      // 24e: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 251: invokevirtual oxxxde/ذر.getBASIC_RECT ()Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 254: aload 0
      // 255: invokevirtual oxxxde/حق.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 258: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 25b: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 25e: aload 0
      // 25f: ldc 0.05
      // 261: ldc_w 0.12
      // 264: invokevirtual oxxxde/حق.alphaByState (FF)F
      // 267: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 26a: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 26d: ldc_w 0.5
      // 270: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 273: aload 0
      // 274: invokevirtual oxxxde/حق.getPadding ()F
      // 277: fstore 37
      // 279: fload 10
      // 27b: fload 37
      // 27d: ldc_w 0.5
      // 280: fmul
      // 281: fadd
      // 282: fload 11
      // 284: ldc_w 10.0
      // 287: fadd
      // 288: fload 36
      // 28a: ldc_w 1.5
      // 28d: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.draw (FFFF)V
      // 290: fload 11
      // 292: fload 13
      // 294: fadd
      // 295: ldc_w 2.0
      // 298: fadd
      // 299: fstore 22
      // 29b: aload 0
      // 29c: invokevirtual oxxxde/حق.getSetting ()Lkotakbaz/rain/module/setting/Setting;
      // 29f: checkcast kotakbaz/rain/module/setting/ModeSetting
      // 2a2: invokevirtual kotakbaz/rain/module/setting/ModeSetting.getModes ()Ljava/util/List;
      // 2a5: checkcast java/lang/Iterable
      // 2a8: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 2ad: astore 23
      // 2af: aload 23
      // 2b1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2b6: ifeq 472
      // 2b9: aload 23
      // 2bb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2c0: checkcast java/lang/String
      // 2c3: astore 24
      // 2c5: aload 0
      // 2c6: invokevirtual oxxxde/حق.getSetting ()Lkotakbaz/rain/module/setting/Setting;
      // 2c9: checkcast kotakbaz/rain/module/setting/ModeSetting
      // 2cc: aload 24
      // 2ce: invokevirtual kotakbaz/rain/module/setting/ModeSetting.displayNameFor (Ljava/lang/String;)Ljava/lang/String;
      // 2d1: astore 25
      // 2d3: aload 0
      // 2d4: getfield oxxxde/حق.optionAnims Ljava/util/HashMap;
      // 2d7: checkcast java/util/Map
      // 2da: aload 24
      // 2dc: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2e1: checkcast kotakbaz/rain/client/util/animations/AnimationUtil
      // 2e4: astore 26
      // 2e6: aload 24
      // 2e8: aload 0
      // 2e9: invokevirtual oxxxde/حق.getSetting ()Lkotakbaz/rain/module/setting/Setting;
      // 2ec: checkcast kotakbaz/rain/module/setting/ModeSetting
      // 2ef: invokevirtual kotakbaz/rain/module/setting/ModeSetting.getValue ()Ljava/lang/Object;
      // 2f2: checkcast java/lang/String
      // 2f5: bipush 1
      // 2f6: invokestatic kotlin/text/StringsKt__StringsJVMKt.equals (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 2f9: ifeq 302
      // 2fc: fconst_1
      // 2fd: fstore 27
      // 2ff: goto 305
      // 302: fconst_0
      // 303: fstore 27
      // 305: aload 26
      // 307: fload 27
      // 309: aload 0
      // 30a: getfield oxxxde/حق.optionDuration F
      // 30d: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 310: astore 33
      // 312: new oxxxde/جئ
      // 315: dup
      // 316: aload 33
      // 318: invokespecial oxxxde/جئ.<init> (Loxxxde/بف;)V
      // 31b: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 31e: fstore 27
      // 320: iload 1
      // 321: i2f
      // 322: fload 10
      // 324: ldc_w 2.0
      // 327: fadd
      // 328: fcmpg
      // 329: iflt 356
      // 32c: iload 1
      // 32d: i2f
      // 32e: fload 10
      // 330: fload 12
      // 332: fadd
      // 333: ldc_w 2.0
      // 336: fsub
      // 337: fcmpl
      // 338: ifgt 356
      // 33b: iload 2
      // 33c: i2f
      // 33d: fload 22
      // 33f: fcmpg
      // 340: iflt 356
      // 343: iload 2
      // 344: i2f
      // 345: fload 22
      // 347: aload 0
      // 348: getfield oxxxde/حق.optionHeight F
      // 34b: fadd
      // 34c: fcmpl
      // 34d: ifgt 356
      // 350: fconst_1
      // 351: fstore 28
      // 353: goto 359
      // 356: fconst_0
      // 357: fstore 28
      // 359: aload 0
      // 35a: getfield oxxxde/حق.optionHoverAnims Ljava/util/HashMap;
      // 35d: checkcast java/util/Map
      // 360: aload 24
      // 362: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 367: checkcast kotakbaz/rain/client/util/animations/AnimationUtil
      // 36a: astore 26
      // 36c: aload 26
      // 36e: fload 28
      // 370: ldc 170.0
      // 372: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 375: astore 33
      // 377: new oxxxde/ثم
      // 37a: dup
      // 37b: aload 33
      // 37d: invokespecial oxxxde/ثم.<init> (Loxxxde/بف;)V
      // 380: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 383: fstore 28
      // 385: fload 28
      // 387: fconst_0
      // 388: ldc 1.0
      // 38a: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 38d: fstore 29
      // 38f: aload 0
      // 390: ldc_w 0.26
      // 393: ldc_w 0.62
      // 396: invokevirtual oxxxde/حق.alphaByState (FF)F
      // 399: fstore 30
      // 39b: aload 0
      // 39c: ldc_w 0.4
      // 39f: ldc_w 0.9
      // 3a2: invokevirtual oxxxde/حق.alphaByState (FF)F
      // 3a5: fstore 31
      // 3a7: fload 27
      // 3a9: fload 29
      // 3ab: ldc_w 0.72
      // 3ae: fmul
      // 3af: invokestatic java/lang/Math.max (FF)F
      // 3b2: fstore 32
      // 3b4: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 3b7: fload 30
      // 3b9: fload 31
      // 3bb: fload 32
      // 3bd: fmul
      // 3be: fadd
      // 3bf: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 3c2: astore 34
      // 3c4: aload 0
      // 3c5: getfield oxxxde/حق.iconRightOffsetExtra F
      // 3c8: fstore 36
      // 3ca: aload 0
      // 3cb: invokevirtual oxxxde/حق.getPadding ()F
      // 3ce: fstore 37
      // 3d0: aload 0
      // 3d1: invokevirtual oxxxde/حق.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 3d4: aload 0
      // 3d5: invokevirtual oxxxde/حق.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 3d8: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 3db: astore 18
      // 3dd: aload 0
      // 3de: getfield oxxxde/حق.optionTextLeftPadding F
      // 3e1: fstore 38
      // 3e3: aload 0
      // 3e4: getfield oxxxde/حق.optionTextSize F
      // 3e7: fstore 20
      // 3e9: aload 18
      // 3eb: aload 25
      // 3ed: fload 10
      // 3ef: fload 38
      // 3f1: fadd
      // 3f2: fload 32
      // 3f4: ldc_w 2.0
      // 3f7: fmul
      // 3f8: fadd
      // 3f9: fload 22
      // 3fb: ldc_w 2.0
      // 3fe: fadd
      // 3ff: fload 20
      // 401: aload 34
      // 403: fconst_0
      // 404: fconst_0
      // 405: fconst_0
      // 406: bipush 0
      // 407: fconst_0
      // 408: sipush 992
      // 40b: aconst_null
      // 40c: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 40f: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 412: invokevirtual oxxxde/رَ.getICON ()Lkotakbaz/rain/client/util/render/font/Font;
      // 415: aload 0
      // 416: invokevirtual oxxxde/حق.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 419: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 41c: astore 18
      // 41e: aload 0
      // 41f: getfield oxxxde/حق.optionTextSize F
      // 422: fstore 20
      // 424: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 427: fload 30
      // 429: fload 27
      // 42b: fmul
      // 42c: invokevirtual oxxxde/ثْ.icon (F)Ljava/awt/Color;
      // 42f: astore 34
      // 431: aload 18
      // 433: ldc_w "h"
      // 436: fload 10
      // 438: fload 12
      // 43a: fadd
      // 43b: ldc_w 2.0
      // 43e: fadd
      // 43f: fload 36
      // 441: fsub
      // 442: fload 37
      // 444: fsub
      // 445: fload 27
      // 447: ldc_w 2.0
      // 44a: fmul
      // 44b: fsub
      // 44c: fload 22
      // 44e: ldc 3.0
      // 450: fadd
      // 451: fload 20
      // 453: aload 34
      // 455: fconst_0
      // 456: fconst_0
      // 457: fconst_0
      // 458: bipush 0
      // 459: fconst_0
      // 45a: sipush 992
      // 45d: aconst_null
      // 45e: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 461: fload 22
      // 463: aload 0
      // 464: getfield oxxxde/حق.optionHeight F
      // 467: aload 0
      // 468: getfield oxxxde/حق.optionGap F
      // 46b: fadd
      // 46c: fadd
      // 46d: fstore 22
      // 46f: goto 2af
      // 472: return
   }

   private fun selectorRect(openProgress: Float): Vector4f {
      val selectorHeight: Float = this.baseHeight * 0.7F
      val currentModeWidth: Float = Font.getWidth$default(
         this.getDefaultFont(), (this.getSetting() as ModeSetting).displayValue, this.baseHeight * 0.7F * 0.58F, 0.0F, 4, null
      )
      val closedTargetWidth: java.util.Iterator = (this.getSetting() as ModeSetting).modes.iterator()
      val var10000: java.lang.Float
      if (!closedTargetWidth.hasNext()) {
         var10000 = null
      } else {
         var var20: Float = Font.getWidth$default(
            this.getDefaultFont(), this.getSetting().displayNameFor(closedTargetWidth.next() as java.lang.String), this.optionTextSize, 0.0F, 4, null
         )

         while (closedTargetWidth.hasNext()) {
            var20 = Math.max(
               var20,
               Font.getWidth$default(
                  this.getDefaultFont(), this.getSetting().displayNameFor(closedTargetWidth.next() as java.lang.String), this.optionTextSize, 0.0F, 4, null
               )
            )
         }

         var10000 = var20
      }

      val longestModeWidth: Float = var10000 ?: 0.0F
      val iconWidth: Float = Font.getWidth$default(رَ.INSTANCE.ICON, "h", this.optionTextSize, 0.0F, 4, null)
      val iconRightOffset: Float = this.iconRightOffsetExtra + this.getPadding()
      val var19: Float = currentModeWidth + this.getPadding() * 2.0F
      val var24: Float = var19
         + (this.optionTextLeftPadding + longestModeWidth + this.optionTextToIconGap + iconWidth + iconRightOffset - var19) * openProgress
         val var25: Float = this.baseHeight * 0.42F
      val titleWidth: Float = Font.getWidth$default(this.getDefaultFont(), this.getSetting().getName(), var25, 0.0F, 4, null)
      val hardMax: Float = RangesKt.coerceAtLeast(this.getWidth() - this.getPadding() * 2.0F, 0.0F)
      val closedWidth: Float = RangesKt.coerceAtMost(var19, hardMax)
      val selectorWidth: Float = if (openProgress <= 0.001F)
         closedWidth
         else
         RangesKt.coerceIn(
            var24, closedWidth, RangesKt.coerceAtLeast(Math.min(hardMax, this.getWidth() - (this.getPadding() * 3.0F + titleWidth + 6.0F)), closedWidth)
         )
         return Vector4f(
         this.getX() + this.getWidth() - this.getPadding() - selectorWidth,
         this.calcMidY(this.getY(), this.baseHeight, selectorHeight),
         selectorWidth,
         selectorHeight
      )
   }

   public open val componentHeight: Float
      public open get() {
         return this.baseHeight
            + (
                  RangesKt.coerceAtLeast((float)(this.getSetting() as ModeSetting).modes.size() * (this.optionHeight + this.optionGap) - this.optionGap, 0.0F)
                     + 4.0F
               )
               * this.openProgress()
            }


   init {
      this.optionHeight = 11.0F
      this.optionGap = 2.0F
      this.optionTextSize = 5.8F
      this.optionTextLeftPadding = 5.0F
      this.optionTextToIconGap = 4.0F
      this.iconRightOffsetExtra = 5.0F
      this.openDuration = 320.0F
      this.optionDuration = 240.0F
      this.openAnim = AnimationUtil(0.0F, 1, null)
      this.optionAnims = HashMap<>()
      this.optionHoverAnims = HashMap<>()
      this.selectorHoverAnim = AnimationUtil(0.0F, 1, null)
   }

   @Compile
   public override fun onMouseClick(mouseX: Int, mouseY: Int, button: Int) {
      super.onMouseClick(mouseX, mouseY, button)
      if (!this.hovered(mouseX, mouseY)) {
         this.open = false
      } else if (button != 2) {
         val var5: Vector4f = this.selectorRect(this.openProgress())
         if (mouseX >= var5.x && mouseX <= var5.x + var5.z && mouseY >= var5.y && mouseY <= var5.y + var5.w) {
            this.open ^= true
         } else if (this.open) {
            var var6: Float = var5.y + var5.w + 2.0F

            for (var8 in (this.getSetting() as ModeSetting).modes) {
               if (mouseX >= var5.x + 2.0F && mouseX <= var5.x + var5.z - 2.0F && mouseY >= var6 && mouseY <= var6 + this.optionHeight) {
                  this.getSetting().setMode(var8)
                  return
               }

               var6 += this.optionHeight + this.optionGap
            }

            this.open = false
         }
      }
   }

   private fun openProgress(): Float {
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
      // 00: aload 0
      // 01: getfield oxxxde/حق.openAnim Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 04: aload 0
      // 05: getfield oxxxde/حق.open Z
      // 08: ifeq 10
      // 0b: fconst_1
      // 0c: nop
      // 0d: goto 12
      // 10: fconst_0
      // 11: nop
      // 12: aload 0
      // 13: getfield oxxxde/حق.openDuration F
      // 16: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 19: astore 1
      // 1a: new oxxxde/طط
      // 1d: dup
      // 1e: aload 1
      // 1f: invokespecial oxxxde/طط.<init> (Loxxxde/بف;)V
      // 22: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 25: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 28: freturn
   }
}
