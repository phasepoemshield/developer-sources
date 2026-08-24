package kotlinx.serialization

// $VF: Compiled from SerializationExceptions.kt
@ExperimentalSerializationApi
public class MissingFieldException(missingFields: List<String>, message: String?, cause: Throwable?) : SerializationException(message, cause) {
   public final val missingFields: List<String>

   public constructor(missingField: String, serialName: String) : this(
         CollectionsKt.listOf(missingField), "Field '$missingField' is required for type with serial name '$serialName', but it was missing", null
      )
   public constructor(missingFields: List<String>, serialName: String) : this(
         missingFields,
         if (missingFields.size() == 1)
            "Field '${missingFields.get(0) as java.lang.String}' is required for type with serial name '$serialName', but it was missing"
            else
            "Fields $missingFields are required for type with serial name '$serialName', but they were missing",
         null
      )
   @PublishedApi
   internal constructor(missingField: String) : this(CollectionsKt.listOf(missingField), "Field '$missingField' is required, but it was missing", null)
   init {
      this.missingFields = missingFields
   }
}
