package l;

import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public abstract class Helper214 implements Helper160, Helper230 {
   protected final List<String> names;

   protected Helper214(String... var1) {
      this.names = Stream.of(var1).map(var0 -> var0.toLowerCase(Locale.US)).toList();
   }

   @Override
   public final List<String> method1860() {
      return this.names;
   }
}
