package oxxxde

import java.net.URI
import java.net.http.HttpHeaders
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.net.http.HttpRequest.Builder
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import java.security.SecureRandom
import java.util.HexFormat
import java.util.Locale
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec
import ru.ocz.protection.annotation.Compile

// $VF: Compiled from heavy
public object رق {
   private const val HMAC_ALGORITHM: String = "HmacSHA256"
   private final val secureRandom: SecureRandom = SecureRandom()
   private final val hexFormat: HexFormat = HexFormat.of()

   private fun requestTarget(uri: URI): String {
      var var10000: java.lang.String
      run label42@{
         val var3: java.lang.String = uri.getRawPath()
         if (var3 != null) {
            val var4: java.lang.String = if (var3.length() > 0) var3 else null
            if (var4 != null) {
               var10000 = var4
               return@label42
            }
         }

         var10000 = "/"
      }

      val var8: java.lang.String = uri.getRawQuery()
      if (var8 != null) {
         val var9: java.lang.String = "$var10000?$var8"
         if ("$var10000?$var8" != null) {
            return var9
         }
      }

      return var10000
   }

   public fun requireValidBinaryResponse(request: HttpRequest, response: HttpResponse<ByteArray>) {
      val var10002: Int = response.statusCode()
      val var10003: HttpHeaders = response.headers()
      val var10004: Any = response.body()
      this.requireValidResponse(request, var10002, var10003, var10004 as ByteArray)
   }

   public fun requireValidResponse(request: HttpRequest, statusCode: Int, headers: HttpHeaders, body: String) {
      val requestNonce: java.lang.String = request.headers().firstValue("X-Rain-Nonce").orElseThrow({ 
         SecurityException("Signed request does not contain a nonce")
      })
      val suppliedSignature: java.lang.String = headers.firstValue("X-Rain-Response-Signature").orElseThrow({ 
         SecurityException("Social API response is not signed")
      })
      val var10001: URI = request.uri()
      val target: java.lang.String = this.requestTarget(var10001)
      val var10000: HexFormat = hexFormat
      val var23: MessageDigest = MessageDigest.getInstance("SHA-256")
      val var10002: Charset = StandardCharsets.UTF_8
      val var24: ByteArray = body.getBytes(var10002)
      val var17: java.lang.String = this.hmac(
         CollectionsKt.joinToString$default(
            CollectionsKt.listOf(java.lang.String.valueOf(statusCode), target, requestNonce, var10000.formatHex(var23.digest(var24))),
            "\n",
            null,
            null,
            0,
            null,
            null,
            62,
            null
         )
      )
      val expectedBytes: رق = this

      var `$this$requireValidResponse_u24lambda_u242`: Any
      try {
         `$this$requireValidResponse_u24lambda_u242` = expectedBytes
         `$this$requireValidResponse_u24lambda_u242` = Result.constructor_impl/* $VF was: constructor-impl */(hexFormat.parseHex(suppliedSignature))
      } catch (var15: java.lang.Throwable) {
         `$this$requireValidResponse_u24lambda_u242` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var15))
      }

      val suppliedBytes: ByteArray = (if (isFailure) null else `$this$requireValidResponse_u24lambda_u242`) as ByteArray
      val var19: ByteArray = hexFormat.parseHex(var17)
      if (suppliedBytes == null || suppliedBytes.length != var19.length || !MessageDigest.isEqual(suppliedBytes, var19)) {
         throw IllegalArgumentException("Social API response signature is invalid".toString())
      }
   }

   public fun signedBuilder(uri: URI, method: String, body: String = ""): Builder {
      return this.signedBuilder(uri, method, body, false)
   }

   @Compile
   private fun signedBuilder(uri: URI, method: String, body: String, cloudIdentity: Boolean): Builder {
      val var7: java.lang.String = java.lang.String.valueOf(System.currentTimeMillis())
      val var8: ByteArray = ByteArray(16)
      secureRandom.nextBytes(var8)
      val var9: java.lang.String = hexFormat.formatHex(var8)
      val var10000: HexFormat = hexFormat
      val var10001: MessageDigest = MessageDigest.getInstance("SHA-256")
      val var10003: Charset = StandardCharsets.UTF_8
      val var10002: ByteArray = body.getBytes(var10003)
      val var10: java.lang.String = var10000.formatHex(var10001.digest(var10002))
      val var11: java.lang.String = this.requestTarget(uri)
      val var19: Array<Any> = arrayOfNulls(5)
      val var10004: Locale = Locale.ROOT
      val var20: java.lang.String = method.toUpperCase(var10004)
      var19[0] = var20
      var19[1] = var11
      var19[2] = var7
      var19[3] = var9
      var19[4] = var10
      val var12: java.lang.String = CollectionsKt.joinToString$default(CollectionsKt.listOf(var19), "\n", null, null, 0, null, null, 62, null)
      val var14: Builder = HttpRequest.newBuilder(uri)
         .header("X-Rain-Timestamp", var7)
         .header("X-Rain-Nonce", var9)
         .header("X-Rain-Signature", this.hmac(var12))
         if (cloudIdentity) {
         val var15: java.lang.String = java.lang.String.valueOf(رغ.getUid())
         val var16: java.lang.String = رغ.getUsername()
         var14.header("X-Rain-User-Uid", var15)
         var14.header("X-Rain-User-Name", var16)
         var14.header("X-Rain-Cloud-Public-Key", جز.INSTANCE.publicKeyBase64())
         var14.header("X-Rain-Cloud-Signature", جز.INSTANCE.signBase64(lamda$signedBuilder$1_3ec98000(var12, var15, var16)))
      }

      return var14
   }

   public fun requireValidResponse(request: HttpRequest, response: HttpResponse<String>) {
      val var10002: Int = response.statusCode()
      val var10003: HttpHeaders = response.headers()
      val var10004: Any = response.body()
      this.requireValidResponse(request, var10002, var10003, var10004 as java.lang.String)
   }

   public fun cloudSignedBuilder(uri: URI, method: String, body: String = ""): Builder {
      return this.signedBuilder(uri, method, body, true)
   }

   private fun hmac(payload: String): String {
      val mac: Mac = Mac.getInstance("HmacSHA256")
      val var10003: Charset = StandardCharsets.UTF_8
      val var7: ByteArray = "/vgNOx5p0Ujq/7gsCYmXBgmSkxNUmoLq4UZ+ThDHfo6APaPAYmyLPWzcS7j0AEng".getBytes(var10003)
      mac.init(SecretKeySpec(var7, "HmacSHA256"))
      val var10000: HexFormat = hexFormat
      val var10002: Charset = StandardCharsets.UTF_8
      val var6: ByteArray = payload.getBytes(var10002)
      val var5: java.lang.String = var10000.formatHex(mac.doFinal(var6))
      return var5
   }

   public fun requireValidResponse(request: HttpRequest, statusCode: Int, headers: HttpHeaders, body: ByteArray) {
      val requestNonce: java.lang.String = request.headers().firstValue("X-Rain-Nonce").orElseThrow({ 
         SecurityException("Signed request does not contain a nonce")
      })
      val suppliedSignature: java.lang.String = headers.firstValue("X-Rain-Response-Signature").orElseThrow({ 
         SecurityException("Social API response is not signed")
      })
      val var10001: URI = request.uri()
      val var16: java.lang.String = this.hmac(
         CollectionsKt.joinToString$default(
            CollectionsKt.listOf(
               java.lang.String.valueOf(statusCode),
               this.requestTarget(var10001),
               requestNonce,
               hexFormat.formatHex(MessageDigest.getInstance("SHA-256").digest(body))
            ),
            "\n",
            null,
            null,
            0,
            null,
            null,
            62,
            null
         )
      )
      val expectedBytes: رق = this

      var `$this$requireValidResponse_u24lambda_u246`: Any
      try {
         `$this$requireValidResponse_u24lambda_u246` = expectedBytes
         `$this$requireValidResponse_u24lambda_u246` = Result.constructor_impl/* $VF was: constructor-impl */(hexFormat.parseHex(suppliedSignature))
      } catch (var15: java.lang.Throwable) {
         `$this$requireValidResponse_u24lambda_u246` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var15))
      }

      val suppliedBytes: ByteArray = (if (isFailure) null else `$this$requireValidResponse_u24lambda_u246`) as ByteArray
      val var18: ByteArray = hexFormat.parseHex(var16)
      if (suppliedBytes == null || suppliedBytes.length != var18.length || !MessageDigest.isEqual(suppliedBytes, var18)) {
         throw IllegalArgumentException("Social API response signature is invalid".toString())
      }
   }
}
