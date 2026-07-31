package zenith;

import java.io.IOException;
import java.util.LinkedList;

class WritingThread extends ThreadImpl {
   private static final int GuiWalk = 0;
   private static final int Nodelay = 1;
   private static final int Nopush = 2;
   private static final int Noslow = 3;
   private static final int Nosweetslow = 1000;
   private final LinkedList<GetPayloadLengthHandler> Noweb = new LinkedList<>();
   private final ZenithInternal044 Shulkerjump;
   private boolean GetSlotIdHandler;
   private GetPayloadLengthHandler BlockHolder;
   private boolean Speed;
   private boolean Spider;

   public WritingThread(GetSocketHandler i1ii1il1i1ll11il1i1lli11) {
      super("WritingThread", i1ii1il1i1ll11il1i1lli11, ZenithInternal072.BlockPosHolder);
      this.Shulkerjump = i1ii1il1i1ll11il1i1lli11.EventImpl_4();
   }

   @Override
   public void byteHolder() {
      try {
         this.GetPayloadLengthHandler();
      } catch (Throwable throwable) {
         ZenithException ilii1lii1liiill = new ZenithException(
            ZenithInternal148.Cheststealer, "An uncaught throwable was detected in the writing thread: " + throwable.getMessage(), throwable
         );
         ListHolder_6 illlll11i11i1illi1l1ii1i111 = this.Castlefly.ZenithInternal127();
         illlll11i11i1illi1l1ii1i111.EventTarget(ilii1lii1liiill);
         illlll11i11i1illi1l1ii1i111.ZenithInternal095(ilii1lii1liiill);
      }

      synchronized (this) {
         this.Spider = true;
         this.notifyAll();
      }

      this.ZenithInternal121();
   }

   private void GetPayloadLengthHandler() {
      this.Castlefly.EventImpl_17();

      while (true) {
         int i = this.StringHolder_18();
         if (i == 1) {
            break;
         }

         if (i == 3) {
            this.macros();
         } else if (i != 2) {
            try {
               this.hasTimeElapsed(false);
            } catch (ZenithException ilii1lii1liiill1) {
               break;
            }
         }
      }

      try {
         this.hasTimeElapsed(true);
      } catch (ZenithException ilii1lii1liiill) {
      }
   }

   public void CreateGsonHandler() {
      synchronized (this) {
         this.GetSlotIdHandler = true;
         this.notifyAll();
      }
   }

   public boolean ZenithInternal045(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      synchronized (this) {
         while (true) {
            if (this.Spider) {
               return false;
            }

            if (this.GetSlotIdHandler || this.BlockHolder != null || lll1li1iil1ii11iliiii1.EventImpl_28()) {
               break;
            }

            int i = this.Castlefly.EventImpl_6();
            if (i == 0 || this.Noweb.size() < i) {
               break;
            }

            try {
               this.wait();
            } catch (InterruptedException interruptedexception) {
            }
         }

         if (ZenithInternal044(lll1li1iil1ii11iliiii1)) {
            this.permessagedeflate(lll1li1iil1ii11iliiii1);
         } else {
            this.Noweb.addLast(lll1li1iil1ii11iliiii1);
         }

         this.notifyAll();
         return true;
      }
   }

   private static boolean ZenithInternal044(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      return lll1li1iil1ii11iliiii1.EventImpl_18() || lll1li1iil1ii11iliiii1.floatHolder_2();
   }

   private void permessagedeflate(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      int i = 0;

      for (GetPayloadLengthHandler lll1li1iil1ii11iliiii1x : this.Noweb) {
         if (!ZenithInternal044(lll1li1iil1ii11iliiii1x)) {
            break;
         }

         i++;
      }

      this.Noweb.add(i, lll1li1iil1ii11iliiii1x);
   }

   public void TypeHolder() {
      synchronized (this) {
         this.Speed = true;
         this.notifyAll();
      }
   }

   private void macros() {
      try {
         this.flush();
      } catch (IOException ioexception) {
      }
   }

   private void flush() throws IOException {
      this.Castlefly.GetSlotIdHandler().flush();
   }

   private int StringHolder_18() {
      synchronized (this) {
         if (this.GetSlotIdHandler) {
            return 1;
         } else if (this.BlockHolder != null) {
            return 1;
         } else {
            if (this.Noweb.size() == 0) {
               if (this.Speed) {
                  this.Speed = false;
                  return 3;
               }

               try {
                  this.wait();
               } catch (InterruptedException interruptedexception) {
               }
            }

            if (this.GetSlotIdHandler) {
               return 1;
            } else if (this.Noweb.size() == 0) {
               if (this.Speed) {
                  this.Speed = false;
                  return 3;
               } else {
                  return 2;
               }
            } else {
               return 0;
            }
         }
      }
   }

   private void longHolder_5(boolean flag) throws ZenithException {
      long i = System.currentTimeMillis();

      while (true) {
         GetPayloadLengthHandler lll1li1iil1ii11iliiii1;
         synchronized (this) {
            lll1li1iil1ii11iliiii1 = this.Noweb.poll();
            this.notifyAll();
            if (lll1li1iil1ii11iliiii1 == null) {
               break;
            }
         }

         this.StringHolder(lll1li1iil1ii11iliiii1);
         if (lll1li1iil1ii11iliiii1.EventImpl_18() || lll1li1iil1ii11iliiii1.floatHolder_2()) {
            this.ZenithInternal130();
            i = System.currentTimeMillis();
         } else if (this.ZenithInternal042(flag)) {
            i = this.ZenithInternal028(i);
         }
      }

      if (this.ZenithInternal042(flag)) {
         this.ZenithInternal130();
      }
   }

   private boolean ZenithInternal042(boolean flag) {
      return flag || this.Castlefly.ZenithInternal024() || this.Speed || this.BlockHolder != null;
   }

   private long ZenithInternal028(long i) throws ZenithException {
      long j = System.currentTimeMillis();
      if (1000L < j - i) {
         this.ZenithInternal130();
         return j;
      } else {
         return i;
      }
   }

   private void ZenithInternal130() throws ZenithException {
      try {
         this.flush();
         synchronized (this) {
            this.Speed = false;
         }
      } catch (IOException ioexception) {
         ZenithException ilii1lii1liiill = new ZenithException(
            ZenithInternal148.Triggerbot, "Flushing frames to the server failed: " + ioexception.getMessage(), ioexception
         );
         ListHolder_6 illlll11i11i1illi1l1ii1i111 = this.Castlefly.ZenithInternal127();
         illlll11i11i1illi1l1ii1i111.EventTarget(ilii1lii1liiill);
         illlll11i11i1illi1l1ii1i111.EventBus(ilii1lii1liiill, null);
         throw ilii1lii1liiill;
      }
   }

   private void StringHolder(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) throws ZenithException {
      lll1li1iil1ii11iliiii1 = GetPayloadLengthHandler.StringHolder_8(lll1li1iil1ii11iliiii1, this.Shulkerjump);
      this.Castlefly.ZenithInternal127().EventImpl_21(lll1li1iil1ii11iliiii1);
      boolean flag = false;
      if (this.BlockHolder != null) {
         flag = true;
      } else if (lll1li1iil1ii11iliiii1.booleanHolder_4()) {
         this.BlockHolder = lll1li1iil1ii11iliiii1;
      }

      if (flag) {
         this.Castlefly.ZenithInternal127().byteHolder_2(lll1li1iil1ii11iliiii1);
      } else {
         if (lll1li1iil1ii11iliiii1.booleanHolder_4()) {
            this.GetServerHandler();
         }

         try {
            this.Castlefly.GetSlotIdHandler().SecureRandomHolder_2(lll1li1iil1ii11iliiii1);
         } catch (IOException ioexception) {
            ZenithException ilii1lii1liiill = new ZenithException(
               ZenithInternal148.Targetpearl, "An I/O error occurred when a frame was tried to be sent: " + ioexception.getMessage(), ioexception
            );
            ListHolder_6 illlll11i11i1illi1l1ii1i111 = this.Castlefly.ZenithInternal127();
            illlll11i11i1illi1l1ii1i111.EventTarget(ilii1lii1liiill);
            illlll11i11i1illi1l1ii1i111.EventBus(ilii1lii1liiill, lll1li1iil1ii11iliiii1);
            throw ilii1lii1liiill;
         }

         this.Castlefly.ZenithInternal127().EventImpl_13(lll1li1iil1ii11iliiii1);
      }
   }

   private void GetServerHandler() {
      ZenithInternal086 l1iiliili1iiii1l1i1li = this.Castlefly.BlockHolder();
      boolean flag = false;
      synchronized (l1iiliili1iiii1l1i1li) {
         ZenithInternal033 ii1iili11i1ililliiiiii111lll1i = l1iiliili1iiii1l1i1li.StringHolder_6();
         if (ii1iili11i1ililliiiiii111lll1i != ZenithInternal033.Elytrafly
            && ii1iili11i1ililliiiiii111lll1i != ZenithInternal033.Elytramotion) {
            l1iiliili1iiii1l1i1li.StringHolder_8(ZenithInternal085$Helper.StringHolder_31);
            flag = true;
         }
      }

      if (flag) {
         this.Castlefly.ZenithInternal127().StringHolder_8(ZenithInternal033.Elytrafly);
      }
   }

   private void ZenithInternal121() {
      this.Castlefly.ListHolder_6(this.BlockHolder);
   }
}
