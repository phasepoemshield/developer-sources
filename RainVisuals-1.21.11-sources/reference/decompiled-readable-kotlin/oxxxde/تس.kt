package oxxxde

import kotakbaz.rain.client.util.animations.AnimationUtil

// $VF: Compiled from heavy
public class تس<T>(initial: Any?) {
   private final var alpha: Float

   public final var current: Any?
      private set

   public final var next: Any?
      private set

   private AnimationUtil animation;

   public fun isSelected(item: Any): Boolean {
      return this.current == item || this.next == item
   }

   init {
      this.current = (T)initial
      this.animation = AnimationUtil(if (initial != null) 1.0F else 0.0F)
      this.alpha = if (initial != null) 1.0F else 0.0F
   }

   public fun alpha(): Float {
      return this.alpha
   }

   public fun select(target: Any): Boolean {
      if (!(this.current == target) && this.next == null) {
         this.next = (T)target
         return true
      } else {
         return false
      }
   }

   public fun updateAndGetAlpha(): Float {
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
      // 01: aload 0
      // 02: getfield oxxxde/تس.next Ljava/lang/Object;
      // 05: ifnull 3d
      // 08: aload 0
      // 09: getfield oxxxde/تس.animation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 0c: fconst_0
      // 0d: nop
      // 0e: ldc 70.0
      // 10: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 13: astore 2
      // 14: new oxxxde/ت
      // 17: dup
      // 18: aload 2
      // 19: nop
      // 1a: invokespecial oxxxde/ت.<init> (Loxxxde/بف;)V
      // 1d: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 20: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 23: fstore 1
      // 24: fload 1
      // 25: ldc 0.05
      // 27: fcmpg
      // 28: ifgt 39
      // 2b: aload 0
      // 2c: aload 0
      // 2d: getfield oxxxde/تس.next Ljava/lang/Object;
      // 30: putfield oxxxde/تس.current Ljava/lang/Object;
      // 33: aload 0
      // 34: aconst_null
      // 35: nop
      // 36: putfield oxxxde/تس.next Ljava/lang/Object;
      // 39: fload 1
      // 3a: goto 57
      // 3d: aload 0
      // 3e: getfield oxxxde/تس.animation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 41: fconst_1
      // 42: nop
      // 43: ldc 90.0
      // 45: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 48: astore 1
      // 49: new oxxxde/حذ
      // 4c: dup
      // 4d: aload 1
      // 4e: invokespecial oxxxde/حذ.<init> (Loxxxde/بف;)V
      // 51: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 54: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 57: putfield oxxxde/تس.alpha F
      // 5a: aload 0
      // 5b: getfield oxxxde/تس.alpha F
      // 5e: freturn
   }
}
