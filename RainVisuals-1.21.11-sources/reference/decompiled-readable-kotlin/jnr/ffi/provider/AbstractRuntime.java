package jnr.ffi.provider;

import java.nio.ByteOrder;
import java.util.EnumMap;
import java.util.EnumSet;
import jnr.ffi.NativeType;
import jnr.ffi.Runtime;
import jnr.ffi.Type;

// $VF: Compiled from AbstractRuntime.java
public abstract class AbstractRuntime extends Runtime {
   private final long addressMask;
   private final int longSize;
   private final ByteOrder byteOrder;
   private final Type[] types;
   private final int addressSize;

   @Override
   public abstract void setLastError(int var1);

   @Override
   public final int longSize() {
      return this.longSize;
   }

   @Override
   public final Type findType(NativeType type) {
      return this.types[type.ordinal()];
   }

   @Override
   public abstract MemoryManager getMemoryManager();

   @Override
   public final int addressSize() {
      return this.addressSize;
   }

   public AbstractRuntime(ByteOrder byteOrder, EnumMap<NativeType, Type> typeMap) {
      this.byteOrder = byteOrder;
      EnumSet<NativeType> nativeTypes = EnumSet.allOf(NativeType.class);
      this.types = new Type[nativeTypes.size()];

      for (NativeType t : nativeTypes) {
         this.types[t.ordinal()] = typeMap.containsKey(t) ? typeMap.get(t) : new BadType(t.toString());
      }

      this.addressSize = this.types[NativeType.ADDRESS.ordinal()].size();
      this.longSize = this.types[NativeType.SLONG.ordinal()].size();
      this.addressMask = this.addressSize == 4 ? 4294967295L : -1L;
   }

   @Override
   public final long addressMask() {
      return this.addressMask;
   }

   @Override
   public final ByteOrder byteOrder() {
      return this.byteOrder;
   }

   @Override
   public abstract int getLastError();
}
