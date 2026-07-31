package zenith.zov.client.screens.nlgui.elements.setting;

import zenith.hud.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.client.util.math.Vector2f;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.doubleHolder;
import zenith.floatHolder_8;
import zenith.OnMouseClickedHandler;
import zenith.ZenithInternal097$Helper;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.ListSetting;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.api.GuiSetting;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class GuiItemSelectSetting extends GuiSetting<ListSetting> {
   private final GetStartTimeHandler animationExpanded = new GetStartTimeHandler(200L, IReturn.ListHolder_8);
   private OnMouseClickedHandler searchBox;
   private final doubleHolder scrollHandler = new doubleHolder();
   private boolean sortBySelected = false;
   private HeightHandler bounds;
   private HeightHandler rectBounds;
   private HeightHandler exitBounds;
   private HeightHandler searchBounds;
   private HeightHandler sortBounds;
   private HeightHandler listScissorBounds;
   private final Map<Block, HeightHandler> itemBounds = new HashMap<>();
   private boolean expanded;

   public GuiItemSelectSetting(ListSetting lilliii1illl) {
      this(lilliii1illl, 166.0F);
   }

   public GuiItemSelectSetting(ListSetting lilliii1illl, float f) {
      super(f, lilliii1illl);
   }

   @Override
   public String getName() {
      return this.setting.getName();
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null && this.bounds.StringHolder_8(d0, d1, 2.0F)) {
         this.expanded = !this.expanded;
         return true;
      } else if (this.expanded && this.rectBounds != null && this.rectBounds.byteHolder(d0, d1)) {
         return true;
      } else {
         this.expanded = false;
         return false;
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         this.animationVisible.ZenithInternal101(this.setting.isVisible());
         f4 *= this.animationVisible.CloudFriendInfo();
         Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
         Font font1 = Fonts.NEW_REGULAR.getFont(5.4F);
         float f5 = this.width / 1.4F - (float)GuiStyle.PADDING.intValue();
         ByteBufferHolder il1iliilli1l1iill = zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4);
         ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4);
         ByteBufferHolder il1iliilli1l1iill2 = zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4);
         this.drawDefault(
            iiii1ilili1l1l1lilli1liliii,
            f,
            f1,
            "i",
            this.setting.getName(),
            this.setting.llllIII11IIl1ll1llI1lII1I(),
            font,
            font1,
            f2,
            f3,
            f5,
            il1iliilli1l1iill,
            il1iliilli1l1iill1,
            il1iliilli1l1iill2
         );
         float f6 = 6.0F;
         float f7 = 6.0F;
         this.bounds = new HeightHandler(f2 + this.width - f6, f3 + (this.getHeight() - f7) / 2.0F, f6, f7);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            this.bounds.Il11lIlllI111I1l1111(),
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            f6,
            f7,
            floatHolder_5.StringHolder_30(1.0F),
            zenithstyle.getFieldSurfaceBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            this.bounds.Il11lIlllI111I1l1111(),
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            f6,
            f7,
            -0.5F,
            floatHolder_5.StringHolder_30(1.0F),
            zenithstyle.getFieldBorder().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         Font font2 = Fonts.NEW_ICONS.getFont(5.5F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font2,
            "v",
            this.bounds.Il11lIlllI111I1l1111() + (f6 - font2.width("v")) / 2.0F,
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II() + (f7 - font2.height()) / 2.0F,
            zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
      }
   }

   @Override
   public void renderPriority(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f36, float f37, float f2, float f38) {
      this.animationExpanded.ZenithInternal101(this.expanded);
      if (!(this.animationExpanded.CloudFriendInfo() <= 0.0F) && this.bounds != null) {
         if (this.searchBox == null) {
            this.searchBox = new OnMouseClickedHandler(new Vector2f(0.0F, 0.0F), Fonts.NEW_MEDIUM.getFont(5.3F), "Search...", 0.0F);
            this.searchBox.StringHolder_8(ZenithInternal097$Helper.III11IIl1l1l1lI);
         }

         float f3 = (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f4 = f3 * 2.0F + this.getHeight();
         float f5 = 17.0F;
         float f6 = 115.0F;
         float f7 = 126.0F;
         float f8 = f3 * 2.0F;
         float f9 = f4 + f3 + f5 + f8 + f6;
         float f10 = this.bounds.Il11lIlllI111I1l1111() + (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f11 = this.bounds.I1II11l1I11Illl11IIl1l1lIl1II() - f9 / 2.0F;
         this.rectBounds = new HeightHandler(f10, f11, f7, f9);
         f2 *= this.animationExpanded.CloudFriendInfo();
         iiii1ilili1l1l1lilli1liliii.getMatrices().push();
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f10, this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(), 0.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices()
            .scale(this.animationExpanded.CloudFriendInfo(), this.animationExpanded.CloudFriendInfo(), 1.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(-f10, -this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(), 0.0F);
         ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
         if (zenithstyle != null) {
            floatHolder_8.EventImpl_24(
               iiii1ilili1l1l1lilli1liliii.getMatrices(),
               f10,
               f11,
               f7,
               f9,
               12.0F,
               floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f10,
               f11,
               f7,
               f4,
               floatHolder_5.StringHolder_19((float)GuiStyle.ROUND.intValue() / 2.0F, (float)GuiStyle.ROUND.intValue() / 2.0F),
               zenithstyle.getRightBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f10,
               f11 + f4,
               f7,
               f3 + f5 + f8,
               floatHolder_5.IlI11I1ll1lI1I11IlI1Il1,
               zenithstyle.getPanelLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f10,
               f11 + f4 + f5 + f8,
               f7,
               f6 + f3,
               floatHolder_5.ZenithInternal061((float)GuiStyle.ROUND.intValue() / 2.0F, (float)GuiStyle.ROUND.intValue() / 2.0F),
               zenithstyle.getRightBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            Font font = Fonts.NEW_ICONS.getFont(4.0F);
            float f12 = f10 + f7 - font.width("2") - f3;
            float f13 = f11 + f3 + font.height();
            this.exitBounds = new HeightHandler(f12, f13, 5.0F, 5.0F);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font, "2", f12, f13, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
            Font font2 = Fonts.NEW_REGULAR.getFont(5.3F);
            float f14 = f7 / 1.4F - (float)GuiStyle.PADDING.intValue();
            ByteBufferHolder il1iliilli1l1iill = zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2);
            ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2);
            ByteBufferHolder il1iliilli1l1iill2 = zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2);
            this.drawDefault(
               iiii1ilili1l1l1lilli1liliii,
               f,
               f1,
               "i",
               this.setting.getName(),
               this.setting.llllIII11IIl1ll1llI1lII1I(),
               font1,
               font2,
               f10 + f3,
               f11 + f3,
               f14,
               il1iliilli1l1iill,
               il1iliilli1l1iill1,
               il1iliilli1l1iill2
            );
            float f15 = f11 + f4 + f3;
            this.searchBounds = new HeightHandler(f10 + f3, f15, f7 - f3 * 2.0F, f5);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               this.searchBounds.Il11lIlllI111I1l1111(),
               this.searchBounds.I1II11l1I11Illl11IIl1l1lIl1II(),
               this.searchBounds.width(),
               this.searchBounds.height(),
               floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
               zenithstyle.getFieldSurfaceBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.EventBus(
               this.searchBounds.Il11lIlllI111I1l1111(),
               this.searchBounds.I1II11l1I11Illl11IIl1l1lIl1II(),
               this.searchBounds.width(),
               this.searchBounds.height(),
               0.1F,
               floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
               zenithstyle.getFieldBorder().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            float f16 = 14.0F;
            float f17 = this.searchBounds.width() - f3 * 2.0F - f16 - f3;
            this.searchBox.setWidth(f17);
            this.searchBox.EventImpl_38(35);
            this.searchBox
               .StringHolder_8(
                  iiii1ilili1l1l1lilli1liliii,
                  this.searchBounds.Il11lIlllI111I1l1111() + f3,
                  this.searchBounds.I1II11l1I11Illl11IIl1l1lIl1II() + (f5 - Fonts.NEW_MEDIUM.getFont(5.3F).height()) / 2.0F,
                  zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2),
                  zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
               );
            this.sortBounds = new HeightHandler(
               this.searchBounds.Il11lIlllI111I1l1111() + this.searchBounds.width() - f3 - f16, f15 + (f5 - f16) / 2.0F, f16, f16
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               this.sortBounds.Il11lIlllI111I1l1111(),
               this.sortBounds.I1II11l1I11Illl11IIl1l1lIl1II(),
               f16,
               f16,
               floatHolder_5.StringHolder_30(2.0F),
               zenithstyle.getFieldSurfaceBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            Font font3 = Fonts.NEW_ICONS.getFont(5.0F);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font3,
               "W",
               this.sortBounds.Il11lIlllI111I1l1111() + (f16 - font3.width("W")) / 2.0F,
               this.sortBounds.I1II11l1I11Illl11IIl1l1lIl1II() + (f16 - font3.height()) / 2.0F,
               zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            List list = this.getFilteredAndSortedBlocks();
            float f18 = 13.0F;
            float f19 = f18 + (float)GuiStyle.PADDING.intValue();
            float f20 = (float)list.size() * f19;
            this.scrollHandler.ZenithInternal084((double)Math.max(0.0F, f20 - f6));
            this.scrollHandler.Coordinates();
            float f21 = f15 + f5 + f8;
            this.listScissorBounds = new HeightHandler(f10, f21, f7, f6 - f3);
            float f22 = f21 - (float)this.scrollHandler.IIIlII1Il1l111lI1();
            float f23 = f10 + f3;
            float f24 = 105.0F;
            this.itemBounds.clear();
            iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)f10, (int)f21, (int)(f10 + f7), (int)(f21 + f6));
            Font font4 = Fonts.NEW_MEDIUM.getFont(5.3F);
            float f25 = 8.0F;
            float f26 = 0.5F;
            int i = 0;
            ByteBufferHolder il1iliilli1l1iill3 = zenithstyle.getFieldSurfaceBackground().HostnameVerifierImpl(f2);
            ByteBufferHolder il1iliilli1l1iill4 = zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(0.25F * f2);
            ByteBufferHolder il1iliilli1l1iill5 = zenithstyle.getFieldBorder().HostnameVerifierImpl(f2);

            for (Block Block : list) {
               if (f22 + (float)i * f19 < f21 - f19) {
                  i++;
               } else {
                  float f27 = f22 + (float)i * f19;
                  if (f27 > f21 + f6) {
                     break;
                  }

                  boolean flag = this.setting.EventTarget(Block);
                  HeightHandler li1il11i1iilii1iiili111li11 = new HeightHandler(f23, f27, f24, f18);
                  this.itemBounds.put(Block, li1il11i1iilii1iiili111li11);
                  iiii1ilili1l1l1lilli1liliii.StringHolder_8(
                     li1il11i1iilii1iiili111li11.Il11lIlllI111I1l1111(),
                     li1il11i1iilii1iiili111li11.I1II11l1I11Illl11IIl1l1lIl1II(),
                     li1il11i1iilii1iiili111li11.width(),
                     li1il11i1iilii1iiili111li11.height(),
                     floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
                     flag ? il1iliilli1l1iill4 : il1iliilli1l1iill3
                  );
                  iiii1ilili1l1l1lilli1liliii.EventBus(
                     li1il11i1iilii1iiili111li11.Il11lIlllI111I1l1111(),
                     li1il11i1iilii1iiili111li11.I1II11l1I11Illl11IIl1l1lIl1II(),
                     li1il11i1iilii1iiili111li11.width(),
                     li1il11i1iilii1iiili111li11.height(),
                     0.1F,
                     floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
                     il1iliilli1l1iill5
                  );
                  iiii1ilili1l1l1lilli1liliii.getMatrices().push();
                  iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f23 + 4.0F, f27 + (f18 - f25) / 2.0F, 0.0F);
                  iiii1ilili1l1l1lilli1liliii.getMatrices().scale(f26, f26, 1.0F);
                  iiii1ilili1l1l1lilli1liliii.StringHolder_8(Block.asItem().getDefaultStack(), 0, 0);
                  iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
                  String s = Block.getTranslationKey().replaceFirst("^block\\.minecraft\\.", "").replaceAll("_", " ");
                  if (!s.isEmpty()) {
                     s = s.substring(0, 1).toUpperCase() + s.substring(1);
                  }

                  float f28 = f23 + (float)GuiStyle.PADDING.intValue() + f25 + (float)GuiStyle.PADDING.intValue() / 2.0F;
                  iiii1ilili1l1l1lilli1liliii.StringHolder_8(
                     font4,
                     s,
                     f28,
                     f27 + (f18 - font4.height()) / 2.0F,
                     (flag ? zenithstyle.getTextEnable() : zenithstyle.getTextSecondary()).l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
                  );
                  i++;
               }
            }

            iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
            float f29 = 1.5F;
            float f30 = f10 + f7 - f3 - f29;
            float f31 = f6 - f3 / 2.0F;
            if (this.scrollHandler.l1IIlIIlI11lII1() > 0.0) {
               iiii1ilili1l1l1lilli1liliii.StringHolder_8(
                  f30,
                  f21,
                  f29,
                  f31,
                  floatHolder_5.StringHolder_30(0.5F),
                  zenithstyle.getFieldSurfaceBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
               );
               float f32 = (float)(this.scrollHandler.IIIlII1Il1l111lI1() / this.scrollHandler.l1IIlIIlI11lII1());
               float f33 = Math.max(f31 * (f31 / (float)((double)f31 + this.scrollHandler.l1IIlIIlI11lII1())), 12.0F);
               float f34 = Math.max(1.0F, f31 - f33);
               float f35 = f21 + f34 * f32;
               f35 = Math.min(f21 + f31 - f33, f35);
               iiii1ilili1l1l1lilli1liliii.StringHolder_8(
                  f30,
                  f35,
                  f29,
                  f33,
                  floatHolder_5.StringHolder_30(0.5F),
                  zenithstyle.getFieldBorder().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
               );
            }

            iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
         }
      }
   }

   private List<Block> getFilteredAndSortedBlocks() {
      String s = this.searchBox != null && !this.searchBox.isEmpty() ? this.searchBox.II1I11IIl().toLowerCase().trim() : "";
      Stream stream = getAllBlocks().filter(Block -> Block != Blocks.AIR);
      if (!s.isEmpty()) {
         stream = stream.filter(Block -> {
            String s2 = Block.getTranslationKey().replaceFirst("^block\\.minecraft\\.", "").replaceAll("_", " ");
            return s2.toLowerCase().contains(s);
         });
      }

      ArrayList arraylist = new ArrayList(stream.toList());
      if (this.sortBySelected || s.isEmpty()) {
         arraylist.sort((Block, Block) -> {
            boolean flag = this.setting.EventTarget(Blockx);
            boolean flag1 = this.setting.EventTarget(Block);
            return Boolean.compare(!flag, !flag1);
         });
      }

      return arraylist;
   }

   private static Stream<Block> getAllBlocks() {
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
   public boolean onMousePriorityClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (!this.expanded || this.rectBounds == null) {
         return false;
      } else if (!this.rectBounds.byteHolder(d0, d1)) {
         this.expanded = false;
         if (this.searchBox != null) {
            this.searchBox.setSelected(false);
         }

         return false;
      } else if (this.exitBounds != null && this.exitBounds.StringHolder_8(d0, d1, 2.0F)) {
         this.expanded = false;
         if (this.searchBox != null) {
            this.searchBox.setSelected(false);
         }

         return true;
      } else if (this.searchBounds != null && this.searchBounds.byteHolder(d0, d1)) {
         if (this.searchBox != null) {
            this.searchBox.setSelected(true);
         }

         return true;
      } else {
         if (this.searchBox != null) {
            this.searchBox.setSelected(false);
         }

         if (this.sortBounds != null && this.sortBounds.StringHolder_8(d0, d1, 2.0F)) {
            this.sortBySelected = !this.sortBySelected;
            this.scrollHandler.ZenithInternal061(0.0);
            return true;
         } else {
            if (this.listScissorBounds != null && this.listScissorBounds.byteHolder(d0, d1) && ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0) {
               for (Entry entry : this.itemBounds.entrySet()) {
                  if (((HeightHandler)entry.getValue()).byteHolder(d0, d1)) {
                     if (this.setting.EventTarget((Block)entry.getKey())) {
                        this.setting.EventBus((Block)entry.getKey());
                     } else {
                        this.setting.StringHolder_8((Block)entry.getKey());
                     }

                     return true;
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean onMousePriorityScroll(double d0, double d1, double d3, double d2) {
      if (!this.expanded) {
         return false;
      } else if (this.listScissorBounds != null && this.listScissorBounds.byteHolder(d0, d1)) {
         this.scrollHandler.ZenithInternal101(d2 * 10.0);
         return true;
      } else {
         this.expanded = false;
         if (this.searchBox != null) {
            this.searchBox.setSelected(false);
         }

         return false;
      }
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      return this.expanded && this.searchBox != null && this.searchBox.keyPressed(i, j, k) ? true : super.keyPressed(i, j, k);
   }

   @Override
   public boolean charTyped(char c0, int i) {
      return this.expanded && this.searchBox != null && this.searchBox.charTyped(c0, i) ? true : super.charTyped(c0, i);
   }
}
