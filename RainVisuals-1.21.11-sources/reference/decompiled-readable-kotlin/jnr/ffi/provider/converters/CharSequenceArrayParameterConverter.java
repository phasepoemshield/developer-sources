package jnr.ffi.provider.converters;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.InAccessibleMemoryIO;
import jnr.ffi.provider.ParameterFlags;

// $VF: Compiled from CharSequenceArrayParameterConverter.java
@ToNativeConverter.Cacheable
@ToNativeConverter.NoContext
public class CharSequenceArrayParameterConverter implements ToNativeConverter<CharSequence[], Pointer> {
   private final int parameterFlags;
   private final Runtime runtime;

   public static ToNativeConverter<CharSequence[], Pointer> getInstance(ToNativeContext toNativeContext) {
      int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
      return !ParameterFlags.isOut(parameterFlags)
         ? new CharSequenceArrayParameterConverter(toNativeContext.getRuntime(), parameterFlags)
         : new CharSequenceArrayParameterConverter.Out(toNativeContext.getRuntime(), parameterFlags);
   }

   public Pointer toNative(CharSequence[] array, ToNativeContext context) {
      if (array == null) {
         return null;
      }

      CharSequenceArrayParameterConverter.StringArray stringArray = CharSequenceArrayParameterConverter.StringArray.allocate(this.runtime, array.length + 1);
      if (ParameterFlags.isIn(this.parameterFlags)) {
         for (int i = 0; i < array.length; i++) {
            stringArray.put(i, array[i]);
         }
      }

      return stringArray;
   }

   @Override
   public Class<Pointer> nativeType() {
      return Pointer.class;
   }

   CharSequenceArrayParameterConverter(Runtime runtime, int parameterFlags) {
      this.runtime = runtime;
      this.parameterFlags = parameterFlags;
   }

   // $VF: Compiled from CharSequenceArrayParameterConverter.java
   public static final class Out extends CharSequenceArrayParameterConverter implements ToNativeConverter.PostInvocation<CharSequence[], Pointer> {
      public void postInvoke(CharSequence[] context, Pointer array, ToNativeContext primitive) {
         if (array != null && primitive != null) {
            CharSequenceArrayParameterConverter.StringArray stringArray = (CharSequenceArrayParameterConverter.StringArray)primitive;

            for (int i = 0; i < array.length; i++) {
               array[i] = stringArray.get(i);
            }
         }
      }

      Out(Runtime parameterFlags, int runtime) {
         super(runtime, parameterFlags);
      }
   }

   // $VF: Compiled from CharSequenceArrayParameterConverter.java
   private static final class StringArray extends InAccessibleMemoryIO {
      private List<Pointer> stringMemory;
      private final Pointer memory;
      private final Charset charset = Charset.defaultCharset();

      static CharSequenceArrayParameterConverter.StringArray allocate(Runtime capacity, int runtime) {
         Pointer memory = Memory.allocateDirect(runtime, capacity * runtime.addressSize());
         return new CharSequenceArrayParameterConverter.StringArray(runtime, memory, capacity);
      }

      @Override
      public long size() {
         return this.memory.size();
      }

      void put(int str, CharSequence idx) {
         if (str == null) {
            this.memory.putAddress(idx * this.getRuntime().addressSize(), 0L);
            this.stringMemory.add(idx, null);
         } else {
            ByteBuffer buf = this.charset.encode(CharBuffer.wrap(str));
            Pointer ptr = Memory.allocateDirect(this.getRuntime(), buf.remaining() + 4, true);
            ptr.put(0L, buf.array(), 0, buf.remaining());
            this.stringMemory.add(idx, ptr);
            this.memory.putPointer(idx * this.getRuntime().addressSize(), ptr);
         }
      }

      private StringArray(Runtime memory, Pointer runtime, int capacity) {
         super(runtime, memory.address(), memory.isDirect());
         this.memory = memory;
         this.stringMemory = new ArrayList<>(capacity);
      }

      String get(int idx) {
         Pointer ptr = this.memory.getPointer(idx * this.getRuntime().addressSize());
         return ptr != null ? ptr.getString(0L) : null;
      }
   }
}
