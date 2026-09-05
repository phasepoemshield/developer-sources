package ru.metaculture.protection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_310;
import org.wild.module.api.Module;

public class UUVNUUUnNUv {
   public static class_310 UuUVuuUu = class_310.method_1551();
   public static UUVVvUvuNNn C00OOC00oO = new VUnvnVNv(200, 1.0);
   public static UUVVvUvuNNn uUnuvNvvNU = new VUnvnVNv(500, 1.0);
   public static UUVVvUvuNNn vVvUvVVuuNvV = new VUnvnVNv(500, 1.0);
   public static UUVVvUvuNNn uNNnnnuuuN = new VUnvnVNv(500, 1.0);
   public static UUVVvUvuNNn nuUnNvnuUu = new VUnvnVNv(1000, 1.0);
   public static vvNnnUNnVvn VVuuUN = new vvNnnUNnVvn("Блюр нада?", true);
   public static uvNVnuNn vNUvnnVnUvu = new uvNVnuNn(VUuNVnvnVun.EASE_OUT_SINE, 1500L);
   public static VUvNnVnU uVUuuVnNVU = new VUvNnVnU();
   public static uVVuNvUUV vuuuNvNuv = new uVVuNvUUV();
   public static uVVuNvUUV nvUVNnuu = new uVVuNvUUV();
   public static uVVuNvUUV UuuNnUvUuv = new uVVuNvUUV();
   public static uVVuNvUUV nUUVuvU = new uVVuNvUUV();
   public static uVVuNvUUV UnUNVVVNuv = new uVVuNvUUV();
   public static VnnUvVNuNuVv vNVuvnUUnuUn = null;
   public static float UvnvNVnnnnNU = 0.0F;
   public static float uVUVnuvnuVuv = 0.0F;
   public static boolean NVNnnvnuunNv = false;
   public static boolean uVunuUNVVUUV = false;
   public static boolean UNnVVNvvnVvU = false;
   public static uVNuNUVvn uNnUnnuNUnNu = null;
   public static NVuVVUNUvV NnUuNNU = null;
   public static nNUuNvVn nNvNUVU = null;
   public static Module UnUNuUU = null;
   public static float uUVuVvuNUvnu = 0.0F;
   public static float UvUvUNuvNU = 0.0F;
   public static float c0oOOCcCoC0 = 0.0F;
   public static String VVnVNnunVvu = "";
   public static boolean unNNVVNnvvV = false;
   public static long NuunnvnN = 0L;
   public static boolean NVUunUNUN = false;
   public static long UUVNuUNUvUnV = 0L;
   public static final int vuvnUnVnUNnV = -200;
   public static final int nnuUVNUuvvVU = -201;
   public static boolean nVVUuvuNnUN = false;
   public static float nNnVnUNVV;
   public static float nuunNvv;
   public static float uUVVvVVNvvn;
   public static float vvUVNVvvNUv;
   public static int UuNnnVnuNNV = 0;
   public static int uUVvnUuNvvN = 0;
   public static oOOOo0[] UUuUnNVNuuv;
   public static NvVNvUvunNNu NVuNUuVnVUN;
   public static NvVNvUvunNNu NVuunNnvvvVu;
   public static NvVNvUvunNNu[] vNnNuuvVn;
   public static oOOOo0 VUuuVUnun;
   public static List<Module> vVVuuVVv;
   private static VwVVvwWW nNuVunNUVu;
   public static Set<Module> VuunNUUUvu = new HashSet<>();
   public static Map<Module, uVVuNvUUV> NNUUNUuVNNVn = new HashMap<>();
   public static Map<Module, uVVuNvUUV> VvVvnNUnvuvV = new HashMap<>();
   public static Map<Module, uVVuNvUUV> ccOO0COcoco0 = new HashMap<>();
   public static Map<nNUuNvVn, uVVuNvUUV> NUVvUUVuVNVv = new HashMap<>();

   public static VwVVvwWW UuUVuuUu() {
      if (nNuVunNUVu == null) {
         nNuVunNUVu = new VwVVvwWW();
      }

      return nNuVunNUVu;
   }

   public static uVVuNvUUV UuUVuuUu(Module var0) {
      return NNUUNUuVNNVn.computeIfAbsent(var0, var0x -> new uVVuNvUUV());
   }

   public static uVVuNvUUV C00OOC00oO(Module var0) {
      return VvVvnNUnvuvV.computeIfAbsent(var0, var0x -> new uVVuNvUUV());
   }

   public static uVVuNvUUV uUnuvNvvNU(Module var0) {
      uVVuNvUUV var1 = ccOO0COcoco0.computeIfAbsent(var0, var0x -> new uVVuNvUUV());
      if (var0.uNNnnnuuuN != -1 && var1.vNUvnnVnUvu() == 0.0 && var1.nvUVNnuu() == 0.0) {
         var1.vVvUvVVuuNvV(1.0);
      }

      return var1;
   }

   public static uVVuNvUUV UuUVuuUu(nNUuNvVn var0) {
      return NUVvUUVuVNVv.computeIfAbsent(var0, var1 -> {
         uVVuNvUUV var2 = new uVVuNvUUV();
         float var3 = (var0.vVvUvVVuuNvV - var0.uNNnnnuuuN) / (var0.nuUnNvnuUu - var0.uNNnnnuuuN);
         var2.vVvUvVVuuNvV(var3);
         return var2;
      });
   }
}
