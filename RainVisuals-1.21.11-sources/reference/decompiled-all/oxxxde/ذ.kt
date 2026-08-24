package oxxxde

import org.joml.Vector4f
import ru.ocz.protection.annotation.Compile
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat

// $VF: Compiled from heavy
@RecompileFormat
public class ذ : آ<ذُ> {
   public open val componentHeight: Float = 15.0F
   private final val boxTextPadding: Float
   private final val bindTextSize: Float
   private final val titleSize: Float = 6.6F
   private final val selectedExpand: Float
   private final var listening: Boolean
   private final val focusAnim: ري
   private final val textShiftAnim: ري
   private final val minBindWidth: Float
   private final val widthAnim: ري

   public override fun onKeyPress(mouseX: Int, mouseY: Int, button: Int) {
      super.onKeyPress(mouseX, mouseY, button)
      if (this.listening) {
         when (button) {
            256, 259, 261 -> this.getSetting().clear()
            257, 258, 260 -> this.getSetting().setKey(button)
            else -> this.getSetting().setKey(button)
         }

         this.listening = false
      }
   }

   private fun bindText(): String {
      return if (this.listening) "Нажмите.." else (if (this.getSetting().hasBind()) this.keyName(this.getSetting().getValue().intValue()) else "Нету")
   }

   @Compile
   public override fun onMouseClick(mouseX: Int, mouseY: Int, button: Int) {
      super.onMouseClick(mouseY, mouseX, button)
      if (button == 0) {
         val var5: Vector4f = this.bindRect(this.bindText())
         if (var5 == null) {
            throw NullPointerException("Null pointer access [field:25]")
         } else {
            if (mouseY >= var5.x && mouseY <= var5.x + var5.z && mouseX >= var5.y && mouseX <= var5.y + var5.w) {
               this.listening = true
            } else {
               this.listening = false
            }
         }
      }
   }

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
      // 004: invokespecial oxxxde/آ.render (IIF)V
      // 007: aload 0
      // 008: getfield oxxxde/ذ.focusAnim Loxxxde/ري;
      // 00b: aload 0
      // 00c: getfield oxxxde/ذ.listening Z
      // 00f: i2f
      // 010: ldc 220.0
      // 012: new oxxxde/َ
      // 015: dup
      // 016: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 019: invokespecial oxxxde/َ.<init> (Loxxxde/بف;)V
      // 01c: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 01f: fstore 4
      // 021: aload 0
      // 022: getfield oxxxde/ذ.textShiftAnim Loxxxde/ري;
      // 025: aload 0
      // 026: getfield oxxxde/ذ.listening Z
      // 029: i2f
      // 02a: ldc 220.0
      // 02c: new oxxxde/بث
      // 02f: dup
      // 030: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 033: invokespecial oxxxde/بث.<init> (Loxxxde/بف;)V
      // 036: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 039: fstore 5
      // 03b: aload 0
      // 03c: ldc 0.03
      // 03e: ldc 0.05
      // 040: invokevirtual oxxxde/ذ.themedSurface (FF)Ljava/awt/Color;
      // 043: astore 6
      // 045: aload 0
      // 046: ldc 0.05
      // 048: ldc 0.08
      // 04a: invokevirtual oxxxde/ذ.themedBorder (FF)Ljava/awt/Color;
      // 04d: astore 7
      // 04f: aload 0
      // 050: ldc 0.32
      // 052: ldc 1.0
      // 054: invokevirtual oxxxde/ذ.themedTitle (FF)Ljava/awt/Color;
      // 057: astore 8
      // 059: aload 0
      // 05a: ldc 0.28
      // 05c: ldc 0.82
      // 05e: fload 4
      // 060: ldc 0.14
      // 062: fmul
      // 063: fadd
      // 064: invokevirtual oxxxde/ذ.themedValue (FF)Ljava/awt/Color;
      // 067: astore 9
      // 069: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 06c: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 06f: aload 0
      // 070: invokevirtual oxxxde/ذ.rectPipeline ()Loxxxde/صؤ;
      // 073: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 076: aload 6
      // 078: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 07b: ldc 3.0
      // 07d: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 080: ldc 0.95
      // 082: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 085: fconst_1
      // 086: aload 7
      // 088: invokevirtual oxxxde/جء.border (FLjava/awt/Color;)Loxxxde/جء;
      // 08b: aload 0
      // 08c: invokevirtual oxxxde/ذ.getX ()F
      // 08f: aload 0
      // 090: invokevirtual oxxxde/ذ.getY ()F
      // 093: aload 0
      // 094: invokevirtual oxxxde/ذ.getWidth ()F
      // 097: aload 0
      // 098: invokevirtual oxxxde/ذ.getComponentHeight ()F
      // 09b: invokevirtual oxxxde/جء.draw (FFFF)V
      // 09e: aload 0
      // 09f: invokevirtual oxxxde/ذ.getDefaultFont ()Loxxxde/جً;
      // 0a2: aload 0
      // 0a3: invokevirtual oxxxde/ذ.textPipeline ()Loxxxde/صؤ;
      // 0a6: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 0a9: aload 0
      // 0aa: invokevirtual oxxxde/ذ.getSetting ()Loxxxde/رف;
      // 0ad: checkcast oxxxde/ذُ
      // 0b0: invokevirtual oxxxde/ذُ.getName ()Ljava/lang/String;
      // 0b3: aload 0
      // 0b4: invokevirtual oxxxde/ذ.getX ()F
      // 0b7: aload 0
      // 0b8: invokevirtual oxxxde/ذ.getPadding ()F
      // 0bb: fadd
      // 0bc: aload 0
      // 0bd: invokevirtual oxxxde/ذ.getY ()F
      // 0c0: ldc 3.3
      // 0c2: fadd
      // 0c3: aload 0
      // 0c4: getfield oxxxde/ذ.titleSize F
      // 0c7: aload 8
      // 0c9: fconst_0
      // 0ca: fconst_0
      // 0cb: fconst_0
      // 0cc: bipush 0
      // 0cd: fconst_0
      // 0ce: sipush 992
      // 0d1: aconst_null
      // 0d2: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 0d5: aload 0
      // 0d6: invokespecial oxxxde/ذ.bindText ()Ljava/lang/String;
      // 0d9: astore 10
      // 0db: aload 0
      // 0dc: aload 10
      // 0de: invokespecial oxxxde/ذ.bindRect (Ljava/lang/String;)Lorg/joml/Vector4f;
      // 0e1: astore 11
      // 0e3: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 0e6: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 0e9: aload 0
      // 0ea: invokevirtual oxxxde/ذ.rectPipeline ()Loxxxde/صؤ;
      // 0ed: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 0f0: aload 6
      // 0f2: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 0f5: ldc_w 2.2
      // 0f8: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 0fb: ldc 0.95
      // 0fd: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 100: fconst_1
      // 101: aload 7
      // 103: invokevirtual oxxxde/جء.border (FLjava/awt/Color;)Loxxxde/جء;
      // 106: aload 11
      // 108: getfield org/joml/Vector4f.x F
      // 10b: aload 11
      // 10d: getfield org/joml/Vector4f.y F
      // 110: aload 11
      // 112: getfield org/joml/Vector4f.z F
      // 115: aload 11
      // 117: getfield org/joml/Vector4f.w F
      // 11a: invokevirtual oxxxde/جء.draw (FFFF)V
      // 11d: aload 0
      // 11e: invokevirtual oxxxde/ذ.getDefaultFont ()Loxxxde/جً;
      // 121: aload 10
      // 123: aload 0
      // 124: getfield oxxxde/ذ.bindTextSize F
      // 127: fconst_0
      // 128: bipush 4
      // 129: aconst_null
      // 12a: invokestatic oxxxde/جً.getWidth$default (Loxxxde/جً;Ljava/lang/String;FFILjava/lang/Object;)F
      // 12d: fstore 12
      // 12f: aload 11
      // 131: getfield org/joml/Vector4f.x F
      // 134: aload 11
      // 136: getfield org/joml/Vector4f.z F
      // 139: fconst_2
      // 13a: fdiv
      // 13b: fadd
      // 13c: fload 12
      // 13e: fconst_2
      // 13f: fdiv
      // 140: fsub
      // 141: fload 5
      // 143: ldc_w 0.8
      // 146: fmul
      // 147: fadd
      // 148: fstore 13
      // 14a: aload 0
      // 14b: invokevirtual oxxxde/ذ.getDefaultFont ()Loxxxde/جً;
      // 14e: aload 0
      // 14f: invokevirtual oxxxde/ذ.textPipeline ()Loxxxde/صؤ;
      // 152: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 155: aload 10
      // 157: fload 13
      // 159: aload 11
      // 15b: getfield org/joml/Vector4f.y F
      // 15e: ldc_w 1.8
      // 161: fadd
      // 162: aload 0
      // 163: getfield oxxxde/ذ.bindTextSize F
      // 166: aload 9
      // 168: fconst_0
      // 169: fconst_0
      // 16a: fconst_0
      // 16b: bipush 0
      // 16c: fconst_0
      // 16d: sipush 992
      // 170: aconst_null
      // 171: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 174: return
   }

   fun ذ(setting: ذُ) {
      super(setting)
      this.bindTextSize = 5.8F
      this.boxTextPadding = 4.0F
      this.selectedExpand = 6.0F
      this.minBindWidth = 15.0F
      this.widthAnim = ري(0.0F, 1, null)
      this.focusAnim = ري(0.0F, 1, null)
      this.textShiftAnim = ري(0.0F, 1, null)
   }

   private fun bindRect(bindText: String): Vector4f {
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
      // 01: invokevirtual oxxxde/ذ.getWidth ()F
      // 04: aload 0
      // 05: invokevirtual oxxxde/ذ.getPadding ()F
      // 08: fconst_2
      // 09: nop
      // 0a: fmul
      // 0b: fsub
      // 0c: fconst_0
      // 0d: nop
      // 0e: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 11: fstore 2
      // 12: aload 0
      // 13: invokevirtual oxxxde/ذ.getDefaultFont ()Loxxxde/جً;
      // 16: aload 0
      // 17: invokevirtual oxxxde/ذ.getSetting ()Loxxxde/رف;
      // 1a: checkcast oxxxde/ذُ
      // 1d: invokevirtual oxxxde/ذُ.getName ()Ljava/lang/String;
      // 20: aload 0
      // 21: getfield oxxxde/ذ.titleSize F
      // 24: fconst_0
      // 25: nop
      // 26: bipush 4
      // 27: nop
      // 28: aconst_null
      // 29: nop
      // 2a: invokestatic oxxxde/جً.getWidth$default (Loxxxde/جً;Ljava/lang/String;FFILjava/lang/Object;)F
      // 2d: fstore 3
      // 2e: aload 0
      // 2f: invokevirtual oxxxde/ذ.getWidth ()F
      // 32: aload 0
      // 33: invokevirtual oxxxde/ذ.getPadding ()F
      // 36: ldc 3.0
      // 38: fmul
      // 39: fload 3
      // 3a: fadd
      // 3b: ldc_w 8.0
      // 3e: fadd
      // 3f: fsub
      // 40: fconst_0
      // 41: nop
      // 42: fload 2
      // 43: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 46: fstore 4
      // 48: aload 0
      // 49: invokevirtual oxxxde/ذ.getDefaultFont ()Loxxxde/جً;
      // 4c: aload 1
      // 4d: aload 0
      // 4e: getfield oxxxde/ذ.bindTextSize F
      // 51: fconst_0
      // 52: nop
      // 53: bipush 4
      // 54: nop
      // 55: aconst_null
      // 56: nop
      // 57: invokestatic oxxxde/جً.getWidth$default (Loxxxde/جً;Ljava/lang/String;FFILjava/lang/Object;)F
      // 5a: fstore 5
      // 5c: fload 5
      // 5e: aload 0
      // 5f: getfield oxxxde/ذ.boxTextPadding F
      // 62: fconst_2
      // 63: nop
      // 64: fmul
      // 65: fadd
      // 66: fstore 6
      // 68: fload 6
      // 6a: aload 0
      // 6b: getfield oxxxde/ذ.listening Z
      // 6e: ifeq 78
      // 71: aload 0
      // 72: getfield oxxxde/ذ.selectedExpand F
      // 75: goto 7a
      // 78: fconst_0
      // 79: nop
      // 7a: fadd
      // 7b: fstore 7
      // 7d: aload 0
      // 7e: getfield oxxxde/ذ.minBindWidth F
      // 81: fload 4
      // 83: invokestatic kotlin/ranges/RangesKt.coerceAtMost (FF)F
      // 86: fstore 8
      // 88: fload 4
      // 8a: fconst_0
      // 8b: nop
      // 8c: fcmpg
      // 8d: ifgt 95
      // 90: fconst_0
      // 91: nop
      // 92: goto 9e
      // 95: fload 7
      // 97: fload 8
      // 99: fload 4
      // 9b: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 9e: fstore 9
      // a0: aload 0
      // a1: getfield oxxxde/ذ.widthAnim Loxxxde/ري;
      // a4: fload 9
      // a6: ldc_w 230.0
      // a9: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // ac: astore 11
      // ae: new oxxxde/م
      // b1: dup
      // b2: aload 11
      // b4: invokespecial oxxxde/م.<init> (Loxxxde/بف;)V
      // b7: checkcast oxxxde/شل
      // ba: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // bd: fstore 10
      // bf: aload 0
      // c0: invokevirtual oxxxde/ذ.getComponentHeight ()F
      // c3: ldc_w 0.72
      // c6: fmul
      // c7: fstore 11
      // c9: aload 0
      // ca: invokevirtual oxxxde/ذ.getX ()F
      // cd: aload 0
      // ce: invokevirtual oxxxde/ذ.getWidth ()F
      // d1: fadd
      // d2: aload 0
      // d3: invokevirtual oxxxde/ذ.getPadding ()F
      // d6: fsub
      // d7: fload 10
      // d9: fsub
      // da: fstore 12
      // dc: aload 0
      // dd: aload 0
      // de: invokevirtual oxxxde/ذ.getY ()F
      // e1: aload 0
      // e2: invokevirtual oxxxde/ذ.getComponentHeight ()F
      // e5: fload 11
      // e7: invokevirtual oxxxde/ذ.calcMidY (FFF)F
      // ea: fstore 13
      // ec: new org/joml/Vector4f
      // ef: dup
      // f0: fload 12
      // f2: fload 13
      // f4: fload 10
      // f6: fload 11
      // f8: invokespecial org/joml/Vector4f.<init> (FFFF)V
      // fb: areturn
   }

   private fun keyName(key: Int): String {
      return طِ.INSTANCE.getKey(key)
   }
}
