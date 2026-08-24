package kotlin.collections

import kotlin.jvm.internal.Intrinsics

// $VF: Compiled from UArraySorting.kt
@ExperimentalUnsignedTypes
private fun partition(array: UShortArray, left: Int, right: Int): Int {
   var i: Int = left
   var j: Int = right
   val pivot: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(array, (left + right) / 2)

   while (i <= j) {
      while (Intrinsics.compare(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(array, i) and 65535, pivot and 65535) < 0) {
         i++
      }

      while (Intrinsics.compare(UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(array, j) and 65535, pivot and 65535) > 0) {
         j--
      }

      if (i <= j) {
         val tmp: Short = UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(array, i)
         UShortArray.set_01HTLdE/* $VF was: set-01HTLdE */(array, i, UShortArray.get_Mh2AYeg/* $VF was: get-Mh2AYeg */(array, j))
         UShortArray.set_01HTLdE/* $VF was: set-01HTLdE */(array, j, tmp)
         i++
         j--
      }
   }

   return i
}

@ExperimentalUnsignedTypes
private fun quickSort(array: UIntArray, left: Int, right: Int) {
   val index: Int = partition_oBK06Vg/* $VF was: partition-oBK06Vg */(array, left, right)
   if (left < index + -1) {
      quickSort_oBK06Vg/* $VF was: quickSort-oBK06Vg */(array, left, index + -1)
   }

   if (index < right) {
      quickSort_oBK06Vg/* $VF was: quickSort-oBK06Vg */(array, index, right)
   }
}

@ExperimentalUnsignedTypes
private fun quickSort(array: UShortArray, left: Int, right: Int) {
   val index: Int = partition_Aa5vz7o/* $VF was: partition-Aa5vz7o */(array, left, right)
   if (left < index + -1) {
      quickSort_Aa5vz7o/* $VF was: quickSort-Aa5vz7o */(array, left, index + -1)
   }

   if (index < right) {
      quickSort_Aa5vz7o/* $VF was: quickSort-Aa5vz7o */(array, index, right)
   }
}

@ExperimentalUnsignedTypes
private fun partition(array: ULongArray, left: Int, right: Int): Int {
   var i: Int = left
   var j: Int = right
   val pivot: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(array, (left + right) / 2)

   while (i <= j) {
      while (java.lang.Long.compareUnsigned(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(array, i), pivot) < 0) {
         i++
      }

      while (java.lang.Long.compareUnsigned(ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(array, j), pivot) > 0) {
         j--
      }

      if (i <= j) {
         val tmp: Long = ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(array, i)
         ULongArray.set_k8EXiF4/* $VF was: set-k8EXiF4 */(array, i, ULongArray.get_s_VKNKU/* $VF was: get-s-VKNKU */(array, j))
         ULongArray.set_k8EXiF4/* $VF was: set-k8EXiF4 */(array, j, tmp)
         i++
         j--
      }
   }

   return i
}

@ExperimentalUnsignedTypes
private fun partition(array: UByteArray, left: Int, right: Int): Int {
   var i: Int = left
   var j: Int = right
   val pivot: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(array, (left + right) / 2)

   while (i <= j) {
      while (Intrinsics.compare(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(array, i) and 255, pivot and 255) < 0) {
         i++
      }

      while (Intrinsics.compare(UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(array, j) and 255, pivot and 255) > 0) {
         j--
      }

      if (i <= j) {
         val tmp: Byte = UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(array, i)
         UByteArray.set_VurrAj0/* $VF was: set-VurrAj0 */(array, i, UByteArray.get_w2LRezQ/* $VF was: get-w2LRezQ */(array, j))
         UByteArray.set_VurrAj0/* $VF was: set-VurrAj0 */(array, j, tmp)
         i++
         j--
      }
   }

   return i
}

@ExperimentalUnsignedTypes
private fun partition(array: UIntArray, left: Int, right: Int): Int {
   var i: Int = left
   var j: Int = right
   val pivot: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(array, (left + right) / 2)

   while (i <= j) {
      while (Integer.compareUnsigned(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(array, i), pivot) < 0) {
         i++
      }

      while (Integer.compareUnsigned(UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(array, j), pivot) > 0) {
         j--
      }

      if (i <= j) {
         val tmp: Int = UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(array, i)
         UIntArray.set_VXSXFK8/* $VF was: set-VXSXFK8 */(array, i, UIntArray.get_pVg5ArA/* $VF was: get-pVg5ArA */(array, j))
         UIntArray.set_VXSXFK8/* $VF was: set-VXSXFK8 */(array, j, tmp)
         i++
         j--
      }
   }

   return i
}

@ExperimentalUnsignedTypes
private fun quickSort(array: UByteArray, left: Int, right: Int) {
   val index: Int = partition_4UcCI2c/* $VF was: partition-4UcCI2c */(array, left, right)
   if (left < index + -1) {
      quickSort_4UcCI2c/* $VF was: quickSort-4UcCI2c */(array, left, index + -1)
   }

   if (index < right) {
      quickSort_4UcCI2c/* $VF was: quickSort-4UcCI2c */(array, index, right)
   }
}

@ExperimentalUnsignedTypes
internal fun sortArray(array: ULongArray, fromIndex: Int, toIndex: Int) {
   quickSort__nroSd4/* $VF was: quickSort--nroSd4 */(array, fromIndex, toIndex + -1)
}

@ExperimentalUnsignedTypes
private fun quickSort(array: ULongArray, left: Int, right: Int) {
   val index: Int = partition__nroSd4/* $VF was: partition--nroSd4 */(array, left, right)
   if (left < index + -1) {
      quickSort__nroSd4/* $VF was: quickSort--nroSd4 */(array, left, index + -1)
   }

   if (index < right) {
      quickSort__nroSd4/* $VF was: quickSort--nroSd4 */(array, index, right)
   }
}

@ExperimentalUnsignedTypes
internal fun sortArray(array: UShortArray, fromIndex: Int, toIndex: Int) {
   quickSort_Aa5vz7o/* $VF was: quickSort-Aa5vz7o */(array, fromIndex, toIndex + -1)
}

@ExperimentalUnsignedTypes
internal fun sortArray(array: UByteArray, fromIndex: Int, toIndex: Int) {
   quickSort_4UcCI2c/* $VF was: quickSort-4UcCI2c */(array, fromIndex, toIndex + -1)
}

@ExperimentalUnsignedTypes
internal fun sortArray(array: UIntArray, fromIndex: Int, toIndex: Int) {
   quickSort_oBK06Vg/* $VF was: quickSort-oBK06Vg */(array, fromIndex, toIndex + -1)
}
