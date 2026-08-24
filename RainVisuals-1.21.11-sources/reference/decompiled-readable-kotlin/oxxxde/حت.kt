package oxxxde

import kotakbaz.rain.client.util.animations.AnimationUtil

// $VF: Compiled from heavy
public class حت(duration: Float = 190.0F, travel: Float = 2.0F) {
   private final val travel: Float
   private final var current: String
   private final val duration: Float
   private final var previous: String
   private AnimationUtil animation;

   init {
      this.duration = duration
      this.travel = travel
      this.animation = AnimationUtil(1.0F)
      this.current = ""
      this.previous = ""
   }

   public fun reset() {
      this.current = ""
      this.previous = ""
      AnimationUtil.animate$default(this.animation, 1.0F, 0.0F, null, 4, null)
   }

   public fun update(target: String?): List<ذإ> {
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
      // 00: aload 1
      // 01: dup
      // 02: ifnonnull 08
      // 05: pop
      // 06: ldc ""
      // 08: astore 2
      // 09: aload 2
      // 0a: nop
      // 0b: aload 0
      // 0c: getfield oxxxde/حت.current Ljava/lang/String;
      // 0f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 12: ifne 35
      // 15: aload 0
      // 16: aload 0
      // 17: getfield oxxxde/حت.current Ljava/lang/String;
      // 1a: putfield oxxxde/حت.previous Ljava/lang/String;
      // 1d: aload 0
      // 1e: aload 2
      // 1f: nop
      // 20: putfield oxxxde/حت.current Ljava/lang/String;
      // 23: aload 0
      // 24: getfield oxxxde/حت.animation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 27: fconst_0
      // 28: nop
      // 29: fconst_0
      // 2a: nop
      // 2b: aconst_null
      // 2c: nop
      // 2d: bipush 4
      // 2e: nop
      // 2f: aconst_null
      // 30: nop
      // 31: invokestatic kotakbaz/rain/client/util/animations/AnimationUtil.animate$default (Lkotakbaz/rain/client/util/animations/AnimationUtil;FFLkotakbaz/rain/client/util/animations/FloatEasing;ILjava/lang/Object;)F
      // 34: pop
      // 35: aload 0
      // 36: getfield oxxxde/حت.animation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 39: fconst_1
      // 3a: nop
      // 3b: aload 0
      // 3c: getfield oxxxde/حت.duration F
      // 3f: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 42: astore 4
      // 44: new oxxxde/تح
      // 47: dup
      // 48: aload 4
      // 4a: invokespecial oxxxde/تح.<init> (Loxxxde/بف;)V
      // 4d: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 50: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 53: fconst_0
      // 54: nop
      // 55: fconst_1
      // 56: nop
      // 57: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 5a: fstore 3
      // 5b: new java/util/ArrayList
      // 5e: dup
      // 5f: bipush 2
      // 60: nop
      // 61: invokespecial java/util/ArrayList.<init> (I)V
      // 64: astore 4
      // 66: aload 0
      // 67: getfield oxxxde/حت.previous Ljava/lang/String;
      // 6a: checkcast java/lang/CharSequence
      // 6d: invokeinterface java/lang/CharSequence.length ()I 1
      // 72: ifle 7a
      // 75: bipush 1
      // 76: nop
      // 77: goto 7c
      // 7a: bipush 0
      // 7b: nop
      // 7c: ifeq a7
      // 7f: fload 3
      // 80: ldc 0.999
      // 82: fcmpg
      // 83: ifge a7
      // 86: aload 4
      // 88: checkcast java/util/Collection
      // 8b: new kotakbaz/rain/ui/menu/misc/AnimatedTextTransition$Layer
      // 8e: dup
      // 8f: aload 0
      // 90: getfield oxxxde/حت.previous Ljava/lang/String;
      // 93: fconst_1
      // 94: nop
      // 95: fload 3
      // 96: fsub
      // 97: aload 0
      // 98: getfield oxxxde/حت.travel F
      // 9b: fneg
      // 9c: fload 3
      // 9d: fmul
      // 9e: invokespecial kotakbaz/rain/ui/menu/misc/AnimatedTextTransition$Layer.<init> (Ljava/lang/String;FF)V
      // a1: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // a6: pop
      // a7: aload 0
      // a8: getfield oxxxde/حت.current Ljava/lang/String;
      // ab: checkcast java/lang/CharSequence
      // ae: invokeinterface java/lang/CharSequence.length ()I 1
      // b3: ifle bb
      // b6: bipush 1
      // b7: nop
      // b8: goto bd
      // bb: bipush 0
      // bc: nop
      // bd: ifeq e7
      // c0: fload 3
      // c1: ldc 0.001
      // c3: fcmpl
      // c4: ifle e7
      // c7: aload 4
      // c9: checkcast java/util/Collection
      // cc: new kotakbaz/rain/ui/menu/misc/AnimatedTextTransition$Layer
      // cf: dup
      // d0: aload 0
      // d1: getfield oxxxde/حت.current Ljava/lang/String;
      // d4: fload 3
      // d5: aload 0
      // d6: getfield oxxxde/حت.travel F
      // d9: fconst_1
      // da: nop
      // db: fload 3
      // dc: fsub
      // dd: fmul
      // de: invokespecial kotakbaz/rain/ui/menu/misc/AnimatedTextTransition$Layer.<init> (Ljava/lang/String;FF)V
      // e1: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // e6: pop
      // e7: fload 3
      // e8: ldc 0.999
      // ea: fcmpl
      // eb: iflt f4
      // ee: aload 0
      // ef: ldc ""
      // f1: putfield oxxxde/حت.previous Ljava/lang/String;
      // f4: aload 4
      // f6: checkcast java/util/List
      // f9: areturn
   }

   fun حت() {
      this(0.0F, 0.0F, 3, null)
   }
}
