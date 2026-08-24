package kotlin

// $VF: Compiled from DeepRecursive.kt
private final val UNDEFINED_RESULT: Result<Any>

@SinceKotlin(version = "1.7")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public operator fun <T, R> DeepRecursiveFunction<Any, Any>.invoke(value: Any): Any {
   return (R)DeepRecursiveScopeImpl(`$this$invoke`.block, value).runCallLoop()
}
