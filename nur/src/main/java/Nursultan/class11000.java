package Nursultan;

import com.google.common.collect.AbstractIterator;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DataResult.Error;
import com.mojang.serialization.DataResult.Success;
import java.util.ListIterator;
import java.util.Objects;
import minecraft.class07709;
import minecraft.class08318;
import org.jspecify.annotations.Nullable;

public class class11000<T> extends AbstractIterator<T> {
   public class11000(class08318 var1, ListIterator var2) {
      this.y = var1;
      this.N = var2;
   }

   @Nullable
   protected T computeNext() {
      while (this.N.hasNext()) {
         int var1 = this.N.nextIndex();
         class07709 var2 = (class07709)this.N.next();
         DataResult var10000 = this.y.y.parse(this.y.N.N(), var2);
         Objects.requireNonNull(var10000);
         Object var3 = var10000;
         switch (var3) {
            case Success var7:
               return (T)((Success)var3).value();
            case Error var6:
               this.y.N(var1, var2, var6);
               if (!var6.partialValue().isPresent()) {
                  break;
               }

               return (T)var6.partialValue().get();
            default:
               throw new MatchException(null, null);
         }
      }

      return (T)this.endOfData();
   }
}
