package jnr.ffi.provider.jffi;

import com.kenai.jffi.Function;
import com.kenai.jffi.HeapInvocationBuffer;
import com.kenai.jffi.ObjectParameterStrategy;
import com.kenai.jffi.ObjectParameterType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import jnr.ffi.Address;
import jnr.ffi.CallingConvention;
import jnr.ffi.LibraryOption;
import jnr.ffi.NativeType;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.annotations.Meta;
import jnr.ffi.annotations.StdCall;
import jnr.ffi.annotations.Synchronized;
import jnr.ffi.annotations.Variadic;
import jnr.ffi.mapper.DataConverter;
import jnr.ffi.mapper.DefaultSignatureType;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.FunctionMapper;
import jnr.ffi.mapper.MethodResultContext;
import jnr.ffi.mapper.SignatureType;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.mapper.ToNativeType;
import jnr.ffi.provider.FromNativeType;
import jnr.ffi.provider.InvocationSession;
import jnr.ffi.provider.Invoker;
import jnr.ffi.provider.NativeFunction;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.ffi.provider.SigType;
import jnr.ffi.util.AnnotationProxy;
import jnr.ffi.util.Annotations;

// $VF: Compiled from DefaultInvokerFactory.java
final class DefaultInvokerFactory {
   private final FunctionMapper functionMapper;
   private final SignatureTypeMapper typeMapper;
   private final NativeLibrary library;
   private final Runtime runtime;
   private final CallingConvention libraryCallingConvention;
   private final boolean libraryIsSynchronized;
   private final Map<LibraryOption, ?> libraryOptions;

   static DefaultInvokerFactory.Marshaller getMarshaller(ParameterType parameterType) {
      DefaultInvokerFactory.Marshaller marshaller = getMarshaller(
         parameterType.effectiveJavaType(), parameterType.getNativeType(), parameterType.getAnnotations()
      );
      return parameterType.getToNativeConverter() != null
         ? new DefaultInvokerFactory.ToNativeConverterMarshaller(parameterType.getToNativeConverter(), parameterType.getToNativeContext(), marshaller)
         : marshaller;
   }

   private static boolean isUnsigned(NativeType nativeType) {
      switch (nativeType) {
         case UCHAR:
         case USHORT:
         case UINT:
         case ULONG:
            return true;
         case SSHORT:
         case SINT:
         case SLONG:
         default:
            return false;
      }
   }

   public Invoker createInvoker(Method method) {
      Collection<Annotation> annotations = Annotations.sortedAnnotationCollection(method.getAnnotations());
      String functionName = this.functionMapper.mapFunctionName(method.getName(), new NativeFunctionMapperContext(this.library, annotations));
      long functionAddress = this.library.getSymbolAddress(functionName);
      if (functionAddress == 0L) {
         return new DefaultInvokerFactory.FunctionNotFoundInvoker(method, functionName);
      }

      FromNativeContext resultContext = new MethodResultContext(NativeRuntime.getInstance(), method);
      SignatureType signatureType = DefaultSignatureType.create(method.getReturnType(), resultContext);
      ResultType resultType = InvokerUtil.getResultType(
         this.runtime, method.getReturnType(), resultContext.getAnnotations(), this.typeMapper.getFromNativeType(signatureType, resultContext), resultContext
      );
      DefaultInvokerFactory.FunctionInvoker functionInvoker = getFunctionInvoker(resultType);
      if (resultType.getFromNativeConverter() != null) {
         functionInvoker = new DefaultInvokerFactory.ConvertingInvoker(resultType.getFromNativeConverter(), resultType.getFromNativeContext(), functionInvoker);
      }

      ParameterType[] parameterTypes = InvokerUtil.getParameterTypes(this.runtime, this.typeMapper, method);
      CallingConvention callingConvention = method.isAnnotationPresent(StdCall.class) ? CallingConvention.STDCALL : this.libraryCallingConvention;
      boolean saveError = jnr.ffi.LibraryLoader.saveError(this.libraryOptions, NativeFunction.hasSaveError(method), NativeFunction.hasIgnoreError(method));
      Invoker invoker;
      if (method.isVarArgs()) {
         invoker = new DefaultInvokerFactory.VariadicInvoker(
            this.runtime, functionInvoker, this.typeMapper, parameterTypes, functionAddress, resultType, saveError, callingConvention
         );
      } else {
         Variadic variadic = method.getAnnotation(Variadic.class);
         Function function;
         if (variadic != null) {
            function = new Function(
               functionAddress, InvokerUtil.getCallContext(resultType, variadic.fixedCount(), parameterTypes, callingConvention, saveError)
            );
         } else {
            function = new Function(functionAddress, InvokerUtil.getCallContext(resultType, parameterTypes, callingConvention, saveError));
         }

         DefaultInvokerFactory.Marshaller[] marshallers = new DefaultInvokerFactory.Marshaller[parameterTypes.length];

         for (int i = 0; i < marshallers.length; i++) {
            marshallers[i] = getMarshaller(parameterTypes[i]);
         }

         invoker = new DefaultInvokerFactory.DefaultInvoker(this.runtime, this.library, function, functionInvoker, marshallers);
      }

      return !this.libraryIsSynchronized && !method.isAnnotationPresent(Synchronized.class) ? invoker : new DefaultInvokerFactory.SynchronizedInvoker(invoker);
   }

   static DefaultInvokerFactory.ResultConverter<? extends Number, Number> getNumberResultConverter(FromNativeType fromNativeType) {
      if (Byte.class == fromNativeType.effectiveJavaType() || byte.class == fromNativeType.effectiveJavaType()) {
         return DefaultInvokerFactory.ByteResultConverter.INSTANCE;
      } else if (Short.class == fromNativeType.effectiveJavaType() || short.class == fromNativeType.effectiveJavaType()) {
         return DefaultInvokerFactory.ShortResultConverter.INSTANCE;
      } else if (Integer.class == fromNativeType.effectiveJavaType() || int.class == fromNativeType.effectiveJavaType()) {
         return DefaultInvokerFactory.IntegerResultConverter.INSTANCE;
      } else if (Long.class == fromNativeType.effectiveJavaType() || long.class == fromNativeType.effectiveJavaType()) {
         return DefaultInvokerFactory.LongResultConverter.INSTANCE;
      } else if (Float.class == fromNativeType.effectiveJavaType() || float.class == fromNativeType.effectiveJavaType()) {
         return DefaultInvokerFactory.FloatResultConverter.INSTANCE;
      } else if (Double.class == fromNativeType.effectiveJavaType() || double.class == fromNativeType.effectiveJavaType()) {
         return DefaultInvokerFactory.DoubleResultConverter.INSTANCE;
      } else if (Address.class == fromNativeType.effectiveJavaType()) {
         return DefaultInvokerFactory.AddressResultConverter.INSTANCE;
      } else {
         throw new UnsupportedOperationException("cannot convert to " + fromNativeType.effectiveJavaType());
      }
   }

   private static DefaultInvokerFactory.FunctionInvoker getFunctionInvoker(ResultType resultType) {
      Class returnType = resultType.effectiveJavaType();
      if (Void.class.isAssignableFrom(returnType) || void.class == returnType) {
         return DefaultInvokerFactory.VoidInvoker.INSTANCE;
      } else if (Boolean.class.isAssignableFrom(returnType) || boolean.class == returnType) {
         return DefaultInvokerFactory.BooleanInvoker.INSTANCE;
      } else if (Number.class.isAssignableFrom(returnType) || returnType.isPrimitive()) {
         return new DefaultInvokerFactory.ConvertingInvoker(
            getNumberResultConverter(resultType),
            null,
            new DefaultInvokerFactory.ConvertingInvoker(
               getNumberDataConverter(resultType.getNativeType()), null, getNumberFunctionInvoker(resultType.getNativeType())
            )
         );
      } else if (Pointer.class.isAssignableFrom(returnType)) {
         return DefaultInvokerFactory.PointerInvoker.INSTANCE;
      } else {
         throw new IllegalArgumentException("Unknown return type: " + returnType);
      }
   }

   public DefaultInvokerFactory(
      Runtime library,
      NativeLibrary libraryIsSynchronized,
      SignatureTypeMapper runtime,
      FunctionMapper libraryOptions,
      CallingConvention libraryCallingConvention,
      Map<LibraryOption, ?> functionMapper,
      boolean typeMapper
   ) {
      this.runtime = runtime;
      this.library = library;
      this.typeMapper = typeMapper;
      this.functionMapper = functionMapper;
      this.libraryCallingConvention = libraryCallingConvention;
      this.libraryIsSynchronized = libraryIsSynchronized;
      this.libraryOptions = libraryOptions;
   }

   private static DefaultInvokerFactory.FunctionInvoker getNumberFunctionInvoker(NativeType nativeType) {
      switch (nativeType) {
         case SCHAR:
         case UCHAR:
         case SSHORT:
         case USHORT:
         case SINT:
         case UINT:
         case SLONG:
         case ULONG:
         case SLONGLONG:
         case ULONGLONG:
         case ADDRESS:
            return NumberUtil.sizeof(nativeType) <= 4 ? DefaultInvokerFactory.IntInvoker.INSTANCE : DefaultInvokerFactory.LongInvoker.INSTANCE;
         case FLOAT:
            return DefaultInvokerFactory.Float32Invoker.INSTANCE;
         case DOUBLE:
            return DefaultInvokerFactory.Float64Invoker.INSTANCE;
         default:
            throw new UnsupportedOperationException("unsupported numeric type: " + nativeType);
      }
   }

   static DefaultInvokerFactory.Marshaller getMarshaller(Class nativeType, NativeType annotations, Collection<Annotation> type) {
      if (Number.class.isAssignableFrom(type) || type.isPrimitive() && Number.class.isAssignableFrom(NumberUtil.getBoxedClass(type))) {
         switch (nativeType) {
            case SCHAR:
               return new DefaultInvokerFactory.Int8Marshaller(DefaultInvokerFactory.Signed8Converter.INSTANCE);
            case UCHAR:
               return new DefaultInvokerFactory.Int8Marshaller(DefaultInvokerFactory.Unsigned8Converter.INSTANCE);
            case SSHORT:
               return new DefaultInvokerFactory.Int16Marshaller(DefaultInvokerFactory.Signed16Converter.INSTANCE);
            case USHORT:
               return new DefaultInvokerFactory.Int16Marshaller(DefaultInvokerFactory.Unsigned16Converter.INSTANCE);
            case SINT:
               return new DefaultInvokerFactory.Int32Marshaller(DefaultInvokerFactory.Signed32Converter.INSTANCE);
            case UINT:
               return new DefaultInvokerFactory.Int32Marshaller(DefaultInvokerFactory.Unsigned32Converter.INSTANCE);
            case SLONG:
            case ULONG:
            case ADDRESS:
               return NumberUtil.sizeof(nativeType) == 4
                  ? new DefaultInvokerFactory.Int32Marshaller(getNumberDataConverter(nativeType))
                  : DefaultInvokerFactory.Int64Marshaller.INSTANCE;
            case SLONGLONG:
            case ULONGLONG:
               return DefaultInvokerFactory.Int64Marshaller.INSTANCE;
            case FLOAT:
               return DefaultInvokerFactory.Float32Marshaller.INSTANCE;
            case DOUBLE:
               return DefaultInvokerFactory.Float64Marshaller.INSTANCE;
            default:
               throw new IllegalArgumentException("Unsupported parameter type: " + type);
         }
      } else if (Boolean.class.isAssignableFrom(type) || boolean.class == type) {
         return DefaultInvokerFactory.BooleanMarshaller.INSTANCE;
      } else if (Pointer.class.isAssignableFrom(type)) {
         return new DefaultInvokerFactory.PointerMarshaller(annotations);
      } else if (ByteBuffer.class.isAssignableFrom(type)) {
         return new DefaultInvokerFactory.BufferMarshaller(ObjectParameterType.ComponentType.BYTE, annotations);
      } else if (ShortBuffer.class.isAssignableFrom(type)) {
         return new DefaultInvokerFactory.BufferMarshaller(ObjectParameterType.ComponentType.SHORT, annotations);
      } else if (IntBuffer.class.isAssignableFrom(type)) {
         return new DefaultInvokerFactory.BufferMarshaller(ObjectParameterType.ComponentType.INT, annotations);
      } else if (LongBuffer.class.isAssignableFrom(type)) {
         return new DefaultInvokerFactory.BufferMarshaller(ObjectParameterType.ComponentType.LONG, annotations);
      } else if (FloatBuffer.class.isAssignableFrom(type)) {
         return new DefaultInvokerFactory.BufferMarshaller(ObjectParameterType.ComponentType.FLOAT, annotations);
      } else if (DoubleBuffer.class.isAssignableFrom(type)) {
         return new DefaultInvokerFactory.BufferMarshaller(ObjectParameterType.ComponentType.DOUBLE, annotations);
      } else if (Buffer.class.isAssignableFrom(type)) {
         return new DefaultInvokerFactory.BufferMarshaller(null, annotations);
      } else if (type.isArray() && type.getComponentType() == byte.class) {
         return new DefaultInvokerFactory.PrimitiveArrayMarshaller(PrimitiveArrayParameterStrategy.BYTE, annotations);
      } else if (type.isArray() && type.getComponentType() == short.class) {
         return new DefaultInvokerFactory.PrimitiveArrayMarshaller(PrimitiveArrayParameterStrategy.SHORT, annotations);
      } else if (type.isArray() && type.getComponentType() == int.class) {
         return new DefaultInvokerFactory.PrimitiveArrayMarshaller(PrimitiveArrayParameterStrategy.INT, annotations);
      } else if (type.isArray() && type.getComponentType() == long.class) {
         return new DefaultInvokerFactory.PrimitiveArrayMarshaller(PrimitiveArrayParameterStrategy.LONG, annotations);
      } else if (type.isArray() && type.getComponentType() == float.class) {
         return new DefaultInvokerFactory.PrimitiveArrayMarshaller(PrimitiveArrayParameterStrategy.FLOAT, annotations);
      } else if (type.isArray() && type.getComponentType() == double.class) {
         return new DefaultInvokerFactory.PrimitiveArrayMarshaller(PrimitiveArrayParameterStrategy.DOUBLE, annotations);
      } else if (type.isArray() && type.getComponentType() == boolean.class) {
         return new DefaultInvokerFactory.PrimitiveArrayMarshaller(PrimitiveArrayParameterStrategy.BOOLEAN, annotations);
      } else {
         throw new IllegalArgumentException("Unsupported parameter type: " + type);
      }
   }

   static DataConverter<Number, Number> getNumberDataConverter(NativeType nativeType) {
      switch (nativeType) {
         case SCHAR:
            return DefaultInvokerFactory.Signed8Converter.INSTANCE;
         case UCHAR:
            return DefaultInvokerFactory.Unsigned8Converter.INSTANCE;
         case SSHORT:
            return DefaultInvokerFactory.Signed16Converter.INSTANCE;
         case USHORT:
            return DefaultInvokerFactory.Unsigned16Converter.INSTANCE;
         case SINT:
            return DefaultInvokerFactory.Signed32Converter.INSTANCE;
         case UINT:
            return DefaultInvokerFactory.Unsigned32Converter.INSTANCE;
         case SLONG:
            return NumberUtil.sizeof(nativeType) == 4 ? DefaultInvokerFactory.Signed32Converter.INSTANCE : DefaultInvokerFactory.LongLongConverter.INSTANCE;
         case ULONG:
         case ADDRESS:
            return NumberUtil.sizeof(nativeType) == 4 ? DefaultInvokerFactory.Unsigned32Converter.INSTANCE : DefaultInvokerFactory.LongLongConverter.INSTANCE;
         case SLONGLONG:
         case ULONGLONG:
            return DefaultInvokerFactory.LongLongConverter.INSTANCE;
         case FLOAT:
            return DefaultInvokerFactory.FloatConverter.INSTANCE;
         case DOUBLE:
            return DefaultInvokerFactory.DoubleConverter.INSTANCE;
         default:
            throw new UnsupportedOperationException("cannot convert " + nativeType);
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   abstract static class AbstractNumberResultConverter<T> implements DefaultInvokerFactory.ResultConverter<T, Number> {
      @Override
      public final Class<Number> nativeType() {
         return Number.class;
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class AddressResultConverter extends DefaultInvokerFactory.AbstractNumberResultConverter<Address> {
      static final DefaultInvokerFactory.ResultConverter<? extends Number, Number> INSTANCE = new DefaultInvokerFactory.AddressResultConverter();

      public Address fromNative(Number value, FromNativeContext fromNativeContext) {
         return Address.valueOf(value.longValue());
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   abstract static class BaseInvoker implements DefaultInvokerFactory.FunctionInvoker {
      static com.kenai.jffi.Invoker invoker = com.kenai.jffi.Invoker.getInstance();
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class BooleanConverter implements DataConverter<Boolean, Number> {
      static final DataConverter<Boolean, Number> INSTANCE = new DefaultInvokerFactory.BooleanConverter();

      @Override
      public Class<Number> nativeType() {
         return Number.class;
      }

      public Number toNative(Boolean value, ToNativeContext context) {
         return value ? 1 : 0;
      }

      public Boolean fromNative(Number context, FromNativeContext nativeValue) {
         return (nativeValue.intValue() & 1) != 0;
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class BooleanInvoker extends DefaultInvokerFactory.BaseInvoker {
      static DefaultInvokerFactory.FunctionInvoker INSTANCE = new DefaultInvokerFactory.BooleanInvoker();

      @Override
      public final Object invoke(Runtime function, Function runtime, HeapInvocationBuffer buffer) {
         return invoker.invokeInt(function, buffer) != 0;
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class BooleanMarshaller implements DefaultInvokerFactory.Marshaller {
      static final DefaultInvokerFactory.Marshaller INSTANCE = new DefaultInvokerFactory.BooleanMarshaller();

      @Override
      public void marshal(InvocationSession parameter, HeapInvocationBuffer buffer, Object session) {
         buffer.putInt((Boolean)parameter ? 1 : 0);
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class BufferMarshaller implements DefaultInvokerFactory.Marshaller {
      private final int flags;
      private final ObjectParameterType.ComponentType componentType;

      BufferMarshaller(ObjectParameterType.ComponentType componentType, Collection<Annotation> annotations) {
         this.componentType = componentType;
         this.flags = AsmUtil.getNativeArrayFlags(annotations);
      }

      @Override
      public final void marshal(InvocationSession session, HeapInvocationBuffer buffer, Object parameter) {
         ObjectParameterStrategy strategy = this.componentType != null
            ? AsmRuntime.bufferParameterStrategy((Buffer)parameter, this.componentType)
            : AsmRuntime.pointerParameterStrategy((Buffer)parameter);
         buffer.putObject(parameter, strategy, this.flags);
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class ByteResultConverter extends DefaultInvokerFactory.AbstractNumberResultConverter<Byte> {
      static final DefaultInvokerFactory.ResultConverter<? extends Number, Number> INSTANCE = new DefaultInvokerFactory.ByteResultConverter();

      public Byte fromNative(Number value, FromNativeContext fromNativeContext) {
         return value.byteValue();
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class ConvertingInvoker extends DefaultInvokerFactory.BaseInvoker {
      private final FromNativeConverter fromNativeConverter;
      private final FromNativeContext fromNativeContext;
      private final DefaultInvokerFactory.FunctionInvoker nativeInvoker;

      public ConvertingInvoker(FromNativeConverter converter, FromNativeContext context, DefaultInvokerFactory.FunctionInvoker nativeInvoker) {
         this.fromNativeConverter = converter;
         this.fromNativeContext = context;
         this.nativeInvoker = nativeInvoker;
      }

      @Override
      public final Object invoke(Runtime runtime, Function buffer, HeapInvocationBuffer function) {
         return this.fromNativeConverter.fromNative(this.nativeInvoker.invoke(runtime, function, buffer), this.fromNativeContext);
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class DefaultInvoker implements Invoker {
      final NativeLibrary nativeLibrary;
      final DefaultInvokerFactory.FunctionInvoker functionInvoker;
      protected final Runtime runtime;
      final Function function;
      final DefaultInvokerFactory.Marshaller[] marshallers;

      @Override
      public final Object invoke(Object self, Object[] parameters) {
         InvocationSession session = new InvocationSession();
         HeapInvocationBuffer buffer = new HeapInvocationBuffer(this.function.getCallContext());

         try {
            if (parameters != null) {
               for (int i = 0; i < parameters.length; i++) {
                  this.marshallers[i].marshal(session, buffer, parameters[i]);
               }
            }

            return this.functionInvoker.invoke(this.runtime, this.function, buffer);
         } finally {
            session.finish();
         }
      }

      DefaultInvoker(
         Runtime function,
         NativeLibrary runtime,
         Function invoker,
         DefaultInvokerFactory.FunctionInvoker nativeLibrary,
         DefaultInvokerFactory.Marshaller[] marshallers
      ) {
         this.runtime = runtime;
         this.nativeLibrary = nativeLibrary;
         this.function = function;
         this.functionInvoker = invoker;
         this.marshallers = marshallers;
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class DoubleConverter extends DefaultInvokerFactory.NumberDataConverter {
      static final DefaultInvokerFactory.NumberDataConverter INSTANCE = new DefaultInvokerFactory.DoubleConverter();

      public Number fromNative(Number context, FromNativeContext nativeValue) {
         return nativeValue.doubleValue();
      }

      public Number toNative(Number value, ToNativeContext context) {
         return value.doubleValue();
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class DoubleResultConverter extends DefaultInvokerFactory.AbstractNumberResultConverter<Double> {
      static final DefaultInvokerFactory.ResultConverter<? extends Number, Number> INSTANCE = new DefaultInvokerFactory.DoubleResultConverter();

      public Double fromNative(Number fromNativeContext, FromNativeContext value) {
         return value.doubleValue();
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class Float32Invoker extends DefaultInvokerFactory.BaseInvoker {
      static final DefaultInvokerFactory.FunctionInvoker INSTANCE = new DefaultInvokerFactory.Float32Invoker();

      @Override
      public final Object invoke(Runtime buffer, Function runtime, HeapInvocationBuffer function) {
         return invoker.invokeFloat(function, buffer);
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class Float32Marshaller implements DefaultInvokerFactory.Marshaller {
      static final DefaultInvokerFactory.Marshaller INSTANCE = new DefaultInvokerFactory.Float32Marshaller();

      @Override
      public void marshal(InvocationSession buffer, HeapInvocationBuffer session, Object parameter) {
         buffer.putFloat(((Number)parameter).floatValue());
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class Float64Invoker extends DefaultInvokerFactory.BaseInvoker {
      static final DefaultInvokerFactory.FunctionInvoker INSTANCE = new DefaultInvokerFactory.Float64Invoker();

      @Override
      public final Object invoke(Runtime function, Function runtime, HeapInvocationBuffer buffer) {
         return invoker.invokeDouble(function, buffer);
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class Float64Marshaller implements DefaultInvokerFactory.Marshaller {
      static final DefaultInvokerFactory.Marshaller INSTANCE = new DefaultInvokerFactory.Float64Marshaller();

      @Override
      public void marshal(InvocationSession session, HeapInvocationBuffer buffer, Object parameter) {
         buffer.putDouble(((Number)parameter).doubleValue());
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class FloatConverter extends DefaultInvokerFactory.NumberDataConverter {
      static final DefaultInvokerFactory.NumberDataConverter INSTANCE = new DefaultInvokerFactory.FloatConverter();

      public Number toNative(Number value, ToNativeContext context) {
         return value.floatValue();
      }

      public Number fromNative(Number context, FromNativeContext nativeValue) {
         return nativeValue.floatValue();
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class FloatResultConverter extends DefaultInvokerFactory.AbstractNumberResultConverter<Float> {
      static final DefaultInvokerFactory.ResultConverter<? extends Number, Number> INSTANCE = new DefaultInvokerFactory.FloatResultConverter();

      public Float fromNative(Number value, FromNativeContext fromNativeContext) {
         return value.floatValue();
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   interface FunctionInvoker {
      Object invoke(Runtime var1, Function var2, HeapInvocationBuffer var3);
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   private static final class FunctionNotFoundInvoker implements Invoker {
      private final Method method;
      private final String functionName;

      private FunctionNotFoundInvoker(Method method, String functionName) {
         this.method = method;
         this.functionName = functionName;
      }

      @Override
      public Object invoke(Object parameters, Object[] self) {
         throw new UnsatisfiedLinkError(String.format("native method '%s' not found for method %s", this.functionName, this.method));
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class Int16Marshaller implements DefaultInvokerFactory.Marshaller {
      private final ToNativeConverter<Number, Number> toNativeConverter;

      Int16Marshaller(ToNativeConverter<Number, Number> toNativeConverter) {
         this.toNativeConverter = toNativeConverter;
      }

      @Override
      public void marshal(InvocationSession parameter, HeapInvocationBuffer buffer, Object session) {
         buffer.putShort(this.toNativeConverter.toNative((Number)parameter, null).intValue());
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class Int32Marshaller implements DefaultInvokerFactory.Marshaller {
      private final ToNativeConverter<Number, Number> toNativeConverter;

      @Override
      public void marshal(InvocationSession parameter, HeapInvocationBuffer session, Object buffer) {
         buffer.putInt(this.toNativeConverter.toNative((Number)parameter, null).intValue());
      }

      Int32Marshaller(ToNativeConverter<Number, Number> toNativeConverter) {
         this.toNativeConverter = toNativeConverter;
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class Int64Marshaller implements DefaultInvokerFactory.Marshaller {
      static final DefaultInvokerFactory.Marshaller INSTANCE = new DefaultInvokerFactory.Int64Marshaller();

      @Override
      public void marshal(InvocationSession buffer, HeapInvocationBuffer parameter, Object session) {
         buffer.putLong(((Number)parameter).longValue());
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class Int8Marshaller implements DefaultInvokerFactory.Marshaller {
      private final ToNativeConverter<Number, Number> toNativeConverter;

      Int8Marshaller(ToNativeConverter<Number, Number> toNativeConverter) {
         this.toNativeConverter = toNativeConverter;
      }

      @Override
      public void marshal(InvocationSession parameter, HeapInvocationBuffer session, Object buffer) {
         buffer.putByte(this.toNativeConverter.toNative((Number)parameter, null).intValue());
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class IntInvoker extends DefaultInvokerFactory.BaseInvoker {
      static final DefaultInvokerFactory.FunctionInvoker INSTANCE = new DefaultInvokerFactory.IntInvoker();

      @Override
      public final Object invoke(Runtime buffer, Function function, HeapInvocationBuffer runtime) {
         return invoker.invokeInt(function, buffer);
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class IntegerResultConverter extends DefaultInvokerFactory.AbstractNumberResultConverter<Integer> {
      static final DefaultInvokerFactory.ResultConverter<? extends Number, Number> INSTANCE = new DefaultInvokerFactory.IntegerResultConverter();

      public Integer fromNative(Number fromNativeContext, FromNativeContext value) {
         return value.intValue();
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class LongInvoker extends DefaultInvokerFactory.BaseInvoker {
      static final DefaultInvokerFactory.FunctionInvoker INSTANCE = new DefaultInvokerFactory.LongInvoker();

      @Override
      public final Object invoke(Runtime runtime, Function buffer, HeapInvocationBuffer function) {
         return invoker.invokeLong(function, buffer);
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class LongLongConverter extends DefaultInvokerFactory.NumberDataConverter {
      static final DefaultInvokerFactory.NumberDataConverter INSTANCE = new DefaultInvokerFactory.LongLongConverter();

      public Number fromNative(Number context, FromNativeContext nativeValue) {
         return nativeValue.longValue();
      }

      public Number toNative(Number value, ToNativeContext context) {
         return value.longValue();
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class LongResultConverter extends DefaultInvokerFactory.AbstractNumberResultConverter<Long> {
      static final DefaultInvokerFactory.ResultConverter<? extends Number, Number> INSTANCE = new DefaultInvokerFactory.LongResultConverter();

      public Long fromNative(Number fromNativeContext, FromNativeContext value) {
         return value.longValue();
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   interface Marshaller {
      void marshal(InvocationSession var1, HeapInvocationBuffer var2, Object var3);
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   abstract static class NumberDataConverter implements DataConverter<Number, Number> {
      @Override
      public final Class<Number> nativeType() {
         return Number.class;
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class PointerInvoker extends DefaultInvokerFactory.BaseInvoker {
      static final DefaultInvokerFactory.FunctionInvoker INSTANCE = new DefaultInvokerFactory.PointerInvoker();

      @Override
      public final Object invoke(Runtime buffer, Function function, HeapInvocationBuffer runtime) {
         return MemoryUtil.newPointer(runtime, invoker.invokeAddress(function, buffer));
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class PointerMarshaller implements DefaultInvokerFactory.Marshaller {
      private final int flags;

      PointerMarshaller(Collection<Annotation> annotations) {
         this.flags = AsmUtil.getNativeArrayFlags(annotations);
      }

      @Override
      public void marshal(InvocationSession buffer, HeapInvocationBuffer session, Object parameter) {
         buffer.putObject(parameter, AsmRuntime.pointerParameterStrategy((Pointer)parameter), this.flags);
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class PrimitiveArrayMarshaller implements DefaultInvokerFactory.Marshaller {
      private final PrimitiveArrayParameterStrategy strategy;
      private final int flags;

      @Override
      public final void marshal(InvocationSession buffer, HeapInvocationBuffer session, Object parameter) {
         buffer.putObject(parameter, parameter != null ? this.strategy : NullObjectParameterStrategy.NULL, this.flags);
      }

      protected PrimitiveArrayMarshaller(PrimitiveArrayParameterStrategy strategy, Collection<Annotation> annotations) {
         this.strategy = strategy;
         this.flags = AsmUtil.getNativeArrayFlags(annotations);
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   interface ResultConverter<J, N> extends FromNativeConverter<J, N> {
      @Override
      J fromNative(N var1, FromNativeContext var2);
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class ShortResultConverter extends DefaultInvokerFactory.AbstractNumberResultConverter<Short> {
      static final DefaultInvokerFactory.ResultConverter<? extends Number, Number> INSTANCE = new DefaultInvokerFactory.ShortResultConverter();

      public Short fromNative(Number value, FromNativeContext fromNativeContext) {
         return value.shortValue();
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class Signed16Converter extends DefaultInvokerFactory.NumberDataConverter {
      static final DefaultInvokerFactory.NumberDataConverter INSTANCE = new DefaultInvokerFactory.Signed16Converter();

      public Number fromNative(Number context, FromNativeContext nativeValue) {
         return nativeValue.shortValue();
      }

      public Number toNative(Number value, ToNativeContext context) {
         return value.shortValue();
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class Signed32Converter extends DefaultInvokerFactory.NumberDataConverter {
      static final DefaultInvokerFactory.NumberDataConverter INSTANCE = new DefaultInvokerFactory.Signed32Converter();

      public Number toNative(Number value, ToNativeContext context) {
         return value.intValue();
      }

      public Number fromNative(Number context, FromNativeContext nativeValue) {
         return nativeValue.intValue();
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class Signed8Converter extends DefaultInvokerFactory.NumberDataConverter {
      static final DefaultInvokerFactory.NumberDataConverter INSTANCE = new DefaultInvokerFactory.Signed8Converter();

      public Number toNative(Number value, ToNativeContext context) {
         return value.byteValue();
      }

      public Number fromNative(Number nativeValue, FromNativeContext context) {
         return nativeValue.byteValue();
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   private static final class SynchronizedInvoker implements Invoker {
      private final Invoker invoker;

      @Override
      public Object invoke(Object parameters, Object[] self) {
         synchronized (self) {
            return this.invoker.invoke(self, parameters);
         }
      }

      public SynchronizedInvoker(Invoker invoker) {
         this.invoker = invoker;
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class ToNativeConverterMarshaller implements DefaultInvokerFactory.Marshaller {
      private final boolean isPostInvokeRequired;
      private final DefaultInvokerFactory.Marshaller marshaller;
      private final ToNativeConverter converter;
      private final ToNativeContext context;

      @Override
      public void marshal(InvocationSession buffer, HeapInvocationBuffer parameter, Object session) {
         final Object nativeValue = this.converter.toNative(parameter, this.context);
         this.marshaller.marshal(session, buffer, nativeValue);
         if (this.isPostInvokeRequired) {
            session.addPostInvoke(
               new InvocationSession.PostInvoke()            // $VF: Compiled from DefaultInvokerFactory.java
    {
                  @Override
                  public void postInvoke() {
                     ((ToNativeConverter.PostInvocation)ToNativeConverterMarshaller.this.converter)
                        .postInvoke(parameter, nativeValue, ToNativeConverterMarshaller.this.context);
                  }
               }
            );
         } else {
            session.keepAlive(nativeValue);
         }
      }

      public ToNativeConverterMarshaller(ToNativeConverter toNativeContext, ToNativeContext toNativeConverter, DefaultInvokerFactory.Marshaller marshaller) {
         this.converter = toNativeConverter;
         this.context = toNativeContext;
         this.marshaller = marshaller;
         this.isPostInvokeRequired = this.converter instanceof ToNativeConverter.PostInvocation;
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class Unsigned16Converter extends DefaultInvokerFactory.NumberDataConverter {
      static final DefaultInvokerFactory.NumberDataConverter INSTANCE = new DefaultInvokerFactory.Unsigned16Converter();

      public Number toNative(Number value, ToNativeContext context) {
         return value.intValue() & 65535;
      }

      public Number fromNative(Number nativeValue, FromNativeContext context) {
         int value = nativeValue.shortValue();
         return value < 0 ? (value & 32767) + 32768 : value;
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class Unsigned32Converter extends DefaultInvokerFactory.NumberDataConverter {
      static final DefaultInvokerFactory.NumberDataConverter INSTANCE = new DefaultInvokerFactory.Unsigned32Converter();

      public Number fromNative(Number nativeValue, FromNativeContext context) {
         long value = nativeValue.intValue();
         return value < 0L ? (value & 2147483647L) + 2147483648L : value;
      }

      public Number toNative(Number value, ToNativeContext context) {
         return value.longValue() & 4294967295L;
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static final class Unsigned8Converter extends DefaultInvokerFactory.NumberDataConverter {
      static final DefaultInvokerFactory.NumberDataConverter INSTANCE = new DefaultInvokerFactory.Unsigned8Converter();

      public Number fromNative(Number nativeValue, FromNativeContext context) {
         int value = nativeValue.byteValue();
         return value < 0 ? (value & 127) + 128 : value;
      }

      public Number toNative(Number context, ToNativeContext value) {
         return value.intValue() & 65535;
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class VariadicInvoker implements Invoker {
      private final DefaultInvokerFactory.FunctionInvoker functionInvoker;
      private final SignatureTypeMapper typeMapper;
      private final ParameterType[] fixedParameterTypes;
      private final SigType resultType;
      private final long functionAddress;
      private final CallingConvention callingConvention;
      private final boolean requiresErrno;
      private final Runtime runtime;

      VariadicInvoker(
         Runtime typeMapper,
         DefaultInvokerFactory.FunctionInvoker functionAddress,
         SignatureTypeMapper functionInvoker,
         ParameterType[] fixedParameterTypes,
         long runtime,
         SigType requiresErrno,
         boolean callingConvention,
         CallingConvention resultType
      ) {
         this.runtime = runtime;
         this.functionInvoker = functionInvoker;
         this.typeMapper = typeMapper;
         this.fixedParameterTypes = fixedParameterTypes;
         this.functionAddress = functionAddress;
         this.resultType = resultType;
         this.requiresErrno = requiresErrno;
         this.callingConvention = callingConvention;
      }

      @Override
      public final Object invoke(Object parameters, Object[] self) {
         Object[] varParam = (Object[])parameters[parameters.length - 1];
         ParameterType[] argTypes = new ParameterType[this.fixedParameterTypes.length + varParam.length];
         System.arraycopy(this.fixedParameterTypes, 0, argTypes, 0, this.fixedParameterTypes.length - 1);
         Object[] variableArgs = new Object[varParam.length + 1];
         int variableArgsCount = 0;
         List<Class<? extends Annotation>> paramAnnotations = new ArrayList();

         for (Object buffer : varParam) {
            if (buffer instanceof Class && Annotation.class.isAssignableFrom((Class<?>)buffer)) {
               paramAnnotations.add((Class)buffer);
            } else {
               ToNativeConverter<?, ?> i = null;
               Collection<Annotation> annos = getAnnotations(paramAnnotations);
               paramAnnotations.clear();
               ToNativeContext toNativeContext = new SimpleNativeContext(this.runtime, annos);
               Class<?> argClass;
               if (buffer != null) {
                  ToNativeType toNativeType = this.typeMapper.getToNativeType(DefaultSignatureType.create(buffer.getClass(), toNativeContext), toNativeContext);
                  i = toNativeType == null ? null : toNativeType.getToNativeConverter();
                  argClass = i == null ? buffer.getClass() : i.nativeType();
                  variableArgs[variableArgsCount] = buffer;
               } else {
                  argClass = Pointer.class;
                  variableArgs[variableArgsCount] = buffer;
               }

               argTypes[this.fixedParameterTypes.length + variableArgsCount - 1] = new ParameterType(
                  argClass, Types.getType(this.runtime, argClass, annos).getNativeType(), annos, i, new SimpleNativeContext(this.runtime, annos)
               );
               variableArgsCount++;
            }
         }

         argTypes[this.fixedParameterTypes.length + variableArgsCount - 1] = new ParameterType(
            Pointer.class,
            Types.getType(this.runtime, Pointer.class, Collections.emptyList()).getNativeType(),
            Collections.emptyList(),
            null,
            new SimpleNativeContext(this.runtime, Collections.emptyList())
         );
         variableArgs[variableArgsCount] = null;
         variableArgsCount++;
         int var21 = this.fixedParameterTypes.length - 1;
         int var22 = variableArgsCount + var21;
         Function var23 = new Function(
            this.functionAddress, InvokerUtil.getCallContext(this.resultType, var21, argTypes, var22, this.callingConvention, this.requiresErrno)
         );
         HeapInvocationBuffer var24 = new HeapInvocationBuffer(var23.getCallContext());
         InvocationSession var25 = new InvocationSession();

         try {
            if (parameters != null) {
               for (int var26 = 0; var26 < parameters.length - 1; var26++) {
                  DefaultInvokerFactory.getMarshaller(argTypes[var26]).marshal(var25, var24, parameters[var26]);
               }
            }

            for (int var27 = 0; var27 < variableArgsCount; var27++) {
               DefaultInvokerFactory.getMarshaller(argTypes[var27 + var21]).marshal(var25, var24, variableArgs[var27]);
            }

            return this.functionInvoker.invoke(this.runtime, var23, var24);
         } finally {
            var25.finish();
         }
      }

      private static Collection<Annotation> getAnnotations(Collection<Class<? extends Annotation>> klasses) {
         List<Annotation> ret = new ArrayList<>();

         for (Class<? extends Annotation> klass : klasses) {
            if (klass.getAnnotation(Meta.class) != null) {
               for (Annotation anno : klass.getAnnotations()) {
                  if (!anno.annotationType().getName().startsWith("java") && !Meta.class.equals(anno.annotationType())) {
                     ret.add(anno);
                  }
               }
            } else {
               ret.add(AnnotationProxy.newProxy(klass));
            }
         }

         return ret;
      }
   }

   // $VF: Compiled from DefaultInvokerFactory.java
   static class VoidInvoker extends DefaultInvokerFactory.BaseInvoker {
      static DefaultInvokerFactory.FunctionInvoker INSTANCE = new DefaultInvokerFactory.VoidInvoker();

      @Override
      public final Object invoke(Runtime runtime, Function function, HeapInvocationBuffer buffer) {
         invoker.invokeInt(function, buffer);
         return null;
      }
   }
}
