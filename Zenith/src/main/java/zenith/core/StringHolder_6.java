package zenith;

import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Base64;
import java.util.Optional;
import java.util.UUID;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.command.argument.ItemStackArgument;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.component.type.ProfileComponent;
import net.minecraft.component.ComponentChanges;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.ComponentChanges.PigEntityRenderer7;

public class StringHolder_6 extends GetDisplayNameHandler_2 {
   private final String ByteBufferHolder;
   private final String PatternHolder;

   public StringHolder_6(String s, ZenithInternal105$Helper li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil, String s1) {
      this(s1, s, s, li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil);
   }

   public StringHolder_6(String s, String s1, String s2, ZenithInternal105$Helper li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil) {
      super(Items.PLAYER_HEAD.getDefaultStack(), s1, s2, li1ll11ilil1ii1lilll1i$ii1il11l111ii11iil);
      this.ByteBufferHolder = s;
      this.PatternHolder = this.FilterInputStreamImpl(s);
      PigEntityRenderer7 PigEntityRenderer7 = ComponentChanges.builder();
      Optional optional = Optional.of("");
      Optional optional1 = Optional.of(UUID.randomUUID());
      PropertyMap propertymap = new PropertyMap();
      propertymap.put("textures", new Property("textures", s));
      ProfileComponent ProfileComponent = new ProfileComponent(optional, optional1, propertymap);
      PigEntityRenderer7.add(DataComponentTypes.PROFILE, ProfileComponent);
      ItemStackArgument ItemStackArgument = new ItemStackArgument(this.itemStack.getRegistryEntry(), PigEntityRenderer7.build());

      try {
         this.itemStack = ItemStackArgument.createStack(1, false);
      } catch (CommandSyntaxException commandsyntaxexception) {
      }
   }

   private String FilterInputStreamImpl(String s) {
      try {
         String s1 = new String(Base64.getDecoder().decode(s));
         int i = s1.indexOf("\"url\"");
         if (i != -1) {
            int j = s1.indexOf("\"", i + 5);
            if (j != -1) {
               int k = s1.indexOf("\"", j + 1);
               if (k != -1) {
                  return s1.substring(j + 1, k);
               }
            }
         }
      } catch (Exception exception) {
      }

      return null;
   }

   @Override
   public boolean isBuy(ItemStack ItemStack) {
      if (!super.isBuy(ItemStack)) {
         return false;
      } else {
         ProfileComponent ProfileComponent = (ProfileComponent)ItemStack.get(DataComponentTypes.PROFILE);
         if (ProfileComponent != null) {
            PropertyMap propertymap = ProfileComponent.properties();
            if (propertymap != null && propertymap.containsKey("textures")) {
               for (Property property : propertymap.get("textures")) {
                  if (this.PatternHolder != null) {
                     String s = this.FilterInputStreamImpl(property.value());
                     if (s != null && s.equals(this.PatternHolder)) {
                        return true;
                     }
                  }

                  if (property.value().contains(this.ByteBufferHolder)) {
                     return true;
                  }
               }
            }
         }

         NbtComponent NbtComponent = (NbtComponent)ItemStack.get(DataComponentTypes.CUSTOM_DATA);
         if (NbtComponent != null && NbtComponent.getNbt().contains("SkullOwner")) {
            String s1 = NbtComponent.getNbt().get("SkullOwner").toString();
            if (this.PatternHolder != null && s1.contains(this.PatternHolder)) {
               return true;
            }

            if (s1.contains(this.ByteBufferHolder)) {
               return true;
            }
         }

         return false;
      }
   }

   public String ModuleInfo() {
      return this.ByteBufferHolder;
   }
}
