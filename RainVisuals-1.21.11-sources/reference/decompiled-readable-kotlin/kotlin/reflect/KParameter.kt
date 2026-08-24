package kotlin.reflect

import kotlin.enums.EnumEntries

// $VF: Compiled from KParameter.kt
public interface KParameter : KAnnotatedElement {
   public val kind: kotlin.reflect.KParameter.Kind

   public val index: Int

   public val name: String?

   public val type: KType

   public val isVararg: Boolean

   public val isOptional: Boolean

   // $VF: Class flags could not be determined
   // $VF: Compiled from KParameter.kt
   internal class DefaultImpls

   // $VF: Compiled from KParameter.kt
   public enum class Kind {
      EXTENSION_RECEIVER,
      INSTANCE,
      VALUE;

      @JvmStatic
      fun getEntries(): EnumEntries<KParameter.Kind> {
         $ENTRIES
      }
   }
}
