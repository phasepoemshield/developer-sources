package ru.metaculture.protection;

public final class nnUunvvNUNU {
   private long UuUVuuUu;
   private long C00OOC00oO;
   private boolean uUnuvNvvNU;

   public synchronized void UuUVuuUu() {
      this.UuUVuuUu++;
      this.uUnuvNvvNU = false;
   }

   public synchronized void C00OOC00oO() {
      this.C00OOC00oO = this.UuUVuuUu;
      this.uUnuvNvvNU = true;
   }

   public synchronized boolean uUnuvNvvNU() {
      boolean var1 = this.uUnuvNvvNU && this.C00OOC00oO == this.UuUVuuUu;
      this.uUnuvNvvNU = false;
      return var1;
   }

   public synchronized void vVvUvVVuuNvV() {
      this.uUnuvNvvNU = false;
   }
}
