// Module: EventHelper
// Category: render
// Original class: Eventhelper
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.render;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.text.Text;

@ModuleInfo(
   name = "EventHelper",
   category = Category.RENDER,
   description = "module.eventHelper.desc"
)
public final class Eventhelper extends Module {
   public static final Eventhelper l1Il1ll1ll1I = new Eventhelper();
   private static final Pattern I1IIlIl1 = Pattern.compile("Координаты:\\s*(-?\\d+)\\s+(-?\\d+)\\s+(-?\\d+)", 0);
   private static final Pattern I1IIll11I = Pattern.compile("▶\\s+(.+?)\\s+находится на координатах\\s+(-?\\d+)\\s+(-?\\d+)\\s+(-?\\d+)", 0);
   private final MultiBooleanSetting lI1I1Illl1lIl1IllIIl1l11l = new MultiBooleanSetting("module.eventHelper.target", "module.eventHelper.target.desc");
   private final MultiBooleanSetting$II1Il11l111II11IIl IIl11l11lI1I11IIIl111l = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.lI1I1Illl1lIl1IllIIl1l11l, "module.eventHelper.eventActive", true
   );
   private final MultiBooleanSetting$II1Il11l111II11IIl ll1lI1l1l = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.lI1I1Illl1lIl1IllIIl1l11l, "module.eventHelper.newEvent", true
   );

   private Eventhelper() {
   }

   @EventTarget
   public void onChatReceive(TextHolder_2 l1li1l1111ii111i11l) {
      String s = l1li1l1111ii111i11l.Shaderesp().getString();
      if (this.ll1lI1l1l.Spider() && s.contains("Координаты: ")) {
         l1li1l1111ii111i11l.StringHolder_8(Text.literal(s));
         this.ZenithInternal141(s);
      }

      if (this.IIl11l11lI1I11IIIl111l.Spider() && s.contains("на координатах")) {
         l1li1l1111ii111i11l.StringHolder_8(Text.literal(s));
         this.LoggerHolder(s);
      }
   }

   private void ZenithInternal141(String s) {
      Matcher matcher = I1IIlIl1.matcher(s);
      if (matcher.find()) {
         int i = Integer.parseInt(matcher.group(1));
         int j = Integer.parseInt(matcher.group(2));
         int k = Integer.parseInt(matcher.group(3));
         if (l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() != null) {
            l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendChatMessage(".way remove event");
            l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendChatMessage(".way add event " + i + " " + j + " " + k);
         }
      }
   }

   private void LoggerHolder(String s) {
      Matcher matcher = I1IIll11I.matcher(s);
      if (matcher.find()) {
         int i = Integer.parseInt(matcher.group(2));
         int j = Integer.parseInt(matcher.group(3));
         int k = Integer.parseInt(matcher.group(4));
         if (l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() != null) {
            l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendChatMessage(".way remove event");
            l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendChatMessage(".way add event " + i + " " + j + " " + k);
         }
      }
   }
}
