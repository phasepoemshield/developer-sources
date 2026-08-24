/*
 * Decompiled with CFR 0.152.
 */
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
import java.util.Iterator;
import java.util.Map;
import jnr.ffi.Address;
import jnr.ffi.CallingConvention;
import jnr.ffi.LibraryLoader;
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
import jnr.ffi.provider.jffi.AsmRuntime;
import jnr.ffi.provider.jffi.AsmUtil;
import jnr.ffi.provider.jffi.BufferParameterStrategy;
import jnr.ffi.provider.jffi.InvokerUtil;
import jnr.ffi.provider.jffi.MemoryUtil;
import jnr.ffi.provider.jffi.NativeFunctionMapperContext;
import jnr.ffi.provider.jffi.NativeLibrary;
import jnr.ffi.provider.jffi.NativeRuntime;
import jnr.ffi.provider.jffi.NullObjectParameterStrategy;
import jnr.ffi.provider.jffi.NumberUtil;
import jnr.ffi.provider.jffi.PrimitiveArrayParameterStrategy;
import jnr.ffi.provider.jffi.SimpleNativeContext;
import jnr.ffi.provider.jffi.Types;
import jnr.ffi.util.AnnotationProxy;
import jnr.ffi.util.Annotations;

final class DefaultInvokerFactory {
    private final FunctionMapper functionMapper;
    private final SignatureTypeMapper typeMapper;
    private final NativeLibrary library;
    private final Runtime runtime;
    private final CallingConvention libraryCallingConvention;
    private final boolean libraryIsSynchronized;
    private final Map<LibraryOption, ?> libraryOptions;

    static Marshaller getMarshaller(ParameterType parameterType) {
        Marshaller marshaller = DefaultInvokerFactory.getMarshaller(parameterType.effectiveJavaType(), parameterType.getNativeType(), parameterType.getAnnotations());
        return parameterType.getToNativeConverter() != null ? new ToNativeConverterMarshaller(parameterType.getToNativeConverter(), parameterType.getToNativeContext(), marshaller) : marshaller;
    }

    private static boolean isUnsigned(NativeType nativeType) {
        switch (nativeType) {
            case UCHAR: 
            case USHORT: 
            case UINT: 
            case ULONG: {
                return true;
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public Invoker createInvoker(Method method) {
        void var13_12;
        Invoker invoker;
        Collection<Annotation> annotations = Annotations.sortedAnnotationCollection(method.getAnnotations());
        String functionName = this.functionMapper.mapFunctionName(method.getName(), new NativeFunctionMapperContext(this.library, annotations));
        long functionAddress = this.library.getSymbolAddress(functionName);
        if (functionAddress == 0L) {
            return new FunctionNotFoundInvoker(method, functionName);
        }
        MethodResultContext resultContext = new MethodResultContext(NativeRuntime.getInstance(), method);
        DefaultSignatureType signatureType = DefaultSignatureType.create(method.getReturnType(), resultContext);
        ResultType resultType = InvokerUtil.getResultType(this.runtime, method.getReturnType(), resultContext.getAnnotations(), this.typeMapper.getFromNativeType(signatureType, resultContext), (FromNativeContext)resultContext);
        FunctionInvoker functionInvoker = DefaultInvokerFactory.getFunctionInvoker(resultType);
        if (resultType.getFromNativeConverter() != null) {
            functionInvoker = new ConvertingInvoker(resultType.getFromNativeConverter(), resultType.getFromNativeContext(), functionInvoker);
        }
        SigType[] parameterTypes = InvokerUtil.getParameterTypes(this.runtime, this.typeMapper, method);
        CallingConvention callingConvention = method.isAnnotationPresent(StdCall.class) ? CallingConvention.STDCALL : this.libraryCallingConvention;
        boolean saveError = LibraryLoader.saveError(this.libraryOptions, NativeFunction.hasSaveError(method), NativeFunction.hasIgnoreError(method));
        if (method.isVarArgs()) {
            invoker = new VariadicInvoker(this.runtime, functionInvoker, this.typeMapper, (ParameterType[])parameterTypes, functionAddress, resultType, saveError, callingConvention);
        } else {
            Variadic variadic = method.getAnnotation(Variadic.class);
            Function function = variadic != null ? new Function(functionAddress, InvokerUtil.getCallContext(resultType, variadic.fixedCount(), parameterTypes, callingConvention, saveError)) : new Function(functionAddress, InvokerUtil.getCallContext(resultType, parameterTypes, callingConvention, saveError));
            Marshaller[] marshallers = new Marshaller[parameterTypes.length];
            int i = 0;
            while (i < marshallers.length) {
                void var17_16;
                marshallers[i] = DefaultInvokerFactory.getMarshaller((ParameterType)parameterTypes[i]);
                ++var17_16;
            }
            invoker = new DefaultInvoker(this.runtime, this.library, function, functionInvoker, marshallers);
        }
        return this.libraryIsSynchronized || method.isAnnotationPresent(Synchronized.class) ? new SynchronizedInvoker(invoker) : var13_12;
    }

    static ResultConverter<? extends Number, Number> getNumberResultConverter(FromNativeType fromNativeType) {
        if (Byte.class == fromNativeType.effectiveJavaType() || Byte.TYPE == fromNativeType.effectiveJavaType()) {
            return ByteResultConverter.INSTANCE;
        }
        if (Short.class == fromNativeType.effectiveJavaType() || Short.TYPE == fromNativeType.effectiveJavaType()) {
            return ShortResultConverter.INSTANCE;
        }
        if (Integer.class == fromNativeType.effectiveJavaType() || Integer.TYPE == fromNativeType.effectiveJavaType()) {
            return IntegerResultConverter.INSTANCE;
        }
        if (Long.class == fromNativeType.effectiveJavaType() || Long.TYPE == fromNativeType.effectiveJavaType()) {
            return LongResultConverter.INSTANCE;
        }
        if (Float.class == fromNativeType.effectiveJavaType() || Float.TYPE == fromNativeType.effectiveJavaType()) {
            return FloatResultConverter.INSTANCE;
        }
        if (Double.class == fromNativeType.effectiveJavaType() || Double.TYPE == fromNativeType.effectiveJavaType()) {
            return DoubleResultConverter.INSTANCE;
        }
        if (Address.class == fromNativeType.effectiveJavaType()) {
            return AddressResultConverter.INSTANCE;
        }
        throw new UnsupportedOperationException("cannot convert to " + fromNativeType.effectiveJavaType());
    }

    private static FunctionInvoker getFunctionInvoker(ResultType resultType) {
        Class returnType = resultType.effectiveJavaType();
        if (Void.class.isAssignableFrom(returnType) || Void.TYPE == returnType) {
            return VoidInvoker.INSTANCE;
        }
        if (Boolean.class.isAssignableFrom(returnType) || Boolean.TYPE == returnType) {
            return BooleanInvoker.INSTANCE;
        }
        if (Number.class.isAssignableFrom(returnType) || returnType.isPrimitive()) {
            return new ConvertingInvoker(DefaultInvokerFactory.getNumberResultConverter(resultType), null, new ConvertingInvoker(DefaultInvokerFactory.getNumberDataConverter(resultType.getNativeType()), null, DefaultInvokerFactory.getNumberFunctionInvoker(resultType.getNativeType())));
        }
        if (Pointer.class.isAssignableFrom(returnType)) {
            return PointerInvoker.INSTANCE;
        }
        throw new IllegalArgumentException("Unknown return type: " + returnType);
    }

    public DefaultInvokerFactory(Runtime runtime, NativeLibrary library, SignatureTypeMapper typeMapper, FunctionMapper functionMapper, CallingConvention libraryCallingConvention, Map<LibraryOption, ?> libraryOptions, boolean libraryIsSynchronized) {
        this.runtime = runtime;
        this.library = library;
        this.typeMapper = typeMapper;
        this.functionMapper = functionMapper;
        this.libraryCallingConvention = libraryCallingConvention;
        this.libraryIsSynchronized = libraryIsSynchronized;
        this.libraryOptions = libraryOptions;
    }

    private static FunctionInvoker getNumberFunctionInvoker(NativeType nativeType) {
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
            case ADDRESS: {
                return NumberUtil.sizeof(nativeType) <= 4 ? IntInvoker.INSTANCE : LongInvoker.INSTANCE;
            }
            case FLOAT: {
                return Float32Invoker.INSTANCE;
            }
            case DOUBLE: {
                return Float64Invoker.INSTANCE;
            }
        }
        throw new UnsupportedOperationException("unsupported numeric type: " + (Object)((Object)nativeType));
    }

    static Marshaller getMarshaller(Class type, NativeType nativeType, Collection<Annotation> annotations) {
        if (Number.class.isAssignableFrom(type) || type.isPrimitive() && Number.class.isAssignableFrom(NumberUtil.getBoxedClass(type))) {
            switch (nativeType) {
                case SCHAR: {
                    return new Int8Marshaller(Signed8Converter.INSTANCE);
                }
                case UCHAR: {
                    return new Int8Marshaller(Unsigned8Converter.INSTANCE);
                }
                case SSHORT: {
                    return new Int16Marshaller(Signed16Converter.INSTANCE);
                }
                case USHORT: {
                    return new Int16Marshaller(Unsigned16Converter.INSTANCE);
                }
                case SINT: {
                    return new Int32Marshaller(Signed32Converter.INSTANCE);
                }
                case UINT: {
                    return new Int32Marshaller(Unsigned32Converter.INSTANCE);
                }
                case SLONG: 
                case ULONG: 
                case ADDRESS: {
                    return NumberUtil.sizeof(nativeType) == 4 ? new Int32Marshaller(DefaultInvokerFactory.getNumberDataConverter(nativeType)) : Int64Marshaller.INSTANCE;
                }
                case SLONGLONG: 
                case ULONGLONG: {
                    return Int64Marshaller.INSTANCE;
                }
                case FLOAT: {
                    return Float32Marshaller.INSTANCE;
                }
                case DOUBLE: {
                    return Float64Marshaller.INSTANCE;
                }
            }
            throw new IllegalArgumentException("Unsupported parameter type: " + type);
        }
        if (Boolean.class.isAssignableFrom(type) || Boolean.TYPE == type) {
            return BooleanMarshaller.INSTANCE;
        }
        if (Pointer.class.isAssignableFrom(type)) {
            return new PointerMarshaller(annotations);
        }
        if (ByteBuffer.class.isAssignableFrom(type)) {
            return new BufferMarshaller(ObjectParameterType.ComponentType.BYTE, annotations);
        }
        if (ShortBuffer.class.isAssignableFrom(type)) {
            return new BufferMarshaller(ObjectParameterType.ComponentType.SHORT, annotations);
        }
        if (IntBuffer.class.isAssignableFrom(type)) {
            return new BufferMarshaller(ObjectParameterType.ComponentType.INT, annotations);
        }
        if (LongBuffer.class.isAssignableFrom(type)) {
            return new BufferMarshaller(ObjectParameterType.ComponentType.LONG, annotations);
        }
        if (FloatBuffer.class.isAssignableFrom(type)) {
            return new BufferMarshaller(ObjectParameterType.ComponentType.FLOAT, annotations);
        }
        if (DoubleBuffer.class.isAssignableFrom(type)) {
            return new BufferMarshaller(ObjectParameterType.ComponentType.DOUBLE, annotations);
        }
        if (Buffer.class.isAssignableFrom(type)) {
            return new BufferMarshaller(null, annotations);
        }
        if (type.isArray() && type.getComponentType() == Byte.TYPE) {
            return new PrimitiveArrayMarshaller(PrimitiveArrayParameterStrategy.BYTE, annotations);
        }
        if (type.isArray() && type.getComponentType() == Short.TYPE) {
            return new PrimitiveArrayMarshaller(PrimitiveArrayParameterStrategy.SHORT, annotations);
        }
        if (type.isArray() && type.getComponentType() == Integer.TYPE) {
            return new PrimitiveArrayMarshaller(PrimitiveArrayParameterStrategy.INT, annotations);
        }
        if (type.isArray() && type.getComponentType() == Long.TYPE) {
            return new PrimitiveArrayMarshaller(PrimitiveArrayParameterStrategy.LONG, annotations);
        }
        if (type.isArray() && type.getComponentType() == Float.TYPE) {
            return new PrimitiveArrayMarshaller(PrimitiveArrayParameterStrategy.FLOAT, annotations);
        }
        if (type.isArray() && type.getComponentType() == Double.TYPE) {
            return new PrimitiveArrayMarshaller(PrimitiveArrayParameterStrategy.DOUBLE, annotations);
        }
        if (type.isArray() && type.getComponentType() == Boolean.TYPE) {
            return new PrimitiveArrayMarshaller(PrimitiveArrayParameterStrategy.BOOLEAN, annotations);
        }
        throw new IllegalArgumentException("Unsupported parameter type: " + type);
    }

    static DataConverter<Number, Number> getNumberDataConverter(NativeType nativeType) {
        switch (nativeType) {
            case SCHAR: {
                return Signed8Converter.INSTANCE;
            }
            case UCHAR: {
                return Unsigned8Converter.INSTANCE;
            }
            case SSHORT: {
                return Signed16Converter.INSTANCE;
            }
            case USHORT: {
                return Unsigned16Converter.INSTANCE;
            }
            case SINT: {
                return Signed32Converter.INSTANCE;
            }
            case UINT: {
                return Unsigned32Converter.INSTANCE;
            }
            case SLONG: {
                return NumberUtil.sizeof(nativeType) == 4 ? Signed32Converter.INSTANCE : LongLongConverter.INSTANCE;
            }
            case ULONG: 
            case ADDRESS: {
                return NumberUtil.sizeof(nativeType) == 4 ? Unsigned32Converter.INSTANCE : LongLongConverter.INSTANCE;
            }
            case SLONGLONG: 
            case ULONGLONG: {
                return LongLongConverter.INSTANCE;
            }
            case FLOAT: {
                return FloatConverter.INSTANCE;
            }
            case DOUBLE: {
                return DoubleConverter.INSTANCE;
            }
        }
        throw new UnsupportedOperationException("cannot convert " + (Object)((Object)nativeType));
    }

    static class Int32Marshaller
    implements Marshaller {
        private final ToNativeConverter<Number, Number> toNativeConverter;

        @Override
        public void marshal(InvocationSession session, HeapInvocationBuffer buffer, Object parameter) {
            buffer.putInt(this.toNativeConverter.toNative((Number)parameter, null).intValue());
        }

        Int32Marshaller(ToNativeConverter<Number, Number> toNativeConverter) {
            this.toNativeConverter = toNativeConverter;
        }
    }

    static final class LongResultConverter
    extends AbstractNumberResultConverter<Long> {
        static final ResultConverter<? extends Number, Number> INSTANCE = new LongResultConverter();

        @Override
        public Long fromNative(Number value, FromNativeContext fromNativeContext) {
            return value.longValue();
        }

        LongResultConverter() {
        }
    }

    static final class ShortResultConverter
    extends AbstractNumberResultConverter<Short> {
        static final ResultConverter<? extends Number, Number> INSTANCE = new ShortResultConverter();

        ShortResultConverter() {
        }

        @Override
        public Short fromNative(Number value, FromNativeContext fromNativeContext) {
            return value.shortValue();
        }
    }

    static interface ResultConverter<J, N>
    extends FromNativeConverter<J, N> {
        @Override
        public J fromNative(N var1, FromNativeContext var2);
    }

    static class BufferMarshaller
    implements Marshaller {
        private final int flags;
        private final ObjectParameterType.ComponentType componentType;

        BufferMarshaller(ObjectParameterType.ComponentType componentType, Collection<Annotation> annotations) {
            this.componentType = componentType;
            this.flags = AsmUtil.getNativeArrayFlags(annotations);
        }

        @Override
        public final void marshal(InvocationSession session, HeapInvocationBuffer buffer, Object parameter) {
            BufferParameterStrategy strategy = this.componentType != null ? AsmRuntime.bufferParameterStrategy((Buffer)parameter, this.componentType) : AsmRuntime.pointerParameterStrategy((Buffer)parameter);
            buffer.putObject(parameter, (ObjectParameterStrategy)strategy, this.flags);
        }
    }

    static final class DoubleConverter
    extends NumberDataConverter {
        static final NumberDataConverter INSTANCE = new DoubleConverter();

        @Override
        public Number fromNative(Number nativeValue, FromNativeContext context) {
            return nativeValue.doubleValue();
        }

        @Override
        public Number toNative(Number value, ToNativeContext context) {
            return value.doubleValue();
        }

        DoubleConverter() {
        }
    }

    static final class Unsigned16Converter
    extends NumberDataConverter {
        static final NumberDataConverter INSTANCE = new Unsigned16Converter();

        @Override
        public Number toNative(Number value, ToNativeContext context) {
            return value.intValue() & 0xFFFF;
        }

        @Override
        public Number fromNative(Number nativeValue, FromNativeContext context) {
            int value = nativeValue.shortValue();
            return value < 0 ? (value & Short.MAX_VALUE) + 32768 : value;
        }

        Unsigned16Converter() {
        }
    }

    static final class Signed8Converter
    extends NumberDataConverter {
        static final NumberDataConverter INSTANCE = new Signed8Converter();

        @Override
        public Number toNative(Number value, ToNativeContext context) {
            return value.byteValue();
        }

        @Override
        public Number fromNative(Number nativeValue, FromNativeContext context) {
            return nativeValue.byteValue();
        }

        Signed8Converter() {
        }
    }

    static interface Marshaller {
        public void marshal(InvocationSession var1, HeapInvocationBuffer var2, Object var3);
    }

    static class LongInvoker
    extends BaseInvoker {
        static final FunctionInvoker INSTANCE = new LongInvoker();

        @Override
        public final Object invoke(Runtime runtime, Function function, HeapInvocationBuffer buffer) {
            return invoker.invokeLong(function, buffer);
        }

        LongInvoker() {
        }
    }

    static class VoidInvoker
    extends BaseInvoker {
        static FunctionInvoker INSTANCE = new VoidInvoker();

        VoidInvoker() {
        }

        @Override
        public final Object invoke(Runtime runtime, Function function, HeapInvocationBuffer buffer) {
            invoker.invokeInt(function, buffer);
            return null;
        }
    }

    static class ConvertingInvoker
    extends BaseInvoker {
        private final FromNativeConverter fromNativeConverter;
        private final FromNativeContext fromNativeContext;
        private final FunctionInvoker nativeInvoker;

        public ConvertingInvoker(FromNativeConverter converter, FromNativeContext context, FunctionInvoker nativeInvoker) {
            this.fromNativeConverter = converter;
            this.fromNativeContext = context;
            this.nativeInvoker = nativeInvoker;
        }

        @Override
        public final Object invoke(Runtime runtime, Function function, HeapInvocationBuffer buffer) {
            return this.fromNativeConverter.fromNative(this.nativeInvoker.invoke(runtime, function, buffer), this.fromNativeContext);
        }
    }

    private static final class FunctionNotFoundInvoker
    implements Invoker {
        private final Method method;
        private final String functionName;

        private FunctionNotFoundInvoker(Method method, String functionName) {
            this.method = method;
            this.functionName = functionName;
        }

        @Override
        public Object invoke(Object self, Object[] parameters) {
            Object[] objectArray = new Object[2];
            objectArray[0] = this.functionName;
            objectArray[1] = this.method;
            throw new UnsatisfiedLinkError(String.format("native method '%s' not found for method %s", objectArray));
        }
    }

    static abstract class BaseInvoker
    implements FunctionInvoker {
        static com.kenai.jffi.Invoker invoker = com.kenai.jffi.Invoker.getInstance();

        BaseInvoker() {
        }
    }

    static class Float32Marshaller
    implements Marshaller {
        static final Marshaller INSTANCE = new Float32Marshaller();

        @Override
        public void marshal(InvocationSession session, HeapInvocationBuffer buffer, Object parameter) {
            buffer.putFloat(((Number)parameter).floatValue());
        }

        Float32Marshaller() {
        }
    }

    static interface FunctionInvoker {
        public Object invoke(Runtime var1, Function var2, HeapInvocationBuffer var3);
    }

    private static final class SynchronizedInvoker
    implements Invoker {
        private final Invoker invoker;

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public Object invoke(Object self, Object[] parameters) {
            Object object = self;
            synchronized (object) {
                return this.invoker.invoke(self, parameters);
            }
        }

        public SynchronizedInvoker(Invoker invoker) {
            this.invoker = invoker;
        }
    }

    static final class FloatConverter
    extends NumberDataConverter {
        static final NumberDataConverter INSTANCE = new FloatConverter();

        FloatConverter() {
        }

        @Override
        public Number toNative(Number value, ToNativeContext context) {
            return Float.valueOf(value.floatValue());
        }

        @Override
        public Number fromNative(Number nativeValue, FromNativeContext context) {
            return Float.valueOf(nativeValue.floatValue());
        }
    }

    static final class BooleanConverter
    implements DataConverter<Boolean, Number> {
        static final DataConverter<Boolean, Number> INSTANCE = new BooleanConverter();

        @Override
        public Class<Number> nativeType() {
            return Number.class;
        }

        @Override
        public Number toNative(Boolean value, ToNativeContext context) {
            return value.booleanValue() ? 1 : 0;
        }

        BooleanConverter() {
        }

        @Override
        public Boolean fromNative(Number nativeValue, FromNativeContext context) {
            return (nativeValue.intValue() & 1) != 0;
        }
    }

    static class PointerMarshaller
    implements Marshaller {
        private final int flags;

        PointerMarshaller(Collection<Annotation> annotations) {
            this.flags = AsmUtil.getNativeArrayFlags(annotations);
        }

        @Override
        public void marshal(InvocationSession session, HeapInvocationBuffer buffer, Object parameter) {
            buffer.putObject(parameter, (ObjectParameterStrategy)AsmRuntime.pointerParameterStrategy((Pointer)parameter), this.flags);
        }
    }

    static final class Unsigned8Converter
    extends NumberDataConverter {
        static final NumberDataConverter INSTANCE = new Unsigned8Converter();

        @Override
        public Number fromNative(Number nativeValue, FromNativeContext context) {
            int value = nativeValue.byteValue();
            return value < 0 ? (value & 0x7F) + 128 : value;
        }

        Unsigned8Converter() {
        }

        @Override
        public Number toNative(Number value, ToNativeContext context) {
            return value.intValue() & 0xFFFF;
        }
    }

    static class Int8Marshaller
    implements Marshaller {
        private final ToNativeConverter<Number, Number> toNativeConverter;

        Int8Marshaller(ToNativeConverter<Number, Number> toNativeConverter) {
            this.toNativeConverter = toNativeConverter;
        }

        @Override
        public void marshal(InvocationSession session, HeapInvocationBuffer buffer, Object parameter) {
            buffer.putByte(this.toNativeConverter.toNative((Number)parameter, null).intValue());
        }
    }

    static final class Signed32Converter
    extends NumberDataConverter {
        static final NumberDataConverter INSTANCE = new Signed32Converter();

        @Override
        public Number toNative(Number value, ToNativeContext context) {
            return value.intValue();
        }

        @Override
        public Number fromNative(Number nativeValue, FromNativeContext context) {
            return nativeValue.intValue();
        }

        Signed32Converter() {
        }
    }

    static class BooleanInvoker
    extends BaseInvoker {
        static FunctionInvoker INSTANCE = new BooleanInvoker();

        BooleanInvoker() {
        }

        @Override
        public final Object invoke(Runtime runtime, Function function, HeapInvocationBuffer buffer) {
            return invoker.invokeInt(function, buffer) != 0;
        }
    }

    static class Int16Marshaller
    implements Marshaller {
        private final ToNativeConverter<Number, Number> toNativeConverter;

        Int16Marshaller(ToNativeConverter<Number, Number> toNativeConverter) {
            this.toNativeConverter = toNativeConverter;
        }

        @Override
        public void marshal(InvocationSession session, HeapInvocationBuffer buffer, Object parameter) {
            buffer.putShort(this.toNativeConverter.toNative((Number)parameter, null).intValue());
        }
    }

    static final class IntegerResultConverter
    extends AbstractNumberResultConverter<Integer> {
        static final ResultConverter<? extends Number, Number> INSTANCE = new IntegerResultConverter();

        IntegerResultConverter() {
        }

        @Override
        public Integer fromNative(Number value, FromNativeContext fromNativeContext) {
            return value.intValue();
        }
    }

    static final class Signed16Converter
    extends NumberDataConverter {
        static final NumberDataConverter INSTANCE = new Signed16Converter();

        @Override
        public Number fromNative(Number nativeValue, FromNativeContext context) {
            return nativeValue.shortValue();
        }

        Signed16Converter() {
        }

        @Override
        public Number toNative(Number value, ToNativeContext context) {
            return value.shortValue();
        }
    }

    static final class DoubleResultConverter
    extends AbstractNumberResultConverter<Double> {
        static final ResultConverter<? extends Number, Number> INSTANCE = new DoubleResultConverter();

        @Override
        public Double fromNative(Number value, FromNativeContext fromNativeContext) {
            return value.doubleValue();
        }

        DoubleResultConverter() {
        }
    }

    static class Float64Invoker
    extends BaseInvoker {
        static final FunctionInvoker INSTANCE = new Float64Invoker();

        @Override
        public final Object invoke(Runtime runtime, Function function, HeapInvocationBuffer buffer) {
            return invoker.invokeDouble(function, buffer);
        }

        Float64Invoker() {
        }
    }

    static final class LongLongConverter
    extends NumberDataConverter {
        static final NumberDataConverter INSTANCE = new LongLongConverter();

        @Override
        public Number fromNative(Number nativeValue, FromNativeContext context) {
            return nativeValue.longValue();
        }

        @Override
        public Number toNative(Number value, ToNativeContext context) {
            return value.longValue();
        }

        LongLongConverter() {
        }
    }

    static class Int64Marshaller
    implements Marshaller {
        static final Marshaller INSTANCE = new Int64Marshaller();

        Int64Marshaller() {
        }

        @Override
        public void marshal(InvocationSession session, HeapInvocationBuffer buffer, Object parameter) {
            buffer.putLong(((Number)parameter).longValue());
        }
    }

    static final class AddressResultConverter
    extends AbstractNumberResultConverter<Address> {
        static final ResultConverter<? extends Number, Number> INSTANCE = new AddressResultConverter();

        AddressResultConverter() {
        }

        @Override
        public Address fromNative(Number value, FromNativeContext fromNativeContext) {
            return Address.valueOf(value.longValue());
        }
    }

    static class PrimitiveArrayMarshaller
    implements Marshaller {
        private final PrimitiveArrayParameterStrategy strategy;
        private final int flags;

        @Override
        public final void marshal(InvocationSession session, HeapInvocationBuffer buffer, Object parameter) {
            buffer.putObject(parameter, (ObjectParameterStrategy)(parameter != null ? this.strategy : NullObjectParameterStrategy.NULL), this.flags);
        }

        protected PrimitiveArrayMarshaller(PrimitiveArrayParameterStrategy strategy, Collection<Annotation> annotations) {
            this.strategy = strategy;
            this.flags = AsmUtil.getNativeArrayFlags(annotations);
        }
    }

    static abstract class AbstractNumberResultConverter<T>
    implements ResultConverter<T, Number> {
        AbstractNumberResultConverter() {
        }

        @Override
        public final Class<Number> nativeType() {
            return Number.class;
        }
    }

    static class IntInvoker
    extends BaseInvoker {
        static final FunctionInvoker INSTANCE = new IntInvoker();

        IntInvoker() {
        }

        @Override
        public final Object invoke(Runtime runtime, Function function, HeapInvocationBuffer buffer) {
            return invoker.invokeInt(function, buffer);
        }
    }

    static final class FloatResultConverter
    extends AbstractNumberResultConverter<Float> {
        static final ResultConverter<? extends Number, Number> INSTANCE = new FloatResultConverter();

        FloatResultConverter() {
        }

        @Override
        public Float fromNative(Number value, FromNativeContext fromNativeContext) {
            return Float.valueOf(value.floatValue());
        }
    }

    static class BooleanMarshaller
    implements Marshaller {
        static final Marshaller INSTANCE = new BooleanMarshaller();

        BooleanMarshaller() {
        }

        @Override
        public void marshal(InvocationSession session, HeapInvocationBuffer buffer, Object parameter) {
            buffer.putInt(((Boolean)parameter).booleanValue() ? 1 : 0);
        }
    }

    static final class ByteResultConverter
    extends AbstractNumberResultConverter<Byte> {
        static final ResultConverter<? extends Number, Number> INSTANCE = new ByteResultConverter();

        @Override
        public Byte fromNative(Number value, FromNativeContext fromNativeContext) {
            return value.byteValue();
        }

        ByteResultConverter() {
        }
    }

    static abstract class NumberDataConverter
    implements DataConverter<Number, Number> {
        @Override
        public final Class<Number> nativeType() {
            return Number.class;
        }

        NumberDataConverter() {
        }
    }

    static final class Unsigned32Converter
    extends NumberDataConverter {
        static final NumberDataConverter INSTANCE = new Unsigned32Converter();

        @Override
        public Number fromNative(Number nativeValue, FromNativeContext context) {
            long value = nativeValue.intValue();
            return value < 0L ? (value & Integer.MAX_VALUE) + 0x80000000L : value;
        }

        Unsigned32Converter() {
        }

        @Override
        public Number toNative(Number value, ToNativeContext context) {
            return value.longValue() & 0xFFFFFFFFL;
        }
    }

    static class VariadicInvoker
    implements Invoker {
        private final FunctionInvoker functionInvoker;
        private final SignatureTypeMapper typeMapper;
        private final ParameterType[] fixedParameterTypes;
        private final SigType resultType;
        private final long functionAddress;
        private final CallingConvention callingConvention;
        private final boolean requiresErrno;
        private final Runtime runtime;

        VariadicInvoker(Runtime runtime, FunctionInvoker functionInvoker, SignatureTypeMapper typeMapper, ParameterType[] fixedParameterTypes, long functionAddress, SigType resultType, boolean requiresErrno, CallingConvention callingConvention) {
            this.runtime = runtime;
            this.functionInvoker = functionInvoker;
            this.typeMapper = typeMapper;
            this.fixedParameterTypes = fixedParameterTypes;
            this.functionAddress = functionAddress;
            this.resultType = resultType;
            this.requiresErrno = requiresErrno;
            this.callingConvention = callingConvention;
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * WARNING - void declaration
         */
        @Override
        public final Object invoke(Object self, Object[] parameters) {
            Object[] varParam = (Object[])parameters[parameters.length - 1];
            SigType[] argTypes = new ParameterType[this.fixedParameterTypes.length + varParam.length];
            System.arraycopy(this.fixedParameterTypes, 0, argTypes, 0, this.fixedParameterTypes.length - 1);
            Object[] variableArgs = new Object[varParam.length + 1];
            int variableArgsCount = 0;
            ArrayList<Class<? extends Annotation>> paramAnnotations = new ArrayList<Class<? extends Annotation>>();
            Object[] objectArray = varParam;
            int n = objectArray.length;
            for (int i = 0; i < n; ++i) {
                void var14_20;
                Class argClass;
                Object arg = objectArray[i];
                if (arg instanceof Class && Annotation.class.isAssignableFrom((Class)arg)) {
                    paramAnnotations.add((Class)arg);
                    continue;
                }
                ToNativeConverter toNativeConverter = null;
                Collection<Annotation> annos = VariadicInvoker.getAnnotations(paramAnnotations);
                paramAnnotations.clear();
                SimpleNativeContext toNativeContext = new SimpleNativeContext(this.runtime, annos);
                if (arg != null) {
                    ToNativeType toNativeType = this.typeMapper.getToNativeType(DefaultSignatureType.create(arg.getClass(), toNativeContext), toNativeContext);
                    toNativeConverter = toNativeType == null ? null : toNativeType.getToNativeConverter();
                    argClass = toNativeConverter == null ? arg.getClass() : toNativeConverter.nativeType();
                    variableArgs[variableArgsCount] = arg;
                } else {
                    argClass = Pointer.class;
                    variableArgs[variableArgsCount] = arg;
                }
                argTypes[this.fixedParameterTypes.length + variableArgsCount - 1] = new ParameterType(argClass, Types.getType(this.runtime, argClass, annos).getNativeType(), annos, toNativeConverter, new SimpleNativeContext(this.runtime, (Collection<Annotation>)var14_20));
                ++variableArgsCount;
            }
            argTypes[this.fixedParameterTypes.length + variableArgsCount - 1] = new ParameterType(Pointer.class, Types.getType(this.runtime, Pointer.class, Collections.emptyList()).getNativeType(), Collections.emptyList(), null, new SimpleNativeContext(this.runtime, Collections.emptyList()));
            variableArgs[variableArgsCount] = null;
            int fixedParamCount = this.fixedParameterTypes.length - 1;
            int totalArgsCount = ++variableArgsCount + fixedParamCount;
            Function function = new Function(this.functionAddress, InvokerUtil.getCallContext(this.resultType, fixedParamCount, argTypes, totalArgsCount, this.callingConvention, this.requiresErrno));
            HeapInvocationBuffer buffer = new HeapInvocationBuffer(function.getCallContext());
            InvocationSession session = new InvocationSession();
            try {
                if (parameters != null) {
                    for (int i = 0; i < parameters.length - 1; ++i) {
                        DefaultInvokerFactory.getMarshaller((ParameterType)argTypes[i]).marshal(session, buffer, parameters[i]);
                    }
                }
                int i = 0;
                while (i < variableArgsCount) {
                    void var13_18;
                    DefaultInvokerFactory.getMarshaller((ParameterType)argTypes[i + fixedParamCount]).marshal(session, buffer, variableArgs[var13_18]);
                    ++var13_18;
                }
                Object object = this.functionInvoker.invoke(this.runtime, function, buffer);
                return object;
            }
            finally {
                void var12_14;
                var12_14.finish();
            }
        }

        /*
         * WARNING - void declaration
         */
        private static Collection<Annotation> getAnnotations(Collection<Class<? extends Annotation>> klasses) {
            void var1_1;
            ArrayList<Annotation> ret = new ArrayList<Annotation>();
            Iterator<Class<? extends Annotation>> iterator2 = klasses.iterator();
            while (iterator2.hasNext()) {
                Class<? extends Annotation> klass = iterator2.next();
                if (klass.getAnnotation(Meta.class) != null) {
                    Annotation[] annotationArray = klass.getAnnotations();
                    int n = annotationArray.length;
                    for (int i = 0; i < n; ++i) {
                        Annotation anno = annotationArray[i];
                        if (anno.annotationType().getName().startsWith("java") || Meta.class.equals(anno.annotationType())) continue;
                        ret.add(anno);
                    }
                    continue;
                }
                ret.add(AnnotationProxy.newProxy(klass));
            }
            return var1_1;
        }
    }

    static class DefaultInvoker
    implements Invoker {
        final NativeLibrary nativeLibrary;
        final FunctionInvoker functionInvoker;
        protected final Runtime runtime;
        final Function function;
        final Marshaller[] marshallers;

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * WARNING - void declaration
         */
        @Override
        public final Object invoke(Object self, Object[] parameters) {
            Object object;
            InvocationSession session = new InvocationSession();
            HeapInvocationBuffer buffer = new HeapInvocationBuffer(this.function.getCallContext());
            try {
                if (parameters != null) {
                    int i = 0;
                    while (i < parameters.length) {
                        void var5_5;
                        this.marshallers[i].marshal(session, buffer, parameters[i]);
                        ++var5_5;
                    }
                }
                object = this.functionInvoker.invoke(this.runtime, this.function, buffer);
            }
            catch (Throwable throwable) {
                void var3_3;
                var3_3.finish();
                throw throwable;
            }
            session.finish();
            return object;
        }

        DefaultInvoker(Runtime runtime, NativeLibrary nativeLibrary, Function function, FunctionInvoker invoker, Marshaller[] marshallers) {
            this.runtime = runtime;
            this.nativeLibrary = nativeLibrary;
            this.function = function;
            this.functionInvoker = invoker;
            this.marshallers = marshallers;
        }
    }

    static class Float64Marshaller
    implements Marshaller {
        static final Marshaller INSTANCE = new Float64Marshaller();

        @Override
        public void marshal(InvocationSession session, HeapInvocationBuffer buffer, Object parameter) {
            buffer.putDouble(((Number)parameter).doubleValue());
        }

        Float64Marshaller() {
        }
    }

    static class PointerInvoker
    extends BaseInvoker {
        static final FunctionInvoker INSTANCE = new PointerInvoker();

        PointerInvoker() {
        }

        @Override
        public final Object invoke(Runtime runtime, Function function, HeapInvocationBuffer buffer) {
            return MemoryUtil.newPointer(runtime, invoker.invokeAddress(function, buffer));
        }
    }

    static class Float32Invoker
    extends BaseInvoker {
        static final FunctionInvoker INSTANCE = new Float32Invoker();

        @Override
        public final Object invoke(Runtime runtime, Function function, HeapInvocationBuffer buffer) {
            return Float.valueOf(invoker.invokeFloat(function, buffer));
        }

        Float32Invoker() {
        }
    }

    static class ToNativeConverterMarshaller
    implements Marshaller {
        private final boolean isPostInvokeRequired;
        private final Marshaller marshaller;
        private final ToNativeConverter converter;
        private final ToNativeContext context;

        @Override
        public void marshal(InvocationSession session, HeapInvocationBuffer buffer, final Object parameter) {
            final Object nativeValue = this.converter.toNative(parameter, this.context);
            this.marshaller.marshal(session, buffer, nativeValue);
            if (this.isPostInvokeRequired) {
                session.addPostInvoke(new InvocationSession.PostInvoke(){

                    @Override
                    public void postInvoke() {
                        ((ToNativeConverter.PostInvocation)ToNativeConverterMarshaller.this.converter).postInvoke(parameter, nativeValue, ToNativeConverterMarshaller.this.context);
                    }
                });
            } else {
                session.keepAlive(nativeValue);
            }
        }

        public ToNativeConverterMarshaller(ToNativeConverter toNativeConverter, ToNativeContext toNativeContext, Marshaller marshaller) {
            this.converter = toNativeConverter;
            this.context = toNativeContext;
            this.marshaller = marshaller;
            this.isPostInvokeRequired = this.converter instanceof ToNativeConverter.PostInvocation;
        }
    }
}

