package zenith;

import java.nio.Buffer;
import java.nio.ByteBuffer;

class ByteBufferHolder_2 {
   private static final int ClearHeadersHandler = 1024;
   private ByteBuffer StringHolder_5;
   private int longHolder_3;

   public ByteBufferHolder_2(int i) {
      this.StringHolder_5 = ByteBuffer.allocate(i);
      this.longHolder_3 = 0;
   }

   public ByteBufferHolder_2(byte[] abyte) {
      this.StringHolder_5 = ByteBuffer.wrap(abyte);
      this.longHolder_3 = abyte.length;
   }

   public int EventImpl_13() {
      return this.longHolder_3;
   }

   public byte StringHolder_8(int i) throws IndexOutOfBoundsException {
      if (i >= 0 && this.longHolder_3 > i) {
         return this.StringHolder_5.get(i);
      } else {
         throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", i, this.longHolder_3));
      }
   }

   private void EventBus(int i) {
      ByteBuffer bytebuffer = ByteBuffer.allocate(i);
      int j = this.StringHolder_5.position();
      ((Buffer)this.StringHolder_5).position(0);
      bytebuffer.put(this.StringHolder_5);
      ((Buffer)bytebuffer).position(j);
      this.StringHolder_5 = bytebuffer;
   }

   public void EventTarget(int i) {
      if (this.StringHolder_5.capacity() < this.longHolder_3 + 1) {
         this.EventBus(this.longHolder_3 + 1024);
      }

      this.StringHolder_5.put((byte)i);
      this.longHolder_3++;
   }

   public void EventBus(byte[] abyte) {
      if (this.StringHolder_5.capacity() < this.longHolder_3 + abyte.length) {
         this.EventBus(this.longHolder_3 + abyte.length + 1024);
      }

      this.StringHolder_5.put(abyte);
      this.longHolder_3 += abyte.length;
   }

   public void StringHolder_8(byte[] abyte, int i, int j) {
      if (this.StringHolder_5.capacity() < this.longHolder_3 + j) {
         this.EventBus(this.longHolder_3 + j + 1024);
      }

      this.StringHolder_5.put(abyte, i, j);
      this.longHolder_3 += j;
   }

   public void StringHolder_8(ByteBufferHolder_2 liiili1iii1, int i, int j) {
      this.StringHolder_8(liiili1iii1.StringHolder_5.array(), i, j);
   }

   public byte[] byteHolder_2() {
      return this.ZenithInternal095(0);
   }

   public byte[] ZenithInternal095(int i) {
      return this.StringHolder_8(i, this.EventImpl_13());
   }

   public byte[] StringHolder_8(int i, int j) {
      int k = j - i;
      if (k >= 0 && i >= 0 && this.longHolder_3 >= j) {
         byte[] abyte = new byte[k];
         if (k != 0) {
            System.arraycopy(this.StringHolder_5.array(), i, abyte, 0, k);
         }

         return abyte;
      } else {
         throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", i, j, this.longHolder_3));
      }
   }

   public void clear() {
      ((Buffer)this.StringHolder_5).clear();
      ((Buffer)this.StringHolder_5).position(0);
      this.longHolder_3 = 0;
   }

   public void Event(int i) {
      if (this.StringHolder_5.capacity() > i) {
         int j = this.longHolder_3;
         int k = this.longHolder_3 - i;
         byte[] abyte = this.StringHolder_8(k, j);
         this.StringHolder_5 = ByteBuffer.wrap(abyte);
         ((Buffer)this.StringHolder_5).position(abyte.length);
         this.longHolder_3 = abyte.length;
      }
   }

   public boolean EventImpl_24(int i) {
      int j = i / 8;
      int k = i % 8;
      byte b0 = this.StringHolder_8(j);
      return (b0 & 1 << k) != 0;
   }

   public int EventBus(int i, int j) {
      byte b0 = 0;
      byte b1 = 1;

      for (int k = 0; k < j; b1 *= 2) {
         if (this.EventImpl_24(i + k)) {
            b0 += b1;
         }

         k++;
      }

      return b0;
   }

   public int EventTarget(int i, int j) {
      byte b0 = 0;
      byte b1 = 1;

      for (int k = j - 1; 0 <= k; b1 *= 2) {
         if (this.EventImpl_24(i + k)) {
            b0 += b1;
         }

         k--;
      }

      return b0;
   }

   public boolean StringHolder_8(int[] aint) {
      boolean flag = this.EventImpl_24(aint[0]);
      aint[0]++;
      return flag;
   }

   public int StringHolder_8(int[] aint, int i) {
      int j = this.EventBus(aint[0], i);
      aint[0] += i;
      return j;
   }

   public void StringHolder_8(int i, boolean flag) {
      int j = i / 8;
      int k = i % 8;
      int l = this.StringHolder_8(j);
      if (flag) {
         l |= 1 << k;
      } else {
         l &= ~(1 << k);
      }

      this.StringHolder_5.put(j, (byte)l);
   }

   public void ZenithInternal028(int i) {
      this.StringHolder_8(i, false);
   }
}
