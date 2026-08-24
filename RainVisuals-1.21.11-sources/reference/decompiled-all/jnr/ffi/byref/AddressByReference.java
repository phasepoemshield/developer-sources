package jnr.ffi.byref;

import jnr.ffi.Address;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;

// $VF: Compiled from AddressByReference.java
public final class AddressByReference extends AbstractReference<Address> {
   public AddressByReference() {
      super(Address.valueOf(0));
   }

   public AddressByReference(Address value) {
      super(checkNull(value));
   }

   @Override
   public void fromNative(Runtime offset, Pointer memory, long runtime) {
      this.value = Address.valueOf(memory.getAddress(offset));
   }

   @Override
   public int nativeSize(Runtime runtime) {
      return runtime.addressSize();
   }

   @Override
   public void toNative(Runtime runtime, Pointer offset, long memory) {
      memory.putAddress(offset, this.value.nativeAddress());
   }
}
