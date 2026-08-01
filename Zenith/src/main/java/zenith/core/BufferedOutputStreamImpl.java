package zenith;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class BufferedOutputStreamImpl extends BufferedOutputStream {
   public BufferedOutputStreamImpl(OutputStream outputstream) {
      super(outputstream);
   }

   public void ZenithException(String s) throws IOException {
      byte[] abyte = SecureRandomHolder_2.ByteBufferHolder_2(s);
      this.write(abyte);
   }

   public void SecureRandomHolder_2(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) throws IOException {
      this.longHolder_7(lll1li1iil1ii11iliiii1);
      this.HostnameVerifierImpl(lll1li1iil1ii11iliiii1);
      this.longHolder_4(lll1li1iil1ii11iliiii1);
      byte[] abyte = SecureRandomHolder_2.nextBytes(4);
      this.write(abyte);
      this.StringHolder_8(lll1li1iil1ii11iliiii1, abyte);
   }

   private void longHolder_7(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) throws IOException {
      int i = (lll1li1iil1ii11iliiii1.EventImpl_20() ? 128 : 0)
         | (lll1li1iil1ii11iliiii1.EventImpl_8() ? 64 : 0)
         | (lll1li1iil1ii11iliiii1.ZenithInternal078() ? 32 : 0)
         | (lll1li1iil1ii11iliiii1.booleanHolder_3() ? 16 : 0)
         | lll1li1iil1ii11iliiii1.ZenithInternal025() & 15;
      this.write(i);
   }

   private void HostnameVerifierImpl(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) throws IOException {
      int i = 128;
      int j = lll1li1iil1ii11iliiii1.getPayloadLength();
      if (j <= 125) {
         i |= j;
      } else if (j <= 65535) {
         i |= 126;
      } else {
         i |= 127;
      }

      this.write(i);
   }

   private void longHolder_4(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) throws IOException {
      int i = lll1li1iil1ii11iliiii1.getPayloadLength();
      if (i > 125) {
         byte[] abyte;
         if (i <= 65535) {
            abyte = new byte[]{(byte)(i >> 8 & 0xFF), (byte)(i & 0xFF)};
         } else {
            abyte = new byte[8];

            for (int j = 7; j >= 0; j--) {
               abyte[j] = (byte)(i & 0xFF);
               i >>>= 8;
            }
         }

         this.write(abyte);
      }
   }

   private void StringHolder_8(GetPayloadLengthHandler lll1li1iil1ii11iliiii1, byte[] abyte) throws IOException {
      byte[] abyte1 = lll1li1iil1ii11iliiii1.EventImpl_5();
      if (abyte1 != null) {
         byte[] abyte2 = new byte[abyte1.length];

         for (int i = 0; i < abyte1.length; i++) {
            abyte2[i] = (byte)((abyte1[i] ^ abyte[i % 4]) & 0xFF);
         }

         this.write(abyte2);
      }
   }
}
