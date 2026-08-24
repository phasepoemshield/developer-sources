package com.kenai.jffi;

// $VF: Compiled from NativeType.java
public enum NativeType {
   SINT16(8),
   POINTER(14),
   SINT(106),
   UCHAR(101),
   UINT(105),
   USHORT(103),
   FLOAT(2),
   SINT64(12),
   UINT32(9),
   SINT32(10),
   LONGDOUBLE(4),
   VOID(0),
   ULONG(107),
   SCHAR(102),
   UINT64(11),
   UINT16(7),
   STRUCT(13),
   DOUBLE(3),
   SSHORT(104),
   SLONG(108),
   UINT8(5),
   SINT8(6);

   final int ffiType;

   NativeType(int ffiType) {
      this.ffiType = ffiType;
   }
}
