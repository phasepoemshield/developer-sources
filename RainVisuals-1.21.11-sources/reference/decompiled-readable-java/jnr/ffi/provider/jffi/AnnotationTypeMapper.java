/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
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

public class AnnotationTypeMapper
extends AbstractSignatureTypeMapper
implements SignatureTypeMapper {
    @Override
    public ToNativeType getToNativeType(SignatureType type, ToNativeContext context) {
        Method toNativeMethod = AnnotationTypeMapper.findMethodWithAnnotation(type, ToNativeConverter.ToNative.class);
        if (toNativeMethod == null) {
            return null;
        }
        if (!Modifier.isStatic(toNativeMethod.getModifiers())) {
            throw new IllegalArgumentException(toNativeMethod.getDeclaringClass().getName() + "." + toNativeMethod.getName() + " should be declared static");
        }
        return ToNativeTypes.create(new ReflectionToNativeConverter(toNativeMethod, toNativeMethod.getAnnotation(ToNativeConverter.ToNative.class).nativeType()));
    }

    /*
     * WARNING - void declaration
     */
    private static Method findMethodWithAnnotation(SignatureType type, Class<? extends Annotation> annotationClass) {
        Class klass = type.getDeclaredType();
        while (klass != null) {
            if (klass == Object.class) break;
            Method[] methodArray = klass.getDeclaredMethods();
            int n = methodArray.length;
            for (int i = 0; i < n; ++i) {
                void var6_6;
                Method m = methodArray[i];
                if (!m.isAnnotationPresent(annotationClass)) continue;
                return var6_6;
            }
            Class clazz = klass.getSuperclass();
        }
        return null;
    }

    @Override
    public FromNativeType getFromNativeType(SignatureType type, FromNativeContext context) {
        Method fromNativeMethod = AnnotationTypeMapper.findMethodWithAnnotation(type, FromNativeConverter.FromNative.class);
        if (fromNativeMethod == null) {
            return null;
        }
        if (!Modifier.isStatic(fromNativeMethod.getModifiers())) {
            throw new IllegalArgumentException(fromNativeMethod.getDeclaringClass().getName() + "." + fromNativeMethod.getName() + " should be declared static");
        }
        return FromNativeTypes.create(new ReflectionFromNativeConverter(fromNativeMethod, fromNativeMethod.getAnnotation(FromNativeConverter.FromNative.class).nativeType()));
    }

    @ToNativeConverter.Cacheable
    public final class ReflectionToNativeConverter
    extends AbstractReflectionConverter
    implements ToNativeConverter<Object, Object> {
        @Override
        public Object toNative(Object nativeValue, ToNativeContext context) {
            return this.invoke(nativeValue, context);
        }

        public ReflectionToNativeConverter(Method method, Class nativeType) {
            super(method, nativeType);
        }
    }

    @FromNativeConverter.Cacheable
    public final class ReflectionFromNativeConverter
    extends AbstractReflectionConverter
    implements FromNativeConverter<Object, Object> {
        public ReflectionFromNativeConverter(Method method, Class nativeType) {
            super(method, nativeType);
        }

        @Override
        public Object fromNative(Object nativeValue, FromNativeContext context) {
            return this.invoke(nativeValue, context);
        }
    }

    public abstract class AbstractReflectionConverter {
        protected final Class nativeType;
        protected final Method method;

        public AbstractReflectionConverter(Method method, Class nativeType) {
            this.method = method;
            this.nativeType = nativeType;
        }

        public final Class<Object> nativeType() {
            return this.nativeType;
        }

        /*
         * WARNING - void declaration
         */
        protected final Object invoke(Object value, Object context) {
            try {
                Object[] objectArray = new Object[2];
                objectArray[0] = value;
                objectArray[1] = context;
                return this.method.invoke(this.method.getDeclaringClass(), objectArray);
            }
            catch (IllegalAccessException iae) {
                void ite;
                throw new RuntimeException((Throwable)ite);
            }
            catch (InvocationTargetException ite) {
                void var3_4;
                throw new RuntimeException((Throwable)var3_4);
            }
        }
    }
}

