package l;

import java.util.PriorityQueue;

public class Helper356<T> {
   public int tickCounter = 0;
   public PriorityQueue<Helper355<T>> activeTasks = new PriorityQueue<>((var0, var1) -> Integer.compare(var1.priority, var0.priority));

   public Helper356() {
   }

   public void method3566(int var1) {
      this.tickCounter += var1;
   }

   public void method3567(Helper355<T> var1) {
      this.activeTasks.removeIf(var1x -> var1x.provider.equals(var1.provider));
      var1.expiresIn = var1.expiresIn + this.tickCounter;
      this.activeTasks.add(var1);
   }

   public T method3568() {
      while (
         !this.activeTasks.isEmpty()
            && this.activeTasks.peek() != null
            && (this.activeTasks.peek().expiresIn <= this.tickCounter || !this.activeTasks.peek().provider.isState())
      ) {
         this.activeTasks.poll();
      }

      if (this.activeTasks.isEmpty()) {
         return null;
      } else {
         return this.activeTasks.peek() != null ? this.activeTasks.peek().value : null;
      }
   }
}
