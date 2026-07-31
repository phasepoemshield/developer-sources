package zenith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetPayloadLengthHandler {
   private boolean IsBindingHandler;
   private boolean StringHolder_29;
   private boolean longHolder_2;
   private boolean StringHolder_14;
   private int ZenithInternal069;
   private boolean AutocraftHolder;
   private byte[] StringHolder_2;

   public boolean EventImpl_20() {
      return this.IsBindingHandler;
   }

   public GetPayloadLengthHandler StringHolder_4(boolean flag) {
      this.IsBindingHandler = flag;
      return this;
   }

   public boolean EventImpl_8() {
      return this.StringHolder_29;
   }

   public GetPayloadLengthHandler ZenithInternal128(boolean flag) {
      this.StringHolder_29 = flag;
      return this;
   }

   public boolean ZenithInternal078() {
      return this.longHolder_2;
   }

   public GetPayloadLengthHandler ByteBufferHolder_2(boolean flag) {
      this.longHolder_2 = flag;
      return this;
   }

   public boolean booleanHolder_3() {
      return this.StringHolder_14;
   }

   public GetPayloadLengthHandler ConnectThread(boolean flag) {
      this.StringHolder_14 = flag;
      return this;
   }

   public int ZenithInternal025() {
      return this.ZenithInternal069;
   }

   public GetPayloadLengthHandler StringHolder_19(int i) {
      this.ZenithInternal069 = i;
      return this;
   }

   public boolean EventImpl_22() {
      return this.ZenithInternal069 == 0;
   }

   public boolean EventImpl_9() {
      return this.ZenithInternal069 == 1;
   }

   public boolean floatHolder_10() {
      return this.ZenithInternal069 == 2;
   }

   public boolean booleanHolder_4() {
      return this.ZenithInternal069 == 8;
   }

   public boolean EventImpl_18() {
      return this.ZenithInternal069 == 9;
   }

   public boolean floatHolder_2() {
      return this.ZenithInternal069 == 10;
   }

   public boolean ZenithInternal136() {
      return 1 <= this.ZenithInternal069 && this.ZenithInternal069 <= 7;
   }

   public boolean EventImpl_28() {
      return 8 <= this.ZenithInternal069 && this.ZenithInternal069 <= 15;
   }

   boolean EventImpl_12() {
      return this.AutocraftHolder;
   }

   GetPayloadLengthHandler CallableImpl(boolean flag) {
      this.AutocraftHolder = flag;
      return this;
   }

   public boolean EventImpl_23() {
      return this.StringHolder_2 != null;
   }

   public int getPayloadLength() {
      return this.StringHolder_2 == null ? 0 : this.StringHolder_2.length;
   }

   public byte[] EventImpl_5() {
      return this.StringHolder_2;
   }

   public String EventImpl_34() {
      return this.StringHolder_2 == null ? null : SecureRandomHolder_2.EventImpl_24(this.StringHolder_2);
   }

   public GetPayloadLengthHandler ConnectThread(byte[] abyte) {
      if (abyte != null && abyte.length == 0) {
         abyte = null;
      }

      this.StringHolder_2 = abyte;
      return this;
   }

   public GetPayloadLengthHandler ZenithInternal056(String s) {
      return s != null && s.length() != 0 ? this.ConnectThread(SecureRandomHolder_2.ByteBufferHolder_2(s)) : this.ConnectThread((byte[])null);
   }

   public GetPayloadLengthHandler EventTarget(int i, String s) {
      byte[] abyte = new byte[]{(byte)(i >> 8 & 0xFF), (byte)(i & 0xFF)};
      if (s != null && s.length() != 0) {
         byte[] abyte1 = SecureRandomHolder_2.ByteBufferHolder_2(s);
         byte[] abyte2 = new byte[2 + abyte1.length];
         System.arraycopy(abyte, 0, abyte2, 0, 2);
         System.arraycopy(abyte1, 0, abyte2, 2, abyte1.length);
         return this.ConnectThread(abyte2);
      } else {
         return this.ConnectThread(abyte);
      }
   }

   public int getCloseCode() {
      return this.StringHolder_2 != null && this.StringHolder_2.length >= 2
         ? (this.StringHolder_2[0] & 0xFF) << 8 | this.StringHolder_2[1] & 0xFF
         : 1005;
   }

   public String ZenithInternal014() {
      return this.StringHolder_2 != null && this.StringHolder_2.length >= 3
         ? SecureRandomHolder_2.EventBus(this.StringHolder_2, 2, this.StringHolder_2.length - 2)
         : null;
   }

   @Override
   public String toString() {
      StringBuilder stringbuilder = new StringBuilder()
         .append("WebSocketFrame(FIN=")
         .append(this.IsBindingHandler ? "1" : "0")
         .append(",RSV1=")
         .append(this.StringHolder_29 ? "1" : "0")
         .append(",RSV2=")
         .append(this.longHolder_2 ? "1" : "0")
         .append(",RSV3=")
         .append(this.StringHolder_14 ? "1" : "0")
         .append(",Opcode=")
         .append(SecureRandomHolder_2.byteHolder_2(this.ZenithInternal069))
         .append(",Length=")
         .append(this.getPayloadLength());
      switch (this.ZenithInternal069) {
         case 1:
            this.ZenithInternal095(stringbuilder);
            break;
         case 2:
            this.EventImpl_24(stringbuilder);
            break;
         case 8:
            this.Event(stringbuilder);
      }

      return stringbuilder.append(")").toString();
   }

   private boolean EventTarget(StringBuilder stringbuilder) {
      stringbuilder.append(",Payload=");
      if (this.StringHolder_2 == null) {
         stringbuilder.append("null");
         return true;
      } else if (this.StringHolder_29) {
         stringbuilder.append("compressed");
         return true;
      } else {
         return false;
      }
   }

   private void ZenithInternal095(StringBuilder stringbuilder) {
      if (!this.EventTarget(stringbuilder)) {
         stringbuilder.append("\"");
         stringbuilder.append(this.EventImpl_34());
         stringbuilder.append("\"");
      }
   }

   private void Event(StringBuilder stringbuilder) {
      stringbuilder.append(",CloseCode=").append(this.getCloseCode()).append(",Reason=");
      String s = this.ZenithInternal014();
      if (s == null) {
         stringbuilder.append("null");
      } else {
         stringbuilder.append("\"").append(s).append("\"");
      }
   }

   private void EventImpl_24(StringBuilder stringbuilder) {
      if (!this.EventTarget(stringbuilder)) {
         for (int i = 0; i < this.StringHolder_2.length; i++) {
            stringbuilder.append(String.format("%02X ", 255 & this.StringHolder_2[i]));
         }

         if (this.StringHolder_2.length != 0) {
            stringbuilder.setLength(stringbuilder.length() - 1);
         }
      }
   }

   public static GetPayloadLengthHandler EventImpl_37() {
      return new GetPayloadLengthHandler().StringHolder_19(0);
   }

   public static GetPayloadLengthHandler CallableImpl(byte[] abyte) {
      return EventImpl_37().ConnectThread(abyte);
   }

   public static GetPayloadLengthHandler GetSocketHandler(String s) {
      return EventImpl_37().ZenithInternal056(s);
   }

   public static GetPayloadLengthHandler ZenithInternal142(String s) {
      return new GetPayloadLengthHandler().StringHolder_4(true).StringHolder_19(1).ZenithInternal056(s);
   }

   public static GetPayloadLengthHandler longHolder_5(byte[] abyte) {
      return new GetPayloadLengthHandler().StringHolder_4(true).StringHolder_19(2).ConnectThread(abyte);
   }

   public static GetPayloadLengthHandler TextHolder_2() {
      return new GetPayloadLengthHandler().StringHolder_4(true).StringHolder_19(8);
   }

   public static GetPayloadLengthHandler ZenithInternal061(int i) {
      return TextHolder_2().EventTarget(i, null);
   }

   public static GetPayloadLengthHandler ZenithInternal095(int i, String s) {
      return TextHolder_2().EventTarget(i, s);
   }

   public static GetPayloadLengthHandler PacketHolder() {
      return new GetPayloadLengthHandler().StringHolder_4(true).StringHolder_19(9);
   }

   public static GetPayloadLengthHandler ZenithInternal042(byte[] abyte) {
      return PacketHolder().ConnectThread(abyte);
   }

   public static GetPayloadLengthHandler ZenithInternal023(String s) {
      return PacketHolder().ZenithInternal056(s);
   }

   public static GetPayloadLengthHandler PacketHolder_2() {
      return new GetPayloadLengthHandler().StringHolder_4(true).StringHolder_19(10);
   }

   public static GetPayloadLengthHandler ZenithInternal101(byte[] abyte) {
      return PacketHolder_2().ConnectThread(abyte);
   }

   public static GetPayloadLengthHandler ZenithInternal148(String s) {
      return PacketHolder_2().ZenithInternal056(s);
   }

   static byte[] StringHolder_8(byte[] abyte, byte[] abyte1) {
      if (abyte != null && abyte.length >= 4 && abyte1 != null) {
         for (int i = 0; i < abyte1.length; i++) {
            abyte1[i] ^= abyte[i % 4];
         }

         return abyte1;
      } else {
         return abyte1;
      }
   }

   static GetPayloadLengthHandler StringHolder_8(GetPayloadLengthHandler lll1li1iil1ii11iliiii1, ZenithInternal044 iil1il1li1lil111lill1llli11ll) {
      if (iil1il1li1lil111lill1llli11ll == null) {
         return lll1li1iil1ii11iliiii1;
      } else if (!lll1li1iil1ii11iliiii1.EventImpl_9() && !lll1li1iil1ii11iliiii1.floatHolder_10()) {
         return lll1li1iil1ii11iliiii1;
      } else if (!lll1li1iil1ii11iliiii1.EventImpl_20()) {
         return lll1li1iil1ii11iliiii1;
      } else if (lll1li1iil1ii11iliiii1.EventImpl_8()) {
         return lll1li1iil1ii11iliiii1;
      } else {
         byte[] abyte = lll1li1iil1ii11iliiii1.EventImpl_5();
         if (abyte != null && abyte.length != 0) {
            byte[] abyte1 = StringHolder_8(abyte, iil1il1li1lil111lill1llli11ll);
            if (abyte.length <= abyte1.length) {
               return lll1li1iil1ii11iliiii1;
            } else {
               lll1li1iil1ii11iliiii1.ConnectThread(abyte1);
               lll1li1iil1ii11iliiii1.ZenithInternal128(true);
               return lll1li1iil1ii11iliiii1;
            }
         } else {
            return lll1li1iil1ii11iliiii1;
         }
      }
   }

   private static byte[] StringHolder_8(byte[] abyte, ZenithInternal044 iil1il1li1lil111lill1llli11ll) {
      try {
         return iil1il1li1lil111lill1llli11ll.EventTarget(abyte);
      } catch (ZenithException ilii1lii1liiill) {
         return abyte;
      }
   }

   static List<GetPayloadLengthHandler> StringHolder_8(
      GetPayloadLengthHandler lll1li1iil1ii11iliiii1, int i, ZenithInternal044 iil1il1li1lil111lill1llli11ll
   ) {
      if (i == 0) {
         return null;
      } else if (lll1li1iil1ii11iliiii1.getPayloadLength() <= i) {
         return null;
      } else {
         if (!lll1li1iil1ii11iliiii1.floatHolder_10() && !lll1li1iil1ii11iliiii1.EventImpl_9()) {
            if (!lll1li1iil1ii11iliiii1.EventImpl_22()) {
               return null;
            }
         } else {
            lll1li1iil1ii11iliiii1 = StringHolder_8(lll1li1iil1ii11iliiii1, iil1il1li1lil111lill1llli11ll);
            if (lll1li1iil1ii11iliiii1.getPayloadLength() <= i) {
               return null;
            }
         }

         return StringHolder_8(lll1li1iil1ii11iliiii1, i);
      }
   }

   private static List<GetPayloadLengthHandler> StringHolder_8(GetPayloadLengthHandler lll1li1iil1ii11iliiii1, int i) {
      byte[] abyte = lll1li1iil1ii11iliiii1.EventImpl_5();
      boolean flag = lll1li1iil1ii11iliiii1.EventImpl_20();
      ArrayList arraylist = new ArrayList();
      byte[] abyte1 = Arrays.copyOf(abyte, i);
      lll1li1iil1ii11iliiii1.StringHolder_4(false).ConnectThread(abyte1);
      arraylist.add(lll1li1iil1ii11iliiii1);

      for (int j = i; j < abyte.length; j += i) {
         int k = Math.min(j + i, abyte.length);
         abyte1 = Arrays.copyOfRange(abyte, j, k);
         GetPayloadLengthHandler lll1li1iil1ii11iliiii1x = CallableImpl(abyte1);
         arraylist.add(lll1li1iil1ii11iliiii1x);
      }

      if (flag) {
         ((GetPayloadLengthHandler)arraylist.get(arraylist.size() - 1)).StringHolder_4(true);
      }

      return arraylist;
   }
}
