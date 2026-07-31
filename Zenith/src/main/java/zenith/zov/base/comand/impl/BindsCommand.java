package zenith.zov.base.comand.impl;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.List;
import net.minecraft.command.CommandSource;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.text.MutableText;
import zenith.StringHolder_3;
import zenith.BindSetting;
import zenith.ZenithClient;
import zenith.TextHolder;
import zenith.ByteBufferHolder;
import zenith.Setting;
import zenith.Module;
import zenith.zov.base.comand.api.CommandAbstract;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class BindsCommand extends CommandAbstract {
   public BindsCommand() {
      super("binds");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> literalargumentbuilder) {
      literalargumentbuilder.executes(commandcontext -> {
         this.sendHelp();
         return 1;
      });
      literalargumentbuilder.then(
         literal("list")
            .executes(
               commandcontext -> {
                  boolean flag = false;
                  int i = 0;

                  for (Module ll111il1lliill11 : ZenithClient.getInstance()
                     .getModuleManager()
                     .getModules()) {
                     List list = ll111il1lliill11.getSettings()
                        .stream()
                        .filter(l1i111illi1i1 -> l1i111illi1i1 instanceof BindSetting)
                        .map(l1i111illi1i1 -> (BindSetting)l1i111illi1i1)
                        .filter(iii11ll1iiiiiill1lil1 -> this.isBound(iii11ll1iiiiiill1lil1.Elytramotion()))
                        .toList();
                     boolean flag1 = this.isBound(ll111il1lliill11.Elytramotion());
                     if (flag1 || !list.isEmpty()) {
                        if (!flag) {
                           this.sendTitle("Назначенные бинды");
                           flag = true;
                        }

                        if (flag1) {
                           this.sendBindLine(
                              ll111il1lliill11.getName(), StringHolder_3.doubleHolder_2(ll111il1lliill11.Elytramotion()), false
                           );
                           i++;
                        } else {
                           this.sendModuleLine(ll111il1lliill11.getName());
                        }

                        for (BindSetting iii11ll1iiiiiill1lil : list) {
                           this.sendBindLine(
                              iii11ll1iiiiiill1lil.getName(), StringHolder_3.doubleHolder_2(iii11ll1iiiiiill1lil.Elytramotion()), true
                           );
                           i++;
                        }
                     }
                  }

                  if (!flag) {
                     TextHolder.EventImpl_27("Список биндов пуст!");
                  } else {
                     this.sendFooter("Всего биндов: " + i);
                  }

                  return 1;
               }
            )
      );
      literalargumentbuilder.then(literal("clear").executes(commandcontext -> {
         int i = this.clearBinds();
         if (i == 0) {
            TextHolder.EventImpl_27("Бинды уже пусты!");
         } else {
            this.sendTitle("Бинды очищены");
            this.sendFooter("Сброшено биндов: " + i);
         }

         return 1;
      }));
      literalargumentbuilder.then(literal("help").executes(commandcontext -> {
         this.sendHelp();
         return 1;
      }));
   }

   private boolean isBound(int i) {
      return i != StringHolder_3.I1llll1lIlI1Ill1l11l1l1l.lIIl11lIl11l1l1lI11I1111I11 && !StringHolder_3.doubleHolder_2(i).isEmpty();
   }

   private int clearBinds() {
      int i = 0;

      for (Module ll111il1lliill11 : ZenithClient.getInstance().getModuleManager().getModules()) {
         if (this.isBound(ll111il1lliill11.Elytramotion())) {
            ll111il1lliill11.setKeyCode(StringHolder_3.I1llll1lIlI1Ill1l11l1l1l.lIIl11lIl11l1l1lI11I1111I11);
            i++;
         }

         for (BindSetting iii11ll1iiiiiill1lil : this.getKeySettings(ll111il1lliill11)) {
            if (this.isBound(iii11ll1iiiiiill1lil.Elytramotion())) {
               iii11ll1iiiiiill1lil.setKeyCode(StringHolder_3.I1llll1lIlI1Ill1l11l1l1l.lIIl11lIl11l1l1lI11I1111I11);
               i++;
            }
         }
      }

      return i;
   }

   private List<BindSetting> getKeySettings(Module ll111il1lliill11) {
      return ll111il1lliill11.getSettings()
         .stream()
         .filter(l1i111illi1i1 -> l1i111illi1i1 instanceof BindSetting)
         .map(l1i111illi1i1 -> (BindSetting)l1i111illi1i1)
         .toList();
   }

   private void sendHelp() {
      this.sendTitle("Binds");
      this.sendDescription();
      this.sendUsage(".binds list", "вывести все назначенные бинды");
      this.sendUsage(".binds clear", "очистить все бинды");
   }

   private void sendTitle(String s) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      this.sendStyled(this.part(s, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), true));
   }

   private void sendDescription() {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      this.sendStyled(
         this.part(
            "Показывает назначенные клавиши модулей и KeySetting, а также может очистить их.",
            zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(),
            false
         )
      );
   }

   private void sendUsage(String s, String s1) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      MutableText MutableText = Text.empty()
         .append(this.part(s, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), true))
         .append(this.part(" - ", zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1(), false))
         .append(this.part(s1, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), false));
      this.sendStyled(MutableText);
   }

   private void sendModuleLine(String s) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      this.sendStyled(this.part(s, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), true));
   }

   private void sendBindLine(String s, String s1, boolean flag) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      MutableText MutableText = Text.empty();
      if (flag) {
         MutableText.append(this.part("  - ", zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1(), false));
      }

      MutableText.append(
            this.part(
               s, flag ? zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1() : zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), !flag
            )
         )
         .append(this.part(" -> ", zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1(), false))
         .append(this.part(s1, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), true));
      this.sendStyled(MutableText);
   }

   private void sendFooter(String s) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      this.sendStyled(this.part(s, zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1(), false));
   }

   private void sendStyled(MutableText MutableText) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
         l11I1I1ll1Illll1I1l1111l1II.player.sendMessage(this.buildPrefix().append(Text.literal(" ")).append(MutableText), false);
      }
   }

   private MutableText buildPrefix() {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      return Text.empty()
         .append(this.part("[ ", zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1(), false))
         .append(this.part("Zenith", zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), true))
         .append(this.part(" ]", zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1(), false));
   }

   private MutableText part(String s, ByteBufferHolder il1iliilli1l1iill, boolean flag) {
      return Text.literal(s).setStyle(Style.EMPTY.withColor(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII()).withBold(flag));
   }
}
