package zenith.zov.client.screens.menu.settings.impl.popup;

import zenith.hud.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.stream.Stream;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.client.util.math.Vector2f;
import zenith.floatHolder_4;
import zenith.floatHolder_5;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.doubleHolder;
import zenith.doubleHolder_3;
import zenith.GetHeightHandler;
import zenith.OnMouseClickedHandler;
import zenith.HeightHandler;
import zenith.ListSetting;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.menu.settings.api.MenuPopupSetting;

public class MenuItemPopupSetting extends MenuPopupSetting {
   private final OnMouseClickedHandler searchBox;
   private final ListSetting setting;
   private final doubleHolder scrollHandler = new doubleHolder();
   private boolean rebornSort = false;
   private Map<Block, HeightHandler> itemBounds = new HashMap<>();

   public MenuItemPopupSetting(ListSetting lilliii1illl, GetHeightHandler l1l1ii11lllll) {
      super(l1l1ii11lllll);
      this.searchBox = new OnMouseClickedHandler(new Vector2f(0.0F, 0.0F), Fonts.MEDIUM.getFont(7.0F), "Search...", 78.0F);
      this.animationScale.StringHolder_8(1.0F);
      this.setting = lilliii1illl;
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f10, float f11, float f, SetColorHandler_3 llliili1l1ii11i1lii1) {
      this.animationScale.ArmorHud();
      f = 1.0F;
      float f1 = this.bounds.getX();
      float f2 = this.bounds.getY();
      float f3 = this.bounds.getWidth();
      float f4 = this.bounds.getHeight() - 20.0F - 4.0F;
      iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(this.bounds.getX(), this.bounds.getY() + this.bounds.getHeight() / 2.0F, 0.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().scale(this.animationScale.CloudFriendInfo(), this.animationScale.CloudFriendInfo(), 1.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(-this.bounds.getX(), -(this.bounds.getY() + this.bounds.getHeight() / 2.0F), 0.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         this.bounds.getX(),
         this.bounds.getY(),
         this.bounds.getWidth(),
         f4,
         floatHolder_5.StringHolder_30(4.0F),
         llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l().ZenithInternal039(f)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         this.bounds.getX(),
         this.bounds.getY(),
         this.bounds.getWidth(),
         18.0F,
         floatHolder_5.StringHolder_19(4.0F, 4.0F),
         llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1().ZenithInternal039(f)
      );
      Font font = Fonts.MEDIUM.getFont(7.0F);
      Font font1 = Fonts.ICONS.getFont(7.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font, this.setting.getName(), f1 + 8.0F + 11.2F + 3.0F, f2 + 7.55F, llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl()
      );
      iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f1 + 8.0F, f2 + 4.4F, 0.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().scale(0.7F, 0.7F, 1.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(Items.TOTEM_OF_UNDYING.getDefaultStack(), 0, 0);
      iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
      float f5 = 14.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f1 + f3 - f5 - 8.0F, f2 + 3.0F, f5, f5, floatHolder_5.StringHolder_30(2.0F), llliili1l1ii11i1lii1.I1llIl11Il().ZenithInternal039(f)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1, "W", f1 + f3 - 8.0F - f5 + (f5 - font1.width("W")) / 2.0F + 1.0F, f2 + 6.6F, llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      List list = this.searchBox.isEmpty() && this.rebornSort ? getAllBlocks().toList() : getAllBlocks().sorted((Block, Block) -> {
         if (this.searchBox.isEmpty()) {
            boolean flag3 = this.setting.EventTarget(Blockxx);
            boolean flag4 = this.setting.EventTarget(Blockx);
            return Boolean.compare(!flag3, !flag4);
         } else {
            String s1 = this.searchBox.II1I11IIl().toLowerCase().trim();
            String s2 = Blockxx.getTranslationKey().replaceFirst("^block\\.minecraft\\.", "").replaceAll("_", " ");
            String s3 = Blockx.getTranslationKey().replaceFirst("^block\\.minecraft\\.", "").replaceAll("_", " ");
            boolean flag1 = s2.toLowerCase().contains(s1);
            boolean flag2 = s3.toLowerCase().contains(s1);
            return Boolean.compare(!flag1, !flag2);
         }
      }).toList();
      float f6 = (float)list.size() * 20.0F;
      this.scrollHandler.ZenithInternal084((double)Math.max(0.0F, f6 - f4));
      this.scrollHandler.Coordinates();
      byte b0 = 4;
      float f7 = (float)(b0 + 18) + f2 - (float)this.scrollHandler.IIIlII1Il1l111lI1();
      float f8 = f1;
      float f9 = f3;
      ByteBufferHolder il1iliilli1l1iill = llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl().ZenithInternal039(f);
      ByteBufferHolder il1iliilli1l1iill1 = llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f);
      this.itemBounds.clear();
      ByteBufferHolder il1iliilli1l1iill2 = llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l();
      ByteBufferHolder il1iliilli1l1iill3 = llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)f1, (int)f2 + 18 + b0, (int)(f1 + f3), (int)(f2 + f4 - (float)b0));
      int i = 0;

      for (Block Block : list) {
         if (Block != Blocks.AIR) {
            i++;
            if (f7 < f2) {
               f7 += 20.0F;
            } else {
               boolean flag = this.setting.EventTarget(Block);
               HeightHandler li1il11i1iilii1iiili111li11 = new HeightHandler(f8, f7, f9, 20.0F);
               iiii1ilili1l1l1lilli1liliii.StringHolder_8(
                  li1il11i1iilii1iiili111li11.Il11lIlllI111I1l1111(),
                  li1il11i1iilii1iiili111li11.I1II11l1I11Illl11IIl1l1lIl1II(),
                  li1il11i1iilii1iiili111li11.width(),
                  li1il11i1iilii1iiili111li11.height(),
                  floatHolder_5.IlI11I1ll1lI1I11IlI1Il1,
                  flag ? il1iliilli1l1iill1 : (i % 2 == 0 ? il1iliilli1l1iill2 : il1iliilli1l1iill3)
               );
               this.itemBounds.put(Block, li1il11i1iilii1iiili111li11);
               String s = Block.getTranslationKey().replaceFirst("^block\\.minecraft\\.", "").replaceAll("_", " ");
               s = s.substring(0, 1).toUpperCase() + s.substring(1);
               iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
               iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f8 + 8.0F, f7 + 4.4F, 0.0F);
               iiii1ilili1l1l1lilli1liliii.getMatrices().scale(0.7F, 0.7F, 1.0F);
               iiii1ilili1l1l1lilli1liliii.StringHolder_8(Block.asItem().getDefaultStack(), 0, 0);
               iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
               iiii1ilili1l1l1lilli1liliii.StringHolder_8(
                  Fonts.BOLD.getFont(8.0F), ".", f8 + 8.0F + 11.2F + 3.0F, f7 + 5.0F, llliili1l1ii11i1lii1.l1l1lIIlI1l11()
               );
               iiii1ilili1l1l1lilli1liliii.StringHolder_8(
                  font, s, f8 + 8.0F + 11.2F + 8.0F, f7 + 7.55F, flag ? il1iliilli1l1iill : llliili1l1ii11i1lii1.I111llllll1ll1l1Il()
               );
               f7 += 20.0F;
               if (f7 > f2 + f4) {
                  break;
               }
            }
         }
      }

      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)f1, (int)(f2 + f4 + 4.0F), (int)(f1 + f3), (int)(f2 + f4 + 24.0F));
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f1, f2 + f4 + 4.0F, f3, 20.0F, floatHolder_5.StringHolder_30(4.0F), llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l().ZenithInternal039(f)
      );
      this.searchBox.setWidth(f3 - 20.0F);
      this.searchBox
         .StringHolder_8(
            iiii1ilili1l1l1lilli1liliii,
            f1 + 8.0F,
            f2 + f4 + 4.0F + 8.0F,
            llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl().ZenithInternal039(f),
            llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III().ZenithInternal039(f)
         );
      this.searchBox.EventImpl_38(35);
      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
   }

   @Override
   public void onMouseDragged(double d0, double d1, ZenithInternal068 ill1iili11ii1l, double d2, double d3) {
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      return this.searchBox.keyPressed(i, j, k);
   }

   @Override
   public boolean charTyped(char c0, int i) {
      return this.searchBox.charTyped(c0, i);
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      this.searchBox.onMouseClicked(d0, d1, ill1iili11ii1l);
      float f = this.bounds.getX();
      float f1 = this.bounds.getY();
      float f2 = this.bounds.getWidth();
      float f3 = this.bounds.getHeight();
      if (d1 > (double)(f1 + 18.0F)) {
         for (Entry entry : this.itemBounds.entrySet()) {
            if (((HeightHandler)entry.getValue()).byteHolder(d0, d1)) {
               if (this.setting.EventTarget((Block)entry.getKey())) {
                  this.setting.EventBus((Block)entry.getKey());
               } else {
                  this.setting.StringHolder_8((Block)entry.getKey());
               }

               return;
            }
         }
      }

      if (doubleHolder_3.StringHolder_8(d0, d1, (double)(f + f2 - 8.0F - 16.0F), (double)(f1 + 3.0F), 16.0, 16.0)) {
         this.rebornSort = !this.rebornSort;
         this.scrollHandler.ZenithInternal061(0.0);
      }
   }

   @Override
   public boolean mouseScrolled(double d1, double d2, double d3, double d0) {
      this.scrollHandler.ZenithInternal101(d0);
      return true;
   }

   @Override
   public float getWidth() {
      return 0.0F;
   }

   @Override
   public float getHeight() {
      return 0.0F;
   }

   @Override
   public boolean isVisible() {
      return true;
   }

   public static Stream<Block> getAllBlocks() {
      return Stream.of(Blocks.class.getDeclaredFields())
         .filter(field -> Modifier.isStatic(field.getModifiers()))
         .filter(field -> Modifier.isPublic(field.getModifiers()))
         .filter(field -> Block.class.isAssignableFrom(field.getType()))
         .map(field -> {
            try {
               return (Block)field.get(null);
            } catch (IllegalAccessException illegalaccessexception) {
               throw new RuntimeException(illegalaccessexception);
            }
         });
   }

   @Override
   public boolean equals(Object object) {
      if (this == object) {
         return true;
      } else {
         return object instanceof MenuItemPopupSetting menuitempopupsetting1 ? this.setting == menuitempopupsetting1.setting : false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.setting);
   }
}
