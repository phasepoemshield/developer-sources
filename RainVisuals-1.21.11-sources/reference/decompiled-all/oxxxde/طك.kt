package oxxxde

import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.Locale
import org.joml.Vector3f

// $VF: Compiled from EventsCategoryComponent.kt
public class طك(panelWidth: Float, contentTopOffset: Float, onJoinAnarchy: (Int) -> Unit) : اظ, اس {
   private final var apiGeneration: Long
   private final val rowHeight: Float
   private final val scratchPos: Vector3f
   private final val itemAnimations: HashMap<Int, ري>
   private final val returnScrollDurationMs: Float
   private final val actionHoverAnimations: HashMap<Int, ري>
   private final var cachedViewHeight: Float
   private final var items: List<ز>
   private final val filters: List<ث>
   private final val cardHoverAnimations: HashMap<Int, ري>
   private final val panelWidth: Float
   private final var apiLoading: Boolean
   private final val onJoinAnarchy: (Int) -> Unit
   private final val emptyTextAnimation: ري
   private final var renderedSecond: Long
   private final val cardGap: Float
   private final var cachedTotalHeight: Float
   private final val buttonHeight: Float
   private final var emptyText: String
   private final val contentTopOffset: Float
   private final var renderedItems: List<جة<ز>>
   private final val listAnimations: ثّ<Int, ز>
   private final var apiFailed: Boolean
   private final val footerHeight: Float
   private final val actionButtonSize: Float
   private final val actionIconSize: Float
   private final var previousEmptyText: String
   private final var scroll: زع
   private final val buttonGap: Float
   private final val hoverScrollDurationMs: Float
   private final var normalizedSearch: String

   private fun eventCardBoundsAtIndex(area: ثء, index: Int, scrollOffset: Float): ثء {
      val cardWidth: Float = RangesKt.coerceAtLeast((area.width - this.cardGap) * 0.5F, 0.0F)
      return ثء(
         area.left + index % 2 * (cardWidth + this.cardGap),
         area.top - scrollOffset + index / 2 * (this.rowHeight + this.getPadding()),
         cardWidth,
         this.rowHeight
      )
   }

   private fun eventCardBounds(area: ثء, position: Float, scrollOffset: Float): ثء {
      val lowerIndex: Int = RangesKt.coerceAtLeast((int)((float)Math.floor((double)position)), 0)
      val fraction: Float = RangesKt.coerceIn(position - (float)lowerIndex, 0.0F, 1.0F)
      val lower: ثء = this.eventCardBoundsAtIndex(area, lowerIndex, scrollOffset)
      val upper: ثء = this.eventCardBoundsAtIndex(area, lowerIndex + 1, scrollOffset)
      return ثء(lower.left + (upper.left - lower.left) * fraction, lower.top + (upper.top - lower.top) * fraction, lower.width, this.rowHeight)
   }

   private fun listArea(area: ثء, footer: ثء): ثء {
      return ثء(area.left, area.top, area.width, RangesKt.coerceAtLeast(footer.top - area.top - this.getPadding(), 0.0F))
   }

   private fun contentArea(): ثء {
      val left: Float = this.getX() + this.panelWidth + this.getPadding()
      val right: Float = this.getX() + this.getWidth() - this.panelWidth / 3.0F
      val top: Float = this.getY() + this.contentTopOffset
      return ثء(left, top, RangesKt.coerceAtLeast(right - left, 0.0F), RangesKt.coerceAtLeast(this.getY() + this.getHeight() - top - this.getPadding(), 0.0F))
   }

   private fun eventActionButtonBounds(cardX: Float, cardY: Float, cardWidth: Float): ثء {
      return ثء(
         cardX + cardWidth - this.getPadding() - this.actionButtonSize,
         cardY + (this.rowHeight - this.actionButtonSize) * 0.5F,
         this.actionButtonSize,
         this.actionButtonSize
      )
   }

   public fun scrollWheel(vertical: Float) {
      this.scroll.scroll(vertical * 2.5F)
   }

   private fun renderCard(item: ز, x: Float, y: Float, width: Float, mouseX: Int, mouseY: Int, presence: Float) {
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
      // 001: invokevirtual oxxxde/ز.getSelectionAnimation ()Loxxxde/ري;
      // 004: aload 1
      // 005: invokevirtual oxxxde/ز.getHighlighted ()Z
      // 008: ifeq 010
      // 00b: fconst_1
      // 00c: nop
      // 00d: goto 012
      // 010: fconst_0
      // 011: nop
      // 012: ldc_w 220.0
      // 015: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 018: astore 9
      // 01a: new oxxxde/زن
      // 01d: dup
      // 01e: aload 9
      // 020: invokespecial oxxxde/زن.<init> (Loxxxde/بف;)V
      // 023: checkcast oxxxde/شل
      // 026: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 029: fstore 8
      // 02b: aload 0
      // 02c: fload 2
      // 02d: fload 3
      // 02e: fload 4
      // 030: aload 0
      // 031: getfield oxxxde/طك.rowHeight F
      // 034: iload 5
      // 036: i2f
      // 037: iload 6
      // 039: i2f
      // 03a: invokespecial oxxxde/طك.inside (FFFFFF)Z
      // 03d: istore 9
      // 03f: aload 0
      // 040: getfield oxxxde/طك.cardHoverAnimations Ljava/util/HashMap;
      // 043: checkcast java/util/Map
      // 046: astore 11
      // 048: aload 1
      // 049: invokevirtual oxxxde/ز.getAnarchy ()I
      // 04c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 04f: astore 12
      // 051: bipush 0
      // 052: nop
      // 053: istore 13
      // 055: aload 11
      // 057: aload 12
      // 059: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 05e: astore 14
      // 060: aload 14
      // 062: ifnonnull 089
      // 065: bipush 0
      // 066: nop
      // 067: istore 15
      // 069: new oxxxde/ري
      // 06c: dup
      // 06d: fconst_0
      // 06e: nop
      // 06f: bipush 1
      // 070: nop
      // 071: aconst_null
      // 072: nop
      // 073: invokespecial oxxxde/ري.<init> (FILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 076: astore 15
      // 078: aload 11
      // 07a: aload 12
      // 07c: aload 15
      // 07e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 083: pop
      // 084: aload 15
      // 086: goto 08b
      // 089: aload 14
      // 08b: nop
      // 08c: checkcast oxxxde/ري
      // 08f: iload 9
      // 091: ifeq 099
      // 094: fconst_1
      // 095: nop
      // 096: goto 09b
      // 099: fconst_0
      // 09a: nop
      // 09b: ldc_w 180.0
      // 09e: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 0a1: astore 11
      // 0a3: new oxxxde/جه
      // 0a6: dup
      // 0a7: aload 11
      // 0a9: invokespecial oxxxde/جه.<init> (Loxxxde/بف;)V
      // 0ac: checkcast oxxxde/شل
      // 0af: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 0b2: fconst_0
      // 0b3: nop
      // 0b4: fconst_1
      // 0b5: nop
      // 0b6: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0b9: fstore 10
      // 0bb: aload 0
      // 0bc: invokevirtual oxxxde/طك.getAlpha ()F
      // 0bf: fload 7
      // 0c1: fmul
      // 0c2: fstore 11
      // 0c4: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 0c7: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0ca: fload 11
      // 0cc: ldc_w 0.03
      // 0cf: ldc_w 0.015
      // 0d2: fload 10
      // 0d4: fmul
      // 0d5: fadd
      // 0d6: fmul
      // 0d7: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 0da: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0dd: fload 11
      // 0df: ldc_w 0.05
      // 0e2: ldc_w 0.015
      // 0e5: fload 10
      // 0e7: fmul
      // 0e8: fadd
      // 0e9: fmul
      // 0ea: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 0ed: fload 8
      // 0ef: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 0f2: astore 12
      // 0f4: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 0f7: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0fa: fload 11
      // 0fc: ldc_w 0.05
      // 0ff: ldc_w 0.04
      // 102: fload 10
      // 104: fmul
      // 105: fadd
      // 106: fmul
      // 107: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 10a: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 10d: fload 11
      // 10f: ldc_w 0.08
      // 112: ldc_w 0.04
      // 115: fload 10
      // 117: fmul
      // 118: fadd
      // 119: fmul
      // 11a: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 11d: fload 8
      // 11f: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 122: astore 13
      // 124: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 127: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 12a: fload 11
      // 12c: ldc_w 0.32
      // 12f: ldc_w 0.12
      // 132: fload 10
      // 134: fmul
      // 135: fadd
      // 136: fmul
      // 137: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 13a: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 13d: fload 11
      // 13f: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 142: fload 8
      // 144: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 147: astore 14
      // 149: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 14c: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 14f: fload 11
      // 151: ldc_w 0.16
      // 154: ldc_w 0.1
      // 157: fload 10
      // 159: fmul
      // 15a: fadd
      // 15b: fmul
      // 15c: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 15f: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 162: fload 11
      // 164: ldc 0.5
      // 166: fmul
      // 167: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 16a: fload 8
      // 16c: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 16f: astore 15
      // 171: aload 0
      // 172: fload 2
      // 173: fload 3
      // 174: fload 4
      // 176: invokespecial oxxxde/طك.eventActionButtonBounds (FFF)Loxxxde/ثء;
      // 179: astore 16
      // 17b: aload 0
      // 17c: aload 16
      // 17e: iload 5
      // 180: i2f
      // 181: iload 6
      // 183: i2f
      // 184: invokespecial oxxxde/طك.contains (Loxxxde/ثء;FF)Z
      // 187: istore 17
      // 189: aload 0
      // 18a: getfield oxxxde/طك.actionHoverAnimations Ljava/util/HashMap;
      // 18d: checkcast java/util/Map
      // 190: astore 19
      // 192: aload 1
      // 193: invokevirtual oxxxde/ز.getAnarchy ()I
      // 196: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 199: astore 20
      // 19b: bipush 0
      // 19c: nop
      // 19d: istore 21
      // 19f: aload 19
      // 1a1: aload 20
      // 1a3: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1a8: astore 22
      // 1aa: aload 22
      // 1ac: ifnonnull 1d3
      // 1af: bipush 0
      // 1b0: nop
      // 1b1: istore 23
      // 1b3: new oxxxde/ري
      // 1b6: dup
      // 1b7: fconst_0
      // 1b8: nop
      // 1b9: bipush 1
      // 1ba: nop
      // 1bb: aconst_null
      // 1bc: nop
      // 1bd: invokespecial oxxxde/ري.<init> (FILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 1c0: astore 23
      // 1c2: aload 19
      // 1c4: aload 20
      // 1c6: aload 23
      // 1c8: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1cd: pop
      // 1ce: aload 23
      // 1d0: goto 1d5
      // 1d3: aload 22
      // 1d5: nop
      // 1d6: checkcast oxxxde/ري
      // 1d9: iload 17
      // 1db: ifeq 1e3
      // 1de: fconst_1
      // 1df: nop
      // 1e0: goto 1e5
      // 1e3: fconst_0
      // 1e4: nop
      // 1e5: ldc_w 170.0
      // 1e8: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 1eb: astore 19
      // 1ed: new oxxxde/ذٍ
      // 1f0: dup
      // 1f1: aload 19
      // 1f3: invokespecial oxxxde/ذٍ.<init> (Loxxxde/بف;)V
      // 1f6: checkcast oxxxde/شل
      // 1f9: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 1fc: fconst_0
      // 1fd: nop
      // 1fe: fconst_1
      // 1ff: nop
      // 200: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 203: fstore 18
      // 205: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 208: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 20b: fload 11
      // 20d: ldc_w 0.48
      // 210: fmul
      // 211: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 214: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 217: fload 11
      // 219: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 21c: fload 18
      // 21e: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 221: astore 19
      // 223: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 226: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 229: aload 0
      // 22a: invokevirtual oxxxde/طك.rectPipeline ()Loxxxde/صؤ;
      // 22d: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 230: aload 12
      // 232: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 235: ldc_w 4.0
      // 238: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 23b: ldc_w 0.95
      // 23e: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 241: fconst_1
      // 242: nop
      // 243: aload 13
      // 245: invokevirtual oxxxde/جء.border (FLjava/awt/Color;)Loxxxde/جء;
      // 248: fload 2
      // 249: fload 3
      // 24a: fload 4
      // 24c: aload 0
      // 24d: getfield oxxxde/طك.rowHeight F
      // 250: invokevirtual oxxxde/جء.draw (FFFF)V
      // 253: ldc_w "p"
      // 256: astore 20
      // 258: aload 16
      // 25a: invokevirtual oxxxde/ثء.getLeft ()F
      // 25d: aload 16
      // 25f: invokevirtual oxxxde/ثء.getWidth ()F
      // 262: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 265: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 268: aload 20
      // 26a: aload 0
      // 26b: getfield oxxxde/طك.actionIconSize F
      // 26e: fconst_0
      // 26f: nop
      // 270: bipush 4
      // 271: nop
      // 272: aconst_null
      // 273: nop
      // 274: invokestatic oxxxde/جً.getWidth$default (Loxxxde/جً;Ljava/lang/String;FFILjava/lang/Object;)F
      // 277: fsub
      // 278: ldc 0.5
      // 27a: fmul
      // 27b: fadd
      // 27c: fstore 21
      // 27e: aload 16
      // 280: invokevirtual oxxxde/ثء.getTop ()F
      // 283: aload 16
      // 285: invokevirtual oxxxde/ثء.getHeight ()F
      // 288: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 28b: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 28e: aload 0
      // 28f: getfield oxxxde/طك.actionIconSize F
      // 292: invokevirtual oxxxde/جً.getHeight (F)F
      // 295: fsub
      // 296: ldc 0.5
      // 298: fmul
      // 299: fadd
      // 29a: fstore 22
      // 29c: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 29f: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 2a2: aload 0
      // 2a3: invokevirtual oxxxde/طك.iconsPipeline ()Loxxxde/صؤ;
      // 2a6: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 2a9: aload 20
      // 2ab: fload 21
      // 2ad: fload 22
      // 2af: aload 0
      // 2b0: getfield oxxxde/طك.actionIconSize F
      // 2b3: aload 19
      // 2b5: fconst_0
      // 2b6: nop
      // 2b7: fconst_0
      // 2b8: nop
      // 2b9: fconst_0
      // 2ba: nop
      // 2bb: bipush 0
      // 2bc: nop
      // 2bd: fconst_0
      // 2be: nop
      // 2bf: sipush 992
      // 2c2: aconst_null
      // 2c3: nop
      // 2c4: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 2c7: ldc_w 8.0
      // 2ca: fstore 23
      // 2cc: ldc_w 5.6
      // 2cf: fstore 24
      // 2d1: fload 2
      // 2d2: aload 0
      // 2d3: invokevirtual oxxxde/طك.getPadding ()F
      // 2d6: ldc_w 1.5
      // 2d9: fmul
      // 2da: fadd
      // 2db: fstore 25
      // 2dd: fload 3
      // 2de: aload 0
      // 2df: invokevirtual oxxxde/طك.getPadding ()F
      // 2e2: ldc_w 1.5
      // 2e5: fmul
      // 2e6: fadd
      // 2e7: fstore 26
      // 2e9: fload 26
      // 2eb: aload 0
      // 2ec: invokevirtual oxxxde/طك.getDefaultFont ()Loxxxde/جً;
      // 2ef: fload 23
      // 2f1: invokevirtual oxxxde/جً.getHeight (F)F
      // 2f4: fadd
      // 2f5: aload 0
      // 2f6: invokevirtual oxxxde/طك.getPadding ()F
      // 2f9: ldc_w 1.5
      // 2fc: fdiv
      // 2fd: fadd
      // 2fe: fstore 27
      // 300: aload 0
      // 301: aload 1
      // 302: invokevirtual oxxxde/ز.getName ()Ljava/lang/String;
      // 305: aload 1
      // 306: invokevirtual oxxxde/ز.getStatus ()Ljava/lang/String;
      // 309: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001  •  \u0001" ]
      // 30e: fload 4
      // 310: aload 0
      // 311: invokevirtual oxxxde/طك.getPadding ()F
      // 314: ldc_w 3.0
      // 317: fmul
      // 318: fsub
      // 319: fload 24
      // 31b: invokespecial oxxxde/طك.trimToWidth (Ljava/lang/String;FF)Ljava/lang/String;
      // 31e: astore 28
      // 320: aload 16
      // 322: invokevirtual oxxxde/ثء.getLeft ()F
      // 325: fload 25
      // 327: fsub
      // 328: aload 0
      // 329: invokevirtual oxxxde/طك.getPadding ()F
      // 32c: fsub
      // 32d: fconst_0
      // 32e: nop
      // 32f: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 332: fstore 29
      // 334: aload 0
      // 335: aload 1
      // 336: invokevirtual oxxxde/ز.getTitle ()Ljava/lang/String;
      // 339: fload 29
      // 33b: fload 23
      // 33d: invokespecial oxxxde/طك.trimToWidth (Ljava/lang/String;FF)Ljava/lang/String;
      // 340: astore 30
      // 342: aload 0
      // 343: aload 28
      // 345: fload 29
      // 347: fload 24
      // 349: invokespecial oxxxde/طك.trimToWidth (Ljava/lang/String;FF)Ljava/lang/String;
      // 34c: astore 31
      // 34e: aload 0
      // 34f: invokevirtual oxxxde/طك.getDefaultFont ()Loxxxde/جً;
      // 352: aload 0
      // 353: invokevirtual oxxxde/طك.textPipeline ()Loxxxde/صؤ;
      // 356: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 359: aload 30
      // 35b: fload 25
      // 35d: fload 26
      // 35f: fload 23
      // 361: aload 14
      // 363: fconst_0
      // 364: nop
      // 365: fconst_0
      // 366: nop
      // 367: fconst_0
      // 368: nop
      // 369: bipush 0
      // 36a: nop
      // 36b: fconst_0
      // 36c: nop
      // 36d: sipush 992
      // 370: aconst_null
      // 371: nop
      // 372: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 375: aload 0
      // 376: invokevirtual oxxxde/طك.getDefaultFont ()Loxxxde/جً;
      // 379: aload 0
      // 37a: invokevirtual oxxxde/طك.textPipeline ()Loxxxde/صؤ;
      // 37d: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 380: aload 31
      // 382: fload 25
      // 384: fload 27
      // 386: fload 24
      // 388: aload 15
      // 38a: fconst_0
      // 38b: nop
      // 38c: fconst_0
      // 38d: nop
      // 38e: fconst_0
      // 38f: nop
      // 390: bipush 0
      // 391: nop
      // 392: fconst_0
      // 393: nop
      // 394: sipush 992
      // 397: aconst_null
      // 398: nop
      // 399: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 39c: return
   }

   public fun scrollViewHeight(): Float {
      return this.cachedViewHeight
   }

   public fun scrollOffsetValue(): Float {
      return this.scroll.value()
   }

   private fun contentHeight(itemCount: Int): Float {
      return if ((itemCount + 1) / 2 == 0) 0.0F else (itemCount + 1) / 2 * this.rowHeight + ((itemCount + 1) / 2 + -1) * this.getPadding()
   }

   public override fun textPipeline(): صؤ {
      return صؤ.GUI_TEXT
   }

   private fun buttonIndex(area: ثء, mouseX: Float, mouseY: Float): Int? {
      val layout: ظٌ = this.buttonLayout(area)
      val var7: java.util.Iterator = CollectionsKt.getIndices(this.filters).iterator()

      var var10000: Any
      while (true) {
         if (var7.hasNext()) {
            val `element$iv`: Any = var7.next()
            if (!this.inside(
               layout.startX + (float)(`element$iv` as java.lang.Number).intValue() * (layout.width + this.buttonGap),
               layout.y,
               layout.width,
               this.buttonHeight,
               mouseX,
               mouseY
            )) {
               continue
            }

            var10000 = `element$iv`
            break
         }

         var10000 = null
         break
      }

      return var10000 as Int
   }

   private fun renderList(area: ثء, visibleItems: List<جة<ز>>, scrollOffset: Float, mouseX: Int, mouseY: Int) {
      if (!(area.width <= 0.0F) && !(area.height <= 0.0F) && !visibleItems.isEmpty()) {
         جِ.INSTANCE.start(area.left, area.top, area.width, area.height)
         val bottom: Float = area.top + area.height

         for (`element$iv` in visibleItems) {
            val animatedItem: جة = `element$iv` as جة
            val bounds: ثء = this.eventCardBounds(area, (`element$iv` as جة).position, scrollOffset)
            val cardY: Float = bounds.top + (1.0F - (`element$iv` as جة).presence) * 4.0F
            if (cardY + this.rowHeight > area.top && cardY < bottom) {
               this.renderCard(animatedItem.value as ز, bounds.left, cardY, bounds.width, mouseX, mouseY, animatedItem.presence)
            }
         }

         جِ.INSTANCE.end()
      }
   }

   public override fun render(mouseX: Int, mouseY: Int, partialTicks: Float) {
      super.render(mouseX, mouseY, partialTicks)
      this.syncItems()
      val area: ثء = this.contentArea()
      val footer: ثء = this.footerArea(area)
      val listArea: ثء = this.listArea(area, footer)
      val visibleItems: java.util.List = this.filteredItems()
      this.renderedItems = this.listAnimations.update(visibleItems, { it: ز ->
         it.anarchy
      })
      this.cachedTotalHeight = this.contentHeight(visibleItems.size())
      this.cachedViewHeight = listArea.height
      this.scroll.setMax(RangesKt.coerceAtLeast(this.cachedTotalHeight - this.cachedViewHeight, 0.0F))
      this.scroll.update()
      this.renderList(listArea, this.renderedItems, this.scroll.value(), mouseX, mouseY)
      this.renderEmptyState(listArea, this.emptyStateText(visibleItems))
      this.renderButtons(footer, mouseX, mouseY)
   }

   public fun scrollContentHeight(): Float {
      return this.cachedTotalHeight
   }

   private fun ثء.contains(mouseX: Float, mouseY: Float): Boolean {
      return this.inside(`$this$contains`.left, `$this$contains`.top, `$this$contains`.width, `$this$contains`.height, mouseX, mouseY)
   }

   public override fun rectPipeline(): صؤ {
      return صؤ.GUI_RECT
   }

   private fun renderEmptyLabel(area: ثء, text: String, progress: Float, offsetY: Float) {
      جً.drawCenteredText$default(
         this.getDefaultFont().priority(this.textPipeline()),
         text,
         area.left + area.width * 0.5F,
         area.top + area.height * 0.5F - 6.5F * 0.5F + offsetY,
         6.5F,
         ثْ.INSTANCE.value(this.getAlpha() * 0.45F * progress),
         0.0F,
         32,
         null
      )
   }

   private fun renderButtons(area: ثء, mouseX: Int, mouseY: Int) {
      if (!(area.width <= 0.0F) && !(area.height <= 0.0F) && !this.filters.isEmpty()) {
         val layout: ظٌ = this.buttonLayout(area)
         جِ.INSTANCE.start(area.left, area.top, area.width, area.height)
         val `$this$forEachIndexed$iv`: java.lang.Iterable = this.filters
         var `index$iv`: Int = 0

         for (`item$iv` in `$this$forEachIndexed$iv`) {
            val var10: Int = `index$iv`++
            if (var10 < 0) {
               CollectionsKt.throwIndexOverflow()
            }

            this.renderButton(layout.startX + (float)var10 * (layout.width + this.buttonGap), layout.y, layout.width, `item$iv` as ث, mouseX, mouseY)
         }

         جِ.INSTANCE.end()
      }
   }

   public fun resetScroll() {
      this.scroll = زع(0.0F, 1, null)
   }

   private fun emptyStateText(visibleItems: List<ز>): String {
      if (!visibleItems.isEmpty()) {
         return ""
      } else {
         return if (!this.items.isEmpty())
            "Ничего не найдено"
            else
            (if (this.apiLoading) "Загружаю события..." else (if (this.apiFailed) "Не удалось загрузить события" else "Событий пока нет"))
         }
   }

   private fun updateScrollOffset(filter: ث, hovered: Boolean, maxScrollOffset: Float): Float {
      val nowNs: Long = System.nanoTime()
      val deltaSec: Float = if (filter.lastUpdateNs == 0L) 0.0F else (float)(RangesKt.coerceAtLeast(nowNs - filter.lastUpdateNs, 0L) / 1.0E9)
      filter.lastUpdateNs = nowNs
      if (maxScrollOffset <= 0.0F) {
         filter.scrollOffset = 0.0F
         return 0.0F
      } else {
         filter.scrollOffset = if (hovered)
            RangesKt.coerceAtMost(
               filter.scrollOffset
                  + (
                        if ((if (hovered) this.hoverScrollDurationMs else this.returnScrollDurationMs) <= 0.0F)
                           maxScrollOffset
                           else
                           maxScrollOffset / ((if (hovered) this.hoverScrollDurationMs else this.returnScrollDurationMs) / 1000.0F)
                     )
                     * deltaSec,
               maxScrollOffset
            )
            else
            RangesKt.coerceAtLeast(
               filter.scrollOffset
                  - (
                        if ((if (hovered) this.hoverScrollDurationMs else this.returnScrollDurationMs) <= 0.0F)
                           maxScrollOffset
                           else
                           maxScrollOffset / ((if (hovered) this.hoverScrollDurationMs else this.returnScrollDurationMs) / 1000.0F)
                     )
                     * deltaSec,
               0.0F
            )
            return filter.scrollOffset
      }
   }

   private fun toTransformedX(x: Float): Float {
      this.scratchPos.set(x, 0.0F, 0.0F)
      بد.INSTANCE.transformPosition(this.scratchPos)
      return this.scratchPos.x
   }

   init {
      this.panelWidth = panelWidth
      this.contentTopOffset = contentTopOffset
      this.onJoinAnarchy = onJoinAnarchy
      this.rowHeight = 33.0F
      this.cardGap = 5.0F
      this.buttonHeight = 22.0F
      this.buttonGap = 4.0F
      this.footerHeight = 30.0F
      this.actionButtonSize = 18.0F
      this.actionIconSize = 5.6F
      this.hoverScrollDurationMs = 900.0F
      this.returnScrollDurationMs = 220.0F
      this.scratchPos = Vector3f()
      this.filters = CollectionsKt.listOf(
         ث("Все", null, true, 0.0F, 0L, null, null, 122, null),
         ث("1x", CollectionsKt.listOf(IntRange(101, 199)), false, 0.0F, 0L, null, null, 124, null),
         ث("2x", CollectionsKt.listOf(IntRange(201, 299)), false, 0.0F, 0L, null, null, 124, null),
         ث("3x", CollectionsKt.listOf(IntRange(301, 399)), false, 0.0F, 0L, null, null, 124, null),
         ث("5x", CollectionsKt.listOf(IntRange(501, 599)), false, 0.0F, 0L, null, null, 124, null),
         ث("10x", CollectionsKt.listOf(IntRange(901, 999)), false, 0.0F, 0L, null, null, 124, null)
      )
      this.itemAnimations = HashMap<>()
      this.cardHoverAnimations = HashMap<>()
      this.actionHoverAnimations = HashMap<>()
      this.listAnimations = ثّ<>(0.0F, 0.0F, 3, null)
      this.emptyTextAnimation = ري(1.0F)
      this.items = CollectionsKt.emptyList()
      this.renderedItems = CollectionsKt.emptyList()
      this.emptyText = ""
      this.previousEmptyText = ""
      this.normalizedSearch = ""
      this.apiGeneration = -1L
      this.renderedSecond = -1L
      this.scroll = زع(0.0F, 1, null)
   }

   private fun footerArea(area: ثء): ثء {
      val height: Float = RangesKt.coerceAtMost(this.footerHeight, area.height)
      return ثء(area.left, area.top + area.height - height, area.width, height)
   }

   private fun inside(x: Float, y: Float, width: Float, height: Float, mouseX: Float, mouseY: Float): Boolean {
      return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height
   }

   public override fun onMouseScroll(mouseX: Int, mouseY: Int, vertical: Float) {
      super.onMouseScroll(mouseX, mouseY, vertical)
      val area: ثء = this.contentArea()
      if (this.contains(this.listArea(area, this.footerArea(area)), (float)mouseX, (float)mouseY)) {
         this.scrollWheel(vertical)
      }
   }

   private fun syncItems() {
      val snapshot: خَ = خم.INSTANCE.snapshot()
      val now: Long = System.currentTimeMillis()
      val currentSecond: Long = now / 1000L
      if (snapshot.generation != this.apiGeneration || now / 1000L != this.renderedSecond) {
         this.apiGeneration = snapshot.generation
         this.renderedSecond = currentSecond
         this.apiLoading = snapshot.loading
         this.apiFailed = snapshot.failed
         var `$i$f$map`: HashSet = snapshot.events as java.lang.Iterable
         val `$this$mapTo$iv$iv`: java.util.Collection = ArrayList()

         for (p0 in `$i$f$map`) {
            val var16: Int = (p0 as صة).anarchy
            if (100 <= var16 && var16 < 1000) {
               `$this$mapTo$iv$iv`.add(p0)
            }
         }

         val threeDigitEvents: java.util.List = `$this$mapTo$iv$iv` as java.util.List
         var var37: java.lang.Iterable = `$this$mapTo$iv$iv` as java.util.List
         `$i$f$map` = HashSet()

         for (var45 in var37) {
            `$i$f$map`.add((var45 as صة).anarchy)
         }

         val var36: HashSet = `$i$f$map`
         this.itemAnimations.keySet().retainAll(`$i$f$map`)
         this.cardHoverAnimations.keySet().retainAll(var36)
         this.actionHoverAnimations.keySet().retainAll(var36)
         var37 = threeDigitEvents
         val var44: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(threeDigitEvents, 10))

         for (var50 in var37) {
            val var51: صة = var50 as صة
            val var10000: Int = (var50 as صة).anarchy
            val var10001: java.lang.String = "Анархия ${(var50 as صة).anarchy}"
            val var10002: java.lang.String = var51.name
            val var10003: java.lang.String = var51.statusText(now)
            val var10004: Boolean = var51.known
            val `$this$getOrPut$iv`: java.util.Map = this.itemAnimations
            val `key$iv`: Int = var51.anarchy
            val `value$iv`: Any = `$this$getOrPut$iv`.get(`key$iv`)
            val var10005: Any
            if (`value$iv` == null) {
               val var27: ري = ري(0.0F, 1, null)
               `$this$getOrPut$iv`.put(`key$iv`, var27)
               var10005 = var27
            } else {
               var10005 = `value$iv`
            }

            var44.add(ز(var10000, var10001, var10002, var10003, var10004, var10005 as ري))
         }

         this.items = var44 as MutableList<ز>
      }
   }

   public override fun onMouseClick(mouseX: Int, mouseY: Int, button: Int) {
      super.onMouseClick(mouseX, mouseY, button)
      if (button == 0) {
         val area: ثء = this.contentArea()
         if (this.contains(area, (float)mouseX, (float)mouseY)) {
            val footer: ثء = this.footerArea(area)
            val listArea: ثء = this.listArea(area, footer)
            if (this.contains(listArea, (float)mouseX, (float)mouseY)) {
               val var18: java.lang.Iterable = CollectionsKt.asReversed(this.renderedItems)
               val var20: java.util.Collection = ArrayList()

               for (bounds in var18) {
                  if ((bounds as جة).present) {
                     var20.add(bounds)
                  }
               }

               for (var21 in var20 as java.util.List) {
                  val var22: جة = var21 as جة
                  val var24: ثء = this.eventCardBounds(listArea, (var21 as جة).position, this.scroll.value())
                  if (this.contains(
                     this.eventActionButtonBounds(var24.left, var24.top + (1.0F - var22.presence) * 4.0F, var24.width), (float)mouseX, (float)mouseY
                  )) {
                     this.onJoinAnarchy((var22.value as ز).anarchy)
                     return
                  }
               }
            } else {
               val var10000: Int = this.buttonIndex(footer, (float)mouseX, (float)mouseY)
               if (var10000 != null) {
                  this.selectFilter(var10000.intValue())
               }
            }
         }
      }
   }

   public fun setSearchQuery(query: String) {
      val var10000: java.lang.String = StringsKt.trim(query).toString().toLowerCase(Locale.ROOT)
      if (!(var10000 == this.normalizedSearch)) {
         this.normalizedSearch = var10000
         this.resetScroll()
      }
   }

   private fun selectFilter(selectedIndex: Int) {
      val `$this$forEachIndexed$iv`: java.lang.Iterable = this.filters
      var `index$iv`: Int = 0

      for (`item$iv` in `$this$forEachIndexed$iv`) {
         val var7: Int = `index$iv`++
         if (var7 < 0) {
            CollectionsKt.throwIndexOverflow()
         }

         (`item$iv` as ث).active = var7 == selectedIndex
      }

      this.resetScroll()
   }

   private fun trimToWidth(text: String, maxWidth: Float, size: Float): String {
      if (maxWidth <= 0.0F) {
         return ""
      } else if (جً.getWidth$default(this.getDefaultFont(), text, size, 0.0F, 4, null) <= maxWidth) {
         return text
      } else {
         val suffix: java.lang.String = "..."
         if (جً.getWidth$default(this.getDefaultFont(), "...", size, 0.0F, 4, null) > maxWidth) {
            return ""
         } else {
            // $VF: Unable to resugar Kotlin loop from Java for loop
            var end: Int = text.length()
            while (true) {
               if (end > 0) break
               val var10000: java.lang.String = text.substring(0, end)
               val candidate: java.lang.String = "${StringsKt.trimEnd(var10000).toString()}$suffix"
               if (جً.getWidth$default(this.getDefaultFont(), candidate, size, 0.0F, 4, null) <= maxWidth) {
                  return candidate
               }

               end--
            }

            return suffix
         }
      }
   }

   private fun buttonLayout(area: ثء): ظٌ {
      val count: Int = RangesKt.coerceAtLeast(this.filters.size(), 1)
      val width: Float = RangesKt.coerceAtLeast((area.width - this.buttonGap * (float)(count + -1)) / (float)count, 20.0F)
      val rowWidth: Float = count * width + this.buttonGap * (count + -1)
      return ظٌ(width, area.left + RangesKt.coerceAtLeast(area.width - rowWidth, 0.0F) * 0.5F, area.top + (area.height - this.buttonHeight) * 0.5F)
   }

   public fun setScrollProgress(progress: Float, instant: Boolean = false) {
      val target: Float = -this.scroll.max() * RangesKt.coerceIn(progress, 0.0F, 1.0F)
      this.scroll.setTargetValue(target)
      if (instant || this.scroll.max() <= 0.0F) {
         this.scroll.setValue(target)
      }
   }

   public override fun iconsPipeline(): صؤ {
      return صؤ.GUI_SPECIAL
   }

   private fun renderEmptyState(area: ثء, targetText: String) {
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
      // 00: aload 1
      // 01: invokevirtual oxxxde/ثء.getWidth ()F
      // 04: fconst_0
      // 05: nop
      // 06: fcmpg
      // 07: ifle 14
      // 0a: aload 1
      // 0b: invokevirtual oxxxde/ثء.getHeight ()F
      // 0e: fconst_0
      // 0f: nop
      // 10: fcmpg
      // 11: ifgt 15
      // 14: return
      // 15: aload 2
      // 16: nop
      // 17: aload 0
      // 18: getfield oxxxde/طك.emptyText Ljava/lang/String;
      // 1b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 1e: ifne 41
      // 21: aload 0
      // 22: aload 0
      // 23: getfield oxxxde/طك.emptyText Ljava/lang/String;
      // 26: putfield oxxxde/طك.previousEmptyText Ljava/lang/String;
      // 29: aload 0
      // 2a: aload 2
      // 2b: nop
      // 2c: putfield oxxxde/طك.emptyText Ljava/lang/String;
      // 2f: aload 0
      // 30: getfield oxxxde/طك.emptyTextAnimation Loxxxde/ري;
      // 33: fconst_0
      // 34: nop
      // 35: fconst_0
      // 36: nop
      // 37: aconst_null
      // 38: nop
      // 39: bipush 4
      // 3a: nop
      // 3b: aconst_null
      // 3c: nop
      // 3d: invokestatic oxxxde/ري.animate$default (Loxxxde/ري;FFLoxxxde/شل;ILjava/lang/Object;)F
      // 40: pop
      // 41: aload 0
      // 42: getfield oxxxde/طك.emptyTextAnimation Loxxxde/ري;
      // 45: fconst_1
      // 46: nop
      // 47: ldc_w 190.0
      // 4a: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 4d: astore 4
      // 4f: new oxxxde/خآ
      // 52: dup
      // 53: aload 4
      // 55: invokespecial oxxxde/خآ.<init> (Loxxxde/بف;)V
      // 58: checkcast oxxxde/شل
      // 5b: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 5e: fconst_0
      // 5f: nop
      // 60: fconst_1
      // 61: nop
      // 62: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 65: fstore 3
      // 66: aload 0
      // 67: getfield oxxxde/طك.previousEmptyText Ljava/lang/String;
      // 6a: checkcast java/lang/CharSequence
      // 6d: invokeinterface java/lang/CharSequence.length ()I 1
      // 72: ifle 7a
      // 75: bipush 1
      // 76: nop
      // 77: goto 7c
      // 7a: bipush 0
      // 7b: nop
      // 7c: ifeq 99
      // 7f: fload 3
      // 80: ldc_w 0.999
      // 83: fcmpg
      // 84: ifge 99
      // 87: aload 0
      // 88: aload 1
      // 89: aload 0
      // 8a: getfield oxxxde/طك.previousEmptyText Ljava/lang/String;
      // 8d: fconst_1
      // 8e: nop
      // 8f: fload 3
      // 90: fsub
      // 91: ldc_w -2.0
      // 94: fload 3
      // 95: fmul
      // 96: invokespecial oxxxde/طك.renderEmptyLabel (Loxxxde/ثء;Ljava/lang/String;FF)V
      // 99: aload 0
      // 9a: getfield oxxxde/طك.emptyText Ljava/lang/String;
      // 9d: checkcast java/lang/CharSequence
      // a0: invokeinterface java/lang/CharSequence.length ()I 1
      // a5: ifle ad
      // a8: bipush 1
      // a9: nop
      // aa: goto af
      // ad: bipush 0
      // ae: nop
      // af: ifeq cb
      // b2: fload 3
      // b3: ldc_w 0.001
      // b6: fcmpl
      // b7: ifle cb
      // ba: aload 0
      // bb: aload 1
      // bc: aload 0
      // bd: getfield oxxxde/طك.emptyText Ljava/lang/String;
      // c0: fload 3
      // c1: fconst_2
      // c2: nop
      // c3: fconst_1
      // c4: nop
      // c5: fload 3
      // c6: fsub
      // c7: fmul
      // c8: invokespecial oxxxde/طك.renderEmptyLabel (Loxxxde/ثء;Ljava/lang/String;FF)V
      // cb: fload 3
      // cc: ldc_w 0.999
      // cf: fcmpl
      // d0: iflt da
      // d3: aload 0
      // d4: ldc_w ""
      // d7: putfield oxxxde/طك.previousEmptyText Ljava/lang/String;
      // da: return
   }

   private fun filteredItems(): List<ز> {
      val regular: java.util.Iterator = this.filters.iterator()

      var var10000: Any
      while (true) {
         if (regular.hasNext()) {
            val `first$iv`: Any = regular.next()
            if (!(`first$iv` as ث).active) {
               continue
            }

            var10000 = `first$iv`
            break
         }

         var10000 = null
         break
      }

      var var40: java.util.List = if (var10000 as ث != null) (var10000 as ث).anarchyRanges else null
      if (var40 == null) {
         var40 = CollectionsKt.emptyList()
      }

      val ranges: java.util.List = var40
      val var27: java.lang.Iterable = this.items
      var var30: ArrayList = ArrayList()

      for (`element$iv` in var27) {
         var p0: ز
         run label138@{
            p0 = `element$iv` as ز
            if (!ranges.isEmpty()) {
               val matchesSearch: java.lang.Iterable = ranges
               var var41: Boolean
               if (ranges is java.util.Collection && (ranges as java.util.Collection).isEmpty()) {
                  var41 = false
               } else {
                  run label133@{
                     for (`element$ivx` in matchesSearch) {
                        val var18: Int = (`element$ivx` as IntRange).getFirst()
                        val var19: Int = (`element$ivx` as IntRange).getLast()
                        val var20: Int = p0.anarchy
                        if (var18 <= var20 && var20 <= var19) {
                           var41 = true
                           return@label133
                        }
                     }

                     var41 = false
                  }
               }

               if (!var41) {
                  var42 = false
                  return@label138
               }
            }

            var42 = true
         }

         if (var42
            && (
               StringsKt.isBlank(this.normalizedSearch)
                  || StringsKt.contains(p0.title, this.normalizedSearch, true)
                  || StringsKt.contains(p0.name, this.normalizedSearch, true)
                  || StringsKt.contains(p0.status, this.normalizedSearch, true)
            )) {
            var30.add(`element$iv`)
         }
      }

      val var25: java.lang.Iterable = var30
      var30 = ArrayList()
      val var33: ArrayList = ArrayList()

      for (var36 in var25) {
         if ((var36 as ز).highlighted) {
            var30.add(var36)
         } else {
            var33.add(var36)
         }
      }

      val var23: Pair = Pair<>(var30, var33)
      return CollectionsKt.plus(var23.component1() as java.util.List, var23.component2() as java.util.List)
   }

   private fun renderButton(x: Float, y: Float, width: Float, filter: ث, mouseX: Int, mouseY: Int) {
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
      // 001: fload 1
      // 002: fload 2
      // 003: fload 3
      // 004: aload 0
      // 005: getfield oxxxde/طك.buttonHeight F
      // 008: iload 5
      // 00a: i2f
      // 00b: iload 6
      // 00d: i2f
      // 00e: invokespecial oxxxde/طك.inside (FFFFFF)Z
      // 011: istore 7
      // 013: aload 4
      // 015: invokevirtual oxxxde/ث.getSelectionAnimation ()Loxxxde/ري;
      // 018: aload 4
      // 01a: invokevirtual oxxxde/ث.getActive ()Z
      // 01d: ifeq 025
      // 020: fconst_1
      // 021: nop
      // 022: goto 027
      // 025: fconst_0
      // 026: nop
      // 027: ldc_w 220.0
      // 02a: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 02d: astore 9
      // 02f: new oxxxde/ضف
      // 032: dup
      // 033: aload 9
      // 035: invokespecial oxxxde/ضف.<init> (Loxxxde/بف;)V
      // 038: checkcast oxxxde/شل
      // 03b: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 03e: fstore 8
      // 040: aload 4
      // 042: invokevirtual oxxxde/ث.getHoverAnimation ()Loxxxde/ري;
      // 045: iload 7
      // 047: ifeq 04f
      // 04a: fconst_1
      // 04b: nop
      // 04c: goto 051
      // 04f: fconst_0
      // 050: nop
      // 051: ldc_w 170.0
      // 054: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 057: astore 10
      // 059: new oxxxde/صم
      // 05c: dup
      // 05d: aload 10
      // 05f: invokespecial oxxxde/صم.<init> (Loxxxde/بف;)V
      // 062: checkcast oxxxde/شل
      // 065: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 068: fconst_0
      // 069: nop
      // 06a: fconst_1
      // 06b: nop
      // 06c: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 06f: fstore 9
      // 071: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 074: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 077: ldc_w 0.01
      // 07a: ldc_w 0.02
      // 07d: fload 9
      // 07f: fmul
      // 080: fadd
      // 081: aload 0
      // 082: invokevirtual oxxxde/طك.getAlpha ()F
      // 085: fmul
      // 086: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 089: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 08c: ldc_w 0.05
      // 08f: aload 0
      // 090: invokevirtual oxxxde/طك.getAlpha ()F
      // 093: fmul
      // 094: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 097: fload 8
      // 099: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 09c: astore 10
      // 09e: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 0a1: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0a4: ldc_w 0.07
      // 0a7: ldc_w 0.02
      // 0aa: fload 9
      // 0ac: fmul
      // 0ad: fadd
      // 0ae: aload 0
      // 0af: invokevirtual oxxxde/طك.getAlpha ()F
      // 0b2: fmul
      // 0b3: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 0b6: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0b9: ldc_w 0.08
      // 0bc: aload 0
      // 0bd: invokevirtual oxxxde/طك.getAlpha ()F
      // 0c0: fmul
      // 0c1: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 0c4: fload 8
      // 0c6: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 0c9: astore 11
      // 0cb: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 0ce: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0d1: ldc_w 0.48
      // 0d4: ldc_w 0.14
      // 0d7: fload 9
      // 0d9: fmul
      // 0da: fadd
      // 0db: aload 0
      // 0dc: invokevirtual oxxxde/طك.getAlpha ()F
      // 0df: fmul
      // 0e0: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 0e3: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 0e6: aload 0
      // 0e7: invokevirtual oxxxde/طك.getAlpha ()F
      // 0ea: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 0ed: fload 8
      // 0ef: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 0f2: astore 12
      // 0f4: aload 0
      // 0f5: getfield oxxxde/طك.buttonHeight F
      // 0f8: ldc_w 0.31
      // 0fb: fmul
      // 0fc: fload 3
      // 0fd: ldc_w 0.16
      // 100: fmul
      // 101: invokestatic java/lang/Math.min (FF)F
      // 104: fstore 13
      // 106: ldc_w 3.0
      // 109: fstore 14
      // 10b: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 10e: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 111: aload 0
      // 112: invokevirtual oxxxde/طك.textPipeline ()Loxxxde/صؤ;
      // 115: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 118: astore 15
      // 11a: aload 15
      // 11c: aload 4
      // 11e: invokevirtual oxxxde/ث.getLabel ()Ljava/lang/String;
      // 121: fload 13
      // 123: fconst_0
      // 124: nop
      // 125: bipush 4
      // 126: nop
      // 127: aconst_null
      // 128: nop
      // 129: invokestatic oxxxde/جً.getWidth$default (Loxxxde/جً;Ljava/lang/String;FFILjava/lang/Object;)F
      // 12c: fstore 16
      // 12e: fload 3
      // 12f: fload 14
      // 131: fconst_2
      // 132: nop
      // 133: fmul
      // 134: fsub
      // 135: fconst_0
      // 136: nop
      // 137: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 13a: fstore 17
      // 13c: fload 16
      // 13e: fload 17
      // 140: fcmpl
      // 141: ifle 149
      // 144: bipush 1
      // 145: nop
      // 146: goto 14b
      // 149: bipush 0
      // 14a: nop
      // 14b: istore 18
      // 14d: fload 16
      // 14f: fload 17
      // 151: fsub
      // 152: fconst_0
      // 153: nop
      // 154: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 157: fstore 19
      // 159: aload 0
      // 15a: aload 4
      // 15c: iload 7
      // 15e: fload 19
      // 160: invokespecial oxxxde/طك.updateScrollOffset (Loxxxde/ث;ZF)F
      // 163: fstore 20
      // 165: iload 18
      // 167: ifeq 174
      // 16a: fload 1
      // 16b: fload 14
      // 16d: fadd
      // 16e: fload 20
      // 170: fsub
      // 171: goto 17d
      // 174: fload 1
      // 175: fload 3
      // 176: fload 16
      // 178: fsub
      // 179: ldc 0.5
      // 17b: fmul
      // 17c: fadd
      // 17d: fstore 21
      // 17f: fload 2
      // 180: aload 0
      // 181: getfield oxxxde/طك.buttonHeight F
      // 184: fload 13
      // 186: fsub
      // 187: ldc_w 0.46
      // 18a: fmul
      // 18b: fadd
      // 18c: fstore 22
      // 18e: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 191: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 194: aload 0
      // 195: invokevirtual oxxxde/طك.rectPipeline ()Loxxxde/صؤ;
      // 198: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 19b: aload 10
      // 19d: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 1a0: ldc_w 4.0
      // 1a3: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 1a6: ldc_w 0.95
      // 1a9: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 1ac: fconst_1
      // 1ad: nop
      // 1ae: aload 11
      // 1b0: invokevirtual oxxxde/جء.border (FLjava/awt/Color;)Loxxxde/جء;
      // 1b3: fload 1
      // 1b4: fload 2
      // 1b5: fload 3
      // 1b6: aload 0
      // 1b7: getfield oxxxde/طك.buttonHeight F
      // 1ba: invokevirtual oxxxde/جء.draw (FFFF)V
      // 1bd: aload 0
      // 1be: fload 1
      // 1bf: fload 14
      // 1c1: fadd
      // 1c2: invokespecial oxxxde/طك.toTransformedX (F)F
      // 1c5: fstore 23
      // 1c7: aload 0
      // 1c8: fload 1
      // 1c9: fload 3
      // 1ca: fadd
      // 1cb: fload 14
      // 1cd: fsub
      // 1ce: invokespecial oxxxde/طك.toTransformedX (F)F
      // 1d1: fstore 24
      // 1d3: fload 23
      // 1d5: fload 24
      // 1d7: invokestatic java/lang/Math.min (FF)F
      // 1da: fstore 25
      // 1dc: fload 23
      // 1de: fload 24
      // 1e0: invokestatic java/lang/Math.max (FF)F
      // 1e3: fstore 26
      // 1e5: fload 26
      // 1e7: fload 25
      // 1e9: fsub
      // 1ea: ldc_w 0.18
      // 1ed: fmul
      // 1ee: fconst_2
      // 1ef: nop
      // 1f0: ldc_w 6.0
      // 1f3: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 1f6: fstore 27
      // 1f8: nop
      // 1f9: iload 18
      // 1fb: ifeq 20e
      // 1fe: aload 15
      // 200: fload 25
      // 202: fload 26
      // 204: fconst_0
      // 205: nop
      // 206: fload 27
      // 208: invokevirtual oxxxde/جً.setFade (FFFF)Loxxxde/جً;
      // 20b: goto 213
      // 20e: aload 15
      // 210: invokevirtual oxxxde/جً.resetFade ()Loxxxde/جً;
      // 213: pop
      // 214: aload 15
      // 216: aload 4
      // 218: invokevirtual oxxxde/ث.getLabel ()Ljava/lang/String;
      // 21b: fload 21
      // 21d: fload 22
      // 21f: fload 13
      // 221: aload 12
      // 223: fconst_0
      // 224: nop
      // 225: fconst_0
      // 226: nop
      // 227: fconst_0
      // 228: nop
      // 229: bipush 0
      // 22a: nop
      // 22b: fconst_0
      // 22c: nop
      // 22d: sipush 992
      // 230: aconst_null
      // 231: nop
      // 232: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 235: aload 15
      // 237: invokevirtual oxxxde/جً.resetFade ()Loxxxde/جً;
      // 23a: pop
      // 23b: goto 249
      // 23e: astore 28
      // 240: aload 15
      // 242: invokevirtual oxxxde/جً.resetFade ()Loxxxde/جً;
      // 245: pop
      // 246: aload 28
      // 248: athrow
      // 249: return
   }
}
