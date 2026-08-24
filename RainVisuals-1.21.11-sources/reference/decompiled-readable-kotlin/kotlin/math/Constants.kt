package kotlin.math

// $VF: Compiled from MathJVM.kt
private object Constants {
   @JvmField
   internal final val LN2: Double = Math.log(2.0)

   @JvmField
   internal final val upper_taylor_2_bound: Double = 1 / Constants.taylor_2_bound

   @JvmField
   internal final val taylor_2_bound: Double = Math.sqrt(Constants.epsilon)

   @JvmField
   internal final val taylor_n_bound: Double = Math.sqrt(taylor_2_bound)

   @JvmField
   internal final val upper_taylor_n_bound: Double = 1 / taylor_n_bound

   @JvmField
   internal final val epsilon: Double = Math.ulp(1.0)
}
