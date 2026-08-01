package l;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;

public class ShaderESP extends Helper242 {
   public static boolean renderingEntityMask;
   private static final float MAX_DISTANCE = 128.0F;
   private final Setting8 targets = new Setting8("Применять на", "Какие сущности рисовать шейдером")
      .method2585("Игроки", "Мобы", "Предметы", "Себя и друзей")
      .method2586("Игроки", "Мобы", "Предметы", "Себя и друзей");
   private final Setting3 drawOutline = new Setting3("Обводка", "Рисовать наружную обводку").method2201(true);
   private final Setting3 drawGlow = new Setting3("Свечение", "Рисовать мягкое свечение").method2201(true);
   private final Setting3 fillModel = new Setting3("Заполнять модель", "Заполнять модель цветом").method2201(true);
   private final Setting5 colorMode = new Setting5("Режим цвета", "Выбор источника цвета").method2381("Тема", "Свой").method2383("Свой");
   private final Setting7 customColor = new Setting7("Цвет", "Кастомный цвет шейдера")
      .method2555(new Color(35, 105, 255, 255).getRGB())
      .method2552(() -> this.colorMode.method2385("Свой"));
   private final Setting2 multDark = new Setting2("Mult Dark", "Затемнение второго цвета градиента").method2078(0.15F, 1.0F).method2086(0.55F);
   private final Setting2 outlineWidth = new Setting2("Толщина обводки", "Толщина внешней линии")
      .method2078(1.0F, 5.0F)
      .method2086(3.0F)
      .method2081(this.drawOutline::method2200);
   private final Setting2 glowPower = new Setting2("Сила свечения", "Сила свечения вокруг модели")
      .method2078(3.0F, 10.0F)
      .method2086(9.0F)
      .method2081(this.drawGlow::method2200);
   private Framebuffer entityBuffer;
   private Framebuffer blurBuffer;
   private Framebuffer effectBuffer;
   private Framebuffer maskBuffer;
   private float lastDistance = 1.0F;
   private boolean renderedThisFrame;

   public ShaderESP() {
      super("ShaderESP", "Shader ESP", Helper269.RENDER);
      this.setup(
         new Helper264[]{
            this.targets, this.drawOutline, this.drawGlow, this.fillModel, this.colorMode, this.customColor, this.multDark, this.outlineWidth, this.glowPower
         }
      );
   }

   public static ShaderESP method2800() {
      return Helper222.method1979(ShaderESP.class);
   }

   @Override
   public void deactivate() {
      this.renderedThisFrame = false;
      this.lastDistance = 1.0F;
      renderingEntityMask = false;
      this.method2808();
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      if (!this.method2801()) {
         this.renderedThisFrame = false;
      } else {
         this.entityBuffer = this.method2806(this.entityBuffer, true);
         this.entityBuffer.clear();
         this.entityBuffer.beginWrite(false);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(true);
         GL11.glClear(256);
         Immediate var2 = mc.getBufferBuilders().getEntityVertexConsumers();
         float var3 = Float.MAX_VALUE;
         boolean var4 = false;
         renderingEntityMask = true;
         mc.getEntityRenderDispatcher().setRenderShadows(false);

         try {
            for (Entity var6 : mc.world.getEntities()) {
               if (this.method2802(var6)) {
                  float var7 = mc.player.distanceTo(var6);
                  if (!(var7 > 128.0F)) {
                     double var8 = MathHelper.lerp((double)var1.method3709(), var6.prevX, var6.getX());
                     double var10 = MathHelper.lerp((double)var1.method3709(), var6.prevY, var6.getY());
                     double var12 = MathHelper.lerp((double)var1.method3709(), var6.prevZ, var6.getZ());
                     mc.getEntityRenderDispatcher()
                        .render(
                           var6,
                           var8,
                           var10,
                           var12,
                           var1.method3709(),
                           var1.method3708(),
                           var2,
                           mc.getEntityRenderDispatcher().getLight(var6, var1.method3709())
                        );
                     var3 = Math.min(var3, var7);
                     var4 = true;
                  }
               }
            }
         } finally {
            renderingEntityMask = false;
            var2.draw();
            mc.getEntityRenderDispatcher().setRenderShadows(mc.options.getEntityShadows().getValue());
            mc.getFramebuffer().beginWrite(false);
            RenderSystem.disableBlend();
         }

         this.renderedThisFrame = var4;
         if (var4) {
            this.lastDistance = Math.max(1.0F, var3);
         }
      }
   }

   @Helper104
   public void onDraw(Event20 var1) {
      if (this.renderedThisFrame && this.entityBuffer != null && this.method2801()) {
         this.blurBuffer = this.method2806(this.blurBuffer, false);
         this.effectBuffer = this.method2806(this.effectBuffer, false);
         this.maskBuffer = this.method2806(this.maskBuffer, false);
         int var2 = this.method2803();
         int var3 = Helper133.method1132(var2, this.multDark.method2082());
         float var4 = Math.min(1.0F, 10.0F / this.lastDistance);
         float var5 = this.glowPower.method2082() * var4;
         float var6 = this.outlineWidth.method2082() * var4;
         float var7 = mc.getWindow().getScaledWidth();
         float var8 = mc.getWindow().getScaledHeight();
         float var9 = mc.getWindow().getFramebufferWidth();
         float var10 = mc.getWindow().getFramebufferHeight();
         Matrix4f var11 = var1.method4058().getMatrices().peek().getPositionMatrix();
         mc.getFramebuffer().beginWrite(false);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableDepthTest();
         RenderSystem.depthMask(false);
         if (this.drawGlow.method2200()) {
            this.method2804(var11, this.entityBuffer, this.effectBuffer, Math.max(var5, 2.0F), var7, var8, var9, var10);
            Helper136.method1176(var11, this.effectBuffer.getColorAttachment(), var2, var3, 0.0F, 0.0F, var7, var8, var9, var10, true);
         }

         if (this.fillModel.method2200()) {
            Helper136.method1176(var11, this.entityBuffer.getColorAttachment(), var2, var3, 0.0F, 0.0F, var7, var8, var9, var10, true);
         }

         if (this.drawOutline.method2200()) {
            this.method2804(var11, this.entityBuffer, this.effectBuffer, Math.max(var6, 1.0F), var7, var8, var9, var10);
            Helper136.method1176(var11, this.effectBuffer.getColorAttachment(), var2, var3, 0.0F, 0.0F, var7, var8, var9, var10, true);
         }

         RenderSystem.depthMask(true);
         RenderSystem.enableDepthTest();
         RenderSystem.disableBlend();
         this.entityBuffer.clear();
         this.blurBuffer.clear();
         this.effectBuffer.clear();
         this.maskBuffer.clear();
         mc.getFramebuffer().beginWrite(false);
         this.renderedThisFrame = false;
      }
   }

   private boolean method2801() {
      return mc.player != null && mc.world != null && (this.drawGlow.method2200() || this.drawOutline.method2200() || this.fillModel.method2200());
   }

   private boolean method2802(Entity var1) {
      if (var1 == null || var1.isRemoved()) {
         return false;
      } else if (var1 instanceof PlayerEntity var2) {
         boolean var3 = var2 == mc.player;
         boolean var4 = Helper309.method3075(var2);
         if (!var3) {
            return var4 && this.targets.method2588("Себя и друзей") ? true : this.targets.method2588("Игроки");
         } else {
            return this.targets.method2588("Себя и друзей") && mc.options.getPerspective() != Perspective.FIRST_PERSON;
         }
      } else if (var1 instanceof MobEntity) {
         return this.targets.method2588("Мобы");
      } else {
         return var1 instanceof ItemEntity ? this.targets.method2588("Предметы") : false;
      }
   }

   private int method2803() {
      return this.colorMode.method2385("Свой") ? this.customColor.method2553() : Helper133.method1162();
   }

   private void method2804(Matrix4f var1, Framebuffer var2, Framebuffer var3, float var4, float var5, float var6, float var7, float var8) {
      this.method2805(var1, var2, var5, var6, var7, var8);
      this.blurBuffer.clear();
      this.blurBuffer.beginWrite(false);
      Helper136.method1175(var1, var2.getColorAttachment(), var2.getColorAttachment(), var4, 1.0F, 0.0F, 0.0F, 0.0F, var5, var6);
      var3.clear();
      var3.beginWrite(false);
      Helper136.method1175(var1, this.blurBuffer.getColorAttachment(), this.maskBuffer.getColorAttachment(), var4, 0.0F, 1.0F, 0.0F, 0.0F, var5, var6);
      mc.getFramebuffer().beginWrite(false);
   }

   private void method2805(Matrix4f var1, Framebuffer var2, float var3, float var4, float var5, float var6) {
      this.maskBuffer.clear();
      this.maskBuffer.beginWrite(false);
      Helper136.method1176(var1, var2.getColorAttachment(), Color.WHITE.getRGB(), Color.WHITE.getRGB(), 0.0F, 0.0F, var3, var4, var5, var6, false);
      mc.getFramebuffer().beginWrite(false);
   }

   private Framebuffer method2806(Framebuffer var1, boolean var2) {
      int var3 = Math.max(1, mc.getWindow().getFramebufferWidth());
      int var4 = Math.max(1, mc.getWindow().getFramebufferHeight());
      if (var1 == null) {
         return this.method2807(var3, var4, var2);
      } else if (var1.textureWidth == var3 && var1.textureHeight == var4 && var1.useDepthAttachment == var2) {
         return var1;
      } else {
         var1.delete();
         return this.method2807(var3, var4, var2);
      }
   }

   private Framebuffer method2807(int var1, int var2, boolean var3) {
      SimpleFramebuffer var4 = new SimpleFramebuffer(var1, var2, var3);
      var4.setClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      var4.setTexFilter(9729);
      return var4;
   }

   private void method2808() {
      this.entityBuffer = this.method2809(this.entityBuffer);
      this.blurBuffer = this.method2809(this.blurBuffer);
      this.effectBuffer = this.method2809(this.effectBuffer);
      this.maskBuffer = this.method2809(this.maskBuffer);
   }

   private Framebuffer method2809(Framebuffer var1) {
      if (var1 != null) {
         var1.delete();
      }

      return null;
   }
}
