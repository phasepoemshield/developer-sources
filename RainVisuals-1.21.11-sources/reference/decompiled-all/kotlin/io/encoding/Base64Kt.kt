package kotlin.io.encoding

// $VF: Compiled from Base64.kt
private final val base64EncodeMap: ByteArray =
   byteArrayOf(
      65,
      66,
      67,
      68,
      69,
      70,
      71,
      72,
      73,
      74,
      75,
      76,
      77,
      78,
      79,
      80,
      81,
      82,
      83,
      84,
      85,
      86,
      87,
      88,
      89,
      90,
      97,
      98,
      99,
      100,
      101,
      102,
      103,
      104,
      105,
      106,
      107,
      108,
      109,
      110,
      111,
      112,
      113,
      114,
      115,
      116,
      117,
      118,
      119,
      120,
      121,
      122,
      48,
      49,
      50,
      51,
      52,
      53,
      54,
      55,
      56,
      57,
      43,
      47
   )

@ExperimentalEncodingApi
private final val base64UrlDecodeMap: IntArray

@ExperimentalEncodingApi
private final val base64DecodeMap: IntArray

private final val base64UrlEncodeMap: ByteArray

@SinceKotlin(version = "1.8")
@ExperimentalEncodingApi
internal fun isInMimeAlphabet(symbol: Int): Boolean {
   return 0 <= symbol && symbol < base64DecodeMap.length && base64DecodeMap[symbol] != -1
}

fun {
   var var12: IntArray = IntArray(256)
   var `$this$base64UrlDecodeMap_u24lambda_u243`: IntArray = var12
   ArraysKt.fill$default((int[])var12, (int)-1, 0, 0, 6, null)
   var12[61] = -2
   var `index$iv`: Int = 0

   for (`item$iv` in base64EncodeMap) {
      `$this$base64UrlDecodeMap_u24lambda_u243`[`item$iv`] = `index$iv`++
   }

   base64DecodeMap = var12
   base64UrlEncodeMap = byteArrayOf(
      65,
      66,
      67,
      68,
      69,
      70,
      71,
      72,
      73,
      74,
      75,
      76,
      77,
      78,
      79,
      80,
      81,
      82,
      83,
      84,
      85,
      86,
      87,
      88,
      89,
      90,
      97,
      98,
      99,
      100,
      101,
      102,
      103,
      104,
      105,
      106,
      107,
      108,
      109,
      110,
      111,
      112,
      113,
      114,
      115,
      116,
      117,
      118,
      119,
      120,
      121,
      122,
      48,
      49,
      50,
      51,
      52,
      53,
      54,
      55,
      56,
      57,
      45,
      95
   )
   var12 = IntArray(256)
   `$this$base64UrlDecodeMap_u24lambda_u243` = var12
   ArraysKt.fill$default((int[])var12, (int)-1, 0, 0, 6, null)
   var12[61] = -2
   `index$iv` = 0

   for (var22 in base64UrlEncodeMap) {
      `$this$base64UrlDecodeMap_u24lambda_u243`[var22] = `index$iv`++
   }

   base64UrlDecodeMap = var12
}
