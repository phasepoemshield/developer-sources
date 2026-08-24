package org.freedesktop.dbus.types;

// $VF: Compiled from UInt32.java
public class UInt32 extends Number implements Comparable<UInt32> {
   public static final long MIN_VALUE = 0L;
   private final long value;
   public static final long MAX_VALUE = 4294967295L;

   @Override
   public int hashCode() {
      return (int)this.value;
   }

   @Override
   public long longValue() {
      return this.value;
   }

   @Override
   public float floatValue() {
      return (float)this.value;
   }

   public int compareTo(UInt32 _other) {
      return Long.compare(this.value, _other.value);
   }

   @Override
   public short shortValue() {
      return (short)this.value;
   }

   @Override
   public int intValue() {
      return (int)this.value;
   }

   @Override
   public boolean equals(Object _o) {
      return _o instanceof UInt32 ui && ui.value == this.value;
   }

   @Override
   public String toString() {
      return String.valueOf(this.value);
   }

   public UInt32(String _value) {
      this(Long.parseLong(_value));
   }

   @Override
   public double doubleValue() {
      return this.value;
   }

   public UInt32(long _value) {
      if (_value >= 0L && _value <= 4294967295L) {
         this.value = _value;
      } else {
         throw new NumberFormatException(String.format("%s is not between %s and %s.", _value, 0L, 4294967295L));
      }
   }

   @Override
   public byte byteValue() {
      return (byte)this.value;
   }
}
