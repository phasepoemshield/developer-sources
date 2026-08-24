package oxxxde

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers
import java.time.Duration
import java.util.ArrayList
import java.util.Arrays
import java.util.Comparator
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedHashMap
import java.util.Locale
import java.util.NoSuchElementException
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicBoolean

// $VF: Compiled from FunTimeEventsApi.kt
internal object خم {
   private final val loading: AtomicBoolean = AtomicBoolean()
   private const val MAX_CALIBRATION_OFFSET_SECONDS: Int = 600
   private final var current: خَ = خَ(0L, null, false, false, 0L, 31, null)
   private final var systemCountdowns: Map<Int, Int> = MapsKt.emptyMap()
   private final var liveOverrides: Map<Int, تن> = MapsKt.emptyMap()
   private final val ignoredEventNames: Set<String> = SetsKt.plus(خم.ignoredEventIds, SetsKt.setOf("аирдроп", "алтарь нежити"))
   private const val REFRESH_INTERVAL_MS: Long = 5000L
   private const val ENDPOINT: String = "https://api.sskyness.space/api/server/funtime/events"
   private final var liveCountdown: حٍ?
   private final var lastRequestAt: Long

   private final val candidateComparator: Comparator<دك> = ComparisonsKt.compareBy({ it: دك ->
      it.getStatus().priority as java.lang.Comparable
   }, { it: دك ->
      if (it.getStatus().hasCountdown && it.secondsLeft > 0) 0 as java.lang.Comparable else 1 as java.lang.Comparable
   }, { it: دك ->
      if (it.system) 0 as java.lang.Comparable else 1 as java.lang.Comparable
   }, { it: دك ->
      if (it.secondsLeft > 0) it.secondsLeft as java.lang.Comparable else Integer.MAX_VALUE as java.lang.Comparable
   }, { it: دك ->
      it.id as java.lang.Comparable
   })

   private final val ignoredEventIds: Set<String> = SetsKt.setOf("airdrop", "altarundead")

   private final val executor: ExecutorService = Executors.newSingleThreadExecutor({ runnable: Runnable ->
      val var1: Thread = Thread(runnable, "Rain-FunTime-Events")
      var1.setDaemon(true)
      var1
   })

   private final val client: HttpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).executor(executor).build()

   private fun publishFailure() {
      current = خَ.copy$default(current, current.generation + 1L, null, false, true, 0L, 18, null)
   }

   private fun toCandidate(event: سآ): دك? {
      var var10000: java.lang.String = event.id
      if (var10000 == null) {
         return null
      } else {
         var10000 = event.phase
         if (var10000 == null) {
            return null
         } else {
            run label62@{
               run label61@{
                  run label60@{
                     when (var10000.hashCode()) {
                        -2026200673 -> {
                           if (var10000.equals("RUNNING")) {
                              var7 = شة.RUNNING
                              return@label61
                           }
                        }
                        -1957249943 -> {
                           if (var10000.equals("OPENED")) {
                              var7 = شة.OPENED
                              return@label61
                           }
                        }
                        -1768657680 -> {
                           if (var10000.equals("ACTIVATING")) {
                              return@label60
                           }
                        }
                        1068039194 -> {
                           if (var10000.equals("LOOTING")) {
                              var7 = شة.LOOTING
                              return@label61
                           }
                        }
                        1834295853 -> {
                           if (var10000.equals("WAITING")) {
                              var7 = شة.WAITING
                              return@label61
                           }
                        }
                        2099433536 -> {
                           if (var10000.equals("STARTING")) {
                              return@label60
                           }
                        }
                        else -> {}
                     }

                     var7 = null
                     return@label61
                  }

                  var7 = شة.ACTIVATING
               }

               return if (var7 == null) null else دك(var10000, var10000, var7, event.secondsLeft, event.loot, event.type == "system")
            }
         }
      }
   }

   private fun mergeDuplicates(events: List<دك>): دك {
      val first: دك = CollectionsKt.first(events)
      var `$i$f$any`: java.util.Iterator = events.iterator()
      if (!`$i$f$any`.hasNext()) {
         throw NoSuchElementException()
      } else {
         var var20: Int = (`$i$f$any`.next() as دك).secondsLeft

         while (`$i$f$any`.hasNext()) {
            val var25: Int = (`$i$f$any`.next() as دك).secondsLeft
            if (var20 < var25) {
               var20 = var25
            }
         }

         `$i$f$any` = events.iterator()

         var var10000: java.lang.String
         while (true) {
            if (`$i$f$any`.hasNext()) {
               val var22: java.lang.String = (`$i$f$any`.next() as دك).loot
               if (var22 == null) {
                  continue
               }

               var10000 = var22
               break
            }

            var10000 = null
            break
         }

         val var17: java.lang.Iterable = events
         var var40: Boolean
         if (events is java.util.Collection && (events as java.util.Collection).isEmpty()) {
            var40 = false
         } else {
            val var23: java.util.Iterator = var17.iterator()

            while (true) {
               if (!var23.hasNext()) {
                  var40 = false
                  break
               }

               if ((var23.next() as دك).system) {
                  var40 = true
                  break
               }
            }
         }

         return دك.copy$default(first, null, null, null, var20, var10000, var40, 7, null)
      }
   }

   private fun JsonObject.string(name: String): String? {
      var var10000: JsonElement = `$this$string`.get(name)
      if (var10000 != null) {
         var10000 = if (var10000.isJsonPrimitive()) var10000 else null
         if (var10000 != null) {
            return var10000.getAsString()
         }
      }

      return null
   }

   private fun JsonObject.int(name: String): Int {
      val var3: JsonObject = `$this$int`

      var `$this$int_u24lambda_u240`: Any
      try {
         val var10000: JsonElement = var3.get(name)
         `$this$int_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(if (var10000 != null) var10000.getAsInt() else 0)
      } catch (var6: java.lang.Throwable) {
         `$this$int_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var6))
      }

      return ((if (isFailure) 0 else `$this$int_u24lambda_u240`) as java.lang.Number).intValue()
   }

   private fun createEvent(anarchy: Int, events: List<سآ>, fetchedAt: Long): صة {
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
      // 000: aload 2
      // 001: nop
      // 002: checkcast java/lang/Iterable
      // 005: invokestatic kotlin/collections/CollectionsKt.asSequence (Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
      // 008: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, oxxxde/خم.createEvent$lambda$0 (Loxxxde/سآ;)Z, (Loxxxde/سآ;)Ljava/lang/Boolean; ]
      // 00d: invokestatic kotlin/sequences/SequencesKt.filter (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
      // 010: new oxxxde/عخ
      // 013: dup
      // 014: aload 0
      // 015: invokespecial oxxxde/عخ.<init> (Ljava/lang/Object;)V
      // 018: checkcast kotlin/jvm/functions/Function1
      // 01b: invokestatic kotlin/sequences/SequencesKt.mapNotNull (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
      // 01e: astore 6
      // 020: nop
      // 021: bipush 0
      // 022: nop
      // 023: istore 7
      // 025: aload 6
      // 027: astore 8
      // 029: new java/util/LinkedHashMap
      // 02c: dup
      // 02d: invokespecial java/util/LinkedHashMap.<init> ()V
      // 030: checkcast java/util/Map
      // 033: astore 9
      // 035: bipush 0
      // 036: nop
      // 037: istore 10
      // 039: aload 8
      // 03b: invokeinterface kotlin/sequences/Sequence.iterator ()Ljava/util/Iterator; 1
      // 040: astore 11
      // 042: aload 11
      // 044: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 049: ifeq 0c5
      // 04c: aload 11
      // 04e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 053: astore 12
      // 055: aload 12
      // 057: checkcast oxxxde/دك
      // 05a: astore 13
      // 05c: bipush 0
      // 05d: nop
      // 05e: istore 14
      // 060: new oxxxde/بي
      // 063: dup
      // 064: aload 13
      // 066: invokevirtual oxxxde/دك.getId ()Ljava/lang/String;
      // 069: aload 13
      // 06b: invokevirtual oxxxde/دك.getPhase ()Ljava/lang/String;
      // 06e: invokespecial oxxxde/بي.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 071: astore 15
      // 073: aload 9
      // 075: astore 16
      // 077: aload 15
      // 079: astore 17
      // 07b: bipush 0
      // 07c: nop
      // 07d: istore 18
      // 07f: aload 16
      // 081: aload 17
      // 083: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 088: astore 19
      // 08a: aload 19
      // 08c: ifnonnull 0b0
      // 08f: bipush 0
      // 090: nop
      // 091: istore 20
      // 093: new java/util/ArrayList
      // 096: dup
      // 097: invokespecial java/util/ArrayList.<init> ()V
      // 09a: checkcast java/util/List
      // 09d: astore 20
      // 09f: aload 16
      // 0a1: aload 17
      // 0a3: aload 20
      // 0a5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0aa: pop
      // 0ab: aload 20
      // 0ad: goto 0b2
      // 0b0: aload 19
      // 0b2: nop
      // 0b3: checkcast java/util/List
      // 0b6: astore 13
      // 0b8: aload 13
      // 0ba: aload 12
      // 0bc: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0c1: pop
      // 0c2: goto 042
      // 0c5: aload 9
      // 0c7: nop
      // 0c8: astore 6
      // 0ca: nop
      // 0cb: bipush 0
      // 0cc: nop
      // 0cd: istore 7
      // 0cf: aload 6
      // 0d1: astore 8
      // 0d3: new java/util/ArrayList
      // 0d6: dup
      // 0d7: aload 6
      // 0d9: invokeinterface java/util/Map.size ()I 1
      // 0de: invokespecial java/util/ArrayList.<init> (I)V
      // 0e1: checkcast java/util/Collection
      // 0e4: astore 9
      // 0e6: bipush 0
      // 0e7: nop
      // 0e8: istore 10
      // 0ea: aload 8
      // 0ec: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0f1: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0f6: astore 11
      // 0f8: aload 11
      // 0fa: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ff: ifeq 13a
      // 102: aload 11
      // 104: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 109: checkcast java/util/Map$Entry
      // 10c: astore 12
      // 10e: aload 9
      // 110: aload 12
      // 112: astore 13
      // 114: astore 21
      // 116: bipush 0
      // 117: nop
      // 118: istore 14
      // 11a: aload 13
      // 11c: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 121: checkcast java/util/List
      // 124: astore 15
      // 126: getstatic oxxxde/خم.INSTANCE Loxxxde/خم;
      // 129: aload 15
      // 12b: invokespecial oxxxde/خم.mergeDuplicates (Ljava/util/List;)Loxxxde/دك;
      // 12e: aload 21
      // 130: swap
      // 131: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 136: pop
      // 137: goto 0f8
      // 13a: aload 9
      // 13c: checkcast java/util/List
      // 13f: nop
      // 140: checkcast java/lang/Iterable
      // 143: getstatic oxxxde/خم.candidateComparator Ljava/util/Comparator;
      // 146: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
      // 149: astore 5
      // 14b: aload 5
      // 14d: invokestatic kotlin/collections/CollectionsKt.firstOrNull (Ljava/util/List;)Ljava/lang/Object;
      // 150: checkcast oxxxde/دك
      // 153: astore 6
      // 155: aload 6
      // 157: ifnull 2df
      // 15a: aload 5
      // 15c: checkcast java/lang/Iterable
      // 15f: astore 8
      // 161: bipush 0
      // 162: nop
      // 163: istore 9
      // 165: new java/util/HashSet
      // 168: dup
      // 169: invokespecial java/util/HashSet.<init> ()V
      // 16c: astore 10
      // 16e: new java/util/ArrayList
      // 171: dup
      // 172: invokespecial java/util/ArrayList.<init> ()V
      // 175: astore 11
      // 177: aload 8
      // 179: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 17e: astore 12
      // 180: aload 12
      // 182: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 187: ifeq 1ba
      // 18a: aload 12
      // 18c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 191: astore 13
      // 193: aload 13
      // 195: checkcast oxxxde/دك
      // 198: astore 14
      // 19a: bipush 0
      // 19b: nop
      // 19c: istore 15
      // 19e: aload 14
      // 1a0: invokevirtual oxxxde/دك.getId ()Ljava/lang/String;
      // 1a3: astore 14
      // 1a5: aload 10
      // 1a7: aload 14
      // 1a9: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 1ac: ifeq 180
      // 1af: aload 11
      // 1b1: aload 13
      // 1b3: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1b6: pop
      // 1b7: goto 180
      // 1ba: aload 11
      // 1bc: checkcast java/util/List
      // 1bf: invokeinterface java/util/List.size ()I 1
      // 1c4: bipush 1
      // 1c5: nop
      // 1c6: isub
      // 1c7: bipush 0
      // 1c8: nop
      // 1c9: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (II)I
      // 1cc: istore 7
      // 1ce: new java/lang/StringBuilder
      // 1d1: dup
      // 1d2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d5: astore 9
      // 1d7: aload 9
      // 1d9: astore 10
      // 1db: bipush 0
      // 1dc: nop
      // 1dd: istore 11
      // 1df: aload 10
      // 1e1: getstatic oxxxde/خم.INSTANCE Loxxxde/خم;
      // 1e4: aload 6
      // 1e6: invokevirtual oxxxde/دك.getId ()Ljava/lang/String;
      // 1e9: invokespecial oxxxde/خم.eventName (Ljava/lang/String;)Ljava/lang/String;
      // 1ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ef: pop
      // 1f0: aload 6
      // 1f2: invokevirtual oxxxde/دك.getLoot ()Ljava/lang/String;
      // 1f5: dup
      // 1f6: ifnull 210
      // 1f9: astore 12
      // 1fb: bipush 0
      // 1fc: nop
      // 1fd: istore 13
      // 1ff: aload 10
      // 201: ldc_w " • "
      // 204: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 207: aload 12
      // 209: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20c: pop
      // 20d: goto 212
      // 210: pop
      // 211: nop
      // 212: iload 7
      // 214: ifle 225
      // 217: aload 10
      // 219: ldc_w " + ещё "
      // 21c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21f: iload 7
      // 221: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 224: pop
      // 225: nop
      // 226: aload 9
      // 228: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 22b: astore 8
      // 22d: aload 6
      // 22f: invokevirtual oxxxde/دك.getSecondsLeft ()I
      // 232: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 235: astore 10
      // 237: aload 10
      // 239: checkcast java/lang/Number
      // 23c: invokevirtual java/lang/Number.intValue ()I
      // 23f: istore 11
      // 241: bipush 0
      // 242: nop
      // 243: istore 12
      // 245: aload 6
      // 247: invokevirtual oxxxde/دك.getStatus ()Loxxxde/شة;
      // 24a: invokevirtual oxxxde/شة.getHasCountdown ()Z
      // 24d: ifeq 25a
      // 250: iload 11
      // 252: ifle 25a
      // 255: bipush 1
      // 256: nop
      // 257: goto 25c
      // 25a: bipush 0
      // 25b: nop
      // 25c: ifeq 264
      // 25f: aload 10
      // 261: goto 266
      // 264: aconst_null
      // 265: nop
      // 266: astore 9
      // 268: iload 1
      // 269: aload 8
      // 26b: aload 6
      // 26d: invokevirtual oxxxde/دك.getStatus ()Loxxxde/شة;
      // 270: aload 9
      // 272: aload 9
      // 274: dup
      // 275: ifnull 2a7
      // 278: checkcast java/lang/Number
      // 27b: invokevirtual java/lang/Number.intValue ()I
      // 27e: istore 11
      // 280: astore 25
      // 282: astore 24
      // 284: astore 23
      // 286: istore 22
      // 288: bipush 0
      // 289: nop
      // 28a: istore 12
      // 28c: lload 3
      // 28d: iload 11
      // 28f: i2l
      // 290: ldc2_w 1000
      // 293: lmul
      // 294: ladd
      // 295: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 298: astore 26
      // 29a: iload 22
      // 29c: aload 23
      // 29e: aload 24
      // 2a0: aload 25
      // 2a2: aload 26
      // 2a4: goto 2aa
      // 2a7: pop
      // 2a8: aconst_null
      // 2a9: nop
      // 2aa: bipush 1
      // 2ab: nop
      // 2ac: aload 6
      // 2ae: invokevirtual oxxxde/دك.getId ()Ljava/lang/String;
      // 2b1: aload 6
      // 2b3: invokevirtual oxxxde/دك.getPhase ()Ljava/lang/String;
      // 2b6: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001:\u0001" ]
      // 2bb: astore 27
      // 2bd: istore 28
      // 2bf: astore 29
      // 2c1: astore 30
      // 2c3: astore 31
      // 2c5: astore 32
      // 2c7: istore 33
      // 2c9: new oxxxde/صة
      // 2cc: dup
      // 2cd: iload 33
      // 2cf: aload 32
      // 2d1: aload 31
      // 2d3: aload 30
      // 2d5: aload 29
      // 2d7: iload 28
      // 2d9: aload 27
      // 2db: invokespecial oxxxde/صة.<init> (ILjava/lang/String;Loxxxde/شة;Ljava/lang/Integer;Ljava/lang/Long;ZLjava/lang/String;)V
      // 2de: areturn
      // 2df: aload 2
      // 2e0: nop
      // 2e1: checkcast java/lang/Iterable
      // 2e4: invokestatic kotlin/collections/CollectionsKt.asSequence (Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
      // 2e7: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, oxxxde/خم.createEvent$lambda$6 (Loxxxde/سآ;)Z, (Loxxxde/سآ;)Ljava/lang/Boolean; ]
      // 2ec: invokestatic kotlin/sequences/SequencesKt.filter (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
      // 2ef: astore 8
      // 2f1: nop
      // 2f2: bipush 0
      // 2f3: nop
      // 2f4: istore 9
      // 2f6: aload 8
      // 2f8: invokeinterface kotlin/sequences/Sequence.iterator ()Ljava/util/Iterator; 1
      // 2fd: astore 10
      // 2ff: aload 10
      // 301: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 306: ifne 30e
      // 309: aconst_null
      // 30a: nop
      // 30b: goto 36e
      // 30e: aload 10
      // 310: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 315: astore 11
      // 317: aload 10
      // 319: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 31e: ifne 326
      // 321: aload 11
      // 323: goto 36e
      // 326: aload 11
      // 328: checkcast oxxxde/سآ
      // 32b: astore 12
      // 32d: bipush 0
      // 32e: nop
      // 32f: istore 13
      // 331: aload 12
      // 333: invokevirtual oxxxde/سآ.getSecondsLeft ()I
      // 336: istore 12
      // 338: aload 10
      // 33a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 33f: astore 13
      // 341: aload 13
      // 343: checkcast oxxxde/سآ
      // 346: astore 14
      // 348: bipush 0
      // 349: nop
      // 34a: istore 15
      // 34c: aload 14
      // 34e: invokevirtual oxxxde/سآ.getSecondsLeft ()I
      // 351: istore 14
      // 353: iload 12
      // 355: iload 14
      // 357: if_icmpge 362
      // 35a: aload 13
      // 35c: astore 11
      // 35e: iload 14
      // 360: istore 12
      // 362: aload 10
      // 364: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 369: ifne 338
      // 36c: aload 11
      // 36e: checkcast oxxxde/سآ
      // 371: astore 7
      // 373: aload 7
      // 375: ifnull 3a3
      // 378: new oxxxde/صة
      // 37b: dup
      // 37c: iload 1
      // 37d: ldc_w "Случайное событие"
      // 380: getstatic oxxxde/شة.UPCOMING Loxxxde/شة;
      // 383: aload 7
      // 385: invokevirtual oxxxde/سآ.getSecondsLeft ()I
      // 388: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 38b: lload 3
      // 38c: aload 7
      // 38e: invokevirtual oxxxde/سآ.getSecondsLeft ()I
      // 391: i2l
      // 392: ldc2_w 1000
      // 395: lmul
      // 396: ladd
      // 397: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 39a: bipush 0
      // 39b: nop
      // 39c: ldc_w "system:upcoming"
      // 39f: invokespecial oxxxde/صة.<init> (ILjava/lang/String;Loxxxde/شة;Ljava/lang/Integer;Ljava/lang/Long;ZLjava/lang/String;)V
      // 3a2: areturn
      // 3a3: new oxxxde/صة
      // 3a6: dup
      // 3a7: iload 1
      // 3a8: ldc_w "Нет активных событий"
      // 3ab: getstatic oxxxde/شة.IDLE Loxxxde/شة;
      // 3ae: aconst_null
      // 3af: nop
      // 3b0: aconst_null
      // 3b1: nop
      // 3b2: bipush 0
      // 3b3: nop
      // 3b4: ldc_w "system:idle"
      // 3b7: invokespecial oxxxde/صة.<init> (ILjava/lang/String;Loxxxde/شة;Ljava/lang/Integer;Ljava/lang/Long;ZLjava/lang/String;)V
      // 3ba: areturn
   }

   private fun publishSuccess(response: زه) {
      synchronized (this) {
         var previous: خَ
         var var10000: java.util.List
         run label25@{
            previous = current
            systemCountdowns = response.systemCountdowns
            val origin: java.lang.Long = INSTANCE.resolveSnapshotOrigin(response.systemCountdowns, response.fetchedAt)
            if (origin != null) {
               var10000 = INSTANCE.rebaseDeadlines(response.events, origin.longValue())
               if (var10000 != null) {
                  return@label25
               }
            }

            var10000 = response.events
         }

         current = خَ(previous.generation + 1L, INSTANCE.applyLiveOverrides(var10000, response.fetchedAt), false, false, response.fetchedAt)
      }
   }

   private fun rebaseDeadlines(events: List<صة>, originAt: Long): List<صة> {
      val `$this$mapTo$iv$iv`: java.lang.Iterable = events
      val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(events, 10))

      for (`item$iv$iv` in `$this$mapTo$iv$iv`) {
         val event: صة = `item$iv$iv` as صة
         val var10000: صة
         if (StringsKt.startsWith$default((`item$iv$iv` as صة).timerIdentity, "live:", false, 2, null)) {
            var10000 = event
         } else {
            val var15: Int = event.reportedSeconds
            var10000 = if (var15 != null)
               صة.copy$default(event, 0, null, null, null, originAt + (long)var15.intValue() * 1000L, false, null, 111, null)
               else
               event
            }

         `destination$iv$iv`.add(var10000)
      }

      return `destination$iv$iv` as MutableList<صة>
   }

   private fun applyLiveOverrides(events: List<صة>, now: Long): List<صة> {
      val known: java.util.Map = liveOverrides
      val `$i$f$sortedBy`: LinkedHashMap = LinkedHashMap()

      for (`$this$forEach$iv` in known.entrySet()) {
         if ((`$this$forEach$iv`.getValue() as تن).expiresAt > now) {
            `$i$f$sortedBy`.put(`$this$forEach$iv`.getKey(), `$this$forEach$iv`.getValue())
         }
      }

      val valid: java.util.Map = `$i$f$sortedBy`
      liveOverrides = `$i$f$sortedBy`
      if (valid.isEmpty()) {
         return events
      } else {
         var var19: java.util.List = events
         val var22: java.util.Collection = HashSet()

         for (var30 in var19) {
            var22.add((var30 as صة).anarchy)
         }

         val var18: HashSet = var22 as HashSet
         var19 = CollectionsKt.createListBuilder()
         val var23: java.util.List = var19

         for (var36 in events) {
            var var40: صة
            run label75@{
               val it: صة = var36 as صة
               val var10001: تن = valid.get((var36 as صة).anarchy) as تن
               if (var10001 != null) {
                  var40 = var10001.getEvent()
                  if (var40 != null) {
                     return@label75
                  }
               }

               var40 = it
            }

            var23.add(var40)
         }

         for (var37 in valid.entrySet()) {
            val anarchy: Int = (var37.getKey() as java.lang.Number).intValue()
            val override: تن = var37.getValue() as تن
            if (!var18.contains(anarchy)) {
               var23.add(override.getEvent())
            }
         }

         return CollectionsKt.sortedWith(CollectionsKt.build(var19), سب<>())
      }
   }

   public fun syncWithLiveEvent(anarchy: Int?, name: String, status: شة, secondsLeft: Int?) {
      if (anarchy != null) {
         anarchy
         val normalizedName: java.lang.String = StringsKt.removeSuffix(StringsKt.trim(name).toString(), ":")
         val var10000: java.util.Set = ignoredEventNames
         val var10001: Locale = Locale.ROOT
         val var37: java.lang.String = normalizedName.toLowerCase(var10001)
         if (!var10000.contains(var37)) {
            synchronized (this) {
               val now: Long = System.currentTimeMillis()
               val var34: Int = if (secondsLeft != null) (if (status.hasCountdown && secondsLeft.intValue() > 0) secondsLeft else null) else null
               val var35: java.lang.Long = if (var34 != null) now + (long)var34.intValue() * 1000L else null
               INSTANCE.putLiveOverride(
                  صة(anarchy, (if (normalizedName.length() == 0) "Событие" else normalizedName) as java.lang.String, status, var34, var35, true, "live:event"),
                  if (var35 != null) var35 + 30000L else now + 600000L
               )
               val var32: خَ = current
               current = خَ.copy$default(current, current.generation + 1L, INSTANCE.applyLiveOverrides(var32.events, now), false, false, 0L, 28, null)
            }
         }
      }
   }

   private fun formatDuration(seconds: Int): String {
      val var10000: java.lang.String
      if (seconds >= 3600) {
         val var3: Locale = Locale.ROOT
         val var7: Array<Any> = arrayOf(seconds / 3600, seconds / 60 % 60, seconds % 60)
         var10000 = java.lang.String.format(var3, "%d:%02d:%02d", Arrays.copyOf(var7, var7.length))
      } else {
         val var6: Locale = Locale.ROOT
         val var9: Array<Any> = arrayOf(seconds / 60, seconds % 60)
         var10000 = java.lang.String.format(var6, "%d:%02d", Arrays.copyOf(var9, var9.length))
      }

      return var10000
   }

   private fun eventName(id: String): String {
      when (id.hashCode()) {
         -1459688889 -> {
            if (id.equals("meteor_rain")) {
               return "Метеорит"
            }
         }
         -1393046460 -> {
            if (id.equals("beacon")) {
               return "Маяк"
            }
         }
         -1249170651 -> {
            if (id.equals("geyser")) {
               return "Гейзер"
            }
         }
         -805352149 -> {
            if (id.equals("vulkan")) {
               return "Вулкан"
            }
         }
         -683372618 -> {
            if (id.equals("myst_beacon")) {
               return "Мистик"
            }
         }
         -143606515 -> {
            if (id.equals("deathchest")) {
               return "Сундук смерти"
            }
         }
         99162320 -> {
            if (id.equals("hellm")) {
               return "Сундук смерти"
            }
         }
         else -> {}
      }

      val var3: java.lang.String = StringsKt.replace$default(id, '_', ' ', false, 4, null)
      val var10000: java.lang.String
      if (var3.length() > 0) {
         val var9: StringBuilder = StringBuilder()
         val it: Char = var3.charAt(0)
         val var10001: Locale = Locale.ROOT
         val var10: StringBuilder = var9.append((Object)CharsKt.titlecase(it, var10001))
         val var11: java.lang.String = var3.substring(1)
         var10000 = var10.append(var11).toString()
      } else {
         var10000 = var3
      }

      return var10000
   }

   public fun snapshot(): خَ {
      this.refreshIfNeeded()
      return current
   }

   @JvmStatic
   fun `resolveSnapshotOrigin$offset`(reported: Int, liveSeconds: Int): Int {
      reported - liveSeconds
   }

   public fun syncWithLiveCountdown(anarchy: Int?, secondsLeft: Int) {
      if (secondsLeft > 0) {
         synchronized (this) {
            var now: Long
            var deadline: Long
            var previous: خَ
            var var10000: java.util.List
            run label36@{
               now = System.currentTimeMillis()
               deadline = now + secondsLeft * 1000L
               liveCountdown = حٍ(anarchy, now + secondsLeft * 1000L)
               previous = current
               val var10: java.lang.Long = INSTANCE.resolveSnapshotOrigin(systemCountdowns, now)
               if (var10 != null) {
                  val var14: java.util.List = INSTANCE.rebaseDeadlines(previous.events, var10.longValue())
                  if (var14 != null) {
                     var10000 = var14
                     return@label36
                  }
               }

               var10000 = previous.events
            }

            if (anarchy != null) {
               INSTANCE.putLiveOverride(صة(anarchy, "Случайное событие", شة.UPCOMING, secondsLeft, deadline, false, "live:upcoming"), deadline + 30000L)
            }

            current = خَ.copy$default(previous, previous.generation + 1L, INSTANCE.applyLiveOverrides(var10000, now), false, false, 0L, 28, null)
         }
      }
   }

   private fun putLiveOverride(event: صة, expiresAt: Long) {
      liveOverrides = MapsKt.plus(liveOverrides, event.anarchy to تن(event, expiresAt))
   }

   private fun String.normalizedValue(): String? {
      val var2: java.lang.String = StringsKt.trim(`$this$normalizedValue`).toString()
      return if (var2.length() > 0 && !StringsKt.equals(var2, "null", true)) var2 else null
   }

   private fun resolveSnapshotOrigin(countdowns: Map<Int, Int>, now: Long): Long? {
      if (liveCountdown == null) {
         return null
      } else {
         val live: حٍ = liveCountdown
         val liveSeconds: Int = (int)((liveCountdown.deadlineAt - now + 999L) / 1000L)
         if (liveSeconds <= 0) {
            return null
         } else {
            var var38: Int
            run label108@{
               val var7: Int = live.anarchy
               if (var7 != null) {
                  val var8: Int = countdowns.get(var7.intValue()) as Int
                  if (var8 != null) {
                     val `iterator$iv`: Int = resolveSnapshotOrigin$offset(liveSeconds, var8.intValue())
                     val var9: Int = if (0 <= `iterator$iv` && `iterator$iv` < 601) var8 else null
                     if ((if (0 <= `iterator$iv` && `iterator$iv` < 601) var8 else null) != null) {
                        var38 = var9
                        return@label108
                     }
                  }
               }

               val var27: java.lang.Iterable = countdowns.values()
               val `minElem$iv`: java.util.Collection = ArrayList()

               for (`v$iv` in var27) {
                  val var20: Int = resolveSnapshotOrigin$offset(liveSeconds, (`v$iv` as java.lang.Number).intValue())
                  if (0 <= var20 && var20 < 601) {
                     `minElem$iv`.add(`v$iv`)
                  }
               }

               val var28: java.util.Iterator = (`minElem$iv` as java.util.List).iterator()
               var var10000: Any
               if (!var28.hasNext()) {
                  var10000 = null
               } else {
                  var var29: Any = var28.next()
                  if (!var28.hasNext()) {
                     var10000 = (Integer)var29
                  } else {
                     var var31: Int = resolveSnapshotOrigin$offset(liveSeconds, (var29 as java.lang.Number).intValue())

                     do {
                        val var33: Any = var28.next()
                        val var35: Int = resolveSnapshotOrigin$offset(liveSeconds, (var33 as java.lang.Number).intValue())
                        if (var31 > var35) {
                           var29 = var33
                           var31 = var35
                        }
                     } while (var28.hasNext())

                     var10000 = (Integer)var29
                  }
               }

               var10000 = var10000
               if (var10000 == null) {
                  return null
               }

               var38 = var10000
            }

            return now - (long)resolveSnapshotOrigin$offset(liveSeconds, var38) * 1000L
         }
      }
   }

   private fun refreshIfNeeded() {
      val now: Long = System.currentTimeMillis()
      if (now - lastRequestAt >= 5000L && loading.compareAndSet(false, true)) {
         lastRequestAt = now
         current = خَ.copy$default(current, current.generation + 1L, null, true, false, 0L, 18, null)
         val request: HttpRequest = HttpRequest.newBuilder(URI.create("https://api.sskyness.space/api/server/funtime/events"))
            .timeout(Duration.ofSeconds(8L))
            .header("Accept", "application/json")
            .GET()
            .build()
            val var5: خم = this

         var `$this$refreshIfNeeded_u24lambda_u240`: Any
         try {
            `$this$refreshIfNeeded_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(
               client.sendAsync(request, BodyHandlers.ofString()).thenApply({ p0: Any ->
                  `$tmp0`(p0) as زه
               }).whenComplete({ p0: Any, p1: Any ->
                  `$tmp0`(p0, p1)
               })
            )
         } catch (var9: java.lang.Throwable) {
            `$this$refreshIfNeeded_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var9))
         }

         if (Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$refreshIfNeeded_u24lambda_u240`) != null) {
            INSTANCE.publishFailure()
            loading.set(false)
         }
      }
   }

   private fun parseEvent(json: JsonObject?): سآ? {
      if (json == null) {
         return null
      } else {
         val var10000: سآ = سآ
         var var10002: java.lang.String = this.string(json, "event-type")
         if (var10002 != null) {
            val var5: Locale = Locale.ROOT
            var10002 = var10002.toLowerCase(var5)
         } else {
            var10002 = null
         }

         if (var10002 == null) {
            var10002 = ""
         }

         var var8: java.lang.String
         run label44@{
            var8 = this.string(json, "id")
            if (var8 != null) {
               var8 = this.normalizedValue(var8)
               if (var8 != null) {
                  val var9: Locale = Locale.ROOT
                  var8 = var8.toLowerCase(var9)
                  return@label44
               }
            }

            var8 = null
         }

         var var10004: java.lang.String = this.string(json, "phase")
         if (var10004 != null) {
            val var10: Locale = Locale.ROOT
            var10004 = var10004.toUpperCase(var10)
         } else {
            var10004 = null
         }

         val var10005: Int = RangesKt.coerceAtLeast(this.int(json, "time-seconds-left"), 0)
         val var10006: java.lang.String = this.string(json, "loot")
         var10000./* $VF: Unable to resugar constructor */<init>(
            var10002, var8, var10004, var10005, if (var10006 != null) this.normalizedValue(var10006) else null
         )
         return var10000
      }
   }

   private fun parse(json: String, fetchedAt: Long): زه {
      val root: JsonElement = JsonParser.parseString(json)
      if (!root.isJsonObject()) {
         throw IllegalArgumentException("FunTime events response is not an object".toString())
      } else {
         val response: JsonElement = root.getAsJsonObject().get("response")
         if (response == null || !response.isJsonArray()) {
            throw IllegalArgumentException("FunTime events response has no array".toString())
         } else {
            val grouped: LinkedHashMap = LinkedHashMap()
            val var10000: JsonArray = response.getAsJsonArray()

            for (`$i$f$sortedBy` in var10000) {
               var var83: JsonObject = if ((`$i$f$sortedBy` as JsonElement).isJsonObject()) `$i$f$sortedBy` as JsonElement else null
               if (var83 != null) {
                  var83 = var83.getAsJsonObject()
                  if (var83 != null) {
                     val var49: java.lang.String = INSTANCE.string(var83, "server")
                     if (var49 != null) {
                        val var85: Locale = Locale.ROOT
                        val var86: java.lang.String = var49.toLowerCase(var85)
                        if (var86 != null) {
                           val var57: java.lang.String = StringsKt.removePrefix(var86, "anarchy")
                           if (var57 != null) {
                              val var17: Int = StringsKt.toIntOrNull(var57)
                              if (var17 != null) {
                                 val anarchy: Int = var17
                                 val var53: java.util.Map = grouped
                                 val var58: Int = anarchy
                                 var rawEvents: Any = var53.get(var58)
                                 val var87: Any
                                 if (rawEvents == null) {
                                    val var70: ArrayList = ArrayList()
                                    var53.put(var58, var70)
                                    var87 = var70
                                 } else {
                                    var87 = rawEvents
                                 }

                                 val var50: java.util.List = var87 as java.util.List
                                 val var54: JsonElement = var83.get("events")
                                 if (var54 != null) {
                                    val var59: JsonElement = if (var54.isJsonArray()) var54 else null
                                    if (var59 != null) {
                                       val var64: JsonArray = var59.getAsJsonArray()
                                       if (var64 != null) {
                                          rawEvents = var64
                                          val var72: java.util.Collection = var50

                                          for (`element$iv$iv` in rawEvents) {
                                             val var30: JsonElement = `element$iv$iv` as JsonElement
                                             val value: JsonElement = `element$iv$iv` as JsonElement
                                             val var32: خم = INSTANCE
                                             val var10001: JsonElement = if (java.lang.Boolean.valueOf(value.isJsonObject())) var30 else null
                                             val var88: سآ = var32.parseEvent(if (var10001 != null) var10001.getAsJsonObject() else null)
                                             if (var88 != null) {
                                                var72.add(var88)
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            val var39: HashMap = HashMap()
            val var47: java.util.Map = grouped
            val var48: java.util.Collection = ArrayList(grouped.size())

            for (var60 in var47.entrySet()) {
               val var66: Int = (var60.getKey() as java.lang.Number).intValue()
               val var69: java.util.List = var60.getValue() as java.util.List
               val var73: java.util.Iterator = SequencesKt.filter(CollectionsKt.asSequence(var69), { it: سآ ->
                  it.type == "system" && it.id == null && it.secondsLeft > 0
               }).iterator()
               val var89: java.lang.Comparable
               if (!var73.hasNext()) {
                  var89 = null
               } else {
                  var var76: java.lang.Comparable = (var73.next() as سآ).secondsLeft

                  while (var73.hasNext()) {
                     val var80: java.lang.Comparable = (var73.next() as سآ).secondsLeft
                     if (var76.compareTo(var80) < 0) {
                        var76 = var80
                     }
                  }

                  var89 = var76
               }

               val var82: Int = var89 as Int
               if (var89 as Int != null) {
                  var39.put(var66, var82.intValue())
               }

               var48.add(INSTANCE.createEvent(var66, var69, fetchedAt))
            }

            return زه(CollectionsKt.sortedWith(var48, بّ<>()), fetchedAt, var39)
         }
      }
   }
}
