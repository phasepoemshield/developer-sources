package zenith;

class StringHolder_32 extends StringHolder {
   private static final String EventImpl_36 = "PongSender";

   public StringHolder_32(GetSocketHandler i1ii1il1i1ll11il1i1lli11, ZenithInternal045 iili11iiiil111lil) {
      super(i1ii1il1i1ll11il1i1lli11, "PongSender", iili11iiiil111lil);
   }

   @Override
   protected GetPayloadLengthHandler byteHolder_2(byte[] abyte) {
      return GetPayloadLengthHandler.ZenithInternal101(abyte);
   }
}
