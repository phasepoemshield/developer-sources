/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.Foreign;
import com.kenai.jffi.MemoryIO;
import com.kenai.jffi.NativeMethod;
import com.kenai.jffi.Platform;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class NativeMethods {
    private final ResourceHolder memory;
    private static final Map<Class, NativeMethods> registeredMethods = new WeakHashMap<Class, NativeMethods>();

    public static final synchronized void unregister(Class clazz) {
        if (!registeredMethods.containsKey(clazz)) {
            throw new IllegalArgumentException("methods were not registered on class via NativeMethods.register");
        }
        if (Foreign.getInstance().unregisterNatives(clazz) != 0) {
            throw new RuntimeException("failed to unregister native methods");
        }
        registeredMethods.remove(clazz);
    }

    /*
     * WARNING - void declaration
     */
    public static final synchronized void register(Class clazz, List<NativeMethod> methods) {
        void var8_8;
        Class clazz2;
        int stringSize = 0;
        Iterator<NativeMethod> iterator2 = methods.iterator();
        while (iterator2.hasNext()) {
            NativeMethod m = iterator2.next();
            stringSize += m.name.getBytes().length + 1;
            stringSize += m.signature.getBytes().length + 1;
        }
        int ptrSize = Platform.getPlatform().addressSize() / 8;
        MemoryIO mm = MemoryIO.getInstance();
        int structSize = methods.size() * 3 * ptrSize;
        long memory = mm.allocateMemory(structSize + stringSize, true);
        if (memory == 0L) {
            throw new OutOfMemoryError("could not allocate native memory");
        }
        NativeMethods nm = new NativeMethods(new ResourceHolder(mm, memory));
        int off = 0;
        int stringOff = structSize;
        for (NativeMethod m : methods) {
            void var12_12;
            byte[] name = m.name.getBytes();
            long nameAddress = memory + (long)stringOff;
            mm.putZeroTerminatedByteArray(nameAddress, name, 0, name.length);
            byte[] sig = m.signature.getBytes();
            long sigAddress = memory + (long)(stringOff += name.length + 1);
            stringOff += sig.length + 1;
            mm.putZeroTerminatedByteArray(sigAddress, sig, 0, sig.length);
            mm.putAddress(memory + (long)off, nameAddress);
            mm.putAddress(memory + (long)(off += ptrSize), sigAddress);
            mm.putAddress(memory + (long)(off += ptrSize), var12_12.function);
            off += ptrSize;
        }
        if (Foreign.getInstance().registerNatives(clazz, memory, methods.size()) != 0) {
            throw new RuntimeException("failed to register native methods");
        }
        registeredMethods.put(clazz2, (NativeMethods)var8_8);
    }

    private NativeMethods(ResourceHolder memory) {
        this.memory = memory;
    }

    private static final class ResourceHolder {
        private final MemoryIO mm;
        private final long memory;

        protected void finalize() throws Throwable {
            try {
                this.mm.freeMemory(this.memory);
            }
            catch (Throwable t) {
                Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Exception when freeing native method struct array: %s", t.getLocalizedMessage());
            }
            finally {
                super.finalize();
            }
        }

        public ResourceHolder(MemoryIO mm, long memory) {
            this.mm = mm;
            this.memory = memory;
        }
    }
}

