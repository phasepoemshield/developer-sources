package ru.metaculture.protection;

import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.nio.FloatBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.SequencedMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import net.minecraft.class_10042;
import net.minecraft.class_1041;
import net.minecraft.class_10868;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1921;
import net.minecraft.class_1944;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3887;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4720;
import net.minecraft.class_6367;
import net.minecraft.class_761;
import net.minecraft.class_765;
import net.minecraft.class_898;
import net.minecraft.class_9779;
import net.minecraft.class_9799;
import net.minecraft.class_4587.class_4665;
import net.minecraft.class_4597.class_4598;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryStack;
import org.wild.mixin.acceser.EntityRenderDispatcherAccessor;

public final class nuVUnVnVvV {
   private static final int UuUVuuUu = 1048576;
   private static final Logger C00OOC00oO = LogManager.getLogger("EntityFramebufferCapture");
   private static final nuVUnVnVvV uUnuvNvvNU = new nuVUnVnVvV();
   private static final Predicate<class_1297> vVvUvVVuuNvV = var0 -> true;
   private volatile class_6367 uNNnnnuuuN;
   private volatile class_6367 nuUnNvnuUu;
   private final Map<String, Predicate<class_1297>> VVuuUN = new ConcurrentHashMap<>();
   private final Map<String, Predicate<class_1297>> vNUvnnVnUvu = new ConcurrentHashMap<>();
   private volatile boolean uVUuuVnNVU;
   private volatile boolean vuuuNvNuv;
   private volatile boolean nvUVNnuu;
   private volatile boolean UuuNnUvUuv;
   private volatile boolean nUUVuvU;
   private volatile boolean UnUNVVVNuv;
   private volatile int vNVuvnUUnuUn = -1;
   private volatile int UvnvNVnnnnNU = -1;
   private volatile int uVUVnuvnuVuv;
   private volatile int NVNnnvnuunNv;
   private volatile int uVunuUNVVUUV = Integer.MIN_VALUE;
   private int UNnVVNvvnVvU;
   private nuVUnVnVvV.NVnVnNnN uNnUnnuNUnNu;
   private final class_9799 NnUuNNU = new class_9799(1048576);
   private final SequencedMap<class_1921, class_9799> nNvNUVU = new LinkedHashMap<>();

   private nuVUnVnVvV() {
   }

   public static nuVUnVnVvV UuUVuuUu() {
      return uUnuvNvvNU;
   }

   public void UuUVuuUu(boolean var1) {
      if (this.uVUuuVnNVU != var1) {
         this.uVUuuVnNVU = var1;
         this.uNnUnnuNUnNu();
      }
   }

   public void UuUVuuUu(String var1, boolean var2, Predicate<class_1297> var3) {
      if (var1 == null || var1.isBlank()) {
         throw new IllegalArgumentException("owner");
      } else if (!var2) {
         this.UuUVuuUu(var1);
      } else {
         Predicate var4 = var3 == null ? vVvUvVVuuNvV : var3;
         if (this.VVuuUN.get(var1) != var4) {
            this.VVuuUN.put(var1, var4);
         }
      }
   }

   public void UuUVuuUu(String var1) {
      if (var1 != null && !var1.isBlank()) {
         this.VVuuUN.remove(var1);
         this.uNnUnnuNUnNu();
      }
   }

   public void C00OOC00oO(String var1, boolean var2, Predicate<class_1297> var3) {
      if (var1 == null || var1.isBlank()) {
         throw new IllegalArgumentException("owner");
      } else if (var2 && var3 != null) {
         if (this.vNUvnnVnUvu.get(var1) != var3) {
            this.vNUvnnVnUvu.put(var1, var3);
         }
      } else {
         this.C00OOC00oO(var1);
      }
   }

   public void C00OOC00oO(String var1) {
      if (var1 != null && !var1.isBlank()) {
         this.vNUvnnVnUvu.remove(var1);
         if (this.vNUvnnVnUvu.isEmpty()) {
            this.nvUVNnuu = false;
         }
      }
   }

   private boolean NVNnnvnuunNv() {
      return !this.vNUvnnVnUvu.isEmpty();
   }

   private boolean UuUVuuUu(class_1297 var1) {
      if (this.vNUvnnVnUvu.isEmpty()) {
         return false;
      } else {
         for (Predicate var3 : this.vNUvnnVnUvu.values()) {
            try {
               if (var3.test(var1)) {
                  return true;
               }
            } catch (RuntimeException var5) {
               C00OOC00oO.warn("Entity tag filter failed for {}", var1.method_5477().getString(), var5);
            }
         }

         return false;
      }
   }

   public boolean C00OOC00oO() {
      return this.uVUuuVnNVU || !this.VVuuUN.isEmpty();
   }

   public boolean uUnuvNvvNU() {
      return this.C00OOC00oO() && this.vuuuNvNuv && this.vNVuvnUUnuUn > 0 && this.UvnvNVnnnnNU > 0 && uUnuvNvvNU(this.uNNnnnuuuN);
   }

   public int vVvUvVVuuNvV() {
      return this.uUnuvNvvNU() ? vVvUvVVuuNvV(this.uNNnnnuuuN) : 0;
   }

   public int uNNnnnuuuN() {
      return this.uUnuvNvvNU() ? uNNnnnuuuN(this.uNNnnnuuuN) : 0;
   }

   public boolean nuUnNvnuUu() {
      return this.C00OOC00oO() && this.NVNnnvnuunNv() && this.nvUVNnuu && uUnuvNvvNU(this.nuUnNvnuUu);
   }

   public int VVuuUN() {
      return this.nuUnNvnuUu() ? vVvUvVVuuNvV(this.nuUnNvnuUu) : 0;
   }

   public int vNUvnnVnUvu() {
      return this.nuUnNvnuUu() ? uNNnnnuuuN(this.nuUnNvnuUu) : 0;
   }

   public boolean uVUuuVnNVU() {
      return this.UuuNnUvUuv || this.nUUVuvU;
   }

   public boolean vuuuNvNuv() {
      return this.UuuNnUvUuv;
   }

   public void UuUVuuUu(class_761 var1, class_9779 var2, class_4184 var3) {
      if (!this.C00OOC00oO()) {
         this.NnUuNNU();
      } else {
         Objects.requireNonNull(var1, "worldRenderer");
         Objects.requireNonNull(var2, "tickCounter");
         class_310 var4 = class_310.method_1551();
         if (var4 == null || var4.field_1687 == null || var4.field_1773 == null) {
            this.NnUuNNU();
         } else if (!var4.field_1773.method_35765() && var3 != null) {
            class_276 var5 = var4.method_1522();
            if (var5 == null) {
               this.NnUuNNU();
            } else {
               class_1041 var6 = var4.method_22683();
               int var7 = var6 != null ? var6.method_4489() : var5.field_1482;
               int var8 = var6 != null ? var6.method_4506() : var5.field_1481;
               if (var7 <= 0 || var8 <= 0) {
                  this.NnUuNNU();
                  this.UNnVVNvvnVvU();
                  this.vNVuvnUUnuUn = -1;
                  this.UvnvNVnnnnNU = -1;
               } else if (!this.uUnuvNvvNU(var7, var8)) {
                  this.NnUuNNU();
               } else {
                  class_6367 var9 = this.uNNnnnuuuN;
                  if (var9 == null) {
                     this.NnUuNNU();
                  } else {
                     GpuTextureView var10 = var9.method_71639();
                     if (var10 != null && !var10.isClosed()) {
                        GpuTextureView var11 = var9.method_71640();
                        if (!this.UuUVuuUu(var9)) {
                           CommandEncoder var12 = RenderSystem.getDevice().createCommandEncoder();
                           GpuTexture var13 = var10.texture();
                           if (var11 != null && !var11.isClosed()) {
                              var12.clearColorAndDepthTextures(var13, 0, var11.texture(), 1.0);
                           } else {
                              var12.clearColorTexture(var13, 0);
                           }
                        }

                        this.nNvNUVU();

                        try {
                           this.NnUuNNU.method_60809();
                           this.nNvNUVU.values().forEach(class_9799::method_60809);
                           this.uNnUnnuNUnNu = new nuVUnVnVvV.NVnVnNnN(this.NnUuNNU, this.nNvNUVU);
                        } catch (RuntimeException var14) {
                           C00OOC00oO.warn("Failed to allocate capture resources", var14);
                           this.NnUuNNU();
                           return;
                        }

                        this.C00OOC00oO(var7, var8);
                        this.vuuuNvNuv = false;
                        this.UnUNVVVNuv = true;
                        this.uVUVnuvnuVuv = 0;
                     } else {
                        this.NnUuNNU();
                     }
                  }
               }
            }
         } else {
            this.NnUuNNU();
         }
      }
   }

   private void C00OOC00oO(int var1, int var2) {
      this.nvUVNnuu = false;
      if (!this.NVNnnvnuunNv()) {
         this.uVunuUNVVUUV();
      } else if (this.vVvUvVVuuNvV(var1, var2)) {
         class_6367 var3 = this.nuUnNvnuUu;
         if (var3 != null) {
            GpuTextureView var4 = var3.method_71639();
            if (var4 != null && !var4.isClosed()) {
               GpuTextureView var5 = var3.method_71640();
               if (!this.UuUVuuUu(var3)) {
                  CommandEncoder var6 = RenderSystem.getDevice().createCommandEncoder();
                  if (var5 != null && !var5.isClosed()) {
                     var6.clearColorAndDepthTextures(var4.texture(), 0, var5.texture(), 1.0);
                  } else {
                     var6.clearColorTexture(var4.texture(), 0);
                  }
               }
            }
         }
      }
   }

   public void nvUVNnuu() {
      nuVUnVnVvV.NVnVnNnN var1 = this.uNnUnnuNUnNu;

      try {
         if (var1 != null) {
            try {
               this.UuUVuuUu(var1);
            } finally {
               var1.close();
            }
         }
      } catch (RuntimeException var11) {
         C00OOC00oO.warn("Failed to finalize capture frame", var11);
         this.vuuuNvNuv = false;
      } finally {
         this.uNnUnnuNUnNu = null;
         this.UnUNVVVNuv = false;
         this.NVNnnvnuunNv = this.uVUVnuvnuVuv;
      }

      this.vuuuNvNuv = this.vuuuNvNuv && uUnuvNvvNU(this.uNNnnnuuuN);
      this.nvUVNnuu = this.nvUVNnuu && uUnuvNvvNU(this.nuUnNvnuUu);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(class_1297 var1, double var2, double var4, double var6, float var8, class_4587 var9) {
      if (this.C00OOC00oO() && this.UnUNVVVNuv && !this.UuuNnUvUuv && !this.nUUVuvU && !NnuVnuNVV.C00OOC00oO() && var1 != null) {
         if (var1 instanceof class_1309) {
            if (this.UuUVuuUu(var1)) {
               this.C00OOC00oO(var1, var2, var4, var6, var8, var9);
            }
         } else if (this.C00OOC00oO(var1)) {
            Objects.requireNonNull(var9, "matrices");
            nuVUnVnVvV.NVnVnNnN var10 = this.uNnUnnuNUnNu;
            class_6367 var11 = this.uNNnnnuuuN;
            if (var10 != null && var11 != null && this.vNVuvnUUnuUn > 0 && this.UvnvNVnnnnNU > 0) {
               GpuTextureView var12 = var11.method_71639();
               if (var12 != null && !var12.isClosed()) {
                  GpuTextureView var13 = var11.method_71640();
                  class_310 var14 = class_310.method_1551();
                  if (var14 != null && var14.field_1687 != null) {
                     class_898 var15 = var14.method_1561();
                     if (var15 != null) {
                        class_4587 var16 = var10.UuUVuuUu(var9);
                        if (var16 != null) {
                           class_243 var17 = var1.method_30950(var8);
                           double var18 = var17.field_1352 - var2;
                           double var20 = var17.field_1351 - var4;
                           double var22 = var17.field_1350 - var6;
                           class_2338 var24 = class_2338.method_49638(var17);
                           int var25 = var14.field_1687.method_8314(class_1944.field_9282, var24);
                           int var26 = var14.field_1687.method_8314(class_1944.field_9284, var24);
                           int var27 = class_765.method_23687(var26, var25);
                           GpuTextureView var28 = RenderSystem.outputColorTextureOverride;
                           GpuTextureView var29 = RenderSystem.outputDepthTextureOverride;
                           RenderSystem.outputColorTextureOverride = var12;
                           RenderSystem.outputDepthTextureOverride = var13;
                           EntityRenderDispatcherAccessor var30 = var15 instanceof EntityRenderDispatcherAccessor var31 ? var31 : null;
                           boolean var45 = var30 != null;
                           boolean var32 = false;
                           if (var30 != null) {
                              var32 = var30.night$getRenderShadows();
                              var30.night$setRenderShadows(false);
                           }

                           this.UuuNnUvUuv = true;
                           boolean var38 = false /* VF: Semaphore variable */;

                           label252: {
                              try {
                                 try {
                                    var38 = true;
                                    var15.method_62424(var1, var18, var20, var22, var8, var16, var10.UuUVuuUu(), var27);
                                    var10.C00OOC00oO();
                                    this.uVUVnuvnuVuv++;
                                    this.vuuuNvNuv = true;
                                 } finally {
                                    var10.uUnuvNvvNU();
                                 }

                                 var38 = false;
                                 break label252;
                              } catch (RuntimeException var43) {
                                 C00OOC00oO.warn("Failed to visuals entity {} into capture framebuffer", var1.method_5477().getString(), var43);
                                 this.vuuuNvNuv = false;
                                 var38 = false;
                              } finally {
                                 if (var38) {
                                    this.UuuNnUvUuv = false;
                                    if (var45) {
                                       var30.night$setRenderShadows(var32);
                                    }

                                    RenderSystem.outputColorTextureOverride = var28;
                                    RenderSystem.outputDepthTextureOverride = var29;
                                 }
                              }

                              this.UuuNnUvUuv = false;
                              if (var45) {
                                 var30.night$setRenderShadows(var32);
                              }

                              RenderSystem.outputColorTextureOverride = var28;
                              RenderSystem.outputDepthTextureOverride = var29;
                              return;
                           }

                           this.UuuNnUvUuv = false;
                           if (var45) {
                              var30.night$setRenderShadows(var32);
                           }

                           RenderSystem.outputColorTextureOverride = var28;
                           RenderSystem.outputDepthTextureOverride = var29;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void C00OOC00oO(class_1297 var1, double var2, double var4, double var6, float var8, class_4587 var9) {
      nuVUnVnVvV.NVnVnNnN var10 = this.uNnUnnuNUnNu;
      class_6367 var11 = this.nuUnNvnuUu;
      if (var10 != null && var11 != null && uUnuvNvvNU(var11) && var9 != null) {
         GpuTextureView var12 = var11.method_71639();
         if (var12 != null && !var12.isClosed()) {
            GpuTextureView var13 = var11.method_71640();
            class_310 var14 = class_310.method_1551();
            if (var14 != null && var14.field_1687 != null) {
               class_898 var15 = var14.method_1561();
               if (var15 != null) {
                  class_4587 var16 = var10.UuUVuuUu(var9);
                  if (var16 != null) {
                     double var17 = class_3532.method_16436(var8, var1.field_6038, var1.method_23317());
                     double var19 = class_3532.method_16436(var8, var1.field_5971, var1.method_23318());
                     double var21 = class_3532.method_16436(var8, var1.field_5989, var1.method_23321());
                     double var23 = var17 - var2;
                     double var25 = var19 - var4;
                     double var27 = var21 - var6;
                     class_2338 var29 = class_2338.method_49637(var17, var19, var21);
                     int var30 = var14.field_1687.method_8314(class_1944.field_9282, var29);
                     int var31 = var14.field_1687.method_8314(class_1944.field_9284, var29);
                     int var32 = class_765.method_23687(var31, var30);
                     GpuTextureView var33 = RenderSystem.outputColorTextureOverride;
                     GpuTextureView var34 = RenderSystem.outputDepthTextureOverride;
                     RenderSystem.outputColorTextureOverride = var12;
                     RenderSystem.outputDepthTextureOverride = var13;
                     EntityRenderDispatcherAccessor var35 = var15 instanceof EntityRenderDispatcherAccessor var36 ? var36 : null;
                     boolean var49 = false;
                     if (var35 != null) {
                        var49 = var35.night$getRenderShadows();
                        var35.night$setRenderShadows(false);
                     }

                     this.nUUVuvU = true;
                     boolean var42 = false /* VF: Semaphore variable */;

                     label187: {
                        try {
                           try {
                              var42 = true;
                              var15.method_62424(var1, var23, var25, var27, var8, var16, var10.UuUVuuUu(), var32);
                              var10.C00OOC00oO();
                              this.nvUVNnuu = true;
                           } finally {
                              var10.uUnuvNvvNU();
                           }

                           var42 = false;
                           break label187;
                        } catch (RuntimeException var47) {
                           C00OOC00oO.warn("Failed to render tagged entity {} into capture framebuffer", var1.method_5477().getString(), var47);
                           this.nvUVNnuu = false;
                           var42 = false;
                        } finally {
                           if (var42) {
                              this.nUUVuvU = false;
                              if (var35 != null) {
                                 var35.night$setRenderShadows(var49);
                              }

                              RenderSystem.outputColorTextureOverride = var33;
                              RenderSystem.outputDepthTextureOverride = var34;
                           }
                        }

                        this.nUUVuvU = false;
                        if (var35 != null) {
                           var35.night$setRenderShadows(var49);
                        }

                        RenderSystem.outputColorTextureOverride = var33;
                        RenderSystem.outputDepthTextureOverride = var34;
                        return;
                     }

                     this.nUUVuvU = false;
                     if (var35 != null) {
                        var35.night$setRenderShadows(var49);
                     }

                     RenderSystem.outputColorTextureOverride = var33;
                     RenderSystem.outputDepthTextureOverride = var34;
                  }
               }
            }
         }
      }
   }

   public boolean UuuNnUvUuv() {
      return this.C00OOC00oO() && this.UnUNVVVNuv && this.vNVuvnUUnuUn > 0 && this.UvnvNVnnnnNU > 0 && uUnuvNvvNU(this.uNNnnnuuuN);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class_4588 UuUVuuUu(class_4588 var1, class_1921 var2, class_10042 var3) {
      if (var1 != null && var2 != null && this.C00OOC00oO() && this.UnUNVVVNuv && !this.UuuNnUvUuv && !this.nUUVuvU && !NnuVnuNVV.C00OOC00oO()) {
         class_1309 var4 = this.C00OOC00oO(var3);
         nuVUnVnVvV.NVnVnNnN var5 = this.uNnUnnuNUnNu;
         class_6367 var6 = this.uNNnnnuuuN;
         if (var4 != null && var5 != null && var6 != null) {
            GpuTextureView var7 = var6.method_71639();
            if (var7 != null && !var7.isClosed()) {
               GpuTextureView var8 = RenderSystem.outputColorTextureOverride;
               GpuTextureView var9 = RenderSystem.outputDepthTextureOverride;
               RenderSystem.outputColorTextureOverride = var7;
               RenderSystem.outputDepthTextureOverride = var6.method_71640();
               boolean var15 = false /* VF: Semaphore variable */;

               class_4588 var18;
               label60: {
                  try {
                     var15 = true;
                     class_4588 var10 = var5.UuUVuuUu(var2);
                     var5.C00OOC00oO();
                     this.uVunuUNVVUUV = var4.method_5628();
                     var18 = class_4720.method_24037(var1, var10);
                     var15 = false;
                     break label60;
                  } catch (RuntimeException var16) {
                     C00OOC00oO.warn("Failed to prepare living layer {} for {}", var2, var4.method_5477().getString(), var16);
                     var18 = var1;
                     var15 = false;
                  } finally {
                     if (var15) {
                        RenderSystem.outputColorTextureOverride = var8;
                        RenderSystem.outputDepthTextureOverride = var9;
                     }
                  }

                  RenderSystem.outputColorTextureOverride = var8;
                  RenderSystem.outputDepthTextureOverride = var9;
                  return var18;
               }

               RenderSystem.outputColorTextureOverride = var8;
               RenderSystem.outputDepthTextureOverride = var9;
               return var18;
            } else {
               return var1;
            }
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   public void UuUVuuUu(class_3887 var1, class_4587 var2, class_4597 var3, int var4, class_10042 var5, float var6, float var7) {
      class_1309 var8 = this.C00OOC00oO(var5);
      if (this.C00OOC00oO() && this.UnUNVVVNuv && !this.UuuNnUvUuv && !this.nUUVuvU && !NnuVnuNVV.C00OOC00oO() && var8 != null) {
         class_4597 var9 = var3x -> this.UuUVuuUu(var3.getBuffer(var3x), var3x, var5);
         var1.method_4199(var2, var9, var4, var5, var6, var7);
      } else {
         var1.method_4199(var2, var3, var4, var5, var6, var7);
      }
   }

   public void UuUVuuUu(class_10042 var1) {
      if (!this.nUUVuvU) {
         if (NnuVnuNVV.C00OOC00oO()) {
            this.uVunuUNVVUUV = Integer.MIN_VALUE;
         } else {
            class_1309 var2 = this.C00OOC00oO(var1);
            if (var2 != null && this.uVunuUNVVUUV == var2.method_5628()) {
               nuVUnVnVvV.NVnVnNnN var3 = this.uNnUnnuNUnNu;
               this.uVunuUNVVUUV = Integer.MIN_VALUE;
               if (var3 != null) {
                  try {
                     this.UuUVuuUu(var3);
                     this.uVUVnuvnuVuv++;
                     this.vuuuNvNuv = true;
                  } catch (RuntimeException var5) {
                     C00OOC00oO.warn("Failed to finish living capture for {}", var2.method_5477().getString(), var5);
                     this.vuuuNvNuv = false;
                  }
               }
            }
         }
      }
   }

   public int nUUVuvU() {
      return this.uVUVnuvnuVuv;
   }

   public int UnUNVVVNuv() {
      return this.NVNnnvnuunNv;
   }

   public int vNVuvnUUnuUn() {
      return this.nNvNUVU.size();
   }

   public int UvnvNVnnnnNU() {
      return this.vNVuvnUUnuUn;
   }

   public int uVUVnuvnuVuv() {
      return this.UvnvNVnnnnNU;
   }

   public void UuUVuuUu(UnVNvNnU var1, int var2, int var3) {
      if (var1 != null && var2 > 0 && var3 > 0) {
         if (this.uUnuvNvvNU()) {
            int var4 = vVvUvVVuuNvV(this.uNNnnnuuuN);
            if (var4 > 0) {
               var1.C00OOC00oO(var4, 0.0F, 0.0F, (float)var2, (float)var3);
            }
         }
      }
   }

   public void UuUVuuUu(int var1, int var2) {
      this.NnUuNNU();
      this.vuuuNvNuv = false;
      if (var1 <= 0 || var2 <= 0 || var1 != this.vNVuvnUUnuUn || var2 != this.UvnvNVnnnnNU) {
         this.UNnVVNvvnVvU();
         this.uVunuUNVVUUV();
         this.vNVuvnUUnuUn = -1;
         this.UvnvNVnnnnNU = -1;
      }
   }

   private boolean uUnuvNvvNU(int var1, int var2) {
      if (var1 > 0 && var2 > 0) {
         class_6367 var3 = this.uNNnnnuuuN;
         if (var3 != null && !uUnuvNvvNU(var3)) {
            this.UNnVVNvvnVvU();
            this.vNVuvnUUnuUn = -1;
            this.UvnvNVnnnnNU = -1;
            var3 = null;
         }

         if (var3 == null) {
            try {
               var3 = new class_6367("night_entity_capture", var1, var2, true);
               this.uNNnnnuuuN = var3;
               this.vNVuvnUUnuUn = var1;
               this.UvnvNVnnnnNU = var2;
            } catch (RuntimeException var6) {
               C00OOC00oO.warn("Failed to create capture framebuffer {}x{}", var1, var2, var6);
               this.uNNnnnuuuN = null;
               this.vNVuvnUUnuUn = -1;
               this.UvnvNVnnnnNU = -1;
               return false;
            }
         }

         if (this.vNVuvnUUnuUn != var1 || this.UvnvNVnnnnNU != var2) {
            try {
               var3.method_1234(var1, var2);
               this.vNVuvnUUnuUn = var1;
               this.UvnvNVnnnnNU = var2;
            } catch (RuntimeException var5) {
               C00OOC00oO.warn("Failed to resize capture framebuffer to {}x{}", var1, var2, var5);
               this.UNnVVNvvnVvU();
               this.vNVuvnUUnuUn = -1;
               this.UvnvNVnnnnNU = -1;
               return false;
            }
         }

         return uUnuvNvvNU(var3);
      } else {
         this.UNnVVNvvnVvU();
         this.vNVuvnUUnuUn = -1;
         this.UvnvNVnnnnNU = -1;
         return false;
      }
   }

   private boolean vVvUvVVuuNvV(int var1, int var2) {
      if (var1 > 0 && var2 > 0) {
         class_6367 var3 = this.nuUnNvnuUu;
         if (var3 != null && !uUnuvNvvNU(var3)) {
            this.uVunuUNVVUUV();
            var3 = null;
         }

         if (var3 == null) {
            try {
               var3 = new class_6367("wild_tagged_capture", var1, var2, true);
               this.nuUnNvnuUu = var3;
            } catch (RuntimeException var6) {
               C00OOC00oO.warn("Failed to create tagged capture framebuffer {}x{}", var1, var2, var6);
               this.nuUnNvnuUu = null;
               return false;
            }
         }

         if (var3.field_1482 != var1 || var3.field_1481 != var2) {
            try {
               var3.method_1234(var1, var2);
            } catch (RuntimeException var5) {
               C00OOC00oO.warn("Failed to resize tagged capture framebuffer to {}x{}", var1, var2, var5);
               this.uVunuUNVVUUV();
               return false;
            }
         }

         return uUnuvNvvNU(var3);
      } else {
         this.uVunuUNVVUUV();
         return false;
      }
   }

   private void uVunuUNVVUUV() {
      class_6367 var1 = this.nuUnNvnuUu;
      if (var1 != null) {
         if (!RenderSystem.isOnRenderThread()) {
            this.nuUnNvnuUu = null;
         } else {
            try {
               var1.method_1238();
            } catch (RuntimeException var3) {
               C00OOC00oO.warn("Failed to delete tagged capture framebuffer", var3);
            }

            this.nuUnNvnuUu = null;
         }
      }
   }

   private void UNnVVNvvnVvU() {
      class_6367 var1 = this.uNNnnnuuuN;
      if (var1 != null || this.UNnVVNvvnVvU != 0) {
         if (!RenderSystem.isOnRenderThread()) {
            this.uNNnnnuuuN = null;
            this.UNnVVNvvnVvU = 0;
         } else {
            if (var1 != null) {
               try {
                  var1.method_1238();
               } catch (RuntimeException var3) {
                  C00OOC00oO.warn("Failed to delete capture framebuffer", var3);
               }

               this.uNNnnnuuuN = null;
            }

            if (this.UNnVVNvvnVvU != 0) {
               GL30.glDeleteFramebuffers(this.UNnVVNvvnVvU);
               this.UNnVVNvvnVvU = 0;
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean UuUVuuUu(class_276 var1) {
      if (var1.method_30277() instanceof class_10868 var2) {
         int var19 = var2.method_68427();
         int var4 = var1.method_30278() instanceof class_10868 var5 ? var5.method_68427() : 0;
         if (var19 <= 0) {
            return false;
         } else {
            VvuuVNVUn.NVnVnNnN var20 = VvuuVNVUn.UuUVuuUu();
            boolean var14 = false /* VF: Semaphore variable */;

            boolean var7;
            label157: {
               label158: {
                  boolean var24;
                  try {
                     label144: {
                        MemoryStack var21;
                        label159: {
                           var14 = true;
                           var21 = MemoryStack.stackPush();

                           try {
                              if (this.UNnVVNvvnVvU == 0) {
                                 this.UNnVVNvvnVvU = GL30.glGenFramebuffers();
                              }

                              GL30.glBindFramebuffer(36160, this.UNnVVNvvnVvU);
                              GL30.glFramebufferTexture2D(36160, 36064, 3553, var19, 0);
                              GL30.glFramebufferTexture2D(36160, 36096, 3553, var4, 0);
                              GL11.glDrawBuffer(36064);
                              if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                                 var7 = false;
                                 break label159;
                              }

                              GL11.glColorMask(true, true, true, true);
                              GL11.glDepthMask(true);
                              FloatBuffer var22 = var21.floats(0.0F, 0.0F, 0.0F, 0.0F);
                              GL30.glClearBufferfv(6144, 0, var22);
                              if (var4 > 0) {
                                 FloatBuffer var8 = var21.floats(1.0F);
                                 GL30.glClearBufferfv(6145, 0, var8);
                              }

                              var24 = true;
                           } catch (Throwable var16) {
                              if (var21 != null) {
                                 try {
                                    var21.close();
                                 } catch (Throwable var15) {
                                    var16.addSuppressed(var15);
                                 }
                              }

                              throw var16;
                           }

                           if (var21 != null) {
                              var21.close();
                              var14 = false;
                           } else {
                              var14 = false;
                           }
                           break label144;
                        }

                        if (var21 != null) {
                           var21.close();
                           var14 = false;
                        } else {
                           var14 = false;
                        }
                        break label158;
                     }
                  } catch (RuntimeException var17) {
                     C00OOC00oO.warn("Failed to clear capture framebuffer directly", var17);
                     var7 = false;
                     var14 = false;
                     break label157;
                  } finally {
                     if (var14) {
                        if (this.UNnVVNvvnVvU != 0) {
                           GL30.glBindFramebuffer(36160, this.UNnVVNvvnVvU);
                           GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                           GL30.glFramebufferTexture2D(36160, 36096, 3553, 0, 0);
                        }

                        VvuuVNVUn.uUnuvNvvNU(var20);
                     }
                  }

                  if (this.UNnVVNvvnVvU != 0) {
                     GL30.glBindFramebuffer(36160, this.UNnVVNvvnVvU);
                     GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                     GL30.glFramebufferTexture2D(36160, 36096, 3553, 0, 0);
                  }

                  VvuuVNVUn.uUnuvNvvNU(var20);
                  return var24;
               }

               if (this.UNnVVNvvnVvU != 0) {
                  GL30.glBindFramebuffer(36160, this.UNnVVNvvnVvU);
                  GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                  GL30.glFramebufferTexture2D(36160, 36096, 3553, 0, 0);
               }

               VvuuVNVUn.uUnuvNvvNU(var20);
               return var7;
            }

            if (this.UNnVVNvvnVvU != 0) {
               GL30.glBindFramebuffer(36160, this.UNnVVNvvnVvU);
               GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
               GL30.glFramebufferTexture2D(36160, 36096, 3553, 0, 0);
            }

            VvuuVNVUn.uUnuvNvvNU(var20);
            return var7;
         }
      } else {
         return false;
      }
   }

   private boolean C00OOC00oO(class_1297 var1) {
      if (this.uVUuuVnNVU) {
         return true;
      } else {
         for (Predicate var3 : this.VVuuUN.values()) {
            try {
               if (var3.test(var1)) {
                  return true;
               }
            } catch (RuntimeException var5) {
               C00OOC00oO.warn("Entity capture filter failed for {}", var1.method_5477().getString(), var5);
            }
         }

         return false;
      }
   }

   private class_1309 C00OOC00oO(class_10042 var1) {
      if (var1 == null) {
         return null;
      } else {
         int var2 = ((uuUUunvVVu)var1).wild$getEntityId();
         class_310 var3 = class_310.method_1551();
         return (var3 != null && var3.field_1687 != null && var2 != Integer.MIN_VALUE ? var3.field_1687.method_8469(var2) : null) instanceof class_1309 var5
               && this.C00OOC00oO(var5)
            ? var5
            : null;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(nuVUnVnVvV.NVnVnNnN var1) {
      class_6367 var2 = this.uNNnnnuuuN;
      if (var1 != null && var2 != null) {
         GpuTextureView var3 = var2.method_71639();
         if (var3 != null && !var3.isClosed()) {
            GpuTextureView var4 = RenderSystem.outputColorTextureOverride;
            GpuTextureView var5 = RenderSystem.outputDepthTextureOverride;
            RenderSystem.outputColorTextureOverride = var3;
            RenderSystem.outputDepthTextureOverride = var2.method_71640();
            this.UuuNnUvUuv = true;
            boolean var8 = false /* VF: Semaphore variable */;

            try {
               var8 = true;
               var1.uUnuvNvvNU();
               var8 = false;
            } finally {
               if (var8) {
                  this.UuuNnUvUuv = false;
                  RenderSystem.outputColorTextureOverride = var4;
                  RenderSystem.outputDepthTextureOverride = var5;
               }
            }

            this.UuuNnUvUuv = false;
            RenderSystem.outputColorTextureOverride = var4;
            RenderSystem.outputDepthTextureOverride = var5;
         }
      }
   }

   private void uNnUnnuNUnNu() {
      if (!this.C00OOC00oO()) {
         this.vuuuNvNuv = false;
         this.nvUVNnuu = false;
         this.UuuNnUvUuv = false;
         this.nUUVuvU = false;
         this.UnUNVVVNuv = false;
         this.vNVuvnUUnuUn = -1;
         this.UvnvNVnnnnNU = -1;
         this.uVUVnuvnuVuv = 0;
         this.NVNnnvnuunNv = 0;
         this.uVunuUNVVUUV = Integer.MIN_VALUE;
         this.nNvNUVU();
         this.UnUNuUU();
         this.UNnVVNvvnVvU();
         this.uVunuUNVVUUV();
      }
   }

   private void NnUuNNU() {
      this.vuuuNvNuv = false;
      this.nvUVNnuu = false;
      this.UnUNVVVNuv = false;
      this.uVUVnuvnuVuv = 0;
      this.uVunuUNVVUUV = Integer.MIN_VALUE;
      this.nNvNUVU();
   }

   private void nNvNUVU() {
      nuVUnVnVvV.NVnVnNnN var1 = this.uNnUnnuNUnNu;
      if (var1 != null) {
         try {
            try {
               var1.uUnuvNvvNU();
            } catch (RuntimeException var3) {
               C00OOC00oO.warn("Failed to flush capture resources during reset", var3);
            }

            var1.close();
         } catch (RuntimeException var4) {
            C00OOC00oO.warn("Failed to release capture resources", var4);
         }

         this.uNnUnnuNUnNu = null;
      }
   }

   private void UnUNuUU() {
      for (class_9799 var2 : this.nNvNUVU.values()) {
         try {
            var2.close();
         } catch (RuntimeException var4) {
            C00OOC00oO.warn("Failed to close capture layer allocator", var4);
         }
      }

      this.nNvNUVU.clear();
   }

   private static boolean C00OOC00oO(class_276 var0) {
      if (var0 == null) {
         return false;
      } else {
         return var0.method_30277() instanceof class_10868 var2 ? var2.method_68427() > 0 : false;
      }
   }

   private static boolean uUnuvNvvNU(class_276 var0) {
      if (!C00OOC00oO(var0)) {
         return false;
      } else if (!(var0 instanceof class_6367 var1)) {
         return true;
      } else {
         GpuTextureView var2 = var1.method_71639();
         if (var2 != null && !var2.isClosed()) {
            GpuTextureView var3 = var1.method_71640();
            return var3 == null || !var3.isClosed();
         } else {
            return false;
         }
      }
   }

   private static int vVvUvVVuuNvV(class_276 var0) {
      if (var0 == null) {
         return 0;
      } else {
         return var0.method_30277() instanceof class_10868 var1 ? var1.method_68427() : 0;
      }
   }

   private static int uNNnnnuuuN(class_276 var0) {
      if (var0 == null) {
         return 0;
      } else {
         return var0.method_30278() instanceof class_10868 var1 ? var1.method_68427() : 0;
      }
   }

   static final class NVnVnNnN implements AutoCloseable {
      private final class_9799 UuUVuuUu;
      private final SequencedMap<class_1921, class_9799> C00OOC00oO;
      private final class_4598 uUnuvNvvNU;
      private final class_4597 vVvUvVVuuNvV;
      private boolean uNNnnnuuuN;

      NVnVnNnN(class_9799 var1, SequencedMap<class_1921, class_9799> var2) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = class_4597.method_22992(var2, var1);
         this.vVvUvVVuuNvV = this::UuUVuuUu;
      }

      class_4597 UuUVuuUu() {
         return this.vVvUvVVuuNvV;
      }

      class_4588 UuUVuuUu(class_1921 var1) {
         this.C00OOC00oO.computeIfAbsent(var1, var0 -> new class_9799(Math.max(4096, Math.min(var0.method_22722(), 262144))));
         this.uNNnnnuuuN = false;
         return this.uUnuvNvvNU.getBuffer(var1);
      }

      class_4587 UuUVuuUu(class_4587 var1) {
         if (var1 == null) {
            return null;
         } else {
            class_4587 var2 = new class_4587();
            class_4665 var3 = var1.method_23760();
            class_4665 var4 = var2.method_23760();
            var4.method_23761().set(var3.method_23761());
            var4.method_23762().set(var3.method_23762());
            return var2;
         }
      }

      void C00OOC00oO() {
         this.uNNnnnuuuN = false;
      }

      void uUnuvNvvNU() {
         if (!this.uNNnnnuuuN) {
            this.uUnuvNvvNU.method_22993();
            this.UuUVuuUu.method_60809();
            this.C00OOC00oO.values().forEach(class_9799::method_60809);
            this.uNNnnnuuuN = true;
         }
      }

      @Override
      public void close() {
         this.UuUVuuUu.method_60809();
         this.C00OOC00oO.values().forEach(class_9799::method_60809);
      }
   }
}
