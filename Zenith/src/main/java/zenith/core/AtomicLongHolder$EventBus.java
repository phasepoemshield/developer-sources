package zenith;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongHolder$EventBus {
   private static final AtomicLong l1lIlIl1I1 = new AtomicLong(1L);
   private final long l1lI1Ill11lIII1IIlI1 = l1lIlIl1I1.getAndIncrement();
   private final Class<?> lllIII1IIl111l111lI;
   private final Queue<IllllI1lIIIIl1I1lll111$EventListener<?>> lI1llI1lII1l11I1I = new LinkedList<>();
   private final LinkedList<IllllI1lIIIIl1I1lll111$EventListener<?>> llIIl1ll1l1 = new LinkedList<>();
   private int Il1IIlI11I = 0;
   private int IlII1Ill = Integer.MAX_VALUE;
   private int I1l111I11lIII11 = 0;

   public AtomicLongHolder$EventBus() {
      this.lllIII1IIl111l111lI = LoggerHolder.class;
   }

   public AtomicLongHolder$EventBus(Class<?> oclass) {
      this.lllIII1IIl111l111lI = oclass;
   }

   public AtomicLongHolder$EventBus longHolder_4(int i) {
      this.IlII1Ill = Math.max(1, i);
      LoggerHolder.lII11l1II11lllI111I1l1I1l1.finest(this.ListHolder_2() + " set maxIdleTicks=" + this.IlII1Ill);
      return this;
   }

   public <E> AtomicLongHolder$EventBus StringHolder_8(
      Class<E> oclass, IAccept$EventBus$EventBus<E> illlli1liiiil1i1lll111$l1i1illlili$l1i1illlili
   ) {
      return this.StringHolder_8(oclass, illlli1liiiil1i1lll111$l1i1illlili$l1i1illlili, 0);
   }

   public <E> AtomicLongHolder$EventBus StringHolder_8(
      Class<E> oclass, IAccept$EventBus$EventBus<E> illlli1liiiil1i1lll111$l1i1illlili$l1i1illlili, int i
   ) {
      IllllI1lIIIIl1I1lll111$EventListener illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil = new IllllI1lIIIIl1I1lll111$EventListener(
         oclass, illlli1liiiil1i1lll111$l1i1illlili$l1i1illlili, this.lI1llI1lII1l11I1I.size() + 1, false, i
      );
      if (i > this.StringHolder_28()) {
         LinkedList linkedlist = (LinkedList)this.lI1llI1lII1l11I1I;
         linkedlist.addFirst(illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil);
      } else {
         this.lI1llI1lII1l11I1I.add(illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil);
      }

      LoggerHolder.lII11l1II11lllI111I1l1I1l1
         .finest(
            this.ListHolder_2()
               + " scheduled step#"
               + illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil.I1lll1IlllI1l1IlIl11ll11
               + " for event="
               + oclass.getSimpleName()
         );
      return this;
   }

   private int StringHolder_28() {
      int i = Integer.MIN_VALUE;

      for (IllllI1lIIIIl1I1lll111$EventListener illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil : this.lI1llI1lII1l11I1I) {
         if (illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil.llIII11llIIl111Illl1IIIII > i) {
            i = illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil.llIII11llIIl111Illl1IIIII;
         }
      }

      return i == Integer.MIN_VALUE ? 0 : i;
   }

   public <E> AtomicLongHolder$EventBus EventBus(
      Class<E> oclass, IAccept$EventBus$EventBus<E> illlli1liiiil1i1lll111$l1i1illlili$l1i1illlili
   ) {
      IllllI1lIIIIl1I1lll111$EventListener illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil = new IllllI1lIIIIl1I1lll111$EventListener(
         oclass, illlli1liiiil1i1lll111$l1i1illlili$l1i1illlili, this.llIIl1ll1l1.size() + 1, true, 0
      );
      this.llIIl1ll1l1.add(illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil);
      LoggerHolder.lII11l1II11lllI111I1l1I1l1
         .finest(
            this.ListHolder_2()
               + " scheduled PERSISTENT step#"
               + illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil.I1lll1IlllI1l1IlIl11ll11
               + " for event="
               + oclass.getSimpleName()
         );
      return this;
   }

   public boolean ZenithInternal028(Object object) {
      if (object == null) {
         return false;
      } else {
         IllllI1lIIIIl1I1lll111$EventListener illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil = this.lI1llI1lII1l11I1I.peek();
         if (illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil == null) {
            LoggerHolder.lII11l1II11lllI111I1l1I1l1.info(this.ListHolder_2() + "task COMPLETE.");
            return true;
         } else {
            for (IllllI1lIIIIl1I1lll111$EventListener illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil1 : this.llIIl1ll1l1) {
               if (illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil1.IIIlIII1llI1I1ll11Il1lII.isInstance(object)) {
                  try {
                     illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil1.EventImpl_21(object);
                  } catch (Throwable throwable1) {
                     throwable1.printStackTrace();
                  }
               }
            }

            boolean flag = false;
            if (illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil.IIIlIII1llI1I1ll11Il1lII.isInstance(object)) {
               boolean flag1;
               try {
                  flag1 = illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil.EventImpl_21(object);
               } catch (Throwable throwable) {
                  throwable.printStackTrace();
                  flag1 = true;
               }

               if (flag1) {
                  this.lI1llI1lII1l11I1I.poll();
                  flag = true;
                  LoggerHolder.lII11l1II11lllI111I1l1I1l1
                     .info(
                        this.ListHolder_2()
                           + " step#"
                           + illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil.I1lll1IlllI1l1IlIl11ll11
                           + " DONE size="
                           + this.lI1llI1lII1l11I1I.size()
                     );
               } else {
                  LoggerHolder.lII11l1II11lllI111I1l1I1l1
                     .finest(
                        this.ListHolder_2()
                           + " step#"
                           + illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil.I1lll1IlllI1l1IlIl11ll11
                           + " NOT done"
                     );
               }
            }

            if (flag) {
               this.Il1IIlI11I = 0;
               boolean flag2 = this.lI1llI1lII1l11I1I.isEmpty();
               if (flag2) {
                  LoggerHolder.lII11l1II11lllI111I1l1I1l1.info(this.ListHolder_2() + "TASK COMPLETE.");
               }

               return flag2;
            } else {
               if (this.IlII1Ill != Integer.MAX_VALUE) {
                  this.Il1IIlI11I++;
               }

               if (this.Il1IIlI11I > this.IlII1Ill) {
                  this.lI1llI1lII1l11I1I.clear();
                  this.llIIl1ll1l1.clear();
                  return true;
               } else {
                  return false;
               }
            }
         }
      }
   }

   public boolean MinecraftClientHolder_3() {
      boolean flag = this.lI1llI1lII1l11I1I.isEmpty();
      LoggerHolder.lII11l1II11lllI111I1l1I1l1.finest(this.ListHolder_2() + " isCompleted() -> " + flag);
      return flag;
   }

   private String ListHolder_2() {
      return "[Task#" + this.l1lI1Ill11lIII1IIlI1 + "@" + (this.lllIII1IIl111l111lI != null ? this.lllIII1IIl111l111lI.getSimpleName() : "Unknown") + "]";
   }

   @Override
   public String toString() {
      return "ScriptTask{id="
         + this.l1lI1Ill11lIII1IIlI1
         + ", owner="
         + (this.lllIII1IIl111l111lI != null ? this.lllIII1IIl111l111lI.getSimpleName() : "null")
         + ", stepsLeft="
         + this.lI1llI1lII1l11I1I.size()
         + ", persistent="
         + this.llIIl1ll1l1.size()
         + ", idleTicks="
         + this.Il1IIlI11I
         + "/"
         + this.IlII1Ill
         + ", priority="
         + this.I1l111I11lIII11
         + "}";
   }

   public Class<?> GsonHolder() {
      IllllI1lIIIIl1I1lll111$EventListener illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil = this.lI1llI1lII1l11I1I.peek();
      return illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil == null
         ? null
         : illlli1liiiil1i1lll111$l1i1illlili$ii1il11l111ii11iil.IIIlIII1llI1I1ll11Il1lII;
   }

   public long ZenithInternal152() {
      return this.l1lI1Ill11lIII1IIlI1;
   }

   public Class<?> ZenithInternal092() {
      return this.lllIII1IIl111l111lI;
   }

   public int ll11lIllIlI1IlI1I111111IlIlIll() {
      return this.I1l111I11lIII11;
   }

   public void ZenithInternal045(int i) {
      this.I1l111I11lIII11 = i;
   }
}
