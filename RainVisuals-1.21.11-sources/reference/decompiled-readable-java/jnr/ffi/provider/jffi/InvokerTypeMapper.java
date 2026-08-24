/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import java.lang.reflect.Method;
import java.util.EnumSet;
import java.util.Set;
import jnr.ffi.NativeLong;
import jnr.ffi.Pointer;
import jnr.ffi.Struct;
import jnr.ffi.annotations.Delegate;
import jnr.ffi.byref.ByReference;
import jnr.ffi.mapper.AbstractSignatureTypeMapper;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.FromNativeType;
import jnr.ffi.mapper.FromNativeTypes;
import jnr.ffi.mapper.SignatureType;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.mapper.ToNativeType;
import jnr.ffi.mapper.ToNativeTypes;
import jnr.ffi.provider.ParameterFlags;
import jnr.ffi.provider.converters.BoxedBooleanArrayParameterConverter;
import jnr.ffi.provider.converters.BoxedByteArrayParameterConverter;
import jnr.ffi.provider.converters.BoxedDoubleArrayParameterConverter;
import jnr.ffi.provider.converters.BoxedFloatArrayParameterConverter;
import jnr.ffi.provider.converters.BoxedIntegerArrayParameterConverter;
import jnr.ffi.provider.converters.BoxedLong32ArrayParameterConverter;
import jnr.ffi.provider.converters.BoxedLong64ArrayParameterConverter;
import jnr.ffi.provider.converters.BoxedShortArrayParameterConverter;
import jnr.ffi.provider.converters.ByReferenceParameterConverter;
import jnr.ffi.provider.converters.CharSequenceArrayParameterConverter;
import jnr.ffi.provider.converters.CharSequenceParameterConverter;
import jnr.ffi.provider.converters.EnumConverter;
import jnr.ffi.provider.converters.EnumSetConverter;
import jnr.ffi.provider.converters.Long32ArrayParameterConverter;
import jnr.ffi.provider.converters.NativeLong32ArrayParameterConverter;
import jnr.ffi.provider.converters.NativeLong64ArrayParameterConverter;
import jnr.ffi.provider.converters.NativeLongConverter;
import jnr.ffi.provider.converters.Pointer32ArrayParameterConverter;
import jnr.ffi.provider.converters.Pointer64ArrayParameterConverter;
import jnr.ffi.provider.converters.StringBufferParameterConverter;
import jnr.ffi.provider.converters.StringBuilderParameterConverter;
import jnr.ffi.provider.converters.StringResultConverter;
import jnr.ffi.provider.converters.StructArrayParameterConverter;
import jnr.ffi.provider.converters.StructByReferenceToNativeConverter;
import jnr.ffi.provider.jffi.AsmClassLoader;
import jnr.ffi.provider.jffi.ClosureFromNativeConverter;
import jnr.ffi.provider.jffi.NativeClosureManager;
import jnr.ffi.provider.jffi.StructByReferenceResultConverterFactory;
import jnr.ffi.provider.jffi.Types;

final class InvokerTypeMapper
extends AbstractSignatureTypeMapper
implements SignatureTypeMapper {
    private final StructByReferenceResultConverterFactory structResultConverterFactory;
    private final NativeClosureManager closureManager;
    private final AsmClassLoader classLoader;

    public FromNativeConverter getFromNativeConverter(SignatureType signatureType, FromNativeContext fromNativeContext) {
        block14: {
            FromNativeConverter<Set<? extends Enum>, Integer> fromNativeConverter;
            block13: {
                block12: {
                    block11: {
                        if (Enum.class.isAssignableFrom(signatureType.getDeclaredType())) {
                            return EnumConverter.getInstance(signatureType.getDeclaredType().asSubclass(Enum.class));
                        }
                        if (Struct.class.isAssignableFrom(signatureType.getDeclaredType())) {
                            return this.structResultConverterFactory.get(signatureType.getDeclaredType().asSubclass(Struct.class), fromNativeContext);
                        }
                        if (this.closureManager != null && InvokerTypeMapper.isDelegate(signatureType.getDeclaredType())) {
                            return ClosureFromNativeConverter.getInstance(fromNativeContext.getRuntime(), signatureType, this.classLoader, this);
                        }
                        if (NativeLong.class == signatureType.getDeclaredType()) {
                            return NativeLongConverter.getInstance();
                        }
                        if (String.class == signatureType.getDeclaredType()) break block11;
                        if (CharSequence.class != signatureType.getDeclaredType()) break block12;
                    }
                    return StringResultConverter.getInstance(fromNativeContext);
                }
                if (Set.class == signatureType.getDeclaredType()) break block13;
                if (EnumSet.class != signatureType.getDeclaredType()) break block14;
            }
            if ((fromNativeConverter = EnumSetConverter.getFromNativeConverter(signatureType, fromNativeContext)) != null) {
                return fromNativeConverter;
            }
        }
        return null;
    }

    @Override
    public FromNativeType getFromNativeType(SignatureType type, FromNativeContext context) {
        return FromNativeTypes.create(this.getFromNativeConverter(type, context));
    }

    @Override
    public ToNativeType getToNativeType(SignatureType type, ToNativeContext context) {
        return ToNativeTypes.create(this.getToNativeConverter(type, context));
    }

    public InvokerTypeMapper(NativeClosureManager closureManager, AsmClassLoader classLoader, boolean asmEnabled) {
        this.closureManager = closureManager;
        this.classLoader = classLoader;
        this.structResultConverterFactory = new StructByReferenceResultConverterFactory(classLoader, asmEnabled);
    }

    /*
     * WARNING - void declaration
     */
    public ToNativeConverter getToNativeConverter(SignatureType signatureType, ToNativeContext context) {
        void var2_2;
        void var3_3;
        Class javaType = signatureType.getDeclaredType();
        if (Enum.class.isAssignableFrom(javaType)) {
            return EnumConverter.getInstance(javaType.asSubclass(Enum.class));
        }
        if (Set.class.isAssignableFrom(javaType)) {
            ToNativeConverter<Set<? extends Enum>, Integer> converter = EnumSetConverter.getToNativeConverter(signatureType, context);
            if (converter != null) {
                void var4_4;
                return var4_4;
            }
        }
        if (InvokerTypeMapper.isDelegate(javaType)) {
            return this.closureManager.newClosureSite(javaType);
        }
        if (ByReference.class.isAssignableFrom(javaType)) {
            return ByReferenceParameterConverter.getInstance(context);
        }
        if (Struct.class.isAssignableFrom(javaType)) {
            return StructByReferenceToNativeConverter.getInstance(context);
        }
        if (NativeLong.class.isAssignableFrom(javaType)) {
            return NativeLongConverter.getInstance();
        }
        if (StringBuilder.class.isAssignableFrom(javaType)) {
            return StringBuilderParameterConverter.getInstance(ParameterFlags.parse(context.getAnnotations()), context);
        }
        if (StringBuffer.class.isAssignableFrom(javaType)) {
            return StringBufferParameterConverter.getInstance(ParameterFlags.parse(context.getAnnotations()), context);
        }
        if (CharSequence.class.isAssignableFrom(javaType)) {
            return CharSequenceParameterConverter.getInstance(context);
        }
        if (Byte[].class.isAssignableFrom(javaType)) {
            return BoxedByteArrayParameterConverter.getInstance(context);
        }
        if (Short[].class.isAssignableFrom(javaType)) {
            return BoxedShortArrayParameterConverter.getInstance(context);
        }
        if (Integer[].class.isAssignableFrom(javaType)) {
            return BoxedIntegerArrayParameterConverter.getInstance(context);
        }
        if (Long[].class.isAssignableFrom(javaType)) {
            return Types.getType(context.getRuntime(), javaType.getComponentType(), context.getAnnotations()).size() == 4 ? BoxedLong32ArrayParameterConverter.getInstance(context) : BoxedLong64ArrayParameterConverter.getInstance(context);
        }
        if (NativeLong[].class.isAssignableFrom(javaType)) {
            return Types.getType(context.getRuntime(), javaType.getComponentType(), context.getAnnotations()).size() == 4 ? NativeLong32ArrayParameterConverter.getInstance(context) : NativeLong64ArrayParameterConverter.getInstance(context);
        }
        if (Float[].class.isAssignableFrom(javaType)) {
            return BoxedFloatArrayParameterConverter.getInstance(context);
        }
        if (Double[].class.isAssignableFrom(javaType)) {
            return BoxedDoubleArrayParameterConverter.getInstance(context);
        }
        if (Boolean[].class.isAssignableFrom(javaType)) {
            return BoxedBooleanArrayParameterConverter.getInstance(context);
        }
        if (javaType.isArray()) {
            if (Pointer.class.isAssignableFrom(javaType.getComponentType())) {
                return context.getRuntime().addressSize() == 4 ? Pointer32ArrayParameterConverter.getInstance(context) : Pointer64ArrayParameterConverter.getInstance(context);
            }
        }
        if (long[].class.isAssignableFrom(javaType)) {
            if (Types.getType(context.getRuntime(), javaType.getComponentType(), context.getAnnotations()).size() == 4) {
                return Long32ArrayParameterConverter.getInstance(context);
            }
        }
        if (var3_3.isArray()) {
            if (Struct.class.isAssignableFrom(var3_3.getComponentType())) {
                return StructArrayParameterConverter.getInstance((ToNativeContext)var2_2, var3_3.getComponentType());
            }
        }
        if (var3_3.isArray()) {
            if (CharSequence.class.isAssignableFrom(var3_3.getComponentType())) {
                return CharSequenceArrayParameterConverter.getInstance((ToNativeContext)var2_2);
            }
        }
        return null;
    }

    private static boolean isDelegate(Class klass) {
        Method[] methodArray = klass.getMethods();
        int n = methodArray.length;
        for (int i = 0; i < n; ++i) {
            Method m = methodArray[i];
            if (!m.isAnnotationPresent(Delegate.class)) continue;
            return true;
        }
        return false;
    }
}

