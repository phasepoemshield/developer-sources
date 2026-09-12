package Nursultan;

import com.google.common.collect.AbstractIterator;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Iterator;
import minecraft.class01101;
import minecraft.class01129;
import minecraft.class01135;
import net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.EntitySectionAccessor;

public class class09440<T> extends AbstractIterator<T> {
   Iterator<T> N;

   public class09440(class01129 var1, ObjectIterator var2) {
      this.y = var2;
   }

   protected T computeNext() {
      if (this.N != null && this.N.hasNext()) {
         return (T)((class01135)this.N.next());
      } else {
         while (this.y.hasNext()) {
            class01101 var1 = (class01101)this.y.next();
            if (var1.L().y() && !var1.N()) {
               this.N = ((EntitySectionAccessor)var1).getCollection().iterator();
               if (this.N.hasNext()) {
                  return (T)((class01135)this.N.next());
               }
            }
         }

         return (T)((class01135)this.endOfData());
      }
   }
}
