package com.kenai.jffi;

import java.util.List;

// $VF: Compiled from Type.java
public abstract class Type {
   public static final Type UINT8 = builtin(NativeType.UINT8);
   public static final Type VOID = builtin(NativeType.VOID);
   public static final Type DOUBLE = builtin(NativeType.DOUBLE);
   public static final Type UINT64 = builtin(NativeType.UINT64);
   public static final Type FLOAT = builtin(NativeType.FLOAT);
   public static final Type UINT32 = builtin(NativeType.UINT32);
   public static final Type POINTER = builtin(NativeType.POINTER);
   public static final Type SINT16 = builtin(NativeType.SINT16);
   public static final Type SLONG = builtin(NativeType.SLONG);
   public static final Type SLONG_LONG = Type.SINT64;
   public static final Type ULONG = builtin(NativeType.ULONG);
   public static final Type ULONG_LONG = UINT64;
   public static final Type SCHAR = Type.SINT8;
   public static final Type USHORT = Type.UINT16;
   private int size;
   public static final Type SSHORT = SINT16;
   public static final Type SINT8 = builtin(NativeType.SINT8);
   public static final Type UCHAR = UINT8;
   private volatile long handle;
   public static final Type UINT = UINT32;
   public static final Type SINT = Type.SINT32;
   public static final Type SINT64 = builtin(NativeType.SINT64);
   private int type = 0;
   public static final Type UINT16 = builtin(NativeType.UINT16);
   public static final Type SINT32 = builtin(NativeType.SINT32);
   private int alignment;
   public static final Type LONGDOUBLE = builtin(NativeType.LONGDOUBLE);

   private int resolveAlignment() {
      return this.alignment = this.getTypeInfo().alignment;
   }

   @Override
   public int hashCode() {
      int hash = 3;
      return 67 * hash + (int)(this.handle() ^ this.handle() >>> 32);
   }

   public Type() {
      this.size = 0;
      this.alignment = 0;
      this.handle = 0L;
   }

   public final int alignment() {
      return this.alignment != 0 ? this.alignment : this.resolveAlignment();
   }

   private static Type builtin(NativeType nativeType) {
      return new Type.Builtin(nativeType);
   }

   final long handle() {
      return this.handle != 0L ? this.handle : this.resolveHandle();
   }

   private int resolveSize() {
      return this.size = this.getTypeInfo().size;
   }

   public final int type() {
      return this.type != 0 ? this.type : this.resolveType();
   }

   @Override
   public boolean equals(Object obj) {
      return obj instanceof Type && ((Type)obj).handle() == this.handle();
   }

   abstract Type.TypeInfo getTypeInfo();

   private int resolveType() {
      return this.type = this.getTypeInfo().type;
   }

   static long[] nativeHandles(List<Type> types) {
      long[] nativeTypes = new long[types.size()];

      for (int i = 0; i < nativeTypes.length; i++) {
         nativeTypes[i] = types.get(i).handle();
      }

      return nativeTypes;
   }

   private long resolveHandle() {
      return this.handle = this.getTypeInfo().handle;
   }

   static long[] nativeHandles(Type[] types) {
      long[] nativeTypes = new long[types.length];

      for (int i = 0; i < types.length; i++) {
         nativeTypes[i] = types[i].handle();
      }

      return nativeTypes;
   }

   public final int size() {
      return this.size != 0 ? this.size : this.resolveSize();
   }

   // $VF: Compiled from Type.java
   static final class Builtin extends Type {
      private final NativeType nativeType;
      private Type.TypeInfo typeInfo;

      @Override
      public int hashCode() {
         int result = super.hashCode();
         return 31 * result + this.nativeType.hashCode();
      }

      private Type.TypeInfo lookupTypeInfo() {
         try {
            Foreign foreign = Foreign.getInstance();
            long handle = foreign.lookupBuiltinType(this.nativeType.ffiType);
            if (handle == 0L) {
               throw new NullPointerException("invalid handle for native type " + this.nativeType);
            } else {
               return this.typeInfo = new Type.TypeInfo(handle, foreign.getTypeType(handle), foreign.getTypeSize(handle), foreign.getTypeAlign(handle));
            }
         } catch (Throwable var4) {
            throw new UnsatisfiedLinkError(
               "could not get native definition for type `" + this.nativeType + "`, original error message follows: " + var4.getLocalizedMessage()
            );
         }
      }

      private Builtin(NativeType nativeType) {
         this.nativeType = nativeType;
      }

      @Override
      public boolean equals(Object o) {
         if (this == o) {
            return true;
         }

         if (o == null || this.getClass() != o.getClass()) {
            return false;
         }

         if (!super.equals(o)) {
            return false;
         }

         Type.Builtin builtin = (Type.Builtin)o;
         return this.nativeType == builtin.nativeType;
      }

      @Override
      Type.TypeInfo getTypeInfo() {
         return this.typeInfo != null ? this.typeInfo : this.lookupTypeInfo();
      }
   }

   // $VF: Compiled from Type.java
   static final class TypeInfo {
      final int type;
      final int alignment;
      final int size;
      final long handle;

      TypeInfo(long size, int type, int handle, int alignment) {
         this.handle = handle;
         this.type = type;
         this.size = size;
         this.alignment = alignment;
      }
   }
}
