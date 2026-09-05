package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public final class uUNuVnvNVNUn implements AutoCloseable {
   private final nvvuUNnNvN UuUVuuUu;
   private final oo0OOO00o0O C00OOC00oO;
   private final VvNNUnNNVn uUnuvNvvNU = new VvNNUnNNVn();
   private final Map<String, uUNuVnvNVNUn.NVnVnNnN> vVvUvVVuuNvV = new HashMap<>();

   public uUNuVnvNVNUn(nvvuUNnNvN var1, oo0OOO00o0O var2) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
   }

   public void UuUVuuUu(
      nuVVnvn var1,
      String var2,
      VVvvUnnUnV var3,
      UnVNvNnU var4,
      float var5,
      float var6,
      float var7,
      float var8,
      int var9,
      int var10,
      NUunUunuNV var11,
      float var12
   ) {
      if (var1 != null && var2 != null && var4 != null && !(var7 <= 2.0F) && !(var8 <= 2.0F) && !(var12 <= 0.001F)) {
         VUnvuNuVUUn var13 = var1.uUnuvNvvNU(var2);
         uuUnNVuuVUu var14 = var13 == null ? null : this.UuUVuuUu.UuUVuuUu(var13.C00OOC00oO());
         NUuvnUuVU var15 = UuUVuuUu(var14);
         if (var15 != null) {
            String var16 = "__node_preview_" + var2;
            uUNuVnvNVNUn.NVnVnNnN var17 = this.vVvUvVVuuNvV.get(var16);
            int var18 = var1.uNNnnnuuuN();
            if (var17 == null || var17.version != var18 || !var15.id().equals(var17.pinId)) {
               nuVVnvn var19 = var1.uNNnnnuuuN(var2);
               var19.UuUVuuUu(VnuVUNUv.PREVIEW_ONLY.UuUVuuUu());
               NNnUUVVnuUV var20 = this.C00OOC00oO.UuUVuuUu(var19, var2, var15.id(), var15.type());
               var17 = new uUNuVnvNVNUn.NVnVnNnN(var18, var15.id(), var20 == null ? "" : var20.hash(), var20);
               this.vVvUvVVuuNvV.put(var16, var17);
            }

            NNnUUVVnuUV var26 = var17.compilation;
            if (var26 != null && var26.ok()) {
               var4.uUnuvNvvNU();
               VvuuVNVUn.NVnVnNnN var27 = VvuuVNVUn.UuUVuuUu();

               label84: {
                  try {
                     int var21 = Math.max(32, Math.min(512, (int)Math.ceil(var7)));
                     int var22 = Math.max(32, Math.min(384, (int)Math.ceil(var8)));
                     this.uUnuvNvvNU.UuUVuuUu(var21, var22);
                     if (this.uUnuvNvvNU.nuUnNvnuUu()) {
                        this.uUnuvNvvNU.UuUVuuUu();
                        GL11.glDisable(3089);
                        GlStateManager._enableBlend();
                        GL11.glEnable(3042);
                        GL11.glClearColor(0.008F, 0.01F, 0.015F, 0.0F);
                        GL11.glClear(16384);
                        uVNnuvnVvvu.UuUVuuUu(
                           "__node_preview_" + var17.hash, var26, 0.0F, 0.0F, var21, var22, var21, var22, var7 * 0.5F, var8 * 0.5F, var11, var12
                        );
                        break label84;
                     }
                  } finally {
                     VvuuVNVUn.uUnuvNvvNU(var27);
                  }

                  return;
               }

               var4.C00OOC00oO(this.uUnuvNvvNU.uUnuvNvvNU(), var5, var6, var7, var8, NUunUunuNV.UuUVuuUu(-1, Math.round(255.0F * var12)), true);
            } else {
               UuUVuuUu(var4, var5, var6, var7, var8, var11, var12);
            }
         }
      }
   }

   private static NUuvnUuVU UuUVuuUu(uuUnNVuuVUu var0) {
      if (var0 != null && !var0.nuUnNvnuUu().isEmpty()) {
         for (NUuvnUuVU var2 : var0.nuUnNvnuUu()) {
            if ("color".equals(var2.id()) || "mask".equals(var2.id()) || "value".equals(var2.id())) {
               return var2;
            }
         }

         return var0.nuUnNvnuUu().get(0);
      } else {
         return null;
      }
   }

   private static void UuUVuuUu(UnVNvNnU var0, float var1, float var2, float var3, float var4, NUunUunuNV var5, float var6) {
      int var7 = NUunUunuNV.UuUVuuUu(40, 10, 14, Math.round(132.0F * var6));
      int var8 = NUunUunuNV.UuUVuuUu(255, 134, 146, Math.round(230.0F * var6));
      var0.UuUVuuUu(var1, var2, var3, var4, 8.0F, var7);
      float var9 = nunvNNUnvU.UuUVuuUu(null, vNvnnVvvVUu.UuUVuuUu, "preview error", 9.0F);
      nunvNNUnvU.UuUVuuUu(var0, null, vNvnnVvvVUu.UuUVuuUu, var1 + (var3 - var9) * 0.5F, var2, var4, 9.0F, "preview error", var8);
   }

   @Override
   public void close() {
      this.uUnuvNvvNU.close();
      this.vVvUvVVuuNvV.clear();
   }

   record NVnVnNnN(int version, String pinId, String hash, NNnUUVVnuUV compilation) {
   }
}
