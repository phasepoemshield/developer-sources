package sg.mx;

import net.minecraft.client.sound.AbstractSoundInstance;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(AbstractSoundInstance.class)
public interface AbstractSoundInstanceAccessor {
   @Accessor("id")
   Identifier destra$getIdRaw();

   @Accessor("category")
   SoundCategory destra$getCategoryRaw();

   @Accessor("volume")
   float destra$getVolumeRaw();

   @Accessor("volume")
   void destra$setVolumeRaw(float var1);

   @Accessor("pitch")
   float destra$getPitchRaw();

   @Accessor("x")
   double destra$getXRaw();

   @Accessor("y")
   double destra$getYRaw();

   @Accessor("z")
   double destra$getZRaw();
}
