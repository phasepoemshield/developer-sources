package ru.metaculture.protection;

import java.util.concurrent.atomic.AtomicBoolean;

public final class C0CCOcCOO0 {
   private final AtomicBoolean UuUVuuUu = new AtomicBoolean();
   private final AtomicBoolean C00OOC00oO = new AtomicBoolean();

   public void UuUVuuUu() {
      this.UuUVuuUu.set(true);
   }

   public boolean C00OOC00oO() {
      return this.UuUVuuUu.get();
   }

   public boolean uUnuvNvvNU() {
      return this.UuUVuuUu.get() && this.C00OOC00oO.compareAndSet(false, true);
   }

   public void vVvUvVVuuNvV() {
      this.C00OOC00oO.set(false);
   }

   public void uNNnnnuuuN() {
      this.C00OOC00oO.set(false);
   }

   public void UuUVuuUu(boolean var1) {
      this.UuUVuuUu.set(!var1);
   }
}
