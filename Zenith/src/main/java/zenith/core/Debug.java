package zenith;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;

@ModuleInfo(
   name = "Debug",
   category = Category.MISC,
   description = "Logs packets with timestamp"
)
public class Debug extends Module {
   public static final Debug l1lIll1l1III1I = new Debug();
   private static final DateTimeFormatter l1IlllIlI1IIIlll1llI11I1IIII = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
   private final NumberSetting IlI1l1Il1l1Ill1Ill1IlIIlll = new NumberSetting(
      "module.debug.messageDelay", 250.0F, 0.0F, 2000.0F, 50.0F, "module.debug.messageDelay.desc", "ms"
   );
   private final longHolder lI111llIlIlI1IIIlIl1l = new longHolder();
   private final File l1lIll1lIII;
   private PlayerEntityHolder Il1ll1lIl1I11III1l1I;
   private net.minecraft.util.math.Vec3d lll11llll1l;

   private Debug() {
      File file1 = new File(net.minecraft.client.MinecraftClient.getInstance().runDirectory, "zenith");
      if (!file1.exists() && !file1.mkdirs()) {
         TextHolder.StringHolder_26("Debug: failed to create log directory");
      }

      this.l1lIll1lIII = new File(file1, "debug_packets.log");
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         this.lll11llll1l = l11I1I1ll1Illll1I1l1111l1II.player.getPos();
         this.Il1ll1lIl1I11III1l1I = PlayerEntityHolder.FileHolder_2(1);
      } else {
         this.Il1ll1lIl1I11III1l1I = null;
         this.lll11llll1l = null;
      }
   }

   @EventTarget
   public void EventBus(EventImpl_9 iiiii1111111i11l1l1i1l1i1li1l) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.world != null
         && this.Il1ll1lIl1I11III1l1I != null
         && this.lll11llll1l != null) {
         net.minecraft.util.math.Vec3d Vec3dxx = l11I1I1ll1Illll1I1l1111l1II.player.getPos();
         net.minecraft.util.math.Vec3d Vec3dx = this.Il1ll1lIl1I11III1l1I.l1l111I11I1I;
         net.minecraft.util.math.Vec3d Vec3dxx = Vec3dxx.subtract(Vec3dx);
         double d0 = Math.sqrt(Vec3dxx.x * Vec3dxx.x + Vec3dxx.z * Vec3dxx.z);
         double d1 = Vec3dxx.length();
         if (this.lI111llIlIlI1IIIlIl1l.HostnameVerifierImpl((long)this.IlI1l1Il1l1Ill1Ill1IlIIlll.lll1lI1llll1IIllIIIII1lll())) {
            TextHolder.EventImpl_27(
               String.format(
                  Locale.ROOT,
                  "Predict diff: total=%.5f h=%.5f x=%.5f y=%.5f z=%.5f | real=(%.3f %.3f %.3f) pred=(%.3f %.3f %.3f)",
                  d1,
                  d0,
                  Vec3dxx.x,
                  Vec3dxx.y,
                  Vec3dxx.z,
                  Vec3dxx.x,
                  Vec3dxx.y,
                  Vec3dxx.z,
                  Vec3dx.x,
                  Vec3dx.y,
                  Vec3dx.z
               )
            );
            this.lI111llIlIlI1IIIlIl1l.reset();
         }
      }
   }

   @EventTarget
   public void StringHolder_8(PacketHolder ii1l11il1i1i) {
      Packet Packet = ii1l11il1i1i.Swinganimation();
      if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
         if (Packet instanceof ClickSlotC2SPacket ClickSlotC2SPacket) {
            int i = ClickSlotC2SPacket.getSlot();
            Object object = l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.isValid(i)
               ? l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.getSlot(i).getStack()
               : "";
            this.PathHolder(
               ClickSlotC2SPacket.getActionType().name() + ": " + i + " " + ZenithInternal047.IlIllI1lI11Ill11llII1111l() + " " + object
            );
         }
      }
   }

   private void PathHolder(String s) {
      String s1 = LocalTime.now().format(l1IlllIlI1IIIlll1llI11I1IIII);

      try (BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(this.l1lIll1lIII, true))) {
         bufferedwriter.write(s1 + " | " + s);
         bufferedwriter.newLine();
      } catch (IOException ioexception) {
         ioexception.printStackTrace();
      }
   }
}
