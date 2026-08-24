/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.converters;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;

public class StructByReferenceFromNativeConverter
implements FromNativeConverter<Struct, Pointer> {
    private final Constructor<? extends Struct> constructor;

    StructByReferenceFromNativeConverter(Constructor<? extends Struct> constructor) {
        this.constructor = constructor;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Struct fromNative(Pointer nativeValue, FromNativeContext context) {
        try {
            void e;
            Object[] objectArray = new Object[1];
            objectArray[0] = context.getRuntime();
            Struct s = this.constructor.newInstance(objectArray);
            s.useMemory(nativeValue);
            return e;
        }
        catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
        catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        catch (InvocationTargetException e) {
            void var3_6;
            throw new RuntimeException((Throwable)var3_6);
        }
    }

    public static FromNativeConverter<Struct, Pointer> getInstance(Class structClass, FromNativeContext toNativeContext) {
        try {
            Class[] classArray = new Class[1];
            classArray[0] = Runtime.class;
            return new StructByReferenceFromNativeConverter(structClass.getConstructor(classArray));
        }
        catch (NoSuchMethodException nsme) {
            throw new RuntimeException(structClass.getName() + " has no constructor that accepts jnr.ffi.Runtime");
        }
        catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    @Override
    public Class<Pointer> nativeType() {
        return Pointer.class;
    }
}

