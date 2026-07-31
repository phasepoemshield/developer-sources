// Module: ShaderESP
// Category: render
// Original class: Shaderesp
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.render;

import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.RaycastContext.LootTables60;

@ModuleInfo(
   name = "ShaderESP",
   category = Category.RENDER,
   description = "module.shaderESP.desc"
)
public final class Shaderesp extends Module {
   public static final Shaderesp IIlIII1I1Il1I111IlIl1lII = new Shaderesp();
   private final MultiBooleanSetting IIl11l1III1l1IIl1lIIlI1III1 = MultiBooleanSetting.StringHolder_8(
      "module.shaderESP.targets",
      "module.shaderESP.targets.desc",
      List.of(
         "module.shaderESP.players",
         "module.shaderESP.noArmor",
         "module.shaderESP.hostiles",
         "module.shaderESP.passives",
         "module.shaderESP.items",
         "module.shaderESP.crystals"
      )
   );
   private final NumberSetting IlllI1lll11lIl = new NumberSetting(
      "module.shaderESP.maxDistance", 90.0F, 6.0F, 240.0F, 1.0F, "module.shaderESP.maxDistance.desc", "m"
   );
   private final BooleanSetting lllI1l1lIlIIIl1IIl11lIlIIl111 = new BooleanSetting("module.shaderESP.throughWalls", true);
   private final BooleanSetting llII1llIIl = new BooleanSetting("module.shaderESP.ignoreSelf", true);
   private final NumberSetting l1I1III11l11III1lII1ll1II1l = new NumberSetting(
      "module.shaderESP.timeSpeed", 1.0F, 0.0F, 5.0F, 0.05F, "module.shaderESP.timeSpeed.desc", "x"
   );
   private final ModeSetting IIIIlII11llIIIlIlIl = new ModeSetting(
      "module.shaderESP.colorMode", "module.shaderESP.colorMode.desc", "module.shaderESP.sync", "module.shaderESP.custom"
   );
   private final NumberSetting IIl1l1IlII11lI1 = new NumberSetting(
      "module.shaderESP.syncAlpha",
      204.0F,
      0.0F,
      255.0F,
      1.0F,
      "module.shaderESP.syncAlpha.desc",
      "a",
      () -> this.IIIIlII11llIIIlIlIl.ClearHeadersHandler(0),
      null
   );
   private final ColorSetting lIl11II11lIIlll1I1lllIlIIIlII = new ColorSetting(
      "module.shaderESP.outlineColor", new ByteBufferHolder(255, 255, 255)
   );
   private final ColorSetting III1lIll1Il1 = new ColorSetting(
      "module.shaderESP.firstFillColor", new ByteBufferHolder(170, 120, 255, 110), () -> this.IIIIlII11llIIIlIlIl.ClearHeadersHandler(1)
   );
   private final ColorSetting l1IIIlIl11lII11111lIll1 = new ColorSetting(
      "module.shaderESP.secondFillColor", new ByteBufferHolder(60, 210, 255, 110), () -> this.IIIIlII11llIIIlIlIl.ClearHeadersHandler(1)
   );

   private Shaderesp() {
   }

   public boolean ZenithInternal042(Entity Entity) {
      if (!this.Spider() || l11I1I1ll1Illll1I1l1111l1II.player == null || l11I1I1ll1Illll1I1l1111l1II.world == null || Entity == null) {
         return false;
      } else if (this.ZenithInternal101(Entity) || this.ZenithInternal084(Entity)) {
         return false;
      } else {
         return !this.lllI1l1lIlIIIl1IIl11lIlIIl111.Spider() && !this.ZenithInternal061(Entity) ? false : this.StringHolder_19(Entity);
      }
   }

   public boolean lllll111llI1l1111I11lI1Il1() {
      return this.lllI1l1lIlIIIl1IIl11lIlIIl111.Spider();
   }

   public float l11I1Il11I11l1I1() {
      return StringHolder_8(this.l1I1III11l11III1lII1ll1II1l);
   }

   public int l11llI111I1Il() {
      return this.lIl11II11lIIlll1I1lllIlIIIlII.II11II1lIlIl1IIIlII1I1();
   }

   public int llllll1I1II1ll11I11l1l() {
      return this.IIIIlII11llIIIlIlIl.ClearHeadersHandler(0)
         ? ZenithClient.getInstance()
            .floatHolder_3()
            .getCurrentStyle()
            .getPrimaryColor()
            .l1IllIl1l1llIlI11I11Il1l1l1lI1()
            .ZenithInternal039(this.IIl1l1IlII11lI1.lll1lI1llll1IIllIIIII1lll() / 255.0F)
            .lllIlll1Ill111l111Il11II11lII()
         : this.III1lIll1Il1.II11II1lIlIl1IIIlII1I1();
   }

   public int l11lIll1IlIII1II1I1I11lIII() {
      return this.IIIIlII11llIIIlIlIl.ClearHeadersHandler(0)
         ? ZenithClient.getInstance()
            .floatHolder_3()
            .getCurrentStyle()
            .getSecondaryPrimaryColor()
            .l1IllIl1l1llIlI11I11Il1l1l1lI1()
            .ZenithInternal039(this.IIl1l1IlII11lI1.lll1lI1llll1IIllIIIII1lll() / 255.0F)
            .lllIlll1Ill111l111Il11II11lII()
         : this.l1IIIlIl11lII11111lIll1.II11II1lIlIl1IIIlII1I1();
   }

   private static float StringHolder_8(NumberSetting illil1lill1llll11) {
      return illil1lill1llll11.lll1lI1llll1IIllIIIII1lll();
   }

   private boolean ZenithInternal101(Entity Entity) {
      if (Entity.isRemoved()) {
         return true;
      } else {
         return this.llII1llIIl.Spider() && Entity == l11I1I1ll1Illll1I1l1111l1II.player
            ? true
            : Entity == l11I1I1ll1Illll1I1l1111l1II.getCameraEntity() && l11I1I1ll1Illll1I1l1111l1II.options.getPerspective().isFirstPerson();
      }
   }

   private boolean ZenithInternal084(Entity Entity) {
      float f = StringHolder_8(this.IlllI1lll11lIl);
      return l11I1I1ll1Illll1I1l1111l1II.player.squaredDistanceTo(Entity) > (double)(f * f);
   }

   private boolean StringHolder_19(Entity Entity) {
      if (Entity instanceof PlayerEntity PlayerEntity) {
         return ZenithInternal066.byteHolder(PlayerEntity) == 0.0F
            ? this.IIl11l1III1l1IIl1lIIlI1III1.EventImpl_30("module.shaderESP.noArmor")
            : this.IIl11l1III1l1IIl1lIIlI1III1.EventImpl_30("module.shaderESP.players");
      } else if (Entity instanceof EndCrystalEntity) {
         return this.IIl11l1III1l1IIl1lIIlI1III1.EventImpl_30("module.shaderESP.crystals");
      } else if (Entity instanceof ItemEntity) {
         return this.IIl11l1III1l1IIl1lIIlI1III1.EventImpl_30("module.shaderESP.items");
      } else if (Entity instanceof HostileEntity) {
         return this.IIl11l1III1l1IIl1lIIlI1III1.EventImpl_30("module.shaderESP.hostiles");
      } else {
         return Entity instanceof AnimalEntity
            ? this.IIl11l1III1l1IIl1lIIlI1III1.EventImpl_30("module.shaderESP.passives")
            : Entity instanceof LivingEntity && this.IIl11l1III1l1IIl1lIIlI1III1.EventImpl_30("module.shaderESP.hostiles");
      }
   }

   private boolean ZenithInternal061(Entity Entity) {
      if (l11I1I1ll1Illll1I1l1111l1II.world != null
         && l11I1I1ll1Illll1I1l1111l1II.gameRenderer != null
         && l11I1I1ll1Illll1I1l1111l1II.gameRenderer.getCamera() != null) {
         net.minecraft.util.math.Vec3d Vec3dxxx = l11I1I1ll1Illll1I1l1111l1II.gameRenderer.getCamera().getPos();
         net.minecraft.util.math.Box Box = Entity.getBoundingBox();
         net.minecraft.util.math.Vec3d Vec3dx = Box.getCenter();
         net.minecraft.util.math.Vec3d Vec3dxx = new net.minecraft.util.math.Vec3d(
            Vec3dx.x, Math.min(Box.maxY - 0.05, Entity.getEyeY()), Vec3dx.z
         );
         net.minecraft.util.math.Vec3d Vec3dxxx = new net.minecraft.util.math.Vec3d(Vec3dx.x, Box.minY + 0.1, Vec3dx.z);
         return this.EventTarget(Vec3dxxx, Vec3dx) || this.EventTarget(Vec3dxxx, Vec3dxx) || this.EventTarget(Vec3dxxx, Vec3dxxx);
      } else {
         return true;
      }
   }

   private boolean EventTarget(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d) {
      BlockHitResult BlockHitResult = l11I1I1ll1Illll1I1l1111l1II.world
         .raycast(
            new RaycastContext(Vec3dx, Vec3d, LootTables60.COLLIDER, net.minecraft.world.RaycastContext.class_242.NONE, l11I1I1ll1Illll1I1l1111l1II.player)
         );
      return BlockHitResult.getType() == net.minecraft.util.hit.HitResult.class_240.MISS
         || BlockHitResult.getPos().squaredDistanceTo(Vec3dx) + 1.0E-4 >= Vec3d.squaredDistanceTo(Vec3dx);
   }
}
