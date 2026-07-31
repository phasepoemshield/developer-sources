package l;

public final class Helper341 {
   private static final Helper341 INSTANCE = new Helper341();
   private final Helper339 attackWatch = new Helper339();
   private long cdMinecraftMs = 83L;
   private int queuedHits = 0;

   private Helper341() {
   }

   public static Helper341 method3373() {
      return INSTANCE;
   }

   public synchronized void method3374(long var1) {
      this.cdMinecraftMs = Math.max(1L, var1);
   }

   public synchronized void method3375() {
      this.attackWatch.method3358();
   }

   public synchronized void method3376() {
      if (this.queuedHits < 256) {
         this.queuedHits++;
      }
   }

   public synchronized void method3377() {
      this.queuedHits = 0;
      this.attackWatch.method3358();
   }

   public synchronized boolean method3378() {
      return this.attackWatch.method3356(this.cdMinecraftMs);
   }

   public synchronized int method3379() {
      return this.queuedHits;
   }
}
