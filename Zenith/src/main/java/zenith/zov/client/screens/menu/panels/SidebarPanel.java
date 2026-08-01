package zenith.zov.client.screens.menu.panels;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.Category;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.doubleHolder_3;
import zenith.floatHolder_8;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.ZenithInternal143;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;

public class SidebarPanel {
   private final Map<Category, HeightHandler> categoryBounds = new HashMap<>();
   private HeightHandler sidebarToggleButtonBounds;
   private HeightHandler animRect = new HeightHandler(0.0F, 0.0F, 0.0F, 0.0F);
   private GetStartTimeHandler animationChange = new GetStartTimeHandler(200L, 1.0F, IReturn.ScreenImpl);
   private final GetStartTimeHandler sidebarAnimation;
   private final boolean isSidebarExpanded;
   private final Consumer<Category> onCategorySelect;
   private final Runnable onSidebarToggle;
   private final List<SideBarCategory> categories = new ArrayList<>();

   public SidebarPanel(GetStartTimeHandler li1liiliill1, boolean flag, Consumer<Category> consumer, Runnable runnable) {
      this.sidebarAnimation = li1liiliill1;
      this.isSidebarExpanded = flag;
      this.onCategorySelect = consumer;
      this.onSidebarToggle = runnable;
      this.categories.addAll(Arrays.stream(Category.values()).map(SideBarCategory::new).toList());
   }

   public void render(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f,
      float f1,
      float f2,
      float f3,
      SetColorHandler_3 llliili1l1ii11i1lii1,
      Category iill11i1il1ilii11iii1llil1ll,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill5
   ) {
      float f4 = this.sidebarAnimation.ArmorHud();
      float f5 = 30.0F;
      float f6 = 88.0F;
      float f7 = f5 + (f6 - f5) * f4;
      float f8 = 8.0F;
      float f9 = f + f8;
      float f10 = f1 + f8;
      float f11 = f2 - f8 * 2.0F;
      ByteBufferHolder il1iliilli1l1iill2 = llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l().ZenithInternal039(f3);
      this.categoryBounds.clear();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f9, f10, f7, f11, floatHolder_5.StringHolder_30(7.0F), il1iliilli1l1iill2);
      floatHolder_8.EventTarget(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         f9,
         f10,
         f7,
         f11,
         -0.1F,
         floatHolder_5.StringHolder_30(7.0F),
         llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il().ZenithInternal039(f3)
      );
      float f12 = 14.0F;
      float f13 = f9 + (f5 - f12) / 2.0F;
      float f14 = f10 + 8.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         Fonts.ICONS.getFont(11.0F),
         "5",
         f13 + 2.0F,
         f14 + 3.0F,
         ZenithClient.getInstance()
            .NotificationsHolder()
            .lII111IIl1lI1I11lIIlIl1III1I()
            .MusicInfo()
            .RegistryEntryHolder(f3)
      );
      iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)f9, (int)f10, (int)(f9 + f7), (int)(f10 + f11));
      float f15 = Math.min(1.0F, f4 * 2.0F);
      il1iliilli1l1iill1 = il1iliilli1l1iill1.ZenithInternal039(f15);
      ByteBufferHolder il1iliilli1l1iill3 = llliili1l1ii11i1lii1.I111llllll1ll1l1Il().ZenithInternal039(f3 * f15);
      ByteBufferHolder il1iliilli1l1iill4 = llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III().ZenithInternal039(f3);
      Font font = Fonts.MEDIUM.getFont(7.0F);
      String s = "Zenith DLC";
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s, f13 + f12 + 8.0F, f14 + (f12 - font.height()) / 2.0F + 1.0F, il1iliilli1l1iill1);
      float f24 = 10.0F;
      float f25 = 7.0F;
      float f16 = 10.0F + -3.0F * f4;
      float f17 = 10.5F;
      float f18 = f10 + 35.0F;
      int i = 0;

      for (SideBarCategory sidebarcategory : this.categories) {
         if (iill11i1il1ilii11iii1llil1ll == sidebarcategory.getCategory()) {
            float f19 = f18 + (float)i * (f16 + f17);
            float f20 = f9 + (f5 - f16) / 2.0F;
            this.animRect = new HeightHandler(
               doubleHolder_3.EventImpl_21(
                  (double)this.animRect.Il11lIlllI111I1l1111(), (double)(f9 + 4.0F), (double)this.animationChange.CloudFriendInfo()
               ),
               doubleHolder_3.EventImpl_21(
                  (double)this.animRect.I1II11l1I11Illl11IIl1l1lIl1II(), (double)f19, (double)this.animationChange.CloudFriendInfo()
               ),
               f7 - 8.0F,
               f16 + 11.0F
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               this.animRect.Il11lIlllI111I1l1111(),
               this.animRect.I1II11l1I11Illl11IIl1l1lIl1II(),
               f7 - 8.0F,
               f16 + 11.0F,
               floatHolder_5.StringHolder_30(4.0F),
               llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1().ZenithInternal039(f3)
            );
            floatHolder_8.EventTarget(
               iiii1ilili1l1l1lilli1liliii.getMatrices(),
               this.animRect.Il11lIlllI111I1l1111(),
               this.animRect.I1II11l1I11Illl11IIl1l1lIl1II(),
               f7 - 8.0F,
               f16 + 11.0F,
               -0.1F,
               floatHolder_5.StringHolder_30(4.0F),
               llliili1l1ii11i1lii1.Il11Il111I11lIl1I1I().ZenithInternal039(f3)
            );
            break;
         }

         i++;
      }

      this.animationChange.ZenithInternal095(1.0F);
      this.animationChange.ArmorHud();
      i = 0;

      for (SideBarCategory sidebarcategory1 : this.categories) {
         float f28 = f18 + (float)i * (f16 + f17);
         float f30 = f9 + (f5 - f16) / 2.0F;
         sidebarcategory1.render(
            iiii1ilili1l1l1lilli1liliii,
            f9 + 4.0F,
            f28,
            f7 - 8.0F,
            f16 + 11.0F,
            f4,
            iill11i1il1ilii11iii1llil1ll == sidebarcategory1.getCategory(),
            il1iliilli1l1iill1,
            il1iliilli1l1iill3,
            il1iliilli1l1iill4,
            il1iliilli1l1iill
         );
         this.categoryBounds.put(sidebarcategory1.getCategory(), new HeightHandler(f9 + 4.0F, f28, f7 - 8.0F, f16 + 11.0F));
         i++;
      }

      float f26 = 18.0F;
      float f27 = f9 + (f5 - f26) / 2.0F;
      float f29 = f10 + f11 - f26 - 8.0F;
      float f31 = f27 + 5.0F;
      float f21 = f29 - 19.0F;
      float f22 = 8.0F;
      float f23 = 8.0F;
      Font font1 = Fonts.ICONS.getFont(7.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font1, "6", f31, f21, llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III().ZenithInternal039(f3));
      this.sidebarToggleButtonBounds = new HeightHandler(f31, f21, f22, f23);
      boolean flag = ZenithInternal143.StringHolder_8((double)f27, (double)f29, (double)f26, (double)f26, iiii1ilili1l1l1lilli1liliii);
      floatHolder_8.StringHolder_8(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         ZenithClient.StringHolder_10("icons/avatar.png"),
         f27,
         f29,
         f26,
         f26,
         floatHolder_5.StringHolder_30(4.0F),
         ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f3)
      );
      floatHolder_8.EventTarget(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         f27,
         f29,
         f26,
         f26,
         -0.1F,
         floatHolder_5.StringHolder_30(3.0F),
         new ByteBufferHolder(181, 162, 255, flag ? 200 : 190).ZenithInternal039(f3)
      );
      String s1 = ZenithClient.getInstance().ListHolder_7().getUsername();
      Font font2 = Fonts.MEDIUM.getFont(6.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font2, s1, f27 + f26 + 8.0F, f29 + (f26 - font2.height()) / 2.0F, il1iliilli1l1iill1);
      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
   }

   public boolean handleMouseClicked(double d0, double d1) {
      if (this.sidebarToggleButtonBounds != null && this.sidebarToggleButtonBounds.byteHolder(d0, d1)) {
         this.onSidebarToggle.run();
         return true;
      } else {
         for (Entry entry : this.categoryBounds.entrySet()) {
            if (((HeightHandler)entry.getValue()).byteHolder(d0, d1)) {
               this.animationChange.ZenithInternal095(0.0F);
               this.animationChange.EventBus(0.0F);
               this.onCategorySelect.accept((Category)entry.getKey());
               return true;
            }
         }

         return false;
      }
   }

   public Map<Category, HeightHandler> getCategoryBounds() {
      return this.categoryBounds;
   }

   public HeightHandler getSidebarToggleButtonBounds() {
      return this.sidebarToggleButtonBounds;
   }

   public GetStartTimeHandler getSidebarAnimation() {
      return this.sidebarAnimation;
   }
}
