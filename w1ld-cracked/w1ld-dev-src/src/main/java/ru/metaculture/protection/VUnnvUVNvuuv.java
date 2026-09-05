package ru.metaculture.protection;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import org.wild.module.api.Module;

public final class VUnnvUVNvuuv {
   private static final Set<String> UuUVuuUu = Set.of(
      "AutoBuy",
      "AutoResell",
      "AutoSell",
      "AhHelper",
      "ItemScroller",
      "Removals",
      "ServerHelperModule",
      "AutoPotionModule",
      "ElytraHelper",
      "FreeCamera",
      "MenuSettingsModule",
      "ClientUtilModule",
      "UnHook",
      "Capes",
      "CameraClip",
      "FakePlayer",
      "ActionRecorder",
      "TapeMouse",
      "MiddleClick",
      "RotationLabModule",
      "TestModule",
      "Blink",
      "BaseFinder",
      "FriendManagerModule",
      "ServerJoiner",
      "ServerDHelper",
      "ChatHelper",
      "HitSounds",
      "TotemVoices"
   );
   private final vUNVNUnuv C00OOC00oO;
   private final vUnVnnn uUnuvNvvNU = new vUnVnnn();
   private final Map<String, Module> vVvUvVVuuNvV = new LinkedHashMap<>();
   private boolean uNNnnnuuuN;

   public VUnnvUVNvuuv(vUNVNUnuv var1) {
      this.C00OOC00oO = var1;
   }

   public void UuUVuuUu() {
      if (!this.uNNnnnuuuN) {
         if (this.C00OOC00oO.VVuuUN() != null && this.C00OOC00oO.vNUvnnVnUvu() != null && this.C00OOC00oO.uVUuuVnNVU() != null && this.C00OOC00oO.vuuuNvNuv()) {
            this.uNNnnnuuuN = true;
            VVUvVnVVV.UuUVuuUu(this.C00OOC00oO, this::uNNnnnuuuN);
         }
      }
   }

   private void uNNnnnuuuN() {
      if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         for (Module var2 : new ArrayList<>(NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu)) {
            if (var2 != null && var2.vNUvnnVnUvu != oOOOo0.Visuals && !UuUVuuUu.contains(var2.getClass().getSimpleName())) {
               try {
                  Constructor var3 = var2.getClass().getDeclaredConstructor();
                  var3.setAccessible(true);
                  this.UuUVuuUu((Module)var3.newInstance());
               } catch (Throwable var4) {
               }
            }
         }
      } else {
         this.UuUVuuUu(AutoDrop::new);
         this.UuUVuuUu(AntiAFK::new);
      }
   }

   private void UuUVuuUu(Supplier<Module> var1) {
      try {
         this.UuUVuuUu((Module)var1.get());
      } catch (Throwable var3) {
      }
   }

   private void UuUVuuUu(Module var1) {
      if (var1 != null) {
         var1.nuUnNvnuUu = false;
         this.vVvUvVVuuNvV.putIfAbsent(var1.vVvUvVVuuNvV.toLowerCase(Locale.ROOT), var1);
      }
   }

   public Module UuUVuuUu(String var1) {
      this.UuUVuuUu();
      return var1 == null ? null : this.vVvUvVVuuNvV.get(var1.toLowerCase(Locale.ROOT));
   }

   public List<Module> C00OOC00oO() {
      this.UuUVuuUu();
      return new ArrayList<>(this.vVvUvVVuuNvV.values());
   }

   public String uUnuvNvvNU() {
      this.UuUVuuUu();
      return String.join(", ", this.vVvUvVVuuNvV.keySet());
   }

   public boolean C00OOC00oO(String var1) {
      Module var2 = this.UuUVuuUu(var1);
      return var2 != null && var2.nuUnNvnuUu;
   }

   public void UuUVuuUu(String var1, boolean var2) {
      Module var3 = this.UuUVuuUu(var1);
      if (var3 != null && var3.nuUnNvnuUu != var2) {
         if (var2) {
            this.C00OOC00oO(var3);
         } else {
            this.uUnuvNvvNU(var3);
         }
      }
   }

   public void uUnuvNvvNU(String var1) {
      Module var2 = this.UuUVuuUu(var1);
      if (var2 != null) {
         this.UuUVuuUu(var1, !var2.nuUnNvnuUu);
      }
   }

   public void UuUVuuUu(VunUNUNVUnv var1) {
      this.uUnuvNvvNU.UuUVuuUu(var1);
   }

   public void vVvUvVVuuNvV() {
      for (Module var2 : this.vVvUvVVuuNvV.values()) {
         if (var2.nuUnNvnuUu) {
            this.uUnuvNvvNU(var2);
         }
      }
   }

   private void C00OOC00oO(Module var1) {
      var1.nuUnNvnuUu = true;

      try {
         VVUvVnVVV.UuUVuuUu(this.C00OOC00oO, () -> {
            boolean var3x = false /* VF: Semaphore variable */;

            try {
               var3x = true;
               var1.UuUVuuUu();
               var3x = false;
            } finally {
               if (var3x) {
                  NUvnVVNvvu.C00OOC00oO(var1);
               }
            }

            NUvnVVNvvu.C00OOC00oO(var1);
         });
         if (var1.nuUnNvnuUu) {
            this.uUnuvNvvNU.UuUVuuUu(var1);
         }
      } catch (Throwable var3) {
         var1.nuUnNvnuUu = false;
         this.uUnuvNvvNU.C00OOC00oO(var1);
         NUvnVVNvvu.C00OOC00oO(var1);
         System.err.println("[WildBot] " + this.C00OOC00oO.UuUVuuUu() + ": failed to enable " + var1.vVvUvVVuuNvV);
         var3.printStackTrace();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void uUnuvNvvNU(Module var1) {
      this.uUnuvNvvNU.C00OOC00oO(var1);
      var1.nuUnNvnuUu = false;
      boolean var6 = false /* VF: Semaphore variable */;

      label41: {
         try {
            var6 = true;
            VVUvVnVVV.UuUVuuUu(this.C00OOC00oO, var1::C00OOC00oO);
            var6 = false;
            break label41;
         } catch (Throwable var7) {
            System.err.println("[WildBot] " + this.C00OOC00oO.UuUVuuUu() + ": failed to disable " + var1.vVvUvVVuuNvV);
            var7.printStackTrace();
            var6 = false;
         } finally {
            if (var6) {
               NUvnVVNvvu.C00OOC00oO(var1);
            }
         }

         NUvnVVNvvu.C00OOC00oO(var1);
         return;
      }

      NUvnVVNvvu.C00OOC00oO(var1);
   }
}
