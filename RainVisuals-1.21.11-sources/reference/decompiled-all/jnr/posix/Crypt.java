package jnr.posix;

import jnr.ffi.Pointer;

// $VF: Compiled from Crypt.java
public interface Crypt {
   Pointer crypt(byte[] var1, byte[] var2);

   CharSequence crypt(CharSequence var1, CharSequence var2);
}
