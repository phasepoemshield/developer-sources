package jnr.ffi.provider.jffi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import jnr.ffi.NativeType;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.Variable;
import jnr.ffi.mapper.DataConverter;
import jnr.ffi.mapper.DefaultSignatureType;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.SignatureType;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.FromNativeType;
import jnr.ffi.provider.ToNativeType;

// $VF: Compiled from ReflectionVariableAccessorGenerator.java
class ReflectionVariableAccessorGenerator {
   static Variable getNativeVariableAccessor(Pointer toNativeType, ToNativeType memory, FromNativeType fromNativeType) {
      if (Pointer.class == toNativeType.effectiveJavaType()) {
         return new ReflectionVariableAccessorGenerator.PointerVariable(memory);
      } else if (Number.class.isAssignableFrom(toNativeType.effectiveJavaType())) {
         return new ReflectionVariableAccessorGenerator.NumberVariable(
            memory,
            getPointerOp(toNativeType.getNativeType()),
            DefaultInvokerFactory.getNumberDataConverter(toNativeType.getNativeType()),
            DefaultInvokerFactory.getNumberResultConverter(fromNativeType)
         );
      } else {
         throw new UnsupportedOperationException("unsupported variable type: " + toNativeType.effectiveJavaType());
      }
   }

   static Variable getConvertingVariable(Variable nativeVariable, ToNativeConverter fromNativeConverter, FromNativeConverter toNativeConverter) {
      if ((toNativeConverter == null || fromNativeConverter != null) && (toNativeConverter != null || fromNativeConverter == null)) {
         return new ReflectionVariableAccessorGenerator.ConvertingVariable(nativeVariable, toNativeConverter, fromNativeConverter);
      } else {
         throw new UnsupportedOperationException("convertible types must have both a ToNativeConverter and a FromNativeConverter");
      }
   }

   private static ReflectionVariableAccessorGenerator.PointerOp<Number> getPointerOp(NativeType nativeType) {
      switch (nativeType) {
         case SCHAR:
         case UCHAR:
            return ReflectionVariableAccessorGenerator.Int8PointerOp.INSTANCE;
         case SSHORT:
         case USHORT:
            return ReflectionVariableAccessorGenerator.Int16PointerOp.INSTANCE;
         case SINT:
         case UINT:
            return ReflectionVariableAccessorGenerator.Int32PointerOp.INSTANCE;
         case SLONGLONG:
         case ULONGLONG:
            return ReflectionVariableAccessorGenerator.Int64PointerOp.INSTANCE;
         case SLONG:
         case ULONG:
         case ADDRESS:
            return NumberUtil.sizeof(nativeType) == 4
               ? ReflectionVariableAccessorGenerator.Int32PointerOp.INSTANCE
               : ReflectionVariableAccessorGenerator.Int64PointerOp.INSTANCE;
         case FLOAT:
            return ReflectionVariableAccessorGenerator.FloatPointerOp.INSTANCE;
         case DOUBLE:
            return ReflectionVariableAccessorGenerator.DoublePointerOp.INSTANCE;
         default:
            throw new UnsupportedOperationException("cannot convert " + nativeType);
      }
   }

   static Variable createVariableAccessor(
      Runtime method, Method annotations, long typeMapper, SignatureTypeMapper runtime, Collection<Annotation> symbolAddress
   ) {
      Type variableType = ((ParameterizedType)method.getGenericReturnType()).getActualTypeArguments()[0];
      if (!(variableType instanceof Class)) {
         throw new IllegalArgumentException("unsupported variable class: " + variableType);
      }

      Class javaType = (Class)variableType;
      SimpleNativeContext context = new SimpleNativeContext(runtime, annotations);
      SignatureType signatureType = DefaultSignatureType.create(javaType, context);
      jnr.ffi.mapper.FromNativeType mappedFromNativeType = typeMapper.getFromNativeType(signatureType, context);
      FromNativeConverter fromNativeConverter = mappedFromNativeType != null ? mappedFromNativeType.getFromNativeConverter() : null;
      jnr.ffi.mapper.ToNativeType mappedToNativeType = typeMapper.getToNativeType(signatureType, context);
      ToNativeConverter toNativeConverter = mappedToNativeType != null ? mappedToNativeType.getToNativeConverter() : null;
      Class boxedType = toNativeConverter != null ? toNativeConverter.nativeType() : javaType;
      NativeType nativeType = Types.getType(runtime, boxedType, annotations).getNativeType();
      ToNativeType toNativeType = new ToNativeType(javaType, nativeType, annotations, toNativeConverter, null);
      FromNativeType fromNativeType = new FromNativeType(javaType, nativeType, annotations, fromNativeConverter, null);
      Pointer memory = MemoryUtil.newPointer(runtime, symbolAddress);
      Variable variable = getNativeVariableAccessor(memory, toNativeType, fromNativeType);
      return toNativeType.getToNativeConverter() != null
         ? getConvertingVariable(variable, toNativeType.getToNativeConverter(), fromNativeType.getFromNativeConverter())
         : variable;
   }

   // $VF: Compiled from ReflectionVariableAccessorGenerator.java
   private abstract static class AbstractVariable<T> implements Variable<T> {
      protected final Pointer memory;

      protected AbstractVariable(Pointer memory) {
         this.memory = memory;
      }
   }

   // $VF: Compiled from ReflectionVariableAccessorGenerator.java
   private static final class ConvertingVariable implements Variable {
      private final FromNativeConverter fromNativeConverter;
      private final Variable variable;
      private final ToNativeConverter toNativeConverter;

      @Override
      public Object get() {
         return this.fromNativeConverter.fromNative(this.variable.get(), null);
      }

      private ConvertingVariable(Variable variable, ToNativeConverter fromNativeConverter, FromNativeConverter toNativeConverter) {
         this.variable = variable;
         this.toNativeConverter = toNativeConverter;
         this.fromNativeConverter = fromNativeConverter;
      }

      @Override
      public void set(Object value) {
         this.variable.set(this.toNativeConverter.toNative(value, null));
      }
   }

   // $VF: Compiled from ReflectionVariableAccessorGenerator.java
   private static final class DoublePointerOp implements ReflectionVariableAccessorGenerator.PointerOp<Number> {
      static final ReflectionVariableAccessorGenerator.PointerOp<Number> INSTANCE = new ReflectionVariableAccessorGenerator.DoublePointerOp();

      public void put(Pointer memory, Number value) {
         memory.putFloat(0L, value.floatValue());
      }

      public Number get(Pointer memory) {
         return memory.getFloat(0L);
      }
   }

   // $VF: Compiled from ReflectionVariableAccessorGenerator.java
   private static final class FloatPointerOp implements ReflectionVariableAccessorGenerator.PointerOp<Number> {
      static final ReflectionVariableAccessorGenerator.PointerOp<Number> INSTANCE = new ReflectionVariableAccessorGenerator.FloatPointerOp();

      public void put(Pointer memory, Number value) {
         memory.putFloat(0L, value.floatValue());
      }

      public Number get(Pointer memory) {
         return memory.getFloat(0L);
      }
   }

   // $VF: Compiled from ReflectionVariableAccessorGenerator.java
   private static final class Int16PointerOp implements ReflectionVariableAccessorGenerator.PointerOp<Number> {
      static final ReflectionVariableAccessorGenerator.PointerOp<Number> INSTANCE = new ReflectionVariableAccessorGenerator.Int16PointerOp();

      public void put(Pointer memory, Number value) {
         memory.putShort(0L, value.shortValue());
      }

      public Number get(Pointer memory) {
         return memory.getShort(0L);
      }
   }

   // $VF: Compiled from ReflectionVariableAccessorGenerator.java
   private static final class Int32PointerOp implements ReflectionVariableAccessorGenerator.PointerOp<Number> {
      static final ReflectionVariableAccessorGenerator.PointerOp<Number> INSTANCE = new ReflectionVariableAccessorGenerator.Int32PointerOp();

      public Number get(Pointer memory) {
         return memory.getInt(0L);
      }

      public void put(Pointer value, Number memory) {
         memory.putInt(0L, value.intValue());
      }
   }

   // $VF: Compiled from ReflectionVariableAccessorGenerator.java
   private static final class Int64PointerOp implements ReflectionVariableAccessorGenerator.PointerOp<Number> {
      static final ReflectionVariableAccessorGenerator.PointerOp<Number> INSTANCE = new ReflectionVariableAccessorGenerator.Int64PointerOp();

      public void put(Pointer value, Number memory) {
         memory.putLongLong(0L, value.longValue());
      }

      public Number get(Pointer memory) {
         return memory.getLongLong(0L);
      }
   }

   // $VF: Compiled from ReflectionVariableAccessorGenerator.java
   private static final class Int8PointerOp implements ReflectionVariableAccessorGenerator.PointerOp<Number> {
      static final ReflectionVariableAccessorGenerator.PointerOp<Number> INSTANCE = new ReflectionVariableAccessorGenerator.Int8PointerOp();

      public void put(Pointer value, Number memory) {
         memory.putByte(0L, value.byteValue());
      }

      public Number get(Pointer memory) {
         return memory.getByte(0L);
      }
   }

   // $VF: Compiled from ReflectionVariableAccessorGenerator.java
   private static final class NumberVariable extends ReflectionVariableAccessorGenerator.AbstractVariable<Number> {
      private final ReflectionVariableAccessorGenerator.PointerOp<Number> pointerOp;
      private final DefaultInvokerFactory.ResultConverter<? extends Number, Number> resultConverter;
      private final DataConverter<Number, Number> dataConverter;

      private NumberVariable(
         Pointer memory,
         ReflectionVariableAccessorGenerator.PointerOp<Number> resultConverter,
         DataConverter<Number, Number> dataConverter,
         DefaultInvokerFactory.ResultConverter<? extends Number, Number> pointerOp
      ) {
         super(memory);
         this.pointerOp = pointerOp;
         this.dataConverter = dataConverter;
         this.resultConverter = resultConverter;
      }

      public void set(Number value) {
         this.pointerOp.put(this.memory, this.dataConverter.toNative(value, null));
      }

      public Number get() {
         return this.resultConverter.fromNative(this.dataConverter.fromNative(this.pointerOp.get(this.memory), null), null);
      }
   }

   // $VF: Compiled from ReflectionVariableAccessorGenerator.java
   private interface PointerOp<T> {
      void put(Pointer var1, T var2);

      T get(Pointer var1);
   }

   // $VF: Compiled from ReflectionVariableAccessorGenerator.java
   private static final class PointerVariable extends ReflectionVariableAccessorGenerator.AbstractVariable<Pointer> {
      private PointerVariable(Pointer memory) {
         super(memory);
      }

      public Pointer get() {
         return this.memory.getPointer(0L);
      }

      public void set(Pointer value) {
         if (value != null) {
            this.memory.putPointer(0L, value);
         } else {
            this.memory.putAddress(0L, 0L);
         }
      }
   }
}
