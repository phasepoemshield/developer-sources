package Nursultan;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;

public class class11973 {
   public Object N_0;
   public Object N_1;

   public class11973() {
      this.i();
      this.N_0 = new Object[0];
      this.N_1 = new ConcurrentLinkedQueue();
   }

   private void i() {
   }

   public void y() {
      ((Queue)this.N_1).clear();
   }

   public void N(class11959 var1, Consumer<class11989> var2) {
      synchronized ((Object)this.N_0) {
         if (var1 != null && !((Queue)this.N_1).isEmpty()) {
            ArrayList var5 = null;

            class11989 var4;
            while ((var4 = (class11989)((Queue)this.N_1).poll()) != null) {
               if (var4.y() == var1) {
                  var2.accept(var4);
               } else {
                  if (var5 == null) {
                     var5 = new ArrayList();
                  }

                  var5.add(var4);
               }
            }

            if (var5 != null) {
               ((Queue)this.N_1).addAll(var5);
            }
         }
      }
   }

   public boolean N() {
      return ((Queue)this.N_1).isEmpty();
   }

   public void N(class11989 var1) {
      ((Queue)this.N_1).add(var1);
   }
}
