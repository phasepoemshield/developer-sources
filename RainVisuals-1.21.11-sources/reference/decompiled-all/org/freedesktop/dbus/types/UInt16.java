package org.freedesktop.dbus.types;

// $VF: Compiled from UInt16.java
public class UInt16 extends Number implements Comparable<UInt16> {
   private final int value;
   public static final int MIN_VALUE = 0;
   public static final int MAX_VALUE = 65535;

   @Override
   public long longValue() {
      return this.value;
   }

   public UInt16(int _value) {
      if (_value >= 0 && _value <= 65535) {
         this.value = _value;
      } else {
         throw new NumberFormatException(String.format("%s is not between %s and %s.", _value, 0, 65535));
      }
   }

   public UInt16(String _value) {
      this(Integer.parseInt(_value));
   }

   @Override
   public int hashCode() {
      return this.value;
   }

   @Override
   public float floatValue() {
      return this.value;
   }

   public int compareTo(UInt16 _other) {
      return Integer.compare(this.value, _other.value);
   }

   @Override
   public boolean equals(Object _o) {
      return _o instanceof UInt16 ui && ui.value == this.value;
   }

   @Override
   public double doubleValue() {
      return this.value;
   }

   @Override
   public int intValue() {
      return this.value;
   }

   @Override
   public String toString() {
      return String.valueOf(this.value);
   }

   @Override
   public byte byteValue() {
      return (byte)this.value;
   }

   @Override
   public short shortValue() {
      return (short)this.value;
   }
}
