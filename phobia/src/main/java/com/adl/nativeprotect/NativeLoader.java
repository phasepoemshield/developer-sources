/*
 * Decompiled with CFR 0.152.
 */
package com.adl.nativeprotect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class NativeLoader {
    private static final String FALLBACK_LOAD_CODE = "P100";
    private static final String FALLBACK_BIND_CODE = "P400";
    private static final String FALLBACK_DIR = ".cache-layout";
    private static final Set<String> LOADED = ConcurrentHashMap.newKeySet();
    private static final Set<String> NATIVE_FILE_LOADED = ConcurrentHashMap.newKeySet();

    private NativeLoader() {
    }

    public static synchronized void loadLibraryFromJar(String string) {
        String string2 = System.mapLibraryName(Objects.requireNonNull(string, "libraryBaseName"));
        NativeLoader.loadFromJar("/native/" + string2);
    }

    public static synchronized void loadFromJar(String string) {
        Objects.requireNonNull(string, "resourcePath");
        if (LOADED.contains(string)) {
            return;
        }
        String string2 = System.getProperty("adl.native.path");
        if (string2 != null && !string2.isEmpty()) {
            try {
                if (NATIVE_FILE_LOADED.add(string2)) {
                    System.load(string2);
                }
                LOADED.add(string);
                return;
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                throw NativeLoader.fail("Protected component couldn't be loaded.", FALLBACK_LOAD_CODE, unsatisfiedLinkError);
            }
        }
        try (InputStream inputStream = NativeLoader.class.getResourceAsStream(string);){
            if (inputStream == null) {
                throw NativeLoader.fail("Protected component couldn't be loaded.", FALLBACK_LOAD_CODE, null);
            }
            String string3 = Path.of(string, new String[0]).getFileName().toString();
            Object object = string3;
            int n2 = string3.lastIndexOf(46);
            if (n2 > 0) {
                object = string3.substring(0, n2);
            }
            if (((String)object).length() < 3) {
                object = "ntl" + (String)object;
            }
            String string4 = n2 > 0 ? string3.substring(n2) : null;
            Path path = NativeLoader.createExtractPath((String)object, string4);
            path.toFile().deleteOnExit();
            Files.copy(inputStream, path, StandardCopyOption.REPLACE_EXISTING);
            System.load(path.toAbsolutePath().toString());
            LOADED.add(string);
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            throw NativeLoader.fail("Protected component couldn't be loaded.", FALLBACK_LOAD_CODE, unsatisfiedLinkError);
        }
        catch (IOException iOException) {
            throw NativeLoader.fail("Protected component couldn't be loaded.", FALLBACK_LOAD_CODE, iOException);
        }
    }

    public static void ensureNativeClassInitialized(String string, String string2, Class<?> clazz) {
        if (string2.equals("com/adl/nativeprotect/User")) {
            return;
        }
        if (string2.equals("ruhack/phobia/d")) {
            return;
        }
        NativeLoader.loadLibraryFromJar(string);
        String string3 = string2.replace('.', '/');
        String string4 = NativeLoader.adl_e0_7e41b2cbc99fbb5b813bdb60(string3, clazz, string3.length());
        if (string4 != null) {
            throw new IllegalStateException(string4);
        }
    }

    private static IllegalStateException fail(String string, String string2, Throwable throwable) {
        String string3 = NativeLoader.sanitizeSupportCode(string2);
        String string4 = string + " Support code: " + string3 + ".";
        System.err.println("[adl-native] " + string4);
        if (throwable != null) {
            return new IllegalStateException(string4, throwable);
        }
        return new IllegalStateException(string4);
    }

    private static String sanitizeSupportCode(String string) {
        if (string == null) {
            return "P000";
        }
        String string2 = string.trim();
        if (string2.isEmpty() || string2.length() > 16) {
            return "P000";
        }
        for (int i2 = 0; i2 < string2.length(); ++i2) {
            char c2 = string2.charAt(i2);
            if (c2 >= 'A' && c2 <= 'Z' || c2 >= '0' && c2 <= '9') continue;
            return "P000";
        }
        return string2;
    }

    private static Path createExtractPath(String string, String string2) throws IOException {
        try {
            return Files.createTempFile(string, string2, new FileAttribute[0]);
        }
        catch (IOException iOException) {
            Path[] pathArray;
            IOException iOException2 = iOException;
            for (Path path : pathArray = new Path[]{Path.of(System.getProperty("user.home"), new String[0]).resolve(FALLBACK_DIR), Path.of(System.getProperty("user.dir"), new String[0]).resolve(FALLBACK_DIR)}) {
                try {
                    Files.createDirectories(path, new FileAttribute[0]);
                    return Files.createTempFile(path, string, string2, new FileAttribute[0]);
                }
                catch (IOException iOException3) {
                    iOException2 = iOException3;
                }
            }
            throw iOException2;
        }
    }

    private static ClassLoader resolveCallerLoader(Class<?> clazz) {
        ClassLoader classLoader;
        ClassLoader classLoader2 = classLoader = clazz != null ? clazz.getClassLoader() : null;
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        if (classLoader == null) {
            classLoader = NativeLoader.class.getClassLoader();
        }
        return classLoader;
    }

    public static Object bootstrapLambda(Class<?> clazz, String string, String string2, String string3, int n2, String string4, String string5, String string6, String string7, int n3, String[] stringArray, String[] stringArray2, Object[] objectArray) {
        try {
            CallSite callSite;
            Objects.requireNonNull(clazz, "callerClass");
            ClassLoader classLoader = NativeLoader.resolveCallerLoader(clazz);
            Class<?> clazz2 = Class.forName(string4.replace('/', '.'), false, classLoader);
            MethodHandles.Lookup lookup = MethodHandles.privateLookupIn(clazz, MethodHandles.lookup());
            MethodType methodType = MethodType.fromMethodDescriptorString(string2, classLoader);
            MethodType methodType2 = MethodType.fromMethodDescriptorString(string3, classLoader);
            MethodType methodType3 = MethodType.fromMethodDescriptorString(string6, classLoader);
            MethodType methodType4 = MethodType.fromMethodDescriptorString(string7, classLoader);
            MethodHandle methodHandle = NativeLoader.resolveMethodHandle(lookup, clazz, clazz2, n2, string5, string6);
            if (!(n3 != 0 || stringArray != null && stringArray.length != 0 || stringArray2 != null && stringArray2.length != 0)) {
                callSite = LambdaMetafactory.metafactory(lookup, string, methodType, methodType2, methodHandle, methodType4);
            } else {
                int n4 = stringArray != null ? stringArray.length : 0;
                int n5 = stringArray2 != null ? stringArray2.length : 0;
                boolean bl2 = (n3 & 2) != 0;
                boolean bl3 = (n3 & 4) != 0;
                Object[] objectArray2 = new Object[4 + (bl2 ? 1 + n4 : 0) + (bl3 ? 1 + n5 : 0)];
                int n6 = 0;
                objectArray2[n6++] = methodType2;
                objectArray2[n6++] = methodHandle;
                objectArray2[n6++] = methodType4;
                objectArray2[n6++] = n3;
                if (bl2) {
                    objectArray2[n6++] = n4;
                    for (String string8 : stringArray) {
                        objectArray2[n6++] = Class.forName(string8.replace('/', '.'), false, classLoader);
                    }
                }
                if (bl3) {
                    objectArray2[n6++] = n5;
                    for (String string8 : stringArray2) {
                        objectArray2[n6++] = MethodType.fromMethodDescriptorString(string8, classLoader);
                    }
                }
                callSite = LambdaMetafactory.altMetafactory(lookup, string, methodType, objectArray2);
            }
            Object[] objectArray3 = objectArray != null ? objectArray : new Object[]{};
            return callSite.getTarget().invokeWithArguments(objectArray3);
        }
        catch (Throwable throwable) {
            throw new RuntimeException("Failed to bootstrap lambda", throwable);
        }
    }

    public static Object bootstrapInvokeDynamic(Class<?> clazz, String string, String string2, int n2, String string3, String string4, String string5, int[] nArray, long[] lArray, String[] stringArray, String[] stringArray2, String[] stringArray3, Object[] objectArray) {
        try {
            Object[] objectArray2;
            Objects.requireNonNull(clazz, "callerClass");
            ClassLoader classLoader = NativeLoader.resolveCallerLoader(clazz);
            MethodHandles.Lookup lookup = MethodHandles.privateLookupIn(clazz, MethodHandles.lookup());
            MethodType methodType = MethodType.fromMethodDescriptorString(string2, classLoader);
            Class<?> clazz2 = Class.forName(string3.replace('/', '.'), false, classLoader);
            MethodHandle methodHandle = NativeLoader.resolveMethodHandle(lookup, clazz, clazz2, n2, string4, string5);
            int n3 = nArray != null ? nArray.length : 0;
            Object[] objectArray3 = new Object[3 + n3];
            objectArray3[0] = lookup;
            objectArray3[1] = string;
            objectArray3[2] = methodType;
            for (int i2 = 0; i2 < n3; ++i2) {
                objectArray3[3 + i2] = NativeLoader.decodeBootstrapArg(classLoader, lookup, clazz, nArray[i2], lArray != null && i2 < lArray.length ? lArray[i2] : 0L, stringArray != null && i2 < stringArray.length ? stringArray[i2] : "", stringArray2 != null && i2 < stringArray2.length ? stringArray2[i2] : "", stringArray3 != null && i2 < stringArray3.length ? stringArray3[i2] : "");
            }
            Object object = methodHandle.invokeWithArguments(objectArray3);
            Object[] objectArray4 = objectArray2 = objectArray != null ? objectArray : new Object[]{};
            if (object instanceof CallSite) {
                return ((CallSite)object).getTarget().invokeWithArguments(objectArray2);
            }
            if (object instanceof MethodHandle) {
                return ((MethodHandle)object).invokeWithArguments(objectArray2);
            }
            return object;
        }
        catch (Throwable throwable) {
            throw new RuntimeException("Failed to bootstrap invokedynamic", throwable);
        }
    }

    private static Object decodeBootstrapArg(ClassLoader classLoader, MethodHandles.Lookup lookup, Class<?> clazz, int n2, long l2, String string, String string2, String string3) throws Throwable {
        switch (n2) {
            case 1: {
                return string;
            }
            case 2: {
                return Class.forName(string.replace('/', '.'), false, classLoader);
            }
            case 3: {
                return (int)l2;
            }
            case 4: {
                return l2;
            }
            case 5: {
                return Float.valueOf(Float.intBitsToFloat((int)l2));
            }
            case 6: {
                return Double.longBitsToDouble(l2);
            }
            case 7: {
                return MethodType.fromMethodDescriptorString(string, classLoader);
            }
            case 8: {
                return NativeLoader.resolveMethodHandle(lookup, clazz, Class.forName(string.replace('/', '.'), false, classLoader), (int)l2, string2, string3);
            }
        }
        throw new IllegalStateException("Unsupported bootstrap arg tag: " + n2);
    }

    private static MethodHandle resolveMethodHandle(MethodHandles.Lookup lookup, Class<?> clazz, Class<?> clazz2, int n2, String string, String string2) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, ClassNotFoundException {
        switch (n2) {
            case 1: {
                return lookup.findGetter(clazz2, string, NativeLoader.fieldTypeFromDesc(string2, clazz2.getClassLoader()));
            }
            case 2: {
                return lookup.findStaticGetter(clazz2, string, NativeLoader.fieldTypeFromDesc(string2, clazz2.getClassLoader()));
            }
            case 3: {
                return lookup.findSetter(clazz2, string, NativeLoader.fieldTypeFromDesc(string2, clazz2.getClassLoader()));
            }
            case 4: {
                return lookup.findStaticSetter(clazz2, string, NativeLoader.fieldTypeFromDesc(string2, clazz2.getClassLoader()));
            }
            case 5: 
            case 9: {
                return lookup.findVirtual(clazz2, string, MethodType.fromMethodDescriptorString(string2, clazz2.getClassLoader()));
            }
            case 6: {
                return lookup.findStatic(clazz2, string, MethodType.fromMethodDescriptorString(string2, clazz2.getClassLoader()));
            }
            case 7: {
                return lookup.findSpecial(clazz2, string, MethodType.fromMethodDescriptorString(string2, clazz2.getClassLoader()), clazz);
            }
            case 8: {
                return lookup.findConstructor(clazz2, MethodType.fromMethodDescriptorString(string2, clazz2.getClassLoader()));
            }
        }
        throw new IllegalStateException("Unsupported method handle kind: " + n2);
    }

    private static Class<?> fieldTypeFromDesc(String string, ClassLoader classLoader) {
        return MethodType.fromMethodDescriptorString("()" + string, classLoader).returnType();
    }

    private static native String adl_e0_7e41b2cbc99fbb5b813bdb60(String var0, Class<?> var1, int var2);
}

