package oxxxde

// $VF: Compiled from heavy
public class طا {
   private final val configRightHoverAnimation: ري
   private final val categoryTextAnimation: ري
   private final val pipelines: اس
   private final var previousCategory: ظص?
   private final val configRightIconAnimation: ري
   private final val searchPlaceholderTransition: حت
   private final var displayedCategory: ظص?
   private final val configCreateHoverAnimation: ري
   private final val searchFocusAnimation: ري
   private final val searchIconTransition: حت

   private fun renderConfigActionButton(layout: زْ, x: Float, hover: Float, alpha: Float) {
      ذر.INSTANCE
         .getBASIC_RECT()
         .priority(this.pipelines.rectPipeline())
         .round(4.0F)
         .color(ثْ.INSTANCE.surface((0.01F + 0.035F * hover) * alpha))
         .border(1.0F, ثْ.INSTANCE.title((0.07F + 0.055F * hover) * alpha))
         .draw(x, layout.topBarY, layout.topBarConfigButtonSize, layout.topBarHeight)
      }

   private fun renderCategoryContent(layout: زْ, category: ظص, uiScale: Float, alpha: Float, offsetY: Float) {
      if (!(alpha <= 0.001F)) {
         val iconSize: Float = layout.topBarHeight * 0.35F
         val textSize: Float = layout.topBarHeight * 0.25F
         val iconX: Float = layout.topBarInfoX + layout.uiPadding * 1.5F
         val iconY: Float = layout.topBarY + (layout.topBarHeight - iconSize) * 0.5F + offsetY
         val textX: Float = iconX + جً.getWidth$default(رَ.INSTANCE.getICON(), category.icon, iconSize, 0.0F, 4, null) + layout.uiPadding
         val textY: Float = layout.topBarY + (layout.topBarHeight - textSize) * 0.46F + offsetY
         val sectionRight: Float = layout.topBarInfoX + layout.topBarInfoWidth - layout.uiPadding * 1.5F
         val safeScale: Float = RangesKt.coerceAtLeast(uiScale, 0.01F)
         val minDescRegionX: Float = textX + layout.uiPadding + RangesKt.coerceAtLeast(layout.topBarInfoWidth * 0.05F, 6.0F)
         val maxDescRegionWidth: Float = RangesKt.coerceAtLeast(sectionRight - minDescRegionX, 0.0F)
         val minDescRegionWidth: Float = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(layout.topBarInfoWidth * 0.34F, 0.0F), maxDescRegionWidth)
         val descRegionWidth: Float = minDescRegionWidth
            + (maxDescRegionWidth - minDescRegionWidth) * RangesKt.coerceIn((safeScale - 0.75F) / 0.35F, 0.0F, 1.0F)
            val descRegionX: Float = RangesKt.coerceAtLeast(sectionRight - descRegionWidth, minDescRegionX)
         val textFont: جً = رَ.INSTANCE.getGS_MEDIUM().priority(this.pipelines.textPipeline())
         جً.drawText$default(
            رَ.INSTANCE.getICON().priority(this.pipelines.iconsPipeline()),
            category.icon,
            iconX,
            iconY,
            iconSize,
            ثْ.INSTANCE.icon(0.86F * alpha),
            0.0F,
            0.0F,
            0.0F,
            0,
            0.0F,
            992,
            null
         )
         جً.drawText$default(
            رَ.INSTANCE.getGS_MEDIUM().priority(this.pipelines.textPipeline()),
            category.name,
            textX,
            textY,
            textSize,
            ثْ.INSTANCE.title(0.86F * alpha),
            0.0F,
            0.0F,
            0.0F,
            0,
            0.0F,
            992,
            null
         )
         val staticDescX: Float = descRegionX + descRegionWidth - جً.getWidth$default(textFont, category.desc, textSize, 0.0F, 4, null)
         textFont.resetFade()
         جً.drawText$default(textFont, category.desc, staticDescX, textY, textSize, ثْ.INSTANCE.value(0.4F * alpha), 0.0F, 0.0F, 0.0F, 0, 0.0F, 992, null)
      }
   }

   private fun renderSearchSection(
      layout: زْ,
      currentCategory: ظص?,
      inputText: String,
      inputFocused: Boolean,
      inputSelected: Boolean,
      configMode: Boolean,
      configCloudMode: Boolean,
      mouseX: Float,
      mouseY: Float,
      alpha: Float
   ) {
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
      // 000: iload 6
      // 002: ifeq 211
      // 005: aload 1
      // 006: invokevirtual oxxxde/زْ.getTopBarConfigButtonSize ()F
      // 009: fconst_0
      // 00a: nop
      // 00b: fcmpl
      // 00c: ifle 211
      // 00f: aload 1
      // 010: invokevirtual oxxxde/زْ.getTopBarHeight ()F
      // 013: ldc 0.34
      // 015: fmul
      // 016: fstore 11
      // 018: aload 1
      // 019: invokevirtual oxxxde/زْ.getTopBarFolderButtonY ()F
      // 01c: aload 1
      // 01d: invokevirtual oxxxde/زْ.getTopBarHeight ()F
      // 020: fload 11
      // 022: fsub
      // 023: ldc 0.5
      // 025: fmul
      // 026: fadd
      // 027: ldc_w 0.1
      // 02a: fsub
      // 02b: fstore 12
      // 02d: aload 0
      // 02e: getfield oxxxde/طا.configRightIconAnimation Loxxxde/ري;
      // 031: iload 7
      // 033: ifeq 03b
      // 036: fconst_1
      // 037: nop
      // 038: goto 03d
      // 03b: fconst_0
      // 03c: nop
      // 03d: ldc_w 220.0
      // 040: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 043: astore 14
      // 045: new oxxxde/ذت
      // 048: dup
      // 049: aload 14
      // 04b: invokespecial oxxxde/ذت.<init> (Loxxxde/بف;)V
      // 04e: checkcast oxxxde/شل
      // 051: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 054: fconst_0
      // 055: nop
      // 056: fconst_1
      // 057: nop
      // 058: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 05b: fstore 13
      // 05d: aload 0
      // 05e: getfield oxxxde/طا.configCreateHoverAnimation Loxxxde/ري;
      // 061: aload 1
      // 062: fload 8
      // 064: fload 9
      // 066: invokevirtual oxxxde/زْ.isInsideTopBarConfigCreateAction (FF)Z
      // 069: ifeq 071
      // 06c: fconst_1
      // 06d: nop
      // 06e: goto 073
      // 071: fconst_0
      // 072: nop
      // 073: ldc_w 180.0
      // 076: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 079: astore 15
      // 07b: new oxxxde/ذز
      // 07e: dup
      // 07f: aload 15
      // 081: invokespecial oxxxde/ذز.<init> (Loxxxde/بف;)V
      // 084: checkcast oxxxde/شل
      // 087: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 08a: fconst_0
      // 08b: nop
      // 08c: fconst_1
      // 08d: nop
      // 08e: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 091: fstore 14
      // 093: aload 0
      // 094: getfield oxxxde/طا.configRightHoverAnimation Loxxxde/ري;
      // 097: aload 1
      // 098: fload 8
      // 09a: fload 9
      // 09c: invokevirtual oxxxde/زْ.isInsideTopBarFolderAction (FF)Z
      // 09f: ifeq 0a7
      // 0a2: fconst_1
      // 0a3: nop
      // 0a4: goto 0a9
      // 0a7: fconst_0
      // 0a8: nop
      // 0a9: ldc_w 180.0
      // 0ac: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 0af: astore 16
      // 0b1: new oxxxde/رث
      // 0b4: dup
      // 0b5: aload 16
      // 0b7: invokespecial oxxxde/رث.<init> (Loxxxde/بف;)V
      // 0ba: checkcast oxxxde/شل
      // 0bd: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 0c0: fconst_0
      // 0c1: nop
      // 0c2: fconst_1
      // 0c3: nop
      // 0c4: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0c7: fstore 15
      // 0c9: aload 0
      // 0ca: aload 1
      // 0cb: aload 1
      // 0cc: invokevirtual oxxxde/زْ.getTopBarConfigCreateButtonX ()F
      // 0cf: fload 14
      // 0d1: fload 10
      // 0d3: invokespecial oxxxde/طا.renderConfigActionButton (Loxxxde/زْ;FFF)V
      // 0d6: aload 1
      // 0d7: invokevirtual oxxxde/زْ.getTopBarConfigCreateButtonX ()F
      // 0da: aload 1
      // 0db: invokevirtual oxxxde/زْ.getTopBarConfigButtonSize ()F
      // 0de: ldc 0.5
      // 0e0: fmul
      // 0e1: fadd
      // 0e2: fstore 16
      // 0e4: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 0e7: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 0ea: aload 0
      // 0eb: getfield oxxxde/طا.pipelines Loxxxde/اس;
      // 0ee: invokeinterface oxxxde/اس.iconsPipeline ()Loxxxde/صؤ; 1
      // 0f3: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 0f6: ldc_w "C"
      // 0f9: fload 16
      // 0fb: fload 12
      // 0fd: ldc 0.5
      // 0ff: fadd
      // 100: fload 11
      // 102: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 105: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 108: ldc_w 0.8
      // 10b: fload 10
      // 10d: fmul
      // 10e: invokevirtual oxxxde/ثْ.icon (F)Ljava/awt/Color;
      // 111: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 114: fload 10
      // 116: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 119: fload 14
      // 11b: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 11e: fconst_0
      // 11f: nop
      // 120: bipush 32
      // 122: aconst_null
      // 123: nop
      // 124: invokestatic oxxxde/جً.drawCenteredText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 127: aload 0
      // 128: aload 1
      // 129: aload 1
      // 12a: invokevirtual oxxxde/زْ.getTopBarFolderButtonX ()F
      // 12d: fload 15
      // 12f: fload 10
      // 131: invokespecial oxxxde/طا.renderConfigActionButton (Loxxxde/زْ;FFF)V
      // 134: fconst_1
      // 135: nop
      // 136: fload 13
      // 138: fsub
      // 139: fstore 17
      // 13b: aload 1
      // 13c: invokevirtual oxxxde/زْ.getTopBarFolderButtonX ()F
      // 13f: aload 1
      // 140: invokevirtual oxxxde/زْ.getTopBarConfigButtonSize ()F
      // 143: ldc 0.5
      // 145: fmul
      // 146: fadd
      // 147: fstore 18
      // 149: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 14c: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 14f: aload 0
      // 150: getfield oxxxde/طا.pipelines Loxxxde/اس;
      // 153: invokeinterface oxxxde/اس.iconsPipeline ()Loxxxde/صؤ; 1
      // 158: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 15b: ldc_w "Q"
      // 15e: fload 18
      // 160: fload 12
      // 162: fload 13
      // 164: ldc 0.5
      // 166: fmul
      // 167: fadd
      // 168: fload 11
      // 16a: ldc_w 0.9
      // 16d: fload 17
      // 16f: ldc_w 0.1
      // 172: fmul
      // 173: fadd
      // 174: fmul
      // 175: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 178: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 17b: ldc_w 0.8
      // 17e: fload 10
      // 180: fmul
      // 181: fload 17
      // 183: fmul
      // 184: invokevirtual oxxxde/ثْ.icon (F)Ljava/awt/Color;
      // 187: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 18a: fload 10
      // 18c: fload 17
      // 18e: fmul
      // 18f: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 192: fload 15
      // 194: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 197: fconst_0
      // 198: nop
      // 199: bipush 32
      // 19b: aconst_null
      // 19c: nop
      // 19d: invokestatic oxxxde/جً.drawCenteredText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 1a0: aload 1
      // 1a1: invokevirtual oxxxde/زْ.getTopBarConfigAuxButtonX ()F
      // 1a4: aload 1
      // 1a5: invokevirtual oxxxde/زْ.getTopBarConfigButtonSize ()F
      // 1a8: ldc 0.5
      // 1aa: fmul
      // 1ab: fadd
      // 1ac: ldc 0.5
      // 1ae: fsub
      // 1af: fstore 19
      // 1b1: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 1b4: invokevirtual oxxxde/رَ.getICON2 ()Loxxxde/جً;
      // 1b7: aload 0
      // 1b8: getfield oxxxde/طا.pipelines Loxxxde/اس;
      // 1bb: invokeinterface oxxxde/اس.iconsPipeline ()Loxxxde/صؤ; 1
      // 1c0: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 1c3: ldc_w "3"
      // 1c6: fload 19
      // 1c8: fload 12
      // 1ca: ldc 0.5
      // 1cc: fadd
      // 1cd: fconst_1
      // 1ce: nop
      // 1cf: fload 13
      // 1d1: fsub
      // 1d2: ldc 0.5
      // 1d4: fmul
      // 1d5: fsub
      // 1d6: fload 11
      // 1d8: ldc_w 0.9
      // 1db: fload 13
      // 1dd: ldc_w 0.1
      // 1e0: fmul
      // 1e1: fadd
      // 1e2: fmul
      // 1e3: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 1e6: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1e9: ldc_w 0.8
      // 1ec: fload 10
      // 1ee: fmul
      // 1ef: fload 13
      // 1f1: fmul
      // 1f2: invokevirtual oxxxde/ثْ.icon (F)Ljava/awt/Color;
      // 1f5: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1f8: fload 10
      // 1fa: fload 13
      // 1fc: fmul
      // 1fd: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 200: fload 15
      // 202: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 205: fconst_0
      // 206: nop
      // 207: bipush 32
      // 209: aconst_null
      // 20a: nop
      // 20b: invokestatic oxxxde/جً.drawCenteredText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FILjava/lang/Object;)V
      // 20e: goto 247
      // 211: aload 0
      // 212: getfield oxxxde/طا.configRightIconAnimation Loxxxde/ري;
      // 215: fconst_0
      // 216: nop
      // 217: fconst_0
      // 218: nop
      // 219: aconst_null
      // 21a: nop
      // 21b: bipush 4
      // 21c: nop
      // 21d: aconst_null
      // 21e: nop
      // 21f: invokestatic oxxxde/ري.animate$default (Loxxxde/ري;FFLoxxxde/شل;ILjava/lang/Object;)F
      // 222: pop
      // 223: aload 0
      // 224: getfield oxxxde/طا.configCreateHoverAnimation Loxxxde/ري;
      // 227: fconst_0
      // 228: nop
      // 229: fconst_0
      // 22a: nop
      // 22b: aconst_null
      // 22c: nop
      // 22d: bipush 4
      // 22e: nop
      // 22f: aconst_null
      // 230: nop
      // 231: invokestatic oxxxde/ري.animate$default (Loxxxde/ري;FFLoxxxde/شل;ILjava/lang/Object;)F
      // 234: pop
      // 235: aload 0
      // 236: getfield oxxxde/طا.configRightHoverAnimation Loxxxde/ري;
      // 239: fconst_0
      // 23a: nop
      // 23b: fconst_0
      // 23c: nop
      // 23d: aconst_null
      // 23e: nop
      // 23f: bipush 4
      // 240: nop
      // 241: aconst_null
      // 242: nop
      // 243: invokestatic oxxxde/ري.animate$default (Loxxxde/ري;FFLoxxxde/شل;ILjava/lang/Object;)F
      // 246: pop
      // 247: iload 6
      // 249: ifeq 24d
      // 24c: return
      // 24d: aload 1
      // 24e: invokevirtual oxxxde/زْ.getTopBarSearchWidth ()F
      // 251: fconst_0
      // 252: nop
      // 253: fcmpg
      // 254: ifgt 258
      // 257: return
      // 258: aload 0
      // 259: getfield oxxxde/طا.searchFocusAnimation Loxxxde/ري;
      // 25c: iload 4
      // 25e: ifeq 266
      // 261: fconst_1
      // 262: nop
      // 263: goto 268
      // 266: fconst_0
      // 267: nop
      // 268: ldc_w 190.0
      // 26b: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 26e: astore 12
      // 270: new oxxxde/شت
      // 273: dup
      // 274: aload 12
      // 276: invokespecial oxxxde/شت.<init> (Loxxxde/بف;)V
      // 279: checkcast oxxxde/شل
      // 27c: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 27f: fconst_0
      // 280: nop
      // 281: fconst_1
      // 282: nop
      // 283: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 286: fstore 11
      // 288: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 28b: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 28e: aload 0
      // 28f: getfield oxxxde/طا.pipelines Loxxxde/اس;
      // 292: invokeinterface oxxxde/اس.rectPipeline ()Loxxxde/صؤ; 1
      // 297: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 29a: ldc 4.0
      // 29c: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 29f: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 2a2: ldc 0.01
      // 2a4: ldc_w 0.03
      // 2a7: fload 11
      // 2a9: fmul
      // 2aa: fadd
      // 2ab: fload 10
      // 2ad: fmul
      // 2ae: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 2b1: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 2b4: fconst_1
      // 2b5: nop
      // 2b6: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 2b9: ldc 0.07
      // 2bb: ldc_w 0.06
      // 2be: fload 11
      // 2c0: fmul
      // 2c1: fadd
      // 2c2: fload 10
      // 2c4: fmul
      // 2c5: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 2c8: invokevirtual oxxxde/ضِ.border (FLjava/awt/Color;)Loxxxde/ضِ;
      // 2cb: aload 1
      // 2cc: invokevirtual oxxxde/زْ.getTopBarSearchX ()F
      // 2cf: aload 1
      // 2d0: invokevirtual oxxxde/زْ.getTopBarY ()F
      // 2d3: aload 1
      // 2d4: invokevirtual oxxxde/زْ.getTopBarSearchWidth ()F
      // 2d7: aload 1
      // 2d8: invokevirtual oxxxde/زْ.getTopBarHeight ()F
      // 2db: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 2de: aload 1
      // 2df: invokevirtual oxxxde/زْ.getTopBarHeight ()F
      // 2e2: ldc_w 0.24
      // 2e5: fmul
      // 2e6: fstore 12
      // 2e8: aload 1
      // 2e9: invokevirtual oxxxde/زْ.getTopBarSearchX ()F
      // 2ec: aload 1
      // 2ed: invokevirtual oxxxde/زْ.getUiPadding ()F
      // 2f0: ldc_w 1.3
      // 2f3: fmul
      // 2f4: fadd
      // 2f5: fstore 13
      // 2f7: aload 1
      // 2f8: invokevirtual oxxxde/زْ.getTopBarY ()F
      // 2fb: aload 1
      // 2fc: invokevirtual oxxxde/زْ.getTopBarHeight ()F
      // 2ff: fload 12
      // 301: fsub
      // 302: ldc 0.46
      // 304: fmul
      // 305: fadd
      // 306: fstore 14
      // 308: aload 2
      // 309: nop
      // 30a: dup
      // 30b: ifnull 315
      // 30e: invokevirtual oxxxde/ظص.getSearchPlaceholder ()Ljava/lang/String;
      // 311: dup
      // 312: ifnonnull 319
      // 315: pop
      // 316: ldc_w "Search.."
      // 319: astore 15
      // 31b: aload 3
      // 31c: nop
      // 31d: checkcast java/lang/CharSequence
      // 320: astore 17
      // 322: aload 17
      // 324: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 327: ifeq 334
      // 32a: bipush 0
      // 32b: nop
      // 32c: istore 18
      // 32e: ldc_w " "
      // 331: goto 336
      // 334: aload 17
      // 336: checkcast java/lang/String
      // 339: astore 16
      // 33b: aload 3
      // 33c: nop
      // 33d: checkcast java/lang/CharSequence
      // 340: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 343: ifeq 355
      // 346: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 349: ldc_w 0.45
      // 34c: fload 10
      // 34e: fmul
      // 34f: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 352: goto 361
      // 355: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 358: ldc_w 0.76
      // 35b: fload 10
      // 35d: fmul
      // 35e: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 361: astore 17
      // 363: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 366: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 369: aload 16
      // 36b: fload 12
      // 36d: fconst_0
      // 36e: nop
      // 36f: bipush 4
      // 370: nop
      // 371: aconst_null
      // 372: nop
      // 373: invokestatic oxxxde/جً.getWidth$default (Loxxxde/جً;Ljava/lang/String;FFILjava/lang/Object;)F
      // 376: fstore 18
      // 378: aload 0
      // 379: getfield oxxxde/طا.searchPlaceholderTransition Loxxxde/حت;
      // 37c: aload 3
      // 37d: nop
      // 37e: checkcast java/lang/CharSequence
      // 381: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 384: ifeq 391
      // 387: iload 4
      // 389: ifne 391
      // 38c: aload 15
      // 38e: goto 393
      // 391: aconst_null
      // 392: nop
      // 393: invokevirtual oxxxde/حت.update (Ljava/lang/String;)Ljava/util/List;
      // 396: astore 19
      // 398: iload 5
      // 39a: ifeq 3f3
      // 39d: aload 3
      // 39e: nop
      // 39f: checkcast java/lang/CharSequence
      // 3a2: invokeinterface java/lang/CharSequence.length ()I 1
      // 3a7: ifle 3af
      // 3aa: bipush 1
      // 3ab: nop
      // 3ac: goto 3b1
      // 3af: bipush 0
      // 3b0: nop
      // 3b1: ifeq 3f3
      // 3b4: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 3b7: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 3ba: aload 0
      // 3bb: getfield oxxxde/طا.pipelines Loxxxde/اس;
      // 3be: invokeinterface oxxxde/اس.rectPipeline ()Loxxxde/صؤ; 1
      // 3c3: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 3c6: fconst_2
      // 3c7: nop
      // 3c8: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 3cb: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 3ce: ldc_w 0.16
      // 3d1: fload 10
      // 3d3: fmul
      // 3d4: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 3d7: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 3da: fload 13
      // 3dc: ldc 1.5
      // 3de: fsub
      // 3df: fload 14
      // 3e1: ldc_w 1.2
      // 3e4: fsub
      // 3e5: fload 18
      // 3e7: ldc_w 3.0
      // 3ea: fadd
      // 3eb: fload 12
      // 3ed: ldc 4.0
      // 3ef: fadd
      // 3f0: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 3f3: aload 3
      // 3f4: nop
      // 3f5: checkcast java/lang/CharSequence
      // 3f8: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 3fb: ifne 403
      // 3fe: bipush 1
      // 3ff: nop
      // 400: goto 405
      // 403: bipush 0
      // 404: nop
      // 405: ifne 40d
      // 408: iload 4
      // 40a: ifeq 43b
      // 40d: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 410: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 413: aload 0
      // 414: getfield oxxxde/طا.pipelines Loxxxde/اس;
      // 417: invokeinterface oxxxde/اس.textPipeline ()Loxxxde/صؤ; 1
      // 41c: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 41f: aload 16
      // 421: fload 13
      // 423: fload 14
      // 425: fload 12
      // 427: aload 17
      // 429: fconst_0
      // 42a: nop
      // 42b: fconst_0
      // 42c: nop
      // 42d: fconst_0
      // 42e: nop
      // 42f: bipush 0
      // 430: nop
      // 431: fconst_0
      // 432: nop
      // 433: sipush 992
      // 436: aconst_null
      // 437: nop
      // 438: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 43b: aload 19
      // 43d: checkcast java/lang/Iterable
      // 440: astore 20
      // 442: bipush 0
      // 443: nop
      // 444: istore 21
      // 446: aload 20
      // 448: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 44d: astore 22
      // 44f: aload 22
      // 451: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 456: ifeq 4b9
      // 459: aload 22
      // 45b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 460: astore 23
      // 462: aload 23
      // 464: checkcast oxxxde/ذإ
      // 467: astore 24
      // 469: bipush 0
      // 46a: nop
      // 46b: istore 25
      // 46d: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 470: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 473: aload 0
      // 474: getfield oxxxde/طا.pipelines Loxxxde/اس;
      // 477: invokeinterface oxxxde/اس.textPipeline ()Loxxxde/صؤ; 1
      // 47c: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 47f: aload 24
      // 481: invokevirtual oxxxde/ذإ.getText ()Ljava/lang/String;
      // 484: fload 13
      // 486: fload 14
      // 488: aload 24
      // 48a: invokevirtual oxxxde/ذإ.getOffsetY ()F
      // 48d: fadd
      // 48e: fload 12
      // 490: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 493: ldc_w 0.45
      // 496: fload 10
      // 498: fmul
      // 499: aload 24
      // 49b: invokevirtual oxxxde/ذإ.getAlpha ()F
      // 49e: fmul
      // 49f: invokevirtual oxxxde/ثْ.value (F)Ljava/awt/Color;
      // 4a2: fconst_0
      // 4a3: nop
      // 4a4: fconst_0
      // 4a5: nop
      // 4a6: fconst_0
      // 4a7: nop
      // 4a8: bipush 0
      // 4a9: nop
      // 4aa: fconst_0
      // 4ab: nop
      // 4ac: sipush 992
      // 4af: aconst_null
      // 4b0: nop
      // 4b1: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 4b4: nop
      // 4b5: nop
      // 4b6: goto 44f
      // 4b9: nop
      // 4ba: aload 2
      // 4bb: nop
      // 4bc: dup
      // 4bd: ifnull 4f2
      // 4c0: invokevirtual oxxxde/ظص.getSearchFieldIcon ()Ljava/lang/String;
      // 4c3: dup
      // 4c4: ifnull 4f2
      // 4c7: astore 23
      // 4c9: aload 23
      // 4cb: astore 24
      // 4cd: bipush 0
      // 4ce: nop
      // 4cf: istore 25
      // 4d1: aload 24
      // 4d3: checkcast java/lang/CharSequence
      // 4d6: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 4d9: ifne 4e1
      // 4dc: bipush 1
      // 4dd: nop
      // 4de: goto 4e3
      // 4e1: bipush 0
      // 4e2: nop
      // 4e3: nop
      // 4e4: ifeq 4ec
      // 4e7: aload 23
      // 4e9: goto 4ee
      // 4ec: aconst_null
      // 4ed: nop
      // 4ee: dup
      // 4ef: ifnonnull 4f6
      // 4f2: pop
      // 4f3: ldc_w "g"
      // 4f6: astore 20
      // 4f8: aload 0
      // 4f9: getfield oxxxde/طا.searchIconTransition Loxxxde/حت;
      // 4fc: aload 20
      // 4fe: invokevirtual oxxxde/حت.update (Ljava/lang/String;)Ljava/util/List;
      // 501: checkcast java/lang/Iterable
      // 504: astore 21
      // 506: bipush 0
      // 507: nop
      // 508: istore 22
      // 50a: aload 21
      // 50c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 511: astore 23
      // 513: aload 23
      // 515: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 51a: ifeq 590
      // 51d: aload 23
      // 51f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 524: astore 24
      // 526: aload 24
      // 528: checkcast oxxxde/ذإ
      // 52b: astore 25
      // 52d: bipush 0
      // 52e: nop
      // 52f: istore 26
      // 531: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 534: invokevirtual oxxxde/رَ.getICON ()Loxxxde/جً;
      // 537: aload 0
      // 538: getfield oxxxde/طا.pipelines Loxxxde/اس;
      // 53b: invokeinterface oxxxde/اس.iconsPipeline ()Loxxxde/صؤ; 1
      // 540: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 543: aload 25
      // 545: invokevirtual oxxxde/ذإ.getText ()Ljava/lang/String;
      // 548: aload 1
      // 549: invokevirtual oxxxde/زْ.getTopBarSearchX ()F
      // 54c: aload 1
      // 54d: invokevirtual oxxxde/زْ.getTopBarSearchWidth ()F
      // 550: fadd
      // 551: aload 1
      // 552: invokevirtual oxxxde/زْ.getUiPadding ()F
      // 555: ldc_w 2.7
      // 558: fmul
      // 559: fsub
      // 55a: fload 14
      // 55c: fconst_1
      // 55d: nop
      // 55e: fadd
      // 55f: aload 25
      // 561: invokevirtual oxxxde/ذإ.getOffsetY ()F
      // 564: fadd
      // 565: fload 12
      // 567: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 56a: ldc_w 0.45
      // 56d: fload 10
      // 56f: fmul
      // 570: aload 25
      // 572: invokevirtual oxxxde/ذإ.getAlpha ()F
      // 575: fmul
      // 576: invokevirtual oxxxde/ثْ.icon (F)Ljava/awt/Color;
      // 579: fconst_0
      // 57a: nop
      // 57b: fconst_0
      // 57c: nop
      // 57d: fconst_0
      // 57e: nop
      // 57f: bipush 0
      // 580: nop
      // 581: fconst_0
      // 582: nop
      // 583: sipush 992
      // 586: aconst_null
      // 587: nop
      // 588: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 58b: nop
      // 58c: nop
      // 58d: goto 513
      // 590: nop
      // 591: iload 4
      // 593: ifeq 5b1
      // 596: iload 5
      // 598: ifne 5b1
      // 59b: invokestatic java/lang/System.currentTimeMillis ()J
      // 59e: ldc2_w 450
      // 5a1: ldiv
      // 5a2: ldc2_w 2
      // 5a5: lrem
      // 5a6: lconst_0
      // 5a7: nop
      // 5a8: lcmp
      // 5a9: ifne 5b1
      // 5ac: bipush 1
      // 5ad: nop
      // 5ae: goto 5b3
      // 5b1: bipush 0
      // 5b2: nop
      // 5b3: istore 21
      // 5b5: iload 21
      // 5b7: ifne 5bb
      // 5ba: return
      // 5bb: fload 13
      // 5bd: fload 18
      // 5bf: fadd
      // 5c0: fconst_1
      // 5c1: nop
      // 5c2: fadd
      // 5c3: fstore 22
      // 5c5: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 5c8: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Loxxxde/جً;
      // 5cb: aload 0
      // 5cc: getfield oxxxde/طا.pipelines Loxxxde/اس;
      // 5cf: invokeinterface oxxxde/اس.textPipeline ()Loxxxde/صؤ; 1
      // 5d4: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 5d7: ldc_w "|"
      // 5da: fload 22
      // 5dc: fload 14
      // 5de: fload 12
      // 5e0: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 5e3: ldc 0.86
      // 5e5: fload 10
      // 5e7: fmul
      // 5e8: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 5eb: fconst_0
      // 5ec: nop
      // 5ed: fconst_0
      // 5ee: nop
      // 5ef: fconst_0
      // 5f0: nop
      // 5f1: bipush 0
      // 5f2: nop
      // 5f3: fconst_0
      // 5f4: nop
      // 5f5: sipush 992
      // 5f8: aconst_null
      // 5f9: nop
      // 5fa: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 5fd: return
   }

   public fun render(
      layout: زْ,
      currentCategory: ظص?,
      inputText: String,
      inputFocused: Boolean,
      inputSelected: Boolean,
      uiScale: Float,
      configMode: Boolean,
      configCloudMode: Boolean,
      mouseX: Float,
      mouseY: Float,
      alpha: Float
   ) {
      this.renderCategorySection(layout, currentCategory, uiScale, alpha)
      this.renderSearchSection(layout, currentCategory, inputText, inputFocused, inputSelected, configMode, configCloudMode, mouseX, mouseY, alpha)
   }

   fun طا(pipelines: اس) {
      this.pipelines = pipelines
      this.configRightIconAnimation = ري(0.0F, 1, null)
      this.searchFocusAnimation = ري(0.0F, 1, null)
      this.configCreateHoverAnimation = ري(0.0F, 1, null)
      this.configRightHoverAnimation = ري(0.0F, 1, null)
      this.categoryTextAnimation = ري(1.0F)
      this.searchPlaceholderTransition = حت(0.0F, 0.0F, 3, null)
      this.searchIconTransition = حت(0.0F, 0.0F, 3, null)
   }

   private fun renderCategorySection(layout: زْ, currentCategory: ظص?, uiScale: Float, alpha: Float) {
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
      // 000: aload 1
      // 001: invokevirtual oxxxde/زْ.getTopBarInfoWidth ()F
      // 004: fconst_0
      // 005: nop
      // 006: fcmpg
      // 007: ifgt 00b
      // 00a: return
      // 00b: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 00e: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 011: aload 0
      // 012: getfield oxxxde/طا.pipelines Loxxxde/اس;
      // 015: invokeinterface oxxxde/اس.rectPipeline ()Loxxxde/صؤ; 1
      // 01a: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 01d: ldc 4.0
      // 01f: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 022: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 025: ldc 0.01
      // 027: fload 4
      // 029: fmul
      // 02a: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 02d: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 030: fconst_1
      // 031: nop
      // 032: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 035: ldc_w 0.06
      // 038: fload 4
      // 03a: fmul
      // 03b: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 03e: invokevirtual oxxxde/ضِ.border (FLjava/awt/Color;)Loxxxde/ضِ;
      // 041: aload 1
      // 042: invokevirtual oxxxde/زْ.getTopBarInfoX ()F
      // 045: aload 1
      // 046: invokevirtual oxxxde/زْ.getTopBarY ()F
      // 049: aload 1
      // 04a: invokevirtual oxxxde/زْ.getTopBarInfoWidth ()F
      // 04d: aload 1
      // 04e: invokevirtual oxxxde/زْ.getTopBarHeight ()F
      // 051: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 054: aload 2
      // 055: nop
      // 056: aload 0
      // 057: getfield oxxxde/طا.displayedCategory Loxxxde/ظص;
      // 05a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 05d: ifne 080
      // 060: aload 0
      // 061: aload 0
      // 062: getfield oxxxde/طا.displayedCategory Loxxxde/ظص;
      // 065: putfield oxxxde/طا.previousCategory Loxxxde/ظص;
      // 068: aload 0
      // 069: aload 2
      // 06a: nop
      // 06b: putfield oxxxde/طا.displayedCategory Loxxxde/ظص;
      // 06e: aload 0
      // 06f: getfield oxxxde/طا.categoryTextAnimation Loxxxde/ري;
      // 072: fconst_0
      // 073: nop
      // 074: fconst_0
      // 075: nop
      // 076: aconst_null
      // 077: nop
      // 078: bipush 4
      // 079: nop
      // 07a: aconst_null
      // 07b: nop
      // 07c: invokestatic oxxxde/ري.animate$default (Loxxxde/ري;FFLoxxxde/شل;ILjava/lang/Object;)F
      // 07f: pop
      // 080: aload 0
      // 081: getfield oxxxde/طا.categoryTextAnimation Loxxxde/ري;
      // 084: fconst_1
      // 085: nop
      // 086: ldc_w 190.0
      // 089: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 08c: astore 6
      // 08e: new oxxxde/زئ
      // 091: dup
      // 092: aload 6
      // 094: invokespecial oxxxde/زئ.<init> (Loxxxde/بف;)V
      // 097: checkcast oxxxde/شل
      // 09a: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 09d: fconst_0
      // 09e: nop
      // 09f: fconst_1
      // 0a0: nop
      // 0a1: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0a4: fstore 5
      // 0a6: aload 0
      // 0a7: getfield oxxxde/طا.previousCategory Loxxxde/ظص;
      // 0aa: dup
      // 0ab: ifnull 0ce
      // 0ae: astore 7
      // 0b0: bipush 0
      // 0b1: nop
      // 0b2: istore 8
      // 0b4: aload 0
      // 0b5: aload 1
      // 0b6: aload 7
      // 0b8: fload 3
      // 0b9: fload 4
      // 0bb: fconst_1
      // 0bc: nop
      // 0bd: fload 5
      // 0bf: fsub
      // 0c0: fmul
      // 0c1: ldc_w -2.0
      // 0c4: fload 5
      // 0c6: fmul
      // 0c7: invokespecial oxxxde/طا.renderCategoryContent (Loxxxde/زْ;Loxxxde/ظص;FFF)V
      // 0ca: nop
      // 0cb: goto 0d0
      // 0ce: pop
      // 0cf: nop
      // 0d0: aload 0
      // 0d1: getfield oxxxde/طا.displayedCategory Loxxxde/ظص;
      // 0d4: dup
      // 0d5: ifnull 0f7
      // 0d8: astore 7
      // 0da: bipush 0
      // 0db: nop
      // 0dc: istore 8
      // 0de: aload 0
      // 0df: aload 1
      // 0e0: aload 7
      // 0e2: fload 3
      // 0e3: fload 4
      // 0e5: fload 5
      // 0e7: fmul
      // 0e8: fconst_2
      // 0e9: nop
      // 0ea: fconst_1
      // 0eb: nop
      // 0ec: fload 5
      // 0ee: fsub
      // 0ef: fmul
      // 0f0: invokespecial oxxxde/طا.renderCategoryContent (Loxxxde/زْ;Loxxxde/ظص;FFF)V
      // 0f3: nop
      // 0f4: goto 0f9
      // 0f7: pop
      // 0f8: nop
      // 0f9: fload 5
      // 0fb: ldc_w 0.999
      // 0fe: fcmpl
      // 0ff: iflt 108
      // 102: aload 0
      // 103: aconst_null
      // 104: nop
      // 105: putfield oxxxde/طا.previousCategory Loxxxde/ظص;
      // 108: return
   }
}
