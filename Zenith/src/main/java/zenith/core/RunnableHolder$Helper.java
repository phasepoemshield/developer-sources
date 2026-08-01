package zenith;

final class RunnableHolder$Helper implements ZenithInternal043$Helper, IRender$Helper  {
   private final Runnable llll1llIllIIllI1llll1I1I;

   private RunnableHolder$Helper(Runnable runnable) {
      this.llll1llIllIIllI1llll1I1I = runnable;
   }

   @Override
   public void render() {
      this.llll1llIllIIllI1llll1I1I.run();
   }

   public Runnable IlllIII11II11Il11() {
      return this.llll1llIllIIllI1llll1I1I;
   }
}
