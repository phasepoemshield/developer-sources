package zenith;

import java.util.LinkedList;
import java.util.logging.Logger;

public class LoggerHolder {
   private static final Logger lII11l1II11lllI111I1l1I1l1 = Logger.getLogger("zenith.LoggerHolder");
   private final LinkedList<AtomicLongHolder$EventBus> I1I11111I1lIll1 = new LinkedList<>();

   public LoggerHolder() {
      EventBus.StringHolder_8(this);
      new ThreadHolder$Helper().start();
   }

   public void EventImpl_24(Object object) {
      if (object != null) {
         AtomicLongHolder$EventBus illlli1liiiil1i1lll111$l1i1illlili;
         synchronized (this.I1I11111I1lIll1) {
            illlli1liiiil1i1lll111$l1i1illlili = this.I1I11111I1lIll1.peek();
         }

         if (illlli1liiiil1i1lll111$l1i1illlili != null) {
            boolean flag = true;

            try {
               flag = illlli1liiiil1i1lll111$l1i1illlili.ZenithInternal028(object);
            } catch (Throwable throwable) {
               flag = false;
            }

            if (flag) {
               synchronized (this.I1I11111I1lIll1) {
                  this.I1I11111I1lIll1.poll();
               }
            }
         }
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl_29 ll1i1ii1il) {
      this.EventImpl_24(ll1i1ii1il);
   }

   @EventTarget
   public void StringHolder_8(EventImpl_30 ll1iil11ii) {
      this.EventImpl_24(ll1iil11ii);
   }

   @EventTarget(
      ZenithInternal095 = 4
   )
   public void StringHolder_8(PlayerInputHolder ili11i1il11) {
      this.EventImpl_24(ili11i1il11);
   }

   @EventTarget(
      ZenithInternal095 = 0
   )
   public void EventTarget(EventImpl_22 l11llilil1) {
      this.EventImpl_24(l11llilil1);
   }

   @EventTarget(
      ZenithInternal095 = 0
   )
   public void EventBus(PacketHolder ii1l11il1i1i) {
      this.EventImpl_24(ii1l11il1i1i);
   }

   @EventTarget(
      ZenithInternal095 = 3
   )
   public void StringHolder_8(ZenithInternal111 lii11l11i1lil11ii11ii1il1lll) {
      this.EventImpl_24(lii11l11i1lil11ii11ii1il1lll);
   }

   @EventTarget(
      ZenithInternal095 = 0
   )
   public void StringHolder_8(EventImpl_16 illil11l111il11ili1il) {
      this.EventImpl_24(illil11l111il11ili1il);
   }

   public AtomicLongHolder$EventBus EventTarget(Class<?> oclass) {
      synchronized (this.I1I11111I1lIll1) {
         for (AtomicLongHolder$EventBus illlli1liiiil1i1lll111$l1i1illlili : this.I1I11111I1lIll1) {
            if (illlli1liiiil1i1lll111$l1i1illlili.ZenithInternal092() == oclass) {
               return illlli1liiiil1i1lll111$l1i1illlili;
            }
         }

         return new AtomicLongHolder$EventBus(oclass);
      }
   }

   public void StringHolder_8(AtomicLongHolder$EventBus illlli1liiiil1i1lll111$l1i1illlili) {
      this.StringHolder_8(illlli1liiiil1i1lll111$l1i1illlili, 0);
   }

   public void StringHolder_8(AtomicLongHolder$EventBus illlli1liiiil1i1lll111$l1i1illlili, int i) {
      if (illlli1liiiil1i1lll111$l1i1illlili != null) {
         synchronized (this.I1I11111I1lIll1) {
            boolean flag = this.I1I11111I1lIll1
               .stream()
               .anyMatch(illlli1liiiil1i1lll111$l1i1illlili2 -> illlli1liiiil1i1lll111$l1i1illlili2 == illlli1liiiil1i1lll111$l1i1illlili);
            if (!flag) {
               illlli1liiiil1i1lll111$l1i1illlili.ZenithInternal045(i);
               if (i > this.BufferBuilderHolder()) {
                  if (!this.I1I11111I1lIll1.isEmpty()) {
                     this.I1I11111I1lIll1.add(1, illlli1liiiil1i1lll111$l1i1illlili);
                  } else {
                     this.I1I11111I1lIll1.addFirst(illlli1liiiil1i1lll111$l1i1illlili);
                  }
               } else {
                  this.I1I11111I1lIll1.add(illlli1liiiil1i1lll111$l1i1illlili);
               }
            }
         }
      }
   }

   private int BufferBuilderHolder() {
      int i = Integer.MIN_VALUE;

      for (AtomicLongHolder$EventBus illlli1liiiil1i1lll111$l1i1illlili : this.I1I11111I1lIll1) {
         if (illlli1liiiil1i1lll111$l1i1illlili.ll11lIllIlI1IlI1I111111IlIlIll() > i) {
            i = illlli1liiiil1i1lll111$l1i1illlili.ll11lIllIlI1IlI1I111111IlIlIll();
         }
      }

      return i == Integer.MIN_VALUE ? 0 : i;
   }

   public void BufferBuilderHolder_2() {
      synchronized (this.I1I11111I1lIll1) {
         this.I1I11111I1lIll1.clear();
         lII11l1II11lllI111I1l1I1l1.warning("All tasks cleared manually. tasks.size=0");
      }
   }

   public void ZenithInternal095(Class<?> oclass) {
      synchronized (this.I1I11111I1lIll1) {
         this.I1I11111I1lIll1.removeIf(illlli1liiiil1i1lll111$l1i1illlili -> illlli1liiiil1i1lll111$l1i1illlili.ZenithInternal092() == oclass);
         lII11l1II11lllI111I1l1I1l1.info("Tasks cleared for owner: " + oclass.getSimpleName());
      }
   }

   public int ZenithInternal035() {
      synchronized (this.I1I11111I1lIll1) {
         return this.I1I11111I1lIll1.size();
      }
   }

   public boolean floatHolder_8() {
      synchronized (this.I1I11111I1lIll1) {
         boolean flag = this.I1I11111I1lIll1.isEmpty();
         lII11l1II11lllI111I1l1I1l1.finest("isFinished() -> " + flag);
         return flag;
      }
   }

   public boolean Event(Class<?> oclass) {
      synchronized (this.I1I11111I1lIll1) {
         return this.I1I11111I1lIll1
            .stream()
            .filter(illlli1liiiil1i1lll111$l1i1illlili -> illlli1liiiil1i1lll111$l1i1illlili.ZenithInternal092() == oclass)
            .allMatch(AtomicLongHolder$EventBus::MinecraftClientHolder_3);
      }
   }

   public boolean EventImpl_24(Class<?> oclass) {
      synchronized (this.I1I11111I1lIll1) {
         AtomicLongHolder$EventBus illlli1liiiil1i1lll111$l1i1illlili = this.I1I11111I1lIll1.peek();
         if (illlli1liiiil1i1lll111$l1i1illlili == null) {
            return false;
         } else {
            Class oclass1 = illlli1liiiil1i1lll111$l1i1illlili.GsonHolder();
            return oclass1 == oclass;
         }
      }
   }
}
