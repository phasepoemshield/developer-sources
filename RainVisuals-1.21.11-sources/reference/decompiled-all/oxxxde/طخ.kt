package oxxxde

import java.awt.Color
import java.text.DecimalFormat
import net.minecraft.client.sound.PositionedSoundInstance
import net.minecraft.client.sound.SoundInstance
import org.lwjgl.glfw.GLFW
import ru.ocz.protection.annotation.Compile
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat

// $VF: Compiled from heavy
@RecompileFormat
public class طخ : آ<طُ> {
   private final val valueFormat: DecimalFormat
   public open val componentHeight: Float = 22.0F
   private final var dragging: Boolean
   private final val progressAnim: ري

   private fun isLeftMousePressed(): Boolean {
      return GLFW.glfwGetMouseButton(ضك.getMc().getWindow().getHandle(), 0) == 1
   }

   private fun updateFromMouse(mouseX: Int, sliderX: Float, sliderWidth: Float) {
      if (!(sliderWidth <= 0.0F)) {
         val value: Float = (this.getSetting() as طُ).min
            + ((this.getSetting() as طُ).max - (this.getSetting() as طُ).min) * RangesKt.coerceIn(((float)mouseX - sliderX) / sliderWidth, 0.0F, 1.0F)
            val previousValue: Float = this.getSetting().getValue().floatValue()
         this.getSetting().setClamped(value)
         if (this.getSetting().getValue().floatValue() != previousValue) {
            ضك.getMc().getSoundManager().play(PositionedSoundInstance.ui(زد.INSTANCE.getSLIDER(), 1.0F, 1.0F) as SoundInstance)
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
      // 008: getfield oxxxde/طخ.dragging Z
      // 00b: ifeq 01a
      // 00e: aload 0
      // 00f: invokespecial oxxxde/طخ.isLeftMousePressed ()Z
      // 012: ifne 01a
      // 015: aload 0
      // 016: bipush 0
      // 017: putfield oxxxde/طخ.dragging Z
      // 01a: aload 0
      // 01b: ldc 0.03
      // 01d: ldc 0.05
      // 01f: invokevirtual oxxxde/طخ.themedSurface (FF)Ljava/awt/Color;
      // 022: astore 4
      // 024: aload 0
      // 025: ldc 0.05
      // 027: ldc 0.08
      // 029: invokevirtual oxxxde/طخ.themedBorder (FF)Ljava/awt/Color;
      // 02c: astore 5
      // 02e: aload 0
      // 02f: ldc 0.32
      // 031: ldc 1.0
      // 033: invokevirtual oxxxde/طخ.themedTitle (FF)Ljava/awt/Color;
      // 036: astore 6
      // 038: aload 0
      // 039: ldc 0.28
      // 03b: ldc 0.78
      // 03d: invokevirtual oxxxde/طخ.themedValue (FF)Ljava/awt/Color;
      // 040: astore 7
      // 042: aload 0
      // 043: ldc 0.05
      // 045: ldc 0.12
      // 047: invokevirtual oxxxde/طخ.themedValue (FF)Ljava/awt/Color;
      // 04a: astore 8
      // 04c: aload 0
      // 04d: ldc 0.18
      // 04f: ldc 0.44
      // 051: invokevirtual oxxxde/طخ.themedTitle (FF)Ljava/awt/Color;
      // 054: astore 9
      // 056: aload 0
      // 057: ldc 0.5
      // 059: ldc 0.95
      // 05b: invokevirtual oxxxde/طخ.themedTitle (FF)Ljava/awt/Color;
      // 05e: astore 10
      // 060: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 063: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 066: aload 0
      // 067: invokevirtual oxxxde/طخ.rectPipeline ()Loxxxde/صؤ;
      // 06a: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 06d: aload 4
      // 06f: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 072: ldc 3.0
      // 074: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 077: ldc 0.95
      // 079: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 07c: fconst_1
      // 07d: aload 5
      // 07f: invokevirtual oxxxde/جء.border (FLjava/awt/Color;)Loxxxde/جء;
      // 082: aload 0
      // 083: invokevirtual oxxxde/طخ.getX ()F
      // 086: aload 0
      // 087: invokevirtual oxxxde/طخ.getY ()F
      // 08a: aload 0
      // 08b: invokevirtual oxxxde/طخ.getWidth ()F
      // 08e: aload 0
      // 08f: invokevirtual oxxxde/طخ.getComponentHeight ()F
      // 092: invokevirtual oxxxde/جء.draw (FFFF)V
      // 095: aload 0
      // 096: invokevirtual oxxxde/طخ.getY ()F
      // 099: fstore 11
      // 09b: aload 0
      // 09c: invokevirtual oxxxde/طخ.getDefaultFont ()Loxxxde/جً;
      // 09f: aload 0
      // 0a0: invokevirtual oxxxde/طخ.textPipeline ()Loxxxde/صؤ;
      // 0a3: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 0a6: aload 0
      // 0a7: invokevirtual oxxxde/طخ.getSetting ()Loxxxde/رف;
      // 0aa: checkcast oxxxde/طُ
      // 0ad: invokevirtual oxxxde/طُ.getName ()Ljava/lang/String;
      // 0b0: aload 0
      // 0b1: invokevirtual oxxxde/طخ.getX ()F
      // 0b4: aload 0
      // 0b5: invokevirtual oxxxde/طخ.getPadding ()F
      // 0b8: fadd
      // 0b9: fload 11
      // 0bb: ldc 3.3
      // 0bd: fadd
      // 0be: ldc 6.6
      // 0c0: aload 6
      // 0c2: fconst_0
      // 0c3: fconst_0
      // 0c4: fconst_0
      // 0c5: bipush 0
      // 0c6: fconst_0
      // 0c7: sipush 992
      // 0ca: aconst_null
      // 0cb: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 0ce: aload 0
      // 0cf: getfield oxxxde/طخ.valueFormat Ljava/text/DecimalFormat;
      // 0d2: aload 0
      // 0d3: invokevirtual oxxxde/طخ.getSetting ()Loxxxde/رف;
      // 0d6: checkcast oxxxde/طُ
      // 0d9: invokevirtual oxxxde/طُ.getValue ()Ljava/lang/Object;
      // 0dc: invokevirtual java/text/DecimalFormat.format (Ljava/lang/Object;)Ljava/lang/String;
      // 0df: astore 12
      // 0e1: aload 0
      // 0e2: invokevirtual oxxxde/طخ.getDefaultFont ()Loxxxde/جً;
      // 0e5: aload 12
      // 0e7: ldc_w 6.2
      // 0ea: fconst_0
      // 0eb: bipush 4
      // 0ec: aconst_null
      // 0ed: invokestatic oxxxde/جً.getWidth$default (Loxxxde/جً;Ljava/lang/String;FFILjava/lang/Object;)F
      // 0f0: fstore 13
      // 0f2: aload 0
      // 0f3: invokevirtual oxxxde/طخ.getDefaultFont ()Loxxxde/جً;
      // 0f6: aload 0
      // 0f7: invokevirtual oxxxde/طخ.textPipeline ()Loxxxde/صؤ;
      // 0fa: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 0fd: aload 12
      // 0ff: aload 0
      // 100: invokevirtual oxxxde/طخ.getX ()F
      // 103: aload 0
      // 104: invokevirtual oxxxde/طخ.getWidth ()F
      // 107: fadd
      // 108: aload 0
      // 109: invokevirtual oxxxde/طخ.getPadding ()F
      // 10c: fsub
      // 10d: fload 13
      // 10f: fsub
      // 110: fload 11
      // 112: ldc 3.3
      // 114: fadd
      // 115: ldc_w 6.2
      // 118: aload 7
      // 11a: fconst_0
      // 11b: fconst_0
      // 11c: fconst_0
      // 11d: bipush 0
      // 11e: fconst_0
      // 11f: sipush 992
      // 122: aconst_null
      // 123: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 126: aload 0
      // 127: invokevirtual oxxxde/طخ.getX ()F
      // 12a: aload 0
      // 12b: invokevirtual oxxxde/طخ.getPadding ()F
      // 12e: fadd
      // 12f: fstore 14
      // 131: aload 0
      // 132: invokevirtual oxxxde/طخ.getWidth ()F
      // 135: aload 0
      // 136: invokevirtual oxxxde/طخ.getPadding ()F
      // 139: fconst_2
      // 13a: fmul
      // 13b: fsub
      // 13c: fconst_0
      // 13d: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 140: fstore 15
      // 142: aload 0
      // 143: invokevirtual oxxxde/طخ.getY ()F
      // 146: aload 0
      // 147: invokevirtual oxxxde/طخ.getComponentHeight ()F
      // 14a: fadd
      // 14b: ldc_w 7.2
      // 14e: fsub
      // 14f: fstore 16
      // 151: aload 0
      // 152: getfield oxxxde/طخ.progressAnim Loxxxde/ري;
      // 155: aload 0
      // 156: invokevirtual oxxxde/طخ.getSetting ()Loxxxde/رف;
      // 159: checkcast oxxxde/طُ
      // 15c: invokevirtual oxxxde/طُ.progress ()F
      // 15f: ldc_w 120.0
      // 162: new oxxxde/حد
      // 165: dup
      // 166: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 169: invokespecial oxxxde/حد.<init> (Loxxxde/بف;)V
      // 16c: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 16f: fstore 17
      // 171: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 174: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 177: aload 0
      // 178: invokevirtual oxxxde/طخ.rectPipeline ()Loxxxde/صؤ;
      // 17b: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 17e: aload 8
      // 180: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 183: ldc 0.5
      // 185: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 188: fload 14
      // 18a: fload 16
      // 18c: fload 15
      // 18e: ldc 3.0
      // 190: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 193: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 196: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 199: aload 0
      // 19a: invokevirtual oxxxde/طخ.rectPipeline ()Loxxxde/صؤ;
      // 19d: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 1a0: aload 9
      // 1a2: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 1a5: ldc 0.5
      // 1a7: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 1aa: fload 14
      // 1ac: fload 16
      // 1ae: fload 15
      // 1b0: fload 17
      // 1b2: fmul
      // 1b3: ldc 3.0
      // 1b5: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 1b8: aload 0
      // 1b9: getfield oxxxde/طخ.dragging Z
      // 1bc: ifeq 1c7
      // 1bf: ldc_w 5.6
      // 1c2: fstore 18
      // 1c4: goto 1cc
      // 1c7: ldc_w 5.0
      // 1ca: fstore 18
      // 1cc: fload 18
      // 1ce: fconst_2
      // 1cf: fdiv
      // 1d0: fstore 19
      // 1d2: fload 14
      // 1d4: fload 15
      // 1d6: fload 17
      // 1d8: fmul
      // 1d9: fadd
      // 1da: fload 19
      // 1dc: fsub
      // 1dd: fload 14
      // 1df: fload 19
      // 1e1: fsub
      // 1e2: fload 14
      // 1e4: fload 15
      // 1e6: fadd
      // 1e7: fload 19
      // 1e9: fsub
      // 1ea: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 1ed: fstore 20
      // 1ef: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 1f2: invokevirtual oxxxde/ذر.getBASIC_RECT ()Loxxxde/ضِ;
      // 1f5: aload 0
      // 1f6: invokevirtual oxxxde/طخ.rectPipeline ()Loxxxde/صؤ;
      // 1f9: invokevirtual oxxxde/ضِ.priority (Loxxxde/صؤ;)Loxxxde/ضِ;
      // 1fc: aload 10
      // 1fe: invokevirtual oxxxde/ضِ.color (Ljava/awt/Color;)Loxxxde/ضِ;
      // 201: fload 18
      // 203: ldc 3.0
      // 205: fdiv
      // 206: invokevirtual oxxxde/ضِ.round (F)Loxxxde/ضِ;
      // 209: fload 20
      // 20b: fload 16
      // 20d: fload 18
      // 20f: ldc 3.0
      // 211: fsub
      // 212: fconst_2
      // 213: fdiv
      // 214: fsub
      // 215: fload 18
      // 217: fload 18
      // 219: invokevirtual oxxxde/ضِ.draw (FFFF)V
      // 21c: aload 0
      // 21d: getfield oxxxde/طخ.dragging Z
      // 220: ifeq 22c
      // 223: aload 0
      // 224: iload 1
      // 225: fload 14
      // 227: fload 15
      // 229: invokespecial oxxxde/طخ.updateFromMouse (IFF)V
      // 22c: return
   }

   fun طخ(setting: طُ) {
      super(setting)
      this.valueFormat = DecimalFormat("0.##")
      this.progressAnim = ري(setting.progress())
   }

   @Compile
   public override fun onMouseClick(mouseX: Int, mouseY: Int, button: Int) {
      super.onMouseClick(button, mouseY, mouseX)
      if (mouseX == 0) {
         if (this.hovered(button, mouseY)) {
            val var4: Float = this.getX() + this.getPadding()
            val var5: Float = this.getWidth() - this.getPadding() * 2.0F
            val var6: Float = this.getY() + this.componentHeight
            if (mouseY >= var6 - 11.0F && mouseY < var6) {
               this.dragging = true
               this.updateFromMouse(button, var4, var5)
            }
         }
      }
   }

   public override fun onMouseRelease(mouseX: Int, mouseY: Int, button: Int) {
      super.onMouseRelease(mouseX, mouseY, button)
      if (button == 0) {
         this.dragging = false
      }
   }
}
