package Nursultan;

import com.mojang.blaze3d.systems.RenderSystem;
import minecraft.class06202;
import org.joml.Matrix4f;

public class class09336 implements class11826<class10967> {
   static {
      N();
   }

   public void listen(class10967 var1) {
      class06202 var2 = class06202.Nq();
      class11836 var3 = class11938.k();
      var3.N(var1.N());
      class11925.N(var2.e(), true);
      ((class11216)class11925.L_6).N(class11925.L(), (Matrix4f)class11925.y_3);
      ((class11174)class11190.y_3).M();
      ((class11174)class11190.y_1).N(var1x -> {
         var1x.z("u_projection").N(class11925.L());
         var1x.z("u_view").N(RenderSystem.getModelViewMatrix());
         var1x.M("texture_in").N(var3.N());
      });
      ((class11174)class11190.N_0).M();
      class09080.L();
   }

   private static void N() {
   }
}
