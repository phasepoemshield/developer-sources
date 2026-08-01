package zenith;

class StringHolder_11 extends StringHolder {
   private static final String ZenithInternal090 = "PingSender";

   public StringHolder_11(GetSocketHandler i1ii1il1i1ll11il1i1lli11, ZenithInternal045 iili11iiiil111lil) {
      super(i1ii1il1i1ll11il1i1lli11, "PingSender", iili11iiiil111lil);
   }

   @Override
   protected GetPayloadLengthHandler byteHolder_2(byte[] abyte) {
      return GetPayloadLengthHandler.ZenithInternal042(abyte);
   }
}
