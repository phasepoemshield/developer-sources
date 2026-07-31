package zenith;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.List;

public class GetClientColorHandler {
   private SetColorHandler_3 IIlIIIl1I1l111ll1IIIllII;
   private SetColorHandler_3 l111IIIlIl1II1llIll1IllII1I1 = SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I;
   private final GetStartTimeHandler lI11I1IIlI1lll1I1l1;
   private final floatHolder_12 lII111l111I1l1Ill1llI;
   private final List<SetColorHandler_3> l1l1l11Il11l = new ArrayList<>(
      List.of(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I, SetColorHandler_3.I11lII11lI11I1I1IIIl, SetColorHandler_3.l1l11l1111l1ll1lIllll1)
   );
   private int IIlI1I1Ill1Il1IllI = 0;

   public GetClientColorHandler() {
      EventBus.StringHolder_8(this);
      this.lI11I1IIlI1lll1I1l1 = new GetStartTimeHandler(200L, 1.0F, IReturn.ScreenImpl);
      this.lI11I1IIlI1lll1I1l1.ZenithInternal084(true);
      this.lII111l111I1l1Ill1llI = new floatHolder_12(1700L);
   }

   public void StringHolder_8(SetColorHandler_3 llliili1l1ii11i1lii1) {
      if (this.lI11I1IIlI1lll1I1l1.ArrayListHolder()) {
         this.IIlIIIl1I1l111ll1IIIllII = this.l111IIIlIl1II1llIll1IllII1I1;
         this.l111IIIlIl1II1llIll1IllII1I1 = llliili1l1ii11i1lii1;
         int i = this.l1l1l11Il11l.indexOf(llliili1l1ii11i1lii1);
         if (i != -1) {
            this.IIlI1I1Ill1Il1IllI = i;
         }

         this.lI11I1IIlI1lll1I1l1.reset();
      }
   }

   public void Il1III11llIlIlIl1l1IlI1IIlI() {
      if (this.lI11I1IIlI1lll1I1l1.ArrayListHolder()) {
         this.IIlIIIl1I1l111ll1IIIllII = this.l111IIIlIl1II1llIll1IllII1I1;
         this.IIlI1I1Ill1Il1IllI = (this.IIlI1I1Ill1Il1IllI + 1) % this.l1l1l11Il11l.size();
         this.l111IIIlIl1II1llIll1IllII1I1 = this.l1l1l11Il11l.get(this.IIlI1I1Ill1Il1IllI);
         this.lI11I1IIlI1lll1I1l1.reset();
      }
   }

   public void EventImpl_17(String s) {
      if (s != null) {
         SetColorHandler_3 llliili1l1ii11i1lii1;
         switch (s) {
            case "Dark":
               llliili1l1ii11i1lii1 = SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I;
               break;
            case "Light":
               llliili1l1ii11i1lii1 = SetColorHandler_3.I11lII11lI11I1I1IIIl;
               break;
            case "Custom":
               llliili1l1ii11i1lii1 = SetColorHandler_3.l1l11l1111l1ll1lIllll1;
               break;
            default:
               return;
         }

         this.StringHolder_8(llliili1l1ii11i1lii1);
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl_37 llllii1liii1i1ll1liiil) {
      this.lII111l111I1l1Ill1llI.Coordinates();
      this.lI11I1IIlI1lll1I1l1.StringHolder_8(1.0F);
   }

   private void StringHolder_8(
      List<ByteBufferHolder> list,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill2,
      ByteBufferHolder il1iliilli1l1iill3
   ) {
      list.set(0, il1iliilli1l1iill);
      list.set(1, il1iliilli1l1iill1);
      list.set(2, il1iliilli1l1iill2);
      list.set(3, il1iliilli1l1iill3);
   }

   public SetColorHandler_3 IllIlIll11lIlI1() {
      return this.lI11I1IIlI1lll1I1l1.ArrayListHolder()
         ? this.l111IIIlIl1II1llIll1IllII1I1
         : this.IIlIIIl1I1l111ll1IIIllII.StringHolder_8(this.l111IIIlIl1II1llIll1IllII1I1, this.lI11I1IIlI1lll1I1l1.CloudFriendInfo());
   }

   public boolean EventBus(SetColorHandler_3 llliili1l1ii11i1lii1) {
      return this.l111IIIlIl1II1llIll1IllII1I1 == llliili1l1ii11i1lii1;
   }

   public ZenithInternal027 getClientColor() {
      return ZenithInternal027.StringHolder_8(this.getClientColor(0), this.getClientColor(90), this.getClientColor(180), this.getClientColor(270));
   }

   public ByteBufferHolder getClientColor(int i) {
      return PatternHolder.StringHolder_8(
         4, i, this.IllIlIll11lIlI1().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.IllIlIll11lIlI1().l11II1lIlIIIlll11lIII()
      );
   }

   public ByteBufferHolder getGlowColor(int i) {
      return PatternHolder.StringHolder_8(
         4, i, this.IllIlIll11lIlI1().IlI1I11lIlll1111Il(), this.IllIlIll11lIlI1().l1IllI1lII1111II1III1lllII()
      );
   }

   public ZenithInternal027 getGlowColor() {
      return ZenithInternal027.StringHolder_8(this.getGlowColor(0), this.getGlowColor(90), this.getGlowColor(180), this.getGlowColor(270));
   }

   public SetColorHandler_3 l1I1IlIlI11III1l111IllI11llIll() {
      return this.IIlIIIl1I1l111ll1IIIllII;
   }

   public GetStartTimeHandler l1I1ll1IIl1l1() {
      return this.lI11I1IIlI1lll1I1l1;
   }

   public floatHolder_12 lII111IIl1lI1I11lIIlIl1III1I() {
      return this.lII111l111I1l1Ill1llI;
   }

   public List<SetColorHandler_3> llII1lIlI1l11lIIlI11IllIlIII() {
      return this.l1l1l11Il11l;
   }

   public int l1lllII11IIIlll1I1IIII1I11() {
      return this.IIlI1I1Ill1Il1IllI;
   }
}
