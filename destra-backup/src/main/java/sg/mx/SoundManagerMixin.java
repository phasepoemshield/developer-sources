package sg.mx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.sound.AbstractSoundInstance;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.client.sound.SoundManager;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.module.SoundControllerModule;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(SoundManager.class)
public abstract class SoundManagerMixin {
   @Unique
   private static final long destra$duplicateWindowMs = 60L;
   @Unique
   private static final long destra$cacheLifetimeMs = 1500L;
   @Unique
   private static final Map<String, Long> destra$recentSounds = new HashMap<>();
   private static final float ЬЦ;
   private static final long ЬЬ;
   private static final double ЬЙ;
   private static final double Ьн;
   private static final double Ь西;
   private static final float ЬР;
   private static final float Ьъ;
   private static final long Ьм;

   @Inject(method = "play", at = @At("HEAD"), cancellable = true)
   private void destra$dedupeImmediatePlay(SoundInstance var1, CallbackInfo var2) {
      if (destra$applySoundController(var1) || destra$shouldCancel(var1, 0)) {
         var2.cancel();
      }
   }

   @Inject(method = "play", at = @At("HEAD"), cancellable = true)
   private void destra$dedupeScheduledPlay(SoundInstance var1, int var2, CallbackInfo var3) {
      if (destra$applySoundController(var1) || destra$shouldCancel(var1, var2)) {
         var3.cancel();
      }
   }

   @Unique
   private static boolean destra$applySoundController(SoundInstance var0) {
      if (var0 instanceof AbstractSoundInstance var1) {
         try {
            DestraClient var2 = DestraClient.getInstance();
            if (var2 != null && var2.getModuleManager() != null) {
               SoundControllerModule var3 = var2.getModuleManager().soundController;
               if (var3 != null && var3.Д()) {
                  AbstractSoundInstanceAccessor var4 = (AbstractSoundInstanceAccessor)var1;
                  Identifier var5 = var4.destra$getIdRaw();
                  Float var6 = var3.getVolumeMultiplier(var5);
                  if (var6 == null) {
                     return false;
                  }

                  float var7 = var4.destra$getVolumeRaw() * Math.max(0.0F, var6);
                  if (var7 <= ЬЦ) {
                     return true;
                  }

                  var4.destra$setVolumeRaw(var7);
                  return false;
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } catch (Throwable var8) {
            return false;
         }
      } else {
         return false;
      }
   }

   @Unique
   private static boolean destra$shouldCancel(SoundInstance var0, int var1) {
      if (var1 <= 0 && var0 != null && var0 instanceof AbstractSoundInstance var2) {
         try {
            AbstractSoundInstanceAccessor var3 = (AbstractSoundInstanceAccessor)var2;
            Identifier var4 = var3.destra$getIdRaw();
            if (var4 == null) {
               return false;
            }

            SoundCategory var5 = var3.destra$getCategoryRaw();
            if (var5 != null && var5 != SoundCategory.MUSIC && var5 != SoundCategory.RECORDS) {
               if (var3.destra$getVolumeRaw() <= 0.0F) {
                  return false;
               }

               long var6 = System.currentTimeMillis();
               String var8 = destra$buildKey(var3, var4, var5);
               Long var9 = destra$recentSounds.put(var8, var6);
               destra$prune(var6);
               return var9 != null && var6 - var9 <= ЬЬ;
            } else {
               return false;
            }
         } catch (Throwable var10) {
            return false;
         }
      } else {
         return false;
      }
   }

   @Unique
   private static String destra$buildKey(AbstractSoundInstanceAccessor var0, Identifier var1, SoundCategory var2) {
      long var3 = Math.round(var0.destra$getXRaw() * ЬЙ);
      long var5 = Math.round(var0.destra$getYRaw() * Ьн);
      long var7 = Math.round(var0.destra$getZRaw() * Ь西);
      int var9 = Math.round(var0.destra$getVolumeRaw() * ЬР);
      int var10 = Math.round(var0.destra$getPitchRaw() * Ьъ);
      return var1 + "|" + var2.getName() + "|" + var3 + "|" + var5 + "|" + var7 + "|" + var9 + "|" + var10;
   }

   @Unique
   private static void destra$prune(long var0) {
      if (destra$recentSounds.size() >= 256) {
         Iterator var2 = destra$recentSounds.entrySet().iterator();

         while (var2.hasNext()) {
            if (var0 - (Long)((Entry)var2.next()).getValue() > Ьм) {
               var2.remove();
            }
         }
      }
   }

   static {
      VMBridge.identifyClass(SoundManagerMixin.class, "oDMMBqzZ");
   }
}
