package oxxxde

import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotakbaz.rain.client.util.animations.AnimationUtil

// $VF: Compiled from heavy
public class ثّ<K, T>(presenceDuration: Float = 190.0F, moveDuration: Float = 230.0F) {
   private final val states: LinkedHashMap<Any, سش<Any>>
   private final val moveDuration: Float
   private final val presenceDuration: Float

   public fun update(values: List<Any>, keyOf: (Any) -> Any): List<جة<Any>> {
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
      // 001: ldc "values"
      // 003: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 006: aload 2
      // 007: nop
      // 008: ldc "keyOf"
      // 00a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 00d: aload 0
      // 00e: getfield oxxxde/ثّ.states Ljava/util/LinkedHashMap;
      // 011: invokevirtual java/util/LinkedHashMap.values ()Ljava/util/Collection;
      // 014: dup
      // 015: ldc "<get-values>(...)"
      // 017: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 01a: checkcast java/lang/Iterable
      // 01d: astore 3
      // 01e: bipush 0
      // 01f: nop
      // 020: istore 4
      // 022: aload 3
      // 023: nop
      // 024: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 029: astore 5
      // 02b: aload 5
      // 02d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 032: ifeq 054
      // 035: aload 5
      // 037: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 03c: astore 6
      // 03e: aload 6
      // 040: checkcast oxxxde/سش
      // 043: astore 7
      // 045: bipush 0
      // 046: nop
      // 047: istore 8
      // 049: aload 7
      // 04b: bipush 0
      // 04c: nop
      // 04d: invokevirtual oxxxde/سش.setPresent (Z)V
      // 050: nop
      // 051: goto 02b
      // 054: nop
      // 055: aload 1
      // 056: checkcast java/lang/Iterable
      // 059: astore 3
      // 05a: bipush 0
      // 05b: nop
      // 05c: istore 4
      // 05e: bipush 0
      // 05f: nop
      // 060: istore 5
      // 062: aload 3
      // 063: nop
      // 064: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 069: astore 6
      // 06b: aload 6
      // 06d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 072: ifeq 10e
      // 075: aload 6
      // 077: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 07c: astore 7
      // 07e: iload 5
      // 080: iinc 5 1
      // 083: istore 8
      // 085: iload 8
      // 087: ifge 08d
      // 08a: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
      // 08d: iload 8
      // 08f: aload 7
      // 091: astore 9
      // 093: istore 10
      // 095: bipush 0
      // 096: nop
      // 097: istore 11
      // 099: aload 2
      // 09a: nop
      // 09b: aload 9
      // 09d: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0a2: astore 12
      // 0a4: iload 10
      // 0a6: i2f
      // 0a7: fstore 13
      // 0a9: aload 0
      // 0aa: getfield oxxxde/ثّ.states Ljava/util/LinkedHashMap;
      // 0ad: aload 12
      // 0af: invokevirtual java/util/LinkedHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b2: checkcast oxxxde/سش
      // 0b5: astore 14
      // 0b7: aload 14
      // 0b9: ifnonnull 0f4
      // 0bc: aload 0
      // 0bd: getfield oxxxde/ثّ.states Ljava/util/LinkedHashMap;
      // 0c0: checkcast java/util/Map
      // 0c3: aload 12
      // 0c5: new oxxxde/سش
      // 0c8: dup
      // 0c9: aload 9
      // 0cb: fload 13
      // 0cd: bipush 1
      // 0ce: nop
      // 0cf: new kotakbaz/rain/client/util/animations/AnimationUtil
      // 0d2: dup
      // 0d3: fconst_0
      // 0d4: nop
      // 0d5: bipush 1
      // 0d6: nop
      // 0d7: aconst_null
      // 0d8: nop
      // 0d9: invokespecial kotakbaz/rain/client/util/animations/AnimationUtil.<init> (FILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 0dc: new kotakbaz/rain/client/util/animations/AnimationUtil
      // 0df: dup
      // 0e0: fload 13
      // 0e2: ldc 0.16
      // 0e4: fadd
      // 0e5: invokespecial kotakbaz/rain/client/util/animations/AnimationUtil.<init> (F)V
      // 0e8: invokespecial oxxxde/سش.<init> (Ljava/lang/Object;FZLkotakbaz/rain/client/util/animations/AnimationUtil;Lkotakbaz/rain/client/util/animations/AnimationUtil;)V
      // 0eb: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0f0: pop
      // 0f1: goto 109
      // 0f4: aload 14
      // 0f6: aload 9
      // 0f8: invokevirtual oxxxde/سش.setValue (Ljava/lang/Object;)V
      // 0fb: aload 14
      // 0fd: fload 13
      // 0ff: invokevirtual oxxxde/سش.setTargetPosition (F)V
      // 102: aload 14
      // 104: bipush 1
      // 105: nop
      // 106: invokevirtual oxxxde/سش.setPresent (Z)V
      // 109: nop
      // 10a: nop
      // 10b: goto 06b
      // 10e: nop
      // 10f: new java/util/ArrayList
      // 112: dup
      // 113: aload 0
      // 114: getfield oxxxde/ثّ.states Ljava/util/LinkedHashMap;
      // 117: invokevirtual java/util/LinkedHashMap.size ()I
      // 11a: invokespecial java/util/ArrayList.<init> (I)V
      // 11d: astore 3
      // 11e: aload 0
      // 11f: getfield oxxxde/ثّ.states Ljava/util/LinkedHashMap;
      // 122: invokevirtual java/util/LinkedHashMap.entrySet ()Ljava/util/Set;
      // 125: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 12a: astore 4
      // 12c: aload 4
      // 12e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 133: ifeq 1e6
      // 136: aload 4
      // 138: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 13d: checkcast java/util/Map$Entry
      // 140: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 145: dup
      // 146: ldc "<get-value>(...)"
      // 148: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 14b: checkcast oxxxde/سش
      // 14e: astore 5
      // 150: aload 5
      // 152: invokevirtual oxxxde/سش.getPresenceAnimation ()Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 155: aload 5
      // 157: invokevirtual oxxxde/سش.getPresent ()Z
      // 15a: ifeq 162
      // 15d: fconst_1
      // 15e: nop
      // 15f: goto 164
      // 162: fconst_0
      // 163: nop
      // 164: aload 0
      // 165: getfield oxxxde/ثّ.presenceDuration F
      // 168: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 16b: astore 7
      // 16d: new oxxxde/اٌ
      // 170: dup
      // 171: aload 7
      // 173: invokespecial oxxxde/اٌ.<init> (Loxxxde/بف;)V
      // 176: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 179: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 17c: fconst_0
      // 17d: nop
      // 17e: fconst_1
      // 17f: nop
      // 180: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 183: fstore 6
      // 185: aload 5
      // 187: invokevirtual oxxxde/سش.getPositionAnimation ()Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 18a: aload 5
      // 18c: invokevirtual oxxxde/سش.getTargetPosition ()F
      // 18f: aload 0
      // 190: getfield oxxxde/ثّ.moveDuration F
      // 193: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 196: astore 8
      // 198: new oxxxde/خو
      // 19b: dup
      // 19c: aload 8
      // 19e: invokespecial oxxxde/خو.<init> (Loxxxde/بف;)V
      // 1a1: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 1a4: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 1a7: fstore 7
      // 1a9: aload 5
      // 1ab: invokevirtual oxxxde/سش.getPresent ()Z
      // 1ae: ifne 1c3
      // 1b1: fload 6
      // 1b3: ldc 0.001
      // 1b5: fcmpg
      // 1b6: ifgt 1c3
      // 1b9: aload 4
      // 1bb: invokeinterface java/util/Iterator.remove ()V 1
      // 1c0: goto 12c
      // 1c3: aload 3
      // 1c4: nop
      // 1c5: checkcast java/util/Collection
      // 1c8: new kotakbaz/rain/ui/menu/misc/AnimatedListTracker$Item
      // 1cb: dup
      // 1cc: aload 5
      // 1ce: invokevirtual oxxxde/سش.getValue ()Ljava/lang/Object;
      // 1d1: fload 7
      // 1d3: fload 6
      // 1d5: aload 5
      // 1d7: invokevirtual oxxxde/سش.getPresent ()Z
      // 1da: invokespecial kotakbaz/rain/ui/menu/misc/AnimatedListTracker$Item.<init> (Ljava/lang/Object;FFZ)V
      // 1dd: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 1e2: pop
      // 1e3: goto 12c
      // 1e6: aload 3
      // 1e7: nop
      // 1e8: checkcast java/lang/Iterable
      // 1eb: new oxxxde/خء
      // 1ee: dup
      // 1ef: invokespecial oxxxde/خء.<init> ()V
      // 1f2: checkcast java/util/Comparator
      // 1f5: astore 5
      // 1f7: new oxxxde/سٍ
      // 1fa: dup
      // 1fb: aload 5
      // 1fd: invokespecial oxxxde/سٍ.<init> (Ljava/util/Comparator;)V
      // 200: checkcast java/util/Comparator
      // 203: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
      // 206: areturn
   }

   public fun hasItems(): Boolean {
      return !this.states.isEmpty()
   }

   fun ثّ() {
      this(0.0F, 0.0F, 3, null)
   }

   init {
      super()
      this.presenceDuration = presenceDuration
      this.moveDuration = moveDuration
      this.states = LinkedHashMap<>()
   }

   public fun clear() {
      this.states.clear()
   }
}
