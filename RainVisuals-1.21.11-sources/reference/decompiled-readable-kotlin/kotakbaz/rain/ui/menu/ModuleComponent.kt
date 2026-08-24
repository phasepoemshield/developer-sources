package kotakbaz.rain.ui.menu

import java.awt.Color
import java.util.ArrayList
import java.util.Arrays
import kotakbaz.rain.client.util.animations.AnimationUtil
import kotakbaz.rain.client.util.other.KeyMappings
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import kotakbaz.rain.client.util.render.font.Font
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.Setting
import kotakbaz.rain.ui.api.PipelinedRender
import kotakbaz.rain.ui.menu.settings.ModuleSettingComponent
import oxxxde.آ
import oxxxde.اظ
import oxxxde.ثس
import oxxxde.ثْ
import oxxxde.دِ
import oxxxde.ذر
import oxxxde.شر
import oxxxde.صؤ

// $VF: Compiled from heavy
public class ModuleComponent(module: دِ) : اظ, PipelinedRender {
   private final val settingComponents: List<آ<*>>
   private AnimationUtil bindWidthAnim;
   private AnimationUtil bindMenuAnim;
   private AnimationUtil hoverAnimation;
   private final var viewportTop: Float
   private AnimationUtil openAnim;
   private final var viewportBottom: Float
   private final var expanded: Boolean
   private final var bindMenuOpen: Boolean
   private final var expandedBeforeBindMenu: Boolean
   private Module module;
   private final val headerHeight: Float
   private AnimationUtil enableAnimation;
   private ModuleComponent.LayoutSnapshot preparedLayout;
   private final val settingGap: Float

   private fun renderBindMenu(progress: Float) {
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
      // 000: fconst_1
      // 001: nop
      // 002: fload 1
      // 003: fsub
      // 004: ldc 4.0
      // 006: fmul
      // 007: fstore 2
      // 008: aload 0
      // 009: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 00c: ldc 1.15
      // 00e: fmul
      // 00f: fstore 3
      // 010: aload 0
      // 011: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getX ()F
      // 014: fload 3
      // 015: fadd
      // 016: fstore 4
      // 018: aload 0
      // 019: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getY ()F
      // 01c: aload 0
      // 01d: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 020: ldc 0.75
      // 022: fmul
      // 023: fadd
      // 024: fload 2
      // 025: fadd
      // 026: fstore 5
      // 028: aload 0
      // 029: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getWidth ()F
      // 02c: fload 3
      // 02d: fconst_2
      // 02e: nop
      // 02f: fmul
      // 030: fsub
      // 031: fconst_0
      // 032: nop
      // 033: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 036: fstore 6
      // 038: aload 0
      // 039: getfield kotakbaz/rain/ui/menu/ModuleComponent.headerHeight F
      // 03c: aload 0
      // 03d: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 040: ldc 1.4
      // 042: fmul
      // 043: fsub
      // 044: fconst_0
      // 045: nop
      // 046: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 049: fstore 7
      // 04b: fload 6
      // 04d: fconst_0
      // 04e: nop
      // 04f: fcmpg
      // 050: ifle 05b
      // 053: fload 7
      // 055: fconst_0
      // 056: nop
      // 057: fcmpg
      // 058: ifgt 05c
      // 05b: return
      // 05c: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 05f: ldc 0.04
      // 061: aload 0
      // 062: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getAlpha ()F
      // 065: fmul
      // 066: fload 1
      // 067: fmul
      // 068: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 06b: astore 8
      // 06d: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 070: ldc 0.08
      // 072: aload 0
      // 073: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getAlpha ()F
      // 076: fmul
      // 077: fload 1
      // 078: fmul
      // 079: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 07c: astore 9
      // 07e: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 081: ldc 0.78
      // 083: aload 0
      // 084: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getAlpha ()F
      // 087: fmul
      // 088: fload 1
      // 089: fmul
      // 08a: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 08d: astore 10
      // 08f: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 092: ldc 0.92
      // 094: aload 0
      // 095: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getAlpha ()F
      // 098: fmul
      // 099: fload 1
      // 09a: fmul
      // 09b: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 09e: astore 11
      // 0a0: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0a3: ldc 0.03
      // 0a5: aload 0
      // 0a6: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getAlpha ()F
      // 0a9: fmul
      // 0aa: fload 1
      // 0ab: fmul
      // 0ac: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 0af: astore 12
      // 0b1: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0b4: ldc 0.28
      // 0b6: aload 0
      // 0b7: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getAlpha ()F
      // 0ba: fmul
      // 0bb: fload 1
      // 0bc: fmul
      // 0bd: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 0c0: astore 13
      // 0c2: ldc 7.0
      // 0c4: fstore 14
      // 0c6: ldc 6.8
      // 0c8: fstore 15
      // 0ca: ldc 4.8
      // 0cc: fstore 16
      // 0ce: ldc 2.1
      // 0d0: fstore 17
      // 0d2: ldc 3.2
      // 0d4: fstore 18
      // 0d6: ldc "Bind:"
      // 0d8: astore 19
      // 0da: getstatic kotakbaz/rain/client/util/other/KeyMappings.INSTANCE Lkotakbaz/rain/client/util/other/KeyMappings;
      // 0dd: aload 0
      // 0de: getfield kotakbaz/rain/ui/menu/ModuleComponent.module Lkotakbaz/rain/module/Module;
      // 0e1: invokevirtual kotakbaz/rain/module/Module.getKey ()I
      // 0e4: invokevirtual kotakbaz/rain/client/util/other/KeyMappings.getKey (I)Ljava/lang/String;
      // 0e7: astore 20
      // 0e9: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0ec: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0ef: aload 0
      // 0f0: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 0f3: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0f6: aload 8
      // 0f8: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 0fb: ldc 3.2
      // 0fd: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 100: ldc 0.95
      // 102: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.mix (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 105: fconst_1
      // 106: nop
      // 107: aload 9
      // 109: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 10c: fload 4
      // 10e: fload 5
      // 110: fload 6
      // 112: fload 7
      // 114: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.draw (FFFF)V
      // 117: aload 0
      // 118: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 11b: fload 15
      // 11d: invokevirtual kotakbaz/rain/client/util/render/font/Font.getHeight (F)F
      // 120: fload 17
      // 122: fadd
      // 123: fload 18
      // 125: fadd
      // 126: ldc 11.0
      // 128: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 12b: fstore 21
      // 12d: fload 5
      // 12f: fload 7
      // 131: fload 21
      // 133: fsub
      // 134: ldc 0.5
      // 136: fmul
      // 137: fadd
      // 138: fstore 22
      // 13a: aload 0
      // 13b: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 13e: aload 19
      // 140: fload 14
      // 142: fconst_0
      // 143: nop
      // 144: bipush 4
      // 145: nop
      // 146: aconst_null
      // 147: nop
      // 148: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 14b: fstore 23
      // 14d: fload 22
      // 14f: fload 21
      // 151: aload 0
      // 152: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 155: fload 14
      // 157: invokevirtual kotakbaz/rain/client/util/render/font/Font.getHeight (F)F
      // 15a: fsub
      // 15b: ldc 0.5
      // 15d: fmul
      // 15e: fadd
      // 15f: fstore 24
      // 161: aload 0
      // 162: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 165: aload 20
      // 167: fload 15
      // 169: fconst_0
      // 16a: nop
      // 16b: bipush 4
      // 16c: nop
      // 16d: aconst_null
      // 16e: nop
      // 16f: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 172: fstore 25
      // 174: ldc 18.0
      // 176: fstore 26
      // 178: ldc 5.0
      // 17a: fstore 27
      // 17c: fconst_2
      // 17d: nop
      // 17e: fstore 28
      // 180: fload 4
      // 182: fload 27
      // 184: fadd
      // 185: fstore 29
      // 187: fload 4
      // 189: fload 6
      // 18b: fadd
      // 18c: fload 27
      // 18e: fsub
      // 18f: fstore 30
      // 191: fload 29
      // 193: fstore 31
      // 195: fload 30
      // 197: fload 31
      // 199: fsub
      // 19a: fload 23
      // 19c: fsub
      // 19d: fload 28
      // 19f: fsub
      // 1a0: fconst_0
      // 1a1: nop
      // 1a2: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 1a5: fstore 32
      // 1a7: fload 32
      // 1a9: fconst_0
      // 1aa: nop
      // 1ab: fcmpg
      // 1ac: ifgt 1b0
      // 1af: return
      // 1b0: fload 26
      // 1b2: fload 32
      // 1b4: invokestatic kotlin/ranges/RangesKt.coerceAtMost (FF)F
      // 1b7: fstore 33
      // 1b9: fload 25
      // 1bb: fload 16
      // 1bd: fconst_2
      // 1be: nop
      // 1bf: fmul
      // 1c0: fadd
      // 1c1: fload 33
      // 1c3: fload 32
      // 1c5: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 1c8: fstore 34
      // 1ca: aload 0
      // 1cb: getfield kotakbaz/rain/ui/menu/ModuleComponent.bindWidthAnim Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 1ce: fload 34
      // 1d0: ldc_w 170.0
      // 1d3: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 1d6: astore 36
      // 1d8: new oxxxde/ؤ
      // 1db: dup
      // 1dc: aload 36
      // 1de: invokespecial oxxxde/ؤ.<init> (Loxxxde/بف;)V
      // 1e1: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 1e4: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 1e7: fload 33
      // 1e9: fload 32
      // 1eb: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 1ee: fstore 35
      // 1f0: fload 30
      // 1f2: fload 35
      // 1f4: fsub
      // 1f5: fstore 36
      // 1f7: fload 22
      // 1f9: fstore 37
      // 1fb: aload 0
      // 1fc: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 1ff: aload 0
      // 200: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 203: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 206: aload 19
      // 208: fload 31
      // 20a: fload 24
      // 20c: fload 14
      // 20e: aload 10
      // 210: fconst_0
      // 211: nop
      // 212: fconst_0
      // 213: nop
      // 214: fconst_0
      // 215: nop
      // 216: bipush 0
      // 217: nop
      // 218: fconst_0
      // 219: nop
      // 21a: sipush 992
      // 21d: aconst_null
      // 21e: nop
      // 21f: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 222: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 225: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 228: aload 0
      // 229: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 22c: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 22f: aload 12
      // 231: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 234: ldc_w 3.0
      // 237: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 23a: ldc 0.95
      // 23c: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.mix (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 23f: fconst_1
      // 240: nop
      // 241: aload 13
      // 243: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 246: fload 36
      // 248: fload 37
      // 24a: fload 35
      // 24c: fload 21
      // 24e: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.draw (FFFF)V
      // 251: fload 36
      // 253: fload 35
      // 255: fload 25
      // 257: fsub
      // 258: ldc 0.5
      // 25a: fmul
      // 25b: fadd
      // 25c: fstore 38
      // 25e: fload 37
      // 260: fload 17
      // 262: fadd
      // 263: fstore 39
      // 265: aload 0
      // 266: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 269: aload 0
      // 26a: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 26d: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 270: aload 20
      // 272: fload 38
      // 274: fload 39
      // 276: fload 15
      // 278: aload 11
      // 27a: fconst_0
      // 27b: nop
      // 27c: fconst_0
      // 27d: nop
      // 27e: fconst_0
      // 27f: nop
      // 280: bipush 0
      // 281: nop
      // 282: fconst_0
      // 283: nop
      // 284: sipush 992
      // 287: aconst_null
      // 288: nop
      // 289: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 28c: return
   }

   public final val module: دِ

   public fun setViewport(top: Float, bottom: Float) {
      this.viewportTop = top
      this.viewportBottom = bottom
   }

   public override fun iconsPipeline(): صؤ {
      return ClientRenderPipeline.GUI_SPECIAL
   }

   private fun calculateLayout(): شر {
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
      // 000: aload 0
      // 001: getfield kotakbaz/rain/ui/menu/ModuleComponent.openAnim Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 004: aload 0
      // 005: getfield kotakbaz/rain/ui/menu/ModuleComponent.expanded Z
      // 008: ifeq 010
      // 00b: fconst_1
      // 00c: nop
      // 00d: goto 012
      // 010: fconst_0
      // 011: nop
      // 012: ldc_w 250.0
      // 015: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 018: astore 2
      // 019: new oxxxde/ضح
      // 01c: dup
      // 01d: aload 2
      // 01e: nop
      // 01f: invokespecial oxxxde/ضح.<init> (Loxxxde/بف;)V
      // 022: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 025: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 028: fstore 1
      // 029: aload 0
      // 02a: getfield kotakbaz/rain/ui/menu/ModuleComponent.bindMenuAnim Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 02d: aload 0
      // 02e: getfield kotakbaz/rain/ui/menu/ModuleComponent.bindMenuOpen Z
      // 031: ifeq 039
      // 034: fconst_1
      // 035: nop
      // 036: goto 03b
      // 039: fconst_0
      // 03a: nop
      // 03b: ldc_w 240.0
      // 03e: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 041: astore 3
      // 042: new oxxxde/تج
      // 045: dup
      // 046: aload 3
      // 047: nop
      // 048: invokespecial oxxxde/تج.<init> (Loxxxde/بف;)V
      // 04b: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 04e: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 051: fstore 2
      // 052: fconst_1
      // 053: nop
      // 054: fload 2
      // 055: fsub
      // 056: fconst_0
      // 057: nop
      // 058: fconst_1
      // 059: nop
      // 05a: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 05d: fstore 3
      // 05e: fload 1
      // 05f: fload 3
      // 060: fmul
      // 061: fstore 4
      // 063: aload 0
      // 064: getfield kotakbaz/rain/ui/menu/ModuleComponent.settingComponents Ljava/util/List;
      // 067: invokeinterface java/util/List.size ()I 1
      // 06c: newarray 6
      // 06e: astore 5
      // 070: aload 0
      // 071: getfield kotakbaz/rain/ui/menu/ModuleComponent.settingComponents Ljava/util/List;
      // 074: invokeinterface java/util/List.size ()I 1
      // 079: newarray 6
      // 07b: astore 6
      // 07d: fconst_0
      // 07e: nop
      // 07f: fstore 7
      // 081: bipush 0
      // 082: nop
      // 083: istore 8
      // 085: aload 0
      // 086: getfield kotakbaz/rain/ui/menu/ModuleComponent.settingComponents Ljava/util/List;
      // 089: checkcast java/lang/Iterable
      // 08c: astore 9
      // 08e: bipush 0
      // 08f: nop
      // 090: istore 10
      // 092: bipush 0
      // 093: nop
      // 094: istore 11
      // 096: aload 9
      // 098: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 09d: astore 12
      // 09f: aload 12
      // 0a1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a6: ifeq 11f
      // 0a9: aload 12
      // 0ab: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b0: astore 13
      // 0b2: iload 11
      // 0b4: iinc 11 1
      // 0b7: istore 14
      // 0b9: iload 14
      // 0bb: ifge 0c1
      // 0be: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
      // 0c1: iload 14
      // 0c3: aload 13
      // 0c5: checkcast kotakbaz/rain/ui/menu/settings/ModuleSettingComponent
      // 0c8: astore 15
      // 0ca: istore 16
      // 0cc: bipush 0
      // 0cd: nop
      // 0ce: istore 17
      // 0d0: aload 15
      // 0d2: fconst_0
      // 0d3: nop
      // 0d4: bipush 1
      // 0d5: nop
      // 0d6: aconst_null
      // 0d7: nop
      // 0d8: invokestatic kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.visibleProgress$default (Lkotakbaz/rain/ui/menu/settings/ModuleSettingComponent;FILjava/lang/Object;)F
      // 0db: fstore 18
      // 0dd: aload 15
      // 0df: invokevirtual kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.getComponentHeight ()F
      // 0e2: fstore 19
      // 0e4: aload 5
      // 0e6: iload 16
      // 0e8: fload 18
      // 0ea: fastore
      // 0eb: aload 6
      // 0ed: iload 16
      // 0ef: fload 19
      // 0f1: fastore
      // 0f2: fload 18
      // 0f4: ldc_w 0.001
      // 0f7: fcmpg
      // 0f8: ifle 11b
      // 0fb: iload 8
      // 0fd: ifeq 10c
      // 100: fload 7
      // 102: aload 0
      // 103: getfield kotakbaz/rain/ui/menu/ModuleComponent.settingGap F
      // 106: fload 18
      // 108: fmul
      // 109: fadd
      // 10a: fstore 7
      // 10c: fload 7
      // 10e: fload 19
      // 110: fload 18
      // 112: fmul
      // 113: fadd
      // 114: fstore 7
      // 116: bipush 1
      // 117: nop
      // 118: istore 8
      // 11a: nop
      // 11b: nop
      // 11c: goto 09f
      // 11f: nop
      // 120: fload 7
      // 122: fconst_0
      // 123: nop
      // 124: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 127: fstore 9
      // 129: aload 0
      // 12a: getfield kotakbaz/rain/ui/menu/ModuleComponent.headerHeight F
      // 12d: fload 9
      // 12f: ldc_w 0.001
      // 132: fcmpl
      // 133: ifle 143
      // 136: aload 0
      // 137: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 13a: fload 9
      // 13c: fadd
      // 13d: fload 4
      // 13f: fmul
      // 140: goto 145
      // 143: fconst_0
      // 144: nop
      // 145: fadd
      // 146: fstore 10
      // 148: new kotakbaz/rain/ui/menu/ModuleComponent$LayoutSnapshot
      // 14b: dup
      // 14c: fload 2
      // 14d: fload 3
      // 14e: fload 4
      // 150: fload 9
      // 152: fload 10
      // 154: aload 5
      // 156: aload 6
      // 158: invokespecial kotakbaz/rain/ui/menu/ModuleComponent$LayoutSnapshot.<init> (FFFFF[F[F)V
      // 15b: areturn
   }

   public override fun textPipeline(): صؤ {
      return ClientRenderPipeline.GUI_TEXT
   }

   private fun openBindMenu() {
      if (!this.bindMenuOpen) {
         this.expandedBeforeBindMenu = this.expanded
         this.bindMenuOpen = true
         this.expanded = false
      }
   }

   public override fun onMouseRelease(mouseX: Int, mouseY: Int, button: Int) {
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
      // 01: iload 1
      // 02: iload 2
      // 03: nop
      // 04: iload 3
      // 05: nop
      // 06: invokespecial oxxxde/اظ.onMouseRelease (III)V
      // 09: aload 0
      // 0a: getfield kotakbaz/rain/ui/menu/ModuleComponent.bindMenuAnim Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 0d: aload 0
      // 0e: getfield kotakbaz/rain/ui/menu/ModuleComponent.bindMenuOpen Z
      // 11: ifeq 19
      // 14: fconst_1
      // 15: nop
      // 16: goto 1b
      // 19: fconst_0
      // 1a: nop
      // 1b: ldc_w 240.0
      // 1e: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 21: astore 4
      // 23: new oxxxde/اخ
      // 26: dup
      // 27: aload 4
      // 29: invokespecial oxxxde/اخ.<init> (Loxxxde/بف;)V
      // 2c: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 2f: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 32: ldc_w 0.05
      // 35: fcmpl
      // 36: ifle 3a
      // 39: return
      // 3a: aload 0
      // 3b: getfield kotakbaz/rain/ui/menu/ModuleComponent.openAnim Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 3e: aload 0
      // 3f: getfield kotakbaz/rain/ui/menu/ModuleComponent.expanded Z
      // 42: ifeq 4a
      // 45: fconst_1
      // 46: nop
      // 47: goto 4c
      // 4a: fconst_0
      // 4b: nop
      // 4c: ldc_w 250.0
      // 4f: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 52: astore 4
      // 54: new oxxxde/جف
      // 57: dup
      // 58: aload 4
      // 5a: invokespecial oxxxde/جف.<init> (Loxxxde/بف;)V
      // 5d: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 60: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 63: ldc_w 0.05
      // 66: fcmpg
      // 67: ifgt 6b
      // 6a: return
      // 6b: aload 0
      // 6c: getfield kotakbaz/rain/ui/menu/ModuleComponent.settingComponents Ljava/util/List;
      // 6f: checkcast java/lang/Iterable
      // 72: astore 4
      // 74: bipush 0
      // 75: nop
      // 76: istore 5
      // 78: aload 4
      // 7a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 7f: astore 6
      // 81: aload 6
      // 83: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 88: ifeq ad
      // 8b: aload 6
      // 8d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 92: astore 7
      // 94: aload 7
      // 96: checkcast kotakbaz/rain/ui/menu/settings/ModuleSettingComponent
      // 99: astore 8
      // 9b: bipush 0
      // 9c: nop
      // 9d: istore 9
      // 9f: aload 8
      // a1: iload 1
      // a2: iload 2
      // a3: nop
      // a4: iload 3
      // a5: nop
      // a6: invokevirtual kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.onMouseRelease (III)V
      // a9: nop
      // aa: goto 81
      // ad: nop
      // ae: return
   }

   public final val layoutHeight: Float
      public final get() {
         return if (this.preparedLayout != null) this.preparedLayout.moduleHeight else this.defaultHeight
      }


   init {
      this.module = module
      this.headerHeight = 33.0F
      this.settingGap = 4.0F
      this.openAnim = AnimationUtil(0.0F, 1, null)
      this.bindMenuAnim = AnimationUtil(0.0F, 1, null)
      this.bindWidthAnim = AnimationUtil(0.0F, 1, null)
      this.enableAnimation = AnimationUtil(if (this.module.isEnabled()) 1.0F else 0.0F)
      this.hoverAnimation = AnimationUtil(0.0F, 1, null)
      val `$this$mapNotNull$iv`: java.lang.Iterable = this.module.settings
      val var3: ثس = ثس.INSTANCE
      val `destination$iv$iv`: java.util.Collection = ArrayList()

      for (`element$iv$iv$iv` in `$this$mapNotNull$iv`) {
         val var10000: ModuleSettingComponent = var3.create(`element$iv$iv$iv` as Setting<*>)
         if (var10000 != null) {
            `destination$iv$iv`.add(var10000)
         }
      }

      this.settingComponents = `destination$iv$iv` as MutableList<ModuleSettingComponent<*>>
      this.viewportTop = java.lang.Float.NEGATIVE_INFINITY
      this.viewportBottom = java.lang.Float.POSITIVE_INFINITY
   }

   public override fun rectPipeline(): صؤ {
      return ClientRenderPipeline.GUI_RECT
   }

   public fun prepareLayout(): Float {
      val snapshot: ModuleComponent.LayoutSnapshot = this.calculateLayout()
      this.preparedLayout = snapshot
      return snapshot.moduleHeight
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
      // 000: aload 0
      // 001: iload 1
      // 002: iload 2
      // 003: nop
      // 004: fload 3
      // 005: invokespecial oxxxde/اظ.render (IIF)V
      // 008: aload 0
      // 009: getfield kotakbaz/rain/ui/menu/ModuleComponent.preparedLayout Lkotakbaz/rain/ui/menu/ModuleComponent$LayoutSnapshot;
      // 00c: dup
      // 00d: ifnonnull 015
      // 010: pop
      // 011: aload 0
      // 012: invokespecial kotakbaz/rain/ui/menu/ModuleComponent.calculateLayout ()Lkotakbaz/rain/ui/menu/ModuleComponent$LayoutSnapshot;
      // 015: astore 4
      // 017: aload 4
      // 019: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent$LayoutSnapshot.getBindProgress ()F
      // 01c: fstore 5
      // 01e: aload 4
      // 020: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent$LayoutSnapshot.getContentVisibility ()F
      // 023: fstore 6
      // 025: aload 4
      // 027: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent$LayoutSnapshot.getEffectiveOpenProgress ()F
      // 02a: fstore 7
      // 02c: aload 0
      // 02d: getfield kotakbaz/rain/ui/menu/ModuleComponent.enableAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 030: aload 0
      // 031: getfield kotakbaz/rain/ui/menu/ModuleComponent.module Lkotakbaz/rain/module/Module;
      // 034: invokevirtual kotakbaz/rain/module/Module.isEnabled ()Z
      // 037: ifeq 03f
      // 03a: fconst_1
      // 03b: nop
      // 03c: goto 041
      // 03f: fconst_0
      // 040: nop
      // 041: ldc_w 220.0
      // 044: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 047: astore 9
      // 049: new oxxxde/صط
      // 04c: dup
      // 04d: aload 9
      // 04f: invokespecial oxxxde/صط.<init> (Loxxxde/بف;)V
      // 052: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 055: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 058: fstore 8
      // 05a: iload 1
      // 05b: i2f
      // 05c: aload 0
      // 05d: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getX ()F
      // 060: fcmpl
      // 061: iflt 093
      // 064: iload 1
      // 065: i2f
      // 066: aload 0
      // 067: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getX ()F
      // 06a: aload 0
      // 06b: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getWidth ()F
      // 06e: fadd
      // 06f: fcmpg
      // 070: ifgt 093
      // 073: iload 2
      // 074: nop
      // 075: i2f
      // 076: aload 0
      // 077: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getY ()F
      // 07a: fcmpl
      // 07b: iflt 093
      // 07e: iload 2
      // 07f: nop
      // 080: i2f
      // 081: aload 0
      // 082: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getY ()F
      // 085: aload 0
      // 086: getfield kotakbaz/rain/ui/menu/ModuleComponent.headerHeight F
      // 089: fadd
      // 08a: fcmpg
      // 08b: ifgt 093
      // 08e: bipush 1
      // 08f: nop
      // 090: goto 095
      // 093: bipush 0
      // 094: nop
      // 095: istore 9
      // 097: aload 0
      // 098: getfield kotakbaz/rain/ui/menu/ModuleComponent.hoverAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 09b: iload 9
      // 09d: ifeq 0a5
      // 0a0: fconst_1
      // 0a1: nop
      // 0a2: goto 0a7
      // 0a5: fconst_0
      // 0a6: nop
      // 0a7: ldc_w 180.0
      // 0aa: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 0ad: astore 11
      // 0af: new oxxxde/ظش
      // 0b2: dup
      // 0b3: aload 11
      // 0b5: invokespecial oxxxde/ظش.<init> (Loxxxde/بف;)V
      // 0b8: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 0bb: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 0be: fconst_0
      // 0bf: nop
      // 0c0: fconst_1
      // 0c1: nop
      // 0c2: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0c5: fstore 10
      // 0c7: aload 4
      // 0c9: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent$LayoutSnapshot.getSettingsHeight ()F
      // 0cc: fstore 11
      // 0ce: aload 4
      // 0d0: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent$LayoutSnapshot.getModuleHeight ()F
      // 0d3: fstore 12
      // 0d5: ldc 0.03
      // 0d7: ldc_w 0.020000001
      // 0da: fload 8
      // 0dc: fmul
      // 0dd: fadd
      // 0de: ldc_w 0.015
      // 0e1: fload 10
      // 0e3: fmul
      // 0e4: fadd
      // 0e5: fstore 13
      // 0e7: ldc_w 0.05
      // 0ea: ldc_w 0.029999997
      // 0ed: fload 8
      // 0ef: fmul
      // 0f0: fadd
      // 0f1: ldc 0.03
      // 0f3: fload 10
      // 0f5: fmul
      // 0f6: fadd
      // 0f7: fstore 14
      // 0f9: ldc_w 0.32
      // 0fc: ldc_w 0.68
      // 0ff: fload 8
      // 101: fmul
      // 102: fadd
      // 103: ldc_w 0.12
      // 106: fload 10
      // 108: fmul
      // 109: fconst_1
      // 10a: nop
      // 10b: fload 8
      // 10d: fsub
      // 10e: fmul
      // 10f: fadd
      // 110: fload 6
      // 112: fmul
      // 113: fstore 15
      // 115: ldc_w 0.16
      // 118: ldc_w 0.34
      // 11b: fload 8
      // 11d: fmul
      // 11e: fadd
      // 11f: ldc 0.08
      // 121: fload 10
      // 123: fmul
      // 124: fconst_1
      // 125: nop
      // 126: fload 8
      // 128: fsub
      // 129: fmul
      // 12a: fadd
      // 12b: fload 6
      // 12d: fmul
      // 12e: fstore 16
      // 130: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 133: fload 13
      // 135: aload 0
      // 136: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getAlpha ()F
      // 139: fmul
      // 13a: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 13d: astore 17
      // 13f: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 142: fload 14
      // 144: aload 0
      // 145: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getAlpha ()F
      // 148: fmul
      // 149: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 14c: astore 18
      // 14e: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 151: fload 15
      // 153: aload 0
      // 154: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getAlpha ()F
      // 157: fmul
      // 158: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 15b: astore 19
      // 15d: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 160: fload 16
      // 162: aload 0
      // 163: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getAlpha ()F
      // 166: fmul
      // 167: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 16a: astore 20
      // 16c: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 16f: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 172: aload 0
      // 173: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 176: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 179: aload 17
      // 17b: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 17e: ldc 4.0
      // 180: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 183: ldc 0.95
      // 185: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.mix (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 188: fconst_1
      // 189: nop
      // 18a: aload 18
      // 18c: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 18f: aload 0
      // 190: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getX ()F
      // 193: aload 0
      // 194: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getY ()F
      // 197: aload 0
      // 198: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getWidth ()F
      // 19b: fload 12
      // 19d: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.draw (FFFF)V
      // 1a0: ldc_w 8.0
      // 1a3: fstore 21
      // 1a5: ldc_w 5.6
      // 1a8: fstore 22
      // 1aa: aload 0
      // 1ab: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getX ()F
      // 1ae: aload 0
      // 1af: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 1b2: ldc_w 1.5
      // 1b5: fmul
      // 1b6: fadd
      // 1b7: fstore 23
      // 1b9: aload 0
      // 1ba: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getY ()F
      // 1bd: aload 0
      // 1be: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 1c1: ldc_w 1.5
      // 1c4: fmul
      // 1c5: fadd
      // 1c6: fstore 24
      // 1c8: fload 24
      // 1ca: aload 0
      // 1cb: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 1ce: fload 21
      // 1d0: invokevirtual kotakbaz/rain/client/util/render/font/Font.getHeight (F)F
      // 1d3: fadd
      // 1d4: aload 0
      // 1d5: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 1d8: ldc_w 1.5
      // 1db: fdiv
      // 1dc: fadd
      // 1dd: fstore 25
      // 1df: aload 0
      // 1e0: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 1e3: aload 0
      // 1e4: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 1e7: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 1ea: aload 0
      // 1eb: getfield kotakbaz/rain/ui/menu/ModuleComponent.module Lkotakbaz/rain/module/Module;
      // 1ee: invokevirtual kotakbaz/rain/module/Module.getName ()Ljava/lang/String;
      // 1f1: fload 23
      // 1f3: fload 24
      // 1f5: fload 21
      // 1f7: aload 19
      // 1f9: fconst_0
      // 1fa: nop
      // 1fb: fconst_0
      // 1fc: nop
      // 1fd: fconst_0
      // 1fe: nop
      // 1ff: bipush 0
      // 200: nop
      // 201: fconst_0
      // 202: nop
      // 203: sipush 992
      // 206: aconst_null
      // 207: nop
      // 208: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 20b: aload 0
      // 20c: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getDefaultFont ()Lkotakbaz/rain/client/util/render/font/Font;
      // 20f: aload 0
      // 210: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 213: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 216: aload 0
      // 217: getfield kotakbaz/rain/ui/menu/ModuleComponent.module Lkotakbaz/rain/module/Module;
      // 21a: invokevirtual kotakbaz/rain/module/Module.getDesc ()Ljava/lang/String;
      // 21d: fload 23
      // 21f: fload 25
      // 221: fload 22
      // 223: aload 20
      // 225: fconst_0
      // 226: nop
      // 227: fconst_0
      // 228: nop
      // 229: fconst_0
      // 22a: nop
      // 22b: bipush 0
      // 22c: nop
      // 22d: fconst_0
      // 22e: nop
      // 22f: sipush 992
      // 232: aconst_null
      // 233: nop
      // 234: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 237: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 23a: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 23d: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 240: fconst_0
      // 241: nop
      // 242: bipush 1
      // 243: nop
      // 244: aconst_null
      // 245: nop
      // 246: invokestatic oxxxde/ثْ.value$default (Loxxxde/ثْ;FILjava/lang/Object;)Ljava/awt/Color;
      // 249: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 24c: fconst_0
      // 24d: nop
      // 24e: bipush 1
      // 24f: nop
      // 250: aconst_null
      // 251: nop
      // 252: invokestatic oxxxde/ثْ.title$default (Loxxxde/ثْ;FILjava/lang/Object;)Ljava/awt/Color;
      // 255: fload 8
      // 257: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 25a: aload 0
      // 25b: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getAlpha ()F
      // 25e: fload 6
      // 260: fmul
      // 261: invokevirtual oxxxde/بح.setAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 264: astore 26
      // 266: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 269: invokevirtual oxxxde/ذر.getBASIC_RECT ()Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 26c: aload 0
      // 26d: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 270: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 273: aload 26
      // 275: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 278: ldc_w 0.3
      // 27b: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 27e: aload 0
      // 27f: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getX ()F
      // 282: aload 0
      // 283: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getWidth ()F
      // 286: fadd
      // 287: aload 0
      // 288: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 28b: ldc_w 1.5
      // 28e: fmul
      // 28f: fsub
      // 290: aload 0
      // 291: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getY ()F
      // 294: aload 0
      // 295: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 298: fadd
      // 299: ldc_w 2.5
      // 29c: ldc_w 2.5
      // 29f: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.draw (FFFF)V
      // 2a2: aload 0
      // 2a3: getfield kotakbaz/rain/ui/menu/ModuleComponent.module Lkotakbaz/rain/module/Module;
      // 2a6: invokevirtual kotakbaz/rain/module/Module.getSettings ()Ljava/util/List;
      // 2a9: checkcast java/util/Collection
      // 2ac: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 2b1: ifne 2b9
      // 2b4: bipush 1
      // 2b5: nop
      // 2b6: goto 2bb
      // 2b9: bipush 0
      // 2ba: nop
      // 2bb: ifeq 3c2
      // 2be: fload 6
      // 2c0: ldc_w 0.01
      // 2c3: fcmpl
      // 2c4: ifle 3c2
      // 2c7: ldc_w "f"
      // 2ca: astore 27
      // 2cc: ldc_w 5.5
      // 2cf: fstore 28
      // 2d1: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 2d4: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 2d7: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 2da: fconst_0
      // 2db: nop
      // 2dc: bipush 1
      // 2dd: nop
      // 2de: aconst_null
      // 2df: nop
      // 2e0: invokestatic oxxxde/ثْ.icon$default (Loxxxde/ثْ;FILjava/lang/Object;)Ljava/awt/Color;
      // 2e3: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 2e6: fconst_0
      // 2e7: nop
      // 2e8: bipush 1
      // 2e9: nop
      // 2ea: aconst_null
      // 2eb: nop
      // 2ec: invokestatic oxxxde/ثْ.title$default (Loxxxde/ثْ;FILjava/lang/Object;)Ljava/awt/Color;
      // 2ef: fload 8
      // 2f1: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 2f4: ldc_w 0.55
      // 2f7: aload 0
      // 2f8: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getAlpha ()F
      // 2fb: fmul
      // 2fc: fload 6
      // 2fe: fmul
      // 2ff: invokevirtual oxxxde/بح.setAlpha (Ljava/awt/Color;F)Ljava/awt/Color;
      // 302: astore 29
      // 304: aload 0
      // 305: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getX ()F
      // 308: aload 0
      // 309: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getWidth ()F
      // 30c: fadd
      // 30d: aload 0
      // 30e: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 311: ldc_w 3.0
      // 314: fmul
      // 315: fsub
      // 316: fstore 30
      // 318: aload 0
      // 319: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getY ()F
      // 31c: aload 0
      // 31d: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 320: fconst_2
      // 321: nop
      // 322: fmul
      // 323: fadd
      // 324: fstore 31
      // 326: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 329: invokevirtual oxxxde/رَ.getICON ()Lkotakbaz/rain/client/util/render/font/Font;
      // 32c: aload 27
      // 32e: fload 28
      // 330: fconst_0
      // 331: nop
      // 332: bipush 4
      // 333: nop
      // 334: aconst_null
      // 335: nop
      // 336: invokestatic kotakbaz/rain/client/util/render/font/Font.getWidth$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFILjava/lang/Object;)F
      // 339: fstore 32
      // 33b: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 33e: invokevirtual oxxxde/رَ.getICON ()Lkotakbaz/rain/client/util/render/font/Font;
      // 341: fload 28
      // 343: invokevirtual kotakbaz/rain/client/util/render/font/Font.getHeight (F)F
      // 346: fstore 33
      // 348: fload 30
      // 34a: fload 32
      // 34c: ldc 0.5
      // 34e: fmul
      // 34f: fadd
      // 350: fstore 34
      // 352: fload 31
      // 354: fload 33
      // 356: ldc 0.5
      // 358: fmul
      // 359: fadd
      // 35a: fstore 35
      // 35c: fload 7
      // 35e: ldc_w 180.0
      // 361: fmul
      // 362: ldc_w 0.017453292
      // 365: fmul
      // 366: fstore 36
      // 368: getstatic oxxxde/بد.INSTANCE Loxxxde/بد;
      // 36b: invokevirtual oxxxde/بد.pushMatrix ()V
      // 36e: getstatic oxxxde/بد.matrix4fStack Lorg/joml/Matrix4fStack;
      // 371: fload 34
      // 373: fload 35
      // 375: fconst_0
      // 376: nop
      // 377: invokevirtual org/joml/Matrix4fStack.translate (FFF)Lorg/joml/Matrix4f;
      // 37a: pop
      // 37b: getstatic oxxxde/بد.matrix4fStack Lorg/joml/Matrix4fStack;
      // 37e: fload 36
      // 380: invokevirtual org/joml/Matrix4fStack.rotateZ (F)Lorg/joml/Matrix4f;
      // 383: pop
      // 384: getstatic oxxxde/بد.matrix4fStack Lorg/joml/Matrix4fStack;
      // 387: fload 34
      // 389: fneg
      // 38a: fload 35
      // 38c: fneg
      // 38d: fconst_0
      // 38e: nop
      // 38f: invokevirtual org/joml/Matrix4fStack.translate (FFF)Lorg/joml/Matrix4f;
      // 392: pop
      // 393: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 396: invokevirtual oxxxde/رَ.getICON ()Lkotakbaz/rain/client/util/render/font/Font;
      // 399: aload 0
      // 39a: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 39d: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 3a0: aload 27
      // 3a2: fload 30
      // 3a4: fload 31
      // 3a6: fload 28
      // 3a8: aload 29
      // 3aa: fconst_0
      // 3ab: nop
      // 3ac: fconst_0
      // 3ad: nop
      // 3ae: fconst_0
      // 3af: nop
      // 3b0: bipush 0
      // 3b1: nop
      // 3b2: fconst_0
      // 3b3: nop
      // 3b4: sipush 992
      // 3b7: aconst_null
      // 3b8: nop
      // 3b9: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 3bc: getstatic oxxxde/بد.INSTANCE Loxxxde/بد;
      // 3bf: invokevirtual oxxxde/بد.popMatrix ()V
      // 3c2: fload 5
      // 3c4: ldc_w 0.01
      // 3c7: fcmpl
      // 3c8: ifle 3d1
      // 3cb: aload 0
      // 3cc: fload 5
      // 3ce: invokespecial kotakbaz/rain/ui/menu/ModuleComponent.renderBindMenu (F)V
      // 3d1: fload 7
      // 3d3: ldc_w 0.01
      // 3d6: fcmpg
      // 3d7: ifle 3ef
      // 3da: aload 0
      // 3db: getfield kotakbaz/rain/ui/menu/ModuleComponent.settingComponents Ljava/util/List;
      // 3de: invokeinterface java/util/List.isEmpty ()Z 1
      // 3e3: ifne 3ef
      // 3e6: fload 11
      // 3e8: ldc_w 0.001
      // 3eb: fcmpg
      // 3ec: ifgt 3f0
      // 3ef: return
      // 3f0: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 3f3: ldc_w 0.12
      // 3f6: aload 0
      // 3f7: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getAlpha ()F
      // 3fa: fmul
      // 3fb: fload 7
      // 3fd: fmul
      // 3fe: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 401: astore 27
      // 403: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 406: invokevirtual oxxxde/ذر.getBASIC_RECT ()Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 409: aload 0
      // 40a: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 40d: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 410: aload 27
      // 412: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 415: ldc 0.5
      // 417: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 41a: aload 0
      // 41b: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getX ()F
      // 41e: aload 0
      // 41f: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 422: fadd
      // 423: aload 0
      // 424: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getWidth ()F
      // 427: fconst_2
      // 428: nop
      // 429: fdiv
      // 42a: fconst_1
      // 42b: nop
      // 42c: fload 7
      // 42e: fsub
      // 42f: fmul
      // 430: fadd
      // 431: aload 0
      // 432: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getY ()F
      // 435: aload 0
      // 436: getfield kotakbaz/rain/ui/menu/ModuleComponent.headerHeight F
      // 439: fadd
      // 43a: aload 0
      // 43b: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 43e: fconst_2
      // 43f: nop
      // 440: fdiv
      // 441: fsub
      // 442: aload 0
      // 443: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getWidth ()F
      // 446: aload 0
      // 447: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 44a: fconst_2
      // 44b: nop
      // 44c: fmul
      // 44d: fsub
      // 44e: fload 7
      // 450: fmul
      // 451: fconst_1
      // 452: nop
      // 453: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.draw (FFFF)V
      // 456: aload 0
      // 457: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getX ()F
      // 45a: aload 0
      // 45b: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 45e: ldc_w 1.2
      // 461: fmul
      // 462: fadd
      // 463: fstore 28
      // 465: aload 0
      // 466: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getWidth ()F
      // 469: aload 0
      // 46a: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 46d: ldc_w 2.4
      // 470: fmul
      // 471: fsub
      // 472: fstore 29
      // 474: fconst_0
      // 475: nop
      // 476: fstore 30
      // 478: aload 0
      // 479: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getY ()F
      // 47c: aload 0
      // 47d: getfield kotakbaz/rain/ui/menu/ModuleComponent.headerHeight F
      // 480: fadd
      // 481: aload 0
      // 482: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getPadding ()F
      // 485: ldc_w 0.45
      // 488: fmul
      // 489: fadd
      // 48a: fstore 30
      // 48c: bipush 0
      // 48d: nop
      // 48e: istore 31
      // 490: getstatic oxxxde/جِ.INSTANCE Loxxxde/جِ;
      // 493: aload 0
      // 494: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getX ()F
      // 497: aload 0
      // 498: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getY ()F
      // 49b: aload 0
      // 49c: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getWidth ()F
      // 49f: aload 0
      // 4a0: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getHeight ()F
      // 4a3: invokevirtual oxxxde/جِ.start (FFFF)V
      // 4a6: aload 0
      // 4a7: getfield kotakbaz/rain/ui/menu/ModuleComponent.settingComponents Ljava/util/List;
      // 4aa: checkcast java/lang/Iterable
      // 4ad: astore 32
      // 4af: bipush 0
      // 4b0: nop
      // 4b1: istore 33
      // 4b3: bipush 0
      // 4b4: nop
      // 4b5: istore 34
      // 4b7: aload 32
      // 4b9: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 4be: astore 35
      // 4c0: aload 35
      // 4c2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4c7: ifeq 591
      // 4ca: aload 35
      // 4cc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4d1: astore 36
      // 4d3: iload 34
      // 4d5: iinc 34 1
      // 4d8: istore 37
      // 4da: iload 37
      // 4dc: ifge 4e2
      // 4df: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
      // 4e2: iload 37
      // 4e4: aload 36
      // 4e6: checkcast kotakbaz/rain/ui/menu/settings/ModuleSettingComponent
      // 4e9: astore 38
      // 4eb: istore 39
      // 4ed: bipush 0
      // 4ee: nop
      // 4ef: istore 40
      // 4f1: aload 4
      // 4f3: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent$LayoutSnapshot.getSettingVisibility ()[F
      // 4f6: iload 39
      // 4f8: faload
      // 4f9: fstore 41
      // 4fb: fload 41
      // 4fd: ldc_w 0.001
      // 500: fcmpg
      // 501: ifle 58d
      // 504: aload 4
      // 506: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent$LayoutSnapshot.getSettingHeights ()[F
      // 509: iload 39
      // 50b: faload
      // 50c: fstore 42
      // 50e: iload 31
      // 510: ifeq 522
      // 513: fload 30
      // 515: aload 0
      // 516: getfield kotakbaz/rain/ui/menu/ModuleComponent.settingGap F
      // 519: fload 7
      // 51b: fmul
      // 51c: fload 41
      // 51e: fmul
      // 51f: fadd
      // 520: fstore 30
      // 522: aload 38
      // 524: aload 0
      // 525: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getAlpha ()F
      // 528: fload 7
      // 52a: fmul
      // 52b: fload 41
      // 52d: fmul
      // 52e: invokevirtual kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.setAlpha (F)V
      // 531: aload 38
      // 533: fload 8
      // 535: invokevirtual kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.setEnableProgress (F)V
      // 538: aload 38
      // 53a: fload 7
      // 53c: invokevirtual kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.setParentOpenProgress (F)V
      // 53f: aload 38
      // 541: fload 28
      // 543: invokevirtual kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.setX (F)V
      // 546: aload 38
      // 548: fload 30
      // 54a: invokevirtual kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.setY (F)V
      // 54d: aload 38
      // 54f: fload 29
      // 551: invokevirtual kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.setWidth (F)V
      // 554: aload 38
      // 556: fload 42
      // 558: invokevirtual kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.setHeight (F)V
      // 55b: fload 30
      // 55d: fload 42
      // 55f: fadd
      // 560: aload 0
      // 561: getfield kotakbaz/rain/ui/menu/ModuleComponent.viewportTop F
      // 564: fcmpl
      // 565: ifle 57b
      // 568: fload 30
      // 56a: aload 0
      // 56b: getfield kotakbaz/rain/ui/menu/ModuleComponent.viewportBottom F
      // 56e: fcmpg
      // 56f: ifge 57b
      // 572: aload 38
      // 574: iload 1
      // 575: iload 2
      // 576: nop
      // 577: fload 3
      // 578: invokevirtual kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.render (IIF)V
      // 57b: fload 30
      // 57d: fload 42
      // 57f: fload 7
      // 581: fmul
      // 582: fload 41
      // 584: fmul
      // 585: fadd
      // 586: fstore 30
      // 588: bipush 1
      // 589: nop
      // 58a: istore 31
      // 58c: nop
      // 58d: nop
      // 58e: goto 4c0
      // 591: nop
      // 592: getstatic oxxxde/جِ.INSTANCE Loxxxde/جِ;
      // 595: invokevirtual oxxxde/جِ.end ()V
      // 598: return
   }

   private fun closeBindMenu() {
      if (this.bindMenuOpen) {
         this.bindMenuOpen = false
         this.expanded = this.expandedBeforeBindMenu
      }
   }

   public override fun onKeyPress(mouseX: Int, mouseY: Int, button: Int) {
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
      // 01: iload 1
      // 02: iload 2
      // 03: iload 3
      // 04: invokespecial oxxxde/اظ.onKeyPress (III)V
      // 07: aload 0
      // 08: getfield kotakbaz/rain/ui/menu/ModuleComponent.bindMenuAnim Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 0b: aload 0
      // 0c: getfield kotakbaz/rain/ui/menu/ModuleComponent.bindMenuOpen Z
      // 0f: ifeq 16
      // 12: fconst_1
      // 13: goto 17
      // 16: fconst_0
      // 17: ldc_w 240.0
      // 1a: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 1d: astore 5
      // 1f: new oxxxde/بً
      // 22: dup
      // 23: aload 5
      // 25: invokespecial oxxxde/بً.<init> (Loxxxde/بف;)V
      // 28: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 2b: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 2e: fstore 4
      // 30: aload 0
      // 31: getfield kotakbaz/rain/ui/menu/ModuleComponent.bindMenuOpen Z
      // 34: ifeq 78
      // 37: iload 3
      // 38: tableswitch 51 256 261 40 51 51 40 51 40
      // 60: aload 0
      // 61: getfield kotakbaz/rain/ui/menu/ModuleComponent.module Lkotakbaz/rain/module/Module;
      // 64: bipush -1
      // 65: invokevirtual kotakbaz/rain/module/Module.setKey (I)V
      // 68: goto 73
      // 6b: aload 0
      // 6c: getfield kotakbaz/rain/ui/menu/ModuleComponent.module Lkotakbaz/rain/module/Module;
      // 6f: iload 3
      // 70: invokevirtual kotakbaz/rain/module/Module.setKey (I)V
      // 73: aload 0
      // 74: invokespecial kotakbaz/rain/ui/menu/ModuleComponent.closeBindMenu ()V
      // 77: return
      // 78: fload 4
      // 7a: ldc_w 0.05
      // 7d: fcmpl
      // 7e: ifle 82
      // 81: return
      // 82: aload 0
      // 83: getfield kotakbaz/rain/ui/menu/ModuleComponent.openAnim Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 86: aload 0
      // 87: getfield kotakbaz/rain/ui/menu/ModuleComponent.expanded Z
      // 8a: ifeq 91
      // 8d: fconst_1
      // 8e: goto 92
      // 91: fconst_0
      // 92: ldc_w 250.0
      // 95: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 98: astore 5
      // 9a: new oxxxde/تٍ
      // 9d: dup
      // 9e: aload 5
      // a0: invokespecial oxxxde/تٍ.<init> (Loxxxde/بف;)V
      // a3: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // a6: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // a9: ldc_w 0.05
      // ac: fcmpg
      // ad: ifgt b1
      // b0: return
      // b1: aload 0
      // b2: getfield kotakbaz/rain/ui/menu/ModuleComponent.settingComponents Ljava/util/List;
      // b5: checkcast java/lang/Iterable
      // b8: astore 5
      // ba: bipush 0
      // bb: istore 6
      // bd: aload 5
      // bf: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // c4: astore 7
      // c6: aload 7
      // c8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // cd: ifeq fb
      // d0: aload 7
      // d2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // d7: astore 8
      // d9: aload 8
      // db: checkcast kotakbaz/rain/ui/menu/settings/ModuleSettingComponent
      // de: astore 9
      // e0: bipush 0
      // e1: istore 10
      // e3: aload 9
      // e5: invokevirtual kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.getSetting ()Lkotakbaz/rain/module/setting/Setting;
      // e8: invokevirtual kotakbaz/rain/module/setting/Setting.isVisible ()Z
      // eb: ifeq f6
      // ee: aload 9
      // f0: iload 1
      // f1: iload 2
      // f2: iload 3
      // f3: invokevirtual kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.onKeyPress (III)V
      // f6: nop
      // f7: nop
      // f8: goto c6
      // fb: nop
      // fc: return
   }

   public override fun onMouseClick(mouseX: Int, mouseY: Int, button: Int) {
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
      // 001: iload 1
      // 002: iload 2
      // 003: nop
      // 004: iload 3
      // 005: nop
      // 006: invokespecial oxxxde/اظ.onMouseClick (III)V
      // 009: aload 0
      // 00a: getfield kotakbaz/rain/ui/menu/ModuleComponent.bindMenuAnim Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 00d: aload 0
      // 00e: getfield kotakbaz/rain/ui/menu/ModuleComponent.bindMenuOpen Z
      // 011: ifeq 019
      // 014: fconst_1
      // 015: nop
      // 016: goto 01b
      // 019: fconst_0
      // 01a: nop
      // 01b: ldc_w 240.0
      // 01e: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 021: astore 5
      // 023: new oxxxde/ظخ
      // 026: dup
      // 027: aload 5
      // 029: invokespecial oxxxde/ظخ.<init> (Loxxxde/بف;)V
      // 02c: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 02f: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 032: fstore 4
      // 034: iload 1
      // 035: i2f
      // 036: aload 0
      // 037: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getX ()F
      // 03a: fcmpl
      // 03b: iflt 06d
      // 03e: iload 1
      // 03f: i2f
      // 040: aload 0
      // 041: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getX ()F
      // 044: aload 0
      // 045: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getWidth ()F
      // 048: fadd
      // 049: fcmpg
      // 04a: ifgt 06d
      // 04d: iload 2
      // 04e: nop
      // 04f: i2f
      // 050: aload 0
      // 051: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getY ()F
      // 054: fcmpl
      // 055: iflt 06d
      // 058: iload 2
      // 059: nop
      // 05a: i2f
      // 05b: aload 0
      // 05c: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getY ()F
      // 05f: aload 0
      // 060: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getHeight ()F
      // 063: fadd
      // 064: fcmpg
      // 065: ifgt 06d
      // 068: bipush 1
      // 069: nop
      // 06a: goto 06f
      // 06d: bipush 0
      // 06e: nop
      // 06f: istore 5
      // 071: iload 1
      // 072: i2f
      // 073: aload 0
      // 074: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getX ()F
      // 077: fcmpl
      // 078: iflt 0aa
      // 07b: iload 1
      // 07c: i2f
      // 07d: aload 0
      // 07e: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getX ()F
      // 081: aload 0
      // 082: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getWidth ()F
      // 085: fadd
      // 086: fcmpg
      // 087: ifgt 0aa
      // 08a: iload 2
      // 08b: nop
      // 08c: i2f
      // 08d: aload 0
      // 08e: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getY ()F
      // 091: fcmpl
      // 092: iflt 0aa
      // 095: iload 2
      // 096: nop
      // 097: i2f
      // 098: aload 0
      // 099: invokevirtual kotakbaz/rain/ui/menu/ModuleComponent.getY ()F
      // 09c: aload 0
      // 09d: getfield kotakbaz/rain/ui/menu/ModuleComponent.headerHeight F
      // 0a0: fadd
      // 0a1: fcmpg
      // 0a2: ifgt 0aa
      // 0a5: bipush 1
      // 0a6: nop
      // 0a7: goto 0ac
      // 0aa: bipush 0
      // 0ab: nop
      // 0ac: istore 6
      // 0ae: aload 0
      // 0af: getfield kotakbaz/rain/ui/menu/ModuleComponent.bindMenuOpen Z
      // 0b2: ifeq 0d5
      // 0b5: iload 5
      // 0b7: ifne 0bb
      // 0ba: return
      // 0bb: iload 3
      // 0bc: nop
      // 0bd: bipush 2
      // 0be: nop
      // 0bf: if_icmpne 0c7
      // 0c2: aload 0
      // 0c3: invokespecial kotakbaz/rain/ui/menu/ModuleComponent.closeBindMenu ()V
      // 0c6: return
      // 0c7: aload 0
      // 0c8: getfield kotakbaz/rain/ui/menu/ModuleComponent.module Lkotakbaz/rain/module/Module;
      // 0cb: iload 3
      // 0cc: nop
      // 0cd: invokevirtual kotakbaz/rain/module/Module.setKey (I)V
      // 0d0: aload 0
      // 0d1: invokespecial kotakbaz/rain/ui/menu/ModuleComponent.closeBindMenu ()V
      // 0d4: return
      // 0d5: iload 6
      // 0d7: ifeq 0fa
      // 0da: iload 3
      // 0db: nop
      // 0dc: bipush 2
      // 0dd: nop
      // 0de: if_icmpne 0fa
      // 0e1: aload 0
      // 0e2: getfield kotakbaz/rain/ui/menu/ModuleComponent.module Lkotakbaz/rain/module/Module;
      // 0e5: invokevirtual kotakbaz/rain/module/Module.canBind ()Z
      // 0e8: ifeq 0f2
      // 0eb: aload 0
      // 0ec: invokespecial kotakbaz/rain/ui/menu/ModuleComponent.openBindMenu ()V
      // 0ef: goto 0f9
      // 0f2: aload 0
      // 0f3: getfield kotakbaz/rain/ui/menu/ModuleComponent.module Lkotakbaz/rain/module/Module;
      // 0f6: invokevirtual kotakbaz/rain/module/Module.onBindAttempt ()V
      // 0f9: return
      // 0fa: fload 4
      // 0fc: ldc_w 0.05
      // 0ff: fcmpl
      // 100: ifle 104
      // 103: return
      // 104: iload 6
      // 106: ifeq 153
      // 109: iload 3
      // 10a: nop
      // 10b: ifne 120
      // 10e: aload 0
      // 10f: getfield kotakbaz/rain/ui/menu/ModuleComponent.module Lkotakbaz/rain/module/Module;
      // 112: invokevirtual kotakbaz/rain/module/Module.canToggle ()Z
      // 115: ifeq 11f
      // 118: aload 0
      // 119: getfield kotakbaz/rain/ui/menu/ModuleComponent.module Lkotakbaz/rain/module/Module;
      // 11c: invokevirtual kotakbaz/rain/module/Module.toggle ()V
      // 11f: return
      // 120: iload 3
      // 121: nop
      // 122: bipush 1
      // 123: nop
      // 124: if_icmpne 153
      // 127: aload 0
      // 128: getfield kotakbaz/rain/ui/menu/ModuleComponent.settingComponents Ljava/util/List;
      // 12b: checkcast java/util/Collection
      // 12e: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 133: ifne 13b
      // 136: bipush 1
      // 137: nop
      // 138: goto 13d
      // 13b: bipush 0
      // 13c: nop
      // 13d: ifeq 153
      // 140: aload 0
      // 141: aload 0
      // 142: getfield kotakbaz/rain/ui/menu/ModuleComponent.expanded Z
      // 145: ifne 14d
      // 148: bipush 1
      // 149: nop
      // 14a: goto 14f
      // 14d: bipush 0
      // 14e: nop
      // 14f: putfield kotakbaz/rain/ui/menu/ModuleComponent.expanded Z
      // 152: return
      // 153: aload 0
      // 154: getfield kotakbaz/rain/ui/menu/ModuleComponent.openAnim Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 157: aload 0
      // 158: getfield kotakbaz/rain/ui/menu/ModuleComponent.expanded Z
      // 15b: ifeq 163
      // 15e: fconst_1
      // 15f: nop
      // 160: goto 165
      // 163: fconst_0
      // 164: nop
      // 165: ldc_w 250.0
      // 168: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 16b: astore 7
      // 16d: new oxxxde/دب
      // 170: dup
      // 171: aload 7
      // 173: invokespecial oxxxde/دب.<init> (Loxxxde/بف;)V
      // 176: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 179: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 17c: ldc_w 0.05
      // 17f: fcmpg
      // 180: ifgt 184
      // 183: return
      // 184: aload 0
      // 185: getfield kotakbaz/rain/ui/menu/ModuleComponent.settingComponents Ljava/util/List;
      // 188: checkcast java/lang/Iterable
      // 18b: astore 7
      // 18d: bipush 0
      // 18e: nop
      // 18f: istore 8
      // 191: aload 7
      // 193: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 198: astore 9
      // 19a: aload 9
      // 19c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1a1: ifeq 1d2
      // 1a4: aload 9
      // 1a6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1ab: astore 10
      // 1ad: aload 10
      // 1af: checkcast kotakbaz/rain/ui/menu/settings/ModuleSettingComponent
      // 1b2: astore 11
      // 1b4: bipush 0
      // 1b5: nop
      // 1b6: istore 12
      // 1b8: aload 11
      // 1ba: invokevirtual kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.getSetting ()Lkotakbaz/rain/module/setting/Setting;
      // 1bd: invokevirtual kotakbaz/rain/module/setting/Setting.isVisible ()Z
      // 1c0: ifeq 1cd
      // 1c3: aload 11
      // 1c5: iload 1
      // 1c6: iload 2
      // 1c7: nop
      // 1c8: iload 3
      // 1c9: nop
      // 1ca: invokevirtual kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.onMouseClick (III)V
      // 1cd: nop
      // 1ce: nop
      // 1cf: goto 19a
      // 1d2: nop
      // 1d3: return
   }

   public final val defaultHeight: Float
      public final get() {
         return this.calculateLayout().moduleHeight
      }


   // $VF: Compiled from heavy
   private data class LayoutSnapshot(bindProgress: Float,
      contentVisibility: Float,
      effectiveOpenProgress: Float,
      settingsHeight: Float,
      moduleHeight: Float,
      settingVisibility: FloatArray,
      settingHeights: FloatArray
   ) {
      public final val moduleHeight: Float
      public final val bindProgress: Float
      public final val settingHeights: FloatArray
      public final val effectiveOpenProgress: Float
      public final val contentVisibility: Float
      public final val settingsHeight: Float
      public final val settingVisibility: FloatArray

      public operator fun component5(): Float {
         return this.moduleHeight
      }

      public override fun toString(): String {
         return "LayoutSnapshot(bindProgress=${this.bindProgress}, contentVisibility=${this.contentVisibility}, effectiveOpenProgress=${this.effectiveOpenProgress}, settingsHeight=${this.settingsHeight}, moduleHeight=${this.moduleHeight}, settingVisibility=${Arrays.toString(
            this.settingVisibility
         )}, settingHeights=${Arrays.toString(this.settingHeights)})"
      }

      public operator fun component4(): Float {
         return this.settingsHeight
      }

      public fun copy(
         bindProgress: Float = ...,
         contentVisibility: Float = ...,
         effectiveOpenProgress: Float = ...,
         settingsHeight: Float = ...,
         moduleHeight: Float = ...,
         settingVisibility: FloatArray = ...,
         settingHeights: FloatArray = ...
      ): شر {
         return ModuleComponent.LayoutSnapshot(
            bindProgress, contentVisibility, effectiveOpenProgress, settingsHeight, moduleHeight, settingVisibility, settingHeights
         )
      }

      public operator fun component7(): FloatArray {
         return this.settingHeights
      }

      public override fun hashCode(): Int {
         return (
                  (
                           (
                                    (
                                             (java.lang.Float.hashCode(this.bindProgress) * 31 + java.lang.Float.hashCode(this.contentVisibility)) * 31
                                                + java.lang.Float.hashCode(this.effectiveOpenProgress)
                                          )
                                          * 31
                                       + java.lang.Float.hashCode(this.settingsHeight)
                                 )
                                 * 31
                              + java.lang.Float.hashCode(this.moduleHeight)
                        )
                        * 31
                     + Arrays.hashCode(this.settingVisibility)
               )
               * 31
            + Arrays.hashCode(this.settingHeights)
         }

      init {
         this.bindProgress = bindProgress
         this.contentVisibility = contentVisibility
         this.effectiveOpenProgress = effectiveOpenProgress
         this.settingsHeight = settingsHeight
         this.moduleHeight = moduleHeight
         this.settingVisibility = settingVisibility
         this.settingHeights = settingHeights
      }

      public operator fun component6(): FloatArray {
         return this.settingVisibility
      }

      public override operator fun equals(other: Any?): Boolean {
         label58@
         if (this === other) {
            return true
         } else {
            return other is ModuleComponent.LayoutSnapshot
               && java.lang.Float.compare(this.bindProgress, (other as ModuleComponent.LayoutSnapshot).bindProgress) == 0
               && java.lang.Float.compare(this.contentVisibility, (other as ModuleComponent.LayoutSnapshot).contentVisibility) == 0
               && java.lang.Float.compare(this.effectiveOpenProgress, (other as ModuleComponent.LayoutSnapshot).effectiveOpenProgress) == 0
               && java.lang.Float.compare(this.settingsHeight, (other as ModuleComponent.LayoutSnapshot).settingsHeight) == 0
               && java.lang.Float.compare(this.moduleHeight, (other as ModuleComponent.LayoutSnapshot).moduleHeight) == 0
               && this.settingVisibility == (other as ModuleComponent.LayoutSnapshot).settingVisibility
               && this.settingHeights == (other as ModuleComponent.LayoutSnapshot).settingHeights
            }
      }

      public operator fun component1(): Float {
         return this.bindProgress
      }

      public operator fun component3(): Float {
         return this.effectiveOpenProgress
      }

      public operator fun component2(): Float {
         return this.contentVisibility
      }
   }
}
