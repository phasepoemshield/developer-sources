package org.zenith.base.comand.impl;

import org.zenith.core.ItemRegistry;
import org.zenith.core.ItemSpec;
import org.zenith.core.EnchantItemSpec;
import org.zenith.core.ItemServiceBase;
import org.zenith.core.MotionSampleStore;
import org.zenith.core.CloudRouter;
import org.zenith.event.EventInteractBlock;
import org.zenith.event.RefreshCacheEvent;
import org.zenith.module.GrimGlide;
import org.zenith.module.NoSlow;
import org.zenith.rotation.RotationLegitStrategy;
import org.zenith.rotation.RotationMLStrategy2;

import org.zenith.event.EventTick;
import org.zenith.event.MovementInputEvent;

import org.zenith.base.comand.api.CommandAbstract;
import org.zenith.event.EventTick;
import org.zenith.event.MovementInputEvent;
import org.zenith.managers.Pathfinder;
import org.zenith.managers.Pathfinder_Var7;
import org.zenith.rotation.Rotation;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.StyledTextBuilder;















import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.command.CommandSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public final class RouteCommand extends CommandAbstract {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final int STUCK_TICKS_BEFORE_REPATH = 40;
   public static final float MAX_YAW_STEP = 35.0F;
   public static final float MOVE_YAW_TOLERANCE = 55.0F;
   public Pathfinder_Var7 route;
   public BlockPos destination;
   public BlockPos nextBlock;
   public Vec3d lastPosition;
   public int stuckTicks;

   public RouteCommand() {
      super("route");
      EventManager.register(this);
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> var1) {
      var1.executes(
         var0 -> {
            StyledTextBuilder.RefreshCacheEvent(
               "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435: .route <x> <y> <z> \u0438\u043b\u0438 .route stop"
            );
            return 1;
         }
      );
      var1.then(literal("stop").executes(var1x -> {
         this.stop();
         StyledTextBuilder.RefreshCacheEvent("\u041c\u0430\u0440\u0448\u0440\u0443\u0442 \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d");
         return 1;
      }));
      var1.then(
         arg("x", IntegerArgumentType.integer()).then(arg("y", IntegerArgumentType.integer()).then(arg("z", IntegerArgumentType.integer()).executes(var1x -> {
            int i = IntegerArgumentType.getInteger(var1x, "x");
            int j = IntegerArgumentType.getInteger(var1x, "y");
            int k = IntegerArgumentType.getInteger(var1x, "z");
            this.start(new BlockPos(i, j, k));
            return 1;
         })))
      );
   }

   public void start(BlockPos var1) {
      if (minecraftClient3.player != null && minecraftClient3.world != null) {
         ClientPlayerEntity clientplayerentity = minecraftClient3.player;
         Pathfinder_Var7 l1liiliiiil1i_liil11l111liil1ll = this.findRoute(clientplayerentity, var1);
         if (l1liiliiiil1i_liil11l111liil1ll == null) {
            this.stop();
            StyledTextBuilder.RotationMLStrategy2(
               "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043f\u043e\u0441\u0442\u0440\u043e\u0438\u0442\u044c \u043f\u0443\u0442\u044c \u0434\u043e "
                  + var1.getX()
                  + " "
                  + var1.getY()
                  + " "
                  + var1.getZ()
            );
         } else {
            this.route = l1liiliiiil1i_liil11l111liil1ll;
            this.destination = var1.toImmutable();
            this.nextBlock = null;
            this.lastPosition = clientplayerentity.getPos();
            this.stuckTicks = 0;
            StyledTextBuilder.RefreshCacheEvent(
               "\u0418\u0434\u0443 \u043a "
                  + var1.getX()
                  + " "
                  + var1.getY()
                  + " "
                  + var1.getZ()
                  + " ("
                  + this.route.var04().size()
                  + " \u0431\u043b\u043e\u043a\u043e\u0432)"
            );
         }
      } else {
         StyledTextBuilder.RotationMLStrategy2("\u0421\u043d\u0430\u0447\u0430\u043b\u0430 \u0437\u0430\u0439\u0434\u0438 \u0432 \u043c\u0438\u0440");
      }
   }

   @EventTarget
   public void onUpdate(EventTick var1) {
      if (this.route != null) {
         ClientPlayerEntity clientplayerentity = minecraftClient3.player;
         if (clientplayerentity != null && minecraftClient3.world != null && this.destination != null) {
            this.nextBlock = this.route.CloudRouter(clientplayerentity.getPos());
            if (this.nextBlock == null) {
               this.stop();
               StyledTextBuilder.RefreshCacheEvent("\u041c\u0430\u0440\u0448\u0440\u0443\u0442 \u0437\u0430\u0432\u0435\u0440\u0448\u0451\u043d");
            } else {
               this.rotateTo(clientplayerentity, this.nextBlock);
               this.updateStuckState(clientplayerentity);
            }
         } else {
            this.stop();
         }
      }
   }

   @EventTarget
   public void onMoveInput(MovementInputEvent var1) {
      ClientPlayerEntity clientplayerentity = minecraftClient3.player;
      if (this.route != null && this.nextBlock != null && clientplayerentity != null) {
         var1.NoSlow();
         float f = this.yawTo(clientplayerentity, this.nextBlock);
         float f1 = Math.abs(MathHelper.wrapDegrees(f - clientplayerentity.getYaw()));
         if (f1 <= 55.0F) {
            var1.ItemSpec(true);
         }

         int i = MathHelper.floor(clientplayerentity.getY() + 0.01);
         boolean flag = this.nextBlock.getY() > i || clientplayerentity.horizontalCollision;
         var1.EnchantItemSpec(flag);
      }
   }

   public void rotateTo(ClientPlayerEntity var1, BlockPos var2) {
      float f = this.yawTo(var1, var2);
      float f1 = MathHelper.wrapDegrees(f - var1.getYaw());
      var1.setYaw(var1.getYaw() + MathHelper.clamp(f1, -35.0F, 35.0F));
   }

   public float yawTo(ClientPlayerEntity var1, BlockPos var2) {
      Vec3d vec3d = Pathfinder.EventInteractBlock(var2);
      Vec3d vec3d1 = new Vec3d(vec3d.x, var1.getEyeY(), vec3d.z);
      return Rotation.ItemServiceBase(vec3d1, var1.getEyePos()).GrimGlide();
   }

   public void updateStuckState(ClientPlayerEntity var1) {
      Vec3d vec3d = var1.getPos();
      if (this.lastPosition != null && vec3d.squaredDistanceTo(this.lastPosition) < 4.0E-4) {
         this.stuckTicks++;
      } else {
         this.stuckTicks = 0;
      }

      this.lastPosition = vec3d;
      if (this.stuckTicks >= 40 && var1.isOnGround()) {
         Pathfinder_Var7 l1liiliiiil1i_liil11l111liil1ll = this.findRoute(var1, this.destination);
         if (l1liiliiiil1i_liil11l111liil1ll == null) {
            this.stop();
            StyledTextBuilder.RotationMLStrategy2(
               "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043f\u0435\u0440\u0435\u0441\u0442\u0440\u043e\u0438\u0442\u044c \u043c\u0430\u0440\u0448\u0440\u0443\u0442"
            );
         } else {
            this.route = l1liiliiiil1i_liil11l111liil1ll;
            this.nextBlock = null;
            this.stuckTicks = 0;
            StyledTextBuilder.RotationLegitStrategy("\u041c\u0430\u0440\u0448\u0440\u0443\u0442 \u043f\u0435\u0440\u0435\u0441\u0442\u0440\u043e\u0435\u043d");
         }
      }
   }

   public Pathfinder_Var7 findRoute(ClientPlayerEntity var1, BlockPos var2) {
      return Pathfinder.ItemRegistry(var1.getBlockPos(), var2).orElse(null);
   }

   public void stop() {
      this.route = null;
      this.destination = null;
      this.nextBlock = null;
      this.lastPosition = null;
      this.stuckTicks = 0;
   }
}
