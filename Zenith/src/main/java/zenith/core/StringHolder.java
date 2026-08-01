package zenith;

import java.util.Timer;

abstract class StringHolder {
   private final GetSocketHandler EventImpl_11;
   private String StringHolder_20;
   private Timer doubleHolder_2;
   private boolean EventImpl_19;
   private long KeyEvent;
   private ZenithInternal045 EventImpl_16;

   public StringHolder(GetSocketHandler i1ii1il1i1ll11il1i1lli11, String s, ZenithInternal045 iili11iiiil111lil) {
      this.EventImpl_11 = i1ii1il1i1ll11il1i1lli11;
      this.StringHolder_20 = s;
      this.EventImpl_16 = iili11iiiil111lil;
   }

   public void start() {
      this.StringHolder_8(this.StringHolder_32());
   }

   public void stop() {
      synchronized (this) {
         if (this.doubleHolder_2 != null) {
            this.EventImpl_19 = false;
            this.doubleHolder_2.cancel();
         }
      }
   }

   public long StringHolder_32() {
      synchronized (this) {
         return this.KeyEvent;
      }
   }

   public void StringHolder_8(long i) {
      if (i < 0L) {
         i = 0L;
      }

      synchronized (this) {
         this.KeyEvent = i;
      }

      if (i != 0L) {
         if (this.EventImpl_11.isOpen()) {
            synchronized (this) {
               if (this.doubleHolder_2 == null) {
                  if (this.StringHolder_20 == null) {
                     this.doubleHolder_2 = new Timer();
                  } else {
                     this.doubleHolder_2 = new Timer(this.StringHolder_20);
                  }
               }

               if (!this.EventImpl_19) {
                  this.EventImpl_19 = StringHolder_8(this.doubleHolder_2, new TimerTaskImpl$Helper(this, null), i);
               }
            }
         }
      }
   }

   public ZenithInternal045 StringHolder_12() {
      synchronized (this) {
         return this.EventImpl_16;
      }
   }

   public void StringHolder_8(ZenithInternal045 iili11iiiil111lil) {
      synchronized (this) {
         this.EventImpl_16 = iili11iiiil111lil;
      }
   }

   public String booleanHolder_2() {
      return this.StringHolder_20;
   }

   public void ZenithInternal101(String s) {
      synchronized (this) {
         this.StringHolder_20 = s;
      }
   }

   private void ReadingThread() {
      synchronized (this) {
         if (this.KeyEvent != 0L && this.EventImpl_11.isOpen()) {
            this.EventImpl_11.longHolder_3(this.ConstructorHolder());
            this.EventImpl_19 = StringHolder_8(
               this.doubleHolder_2, new TimerTaskImpl$Helper(this, null), this.KeyEvent
            );
         } else {
            this.EventImpl_19 = false;
         }
      }
   }

   private GetPayloadLengthHandler ConstructorHolder() {
      byte[] abyte = this.SocketFactoryHolder_3();
      return this.byteHolder_2(abyte);
   }

   private byte[] SocketFactoryHolder_3() {
      if (this.EventImpl_16 == null) {
         return null;
      } else {
         try {
            return this.EventImpl_16.ZenithInternal128();
         } catch (Throwable throwable) {
            return null;
         }
      }
   }

   private static boolean StringHolder_8(Timer timer, TimerTaskImpl$Helper i111iill11l$ii1il11l111ii11iil, long i) {
      try {
         timer.schedule(i111iill11l$ii1il11l111ii11iil, i);
         return true;
      } catch (RuntimeException runtimeexception) {
         return false;
      }
   }

   protected abstract GetPayloadLengthHandler byteHolder_2(byte[] abyte);
}
