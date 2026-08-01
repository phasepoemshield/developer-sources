package l;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.minecraft.util.Identifier;

public class Helper120 {
   private Stream<String> stream;

   public Helper120(String[] var1) {
      this.stream = Stream.of(var1);
   }

   public Helper120(List<String> var1) {
      this.stream = var1.stream();
   }

   public Helper120() {
      this.stream = Stream.empty();
   }

   public Helper120 method990(Stream<String> var1) {
      this.stream = Stream.concat(this.stream, var1);
      return this;
   }

   public Helper120 method991(String... var1) {
      return this.method990(Stream.of(var1));
   }

   public Helper120 method992(Class<? extends Enum<?>> var1) {
      return this.method990(Stream.of((Enum[])var1.getEnumConstants()).map(Enum::name).map(String::toLowerCase));
   }

   public Helper120 method993(Stream<String> var1) {
      this.stream = Stream.concat(var1, this.stream);
      return this;
   }

   public Helper120 method994(String... var1) {
      return this.method993(Stream.of(var1));
   }

   public Helper120 method995(Class<? extends Enum<?>> var1) {
      return this.method993(Stream.of((Enum[])var1.getEnumConstants()).map(Enum::name).map(String::toLowerCase));
   }

   public Helper120 method996(Function<String, String> var1) {
      this.stream = this.stream.map(var1);
      return this;
   }

   public Helper120 method997(Predicate<String> var1) {
      this.stream = this.stream.filter(var1);
      return this;
   }

   public Helper120 method998(Comparator<String> var1) {
      this.stream = this.stream.sorted(var1);
      return this;
   }

   public Helper120 method999() {
      return this.method998(String.CASE_INSENSITIVE_ORDER);
   }

   public Helper120 method1000(String var1) {
      return this.method997(var1x -> var1x.toLowerCase(Locale.US).startsWith(var1.toLowerCase(Locale.US)));
   }

   public Helper120 method1001(String var1) {
      return this.method1000(Identifier.of(var1).toString());
   }

   public String[] method1002() {
      return this.stream.toArray(String[]::new);
   }

   public Stream<String> method1003() {
      return this.stream;
   }

   public Helper120 method1004(Helper129 var1) {
      return this.method990(var1.method1061().method962().flatMap(var0 -> var0.method1860().stream()).distinct());
   }
}
