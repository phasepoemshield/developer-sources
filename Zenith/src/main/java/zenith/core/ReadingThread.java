package zenith;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

class ReadingThread extends ThreadImpl {
   private boolean GetSlotIdHandler;
   private GetPayloadLengthHandler BlockHolder;
   private List<GetPayloadLengthHandler> ZenithInternal127 = new ArrayList<>();
   private final ZenithInternal044 EventImpl_14;
   private Object EventImpl_2 = new Object();
   private Timer EventImpl_17;
   private TimerTaskImpl$Helper_2 EventImpl_29;
   private long EventImpl_26;
   private boolean EntityHolder;

   public ReadingThread(GetSocketHandler i1ii1il1i1ll11il1i1lli11) {
      super("ReadingThread", i1ii1il1i1ll11il1i1lli11, ZenithInternal072.ZenithInternal071);
      this.EventImpl_14 = i1ii1il1i1ll11il1i1lli11.EventImpl_4();
   }

   @Override
   public void byteHolder() {
      try {
         this.GetPayloadLengthHandler();
      } catch (Throwable throwable) {
         ZenithException ilii1lii1liiill = new ZenithException(
            ZenithInternal148.Bowaimbot, "An uncaught throwable was detected in the reading thread: " + throwable.getMessage(), throwable
         );
         ListHolder_6 illlll11i11i1illi1l1ii1i111 = this.Castlefly.ZenithInternal127();
         illlll11i11i1illi1l1ii1i111.EventTarget(ilii1lii1liiill);
         illlll11i11i1illi1l1ii1i111.ZenithInternal095(ilii1lii1liiill);
      }

      this.ZenithInternal121();
   }

   private void GetPayloadLengthHandler() {
      this.Castlefly.EventImpl_2();

      boolean flag;
      do {
         synchronized (this) {
            if (this.GetSlotIdHandler) {
               break;
            }
         }

         GetPayloadLengthHandler lll1li1iil1ii11iliiii1 = this.FilterInputStreamImpl();
         if (lll1li1iil1ii11iliiii1 == null) {
            break;
         }

         flag = this.StringHolder_19(lll1li1iil1ii11iliiii1);
      } while (flag);

      this.ZenithInternal123();
      this.ThreadImpl();
   }

   void EventBus(long i) {
      synchronized (this) {
         if (this.GetSlotIdHandler) {
            return;
         }

         this.GetSlotIdHandler = true;
      }

      this.interrupt();
      this.EventImpl_26 = i;
      this.BufferedOutputStreamImpl();
   }

   private void StringHolder_8(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      this.Castlefly.ZenithInternal127().StringHolder_8(lll1li1iil1ii11iliiii1);
   }

   private void EventBus(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      this.Castlefly.ZenithInternal127().EventBus(lll1li1iil1ii11iliiii1);
   }

   private void EventTarget(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      this.Castlefly.ZenithInternal127().EventTarget(lll1li1iil1ii11iliiii1);
   }

   private void ZenithInternal095(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      this.Castlefly.ZenithInternal127().ZenithInternal095(lll1li1iil1ii11iliiii1);
   }

   private void Event(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      this.Castlefly.ZenithInternal127().Event(lll1li1iil1ii11iliiii1);
   }

   private void EventImpl_24(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      this.Castlefly.ZenithInternal127().EventImpl_24(lll1li1iil1ii11iliiii1);
   }

   private void ZenithInternal028(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      this.Castlefly.ZenithInternal127().ZenithInternal028(lll1li1iil1ii11iliiii1);
   }

   private void ZenithInternal095(byte[] abyte) {
      if (this.Castlefly.FileHolder_2()) {
         this.Castlefly.ZenithInternal127().ZenithInternal095(abyte);
      } else {
         try {
            String s = SecureRandomHolder_2.EventImpl_24(abyte);
            this.ZenithInternal128(s);
         } catch (Throwable throwable) {
            ZenithException ilii1lii1liiill = new ZenithException(
               ZenithInternal148.Autoweb, "Failed to convert payload data into a string: " + throwable.getMessage(), throwable
            );
            this.EventTarget(ilii1lii1liiill);
            this.EventBus(ilii1lii1liiill, abyte);
         }
      }
   }

   private void ZenithInternal128(String s) {
      this.Castlefly.ZenithInternal127().ZenithInternal128(s);
   }

   private void Event(byte[] abyte) {
      this.Castlefly.ZenithInternal127().Event(abyte);
   }

   private void EventTarget(ZenithException ilii1lii1liiill) {
      this.Castlefly.ZenithInternal127().EventTarget(ilii1lii1liiill);
   }

   private void StringHolder_8(ZenithException ilii1lii1liiill, GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      this.Castlefly.ZenithInternal127().StringHolder_8(ilii1lii1liiill, lll1li1iil1ii11iliiii1);
   }

   private void StringHolder_8(ZenithException ilii1lii1liiill, List<GetPayloadLengthHandler> list) {
      this.Castlefly.ZenithInternal127().StringHolder_8(ilii1lii1liiill, list);
   }

   private void StringHolder_8(ZenithException ilii1lii1liiill, byte[] abyte) {
      this.Castlefly.ZenithInternal127().StringHolder_8(ilii1lii1liiill, abyte);
   }

   private void EventBus(ZenithException ilii1lii1liiill, byte[] abyte) {
      this.Castlefly.ZenithInternal127().EventBus(ilii1lii1liiill, abyte);
   }

   private GetPayloadLengthHandler FilterInputStreamImpl() {
      GetPayloadLengthHandler lll1li1iil1ii11iliiii1x = null;
      Object object = null;

      try {
         lll1li1iil1ii11iliiii1x = this.Castlefly.EventImpl_32().FilterInputStreamImpl();
         this.byteHolder(lll1li1iil1ii11iliiii1x);
         return lll1li1iil1ii11iliiii1x;
      } catch (InterruptedIOException interruptedioexception) {
         if (this.GetSlotIdHandler) {
            return null;
         }

         object = new ZenithException(
            ZenithInternal148.Reach,
            "Interruption occurred while a frame was being read from the web socket: " + interruptedioexception.getMessage(),
            interruptedioexception
         );
      } catch (IOException ioexception) {
         if (this.GetSlotIdHandler && this.isInterrupted()) {
            return null;
         }

         object = new ZenithException(
            ZenithInternal148.Rotationrecorder, "An I/O error occurred while a frame was being read from the web socket: " + ioexception.getMessage(), ioexception
         );
      } catch (ZenithException ilii1lii1liiill) {
         object = ilii1lii1liiill;
      }

      boolean flag = true;
      if (object instanceof longHolder_7) {
         this.EntityHolder = true;
         if (this.Castlefly.IsPriorityHandler()) {
            flag = false;
         }
      }

      if (flag) {
         this.EventTarget((ZenithException)object);
         this.StringHolder_8((ZenithException)object, lll1li1iil1ii11iliiii1x);
      }

      GetPayloadLengthHandler lll1li1iil1ii11iliiii1x = this.Event((ZenithException)object);
      this.Castlefly.longHolder_3(lll1li1iil1ii11iliiii1x);
      return null;
   }

   private void byteHolder(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) throws ZenithException {
      this.StringHolder_4(lll1li1iil1ii11iliiii1);
      this.hasTimeElapsed(lll1li1iil1ii11iliiii1);
      this.ZenithInternal042(lll1li1iil1ii11iliiii1);
      this.ZenithInternal101(lll1li1iil1ii11iliiii1);
      this.ZenithInternal084(lll1li1iil1ii11iliiii1);
   }

   private void StringHolder_4(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) throws ZenithException {
      if (!this.Castlefly.ZenithInternal100()) {
         this.ZenithInternal128(lll1li1iil1ii11iliiii1);
         this.ConnectThread(lll1li1iil1ii11iliiii1);
         this.CallableImpl(lll1li1iil1ii11iliiii1);
      }
   }

   private void ZenithInternal128(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) throws ZenithException {
      if (this.EventImpl_14 != null) {
         boolean flag = this.ByteBufferHolder_2(lll1li1iil1ii11iliiii1);
         if (flag) {
            return;
         }
      }

      if (lll1li1iil1ii11iliiii1.EventImpl_8()) {
         throw new ZenithException(ZenithInternal148.Autoauth, "The RSV1 bit of a frame is set unexpectedly.");
      }
   }

   private boolean ByteBufferHolder_2(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) throws ZenithException {
      return lll1li1iil1ii11iliiii1.EventImpl_9() || lll1li1iil1ii11iliiii1.floatHolder_10();
   }

   private void ConnectThread(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) throws ZenithException {
      if (lll1li1iil1ii11iliiii1.ZenithInternal078()) {
         throw new ZenithException(ZenithInternal148.Autoauth, "The RSV2 bit of a frame is set unexpectedly.");
      }
   }

   private void CallableImpl(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) throws ZenithException {
      if (lll1li1iil1ii11iliiii1.booleanHolder_3()) {
         throw new ZenithException(ZenithInternal148.Autoauth, "The RSV3 bit of a frame is set unexpectedly.");
      }
   }

   private void longHolder_5(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) throws ZenithException {
      switch (lll1li1iil1ii11iliiii1.ZenithInternal025()) {
         case 0:
         case 1:
         case 2:
         case 8:
         case 9:
         case 10:
            return;
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         default:
            if (!this.Castlefly.ZenithInternal100()) {
               throw new ZenithException(
                  ZenithInternal148.Autoduels,
                  "A frame has an unknown opcode: 0x" + Integer.toHexString(lll1li1iil1ii11iliiii1.ZenithInternal025())
               );
            }
      }
   }

   private void ZenithInternal042(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) throws ZenithException {
      if (lll1li1iil1ii11iliiii1.EventImpl_12()) {
         throw new ZenithException(ZenithInternal148.Autocraft, "A frame from the server is masked.");
      }
   }

   private void ZenithInternal101(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) throws ZenithException {
      if (lll1li1iil1ii11iliiii1.EventImpl_28()) {
         if (!lll1li1iil1ii11iliiii1.EventImpl_20()) {
            throw new ZenithException(ZenithInternal148.Autoleave, "A control frame is fragmented.");
         }
      } else {
         boolean flag = this.ZenithInternal127.size() != 0;
         if (lll1li1iil1ii11iliiii1.EventImpl_22()) {
            if (!flag) {
               throw new ZenithException(
                  ZenithInternal148.Autorespawn, "A continuation frame was detected although a continuation had not started."
               );
            }
         } else if (flag) {
            throw new ZenithException(
               ZenithInternal148.Autoinventory, "A non-control frame was detected although the existing continuation had not been closed."
            );
         }
      }
   }

   private void ZenithInternal084(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) throws ZenithException {
      if (lll1li1iil1ii11iliiii1.EventImpl_28()) {
         byte[] abyte = lll1li1iil1ii11iliiii1.EventImpl_5();
         if (abyte != null) {
            if (125 < abyte.length) {
               throw new ZenithException(ZenithInternal148.Autotool, "The payload size of a control frame exceeds the maximum size (125 bytes): " + abyte.length);
            }
         }
      }
   }

   private GetPayloadLengthHandler Event(ZenithException ilii1lii1liiill) {
      short short1;
      switch (ilii1lii1liiill.EventImpl()) {
         case Blink:
         case Criticals:
         case Itemscroller:
            short1 = 1002;
            break;
         case Fakelag:
         case Offhandmanager:
            short1 = 1009;
            break;
         case Autoaccept:
         case Autoauth:
         case Autoduels:
         case Autocraft:
         case Autoleave:
         case Autorespawn:
         case Autoinventory:
         case Autotool:
            short1 = 1002;
            break;
         case Reach:
         case Rotationrecorder:
            short1 = 1008;
            break;
         default:
            short1 = 1008;
      }

      return GetPayloadLengthHandler.ZenithInternal095(short1, ilii1lii1liiill.getMessage());
   }

   private boolean StringHolder_19(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      this.StringHolder_8(lll1li1iil1ii11iliiii1);
      switch (lll1li1iil1ii11iliiii1.ZenithInternal025()) {
         case 0:
            return this.ZenithInternal061(lll1li1iil1ii11iliiii1);
         case 1:
            return this.ZenithInternal064(lll1li1iil1ii11iliiii1);
         case 2:
            return this.ZenithInternal021(lll1li1iil1ii11iliiii1);
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         default:
            return true;
         case 8:
            return this.ZenithException_2(lll1li1iil1ii11iliiii1);
         case 9:
            return this.ClearHeadersHandler(lll1li1iil1ii11iliiii1);
         case 10:
            return this.StringHolder_5(lll1li1iil1ii11iliiii1);
      }
   }

   private boolean ZenithInternal061(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      this.EventBus(lll1li1iil1ii11iliiii1);
      this.ZenithInternal127.add(lll1li1iil1ii11iliiii1);
      if (!lll1li1iil1ii11iliiii1.EventImpl_20()) {
         return true;
      } else {
         byte[] abyte = this.Event(this.ZenithInternal127);
         if (abyte == null) {
            return false;
         } else {
            if (this.ZenithInternal127.get(0).EventImpl_9()) {
               this.ZenithInternal095(abyte);
            } else {
               this.Event(abyte);
            }

            this.ZenithInternal127.clear();
            return true;
         }
      }
   }

   private byte[] Event(List<GetPayloadLengthHandler> list) {
      byte[] abyte = this.EventImpl_24(this.ZenithInternal127);
      if (abyte == null) {
         return null;
      } else {
         if (this.EventImpl_14 != null && ((GetPayloadLengthHandler)list.get(0)).EventImpl_8()) {
            abyte = this.ZenithInternal028(abyte);
         }

         return abyte;
      }
   }

   private byte[] EventImpl_24(List<GetPayloadLengthHandler> list) {
      Object object;
      try {
         ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();

         for (GetPayloadLengthHandler lll1li1iil1ii11iliiii1 : list) {
            byte[] abyte = lll1li1iil1ii11iliiii1.EventImpl_5();
            if (abyte != null && abyte.length != 0) {
               bytearrayoutputstream.write(abyte);
            }
         }

         return bytearrayoutputstream.toByteArray();
      } catch (IOException ioexception) {
         object = ioexception;
      } catch (OutOfMemoryError outofmemoryerror) {
         object = outofmemoryerror;
      }

      ZenithException ilii1lii1liiill = new ZenithException(
         ZenithInternal148.Autotrap, "Failed to concatenate payloads of multiple frames to construct a message: " + object.getMessage(), (Throwable)object
      );
      this.EventTarget(ilii1lii1liiill);
      this.StringHolder_8(ilii1lii1liiill, list);
      GetPayloadLengthHandler lll1li1iil1ii11iliiii1x = GetPayloadLengthHandler.ZenithInternal095(1009, ilii1lii1liiill.getMessage());
      this.Castlefly.longHolder_3(lll1li1iil1ii11iliiii1x);
      return null;
   }

   private byte[] FinishThread(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      byte[] abyte = lll1li1iil1ii11iliiii1.EventImpl_5();
      if (this.EventImpl_14 != null && lll1li1iil1ii11iliiii1.EventImpl_8()) {
         abyte = this.ZenithInternal028(abyte);
      }

      return abyte;
   }

   private byte[] ZenithInternal028(byte[] abyte) {
      try {
         return this.EventImpl_14.ZenithInternal028(abyte);
      } catch (ZenithException ilii1lii1liiill) {
         this.EventTarget(ilii1lii1liiill);
         this.StringHolder_8(ilii1lii1liiill, abyte);
         GetPayloadLengthHandler lll1li1iil1ii11iliiii1 = GetPayloadLengthHandler.ZenithInternal095(1003, ilii1lii1liiill.getMessage());
         this.Castlefly.longHolder_3(lll1li1iil1ii11iliiii1);
         return null;
      }
   }

   private boolean ZenithInternal064(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      this.EventTarget(lll1li1iil1ii11iliiii1);
      if (!lll1li1iil1ii11iliiii1.EventImpl_20()) {
         this.ZenithInternal127.add(lll1li1iil1ii11iliiii1);
         return true;
      } else {
         byte[] abyte = this.FinishThread(lll1li1iil1ii11iliiii1);
         this.ZenithInternal095(abyte);
         return true;
      }
   }

   private boolean ZenithInternal021(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      this.ZenithInternal095(lll1li1iil1ii11iliiii1);
      if (!lll1li1iil1ii11iliiii1.EventImpl_20()) {
         this.ZenithInternal127.add(lll1li1iil1ii11iliiii1);
         return true;
      } else {
         byte[] abyte = this.FinishThread(lll1li1iil1ii11iliiii1);
         this.Event(abyte);
         return true;
      }
   }

   private boolean ZenithException_2(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      ZenithInternal086 l1iiliili1iiii1l1i1li = this.Castlefly.BlockHolder();
      this.BlockHolder = lll1li1iil1ii11iliiii1;
      boolean flag = false;
      synchronized (l1iiliili1iiii1l1i1li) {
         ZenithInternal033 ii1iili11i1ililliiiiii111lll1i = l1iiliili1iiii1l1i1li.StringHolder_6();
         if (ii1iili11i1ililliiiiii111lll1i != ZenithInternal033.Elytrafly
            && ii1iili11i1ililliiiiii111lll1i != ZenithInternal033.Elytramotion) {
            l1iiliili1iiii1l1i1li.StringHolder_8(ZenithInternal085$Helper.FileHolder);
            this.Castlefly.longHolder_3(lll1li1iil1ii11iliiii1);
            flag = true;
         }
      }

      if (flag) {
         this.Castlefly.ZenithInternal127().StringHolder_8(ZenithInternal033.Elytrafly);
      }

      this.Event(lll1li1iil1ii11iliiii1);
      return false;
   }

   private boolean ClearHeadersHandler(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      this.EventImpl_24(lll1li1iil1ii11iliiii1x);
      GetPayloadLengthHandler lll1li1iil1ii11iliiii1x = GetPayloadLengthHandler.ZenithInternal101(lll1li1iil1ii11iliiii1x.EventImpl_5());
      this.Castlefly.longHolder_3(lll1li1iil1ii11iliiii1x);
      return true;
   }

   private boolean StringHolder_5(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      this.ZenithInternal028(lll1li1iil1ii11iliiii1);
      return true;
   }

   private void ZenithInternal123() {
      if (!this.EntityHolder) {
         if (this.BlockHolder == null) {
            Object object = null;
            this.BufferedOutputStreamImpl();

            do {
               try {
                  object = this.Castlefly.EventImpl_32().FilterInputStreamImpl();
               } catch (Throwable throwable) {
                  break;
               }

               if (((GetPayloadLengthHandler)object).booleanHolder_4()) {
                  this.BlockHolder = (GetPayloadLengthHandler)object;
                  break;
               }
            } while (!this.isInterrupted());
         }
      }
   }

   private void ZenithInternal121() {
      this.Castlefly.longHolder_6(this.BlockHolder);
   }

   private void BufferedOutputStreamImpl() {
      synchronized (this.EventImpl_2) {
         this.WritingThread();
         this.ZenithInternal033();
      }
   }

   private void ZenithInternal033() {
      this.EventImpl_29 = new TimerTaskImpl$Helper_2(this, null);
      this.EventImpl_17 = new Timer("ReadingThreadCloseTimer");
      this.EventImpl_17.schedule(this.EventImpl_29, this.EventImpl_26);
   }

   private void ThreadImpl() {
      synchronized (this.EventImpl_2) {
         this.WritingThread();
      }
   }

   private void WritingThread() {
      if (this.EventImpl_17 != null) {
         this.EventImpl_17.cancel();
         this.EventImpl_17 = null;
      }

      if (this.EventImpl_29 != null) {
         this.EventImpl_29.cancel();
         this.EventImpl_29 = null;
      }
   }
}
