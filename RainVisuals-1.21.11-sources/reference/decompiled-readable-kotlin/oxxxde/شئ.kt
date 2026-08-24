package oxxxde

// $VF: Compiled from heavy
public class شئ(code: String, cause: Throwable? = null, httpStatus: Int? = null, details: String? = null) : RuntimeException(code, cause) {
   public final val code: String
   public final val httpStatus: Int?
   public final val details: String?

   init {
      this.code = code
      this.httpStatus = httpStatus
      this.details = details
   }
}
