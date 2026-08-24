/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.ConstructorConstructor;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class UnsafeAllocator {
    public static final UnsafeAllocator INSTANCE = UnsafeAllocator.create();

    /*
     * WARNING - void declaration
     */
    private static UnsafeAllocator create() {
        try {
            Class<?> unsafeClass = Class.forName("sun.misc.Unsafe");
            Field f = unsafeClass.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            final Object unsafe = f.get(null);
            Class[] classArray = new Class[1];
            classArray[0] = Class.class;
            final Method allocateInstance = unsafeClass.getMethod("allocateInstance", classArray);
            return new UnsafeAllocator(){

                @Override
                public <T> T newInstance(Class<T> c) throws Exception {
                    UnsafeAllocator.assertInstantiable(c);
                    Object[] objectArray = new Object[1];
                    objectArray[0] = c;
                    return (T)allocateInstance.invoke(unsafe, objectArray);
                }
            };
        }
        catch (Exception unsafeClass) {
            try {
                void var1_7;
                Class[] classArray = new Class[1];
                classArray[0] = Class.class;
                Method getConstructorId = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", classArray);
                getConstructorId.setAccessible(true);
                Object[] objectArray = new Object[1];
                objectArray[0] = Object.class;
                int constructorId = (Integer)getConstructorId.invoke(null, objectArray);
                Class[] classArray2 = new Class[2];
                classArray2[0] = Class.class;
                classArray2[1] = Integer.TYPE;
                final Method method = ObjectStreamClass.class.getDeclaredMethod("newInstance", classArray2);
                method.setAccessible(true);
                return new UnsafeAllocator((int)var1_7){
                    final /* synthetic */ int val$constructorId;
                    {
                        this.val$constructorId = n;
                    }

                    @Override
                    public <T> T newInstance(Class<T> c) throws Exception {
                        UnsafeAllocator.assertInstantiable(c);
                        Object[] objectArray = new Object[2];
                        objectArray[0] = c;
                        objectArray[1] = this.val$constructorId;
                        return (T)method.invoke(null, objectArray);
                    }
                };
            }
            catch (Exception getConstructorId) {
                try {
                    Class[] classArray = new Class[2];
                    classArray[0] = Class.class;
                    classArray[1] = Class.class;
                    final Method method = ObjectInputStream.class.getDeclaredMethod("newInstance", classArray);
                    method.setAccessible(true);
                    return new UnsafeAllocator(){

                        @Override
                        public <T> T newInstance(Class<T> c) throws Exception {
                            UnsafeAllocator.assertInstantiable(c);
                            Object[] objectArray = new Object[2];
                            objectArray[0] = c;
                            objectArray[1] = Object.class;
                            return (T)method.invoke(null, objectArray);
                        }
                    };
                }
                catch (Exception exception) {
                    return new UnsafeAllocator(){

                        @Override
                        public <T> T newInstance(Class<T> c) {
                            throw new UnsupportedOperationException("Cannot allocate " + c + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
                        }
                    };
                }
            }
        }
    }

    public abstract <T> T newInstance(Class<T> var1) throws Exception;

    private static void assertInstantiable(Class<?> c) {
        String exceptionMessage = ConstructorConstructor.checkInstantiable(c);
        if (exceptionMessage != null) {
            throw new AssertionError((Object)("UnsafeAllocator is used for non-instantiable type: " + exceptionMessage));
        }
    }
}

