package kotlin.jvm.internal

import kotlin.jvm.functions.Function1
import kotlin.reflect.KClass
import kotlin.reflect.KClassifier
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection

// $VF: Compiled from TypeReference.kt
@SinceKotlin(version = "1.4")
public class TypeReference @SinceKotlin(version = "1.6")  public constructor(classifier: KClassifier,
      arguments: List<KTypeProjection>,
      platformTypeUpperBound: KType?,
      flags: Int
   ) :
   KType {
   @SinceKotlin(version = "1.6")
   internal final val flags: Int

   public open val arguments: List<KTypeProjection>
   public open val classifier: KClassifier

   @SinceKotlin(version = "1.6")
   internal final val platformTypeUpperBound: KType?

   private fun KTypeProjection.asString(): String {
      if (`$this$asString`.variance == null) {
         return "*"
      } else {
         var var4: java.lang.String
         run label34@{
            val var3: KType = `$this$asString`.type
            val var10000: TypeReference = var3 as? TypeReference
            if ((var3 as? TypeReference) != null) {
               var4 = var10000.asString(true)
               if (var4 != null) {
                  return@label34
               }
            }

            var4 = java.lang.String.valueOf(`$this$asString`.type)
         }

         when (TypeReference.WhenMappings.$EnumSwitchMapping$0[`$this$asString`.variance.ordinal()]) {
            1 -> var4 = var4
            2 -> var4 = "in $var4"
            3 -> var4 = "out $var4"
            else -> throw NoWhenBranchMatchedException()
         }

         return var4
      }
   }

   public open val isMarkedNullable: Boolean
      public open get() {
         return (this.flags and 1) != 0
      }


   public override fun toString(): String {
      return "${this.asString(false)} (Kotlin reflection is not available)"
   }

   private final val arrayClassName: String
      private final get() {
         return if (`$this$arrayClassName` == boolean[]::class.java)
            "kotlin.BooleanArray"
            else
            (
               if (`$this$arrayClassName` == char[]::class.java)
                  "kotlin.CharArray"
                  else
                  (
                     if (`$this$arrayClassName` == byte[]::class.java)
                        "kotlin.ByteArray"
                        else
                        (
                           if (`$this$arrayClassName` == short[]::class.java)
                              "kotlin.ShortArray"
                              else
                              (
                                 if (`$this$arrayClassName` == int[]::class.java)
                                    "kotlin.IntArray"
                                    else
                                    (
                                       if (`$this$arrayClassName` == float[]::class.java)
                                          "kotlin.FloatArray"
                                          else
                                          (
                                             if (`$this$arrayClassName` == long[]::class.java)
                                                "kotlin.LongArray"
                                                else
                                                (if (`$this$arrayClassName` == double[]::class.java) "kotlin.DoubleArray" else "kotlin.Array")
                                          )
                                    )
                              )
                        )
                  )
            )
         }


   private fun asString(convertPrimitiveToWrapper: Boolean): String {
      val args: KClassifier = this.classifier
      val javaClass: Class = if ((args as? KClass) != null) java else null
      var var10000: java.lang.String
      if (javaClass == null) {
         var10000 = this.classifier.toString()
      } else if ((this.flags and 4) != 0) {
         var10000 = "kotlin.Nothing"
      } else if (javaClass.isArray()) {
         var10000 = this.arrayClassName
      } else if (convertPrimitiveToWrapper && javaClass.isPrimitive()) {
         val var10: KClassifier = this.classifier
         var10000 = javaObjectType.getName()
      } else {
         var10000 = javaClass.getName()
      }

      val result: java.lang.String = "$var10000${if (this.arguments.isEmpty())
         ""
         else
         CollectionsKt.joinToString$default(this.arguments, ", ", "<", ">", 0, null,       // $VF: Compiled from TypeReference.kt
   { it: KTypeProjection ->
            return TypeReference.this.asString(it)
         } as Function1, 24, null)}${if (this.isMarkedNullable) "?" else ""}"
      if (this.platformTypeUpperBound is TypeReference) {
         val renderedUpper: java.lang.String = (this.platformTypeUpperBound as TypeReference).asString(true)
         var10000 = if (renderedUpper == result) result else (if (renderedUpper == "$result?") "$result!" else "($result..$renderedUpper)")
      } else {
         var10000 = result
      }

      return var10000
   }

   public override fun hashCode(): Int {
      return (this.classifier.hashCode() * 31 + this.arguments.hashCode()) * 31 + Integer.hashCode(this.flags)
   }

   public open val annotations: List<Annotation>
      public open get() {
         return CollectionsKt.emptyList()
      }


   public constructor(classifier: KClassifier, arguments: List<KTypeProjection>, isMarkedNullable: Boolean) : this(
         classifier, arguments, null, if (isMarkedNullable) 1 else 0
      )
   init {
      this.classifier = classifier
      this.arguments = arguments
      this.platformTypeUpperBound = platformTypeUpperBound
      this.flags = flags
   }

   public override operator fun equals(other: Any?): Boolean {
      return other is TypeReference
         && this.classifier == (other as TypeReference).classifier
         && this.arguments == (other as TypeReference).arguments
         && this.platformTypeUpperBound == (other as TypeReference).platformTypeUpperBound
         && this.flags == (other as TypeReference).flags
      }

   // $VF: Compiled from TypeReference.kt
   internal companion object {
      internal const val IS_MARKED_NULLABLE: Int = 1
      internal const val IS_MUTABLE_COLLECTION_TYPE: Int = 2
      internal const val IS_NOTHING_TYPE: Int = 4
   }
}
