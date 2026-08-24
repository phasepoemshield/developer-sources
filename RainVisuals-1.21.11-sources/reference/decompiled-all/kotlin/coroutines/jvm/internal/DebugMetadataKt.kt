package kotlin.coroutines.jvm.internal

import java.lang.reflect.Field
import java.util.ArrayList

// $VF: Compiled from DebugMetadata.kt
private const val COROUTINES_DEBUG_METADATA_VERSION: Int = 1

private fun checkDebugMetadataVersion(expected: Int, actual: Int) {
   if (actual > expected) {
      throw IllegalStateException(("Debug metadata version mismatch. Expected: $expected, got $actual. Please update the Kotlin standard library.").toString())
   }
}

private fun BaseContinuationImpl.getLabel(): Int {
   var field: Int
   try {
      val var5: Field = `$this$getLabel`.getClass().getDeclaredField("label")
      var5.setAccessible(true)
      val var3: Any = var5.get(`$this$getLabel`)
      field = (if ((var3 as? Int) != null) var3 as? Int else 0) - 1
   } catch (var4: Exception) {
      field = -1
   }

   return field
}

@SinceKotlin(version = "1.3")
@JvmName(name = "getSpilledVariableFieldMapping")
internal fun BaseContinuationImpl.getSpilledVariableFieldMapping(): Array<String>? {
   val var10000: DebugMetadata = getDebugMetadataAnnotation(`$this$getSpilledVariableFieldMapping`)
   if (var10000 == null) {
      return null
   } else {
      val debugMetadata: DebugMetadata = var10000
      checkDebugMetadataVersion(1, var10000.version)
      val res: ArrayList = ArrayList()
      val label: Int = getLabel(`$this$getSpilledVariableFieldMapping`)
      val `$this$toTypedArray$iv`: IntArray = var10000.indexToLabel
      var `$i$f$toTypedArray`: Int = 0

      for (`thisCollection$iv` in `$this$toTypedArray$iv`.length..`$i$f$toTypedArray`) {
         if (`$this$toTypedArray$iv`[`$i$f$toTypedArray`] == label) {
            res.add(debugMetadata.spilled[`$i$f$toTypedArray`])
            res.add(debugMetadata.localNames[`$i$f$toTypedArray`])
         }
      }

      return res.toArray(arrayOfNulls(0))
   }
}

private fun BaseContinuationImpl.getDebugMetadataAnnotation(): DebugMetadata? {
   return `$this$getDebugMetadataAnnotation`.getClass().getAnnotation(DebugMetadata.class)
}

@SinceKotlin(version = "1.3")
@JvmName(name = "getStackTraceElement")
internal fun BaseContinuationImpl.getStackTraceElementImpl(): StackTraceElement? {
   val var10000: DebugMetadata = getDebugMetadataAnnotation(`$this$getStackTraceElementImpl`)
   if (var10000 == null) {
      return null
   } else {
      checkDebugMetadataVersion(1, var10000.version)
      val label: Int = getLabel(`$this$getStackTraceElementImpl`)
      val lineNumber: Int = if (label < 0) -1 else var10000.lineNumbers[label]
      val moduleName: java.lang.String = ModuleNameRetriever.INSTANCE.getModuleName(`$this$getStackTraceElementImpl`)
      return StackTraceElement(
         if (moduleName == null) var10000.className else "$moduleName/${var10000.className}", var10000.methodName, var10000.sourceFile, lineNumber
      )
   }
}
