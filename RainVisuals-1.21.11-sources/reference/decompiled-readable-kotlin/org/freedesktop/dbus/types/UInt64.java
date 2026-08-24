package org.freedesktop.dbus.types;

import java.math.BigInteger;

// $VF: Compiled from UInt64.java
public class UInt64 extends Number implements Comparable<UInt64> {
   private final long top;
   public static final BigInteger MAX_BIG_VALUE = new BigInteger("18446744073709551615");
   private final BigInteger value;
   private static final String ERROR_MSG = "%s is not between %s and %s.";
   public static final long MIN_VALUE = 0L;
   public static final long MAX_LONG_VALUE = Long.MAX_VALUE;
   private static final String BOUNDS = "4294967295";
   private final long bottom;

   public UInt64(String _value) {
      if (null == _value) {
         throw new NumberFormatException(String.format("%s is not between %s and %s.", _value, 0L, MAX_BIG_VALUE));
      }

      BigInteger a = new BigInteger(_value);
      if (0 <= a.compareTo(BigInteger.ZERO) && 0 >= a.compareTo(MAX_BIG_VALUE)) {
         this.value = a;
         this.top = this.value.shiftRight(32).and(new BigInteger("4294967295")).longValue();
         this.bottom = this.value.and(new BigInteger("4294967295")).longValue();
      } else {
         throw new NumberFormatException(String.format("%s is not between %s and %s.", _value, 0L, MAX_BIG_VALUE));
      }
   }

   public long bottom() {
      return this.bottom;
   }

   @Override
   public long longValue() {
      return this.value.longValue();
   }

   public long top() {
      return this.top;
   }

   @Override
   public byte byteValue() {
      return this.value.byteValue();
   }

   public UInt64(long _bottom, long _top) {
      BigInteger a = BigInteger.valueOf(_top);
      a = a.shiftLeft(32);
      a = a.add(BigInteger.valueOf(_bottom));
      if (0 > a.compareTo(BigInteger.ZERO)) {
         throw new NumberFormatException(String.format("%s is not between %s and %s.", a, 0L, MAX_BIG_VALUE));
      }

      if (0 < a.compareTo(MAX_BIG_VALUE)) {
         throw new NumberFormatException(String.format("%s is not between %s and %s.", a, 0L, MAX_BIG_VALUE));
      }

      this.value = a;
      this.top = _top;
      this.bottom = _bottom;
   }

   @Override
   public short shortValue() {
      return this.value.shortValue();
   }

   public BigInteger value() {
      return this.value;
   }

   @Override
   public int hashCode() {
      return this.value.hashCode();
   }

   public UInt64(long _value) {
      if (_value >= 0L && _value <= Long.MAX_VALUE) {
         this.value = BigInteger.valueOf(_value);
         this.top = this.value.shiftRight(32).and(new BigInteger("4294967295")).longValue();
         this.bottom = this.value.and(new BigInteger("4294967295")).longValue();
      } else {
         throw new NumberFormatException(String.format("%s is not between %s and %s.", _value, 0L, Long.MAX_VALUE));
      }
   }

   @Override
   public double doubleValue() {
      return this.value.doubleValue();
   }

   @Override
   public int intValue() {
      return this.value.intValue();
   }

   public int compareTo(UInt64 _other) {
      return this.value.compareTo(_other.value);
   }

   @Override
   public String toString() {
      return this.value.toString();
   }

   @Override
   public boolean equals(Object _o) {
      return _o instanceof UInt64 ui && this.value.equals(ui.value);
   }

   public UInt64(BigInteger _value) {
      if (null != _value && 0 <= _value.compareTo(BigInteger.ZERO) && 0 >= _value.compareTo(MAX_BIG_VALUE)) {
         this.value = _value;
         this.top = this.value.shiftRight(32).and(new BigInteger("4294967295")).longValue();
         this.bottom = this.value.and(new BigInteger("4294967295")).longValue();
      } else {
         throw new NumberFormatException(String.format("%s is not between %s and %s.", _value, 0L, MAX_BIG_VALUE));
      }
   }

   @Override
   public float floatValue() {
      return this.value.floatValue();
   }
}
