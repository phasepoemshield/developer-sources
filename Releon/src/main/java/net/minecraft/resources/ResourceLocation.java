package net.minecraft.resources;

public final class ResourceLocation {
   private final String value;

   private ResourceLocation(String value) {
      this.value = value;
   }

   public static ResourceLocation parse(String value) {
      return new ResourceLocation(value);
   }

   @Override
   public String toString() {
      return this.value;
   }
}
