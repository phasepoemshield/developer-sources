package oxxxde

// $VF: Compiled from heavy
public class زع(speed: Float = 8.0F) {
   private final val animation: ري
   private final var targetValue: Float
   private final var value: Float
   private final var max: Float
   public final var speed: Float

   public fun clamp(contentHeight: Float, viewHeight: Float) {
      this.setMax(RangesKt.coerceAtLeast(contentHeight - viewHeight, 0.0F))
      this.update()
      if (this.max <= 0.0F) {
         this.targetValue = 0.0F
         this.value = 0.0F
         ري.animate$default(this.animation, 0.0F, 0.0F, null, 4, null)
      }
   }

   public fun scroll(delta: Float) {
      this.targetValue = this.targetValue + delta * this.speed
   }

   public fun setMax(value: Float): زع {
      this.max = RangesKt.coerceAtLeast(value, 0.0F)
      return this
   }

   public fun setValue(value: Float): زع {
      this.value = value
      return this
   }

   fun زع() {
      this(0.0F, 1, null)
   }

   public fun max(): Float {
      return this.max
   }

   public fun value(): Float {
      return -this.value
   }

   public final val offset: Float
      public final get() {
         return this.value
      }


   public fun update() {
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
      // 01: aload 0
      // 02: getfield oxxxde/زع.targetValue F
      // 05: aload 0
      // 06: getfield oxxxde/زع.max F
      // 09: fneg
      // 0a: fconst_0
      // 0b: nop
      // 0c: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0f: putfield oxxxde/زع.targetValue F
      // 12: aload 0
      // 13: getfield oxxxde/زع.targetValue F
      // 16: aload 0
      // 17: getfield oxxxde/زع.value F
      // 1a: fsub
      // 1b: fstore 1
      // 1c: aload 0
      // 1d: aload 0
      // 1e: getfield oxxxde/زع.animation Loxxxde/ري;
      // 21: aload 0
      // 22: getfield oxxxde/زع.targetValue F
      // 25: ldc 80.0
      // 27: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 2a: astore 2
      // 2b: new oxxxde/دً
      // 2e: dup
      // 2f: aload 2
      // 30: nop
      // 31: invokespecial oxxxde/دً.<init> (Loxxxde/بف;)V
      // 34: checkcast oxxxde/شل
      // 37: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 3a: putfield oxxxde/زع.value F
      // 3d: fload 1
      // 3e: invokestatic java/lang/Math.abs (F)F
      // 41: ldc 0.1
      // 43: fcmpg
      // 44: ifge 4f
      // 47: aload 0
      // 48: aload 0
      // 49: getfield oxxxde/زع.targetValue F
      // 4c: putfield oxxxde/زع.value F
      // 4f: return
   }

   init {
      super()
      this.speed = speed
      this.animation = ري(0.0F, 1, null)
   }

   public fun setTargetValue(value: Float): زع {
      this.targetValue = value
      return this
   }
}
