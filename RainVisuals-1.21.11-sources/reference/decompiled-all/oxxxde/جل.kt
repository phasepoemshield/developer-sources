package oxxxde

// $VF: Compiled from heavy
public class جل {
   private final val visibilityAnimation: ري
   private final val pipelines: اس
   private final val thumbHeightAnimation: ري
   private final val hoverAnimation: ري
   private final val thumbYAnimation: ري

   fun جل(pipelines: اس) {
      this.pipelines = pipelines
      this.visibilityAnimation = ري(0.0F, 1, null)
      this.hoverAnimation = ري(0.0F, 1, null)
      this.thumbHeightAnimation = ري(0.0F, 1, null)
      this.thumbYAnimation = ري(0.0F, 1, null)
   }

   public fun render(
      layout: زْ,
      contentHeight: Float,
      viewHeight: Float,
      scrollOffset: Float,
      alpha: Float,
      mouseX: Float = java.lang.Float.NaN,
      mouseY: Float = java.lang.Float.NaN,
      dragging: Boolean = false
   ): خف {
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
      // 001: ldc "layout"
      // 003: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 006: aload 1
      // 007: invokevirtual oxxxde/زْ.getScrollBarX ()F
      // 00a: fstore 9
      // 00c: aload 1
      // 00d: invokevirtual oxxxde/زْ.getScrollBarY ()F
      // 010: fstore 10
      // 012: ldc 2.5
      // 014: fstore 11
      // 016: aload 1
      // 017: invokevirtual oxxxde/زْ.getScrollBarHeight ()F
      // 01a: fstore 12
      // 01c: fload 2
      // 01d: fload 3
      // 01e: ldc 0.5
      // 020: fadd
      // 021: fcmpl
      // 022: ifle 032
      // 025: fload 12
      // 027: fconst_0
      // 028: nop
      // 029: fcmpl
      // 02a: ifle 032
      // 02d: bipush 1
      // 02e: nop
      // 02f: goto 034
      // 032: bipush 0
      // 033: nop
      // 034: istore 13
      // 036: aload 0
      // 037: getfield oxxxde/جل.visibilityAnimation Loxxxde/ري;
      // 03a: iload 13
      // 03c: ifeq 044
      // 03f: fconst_1
      // 040: nop
      // 041: goto 046
      // 044: fconst_0
      // 045: nop
      // 046: ldc 200.0
      // 048: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 04b: astore 15
      // 04d: new oxxxde/سك
      // 050: dup
      // 051: aload 15
      // 053: invokespecial oxxxde/سك.<init> (Loxxxde/بف;)V
      // 056: checkcast oxxxde/شل
      // 059: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 05c: fconst_0
      // 05d: nop
      // 05e: fconst_1
      // 05f: nop
      // 060: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 063: fstore 14
      // 065: iload 13
      // 067: ifne 06f
      // 06a: fload 12
      // 06c: goto 07c
      // 06f: fload 12
      // 071: fload 3
      // 072: fload 2
      // 073: fdiv
      // 074: fmul
      // 075: ldc 12.0
      // 077: fload 12
      // 079: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 07c: fstore 15
      // 07e: fload 12
      // 080: fload 15
      // 082: fsub
      // 083: fconst_0
      // 084: nop
      // 085: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 088: fstore 16
      // 08a: fload 2
      // 08b: fload 3
      // 08c: fsub
      // 08d: fconst_0
      // 08e: nop
      // 08f: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 092: fstore 17
      // 094: iload 13
      // 096: ifeq 0a1
      // 099: fload 17
      // 09b: fconst_0
      // 09c: nop
      // 09d: fcmpg
      // 09e: ifgt 0a6
      // 0a1: fconst_0
      // 0a2: nop
      // 0a3: goto 0b2
      // 0a6: fload 4
      // 0a8: fload 17
      // 0aa: fdiv
      // 0ab: fconst_0
      // 0ac: nop
      // 0ad: fconst_1
      // 0ae: nop
      // 0af: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0b2: fstore 18
      // 0b4: fload 10
      // 0b6: fload 16
      // 0b8: fload 18
      // 0ba: fmul
      // 0bb: fadd
      // 0bc: fstore 19
      // 0be: aload 0
      // 0bf: getfield oxxxde/جل.thumbHeightAnimation Loxxxde/ري;
      // 0c2: fload 15
      // 0c4: ldc 180.0
      // 0c6: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 0c9: astore 21
      // 0cb: new oxxxde/ظَ
      // 0ce: dup
      // 0cf: aload 21
      // 0d1: invokespecial oxxxde/ظَ.<init> (Loxxxde/بف;)V
      // 0d4: checkcast oxxxde/شل
      // 0d7: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 0da: fconst_0
      // 0db: nop
      // 0dc: fload 12
      // 0de: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0e1: fstore 20
      // 0e3: aload 0
      // 0e4: getfield oxxxde/جل.thumbYAnimation Loxxxde/ري;
      // 0e7: fload 19
      // 0e9: ldc 120.0
      // 0eb: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 0ee: astore 22
      // 0f0: new oxxxde/جَ
      // 0f3: dup
      // 0f4: aload 22
      // 0f6: invokespecial oxxxde/جَ.<init> (Loxxxde/بف;)V
      // 0f9: checkcast oxxxde/شل
      // 0fc: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 0ff: fload 10
      // 101: fload 10
      // 103: fload 12
      // 105: fadd
      // 106: fload 20
      // 108: fsub
      // 109: fload 10
      // 10b: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 10e: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 111: fstore 21
      // 113: new oxxxde/خف
      // 116: dup
      // 117: fload 9
      // 119: fload 10
      // 11b: fload 11
      // 11d: fload 12
      // 11f: fload 21
      // 121: fload 20
      // 123: iload 13
      // 125: invokespecial oxxxde/خف.<init> (FFFFFFZ)V
      // 128: astore 22
      // 12a: iload 8
      // 12c: ifne 13b
      // 12f: aload 22
      // 131: fload 6
      // 133: fload 7
      // 135: invokevirtual oxxxde/خف.contains (FF)Z
      // 138: ifeq 140
      // 13b: bipush 1
      // 13c: nop
      // 13d: goto 142
      // 140: bipush 0
      // 141: nop
      // 142: istore 23
      // 144: aload 0
      // 145: getfield oxxxde/جل.hoverAnimation Loxxxde/ري;
      // 148: iload 23
      // 14a: ifeq 157
      // 14d: iload 13
      // 14f: ifeq 157
      // 152: fconst_1
      // 153: nop
      // 154: goto 159
      // 157: fconst_0
      // 158: nop
      // 159: ldc 160.0
      // 15b: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 15e: astore 25
      // 160: new oxxxde/ذغ
      // 163: dup
      // 164: aload 25
      // 166: invokespecial oxxxde/ذغ.<init> (Loxxxde/بف;)V
      // 169: checkcast oxxxde/شل
      // 16c: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 16f: fconst_0
      // 170: nop
      // 171: fconst_1
      // 172: nop
      // 173: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 176: fstore 24
      // 178: fload 11
      // 17a: fload 24
      // 17c: fadd
      // 17d: fstore 25
      // 17f: fload 9
      // 181: fload 25
      // 183: fload 11
      // 185: fsub
      // 186: ldc 0.5
      // 188: fmul
      // 189: fsub
      // 18a: fstore 26
      // 18c: fload 5
      // 18e: fload 14
      // 190: fmul
      // 191: fstore 27
      // 193: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 196: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 199: aload 0
      // 19a: getfield oxxxde/جل.pipelines Loxxxde/اس;
      // 19d: invokeinterface oxxxde/اس.rectPipeline ()Loxxxde/صؤ; 1
      // 1a2: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 1a5: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1a8: ldc 0.07
      // 1aa: ldc 0.035
      // 1ac: fload 24
      // 1ae: fmul
      // 1af: fadd
      // 1b0: fload 27
      // 1b2: fmul
      // 1b3: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 1b6: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 1b9: fconst_1
      // 1ba: nop
      // 1bb: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 1be: ldc 0.95
      // 1c0: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 1c3: fload 26
      // 1c5: fload 10
      // 1c7: fload 25
      // 1c9: fload 12
      // 1cb: invokevirtual oxxxde/جء.draw (FFFF)V
      // 1ce: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 1d1: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 1d4: aload 0
      // 1d5: getfield oxxxde/جل.pipelines Loxxxde/اس;
      // 1d8: invokeinterface oxxxde/اس.rectPipeline ()Loxxxde/صؤ; 1
      // 1dd: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 1e0: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1e3: ldc 0.35
      // 1e5: ldc 0.35
      // 1e7: fload 24
      // 1e9: fmul
      // 1ea: fadd
      // 1eb: fload 27
      // 1ed: fmul
      // 1ee: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 1f1: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 1f4: fconst_1
      // 1f5: nop
      // 1f6: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 1f9: ldc 0.95
      // 1fb: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 1fe: fload 26
      // 200: fload 21
      // 202: fload 25
      // 204: fload 20
      // 206: invokevirtual oxxxde/جء.draw (FFFF)V
      // 209: new oxxxde/خف
      // 20c: dup
      // 20d: fload 26
      // 20f: fload 10
      // 211: fload 25
      // 213: fload 12
      // 215: fload 21
      // 217: fload 20
      // 219: iload 13
      // 21b: invokespecial oxxxde/خف.<init> (FFFFFFZ)V
      // 21e: areturn
   }
}
