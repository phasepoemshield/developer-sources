package jnr.ffi;

// $VF: Compiled from Address.java
public final class Address extends Number implements Comparable<Address> {
   private static final Address NULL = new Address(0L);
   private final long address;

   @Override
   public final String toString() {
      return Long.toString(this.address, 10);
   }

   @Override
   public final int hashCode() {
      return (int)(this.address ^ this.address >>> 32);
   }

   public final long address() {
      return this.address;
   }

   public final long nativeAddress() {
      return this.address;
   }

   public final boolean isNull() {
      return this.address == 0L;
   }

   public static Address valueOf(long address) {
      return address == 0L ? NULL : new Address(address);
   }

   public final String toHexString() {
      return Long.toString(this.address, 16);
   }

   public final int compareTo(Address other) {
      return this.address < other.address ? -1 : (this.address > other.address ? 1 : 0);
   }

   @Override
   public final boolean equals(Object obj) {
      return obj instanceof Address && this.address == ((Address)obj).address || obj == null && this.address == 0L;
   }

   @Override
   public final long longValue() {
      return this.address;
   }

   public static Address valueOf(int address) {
      return address == 0 ? NULL : new Address(address & 4294967295L);
   }

   @Override
   public final double doubleValue() {
      return this.address;
   }

   private Address(long address) {
      this.address = address;
   }

   public Address(Address address) {
      this.address = address.address;
   }

   @Override
   public final int intValue() {
      return (int)this.address;
   }

   @Override
   public final float floatValue() {
      return (float)this.address;
   }
}
