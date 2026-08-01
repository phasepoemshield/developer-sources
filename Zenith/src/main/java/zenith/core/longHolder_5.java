package zenith;

class longHolder_5 implements ZenithInternal045 {
   private long longHolder_6;

   @Override
   public byte[] ZenithInternal128() {
      return SecureRandomHolder_2.ByteBufferHolder_2(String.valueOf(this.ByteBufferHolder_2()));
   }

   private long ByteBufferHolder_2() {
      this.longHolder_6 = Math.max(this.longHolder_6 + 1L, 1L);
      return this.longHolder_6;
   }
}
