package zenith;

import zenith.hud.*;

import com.mojang.blaze3d.platform.GlStateManager.AdvancementTabType4;
import com.mojang.blaze3d.platform.GlStateManager.AdvancementTabType5;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Map.Entry;
import java.util.stream.StreamSupport;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.entity.projectile.thrown.EggEntity;
import net.minecraft.entity.projectile.thrown.ExperienceBottleEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.entity.projectile.thrown.PotionEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.EggItem;
import net.minecraft.item.EnderPearlItem;
import net.minecraft.item.ExperienceBottleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SnowballItem;
import net.minecraft.item.SplashPotionItem;
import net.minecraft.item.TridentItem;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.Identifier;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.MathHelper;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.component.type.ChargedProjectilesComponent;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.client.render.VertexFormat.LootPool96;
import net.minecraft.world.RaycastContext.LootTables60;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

@ModuleInfo(
   name = "Predictions",
   category = Category.RENDER,
   description = "Показывает куда упадет предмет"
)
public final class Predictions extends Module {
   private final BooleanSetting I11IllIll1l1111111lI = new BooleanSetting(
      "module.predictions.renderItemEntity", "module.predictions.renderItemEntity.desc", true
   );
   private final List<Predictions$II1Il11l111II11IIl> Illll1Illl1lll111II1lIIl = new ArrayList<>();
   private final List<Predictions$EventBus> I11llI1l11ll = new ArrayList<>();
   private final Map<Integer, Long> lI1llII1lI1l1IIlIIIlIll1I111I = new HashMap<>();
   private final Random IlIIl1Ill1II11l1 = new Random();
   public static final Predictions l1l1IIIIl1IIllIIIlI = new Predictions();
   private static final Identifier llI1IllI1l1IIl1I111I = Identifier.of("zenith", "textures/crosshair.png");

   private Predictions() {
   }

   @EventTarget
   public void StringHolder_8(EventImpl_2 i1i11liii111lill1) {
      long i = System.currentTimeMillis();

      for (Predictions$EventBus li111l1l1i1l1$l1i1illlili : this.I11llI1l11ll) {
         li111l1l1i1l1$l1i1illlili.Coordinates();
         li111l1l1i1l1$l1i1illlili.Coordinates();
         li111l1l1i1l1$l1i1illlili.Coordinates();
      }

      this.I11llI1l11ll.removeIf(li111l1l1i1l1$l1i1illlili -> i - li111l1l1i1l1$l1i1illlilix.II1lI11IIllIIIlII11Il11 > 600L);
   }

   @EventTarget
   public void onDraw(EventImpl_5 i1iilll1lili11lll11l11li1l) {
      for (Predictions$II1Il11l111II11IIl li111l1l1i1l1$ii1il11l111ii11iil : this.Illll1Illl1lll111II1lIIl) {
         net.minecraft.util.math.Vec3d Vec3d = ZenithInternal094.ListHolder_6(li111l1l1i1l1$ii1il11l111ii11iil.ll1ll1l11I11lIl1I1lll);
         int i = li111l1l1i1l1$ii1il11l111ii11iil.llIII1Il1l1l11lI1IlIIllII1;
         if (ZenithInternal094.SecureRandomHolder_2(li111l1l1i1l1$ii1il11l111ii11iil.ll1ll1l11I11lIl1I1lll)) {
            ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
            Font font = Fonts.NEW_MEDIUM.getFont(7.0F);
            double d0 = (double)(i * 50) / 1000.0;
            String s = String.format("%.1f", d0) + " сек";
            float f = font.width(s);
            float f1 = 11.2F;
            float f2 = 2.0F;
            float f3 = (float)Vec3d.getX();
            float f4 = (float)Vec3d.getY();
            float f5 = f1 + f2 + f;
            float f6 = f3 - f5 / 2.0F;
            float f7 = f4 - f1 / 2.0F;
            float f8 = f6 - f2;
            float f9 = f7 - f2;
            float f10 = f5 + f2 * 2.0F;
            float f11 = f1 + f2 * 2.0F;
            this.pushCenteredScale(i1iilll1lili11lll11l11li1l.HitParticles(), f3, f4, 1.0F, 1.0F);
            floatHolder_5 iil11iill1il1l1llilll1l1i1i1 = floatHolder_5.StringHolder_30(Interface.lIl111ll1l111lIIlIlI1I1() * 0.6F);
            floatHolder_8.Event(
               i1iilll1lili11lll11l11li1l.HitParticles().getMatrices(),
               f8,
               f9,
               f10,
               f11,
               22.0F,
               iil11iill1il1l1llilll1l1i1i1,
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl
            );
            i1iilll1lili11lll11l11li1l.HitParticles()
               .StringHolder_8(f8, f9, f10, f11, iil11iill1il1l1llilll1l1i1i1, zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1());
            float f12 = f7 + (f1 - f1) / 2.0F;
            i1iilll1lili11lll11l11li1l.HitParticles().lII1I1l1I11111l1llI1();
            i1iilll1lili11lll11l11li1l.HitParticles().getMatrices().translate(f6, f12, 0.0F);
            i1iilll1lili11lll11l11li1l.HitParticles().getMatrices().scale(0.7F, 0.7F, 1.0F);
            i1iilll1lili11lll11l11li1l.HitParticles().StringHolder_8(li111l1l1i1l1$ii1il11l111ii11iil.l1IlI11IIIlIlIll1I1IllII, 0, 0);
            i1iilll1lili11lll11l11li1l.HitParticles().IIlII1lII1();
            float f13 = f6 + f1 + f2;
            float f14 = f4 - font.height() / 2.0F;
            i1iilll1lili11lll11l11li1l.HitParticles().StringHolder_8(font, s, f13, f14, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1());
            this.method_105(i1iilll1lili11lll11l11li1l.HitParticles());
         }
      }
   }

   private void pushCenteredScale(DrawContextImpl lliii11l1lllil, float f, float f1, float f2, float f3) {
      lliii11l1lllil.lII1I1l1I11111l1llI1();
      lliii11l1lllil.getMatrices().translate(f, f1, 0.0F);
      lliii11l1lllil.getMatrices()
         .scale(f2 * Entityesp.lIIlIlIII1ll11.getSize(), f3 * Entityesp.lIIlIlIII1ll11.getSize(), 1.0F);
      lliii11l1lllil.getMatrices().translate(-f, -f1, 0.0F);
   }

   // $VF: renamed from: pop (zenith.DrawContextImpl) void
   private void method_105(DrawContextImpl lliii11l1lllil) {
      lliii11l1lllil.IIlII1lII1();
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_34 ll1li1l111llllli1) {
      this.Illll1Illl1lll111II1lIIl.clear();
      this.StringHolder_8(
         ll1li1l111llllli1.Norender(),
         StreamSupport.<ItemStack>stream(l11I1I1ll1Illll1I1l1111l1II.player.getHandItems().spliterator(), false).toList()
      );
      ArrayList arraylist = new ArrayList();
      this.lI1I1lIIllllll1II1l1Illll()
         .forEach(
            Entity -> {
               net.minecraft.util.math.Vec3d Vec3dxxx = Entity.getVelocity();
               net.minecraft.util.math.Vec3d Vec3dx = Entity.getPos();
               int i = 0;
               ArrayList arraylist1 = new ArrayList();
               arraylist1.add(Vec3dx);

               for (int j = 0; j < 300; j++) {
                  net.minecraft.util.math.Vec3d Vec3dxx = Vec3dx;
                  Vec3dx = Vec3dx.add(Vec3dxxx);
                  Vec3dxxx = this.StringHolder_8(Entity, Vec3dxx, Vec3dxxx);
                  BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(Vec3dxx, Vec3dx, LootTables60.COLLIDER, Entity);
                  if (!BlockHitResult.getType().equals(net.minecraft.util.hit.HitResult.class_240.MISS)) {
                     Vec3dx = BlockHitResult.getPos();
                  }

                  arraylist1.add(Vec3dx);
                  net.minecraft.util.math.Vec3d Vec3dxxx = Vec3dx;
                  boolean flag = ZenithInternal066.l1IlIIllIIl1I1IlII1ll1III1I11().filter(Entity -> {
                     if (Entityx instanceof LivingEntity LivingEntity && LivingEntity != l11I1I1ll1Illll1I1l1111l1II.player && LivingEntity.isAlive()) {
                        return true;
                     }

                     return false;
                  }).anyMatch(Entity -> Entityx.getBoundingBox().expand(0.25).intersects(Vec3dx, Vec3d));
                  if (BlockHitResult.getType().equals(net.minecraft.util.hit.HitResult.class_240.BLOCK)
                     || Vec3dx.y < -128.0
                     || flag
                     || BlockHitResult.getType().equals(net.minecraft.util.hit.HitResult.class_240.ENTITY)) {
                     this.StringHolder_8(Entity, Vec3dx, i);
                     break;
                  }

                  i++;
               }

               arraylist.add(arraylist1);
            }
         );
      if (!arraylist.isEmpty()) {
         this.ZenithException_2(arraylist);
      }
   }

   private void ZenithException_2(List<List<net.minecraft.util.math.Vec3d>> list) {
      Camera Camera = l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera;
      net.minecraft.util.math.Vec3d Vec3dxxx = Camera.getPos();
      float f = Camera.getPitch();
      float f1 = Camera.getYaw();
      GL11.glEnable(2881);
      RenderSystem.enableBlend();
      RenderSystem.disableCull();
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.blendFuncSeparate(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE, AdvancementTabType5.ZERO, AdvancementTabType4.ONE);
      RenderSystem.setShaderTexture(0, ListHolder_2.l1llII11lIIIll11Ill111IlIl);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
      double d0 = 0.1;

      for (List list1 : list) {
         int i = list1.size();
         if (i >= 2) {
            ArrayList arraylist = new ArrayList();
            arraylist.add((net.minecraft.util.math.Vec3d)list1.getFirst());

            for (int j = 1; j < i; j++) {
               net.minecraft.util.math.Vec3d Vec3dx = (net.minecraft.util.math.Vec3d)list1.get(j - 1);
               net.minecraft.util.math.Vec3d Vec3dxx = (net.minecraft.util.math.Vec3d)list1.get(j);
               double d1 = Vec3dx.distanceTo(Vec3dxx);
               if (d1 > 0.1) {
                  int k = (int)Math.ceil(d1 / 0.1);

                  for (int l = 1; l <= k; l++) {
                     arraylist.add(Vec3dx.lerp(Vec3dxx, (double)l / (double)k));
                  }
               } else {
                  arraylist.add(Vec3dxx);
               }
            }

            int i1 = arraylist.size();

            for (int j1 = 0; j1 < i1; j1++) {
               float f3 = (float)j1 / (float)i1;
               float f4 = MathHelper.clamp((float)j1 / 25.0F, 0.0F, 1.0F) * 0.85F;
               if (!(f4 < 0.02F)) {
                  float f2 = 0.3F;
                  net.minecraft.util.math.Vec3d Vec3dx = ((net.minecraft.util.math.Vec3d)arraylist.get(j1)).subtract(Vec3dxxx);
                  ByteBufferHolder il1iliilli1l1iill = ZenithClient.getInstance()
                     .floatHolder_3()
                     .getClientColor(j1);
                  this.StringHolder_8(BufferBuilder, f, f1, Vec3dx, f2 * 1.8F, f4, il1iliilli1l1iill);
                  this.StringHolder_8(BufferBuilder, f, f1, Vec3dx, f2, f4, il1iliilli1l1iill);
               }
            }
         }
      }

      net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
      GL11.glDisable(2881);
   }

   private void StringHolder_8(
      net.minecraft.client.render.BufferBuilder BufferBuilder, float f, float f1, net.minecraft.util.math.Vec3d Vec3d, float f2, float f3, ByteBufferHolder il1iliilli1l1iill
   ) {
      MatrixStack MatrixStack = new MatrixStack();
      MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(f));
      MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(f1 + 180.0F));
      MatrixStack.translate(Vec3d.x, Vec3d.y, Vec3d.z);
      MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-f1));
      MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(f));
      Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
      int i = (int)(f3 * 255.0F) << 24
         | il1iliilli1l1iill.IlIIlllIIIlllI1Il1Il11llI1lll() << 16
         | il1iliilli1l1iill.llI11I1ll11IlI() << 8
         | il1iliilli1l1iill.III11IllIIIIlII1Il1IIlI();
      float f4 = f2 / 2.0F;
      BufferBuilder.vertex(matrix4f, f4, -f4, 0.0F).texture(0.0F, 1.0F).color(i);
      BufferBuilder.vertex(matrix4f, -f4, -f4, 0.0F).texture(1.0F, 1.0F).color(i);
      BufferBuilder.vertex(matrix4f, -f4, f4, 0.0F).texture(1.0F, 0.0F).color(i);
      BufferBuilder.vertex(matrix4f, f4, f4, 0.0F).texture(0.0F, 0.0F).color(i);
   }

   private void ByteBufferHolder_2(Entity Entity) {
      int i = Entity.getId();
      long j = System.currentTimeMillis();
      if (!this.lI1llII1lI1l1IIlIIIlIll1I111I.containsKey(i) || j - this.lI1llII1lI1l1IIlIIIlIll1I111I.get(i) >= 20L) {
         this.lI1llII1lI1l1IIlIIIlIll1I111I.put(i, j);
         net.minecraft.util.math.Vec3d Vec3dx = Entity.getPos();
         net.minecraft.util.math.Vec3d Vec3dx = Entity.getVelocity().normalize().multiply(-0.05);

         for (int k = 0; k < 3; k++) {
            double d0 = (this.IlIIl1Ill1II11l1.nextDouble() - 0.5) * 0.35;
            double d1 = (this.IlIIl1Ill1II11l1.nextDouble() - 0.5) * 0.35;
            double d2 = (this.IlIIl1Ill1II11l1.nextDouble() - 0.5) * 0.35;
            double d3 = Vec3dx.x + (this.IlIIl1Ill1II11l1.nextDouble() - 0.5) * 0.06;
            double d4 = Vec3dx.y + (this.IlIIl1Ill1II11l1.nextDouble() - 0.5) * 0.06 - 0.01;
            double d5 = Vec3dx.z + (this.IlIIl1Ill1II11l1.nextDouble() - 0.5) * 0.06;
            this.I11llI1l11ll
               .add(
                  new Predictions$EventBus(
                     Vec3dx.x + d0, Vec3dx.y + d1, Vec3dx.z + d2, d3, d4, d5, this.IlIIl1Ill1II11l1.nextInt(90), j
                  )
               );
         }

         this.lI1llII1lI1l1IIlIIIlIll1I111I.entrySet().removeIf(entry -> j - entry.getValue() > 5000L);
      }
   }

   private void EventBus(MatrixStack MatrixStack) {
      if (!this.I11llI1l11ll.isEmpty()) {
         long i = System.currentTimeMillis();
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.disableDepthTest();
         RenderSystem.blendFuncSeparate(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE, AdvancementTabType5.ZERO, AdvancementTabType4.ONE);
         RenderSystem.setShaderTexture(0, ListHolder_2.l1llII11lIIIll11Ill111IlIl);
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
         Camera Camera = l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera;

         for (Predictions$EventBus li111l1l1i1l1$l1i1illlili : this.I11llI1l11ll) {
            long j = i - li111l1l1i1l1$l1i1illlili.II1lI11IIllIIIlII11Il11;
            float f = (float)j / 600.0F;
            float f1;
            if (f < 0.2F) {
               f1 = f / 0.2F;
            } else {
               f1 = 1.0F - (f - 0.2F) / 0.8F;
            }

            f1 = MathHelper.clamp(f1, 0.0F, 1.0F);
            float f2 = 0.27F * (1.0F - f * 0.6F);
            double d0 = li111l1l1i1l1$l1i1illlili.l1I1l1lIlIl1l1IlI1l11l - Camera.getPos().x;
            double d1 = li111l1l1i1l1$l1i1illlili.I1lllI11lI1I11Il1Il11I11 - Camera.getPos().y;
            double d2 = li111l1l1i1l1$l1i1illlili.III1ll11Il - Camera.getPos().z;
            MatrixStack MatrixStack = new MatrixStack();
            MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(Camera.getPitch()));
            MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(Camera.getYaw() + 180.0F));
            MatrixStack.translate(d0, d1, d2);
            MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-Camera.getYaw()));
            MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(Camera.getPitch()));
            Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
            int k = ZenithClient.getInstance()
               .floatHolder_3()
               .getClientColor(li111l1l1i1l1$l1i1illlili.lIIIlI1111lll11lI)
               .ZenithInternal039(f1)
               .lllIlll1Ill111l111Il11II11lII();
            BufferBuilder.vertex(matrix4f, -f2 / 2.0F, -f2 / 2.0F, 0.0F).texture(0.0F, 0.0F).color(k);
            BufferBuilder.vertex(matrix4f, -f2 / 2.0F, f2 / 2.0F, 0.0F).texture(0.0F, 1.0F).color(k);
            BufferBuilder.vertex(matrix4f, f2 / 2.0F, f2 / 2.0F, 0.0F).texture(1.0F, 1.0F).color(k);
            BufferBuilder.vertex(matrix4f, f2 / 2.0F, -f2 / 2.0F, 0.0F).texture(1.0F, 0.0F).color(k);
         }

         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         RenderSystem.enableDepthTest();
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
      }
   }

   public void StringHolder_8(MatrixStack MatrixStack, List<ItemStack> list) {
      Item Item = l11I1I1ll1Illll1I1l1111l1II.player.getActiveItem().getItem();
      Iterator iterator = list.iterator();
      if (iterator.hasNext()) {
         ItemStack ItemStack = (ItemStack)iterator.next();
         List list1 = this.StringHolder_8(ItemStack, Item, ZenithInternal131.ll1II1l1lII11IlII1());
         if (list1 != null) {
            list1 = list1.stream().filter(Objects::nonNull).toList();
            if (!list1.isEmpty()) {
               this.EventBus(MatrixStack, list1);
            }
         }
      }
   }

   public List<net.minecraft.util.hit.HitResult> StringHolder_8(ItemStack ItemStack, Item Item, floatHolder_6 il1ll111liili1ll11liil) {
      Object object1;
      Objects.requireNonNull(object1);
      Object object = object1;

      ItemStack.getItem();
      return (List<net.minecraft.util.hit.HitResult>)(switch (object) {
         case ExperienceBottleItem ExperienceBottleItem -> this.StringHolder_8(
         new ExperienceBottleEntity(l11I1I1ll1Illll1I1l1111l1II.world, l11I1I1ll1Illll1I1l1111l1II.player, ItemStack), il1ll111liili1ll11liil, 0.8
      );
         case SplashPotionItem SplashPotionItem -> this.StringHolder_8(
         new PotionEntity(l11I1I1ll1Illll1I1l1111l1II.world, l11I1I1ll1Illll1I1l1111l1II.player, ItemStack), il1ll111liili1ll11liil, 0.55
      );
         case TridentItem TridentItem when TridentItem.equals(Item) && l11I1I1ll1Illll1I1l1111l1II.player.getItemUseTime() >= 10 -> this.StringHolder_8(
         new TridentEntity(l11I1I1ll1Illll1I1l1111l1II.world, l11I1I1ll1Illll1I1l1111l1II.player, ItemStack), il1ll111liili1ll11liil, 2.5
      );
         case SnowballItem SnowballItem -> this.StringHolder_8(
         new SnowballEntity(l11I1I1ll1Illll1I1l1111l1II.world, l11I1I1ll1Illll1I1l1111l1II.player, ItemStack), il1ll111liili1ll11liil, 1.5
      );
         case EggItem EggItem -> this.StringHolder_8(
         new EggEntity(l11I1I1ll1Illll1I1l1111l1II.world, l11I1I1ll1Illll1I1l1111l1II.player, ItemStack), il1ll111liili1ll11liil, 1.5
      );
         case EnderPearlItem EnderPearlItem -> this.StringHolder_8(
         new EnderPearlEntity(l11I1I1ll1Illll1I1l1111l1II.world, l11I1I1ll1Illll1I1l1111l1II.player, ItemStack), il1ll111liili1ll11liil, 1.5
      );
         case BowItem BowItem when BowItem.equals(Item) && l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem() -> this.StringHolder_8(
         new ArrowEntity(l11I1I1ll1Illll1I1l1111l1II.world, l11I1I1ll1Illll1I1l1111l1II.player, ItemStack, ItemStack),
         il1ll111liili1ll11liil,
         (double)(
            3.0F
               * MathHelper.clamp(
                  ((float)l11I1I1ll1Illll1I1l1111l1II.player.getItemUseTime() + l11I1I1ll1Illll1I1l1111l1II.getRenderTickCounter().getTickDelta(false)) / 20.0F,
                  0.0F,
                  1.0F
               )
         )
      );
         case CrossbowItem CrossbowItem when CrossbowItem.isCharged(ItemStack) -> {
            ChargedProjectilesComponent ChargedProjectilesComponent = (ChargedProjectilesComponent)ItemStack.get(DataComponentTypes.CHARGED_PROJECTILES);
            ArrayList arraylist = new ArrayList();
            if (ChargedProjectilesComponent != null) {
               float f = ((ItemStack)ChargedProjectilesComponent.getProjectiles().getFirst()).isOf(Items.FIREWORK_ROCKET) ? 100.0F : 3.0F;
               arraylist.add(
                  this.StringHolder_8(
                     il1ll111liili1ll11liil.lllIl11IIIlIIlI1(),
                     new ArrowEntity(l11I1I1ll1Illll1I1l1111l1II.world, l11I1I1ll1Illll1I1l1111l1II.player, ItemStack, ItemStack),
                     (double)f
                  )
               );
               if (ChargedProjectilesComponent.getProjectiles().size() > 2) {
                  float f1 = l11I1I1ll1Illll1I1l1111l1II.player.getPitch() / 90.0F;
                  float f2 = f1 * f1 * f1 * f1 * f1;
                  float f3 = (float)MathHelper.lerp(Math.abs(f2), 10, 90);
                  float f4 = (float)MathHelper.lerp(f2, 0, 10);
                  arraylist.add(
                     this.StringHolder_8(
                        new floatHolder_6(
                              l11I1I1ll1Illll1I1l1111l1II.player.getYaw() - f3, l11I1I1ll1Illll1I1l1111l1II.player.getPitch() - f4
                           )
                           .lllIl11IIIlIIlI1(),
                        new ArrowEntity(l11I1I1ll1Illll1I1l1111l1II.world, l11I1I1ll1Illll1I1l1111l1II.player, ItemStack, ItemStack),
                        (double)f
                     )
                  );
                  arraylist.add(
                     this.StringHolder_8(
                        new floatHolder_6(
                              l11I1I1ll1Illll1I1l1111l1II.player.getYaw() + f3, l11I1I1ll1Illll1I1l1111l1II.player.getPitch() - f4
                           )
                           .lllIl11IIIlIIlI1(),
                        new ArrowEntity(l11I1I1ll1Illll1I1l1111l1II.world, l11I1I1ll1Illll1I1l1111l1II.player, ItemStack, ItemStack),
                        (double)f
                     )
                  );
               }
            }

            yield arraylist;
         }
         default -> null;
      });
   }

   public void EventBus(MatrixStack MatrixStack, List<net.minecraft.util.hit.HitResult> list) {
      Camera Camera = l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera;
      RenderSystem.enableBlend();
      RenderSystem.disableCull();
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.setShaderTexture(0, llI1IllI1l1IIl1I111I);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);

      for (net.minecraft.util.hit.HitResult HitResult : list) {
         net.minecraft.util.math.Vec3d Vec3d = HitResult.getPos().subtract(Camera.getPos());
         ByteBufferHolder il1iliilli1l1iill = HitResult.getType().equals(net.minecraft.util.hit.HitResult.class_240.ENTITY)
            ? ByteBufferHolder.lIlll1llI1l11I1ll11llIll111I
            : ZenithClient.getInstance().floatHolder_3().getClientColor(90);
         float f = 0.6F;
         Direction Direction = this.StringHolder_8(HitResult);
         MatrixStack.push();
         MatrixStack.translate(Vec3d.x, Vec3d.y, Vec3d.z);
         switch (Direction) {
            case UP:
            default:
               break;
            case DOWN:
               MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(180.0F));
               break;
            case NORTH:
               MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-90.0F));
               break;
            case SOUTH:
               MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0F));
               break;
            case WEST:
               MatrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(-90.0F));
               break;
            case EAST:
               MatrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(90.0F));
         }

         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         int i = il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII();
         float f1 = f / 2.0F;
         BufferBuilder.vertex(matrix4f, -f1, 0.0F, -f1).texture(0.0F, 0.0F).color(i);
         BufferBuilder.vertex(matrix4f, -f1, 0.0F, f1).texture(0.0F, 1.0F).color(i);
         BufferBuilder.vertex(matrix4f, f1, 0.0F, f1).texture(1.0F, 1.0F).color(i);
         BufferBuilder.vertex(matrix4f, f1, 0.0F, -f1).texture(1.0F, 0.0F).color(i);
         MatrixStack.pop();
      }

      net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
   }

   public List<Entity> lI1I1lIIllllll1II1l1Illll() {
      return ZenithInternal066.l1IlIIllIIl1I1IlII1ll1III1I11()
         .filter(
            Entity -> (
                     Entity instanceof PersistentProjectileEntity
                        || Entity instanceof ThrownItemEntity
                        || Entity instanceof ItemEntity && this.I11IllIll1l1111111lI.Spider()
                  )
                  && !this.ConnectThread(Entity)
         )
         .toList();
   }

   public List<net.minecraft.util.hit.HitResult> StringHolder_8(ProjectileEntity ProjectileEntity, floatHolder_6 il1ll111liili1ll11liil, double d0) {
      return new ArrayList<>(Collections.singleton(this.StringHolder_8(il1ll111liili1ll11liil.lllIl11IIIlIIlI1(), ProjectileEntity, d0)));
   }

   public List<net.minecraft.util.hit.HitResult> StringHolder_8(ProjectileEntity ProjectileEntity, double d0) {
      return this.StringHolder_8(ProjectileEntity, ZenithInternal131.ll1II1l1lII11IlII1(), d0);
   }

   public List<net.minecraft.util.hit.HitResult> StringHolder_8(
      ItemStack ItemStack, floatHolder_6 il1ll111liili1ll11liil, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, int i
   ) {
      if (ItemStack.getItem() instanceof BowItem && l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem()) {
         float f = (float)l11I1I1ll1Illll1I1l1111l1II.player.getItemUseTime() + l11I1I1ll1Illll1I1l1111l1II.getRenderTickCounter().getTickDelta(false) + (float)i;
         double d0 = (double)(3.0F * MathHelper.clamp(f / 20.0F, 0.0F, 1.0F));
         net.minecraft.util.hit.HitResult HitResult = this.StringHolder_8(
            Vec3dx,
            Vec3d,
            il1ll111liili1ll11liil.lllIl11IIIlIIlI1(),
            new ArrowEntity(l11I1I1ll1Illll1I1l1111l1II.world, l11I1I1ll1Illll1I1l1111l1II.player, ItemStack, ItemStack),
            d0
         );
         return (List<net.minecraft.util.hit.HitResult>)(HitResult == null ? List.of() : new ArrayList<>(Collections.singleton(HitResult)));
      } else {
         return null;
      }
   }

   public net.minecraft.util.hit.HitResult StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, ProjectileEntity ProjectileEntity, double d0) {
      net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.player
         .getPos()
         .subtract(
            l11I1I1ll1Illll1I1l1111l1II.player.prevX,
            l11I1I1ll1Illll1I1l1111l1II.player.prevY,
            l11I1I1ll1Illll1I1l1111l1II.player.prevZ
         );
      if (ProjectileEntity instanceof ArrowEntity ArrowEntity && ArrowEntity.getItemStack().getItem() instanceof CrossbowItem) {
         Vec3dx = net.minecraft.util.math.Vec3d.ZERO;
      }

      return this.StringHolder_8(
         l11I1I1ll1Illll1I1l1111l1II.player
            .getEyePos()
            .add(doubleHolder_3.ZenithInternal021(l11I1I1ll1Illll1I1l1111l1II.player).subtract(l11I1I1ll1Illll1I1l1111l1II.player.getPos())),
         Vec3dx,
         Vec3dx,
         ProjectileEntity,
         d0
      );
   }

   public net.minecraft.util.hit.HitResult StringHolder_8(
      net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, ProjectileEntity ProjectileEntity, double d0
   ) {
      double d1 = Vec3d.length();
      return d1 <= 1.0E-6 ? null : this.StringHolder_8(Vec3dxx, Vec3d.multiply(d0 / d1).add(Vec3dx), ProjectileEntity);
   }

   public net.minecraft.util.hit.HitResult StringHolder_8(ProjectileEntity ProjectileEntity) {
      return this.StringHolder_8(ProjectileEntity.getPos(), ProjectileEntity.getVelocity(), ProjectileEntity);
   }

   public net.minecraft.util.hit.HitResult StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, ProjectileEntity ProjectileEntity) {
      for (int i = 0; i < 300; i++) {
         net.minecraft.util.math.Vec3d Vec3dx = Vec3dxx;
         Vec3dxx = Vec3dxx.add(Vec3dx);
         Vec3dx = this.StringHolder_8(ProjectileEntity, Vec3dx, Vec3dx);
         BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(Vec3dx, Vec3dxx, LootTables60.COLLIDER, ProjectileEntity);
         if (!BlockHitResult.getType().equals(net.minecraft.util.hit.HitResult.class_240.MISS)) {
            return BlockHitResult;
         }

         Optional optional = ZenithInternal066.l1IlIIllIIl1I1IlII1ll1III1I11()
            .filter(
               Entity -> {
                  if (Entity != ProjectileEntity.getOwner()
                     && Entity instanceof LivingEntity LivingEntity
                     && LivingEntity != l11I1I1ll1Illll1I1l1111l1II.player
                     && LivingEntity.isAlive()) {
                     return true;
                  }

                  return false;
               }
            )
            .filter(Entity -> Entity.getBoundingBox().expand(0.3).intersects(Vec3d, Vec3dxx))
            .map(Entity -> new EntityHitResult(Entity, Vec3dxx))
            .findAny();
         if (optional.isPresent()) {
            return (net.minecraft.util.hit.HitResult)optional.get();
         }

         if (Vec3dxx.y < -128.0) {
            break;
         }
      }

      return null;
   }

   public net.minecraft.util.math.Vec3d StringHolder_8(Entity object, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d) {
      boolean flag = Objects.requireNonNull(l11I1I1ll1Illll1I1l1111l1II.world)
         .getBlockState(BlockPos.ofFloored(Vec3dx))
         .getFluidState()
         .isIn(FluidTags.WATER);
      Objects.requireNonNull(object);

      float f = switch (object) {
         case TridentEntity TridentEntity -> 0.99F;
         case PersistentProjectileEntity PersistentProjectileEntity when flag -> 0.6F;
         default -> flag ? 0.8F : 0.99F;
      };
      return Vec3d.multiply((double)f).add(0.0, -object.getFinalGravity(), 0.0);
   }

   private void StringHolder_8(Entity object, net.minecraft.util.math.Vec3d Vec3d, int i) {
      Objects.requireNonNull(object);
      switch (object) {
         case ItemEntity ItemEntity:
            this.Illll1Illl1lll111II1lIIl.add(new Predictions$II1Il11l111II11IIl(ItemEntity.getStack(), Vec3d, i));
            break;
         case ThrownItemEntity ThrownItemEntity:
            this.Illll1Illl1lll111II1lIIl.add(new Predictions$II1Il11l111II11IIl(ThrownItemEntity.getStack(), Vec3d, i));
            break;
         case PersistentProjectileEntity PersistentProjectileEntity:
            this.Illll1Illl1lll111II1lIIl.add(new Predictions$II1Il11l111II11IIl(PersistentProjectileEntity.getItemStack(), Vec3d, i));
            break;
      }
   }

   private Direction StringHolder_8(net.minecraft.util.hit.HitResult HitResult) {
      if (HitResult instanceof BlockHitResult BlockHitResult) {
         return BlockHitResult.getSide();
      } else {
         net.minecraft.util.math.Vec3d Vec3d = HitResult.getPos().subtract(l11I1I1ll1Illll1I1l1111l1II.player.getEyePos()).normalize();
         return Direction.getFacing(Vec3d.x, Vec3d.y, Vec3d.z);
      }
   }

   private boolean ConnectThread(Entity Entity) {
      boolean flag = Entity.getX() == Entity.prevX
         && Entity.getY() == Entity.prevY
         && Entity.getZ() == Entity.prevZ;
      boolean flag1 = Entity instanceof ItemEntity
         && (Entity.isOnGround() || ZenithInternal066.StringHolder_8(Entity.getBoundingBox().expand(2.0), Blocks.WATER));
      return flag || flag1;
   }
}
