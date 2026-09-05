/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.msgpack.core.buffer.MessageBuffer;
import sun.nio.ch.DirectBuffer;

class DirectBufferAccess {
    static Method mCleaner;
    static Method mClean;
    static Method mInvokeCleaner;
    static Constructor<?> byteBufferConstructor;
    static Class<?> directByteBufferClass;
    static DirectBufferConstructorType directBufferConstructorType;
    static Method memoryBlockWrapFromJni;

    private DirectBufferAccess() {
    }

    private static void setupCleanerJava6(final ByteBuffer byteBuffer) {
        Object object = AccessController.doPrivileged(new PrivilegedAction<Object>(){

            @Override
            public Object run() {
                return DirectBufferAccess.getCleanerMethod(byteBuffer);
            }
        });
        if (object instanceof Throwable) {
            throw new RuntimeException((Throwable)object);
        }
        mCleaner = (Method)object;
        object = AccessController.doPrivileged(new PrivilegedAction<Object>(){

            @Override
            public Object run() {
                return DirectBufferAccess.getCleanMethod(byteBuffer, mCleaner);
            }
        });
        if (object instanceof Throwable) {
            throw new RuntimeException((Throwable)object);
        }
        mClean = (Method)object;
    }

    private static void setupCleanerJava9(final ByteBuffer byteBuffer) {
        Object object = AccessController.doPrivileged(new PrivilegedAction<Object>(){

            @Override
            public Object run() {
                return DirectBufferAccess.getInvokeCleanerMethod(byteBuffer);
            }
        });
        if (object instanceof Throwable) {
            throw new RuntimeException((Throwable)object);
        }
        mInvokeCleaner = (Method)object;
    }

    private static Object getCleanerMethod(ByteBuffer byteBuffer) {
        try {
            Method method = byteBuffer.getClass().getDeclaredMethod("cleaner", new Class[0]);
            method.setAccessible(true);
            method.invoke(byteBuffer, new Object[0]);
            return method;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return noSuchMethodException;
        }
        catch (InvocationTargetException invocationTargetException) {
            return invocationTargetException;
        }
        catch (IllegalAccessException illegalAccessException) {
            return illegalAccessException;
        }
    }

    private static Object getCleanMethod(ByteBuffer byteBuffer, Method method) {
        try {
            Method method2 = method.getReturnType().getDeclaredMethod("clean", new Class[0]);
            Object object = method.invoke(byteBuffer, new Object[0]);
            method2.setAccessible(true);
            method2.invoke(object, new Object[0]);
            return method2;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return noSuchMethodException;
        }
        catch (InvocationTargetException invocationTargetException) {
            return invocationTargetException;
        }
        catch (IllegalAccessException illegalAccessException) {
            return illegalAccessException;
        }
    }

    private static Object getInvokeCleanerMethod(ByteBuffer byteBuffer) {
        try {
            Method method = MessageBuffer.unsafe.getClass().getDeclaredMethod("invokeCleaner", ByteBuffer.class);
            method.invoke(MessageBuffer.unsafe, byteBuffer);
            return method;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return noSuchMethodException;
        }
        catch (InvocationTargetException invocationTargetException) {
            return invocationTargetException;
        }
        catch (IllegalAccessException illegalAccessException) {
            return illegalAccessException;
        }
    }

    static long getAddress(Buffer buffer) {
        return ((DirectBuffer)((Object)buffer)).address();
    }

    static void clean(Object object) {
        try {
            if (MessageBuffer.javaVersion <= 8) {
                Object object2 = mCleaner.invoke(object, new Object[0]);
                mClean.invoke(object2, new Object[0]);
            } else {
                mInvokeCleaner.invoke(MessageBuffer.unsafe, object);
            }
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    static boolean isDirectByteBufferInstance(Object object) {
        return directByteBufferClass.isInstance(object);
    }

    static ByteBuffer newByteBuffer(long l, int n, int n2, ByteBuffer byteBuffer) {
        if (byteBufferConstructor == null) {
            throw new IllegalStateException("Can't create a new DirectByteBuffer. In JDK17+, two JVM options needs to be set: --add-opens=java.base/java.nio=ALL-UNNAMED and --add-opens=java.base/sun.nio.ch=ALL-UNNAMED");
        }
        try {
            switch (directBufferConstructorType) {
                case ARGS_LONG_LONG: {
                    return (ByteBuffer)byteBufferConstructor.newInstance(l + (long)n, n2);
                }
                case ARGS_LONG_INT_REF: {
                    return (ByteBuffer)byteBufferConstructor.newInstance(l + (long)n, n2, byteBuffer);
                }
                case ARGS_LONG_INT: {
                    return (ByteBuffer)byteBufferConstructor.newInstance(l + (long)n, n2);
                }
                case ARGS_INT_INT: {
                    return (ByteBuffer)byteBufferConstructor.newInstance((int)l + n, n2);
                }
                case ARGS_MB_INT_INT: {
                    return (ByteBuffer)byteBufferConstructor.newInstance(memoryBlockWrapFromJni.invoke(null, l + (long)n, n2), n2, 0);
                }
            }
            throw new IllegalStateException("Unexpected value");
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    static {
        try {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1);
            directByteBufferClass = byteBuffer.getClass();
            Constructor<?> constructor = null;
            DirectBufferConstructorType directBufferConstructorType = null;
            Method method = null;
            try {
                constructor = directByteBufferClass.getDeclaredConstructor(Long.TYPE, Long.TYPE);
                directBufferConstructorType = DirectBufferConstructorType.ARGS_LONG_LONG;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                try {
                    constructor = directByteBufferClass.getDeclaredConstructor(Long.TYPE, Integer.TYPE, Object.class);
                    directBufferConstructorType = DirectBufferConstructorType.ARGS_LONG_INT_REF;
                }
                catch (NoSuchMethodException noSuchMethodException2) {
                    try {
                        constructor = directByteBufferClass.getDeclaredConstructor(Long.TYPE, Integer.TYPE);
                        directBufferConstructorType = DirectBufferConstructorType.ARGS_LONG_INT;
                    }
                    catch (NoSuchMethodException noSuchMethodException3) {
                        try {
                            constructor = directByteBufferClass.getDeclaredConstructor(Integer.TYPE, Integer.TYPE);
                            directBufferConstructorType = DirectBufferConstructorType.ARGS_INT_INT;
                        }
                        catch (NoSuchMethodException noSuchMethodException4) {
                            Class<?> clazz = Class.forName("java.nio.MemoryBlock");
                            method = clazz.getDeclaredMethod("wrapFromJni", Integer.TYPE, Long.TYPE);
                            method.setAccessible(true);
                            constructor = directByteBufferClass.getDeclaredConstructor(clazz, Integer.TYPE, Integer.TYPE);
                            directBufferConstructorType = DirectBufferConstructorType.ARGS_MB_INT_INT;
                        }
                    }
                }
            }
            byteBufferConstructor = constructor;
            DirectBufferAccess.directBufferConstructorType = directBufferConstructorType;
            memoryBlockWrapFromJni = method;
            if (byteBufferConstructor == null) {
                throw new RuntimeException("Constructor of DirectByteBuffer is not found");
            }
            try {
                byteBufferConstructor.setAccessible(true);
            }
            catch (RuntimeException runtimeException) {
                if ("java.lang.reflect.InaccessibleObjectException".equals(runtimeException.getClass().getName())) {
                    byteBufferConstructor = null;
                }
                throw runtimeException;
            }
            if (MessageBuffer.javaVersion <= 8) {
                DirectBufferAccess.setupCleanerJava6(byteBuffer);
            } else {
                DirectBufferAccess.setupCleanerJava9(byteBuffer);
            }
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    static enum DirectBufferConstructorType {
        ARGS_LONG_LONG,
        ARGS_LONG_INT_REF,
        ARGS_LONG_INT,
        ARGS_INT_INT,
        ARGS_MB_INT_INT;

    }
}

