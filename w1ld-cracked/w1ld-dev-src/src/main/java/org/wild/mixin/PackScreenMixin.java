package org.wild.mixin;

import java.io.File;
import java.nio.file.Path;
import java.util.Locale;
import java.util.stream.Stream;
import net.minecraft.class_156;
import net.minecraft.class_2561;
import net.minecraft.class_342;
import net.minecraft.class_4185;
import net.minecraft.class_437;
import net.minecraft.class_5375;
import net.minecraft.class_7919;
import net.minecraft.class_4185.class_7840;
import net.minecraft.class_5369.class_5371;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.wild.mixin.acceser.MessageAccessor;
import ru.metaculture.protection.uVuVNVuuN;

@Mixin({class_5375.class})
public abstract class PackScreenMixin extends class_437 {
   @Unique
   private static final Logger LOGGER = LoggerFactory.getLogger(PackScreenMixin.class);
   @Unique
   private static final class_2561 OPEN_FOLDER = class_2561.method_43471("pack.openFolder");
   @Unique
   private static final class_2561 FOLDER_INFO = class_2561.method_43471("pack.folderInfo");
   @Unique
   private static final class_2561 SEARCH_TITLE = class_2561.method_43470("Search resource packs");
   @Unique
   private static final class_2561 SEARCH_PLACEHOLDER = class_2561.method_43470("Search...");
   @Unique
   private class_342 wild$packSearchField;
   @Unique
   private String wild$packSearchQuery = "";
   @Shadow
   private Path field_25474;

   protected PackScreenMixin(class_2561 var1) {
      super(var1);
   }

   @Invoker("updatePackLists")
   public abstract void wild$updatePackLists();

   @Inject(
      method = {"init"},
      at = {@At("RETURN")}
   )
   private void wild$addPackSearch(CallbackInfo var1) {
      if (!uVuVNVuuN.uVunuUNVVUUV) {
         this.wild$packSearchField = new class_342(this.field_22793, 0, 0, 160, 20, SEARCH_TITLE);
         this.wild$packSearchField.method_1880(128);
         this.wild$packSearchField.method_47404(SEARCH_PLACEHOLDER);
         this.wild$packSearchField.method_1852(this.wild$packSearchQuery);
         this.wild$packSearchField.method_1863(var1x -> {
            this.wild$packSearchQuery = var1x == null ? "" : var1x;
            this.wild$updatePackLists();
         });
         this.wild$positionPackSearchField();
         this.method_37063(this.wild$packSearchField);
      }
   }

   @Inject(
      method = {"refreshWidgetPositions"},
      at = {@At("RETURN")}
   )
   private void wild$refreshPackSearchPosition(CallbackInfo var1) {
      this.wild$positionPackSearchField();
   }

   @Inject(
      method = {"tick"},
      at = {@At("TAIL")}
   )
   private void wild$tickPackSearchVisibility(CallbackInfo var1) {
      this.wild$syncPackSearchVisibility();
   }

   @ModifyVariable(
      method = {"updatePackList"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0,
      require = 0
   )
   private Stream<class_5371> wild$filterPackList(Stream<class_5371> var1) {
      if (uVuVNVuuN.uVunuUNVVUUV) {
         return var1;
      } else {
         String var2 = this.wild$packSearchQuery == null ? "" : this.wild$packSearchQuery.trim().toLowerCase(Locale.ROOT);
         return var2.isEmpty() ? var1 : var1.filter(var2x -> this.wild$matchesPackSearch(var2x, var2));
      }
   }

   @Unique
   private void wild$positionPackSearchField() {
      if (this.wild$packSearchField != null) {
         int var1 = Math.min(180, Math.max(120, this.field_22789 / 5));
         this.wild$packSearchField.method_55445(var1, 20);
         this.wild$packSearchField.method_46421(this.field_22789 - var1 - 8);
         this.wild$packSearchField.method_46419(8);
      }
   }

   @Unique
   private void wild$syncPackSearchVisibility() {
      if (this.wild$packSearchField != null) {
         boolean var1 = !uVuVNVuuN.uVunuUNVVUUV;
         this.wild$packSearchField.field_22764 = var1;
         this.wild$packSearchField.field_22763 = var1;
         if (!var1) {
            this.wild$packSearchField.method_25365(false);
         }
      }
   }

   @Unique
   private boolean wild$matchesPackSearch(class_5371 var1, String var2) {
      return var1 == null
         ? false
         : this.wild$contains(var1.method_48276(), var2) || this.wild$contains(var1.method_29650(), var2) || this.wild$contains(var1.method_29651(), var2);
   }

   @Unique
   private boolean wild$contains(class_2561 var1, String var2) {
      return var1 != null && this.wild$contains(var1.getString(), var2);
   }

   @Unique
   private boolean wild$contains(String var1, String var2) {
      return var1 != null && var1.toLowerCase(Locale.ROOT).contains(var2);
   }

   @Redirect(
      method = {"init"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/widget/ButtonWidget$Builder;build()Lnet/minecraft/client/gui/widget/ButtonWidget;"
      )
   )
   private class_4185 redirectOpenFolderButton(class_7840 var1) {
      class_2561 var2 = ((MessageAccessor)var1).getMessage();
      return var2.equals(OPEN_FOLDER) ? class_4185.method_46430(OPEN_FOLDER, var1x -> {
         File var2x;
         if (uVuVNVuuN.uVunuUNVVUUV && uVuVNVuuN.UNnVVNvvnVvU != null) {
            var2x = uVuVNVuuN.UNnVVNvvnVvU;
         } else {
            var2x = this.field_25474.toFile();
         }

         if (!var2x.exists()) {
            var2x.mkdirs();
         }

         LOGGER.info("Opening folder: {}", var2x.getPath());
         class_156.method_668().method_672(var2x);
      }).method_46436(class_7919.method_47407(FOLDER_INFO)).method_46431() : var1.method_46431();
   }
}
