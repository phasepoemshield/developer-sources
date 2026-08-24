package com.kenai.jffi;

import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

// $VF: Compiled from NativeMethods.java
public final class NativeMethods {
   private final NativeMethods.ResourceHolder memory;
   private static final Map<Class, NativeMethods> registeredMethods = new WeakHashMap<>();

   public static final synchronized void unregister(Class clazz) {
      if (!registeredMethods.containsKey(clazz)) {
         throw new IllegalArgumentException("methods were not registered on class via NativeMethods.register");
      }

      if (Foreign.getInstance().unregisterNatives(clazz) != 0) {
         throw new RuntimeException("failed to unregister native methods");
      }

      registeredMethods.remove(clazz);
   }

   public static final synchronized void register(Class clazz, List<NativeMethod> methods) {
      int stringSize = 0;

      for (NativeMethod mm : methods) {
         stringSize += mm.name.getBytes().length + 1;
         stringSize += mm.signature.getBytes().length + 1;
      }

      int var20 = Platform.getPlatform().addressSize() / 8;
      MemoryIO var21 = MemoryIO.getInstance();
      int structSize = methods.size() * 3 * var20;
      long memory = var21.allocateMemory(structSize + stringSize, true);
      if (memory == 0L) {
         throw new OutOfMemoryError("could not allocate native memory");
      }

      NativeMethods nm = new NativeMethods(new NativeMethods.ResourceHolder(var21, memory));
      int off = 0;
      int stringOff = structSize;

      for (NativeMethod m : methods) {
         byte[] name = m.name.getBytes();
         long nameAddress = memory + stringOff;
         stringOff += name.length + 1;
         var21.putZeroTerminatedByteArray(nameAddress, name, 0, name.length);
         byte[] sig = m.signature.getBytes();
         long sigAddress = memory + stringOff;
         stringOff += sig.length + 1;
         var21.putZeroTerminatedByteArray(sigAddress, sig, 0, sig.length);
         var21.putAddress(memory + off, nameAddress);
         off += var20;
         var21.putAddress(memory + off, sigAddress);
         off += var20;
         var21.putAddress(memory + off, m.function);
         off += var20;
      }

      if (Foreign.getInstance().registerNatives(clazz, memory, methods.size()) != 0) {
         throw new RuntimeException("failed to register native methods");
      }

      registeredMethods.put(clazz, nm);
   }

   private NativeMethods(NativeMethods.ResourceHolder memory) {
      this.memory = memory;
   }

   // $VF: Compiled from NativeMethods.java
   private static final class ResourceHolder {
      private final MemoryIO mm;
      private final long memory;

      // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      @Override
      protected void finalize() throws Throwable {
         boolean var5 = false /* VF: Semaphore variable */;

         label38: {
            try {
               var5 = true;
               this.mm.freeMemory(this.memory);
               var5 = false;
               break label38;
            } catch (Throwable t) {
               Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Exception when freeing native method struct array: %s", t.getLocalizedMessage());
               var5 = false;
            } finally {
               if (var5) {
                  super.finalize();
               }
            }

            super.finalize();
            return;
         }

         super.finalize();
      }

      public ResourceHolder(MemoryIO mm, long memory) {
         this.mm = mm;
         this.memory = memory;
      }
   }
}
