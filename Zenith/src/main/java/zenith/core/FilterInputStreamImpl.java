package zenith;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

class FilterInputStreamImpl extends FilterInputStream {
   public FilterInputStreamImpl(InputStream inputstream) {
      super(inputstream);
   }

   public String PacketHolder_3() throws IOException {
      return SecureRandomHolder_2.StringHolder_8(this, "UTF-8");
   }

   public GetPayloadLengthHandler FilterInputStreamImpl() throws IOException, ZenithException {
      byte[] abyte = new byte[8];

      try {
         this.EventBus(abyte, 2);
      } catch (longHolder_6 l1i1li1i11) {
         if (l1i1li1i11.ListHolder_6() == 0) {
            throw new longHolder_7();
         }

         throw l1i1li1i11;
      }

      boolean flag = (abyte[0] & 128) != 0;
      boolean flag1 = (abyte[0] & 64) != 0;
      boolean flag2 = (abyte[0] & 32) != 0;
      boolean flag3 = (abyte[0] & 16) != 0;
      int i = abyte[0] & 15;
      boolean flag4 = (abyte[1] & 128) != 0;
      long j = (long)(abyte[1] & 127);
      if (j == 126L) {
         this.EventBus(abyte, 2);
         j = (long)((abyte[0] & 255) << 8 | abyte[1] & 255);
      } else if (j == 127L) {
         this.EventBus(abyte, 8);
         if ((abyte[0] & 128) != 0) {
            throw new ZenithException(ZenithInternal148.Criticals, "The payload length of a frame is invalid.");
         }

         j = (long)(
            (abyte[0] & 255) << 56
               | (abyte[1] & 255) << 48
               | (abyte[2] & 255) << 40
               | (abyte[3] & 255) << 32
               | (abyte[4] & 255) << 24
               | (abyte[5] & 255) << 16
               | (abyte[6] & 255) << 8
               | abyte[7] & 255
         );
      }

      byte[] abyte1 = null;
      if (flag4) {
         abyte1 = new byte[4];
         this.EventBus(abyte1, 4);
      }

      if (2147483647L < j) {
         this.EventImpl_24(j);
         throw new ZenithException(ZenithInternal148.Fakelag, "The payload length of a frame exceeds the maximum array size in Java.");
      } else {
         byte[] abyte2 = this.StringHolder_8(j, flag4, abyte1);
         return new GetPayloadLengthHandler()
            .StringHolder_4(flag)
            .ZenithInternal128(flag1)
            .ByteBufferHolder_2(flag2)
            .ConnectThread(flag3)
            .StringHolder_19(i)
            .CallableImpl(flag4)
            .ConnectThread(abyte2);
      }
   }

   void EventBus(byte[] abyte, int i) throws IOException, ZenithException {
      int j = 0;

      while (j < i) {
         int k = this.read(abyte, j, i - j);
         if (k <= 0) {
            throw new longHolder_6(i, j);
         }

         j += k;
      }
   }

   private void EventImpl_24(long i) {
      try {
         this.skip(i);
      } catch (IOException ioexception) {
      }
   }

   private byte[] StringHolder_8(long i, boolean flag, byte[] abyte) throws IOException, ZenithException {
      if (i == 0L) {
         return null;
      } else {
         byte[] abyte1;
         try {
            abyte1 = new byte[(int)i];
         } catch (OutOfMemoryError outofmemoryerror) {
            this.EventImpl_24(i);
            throw new ZenithException(
               ZenithInternal148.Offhandmanager,
               "OutOfMemoryError occurred during a trial to allocate a memory area for a frame's payload: " + outofmemoryerror.getMessage(),
               outofmemoryerror
            );
         }

         this.EventBus(abyte1, abyte1.length);
         if (flag) {
            GetPayloadLengthHandler.StringHolder_8(abyte, abyte1);
         }

         return abyte1;
      }
   }
}
