package org.zenith.rotation;

import org.zenith.core.ProfileItemBuilder;
import org.zenith.ZenithClient;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PositionProvider;
import org.zenith.core.BotGotoEntity;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import net.minecraft.client.MinecraftClient;

public class RotationQueue<T> {
   public int int483 = 0;
   public final PriorityBlockingQueue<RotationQueue_Var159<T>> priorityBlockingQueue = new PriorityBlockingQueue<>(
      11, Comparator.comparingInt(var0 -> -var0.int171)
   );

   public RotationQueue() {
   }

   public void ProfileItemBuilder(int var1) {
      this.int483 += var1;
   }

   public void tick() {
      this.ProfileItemBuilder(1);
   }

   public void on23(RotationQueue_Var159<T> var1) {
      this.priorityBlockingQueue.removeIf(var1x -> var1x.module3 == var1.module3);
      var1.int213 = var1.int213 + this.int483;
      this.priorityBlockingQueue.add(var1);
   }

   public T BotGotoEntity() {
      RotationQueue_Var159 lll1iill1il1liiiiilli11i1l1l1_ii1il11l111ii11iil = (RotationQueue_Var159)this.priorityBlockingQueue
         .peek();
      if (lll1iill1il1liiiiilli11i1l1l1_ii1il11l111ii11iil == null) {
         return null;
      } else {
         if (MinecraftClient.getInstance().isOnThread()) {
            while (
               lll1iill1il1liiiiilli11i1l1l1_ii1il11l111ii11iil != null
                  && (
                     lll1iill1il1liiiiilli11i1l1l1_ii1il11l111ii11iil.int213 <= this.int483
                        || !lll1iill1il1liiiiilli11i1l1l1_ii1il11l111ii11iil.module3.isEnabled()
                  )
            ) {
               this.priorityBlockingQueue.poll();
               lll1iill1il1liiiiilli11i1l1l1_ii1il11l111ii11iil = (RotationQueue_Var159<T>)this.priorityBlockingQueue.peek();
            }
         }

         return lll1iill1il1liiiiilli11i1l1l1_ii1il11l111ii11iil != null ? (T) lll1iill1il1liiiiilli11i1l1l1_ii1il11l111ii11iil.call263 : null;
      }
   }

   public RotationQueue_Var159<T> PositionProvider() {
      RotationQueue_Var159 lll1iill1il1liiiiilli11i1l1l1_ii1il11l111ii11iil = (RotationQueue_Var159)this.priorityBlockingQueue
         .peek();
      if (lll1iill1il1liiiiilli11i1l1l1_ii1il11l111ii11iil == null) {
         return null;
      } else {
         if (MinecraftClient.getInstance().isOnThread()) {
            while (
               lll1iill1il1liiiiilli11i1l1l1_ii1il11l111ii11iil != null
                  && (
                     lll1iill1il1liiiiilli11i1l1l1_ii1il11l111ii11iil.int213 <= this.int483
                        || !lll1iill1il1liiiiilli11i1l1l1_ii1il11l111ii11iil.module3.isEnabled()
                  )
            ) {
               this.priorityBlockingQueue.poll();
               lll1iill1il1liiiiilli11i1l1l1_ii1il11l111ii11iil = (RotationQueue_Var159<T>)this.priorityBlockingQueue.peek();
            }
         }

         return lll1iill1il1liiiiilli11i1l1l1_ii1il11l111ii11iil;
      }
   }

   public void clear() {
      this.priorityBlockingQueue.clear();
   }
}
