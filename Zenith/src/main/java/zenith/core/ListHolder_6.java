package zenith;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class ListHolder_6 {
   private final GetSocketHandler IReturn;
   private final List<ZenithInternal123> floatHolder_12 = new ArrayList<>();
   private boolean ArrayListHolder_2 = true;
   private List<ZenithInternal123> StringHolder_30;

   public ListHolder_6(GetSocketHandler i1ii1il1i1ll11il1i1lli11) {
      this.IReturn = i1ii1il1i1ll11il1i1lli11;
   }

   public List<ZenithInternal123> SecureRandomHolder_2() {
      return this.floatHolder_12;
   }

   public void StringHolder_8(ZenithInternal123 lil1illiii1li) {
      if (lil1illiii1li != null) {
         synchronized (this.floatHolder_12) {
            this.floatHolder_12.add(lil1illiii1li);
            this.ArrayListHolder_2 = true;
         }
      }
   }

   public void EventTarget(List<ZenithInternal123> list) {
      if (list != null) {
         synchronized (this.floatHolder_12) {
            for (ZenithInternal123 lil1illiii1li : list) {
               if (lil1illiii1li != null) {
                  this.floatHolder_12.add(lil1illiii1li);
                  this.ArrayListHolder_2 = true;
               }
            }
         }
      }
   }

   public void EventBus(ZenithInternal123 lil1illiii1li) {
      if (lil1illiii1li != null) {
         synchronized (this.floatHolder_12) {
            if (this.floatHolder_12.remove(lil1illiii1li)) {
               this.ArrayListHolder_2 = true;
            }
         }
      }
   }

   public void ZenithInternal095(List<ZenithInternal123> list) {
      if (list != null) {
         synchronized (this.floatHolder_12) {
            for (ZenithInternal123 lil1illiii1li : list) {
               if (lil1illiii1li != null && this.floatHolder_12.remove(lil1illiii1li)) {
                  this.ArrayListHolder_2 = true;
               }
            }
         }
      }
   }

   public void longHolder_7() {
      synchronized (this.floatHolder_12) {
         if (this.floatHolder_12.size() != 0) {
            this.floatHolder_12.clear();
            this.StringHolder_30 = null;
            this.ArrayListHolder_2 = true;
         }
      }
   }

   private List<ZenithInternal123> HostnameVerifierImpl() {
      synchronized (this.floatHolder_12) {
         if (!this.ArrayListHolder_2) {
            return this.StringHolder_30;
         } else {
            ArrayList arraylist = new ArrayList(this.floatHolder_12.size());

            for (ZenithInternal123 lil1illiii1li : this.floatHolder_12) {
               arraylist.add(lil1illiii1li);
            }

            this.StringHolder_30 = arraylist;
            this.ArrayListHolder_2 = false;
            return arraylist;
         }
      }
   }

   public void StringHolder_8(ZenithInternal033 ii1iili11i1ililliiiiii111lll1i) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.StringHolder_8(this.IReturn, ii1iili11i1ililliiiiii111lll1i);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void EventBus(Map<String, List<String>> map) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.StringHolder_8(this.IReturn, map);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void EventBus(ZenithException ilii1lii1liiill) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.StringHolder_8(this.IReturn, ilii1lii1liiill);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void StringHolder_8(GetPayloadLengthHandler lll1li1iil1ii11iliiii1, GetPayloadLengthHandler lll1li1iil1ii11iliiii1, boolean flag) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.StringHolder_8(this.IReturn, lll1li1iil1ii11iliiii1x, lll1li1iil1ii11iliiii1, flag);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void StringHolder_8(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.StringHolder_8(this.IReturn, lll1li1iil1ii11iliiii1);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void EventBus(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.EventBus(this.IReturn, lll1li1iil1ii11iliiii1);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void EventTarget(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.EventTarget(this.IReturn, lll1li1iil1ii11iliiii1);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void ZenithInternal095(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.ZenithInternal095(this.IReturn, lll1li1iil1ii11iliiii1);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void Event(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.Event(this.IReturn, lll1li1iil1ii11iliiii1);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void EventImpl_24(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.EventImpl_24(this.IReturn, lll1li1iil1ii11iliiii1);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void ZenithInternal028(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.ZenithInternal028(this.IReturn, lll1li1iil1ii11iliiii1);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void ZenithInternal128(String s) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.StringHolder_8(this.IReturn, s);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void ZenithInternal095(byte[] abyte) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.StringHolder_8(this.IReturn, abyte);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void Event(byte[] abyte) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.EventBus(this.IReturn, abyte);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void EventImpl_21(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.EventImpl_21(this.IReturn, lll1li1iil1ii11iliiii1);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void EventImpl_13(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.EventImpl_13(this.IReturn, lll1li1iil1ii11iliiii1);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void byteHolder_2(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.byteHolder_2(this.IReturn, lll1li1iil1ii11iliiii1);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void StringHolder_8(ZenithInternal072 l11il1il1iil, Thread thread) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.StringHolder_8(this.IReturn, l11il1il1iil, thread);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void EventBus(ZenithInternal072 l11il1il1iil, Thread thread) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.EventBus(this.IReturn, l11il1il1iil, thread);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void EventTarget(ZenithInternal072 l11il1il1iil, Thread thread) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.EventTarget(this.IReturn, l11il1il1iil, thread);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void EventTarget(ZenithException ilii1lii1liiill) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.EventBus(this.IReturn, ilii1lii1liiill);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void StringHolder_8(ZenithException ilii1lii1liiill, GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.StringHolder_8(this.IReturn, ilii1lii1liiill, lll1li1iil1ii11iliiii1);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void StringHolder_8(ZenithException ilii1lii1liiill, List<GetPayloadLengthHandler> list) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.StringHolder_8(this.IReturn, ilii1lii1liiill, list);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void StringHolder_8(ZenithException ilii1lii1liiill, byte[] abyte) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.StringHolder_8(this.IReturn, ilii1lii1liiill, abyte);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void EventBus(ZenithException ilii1lii1liiill, byte[] abyte) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.EventBus(this.IReturn, ilii1lii1liiill, abyte);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void EventBus(ZenithException ilii1lii1liiill, GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.EventBus(this.IReturn, ilii1lii1liiill, lll1li1iil1ii11iliiii1);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   public void ZenithInternal095(ZenithException ilii1lii1liiill) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.EventTarget(this.IReturn, ilii1lii1liiill);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }

   private void StringHolder_8(ZenithInternal123 lil1illiii1li, Throwable throwable) {
      try {
         lil1illiii1li.StringHolder_8(this.IReturn, throwable);
      } catch (Throwable throwable1) {
      }
   }

   public void EventBus(String s, List<String[]> list) {
      for (ZenithInternal123 lil1illiii1li : this.HostnameVerifierImpl()) {
         try {
            lil1illiii1li.StringHolder_8(this.IReturn, s, list);
         } catch (Throwable throwable) {
            this.StringHolder_8(lil1illiii1li, throwable);
         }
      }
   }
}
