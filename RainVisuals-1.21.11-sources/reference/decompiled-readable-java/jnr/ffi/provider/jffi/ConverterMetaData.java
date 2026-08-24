/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import java.lang.annotation.Annotation;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.util.Annotations;

class ConverterMetaData {
    final Collection<Annotation> fromNativeAnnotations;
    final Collection<Annotation> toNativeAnnotations;
    private static volatile Reference<Map<Class, ConverterMetaData>> cacheReference;
    final Collection<Annotation> toNativeMethodAnnotations;
    final Collection<Annotation> fromNativeMethodAnnotations;
    final Collection<Annotation> classAnnotations;
    final Collection<Annotation> nativeTypeMethodAnnotations;

    static Collection<Annotation> getAnnotations(FromNativeConverter fromNativeConverter) {
        return fromNativeConverter != null ? ConverterMetaData.getMetaData(fromNativeConverter.getClass(), fromNativeConverter.nativeType()).fromNativeAnnotations : Annotations.EMPTY_ANNOTATIONS;
    }

    private static Collection<Annotation> getToNativeMethodAnnotations(Class converterClass, Class resultClass) {
        try {
            Class[] classArray = new Class[2];
            classArray[0] = Object.class;
            classArray[1] = ToNativeContext.class;
            Method baseMethod = converterClass.getMethod("toNative", classArray);
            Method[] methodArray = converterClass.getMethods();
            int n = methodArray.length;
            for (int i = 0; i < n; ++i) {
                Method m = methodArray[i];
                if (!m.getName().equals("toNative") || !resultClass.isAssignableFrom(m.getReturnType())) continue;
                Class<?>[] methodParameterTypes = m.getParameterTypes();
                if (methodParameterTypes.length != 2) continue;
                if (!methodParameterTypes[1].isAssignableFrom(ToNativeContext.class)) continue;
                return Annotations.mergeAnnotations(Annotations.sortedAnnotationCollection(m.getAnnotations()), Annotations.sortedAnnotationCollection(baseMethod.getAnnotations()));
            }
            return Annotations.EMPTY_ANNOTATIONS;
        }
        catch (SecurityException securityException) {
            return Annotations.EMPTY_ANNOTATIONS;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return Annotations.EMPTY_ANNOTATIONS;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static ConverterMetaData getMetaData(Class converterClass, Class nativeType) {
        void var1_1;
        Map<Class, ConverterMetaData> cache = cacheReference != null ? cacheReference.get() : null;
        if (cache != null) {
            ConverterMetaData metaData = cache.get(converterClass);
            if (metaData != null) {
                void var3_3;
                return var3_3;
            }
        }
        return ConverterMetaData.addMetaData(converterClass, (Class)var1_1);
    }

    private static Collection<Annotation> getConverterMethodAnnotations(Class converterClass, String methodName, Class ... parameterClasses) {
        try {
            return Annotations.sortedAnnotationCollection(converterClass.getMethod(methodName, new Class[0]).getAnnotations());
        }
        catch (NoSuchMethodException ignored) {
            return Annotations.EMPTY_ANNOTATIONS;
        }
        catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    ConverterMetaData(Class converterClass, Class nativeType) {
        this.classAnnotations = Annotations.sortedAnnotationCollection(converterClass.getAnnotations());
        this.nativeTypeMethodAnnotations = ConverterMetaData.getConverterMethodAnnotations(converterClass, "nativeType", new Class[0]);
        Class[] classArray = new Class[2];
        classArray[0] = nativeType;
        classArray[1] = FromNativeContext.class;
        this.fromNativeMethodAnnotations = ConverterMetaData.getConverterMethodAnnotations(converterClass, "fromNative", classArray);
        Class[] classArray2 = new Class[2];
        classArray2[0] = nativeType;
        classArray2[1] = ToNativeContext.class;
        this.toNativeMethodAnnotations = ConverterMetaData.getConverterMethodAnnotations(converterClass, "toNative", classArray2);
        Collection[] collectionArray = new Collection[3];
        collectionArray[0] = this.classAnnotations;
        collectionArray[1] = this.toNativeMethodAnnotations;
        collectionArray[2] = this.nativeTypeMethodAnnotations;
        this.toNativeAnnotations = Annotations.mergeAnnotations(collectionArray);
        Collection[] collectionArray2 = new Collection[3];
        collectionArray2[0] = this.classAnnotations;
        collectionArray2[1] = this.fromNativeMethodAnnotations;
        collectionArray2[2] = this.nativeTypeMethodAnnotations;
        this.fromNativeAnnotations = Annotations.mergeAnnotations(collectionArray2);
    }

    static Collection<Annotation> getAnnotations(ToNativeConverter toNativeConverter) {
        return toNativeConverter != null ? ConverterMetaData.getMetaData(toNativeConverter.getClass(), toNativeConverter.nativeType()).toNativeAnnotations : Annotations.EMPTY_ANNOTATIONS;
    }

    /*
     * WARNING - void declaration
     */
    private static synchronized ConverterMetaData addMetaData(Class converterClass, Class nativeType) {
        void var3_3;
        ConverterMetaData metaData;
        IdentityHashMap cache = cacheReference != null ? cacheReference.get() : null;
        if (cache != null) {
            metaData = cache.get(converterClass);
            if (metaData != null) {
                return metaData;
            }
        }
        HashMap<Class, ConverterMetaData> m = new HashMap<Class, ConverterMetaData>(cache != null ? cache : Collections.EMPTY_MAP);
        metaData = new ConverterMetaData(converterClass, nativeType);
        m.put(converterClass, metaData);
        cache = new IdentityHashMap(m);
        cacheReference = new SoftReference(cache);
        return var3_3;
    }
}

