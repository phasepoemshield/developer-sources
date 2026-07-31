// Module: EntityESP
// Category: render
// Original class: Entityesp
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.render;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.text.MutableText;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.component.DataComponentTypes;
import org.joml.Vector4d;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;
import zenith.zov.client.screens.shulker.ShulkerTooltipComponent;

@ModuleInfo(
   name = "EntityESP",
   category = Category.RENDER,
   description = "ESP"
)
public final class Entityesp extends Module {
   public static final Entityesp lIIlIlIII1ll11 = new Entityesp();
   private final NumberSetting l1111l1l1l111 = new NumberSetting(
      "module.entityESP.scaleSetting", 0.7F, 0.5F, 1.0F, 0.1F, "module.entityESP.scaleSetting.desc", "x"
   );
   private final MultiBooleanSetting I1II1II1III11Il1 = MultiBooleanSetting.StringHolder_8(
      "module.entityESP.elements",
      "module.entityESP.elements.desc",
      Arrays.asList(
         "module.entityESP.names",
         "module.entityESP.items",
         "module.entityESP.armor",
         "module.entityESP.triangles",
         "module.entityESP.boxes",
         "module.entityESP.hands",
         "Tracers"
      )
   );
   private final MultiBooleanSetting llII1ll1l1l1Ill1lIllIlI = MultiBooleanSetting.StringHolder_8(
      "module.entityESP.targets",
      "module.entityESP.targets.desc",
      Arrays.asList(
         "module.entityESP.players",
         "module.entityESP.noArmor",
         "module.entityESP.friends",
         "module.entityESP.droppedItems",
         "module.entityESP.mobs",
         "module.entityESP.shulkers"
      )
   );
   private final BooleanSetting I111IIlIl1I1l1 = new BooleanSetting(
      "module.entityESP.blur", "module.entityESP.blurDesc", false, Interface.ll11lIl1IlIl1lI1::lI11l1I1l11
   );
   private final BooleanSetting I1II1lI1I1IlI = new BooleanSetting(
      "module.entityESP.glow", "module.entityESP.glowDesc", false, Interface.ll11lIl1IlIl1lI1::Il11II1l1111lIIlllI1I1llII
   );
   private final BooleanSetting lII1111IlI1l1I1lI11ll = new BooleanSetting(
      "module.entityESP.gradient", "module.entityESP.gradientDesc", true, () -> this.I1II1II1III11Il1.ConstructorHolder(4)
   );
   private final Map<String, Entityesp$EventBus> I11I1lI11l1lIll1I1llI1I11Ill = new HashMap<>();

   public float getSize() {
      return this.l1111l1l1l111.lll1lI1llll1IIllIIIII1lll();
   }

   private Entityesp() {
   }

   public boolean lIIlIll1l1llllll1III111l() {
      return this.lII1111IlI1l1I1lI11ll.Spider();
   }

   public boolean Ill111lI1lIII1l1() {
      return this.Spider() && this.I1II1II1III11Il1.ConstructorHolder(0);
   }

   private void pushCenteredScale(DrawContextImpl lliii11l1lllil, float f, float f1, float f2, float f3) {
      if (lliii11l1lllil != null) {
         try {
            lliii11l1lllil.lII1I1l1I11111l1llI1();
            lliii11l1lllil.getMatrices().translate(f, f1, 0.0F);
            lliii11l1lllil.getMatrices()
               .scale(f2 * this.l1111l1l1l111.lll1lI1llll1IIllIIIII1lll(), f3 * this.l1111l1l1l111.lll1lI1llll1IIllIIIII1lll(), 1.0F);
            lliii11l1lllil.getMatrices().translate(-f, -f1, 0.0F);
         } catch (Exception exception) {
            System.out.println("Строка  82 " + exception.getMessage());
         }
      }
   }

   // $VF: renamed from: pop (zenith.DrawContextImpl) void
   private void removeFrame(DrawContextImpl lliii11l1lllil) {
      if (lliii11l1lllil != null) {
         try {
            lliii11l1lllil.IIlII1lII1();
         } catch (Exception exception) {
            System.out.println("Строка  91 " + exception.getMessage());
         }
      }
   }

   @EventTarget
   public void byteHolder_2(EventImpl_34 ll1li1l111llllli1) {
      if (this.I1II1II1III11Il1.ConstructorHolder(4) || this.I1II1II1III11Il1.ConstructorHolder(6)) {
         try {
            for (Entityesp$EventBus li11lillliiliil1ilill1ii1$l1i1illlili : this.lI1I111ll11lI1I()) {
               Entityesp$II1Il11l111II11IIl li11lillliiliil1ilill1ii1$ii1il11l111ii11iil = li11lillliiliil1ilill1ii1$l1i1illlili.l11I1I11lI1IIl1lll();
               if ((
                     li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.I1Il1l1l111II11Illlll11lIIIIl()
                        || li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.l1IllII11IlIlI1I1l1IIl1I1ll1()
                  )
                  && (
                     !li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.I1Il1l1l111II11Illlll11lIIIIl()
                        || !li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.Il1I1lll1Il11IIl1()
                  )) {
                  try {
                     if (li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.l11ll11l1Il11l1IIII1II()) {
                        ListHolder_2.StringHolder_8(
                           li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.I1Il1l1IIIlllI1(),
                           ZenithClient.getInstance()
                              .floatHolder_3()
                              .getCurrentStyle()
                              .getFriendColor()
                              .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                              .lllIlll1Ill111l111Il11II11lII(),
                           1.0F
                        );
                     } else {
                        ListHolder_2.StringHolder_8(
                           li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.I1Il1l1IIIlllI1(),
                           ZenithClient.getInstance()
                              .floatHolder_3()
                              .getClientColor(0)
                              .ZenithInternal039(0.7F)
                              .lllIlll1Ill111l111Il11II11lII(),
                           ZenithClient.getInstance()
                              .floatHolder_3()
                              .getClientColor(180)
                              .lllIlll1Ill111l111Il11II11lII(),
                           1.0F
                        );
                     }

                     if (this.I1II1II1III11Il1.ConstructorHolder(6)) {
                        net.minecraft.util.math.Vec3d Vec3d = new net.minecraft.util.math.Vec3d(0.0, 0.0, 75.0)
                           .rotateX(-((float)Math.toRadians((double)l11I1I1ll1Illll1I1l1111l1II.gameRenderer.getCamera().getPitch())))
                           .rotateY(-((float)Math.toRadians((double)l11I1I1ll1Illll1I1l1111l1II.gameRenderer.getCamera().getYaw())))
                           .add(Freecam.IlIl11lIIl.llllllIllIIl1Il1lIlI1I1lIIl11l());
                        ListHolder_2.StringHolder_8(
                           Vec3d,
                           li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.I1Il1l1IIIlllI1().getCenter(),
                           ZenithClient.getInstance()
                              .floatHolder_3()
                              .getClientColor(0)
                              .lllIlll1Ill111l111Il11II11lII(),
                           1.5F,
                           false
                        );
                     }
                  } catch (Exception exception) {
                     System.out.println("ESP 3D render error: " + exception.getMessage());
                  }
               }
            }
         } catch (Exception exception1) {
            System.out.println("ESP 3D loop error: " + exception1.getMessage());
         }
      }
   }

   @EventTarget
   public void EventTarget(EventImpl_5 i1iilll1lili11lll11l11li1l) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.world != null
         && l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera != null) {
         DrawContextImpl lliii11l1lllil = i1iilll1lili11lll11l11li1l.HitParticles();
         if (lliii11l1lllil != null) {
            try {
               try {
                  HashMapHolder.EventBus(lliii11l1lllil);

                  for (Entityesp$EventBus li11lillliiliil1ilill1ii1$l1i1illlili : this.lI1I111ll11lI1I()) {
                     try {
                        Entityesp$II1Il11l111II11IIl li11lillliiliil1ilill1ii1$ii1il11l111ii11iil = li11lillliiliil1ilill1ii1$l1i1illlili.l11I1I11lI1IIl1lll();
                        if (!li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.I1Il1l1l111II11Illlll11lIIIIl()
                           && !li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.l1IllII11IlIlI1I1l1IIl1I1ll1()) {
                           if (li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.IlIlll1lIlllI()) {
                              if (this.llII1ll1l1l1Ill1lIllIlI.EventImpl_30("module.entityESP.droppedItems")) {
                                 this.EventTarget(lliii11l1lllil, li11lillliiliil1ilill1ii1$ii1il11l111ii11iil);
                              }

                              if (this.llII1ll1l1l1Ill1lIllIlI.EventImpl_30("module.entityESP.shulkers")) {
                                 this.ZenithInternal095(lliii11l1lllil, li11lillliiliil1ilill1ii1$ii1il11l111ii11iil);
                              }
                           }
                        } else {
                           if (this.I1II1II1III11Il1.ConstructorHolder(5)) {
                              Vector4d vector4d = this.EventBus(li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.I1Il1l1IIIlllI1());
                              if (vector4d != null) {
                                 this.StringHolder_8(lliii11l1lllil, li11lillliiliil1ilill1ii1$ii1il11l111ii11iil, vector4d);
                              }
                           }

                           if (this.I1II1II1III11Il1.ConstructorHolder(0)) {
                              this.StringHolder_8(lliii11l1lllil, li11lillliiliil1ilill1ii1$ii1il11l111ii11iil);
                           }

                           if (this.I1II1II1III11Il1.ConstructorHolder(3)) {
                              this.EventBus(lliii11l1lllil, li11lillliiliil1ilill1ii1$ii1il11l111ii11iil);
                           }
                        }
                     } catch (Exception exception) {
                        System.out.println("ESP 2D render error: " + exception.getMessage());
                     }
                  }
               } catch (Exception exception1) {
                  System.out.println("Строка  145 " + exception1.getMessage());
               }
            } finally {
               ;
            }
         }
      }
   }

   private List<Entityesp$EventBus> lI1I111ll11lI1I() {
      long i = System.currentTimeMillis();
      if (l11I1I1ll1Illll1I1l1111l1II.world != null) {
         for (Entity Entity : l11I1I1ll1Illll1I1l1111l1II.world.getEntities()) {
            if (Entity instanceof PlayerEntity) {
               PlayerEntity PlayerEntity = (PlayerEntity)Entity;
               if (!floatHolder_3.SecureRandomHolder_2(PlayerEntity.getId())) {
                  Entityesp$II1Il11l111II11IIl li11lillliiliil1ilill1ii1$ii1il11l111ii11iilxx = this.ZenithInternal028(PlayerEntity);
                  if (li11lillliiliil1ilill1ii1$ii1il11l111ii11iilxx != null) {
                     this.I11I1lI11l1lIll1I1llI1I11Ill
                        .put(
                           li11lillliiliil1ilill1ii1$ii1il11l111ii11iilxx.update(),
                           new Entityesp$EventBus(li11lillliiliil1ilill1ii1$ii1il11l111ii11iilxx, i)
                        );
                  }
               }
            } else if (Entity instanceof MobEntity) {
               MobEntity MobEntity = (MobEntity)Entity;
               Entityesp$II1Il11l111II11IIl li11lillliiliil1ilill1ii1$ii1il11l111ii11iilx = this.StringHolder_8(MobEntity);
               if (li11lillliiliil1ilill1ii1$ii1il11l111ii11iilx != null) {
                  this.I11I1lI11l1lIll1I1llI1I11Ill
                     .put(
                        li11lillliiliil1ilill1ii1$ii1il11l111ii11iilx.update(),
                        new Entityesp$EventBus(li11lillliiliil1ilill1ii1$ii1il11l111ii11iilx, i)
                     );
               }
            } else if (Entity instanceof ItemEntity) {
               ItemEntity ItemEntity = (ItemEntity)Entity;
               Entityesp$II1Il11l111II11IIl li11lillliiliil1ilill1ii1$ii1il11l111ii11iil = this.EventBus(ItemEntity);
               if (li11lillliiliil1ilill1ii1$ii1il11l111ii11iil != null) {
                  this.I11I1lI11l1lIll1I1llI1I11Ill
                     .put(
                        li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.update(),
                        new Entityesp$EventBus(li11lillliiliil1ilill1ii1$ii1il11l111ii11iil, i)
                     );
               }
            }
         }
      }

      this.hasTimeElapsed(i);
      this.I11I1lI11l1lIll1I1llI1I11Ill
         .values()
         .removeIf(
            li11lillliiliil1ilill1ii1$l1i1illlili -> i - li11lillliiliil1ilill1ii1$l1i1illlili.IIll111ll11llI11Il11lII1lIl() > 2000L
                  || !li11lillliiliil1ilill1ii1$l1i1illlili.lII111I1IIII.lIlII1l1
                     && i - li11lillliiliil1ilill1ii1$l1i1illlili.IIll111ll11llI11Il11lII1lIl() > 200L
         );
      return new ArrayList<>(this.I11I1lI11l1lIll1I1llI1I11Ill.values());
   }

   private Entityesp$II1Il11l111II11IIl ZenithInternal028(PlayerEntity PlayerEntity) {
      boolean flag = ZenithClient.getInstance()
         .StringHolder_26()
         .StringHolder_15(PlayerEntity.getName().getString());
      if (flag && !this.llII1ll1l1l1Ill1lIllIlI.EventImpl_30("module.entityESP.friends")) {
         return null;
      } else {
         if (!flag) {
            boolean flag1 = ZenithInternal066.byteHolder(PlayerEntity) == 0.0F;
            if (flag1 && !this.llII1ll1l1l1Ill1lIllIlI.EventImpl_30("module.entityESP.noArmor")) {
               return null;
            }

            if (!flag1 && !this.llII1ll1l1l1Ill1lIllIlI.EventImpl_30("module.entityESP.players")) {
               return null;
            }
         }

         net.minecraft.util.math.Vec3d Vec3d = doubleHolder_3.ZenithInternal021(PlayerEntity);
         net.minecraft.util.math.Box Box = PlayerEntity.getBoundingBox().offset(Vec3d.subtract(PlayerEntity.getPos()));
         float f = ZenithInternal066.byteHolder_2(PlayerEntity);
         ArrayList arraylist = new ArrayList();
         PlayerEntity.getHandItems().forEach(arraylist::add);
         ArrayList arraylist1 = new ArrayList();
         arraylist1.add(PlayerEntity.getOffHandStack());
         arraylist1.addAll(PlayerEntity.getInventory().armor);
         arraylist1.add(PlayerEntity.getMainHandStack());
         return new Entityesp$II1Il11l111II11IIl(
            "player:" + PlayerEntity.getUuidAsString(),
            PlayerEntity.getDisplayName() != null ? PlayerEntity.getDisplayName() : PlayerEntity.getName(),
            flag,
            true,
            false,
            false,
            false,
            PlayerEntity == l11I1I1ll1Illll1I1l1111l1II.player,
            Box.getCenter(),
            Box,
            f,
            arraylist,
            arraylist1,
            null
         );
      }
   }

   private Entityesp$II1Il11l111II11IIl StringHolder_8(MobEntity MobEntity) {
      if (!this.llII1ll1l1l1Ill1lIllIlI.EventImpl_30("module.entityESP.mobs")) {
         return null;
      } else {
         net.minecraft.util.math.Vec3d Vec3d = doubleHolder_3.ZenithInternal021(MobEntity);
         net.minecraft.util.math.Box Box = MobEntity.getBoundingBox().offset(Vec3d.subtract(MobEntity.getPos()));
         float f = ZenithInternal066.byteHolder_2(MobEntity);
         return new Entityesp$II1Il11l111II11IIl(
            "mob:" + MobEntity.getUuidAsString(),
            MobEntity.getDisplayName() != null ? MobEntity.getDisplayName() : MobEntity.getName(),
            false,
            false,
            true,
            false,
            false,
            false,
            Box.getCenter(),
            Box,
            f,
            List.of(),
            List.of(),
            null
         );
      }
   }

   private Entityesp$II1Il11l111II11IIl EventBus(ItemEntity ItemEntity) {
      if (ItemEntity.getStack().isEmpty()) {
         return null;
      } else {
         boolean flag = this.ZenithInternal021(ItemEntity.getStack());
         if (this.llII1ll1l1l1Ill1lIllIlI.EventImpl_30("module.entityESP.droppedItems")
            || this.llII1ll1l1l1Ill1lIllIlI.EventImpl_30("module.entityESP.shulkers") && flag) {
            net.minecraft.util.math.Vec3d Vec3d = doubleHolder_3.ZenithInternal021(ItemEntity);
            net.minecraft.util.math.Box Box = ItemEntity.getBoundingBox().offset(Vec3d.subtract(ItemEntity.getPos()));
            return new Entityesp$II1Il11l111II11IIl(
               "item:" + ItemEntity.getUuidAsString(),
               ItemEntity.getStack().getCustomName() != null ? ItemEntity.getStack().getCustomName() : ItemEntity.getName(),
               false,
               false,
               false,
               true,
               false,
               false,
               Box.getCenter(),
               Box,
               -1.0F,
               List.of(),
               List.of(),
               ItemEntity.getStack().copy()
            );
         } else {
            return null;
         }
      }
   }

   private void longHolder_5(long i) {
      if (ZenithClient.getInstance().getCloudClient() != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         String s = this.lllI1I1II11l1I();

         for (GetSettingsHandler i11ll1111lil11i : ZenithClient.getInstance().getCloudClient().ButtonSetting()) {
            StringHolder_22 l1liil1ili1iiii1lliii1l1li = i11ll1111lil11i.Reachv3();
            if (l1liil1ili1iiii1lliii1l1li != null
               && i11ll1111lil11i.Reach()
               && i11ll1111lil11i.Rotationrecorder()
               && (
                  l1liil1ili1iiii1lliii1l1li.Fakeplayer() == null
                     || l1liil1ili1iiii1lliii1l1li.Fakeplayer().isEmpty()
                     || l1liil1ili1iiii1lliii1l1li.Fakeplayer().equalsIgnoreCase(s)
               )) {
               boolean flag = l11I1I1ll1Illll1I1l1111l1II.world
                  .getPlayers()
                  .stream()
                  .anyMatch(AbstractClientPlayerEntity -> AbstractClientPlayerEntity.getGameProfile().getName().equalsIgnoreCase(l1liil1ili1iiii1lliii1l1li.Containerhelper()));
               if (!flag) {
                  net.minecraft.util.math.Vec3d Vec3d = i11ll1111lil11i.Fakelag();
                  if (Vec3d == null) {
                     Vec3d = l1liil1ili1iiii1lliii1l1li.Debug();
                  }

                  net.minecraft.util.math.Box Box = new net.minecraft.util.math.Box(
                     Vec3d.x - 0.3,
                     Vec3d.y,
                     Vec3d.z - 0.3,
                     Vec3d.x + 0.3,
                     Vec3d.y + 1.8,
                     Vec3d.z + 0.3
                  );
                  Entityesp$II1Il11l111II11IIl li11lillliiliil1ilill1ii1$ii1il11l111ii11iil = new Entityesp$II1Il11l111II11IIl(
                     "cloud:" + i11ll1111lil11i.Autoswap().toLowerCase(),
                     Text.of(l1liil1ili1iiii1lliii1l1li.Containerhelper()),
                     true,
                     true,
                     false,
                     false,
                     true,
                     false,
                     Box.getCenter(),
                     Box,
                     20.0F,
                     List.of(),
                     List.of(),
                     null
                  );
                  this.I11I1lI11l1lIll1I1llI1I11Ill
                     .put(
                        li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.update(),
                        new Entityesp$EventBus(li11lillliiliil1ilill1ii1$ii1il11l111ii11iil, i)
                     );
               }
            }
         }
      }
   }

   private String lllI1I1II11l1I() {
      try {
         if (l11I1I1ll1Illll1I1l1111l1II.world != null) {
            return l11I1I1ll1Illll1I1l1111l1II.world.getRegistryKey().getValue().toString();
         }
      } catch (Exception exception) {
      }

      return "";
   }

   private void StringHolder_8(
      DrawContextImpl lliii11l1lllil, Entityesp$II1Il11l111II11IIl li11lillliiliil1ilill1ii1$ii1il11l111ii11iil, Vector4d vector4d
   ) {
      if (li11lillliiliil1ilill1ii1$ii1il11l111ii11iil != null && lliii11l1lllil != null && vector4d != null) {
         if (!li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.Il1I1lll1Il11IIl1() || !l11I1I1ll1Illll1I1l1111l1II.options.getPerspective().isFirstPerson()) {
            if (!ZenithInternal094.StringHolder_8(vector4d)) {
               if (!li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.IlllIl1l1I1II1ll11II().isEmpty()) {
                  try {
                     double d0 = vector4d.w - 10.0;
                     float f = (float)ZenithInternal094.EventBus(vector4d);
                     ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
                     Font font = Fonts.NEW_MEDIUM.getFont(8.0F);

                     for (ItemStack ItemStack : li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.IlllIl1l1I1II1ll11II()) {
                        if (ItemStack != null && !ItemStack.isEmpty()) {
                           try {
                              MutableText MutableText = ItemStack.getName().copy();
                              if (!MutableText.getString().isEmpty() && MutableText.getString().endsWith(" ")) {
                                 MutableText = StringHolder_21.EventTarget(MutableText, "");
                              }

                              NbtComponent NbtComponent = (NbtComponent)ItemStack.get(DataComponentTypes.CUSTOM_DATA);
                              if (NbtComponent != null && NbtComponent.getNbt().getKeys().contains("itemServiceId")) {
                                 String s = NbtComponent.getNbt().getCompound("itemServiceId").getString("name").replace("_", " ");
                                 if (ItemStack.getItem() == Items.TOTEM_OF_UNDYING) {
                                    s = "Талисман Eternity";
                                 }

                                 s = Character.toUpperCase(s.toCharArray()[0]) + s.substring(1);
                                 s = s.replace("2", " 2").replace("1", " 1");
                                 if (s.equals("Мифическая сфера 1")) {
                                    s = "Мифка у3 б2";
                                 } else if (s.equals("Мифическая сфера 2")) {
                                    s = "Мифка б3 у2";
                                 }

                                 MutableText = Text.literal(s)
                                    .setStyle(
                                       Style.EMPTY
                                          .withColor(
                                             ZenithClient.getInstance()
                                                .floatHolder_3()
                                                .getClientColor(90)
                                                .lllIlll1Ill111l111Il11II11lII()
                                          )
                                    );
                              }

                              if ((
                                    !ZenithClient.getInstance().SupplierHolder().III11I1lI1I()
                                       || li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.I1II1IllI1
                                 )
                                 && ItemStack.getCount() > 1) {
                                 MutableText.append(
                                    Text.of(" x" + ItemStack.getCount())
                                       .copy()
                                       .setStyle(
                                          Style.EMPTY
                                             .withColor(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().lllIlll1Ill111l111Il11II11lII())
                                       )
                                 );
                              }

                              d0 += (double)((font.height() / 2.0F + 12.0F + 2.0F) * this.l1111l1l1l111.lll1lI1llll1IIllIIIII1lll());
                              float f7 = f - font.width(MutableText) / 2.0F;
                              ByteBufferHolder il1iliilli1l1iill = zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
                              float f1 = font.width(MutableText) + 8.0F;
                              float f2 = font.height() + (float)GuiStyle.PADDING.intValue() + 1.0F;
                              float f3 = f7 - 4.0F;
                              float f4 = (float)d0;
                              float f5 = f3 + f1 / 2.0F;
                              float f6 = f4 + f2 / 2.0F;
                              this.pushCenteredScale(lliii11l1lllil, f5, f6, 1.0F, 1.0F);
                              floatHolder_5 iil11iill1il1l1llilll1l1i1i1 = floatHolder_5.StringHolder_30(
                                 Interface.lIl111ll1l111lIIlIlI1I1() * 0.6F
                              );
                              floatHolder_8.StringHolder_8(
                                 lliii11l1lllil.getMatrices(),
                                 f3,
                                 f4,
                                 f1,
                                 f2,
                                 22.0F,
                                 iil11iill1il1l1llilll1l1i1i1,
                                 ByteBufferHolder.ll1lIllll111I1lIIl1lIl,
                                 this.I111IIlIl1I1l1.Spider() && this.I111IIlIl1I1l1.isVisible(),
                                 this.I1II1lI1I1IlI.Spider() && this.I1II1lI1I1IlI.isVisible()
                              );
                              lliii11l1lllil.StringHolder_8(f3, f4, f1, f2, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
                              lliii11l1lllil.lII1I1l1I11111l1llI1();
                              lliii11l1lllil.getMatrices().translate(f7, f4 + (f2 - 1.0F - font.height()) / 2.0F, 0.0F);
                              lliii11l1lllil.StringHolder_8(
                                 font, MutableText, 0.0F, 0.0F, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().lllIlll1Ill111l111Il11II11lII()
                              );
                              lliii11l1lllil.IIlII1lII1();
                              this.removeFrame(lliii11l1lllil);
                           } catch (Exception exception) {
                              System.out.println("drawHands err: " + exception.getMessage());
                           }
                        }
                     }
                  } catch (Exception exception1) {
                     System.out.println("drawHands outer err: " + exception1.getMessage());
                  }
               }
            }
         }
      }
   }

   private void StringHolder_8(DrawContextImpl lliii11l1lllil, Entityesp$II1Il11l111II11IIl li11lillliiliil1ilill1ii1$ii1il11l111ii11iil) {
      if (li11lillliiliil1ilill1ii1$ii1il11l111ii11iil != null && lliii11l1lllil != null) {
         if (!li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.Il1I1lll1Il11IIl1() || !l11I1I1ll1Illll1I1l1111l1II.options.getPerspective().isFirstPerson()) {
            try {
               net.minecraft.util.math.Box Box = li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.I1Il1l1IIIlllI1();
               net.minecraft.util.math.Vec3d Vec3dx = new net.minecraft.util.math.Vec3d(
                  Box.getCenter().x, Box.maxY + 0.15F, Box.getCenter().z
               );
               if (!this.byteHolder(Vec3dx)) {
                  return;
               }

               net.minecraft.util.math.Vec3d Vec3dx = ZenithInternal094.ListHolder_6(Vec3dx);
               if (Vec3dx == null || Vec3dx.z <= 0.0) {
                  return;
               }

               ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
               boolean flag = li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.l11ll11l1Il11l1IIII1II();
               ByteBufferHolder il1iliilli1l1iill = flag
                  ? zenithstyle.getFriendColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().SecretKeySpecHolder(0.5F)
                  : zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
               Text Text = li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.lII1lllIlllIllII() != null
                  ? li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.lII1lllIlllIllII()
                  : Text.of("unknown");
               MutableText MutableText = Text.literal(Nameprotect.IIIlllllI1II1IIIll11I1());
               Object object = (
                        !flag
                           || !Nameprotect.l1I1I1l1lI11l111I1lI111llll1l.Spider()
                           || !Nameprotect.l1I1I1l1lI11l111I1lI111llll1l.Illll1Il11Illl1Il1Ill1IlIIII()
                     )
                     && !li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.I1II1IllI1
                  ? Text
                  : MutableText;
               float f = li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.Elytrahelper();
               String s = f >= 0.0F ? " " + ZenithInternal066.GetSocketHandler(f) : " --";
               Font font = Fonts.NEW_MEDIUM.getFont(7.0F);
               float f1 = font.width((Text)object) + (float)GuiStyle.PADDING.intValue() / 2.0F + font.width(s);
               float f2 = (float)Vec3dx.x - f1 / 2.0F;
               float f3 = (float)Vec3dx.y;
               this.pushCenteredScale(lliii11l1lllil, f2 + f1 / 2.0F, f3 + (font.height() + (float)GuiStyle.PADDING.intValue() + 1.0F) / 2.0F, 1.0F, 1.0F);
               floatHolder_5 iil11iill1il1l1llilll1l1i1i1 = floatHolder_5.StringHolder_30(
                  Interface.lIl111ll1l111lIIlIlI1I1() * 0.6F
               );
               floatHolder_8.StringHolder_8(
                  lliii11l1lllil.getMatrices(),
                  f2 - 4.0F,
                  f3 - 13.0F,
                  f1 + 8.0F,
                  font.height() + (float)GuiStyle.PADDING.intValue() + 1.0F,
                  22.0F,
                  iil11iill1il1l1llilll1l1i1i1,
                  ByteBufferHolder.ll1lIllll111I1lIIl1lIl,
                  this.I111IIlIl1I1l1.Spider() && this.I111IIlIl1I1l1.isVisible(),
                  this.I1II1lI1I1IlI.Spider() && this.I1II1lI1I1IlI.isVisible()
               );
               lliii11l1lllil.StringHolder_8(
                  f2 - 4.0F, f3 - 13.0F, f1 + 8.0F, font.height() + (float)GuiStyle.PADDING.intValue() + 1.0F, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill
               );
               lliii11l1lllil.lII1I1l1I11111l1llI1();
               lliii11l1lllil.getMatrices().translate(f2, f3 - 13.0F + (float)GuiStyle.PADDING.intValue() / 2.0F, 0.0F);
               ByteBufferHolder il1iliilli1l1iill1 = f >= 0.0F
                  ? this.StringHolder_11(f)
                  : zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1();
               lliii11l1lllil.StringHolder_8(
                  font, (Text)object, 0.0F, 0.0F, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().lllIlll1Ill111l111Il11II11lII()
               );
               lliii11l1lllil.StringHolder_8(font, s, font.width((Text)object) + 1.5F, 0.0F, il1iliilli1l1iill1);
               lliii11l1lllil.IIlII1lII1();
               this.removeFrame(lliii11l1lllil);
               if (this.I1II1II1III11Il1.ConstructorHolder(2) && !li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.I1IlI1I11I1().isEmpty()) {
                  ArrayList arraylist = new ArrayList<>(li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.I1IlI1I11I1());
                  long i = arraylist.stream().filter(ItemStack -> ItemStackx != null && !ItemStackx.isEmpty()).count();
                  if (i > 0L) {
                     float f4 = (float)(i * 18L);
                     float f5 = f2 + f1 / 2.0F;
                     float f6 = f3 - 13.0F - (float)GuiStyle.PADDING.intValue() / 2.0F - 18.0F * this.l1111l1l1l111.lll1lI1llll1IIllIIIII1lll();
                     float f7 = f5 - f4 / 2.0F - 1.0F;
                     float f8 = 18.0F;
                     float f9 = f7 + f4 / 2.0F;
                     float f10 = f6 + f8;
                     this.pushCenteredScale(lliii11l1lllil, f9, f10, 1.0F, 1.0F);
                     floatHolder_8.StringHolder_8(
                        lliii11l1lllil.getMatrices(),
                        f7,
                        f6,
                        f4,
                        f8,
                        22.0F,
                        iil11iill1il1l1llilll1l1i1i1,
                        ByteBufferHolder.ll1lIllll111I1lIIl1lIl,
                        this.I111IIlIl1I1l1.Spider() && this.I111IIlIl1I1l1.isVisible(),
                        this.I1II1lI1I1IlI.Spider() && this.I1II1lI1I1IlI.isVisible()
                     );
                     lliii11l1lllil.StringHolder_8(f7, f6, f4, f8, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
                     float f11 = 0.0F;

                     for (ItemStack ItemStack : arraylist) {
                        if (ItemStack != null && !ItemStack.isEmpty()) {
                           lliii11l1lllil.lII1I1l1I11111l1llI1();
                           lliii11l1lllil.getMatrices().translate(f5 - f4 / 2.0F + f11, f6, 0.0F);
                           lliii11l1lllil.getMatrices().scale(0.8F, 0.8F, 0.8F);
                           lliii11l1lllil.getMatrices().translate(2.0F, 2.0F, 0.0F);
                           net.minecraft.client.render.DiffuseLighting.disableGuiDepthLighting();
                           lliii11l1lllil.StringHolder_8(ItemStack, 0, 1);
                           lliii11l1lllil.IIlII1lII1();
                           f11 += 18.0F;
                        }
                     }

                     this.removeFrame(lliii11l1lllil);
                  }
               }
            } catch (Exception exception) {
               System.out.println("renderNameTag err: " + exception.getMessage());
            }
         }
      }
   }

   private void EventBus(DrawContextImpl lliii11l1lllil, Entityesp$II1Il11l111II11IIl li11lillliiliil1ilill1ii1$ii1il11l111ii11iil) {
      if (li11lillliiliil1ilill1ii1$ii1il11l111ii11iil != null && lliii11l1lllil != null) {
         if (!li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.Il1I1lll1Il11IIl1() || !l11I1I1ll1Illll1I1l1111l1II.options.getPerspective().isFirstPerson()) {
            try {
               Vector4d vector4d = this.EventBus(li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.I1Il1l1IIIlllI1());
               if (vector4d == null) {
                  return;
               }

               this.StringHolder_8(li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.l11ll11l1Il11l1IIII1II(), vector4d);
            } catch (Exception exception) {
               System.out.println("renderEntityBox err: " + exception.getMessage());
            }
         }
      }
   }

   private void EventTarget(DrawContextImpl lliii11l1lllil, Entityesp$II1Il11l111II11IIl li11lillliiliil1ilill1ii1$ii1il11l111ii11iil) {
      if (li11lillliiliil1ilill1ii1$ii1il11l111ii11iil != null
         && lliii11l1lllil != null
         && li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.II1II111lII11IlIl111IIII1II() != null
         && !li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.II1II111lII11IlIl111IIII1II().isEmpty()) {
         try {
            net.minecraft.util.math.Vec3d[] aVec3d = this.EventTarget(li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.I1Il1l1IIIlllI1());
            Vector4d vector4d = null;

            for (net.minecraft.util.math.Vec3d Vec3dx : aVec3d) {
               try {
                  if (this.byteHolder(Vec3dx)) {
                     net.minecraft.util.math.Vec3d Vec3dx = ZenithInternal094.ListHolder_6(Vec3dx);
                     if (Vec3dx != null && Vec3dx.z > 0.0) {
                        if (vector4d == null) {
                           vector4d = new Vector4d(Vec3dx.x, Vec3dx.y, Vec3dx.x, Vec3dx.y);
                        }

                        vector4d.x = Math.min(vector4d.x, Vec3dx.x);
                        vector4d.y = Math.min(vector4d.y, Vec3dx.y);
                        vector4d.z = Math.max(vector4d.z, Vec3dx.x);
                        vector4d.w = Math.max(vector4d.w, Vec3dx.y);
                     }
                  }
               } catch (Exception exception) {
               }
            }

            if (vector4d == null) {
               return;
            }

            MutableText MutableText = li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.II1II111lII11IlIl111IIII1II().getName().copy();
            if (MutableText.getString().endsWith(" ")) {
               MutableText = StringHolder_21.EventTarget(MutableText, "");
            }

            if (li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.II1II111lII11IlIl111IIII1II().getCount() > 1) {
               MutableText = MutableText.copy()
                  .append(
                     Text.of(" x" + li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.II1II111lII11IlIl111IIII1II().getCount())
                        .copy()
                        .setStyle(
                           Style.EMPTY
                              .withColor(
                                 ZenithClient.getInstance()
                                    .floatHolder_3()
                                    .getCurrentStyle()
                                    .getPrimaryColor()
                                    .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                                    .lllIlll1Ill111l111Il11II11lII()
                              )
                        )
                  );
            }

            ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
            Font font = Fonts.NEW_MEDIUM.getFont(8.0F);
            float f7 = (float)GuiStyle.PADDING.intValue();
            float f8 = (float)GuiStyle.PADDING.intValue() + font.height() + 1.0F;
            float f = font.width(MutableText);
            float f1 = f7 + 10.4F + f7 + f + f7;
            float f2 = (float)vector4d.x;
            float f3 = (float)vector4d.z;
            float f4 = (float)vector4d.y;
            float f5 = f2 + (f3 - f2) / 2.0F - f1 / 2.0F;
            float f6 = f4 - 13.0F * this.l1111l1l1l111.lll1lI1llll1IIllIIIII1lll();
            this.pushCenteredScale(lliii11l1lllil, f5 + f1 / 2.0F, f6 + 6.5F, 1.0F, 1.0F);
            floatHolder_5 iil11iill1il1l1llilll1l1i1i1 = floatHolder_5.StringHolder_30(Interface.lIl111ll1l111lIIlIlI1I1() / 2.0F);
            floatHolder_8.StringHolder_8(
               lliii11l1lllil.getMatrices(),
               f5,
               f6,
               f1,
               f8,
               22.0F,
               iil11iill1il1l1llilll1l1i1i1,
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl,
               this.I111IIlIl1I1l1.Spider() && this.I111IIlIl1I1l1.isVisible(),
               this.I1II1lI1I1IlI.Spider() && this.I1II1lI1I1IlI.isVisible()
            );
            lliii11l1lllil.StringHolder_8(f5, f6, f1, f8, iil11iill1il1l1llilll1l1i1i1, zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1());
            lliii11l1lllil.StringHolder_8(
               font,
               MutableText,
               f5 + f7 + 10.4F + f7,
               f6 + (f8 - 1.0F - font.height()) / 2.0F,
               zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().lllIlll1Ill111l111Il11II11lII()
            );
            lliii11l1lllil.lII1I1l1I11111l1llI1();
            lliii11l1lllil.getMatrices().translate(f5 + f7, f6 + (f8 - 1.0F - 10.4F), 0.0F);
            lliii11l1lllil.getMatrices().scale(0.65F, 0.65F, 1.0F);
            lliii11l1lllil.StringHolder_8(li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.II1II111lII11IlIl111IIII1II(), 0, 0);
            lliii11l1lllil.IIlII1lII1();
            this.removeFrame(lliii11l1lllil);
         } catch (Exception exception1) {
            System.out.println("renderItemTarget err: " + exception1.getMessage());
         }
      }
   }

   private void ZenithInternal095(DrawContextImpl lliii11l1lllil, Entityesp$II1Il11l111II11IIl li11lillliiliil1ilill1ii1$ii1il11l111ii11iil) {
      if (li11lillliiliil1ilill1ii1$ii1il11l111ii11iil != null
         && lliii11l1lllil != null
         && li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.II1II111lII11IlIl111IIII1II() != null
         && !li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.II1II111lII11IlIl111IIII1II().isEmpty()) {
         if (this.ZenithInternal021(li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.II1II111lII11IlIl111IIII1II())) {
            try {
               net.minecraft.util.math.Vec3d[] aVec3d = this.EventTarget(li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.I1Il1l1IIIlllI1());
               Vector4d vector4d = null;

               for (net.minecraft.util.math.Vec3d Vec3dx : aVec3d) {
                  try {
                     if (this.byteHolder(Vec3dx)) {
                        net.minecraft.util.math.Vec3d Vec3dx = ZenithInternal094.ListHolder_6(Vec3dx);
                        if (Vec3dx != null && Vec3dx.z > 0.0) {
                           if (vector4d == null) {
                              vector4d = new Vector4d(Vec3dx.x, Vec3dx.y, Vec3dx.x, Vec3dx.y);
                           }

                           vector4d.x = Math.min(vector4d.x, Vec3dx.x);
                           vector4d.y = Math.min(vector4d.y, Vec3dx.y);
                           vector4d.z = Math.max(vector4d.z, Vec3dx.x);
                           vector4d.w = Math.max(vector4d.w, Vec3dx.y);
                        }
                     }
                  } catch (Exception exception) {
                  }
               }

               if (vector4d == null) {
                  return;
               }

               DefaultedList DefaultedList = this.ZenithException_2(li11lillliiliil1ilill1ii1$ii1il11l111ii11iil.II1II111lII11IlIl111IIII1II());
               ShulkerTooltipComponent shulkertooltipcomponent = new ShulkerTooltipComponent(DefaultedList);
               float f3 = (float)shulkertooltipcomponent.getWidth(l11I1I1ll1Illll1I1l1111l1II.textRenderer);
               float f4 = (float)shulkertooltipcomponent.getHeight(l11I1I1ll1Illll1I1l1111l1II.textRenderer)
                  * this.l1111l1l1l111.lll1lI1llll1IIllIIIII1lll()
                  * 0.7F;
               float f5 = ((float)vector4d.x + (float)vector4d.z) / 2.0F;
               float f = this.llII1ll1l1l1Ill1lIllIlI.EventImpl_30("module.entityESP.droppedItems")
                  ? 12.0F * this.l1111l1l1l111.lll1lI1llll1IIllIIIII1lll() + 13.0F * this.l1111l1l1l111.lll1lI1llll1IIllIIIII1lll()
                  : 4.0F;
               float f1 = f5 - f3 / 2.0F;
               float f2 = (float)vector4d.y - f4 - f;
               this.pushCenteredScale(lliii11l1lllil, f1 + f3 / 2.0F, f2 + f4 / 2.0F, 0.7F, 0.7F);
               shulkertooltipcomponent.drawItems(
                  l11I1I1ll1Illll1I1l1111l1II.textRenderer,
                  Math.round(f1),
                  Math.round(f2),
                  shulkertooltipcomponent.getWidth(l11I1I1ll1Illll1I1l1111l1II.textRenderer),
                  shulkertooltipcomponent.getHeight(l11I1I1ll1Illll1I1l1111l1II.textRenderer),
                  lliii11l1lllil
               );
               this.removeFrame(lliii11l1lllil);
            } catch (Exception exception1) {
               System.out.println("renderShulkerTarget err: " + exception1.getMessage());
            }
         }
      }
   }

   private void StringHolder_8(boolean flag, Vector4d vector4d) {
      if (vector4d != null) {
         try {
            int[] aint = flag
               ? new int[]{
                  ZenithClient.getInstance()
                     .floatHolder_3()
                     .getCurrentStyle()
                     .getFriendColor()
                     .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                     .lllIlll1Ill111l111Il11II11lII(),
                  ZenithClient.getInstance()
                     .floatHolder_3()
                     .getCurrentStyle()
                     .getFriendColor()
                     .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                     .lllIlll1Ill111l111Il11II11lII(),
                  ZenithClient.getInstance()
                     .floatHolder_3()
                     .getCurrentStyle()
                     .getFriendColor()
                     .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                     .lllIlll1Ill111l111Il11II11lII(),
                  ZenithClient.getInstance()
                     .floatHolder_3()
                     .getCurrentStyle()
                     .getFriendColor()
                     .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                     .lllIlll1Ill111l111Il11II11lII()
               }
               : new int[]{
                  ZenithClient.getInstance()
                     .floatHolder_3()
                     .getClientColor(0)
                     .lllIlll1Ill111l111Il11II11lII(),
                  ZenithClient.getInstance()
                     .floatHolder_3()
                     .getClientColor(90)
                     .lllIlll1Ill111l111Il11II11lII(),
                  ZenithClient.getInstance()
                     .floatHolder_3()
                     .getClientColor(180)
                     .lllIlll1Ill111l111Il11II11lII(),
                  ZenithClient.getInstance()
                     .floatHolder_3()
                     .getClientColor(270)
                     .lllIlll1Ill111l111Il11II11lII()
               };
            float f = (float)vector4d.x;
            float f1 = (float)vector4d.y;
            float f2 = (float)vector4d.z;
            float f3 = (float)vector4d.w;
            float f4 = (f2 - f) / 3.0F;
            HashMapHolder.StringHolder_8(f - 1.0F, f1 - 1.0F, f4, 1.0F, aint[0]);
            HashMapHolder.StringHolder_8(f - 1.0F, f1, 1.0F, f4 + 1.0F, aint[0]);
            HashMapHolder.StringHolder_8(f - 1.0F, f3 - f4 - 1.0F, 1.0F, f4, aint[1]);
            HashMapHolder.StringHolder_8(f - 1.0F, f3 - 1.0F, f4, 1.0F, aint[1]);
            HashMapHolder.StringHolder_8(f2 - f4 + 2.0F, f1 - 1.0F, f4, 1.0F, aint[2]);
            HashMapHolder.StringHolder_8(f2 + 1.0F, f1, 1.0F, f4 + 1.0F, aint[2]);
            HashMapHolder.StringHolder_8(f2 + 1.0F, f3 - f4 - 1.0F, 1.0F, f4, aint[3]);
            HashMapHolder.StringHolder_8(f2 - f4 + 2.0F, f3 - 1.0F, f4, 1.0F, aint[3]);
         } catch (Exception exception) {
            System.out.println("drawFlatBox err: " + exception.getMessage());
         }
      }
   }

   private Vector4d EventBus(net.minecraft.util.math.Box Box) {
      net.minecraft.util.math.Vec3d[] aVec3d = this.EventTarget(Box);
      Vector4d vector4d = null;

      for (net.minecraft.util.math.Vec3d Vec3dx : aVec3d) {
         try {
            if (this.byteHolder(Vec3dx)) {
               net.minecraft.util.math.Vec3d Vec3dx = ZenithInternal094.ListHolder_6(Vec3dx);
               if (Vec3dx != null && Vec3dx.z > 0.0) {
                  if (vector4d == null) {
                     vector4d = new Vector4d(Vec3dx.x, Vec3dx.y, Vec3dx.x, Vec3dx.y);
                  }

                  vector4d.x = Math.min(vector4d.x, Vec3dx.x);
                  vector4d.y = Math.min(vector4d.y, Vec3dx.y);
                  vector4d.z = Math.max(vector4d.z, Vec3dx.x);
                  vector4d.w = Math.max(vector4d.w, Vec3dx.y);
               }
            }
         } catch (Exception exception) {
         }
      }

      return vector4d;
   }

   private net.minecraft.util.math.Vec3d[] EventTarget(net.minecraft.util.math.Box Box) {
      try {
         return new net.minecraft.util.math.Vec3d[]{
            new net.minecraft.util.math.Vec3d(Box.minX, Box.minY, Box.minZ),
            new net.minecraft.util.math.Vec3d(Box.minX, Box.maxY, Box.minZ),
            new net.minecraft.util.math.Vec3d(Box.maxX, Box.minY, Box.minZ),
            new net.minecraft.util.math.Vec3d(Box.maxX, Box.maxY, Box.minZ),
            new net.minecraft.util.math.Vec3d(Box.minX, Box.minY, Box.maxZ),
            new net.minecraft.util.math.Vec3d(Box.minX, Box.maxY, Box.maxZ),
            new net.minecraft.util.math.Vec3d(Box.maxX, Box.minY, Box.maxZ),
            new net.minecraft.util.math.Vec3d(Box.maxX, Box.maxY, Box.maxZ)
         };
      } catch (Exception exception) {
         System.out.println("getPoints err: " + exception.getMessage());
         return new net.minecraft.util.math.Vec3d[8];
      }
   }

   private boolean ZenithInternal021(ItemStack ItemStack) {
      if (ItemStack.getItem() instanceof BlockItem BlockItem && BlockItem.getBlock() instanceof ShulkerBoxBlock) {
         return true;
      }

      return false;
   }

   private DefaultedList<ItemStack> ZenithException_2(ItemStack ItemStack) {
      DefaultedList DefaultedList = DefaultedList.ofSize(27, ItemStack.EMPTY);
      ContainerComponent ContainerComponent = (ContainerComponent)ItemStack.get(DataComponentTypes.CONTAINER);
      if (ContainerComponent != null) {
         ContainerComponent.copyTo(DefaultedList);
      }

      return DefaultedList;
   }

   private float ZenithInternal095(net.minecraft.util.math.Box Box) {
      return (float)Box.getLengthY();
   }

   private boolean byteHolder(net.minecraft.util.math.Vec3d Vec3d) {
      if (l11I1I1ll1Illll1I1l1111l1II.gameRenderer != null && l11I1I1ll1Illll1I1l1111l1II.gameRenderer.getCamera() != null) {
         net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.gameRenderer.getCamera().getPos();
         net.minecraft.util.math.Vec3d Vec3dxx = Vec3dxxx.subtract(Vec3dx);
         float f = l11I1I1ll1Illll1I1l1111l1II.gameRenderer.getCamera().getPitch();
         float f1 = l11I1I1ll1Illll1I1l1111l1II.gameRenderer.getCamera().getYaw();
         double d0 = Math.toRadians((double)f);
         double d1 = Math.toRadians((double)f1);
         net.minecraft.util.math.Vec3d Vec3dxxx = new net.minecraft.util.math.Vec3d(-Math.sin(d1) * Math.cos(d0), -Math.sin(d0), Math.cos(d1) * Math.cos(d0));
         return Vec3dxx.dotProduct(Vec3dxxx) > 0.0;
      } else {
         return false;
      }
   }

   private ByteBufferHolder StringHolder_11(float f) {
      try {
         if (f <= 7.0F) {
            return new ByteBufferHolder(255, 0, 0, 255);
         } else {
            return f <= 15.0F ? new ByteBufferHolder(255, 255, 0, 255) : new ByteBufferHolder(0, 255, 0, 255);
         }
      } catch (Exception exception) {
         return ByteBufferHolder.ll1lIllll111I1lIIl1lIl;
      }
   }

   public BooleanSetting I1IlIIlll1Il11lllI11Il() {
      return this.I111IIlIl1I1l1;
   }

   public BooleanSetting llllIlI1llIIIlIII1I() {
      return this.I1II1lI1I1IlI;
   }
}
