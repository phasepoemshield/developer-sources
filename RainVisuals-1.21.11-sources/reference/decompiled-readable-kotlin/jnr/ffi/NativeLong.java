package jnr.ffi;

// $VF: Compiled from NativeLong.java
public final class NativeLong extends Number implements Comparable<NativeLong> {
   private static final NativeLong ONE = new NativeLong(1);
   private static final NativeLong MINUS_ONE = new NativeLong(-1);
   private final long value;
   private static final NativeLong ZERO = new NativeLong(0);

   public static NativeLong valueOf(int value) {
      return value == 0 ? ZERO : (value == 1 ? ONE : (value == -1 ? MINUS_ONE : _valueOf(value)));
   }

   public static NativeLong valueOf(long value) {
      return value == 0L ? ZERO : (value == 1L ? ONE : (value == -1L ? MINUS_ONE : _valueOf(value)));
   }

   private static NativeLong _valueOf(int value) {
      return value >= -128 && value <= 127 ? NativeLong.Cache.cache[128 + value] : new NativeLong(value);
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   public NativeLong(int value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final float floatValue() {
      return (float)this.value;
   }

   private static NativeLong _valueOf(long value) {
      return value >= -128L && value <= 127L ? NativeLong.Cache.cache[128 + (int)value] : new NativeLong(value);
   }

   @Override
   public String toString() {
      return String.valueOf(this.value);
   }

   @Override
   public final boolean equals(Object obj) {
      return obj instanceof NativeLong && this.value == ((NativeLong)obj).value;
   }

   @Override
   public final int hashCode() {
      return (int)(this.value ^ this.value >>> 32);
   }

   public final int compareTo(NativeLong other) {
      return this.value < other.value ? -1 : (this.value > other.value ? 1 : 0);
   }

   public NativeLong(long value) {
      this.value = value;
   }

   @Override
   public final double doubleValue() {
      return this.value;
   }

   // $VF: Compiled from NativeLong.java
   private static final class Cache {
      static final NativeLong[] cache = new NativeLong[256];

      static {
         for (int i = 0; i < cache.length; i++) {
            cache[i] = new NativeLong(i - 128);
         }

         cache[128] = NativeLong.ZERO;
         cache[129] = NativeLong.ONE;
         cache[127] = NativeLong.MINUS_ONE;
      }
   }
}
