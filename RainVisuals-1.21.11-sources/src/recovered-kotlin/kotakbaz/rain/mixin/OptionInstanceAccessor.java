package kotakbaz.rain.mixin;

import net.minecraft.client.option.SimpleOption;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

// $VF: Compiled from OptionInstanceAccessor.java
@Mixin(SimpleOption.class)
public interface OptionInstanceAccessor<T> {
   @Accessor("field_37868")
   void rain$setValue(T var1);
}
