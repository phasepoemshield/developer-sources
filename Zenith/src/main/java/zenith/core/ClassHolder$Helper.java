package zenith;

class IllllI1lIIIIl1I1lll111$EventListener<E> {
   private final Class<E> IIIlIII1llI1I1ll11Il1lII;
   private final IAccept$EventBus$EventBus<E> l1l111ll1111lII;
   private final int I1lll1IlllI1l1IlIl11ll11;
   private final boolean IllIIlIIll1l1lIIl1IIl;
   private final int llIII11llIIl111Illl1IIIII;

   IllllI1lIIIIl1I1lll111$EventListener(
      Class<E> oclass, IAccept$EventBus$EventBus<E> illlli1liiiil1i1lll111$l1i1illlili$l1i1illlili, int i, boolean flag, int j
   ) {
      this.IIIlIII1llI1I1ll11Il1lII = oclass;
      this.l1l111ll1111lII = illlli1liiiil1i1lll111$l1i1illlili$l1i1illlili;
      this.I1lll1IlllI1l1IlIl11ll11 = i;
      this.IllIIlIIll1l1lIIl1IIl = flag;
      this.llIII11llIIl111Illl1IIIII = j;
   }

   boolean EventImpl_21(Object object) {
      return this.l1l111ll1111lII.accept(this.IIIlIII1llI1I1ll11Il1lII.cast(object));
   }

   @Override
   public String toString() {
      return "Step{index="
         + this.I1lll1IlllI1l1IlIl11ll11
         + ", event="
         + this.IIIlIII1llI1I1ll11Il1lII.getSimpleName()
         + ", persistent="
         + this.IllIIlIIll1l1lIIl1IIl
         + ", priority="
         + this.llIII11llIIl111Illl1IIIII
         + "}";
   }
}
