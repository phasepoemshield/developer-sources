package kotlin.enums

// $VF: Compiled from EnumEntries.kt
@PublishedApi
@SinceKotlin(version = "1.8")
internal fun <E : Enum<Any>> enumEntries(entriesProvider: () -> Array<Any>): EnumEntries<Any> {
   return EnumEntriesList(entriesProvider() as Array<java.lang.Enum>)
}

@PublishedApi
@SinceKotlin(version = "1.8")
internal fun <E : Enum<Any>> enumEntries(entries: Array<Any>): EnumEntries<Any> {
   return EnumEntriesList(entries)
}
