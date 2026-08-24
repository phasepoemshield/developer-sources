package org.zenith.addon.internal;

import org.zenith.core.ItemRegistry;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.BooleanSetting2;
import org.zenith.setting.BooleanSetting3;
import org.zenith.setting.ColorSetting;
import org.zenith.setting.ModeSetting;
import org.zenith.setting.ModeSetting_Var159;
import org.zenith.setting.ModeSetting2;
import org.zenith.setting.ModeSetting3;
import org.zenith.setting.ModeSetting3_Var159;
import org.zenith.setting.NumberSetting;
import org.zenith.setting.Setting;
import org.zenith.setting.StringSetting;
import org.zenith.setting.StringSetting2;

import org.zenith.addon.api.frontend.SettingAccess;
import org.zenith.addon.api.frontend.SettingType;
import org.zenith.setting.BooleanSetting;
import org.zenith.setting.BooleanSetting2;
import org.zenith.setting.BooleanSetting3;
import org.zenith.setting.ColorSetting;
import org.zenith.setting.ModeSetting;
import org.zenith.setting.ModeSetting_Var159;
import org.zenith.setting.ModeSetting2;
import org.zenith.setting.ModeSetting3;
import org.zenith.setting.ModeSetting3_Var159;
import org.zenith.module.Module;
import org.zenith.setting.NumberSetting;
import org.zenith.setting.Setting;
import org.zenith.setting.StringSetting;
import org.zenith.setting.StringSetting2;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
















import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

final class ZenithSettingAccess implements SettingAccess {
   public final Module module;
   public final Setting setting;

   ZenithSettingAccess(Module var1, Setting var2) {
      this.module = Objects.requireNonNull(var1, "module");
      this.setting = Objects.requireNonNull(var2, "setting");
   }

   @Override
   public String id() {
      return this.module instanceof AddonBackedModule addonbackedmodule ? addonbackedmodule.getSettingId(this.setting) : this.setting.getKey();
   }

   @Override
   public String name() {
      return this.setting.getName();
   }

   @Override
   public String description() {
      return this.setting.getDescription();
   }

   @Override
   public SettingType type() {
      if (this.setting instanceof BooleanSetting) {
         return SettingType.BOOLEAN;
      } else if (this.setting instanceof NumberSetting) {
         return SettingType.NUMBER;
      } else if (this.setting instanceof ModeSetting3) {
         return SettingType.CHOICE;
      } else if (this.setting instanceof BooleanSetting2) {
         return SettingType.TEXT;
      } else if (this.setting instanceof ColorSetting) {
         return SettingType.COLOR;
      } else if (this.setting instanceof StringSetting) {
         return SettingType.ACTION;
      } else if (this.setting instanceof StringSetting2) {
         return SettingType.KEY;
      } else if (this.setting instanceof ModeSetting) {
         return SettingType.MULTI_BOOLEAN;
      } else if (this.setting instanceof ModeSetting2) {
         return SettingType.ITEM_LIST;
      } else {
         return this.setting instanceof BooleanSetting3 ? SettingType.GROUP : SettingType.UNKNOWN;
      }
   }

   @Override
   public boolean visible() {
      try {
         return this.setting.isVisible();
      } catch (RuntimeException runtimeexception) {
         return false;
      }
   }

   @Override
   public Object value() {
      return switch (this.type()) {
         case BOOLEAN -> ((BooleanSetting)this.setting).isEnabled();
         case NUMBER -> (double)((NumberSetting)this.setting).getCurrent();
         case CHOICE -> ((ModeSetting3)this.setting).get();
         case TEXT -> ((BooleanSetting2)this.setting).getValue();
         case COLOR -> ((ColorSetting)this.setting).getIntColor();
         case KEY -> ((StringSetting2)this.setting).getKeyCode();
         case MULTI_BOOLEAN -> ((ModeSetting)this.setting).zClass100Var143Var143();
         case ITEM_LIST -> List.copyOf(((ModeSetting2)this.setting).queue4());
         case ACTION, GROUP, UNKNOWN -> null;
      };
   }

   @Override
   public boolean value(Object var1) {
      try {
         switch (this.type()) {
            case BOOLEAN:
               if (!(var1 instanceof Boolean obool)) {
                  return false;
               }

               ((BooleanSetting)this.setting).setEnabled(obool);
               break;
            case NUMBER:
               if (!(var1 instanceof Number number2)) {
                  return false;
               }

               float f = number2.floatValue();
               NumberSetting lilliiill11llilll1ll1l = (NumberSetting)this.setting;
               if (!Float.isFinite(f) || f < lilliiill11llilll1ll1l.getMin() || f > lilliiill11llilll1ll1l.getMax()) {
                  return false;
               }

               lilliiill11llilll1ll1l.setCurrent(f);
               break;
            case CHOICE:
               if (!(var1 instanceof String s1) || !this.choices().contains(s1)) {
                  return false;
               }

               ((ModeSetting3)this.setting).set(s1);
               break;
            case TEXT:
               if (!(var1 instanceof String s) || !((BooleanSetting2)this.setting).setValueSafe(s)) {
                  return false;
               }
               break;
            case COLOR:
               if (!(var1 instanceof Number number1)) {
                  return false;
               }

               ((ColorSetting)this.setting).setColor(number1.intValue());
               break;
            case KEY:
               if (!(var1 instanceof Number number)) {
                  return false;
               }

               ((StringSetting2)this.setting).setKeyCode(number.intValue());
               break;
            case MULTI_BOOLEAN:
               if (!(var1 instanceof List list1)) {
                  return false;
               }

               var set1 = strings(list1);
               if (set1 == null || !new HashSet<>(this.choices()).containsAll(set1)) {
                  return false;
               }

               for (ModeSetting_Var159 i1i1lll1liii1il1llll1_ii1il11l111ii11iil : ((ModeSetting)this.setting)
                  .int212()) {
                  i1i1lll1liii1il1llll1_ii1il11l111ii11iil.setEnabled(set1.contains(i1i1lll1liii1il1llll1_ii1il11l111ii11iil.getKey()));
               }
               break;
            case ITEM_LIST:
               if (!(var1 instanceof List list)) {
                  return false;
               }

               var set = strings(list);
               if (set == null) {
                  return false;
               }

               ((ModeSetting2)this.setting).ItemRegistry(List.copyOf(set));
               break;
            case ACTION:
               ((StringSetting)this.setting).toggle();
               break;
            case GROUP:
            case UNKNOWN:
               return false;
         }

         return true;
      } catch (RuntimeException runtimeexception) {
         return false;
      }
   }

   @Override
   public double min() {
      return this.setting instanceof NumberSetting lilliiill11llilll1ll1l ? (double)lilliiill11llilll1ll1l.getMin() : SettingAccess.super.min();
   }

   @Override
   public double max() {
      return this.setting instanceof NumberSetting lilliiill11llilll1ll1l ? (double)lilliiill11llilll1ll1l.getMax() : SettingAccess.super.max();
   }

   @Override
   public double step() {
      return this.setting instanceof NumberSetting lilliiill11llilll1ll1l ? (double)lilliiill11llilll1ll1l.getIncrement() : SettingAccess.super.step();
   }

   @Override
   public String suffix() {
      return this.setting instanceof NumberSetting lilliiill11llilll1ll1l ? lilliiill11llilll1ll1l.getSuffix() : SettingAccess.super.suffix();
   }

   @Override
   public List<String> choices() {
      if (this.setting instanceof ModeSetting3 ill11ii1ilil1liili1iliil) {
         return ill11ii1ilil1liili1iliil.getValues().stream().map(ModeSetting3_Var159::getKey).toList();
      } else {
         return this.setting instanceof ModeSetting i1i1lll1liii1il1llll1
            ? i1i1lll1liii1il1llll1.int212().stream().map(ModeSetting_Var159::getKey).toList()
            : SettingAccess.super.choices();
      }
   }

   @Override
   public String placeholder() {
      return this.setting instanceof BooleanSetting2 i1ll1llliii11l1 ? i1ll1llliii11l1.getEmptyText() : SettingAccess.super.placeholder();
   }

   @Override
   public int maxLength() {
      return this.setting instanceof BooleanSetting2 i1ll1llliii11l1 ? i1ll1llliii11l1.getValidator().getMaxLength() : SettingAccess.super.maxLength();
   }

   @Override
   public boolean secret() {
      if (this.setting instanceof BooleanSetting2 i1ll1llliii11l1 && i1ll1llliii11l1.isSecret()) {
         return true;
      }

      return false;
   }

   @Override
   public List<? extends SettingAccess> children() {
      return this.setting instanceof BooleanSetting3 l1lili1ii11
         ? l1lili1ii11.getSettings().stream().map(var1x -> new ZenithSettingAccess(this.module, var1x)).toList()
         : SettingAccess.super.children();
   }

   public static Set<String> strings(List<?> var0) {
      Set<String> hashset = new HashSet<>();

      for (Object object : var0) {
         if (!(object instanceof String s)) {
            return null;
         }

         hashset.add(s);
      }

      return hashset;
   }
}
