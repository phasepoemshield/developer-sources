package zenith;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Matrix4f;

public final class ListHolder_4 {
   private static ListHolder_4 lIIIIII1IIl;
   private final List<IIl1III1I1IlllI1IlIllII1l1lIll$EventBus> I11I11l1lI1Il1l1 = new ArrayList<>(64);
   private final List<ZenithInternal043$Helper> IlI1I1l1III11llIII11l1l1l11 = new ArrayList<>(192);
   private final List<IRender$Helper> I1IlI1lIIlll1l1lI11111lIlI = new ArrayList<>(256);
   private final List<HeightHandler$Helper> l11llII1I = new ArrayList<>(64);
   private final BufferBuilderHolder_2 lIl1I1Il1lII1I11l1IIll1lIIlI = new BufferBuilderHolder_2();
   private final BufferBuilderHolder l1l1llIIIlII11ll = new BufferBuilderHolder();
   private boolean l111l1IlI11llll11II;

   public static void StringHolder_8(ListHolder_4 iil1iii1i1illli1ilillii1l1lill) {
      iil1iii1i1illli1ilillii1l1lill.clear();
      lIIIIII1IIl = iil1iii1i1illli1ilillii1l1lill;
   }

   public static void EventBus(ListHolder_4 iil1iii1i1illli1ilillii1l1lill) {
      if (lIIIIII1IIl == iil1iii1i1illli1ilillii1l1lill) {
         lIIIIII1IIl = null;
         iil1iii1i1illli1ilillii1l1lill.clear();
      }
   }

   public static boolean III1lI11Ill111lIl1l1IIlI() {
      return lIIIIII1IIl != null && !lIIIIII1IIl.l111l1IlI11llll11II;
   }

   public static boolean EventImpl_21(Runnable runnable) {
      if (!III1lI11Ill111lIl1l1IIlI()) {
         return false;
      } else {
         lIIIIII1IIl.I1IlI1lIIlll1l1lI11111lIlI.add(new RunnableHolder$Helper(runnable));
         return true;
      }
   }

   public static boolean StringHolder_8(Matrix4f matrix4f, Consumer<MatrixStack> consumer) {
      if (!III1lI11Ill111lIl1l1IIlI()) {
         return false;
      } else {
         Matrix4f matrix4f1 = new Matrix4f(matrix4f);
         lIIIIII1IIl.I1IlI1lIIlll1l1lI11111lIlI.add(() -> {
            MatrixStack MatrixStack = new MatrixStack();
            MatrixStack.peek().getPositionMatrix().set(matrix4f1);
            consumer.accept(MatrixStack);
         });
         return true;
      }
   }

   public static boolean EventImpl_13(Runnable runnable) {
      if (!III1lI11Ill111lIl1l1IIlI()) {
         return false;
      } else {
         lIIIIII1IIl.IlI1I1l1III11llIII11l1l1l11.add(new RunnableHolder$Helper(runnable));
         return true;
      }
   }

   public static boolean EventBus(Matrix4f matrix4f, Consumer<MatrixStack> consumer) {
      if (!III1lI11Ill111lIl1l1IIlI()) {
         return false;
      } else {
         Matrix4f matrix4f1 = new Matrix4f(matrix4f);
         lIIIIII1IIl.IlI1I1l1III11llIII11l1l1l11.add(new RunnableHolder$Helper(() -> {
            MatrixStack MatrixStack = new MatrixStack();
            MatrixStack.peek().getPositionMatrix().set(matrix4f1);
            consumer.accept(MatrixStack);
         }));
         return true;
      }
   }

   public static boolean StringHolder_8(
      Matrix4f matrix4f,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill,
      boolean flag,
      boolean flag1
   ) {
      if (!III1lI11Ill111lIl1l1IIlI()) {
         return false;
      } else {
         lIIIIII1IIl.I11I11l1lI1Il1l1
            .add(
               new IIl1III1I1IlllI1IlIllII1l1lIll$EventBus(
                  new Matrix4f(matrix4f),
                  f,
                  f1,
                  f2,
                  f3,
                  f4,
                  iil11iill1il1l1llilll1l1i1i1,
                  il1iliilli1l1iill,
                  flag,
                  flag1,
                  Interface.ll11lIl1IlIl1lI1.lII1ll11II1ll1I1l111Il1lI(),
                  Interface.ll11lIl1IlIl1lI1.l1I11llIIl111llI1IIIll11lI11I(),
                  Interface.ll11lIl1IlIl1lI1.l1IIl1llllIII(),
                  floatHolder_5.StringHolder_30(Interface.lIl111ll1l111lIIlIlI1I1())
               )
            );
         return true;
      }
   }

   public static boolean EventTarget(
      Matrix4f matrix4f, float f, float f1, float f2, float f3, floatHolder_5 iil11iill1il1l1llilll1l1i1i1, ByteBufferHolder il1iliilli1l1iill
   ) {
      if (!III1lI11Ill111lIl1l1IIlI()) {
         return false;
      } else {
         lIIIIII1IIl.IlI1I1l1III11llIII11l1l1l11
            .add(new IIl1III1I1IlllI1IlIllII1l1lIll$Event(new Matrix4f(matrix4f), f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill));
         return true;
      }
   }

   public static boolean StringHolder_8(Matrix4f matrix4f, float f, float f1, float f2, float f3, ByteBufferHolder il1iliilli1l1iill) {
      if (!III1lI11Ill111lIl1l1IIlI()) {
         return false;
      } else {
         lIIIIII1IIl.IlI1I1l1III11llIII11l1l1l11.add(new IIl1III1I1IlllI1IlIllII1l1lIll$EventTarget(new Matrix4f(matrix4f), f, f1, f2, f3, il1iliilli1l1iill));
         return true;
      }
   }

   public void flush() {
      if (!this.l111l1IlI11llll11II) {
         this.l111l1IlI11llll11II = true;

         try {
            this.StringHolder_10(true);
            this.lII1llI111II1lllI();
            this.StringHolder_10(false);
            this.lI1lIIIl1IlIl1I();
            this.llI1lII1lllI1l();
         } finally {
            this.l111l1IlI11llll11II = false;
            this.clear();
         }
      }
   }

   private void clear() {
      this.I11I11l1lI1Il1l1.clear();
      this.IlI1I1l1III11llIII11l1l1l11.clear();
      this.I1IlI1lIIlll1l1lI11111lIlI.clear();
      this.l11llII1I.clear();
   }

   private void StringHolder_10(boolean flag) {
      for (IIl1III1I1IlllI1IlIllII1l1lIll$EventBus iil1iii1i1illli1ilillii1l1lill$l1i1illlili : this.I11I11l1lI1Il1l1) {
         if (iil1iii1i1illli1ilillii1l1lill$l1i1illlili.lIl1IlllI1II11llllI1IIl1lIlI && iil1iii1i1illli1ilillii1l1lill$l1i1illlili.Il1IIl1l1llIl == flag) {
            floatHolder_8.StringHolder_8(
               iil1iii1i1illli1ilillii1l1lill$l1i1illlili.l1I1IlIII1I1lI11IIII,
               iil1iii1i1illli1ilillii1l1lill$l1i1illlili.I11l11l1Il11l1,
               iil1iii1i1illli1ilillii1l1lill$l1i1illlili.lIllIII1IIII1Il1III1IlI11,
               iil1iii1i1illli1ilillii1l1lill$l1i1illlili.l1IllI11llllII1l1l1,
               iil1iii1i1illli1ilillii1l1lill$l1i1illlili.II11lIII1II11Il1l11l1III1,
               iil1iii1i1illli1ilillii1l1lill$l1i1illlili.I11l1IlII1lIIl1lI1IlII111,
               iil1iii1i1illli1ilillii1l1lill$l1i1illlili.IIIlllIl1ll1llIl1Ill1I
            );
         }
      }
   }

   private void lII1llI111II1lllI() {
      this.l11llII1I.clear();

      for (IIl1III1I1IlllI1IlIllII1l1lIll$EventBus iil1iii1i1illli1ilillii1l1lill$l1i1illlili : this.I11I11l1lI1Il1l1) {
         if (iil1iii1i1illli1ilillii1l1lill$l1i1illlili.ll1IIII11lIllI11l11IIllIIllI) {
            if (iil1iii1i1illli1ilillii1l1lill$l1i1illlili.I11llI1IIlIIlIll1lll) {
               floatHolder_8.StringHolder_8(
                  iil1iii1i1illli1ilillii1l1lill$l1i1illlili.l1I1IlIII1I1lI11IIII,
                  iil1iii1i1illli1ilillii1l1lill$l1i1illlili.I11l11l1Il11l1,
                  iil1iii1i1illli1ilillii1l1lill$l1i1illlili.lIllIII1IIII1Il1III1IlI11,
                  iil1iii1i1illli1ilillii1l1lill$l1i1illlili.l1IllI11llllII1l1l1,
                  iil1iii1i1illli1ilillii1l1lill$l1i1illlili.II11lIII1II11Il1l11l1III1,
                  iil1iii1i1illli1ilillii1l1lill$l1i1illlili.lll1I1I1IlI11I1ll,
                  iil1iii1i1illli1ilillii1l1lill$l1i1illlili.lll1llIIIl,
                  true
               );
            } else {
               this.l11llII1I
                  .add(
                     new HeightHandler$Helper(
                        iil1iii1i1illli1ilillii1l1lill$l1i1illlili.l1I1IlIII1I1lI11IIII,
                        iil1iii1i1illli1ilillii1l1lill$l1i1illlili.I11l11l1Il11l1,
                        iil1iii1i1illli1ilillii1l1lill$l1i1illlili.lIllIII1IIII1Il1III1IlI11,
                        iil1iii1i1illli1ilillii1l1lill$l1i1illlili.l1IllI11llllII1l1l1,
                        iil1iii1i1illli1ilillii1l1lill$l1i1illlili.II11lIII1II11Il1l11l1III1,
                        iil1iii1i1illli1ilillii1l1lill$l1i1illlili.lll1I1I1IlI11I1ll,
                        iil1iii1i1illli1ilillii1l1lill$l1i1illlili.lll1llIIIl
                     )
                  );
            }
         }
      }

      if (!this.l11llII1I.isEmpty()) {
         ZenithClient.getInstance().GetDisplayNameHandler().ListHolder_6(this.l11llII1I);
      }
   }

   private void lI1lIIIl1IlIl1I() {
      for (ZenithInternal043$Helper iil1iii1i1illli1ilillii1l1lill$ii1il11l111ii11iil : this.IlI1I1l1III11llIII11l1l1l11) {
         if (iil1iii1i1illli1ilillii1l1lill$ii1il11l111ii11iil instanceof IIl1III1I1IlllI1IlIllII1l1lIll$Event iil1iii1i1illli1ilillii1l1lill$liil11l111liil1ll
            )
          {
            this.l1l1llIIIlII11ll.flush();
            this.lIl1I1Il1lII1I11l1IIll1lIIlI.EventBus(iil1iii1i1illli1ilillii1l1lill$liil11l111liil1ll.lIIl1l1I1Il1l1l1IllIIllI1II);
            this.lIl1I1Il1lII1I11l1IIll1lIIlI
               .EventBus(
                  iil1iii1i1illli1ilillii1l1lill$liil11l111liil1ll.I1I1l11l1ll1,
                  iil1iii1i1illli1ilillii1l1lill$liil11l111liil1ll.II11I11II1,
                  iil1iii1i1illli1ilillii1l1lill$liil11l111liil1ll.l1I11lII11l1lIllllll1l,
                  iil1iii1i1illli1ilillii1l1lill$liil11l111liil1ll.l11IIIIIl11l1llIlIIIIII,
                  iil1iii1i1illli1ilillii1l1lill$liil11l111liil1ll.l1I1I11llllIIlIIIIII11,
                  iil1iii1i1illli1ilillii1l1lill$liil11l111liil1ll.lllI1l11111l1IIII111II1IlI1l
               );
         } else if (iil1iii1i1illli1ilillii1l1lill$ii1il11l111ii11iil instanceof IIl1III1I1IlllI1IlIllII1l1lIll$EventTarget iil1iii1i1illli1ilillii1l1lill$illi1l1l1
            )
          {
            this.lIl1I1Il1lII1I11l1IIll1lIIlI.flush();
            this.l1l1llIIIlII11ll.lIl1IlI111();
            this.l1l1llIIIlII11ll
               .EventBus(
                  iil1iii1i1illli1ilillii1l1lill$illi1l1l1.I11I1IllllIl11l11ll11I1,
                  iil1iii1i1illli1ilillii1l1lill$illi1l1l1.I1lIIlII1Il1Illl11IIIIlI1,
                  iil1iii1i1illli1ilillii1l1lill$illi1l1l1.l111lI1IIIlIlllIl1l1IlI,
                  iil1iii1i1illli1ilillii1l1lill$illi1l1l1.II1I1IIIII1l1I,
                  iil1iii1i1illli1ilillii1l1lill$illi1l1l1.IlIl1Il1l11l,
                  iil1iii1i1illli1ilillii1l1lill$illi1l1l1.lIl11I111llI
               );
         } else {
            this.lIl1I1Il1lII1I11l1IIll1lIIlI.flush();
            this.l1l1llIIIlII11ll.flush();
            if (iil1iii1i1illli1ilillii1l1lill$ii1il11l111ii11iil instanceof IRender$Helper iil1iii1i1illli1ilillii1l1lill$l1lll11l1l
               )
             {
               iil1iii1i1illli1ilillii1l1lill$l1lll11l1l.render();
            }
         }
      }

      this.lIl1I1Il1lII1I11l1IIll1lIIlI.flush();
      this.l1l1llIIIlII11ll.flush();
   }

   private void llI1lII1lllI1l() {
      for (IRender$Helper iil1iii1i1illli1ilillii1l1lill$l1lll11l1l : this.I1IlI1lIIlll1l1lI11111lIlI) {
         iil1iii1i1illli1ilillii1l1lill$l1lll11l1l.render();
      }
   }
}
