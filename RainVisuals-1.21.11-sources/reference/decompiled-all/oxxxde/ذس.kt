package oxxxde

import java.awt.Color
import ru.ocz.protection.annotation.Compile
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat

// $VF: Compiled from heavy
@RecompileFormat
public class ذس : آ<خذ> {
   private final val toggleAnim: ري
   public open val componentHeight: Float = 15.0F

   fun ذس(setting: خذ) {
      super(setting)
      this.toggleAnim = ري(if (setting.getValue()) 1.0F else 0.0F)
   }

   @Compile
   public override fun onMouseClick(mouseX: Int, mouseY: Int, button: Int) {
      super.onMouseClick(button, mouseX, mouseY)
      if (mouseY == 0) {
         if (this.hovered(button, mouseX)) {
            this.getSetting().toggle()
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
      // 00: aload 0
      // 01: iload 1
      // 02: iload 2
      // 03: fload 3
      // 04: invokespecial oxxxde/آ.render (IIF)V
      // 07: aload 0
      // 08: ldc 0.03
      // 0a: ldc 0.05
      // 0c: invokevirtual oxxxde/ذس.themedSurface (FF)Ljava/awt/Color;
      // 0f: astore 4
      // 11: aload 0
      // 12: ldc 0.05
      // 14: ldc 0.08
      // 16: invokevirtual oxxxde/ذس.themedBorder (FF)Ljava/awt/Color;
      // 19: astore 5
      // 1b: aload 0
      // 1c: ldc 0.32
      // 1e: fconst_1
      // 1f: invokevirtual oxxxde/ذس.themedTitle (FF)Ljava/awt/Color;
      // 22: astore 6
      // 24: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 27: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Loxxxde/جء;
      // 2a: aload 0
      // 2b: invokevirtual oxxxde/ذس.rectPipeline ()Loxxxde/صؤ;
      // 2e: invokevirtual oxxxde/جء.priority (Loxxxde/صؤ;)Loxxxde/جء;
      // 31: aload 4
      // 33: invokevirtual oxxxde/جء.color (Ljava/awt/Color;)Loxxxde/جء;
      // 36: ldc 3.0
      // 38: invokevirtual oxxxde/جء.round (F)Loxxxde/جء;
      // 3b: ldc 0.95
      // 3d: invokevirtual oxxxde/جء.mix (F)Loxxxde/جء;
      // 40: fconst_1
      // 41: aload 5
      // 43: invokevirtual oxxxde/جء.border (FLjava/awt/Color;)Loxxxde/جء;
      // 46: aload 0
      // 47: invokevirtual oxxxde/ذس.getX ()F
      // 4a: aload 0
      // 4b: invokevirtual oxxxde/ذس.getY ()F
      // 4e: aload 0
      // 4f: invokevirtual oxxxde/ذس.getWidth ()F
      // 52: aload 0
      // 53: invokevirtual oxxxde/ذس.getComponentHeight ()F
      // 56: invokevirtual oxxxde/جء.draw (FFFF)V
      // 59: aload 0
      // 5a: invokevirtual oxxxde/ذس.getDefaultFont ()Loxxxde/جً;
      // 5d: aload 0
      // 5e: invokevirtual oxxxde/ذس.textPipeline ()Loxxxde/صؤ;
      // 61: invokevirtual oxxxde/جً.priority (Loxxxde/صؤ;)Loxxxde/جً;
      // 64: aload 0
      // 65: invokevirtual oxxxde/ذس.getSetting ()Loxxxde/رف;
      // 68: checkcast oxxxde/خذ
      // 6b: invokevirtual oxxxde/خذ.getName ()Ljava/lang/String;
      // 6e: aload 0
      // 6f: invokevirtual oxxxde/ذس.getX ()F
      // 72: aload 0
      // 73: invokevirtual oxxxde/ذس.getPadding ()F
      // 76: fadd
      // 77: aload 0
      // 78: invokevirtual oxxxde/ذس.getY ()F
      // 7b: ldc 3.3
      // 7d: fadd
      // 7e: ldc 6.6
      // 80: aload 6
      // 82: fconst_0
      // 83: fconst_0
      // 84: fconst_0
      // 85: bipush 0
      // 86: fconst_0
      // 87: sipush 992
      // 8a: aconst_null
      // 8b: invokestatic oxxxde/جً.drawText$default (Loxxxde/جً;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 8e: aload 0
      // 8f: getfield oxxxde/ذس.toggleAnim Loxxxde/ري;
      // 92: aload 0
      // 93: invokevirtual oxxxde/ذس.getSetting ()Loxxxde/رف;
      // 96: checkcast oxxxde/خذ
      // 99: invokevirtual oxxxde/خذ.getValue ()Ljava/lang/Object;
      // 9c: checkcast java/lang/Boolean
      // 9f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // a2: i2f
      // a3: ldc 180.0
      // a5: new oxxxde/صّ
      // a8: dup
      // a9: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // ac: invokespecial oxxxde/صّ.<init> (Loxxxde/بف;)V
      // af: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // b2: fstore 7
      // b4: getstatic oxxxde/سأ.INSTANCE Loxxxde/سأ;
      // b7: aload 0
      // b8: invokevirtual oxxxde/ذس.getX ()F
      // bb: aload 0
      // bc: invokevirtual oxxxde/ذس.getY ()F
      // bf: aload 0
      // c0: invokevirtual oxxxde/ذس.getWidth ()F
      // c3: aload 0
      // c4: invokevirtual oxxxde/ذس.getComponentHeight ()F
      // c7: aload 0
      // c8: invokevirtual oxxxde/ذس.getPadding ()F
      // cb: fload 7
      // cd: aload 0
      // ce: invokevirtual oxxxde/ذس.getAlpha ()F
      // d1: aload 0
      // d2: invokevirtual oxxxde/ذس.getEnableProgress ()F
      // d5: aload 0
      // d6: invokevirtual oxxxde/ذس.rectPipeline ()Loxxxde/صؤ;
      // d9: invokevirtual oxxxde/سأ.render (FFFFFFFFLoxxxde/صؤ;)V
      // dc: return
   }
}
