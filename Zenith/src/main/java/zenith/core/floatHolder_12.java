package zenith;

import zenith.hud.*;

public class floatHolder_12 {
   private final GetStartTimeHandler animation;
   private float Vec3dHolder;

   public floatHolder_12(long i) {
      this.animation = new GetStartTimeHandler(i, IReturn.ScreenImpl);
   }

   public void Coordinates() {
      this.animation.StringHolder_8(1.0F);
      this.Vec3dHolder = this.animation.CloudFriendInfo() * 360.0F;
      if (this.Vec3dHolder >= 360.0F) {
         this.Vec3dHolder = 0.0F;
         this.animation.reset();
      }
   }

   public ZenithInternal027 MusicInfo() {
      ByteBufferHolder il1iliilli1l1iill = ZenithClient.getInstance()
         .NotificationsHolder()
         .IllIlIll11lIlI1()
         .l1IllIl1l1llIlI11I11Il1l1l1lI1();
      ByteBufferHolder il1iliilli1l1iill1 = il1iliilli1l1iill.ZenithInternal039(0.4F);
      float f = (float)((Math.sin(Math.toRadians((double)this.Vec3dHolder)) + 1.0) / 2.0);
      float f1 = (float)((Math.sin(Math.toRadians((double)(this.Vec3dHolder + 90.0F))) + 1.0) / 2.0);
      float f2 = (float)((Math.sin(Math.toRadians((double)(this.Vec3dHolder + 180.0F))) + 1.0) / 2.0);
      float f3 = (float)((Math.sin(Math.toRadians((double)(this.Vec3dHolder + 270.0F))) + 1.0) / 2.0);
      ByteBufferHolder il1iliilli1l1iill2 = il1iliilli1l1iill.StringHolder_8(il1iliilli1l1iill1, f);
      ByteBufferHolder il1iliilli1l1iill3 = il1iliilli1l1iill.StringHolder_8(il1iliilli1l1iill1, f1);
      ByteBufferHolder il1iliilli1l1iill4 = il1iliilli1l1iill.StringHolder_8(il1iliilli1l1iill1, f2);
      ByteBufferHolder il1iliilli1l1iill5 = il1iliilli1l1iill.StringHolder_8(il1iliilli1l1iill1, f3);
      return ZenithInternal027.StringHolder_8(il1iliilli1l1iill2, il1iliilli1l1iill5, il1iliilli1l1iill3, il1iliilli1l1iill4);
   }
}
