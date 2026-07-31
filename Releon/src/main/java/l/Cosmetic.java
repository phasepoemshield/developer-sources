package l;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Arm;

public class Cosmetic extends Helper242 {
   private static Cosmetic instance;
   private final Setting3 petEnabled = new Setting3("Питомец", "Рисует питомца возле игрока").method2201(false);
   private final Setting5 petSkin = new Setting5("Тип питомца", "Выбор модели питомца")
      .method2381("Летучая мышь", "Попугай", "Ворон", "Фея", "Пчела", "Векс", "Лисичка", "Свинья", "Лягушка", "Иглобрюх", "Слайм")
      .method2383("Попугай")
      .method2382(this::method1876);
   private final Setting3 petFirstPerson = new Setting3("Питомец от 1-го лица", "Рисовать питомца от первого лица")
      .method2201(true)
      .method2199(this::method1876);
   private final Setting2 petRadius = new Setting2("Радиус", "Радиус орбиты питомца")
      .method2086(0.65F)
      .method2078(0.15F, 2.5F)
      .method2081(this::method1876);
   private final Setting2 petHeight = new Setting2("Высота", "Смещение питомца по Y")
      .method2086(0.95F)
      .method2078(-0.5F, 3.0F)
      .method2081(this::method1876);
   private final Setting2 petSpeed = new Setting2("Скорость", "Скорость движения питомца")
      .method2086(1.15F)
      .method2078(0.05F, 5.0F)
      .method2081(this::method1876);
   private final Setting2 petScale = new Setting2("Размер", "Масштаб модели питомца")
      .method2086(0.55F)
      .method2078(0.15F, 2.0F)
      .method2081(this::method1876);
   private final Setting3 playerAnimEnabled = new Setting3("Анимации", "Анимации игрока").method2201(false);
   private final Setting5 playerAnimType = new Setting5("Анимация", "Выбор анимации игрока")
      .method2381("Теневые клоны")
      .method2383("Теневые клоны")
      .method2382(this::method1877);
   private final Setting9 playerAnimBind = new Setting9("Бинд анимации", "Запуск анимации").method2705(this::method1877);
   private final Setting3 figuraEnabled = new Setting3("Figura", "Install bundled Figura avatars").method2201(true);
   private final Setting5 figuraAvatar = new Setting5("Модель скина", "Bundled Figura avatar")
      .method2381("Ninjago", "Tsumiki Miniwa", "Miku", "Bat", "Beardie", "Rana", "Fire Slasher", "Strike", "Aria", "Peter Griffin")
      .method2383("Ninjago")
      .method2384(this::method1882);
   private final Setting3 wingsEnabled = new Setting3("Крылья", "Отображать 3D крылья").method2201(false);
   private final Setting5 wingsModel = new Setting5("Модель крыльев", "Выбор модели крыльев")
      .method2381("Strike", "Simple", "Aly", "Harpy")
      .method2383("Strike")
      .method2382(this.wingsEnabled::method2200)
      .method2384(this::method1883);
   private final Setting3 swordEnabled = new Setting3("Кастомный меч", "Отображать 3D меч").method2201(false);
   private final Setting5 swordModel = new Setting5("Модель меча", "Выбор модели меча")
      .method2381("Devilsknife", "Zweisword")
      .method2383("Devilsknife")
      .method2382(this.swordEnabled::method2200)
      .method2384(this::method1884);
   private final Setting3 hatEnabled = new Setting3("Шляпа", "Отображать 3D шляпу").method2201(false);
   private final Setting5 hatModel = new Setting5("Модель шляпы", "Выбор модели шляпы")
      .method2381("Мага", "Лягушки", "Санта")
      .method2383("Мага")
      .method2382(this.hatEnabled::method2200)
      .method2384(this::method1885);
   private final Setting3 viewOnFriends = new Setting3("Показывать на друзьях", "Отображать косметику на друзьях").method2201(true);
   private final Helper260 petRenderer;
   private final Helper259 playerAnimations;
   private boolean playerAnimRequested;
   private boolean appliedFiguraEnabled;
   private boolean figuraInstallAttempted;
   private boolean restoringFigura;
   private long lastFiguraInstallAttempt;
   private long lastFiguraSyncAttempt;
   private String appliedFiguraKey = "";
   private Object lastFiguraWorld;
   private Object lastFiguraPlayer;
   private final Set<UUID> mirroredFiguraPlayers = new HashSet<>();
   private String mirroredFiguraKey = "";
   private boolean appliedWingsEnabled;
   private boolean appliedSwordEnabled;
   private boolean appliedHatEnabled;
   private String appliedWingsModel = "";
   private String appliedSwordModel = "";
   private String appliedHatModel = "";

   public Cosmetic() {
      super("Cosmetic", "Cosmetic", Helper269.RENDER);
      instance = this;
      this.setup(
         new Helper264[]{this.figuraEnabled, this.figuraAvatar, this.swordEnabled, this.swordModel, this.hatEnabled, this.hatModel, this.viewOnFriends}
      );
      this.petRenderer = new Helper260(this);
      this.playerAnimations = new Helper259(this);
   }

   public static Cosmetic method1873() {
      return instance;
   }

   @Override
   public void activate() {
      this.appliedFiguraKey = "";
      this.method1892();
   }

   @Override
   public void deactivate() {
      super.deactivate();
      this.playerAnimRequested = false;
      this.petRenderer.deactivate();
      this.playerAnimations.deactivate();
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      if (mc.world != null && mc.player != null) {
         this.method1892();
         this.method1900();
         if (this.method1876()) {
            boolean var2 = mc.options.getPerspective().isFirstPerson();
            if (!var2 || this.petFirstPerson.method2200()) {
               this.petRenderer.onWorldRender(var1);
            }
         }

         if (this.method1877()) {
            this.playerAnimations.onWorldRender(var1);
         }
      }
   }

   @Helper104
   public void method1874(Event17 var1) {
      if (this.isState() && mc.world != null && mc.player != null) {
         if (this.method1877() && var1.method3903(this.playerAnimBind.getKey())) {
            this.playerAnimRequested = true;
         }
      }
   }

   public boolean method1875() {
      if (!this.playerAnimRequested) {
         return false;
      } else {
         this.playerAnimRequested = false;
         return true;
      }
   }

   public boolean method1876() {
      return this.petEnabled.method2200();
   }

   public boolean method1877() {
      return this.playerAnimEnabled.method2200();
   }

   public boolean method1878(PlayerEntity var1) {
      if (var1 != null && mc.player != null) {
         boolean var2 = var1 == mc.player;
         boolean var3 = Helper309.method3075(var1);
         return var2 || var3 && this.viewOnFriends.method2200();
      } else {
         return false;
      }
   }

   public boolean method1879() {
      return this.figuraEnabled.method2200() && this.figuraAvatar.method2385("Peter Griffin");
   }

   public boolean method1880(PlayerEntity var1, Arm var2) {
      if (this.method1879()) {
         return true;
      } else if (this.figuraEnabled.method2200() && this.swordEnabled.method2200() && var1 != null && var2 != null) {
         ItemStack var3 = var2 == var1.getMainArm() ? var1.getMainHandStack() : var1.getOffHandStack();
         return var3.isOf(Items.NETHERITE_SWORD);
      } else {
         return false;
      }
   }

   private void method1881() {
      this.figuraInstallAttempted = false;
      this.method1890();
   }

   private void method1882() {
      this.method1899();
   }

   private void method1883() {
      this.method1899();
   }

   private void method1884() {
      this.method1899();
   }

   private void method1885() {
      this.method1899();
   }

   private void method1886() {
      if (this.figuraEnabled.method2200()) {
         try {
            this.method1890();
            String var1 = this.wingsModel.method2386();
            this.method1896();
            this.appliedWingsEnabled = true;
            this.appliedWingsModel = var1;
            Helper211.method1807("Applied wings model: " + var1);
         } catch (Exception var2) {
            Helper211.method1811("Failed to apply wings model", var2);
         }
      }
   }

   private void method1887() {
      if (this.figuraEnabled.method2200()) {
         try {
            this.method1890();
            String var1 = this.swordModel.method2386();
            this.method1896();
            this.appliedSwordEnabled = true;
            this.appliedSwordModel = var1;
            Helper211.method1807("Applied sword model: " + var1);
         } catch (Exception var2) {
            Helper211.method1811("Failed to apply sword model", var2);
         }
      }
   }

   private void method1888() {
      if (this.figuraEnabled.method2200()) {
         try {
            this.method1890();
            String var1 = this.hatModel.method2386();
            this.method1896();
            this.appliedHatEnabled = true;
            this.appliedHatModel = var1;
            Helper211.method1807("Applied hat model: " + var1);
         } catch (Exception var2) {
            Helper211.method1811("Failed to apply hat model", var2);
         }
      }
   }

   private boolean method1889() {
      if (mc.player == null) {
         return false;
      } else {
         try {
            Class var1 = Class.forName("org.figuramc.figura.avatar.AvatarManager");
            return var1.getMethod("getLoadedAvatar", UUID.class).invoke(null, mc.player.getUuid()) != null;
         } catch (ClassNotFoundException var2) {
            return true;
         } catch (NoSuchMethodException var3) {
            return false;
         } catch (ReflectiveOperationException var4) {
            return false;
         }
      }
   }

   private void method1890() {
      if (this.figuraEnabled.method2200() && !this.restoringFigura) {
         if (!this.figuraInstallAttempted || !this.method1889()) {
            long var1 = System.currentTimeMillis();
            if (!this.figuraInstallAttempted || var1 - this.lastFiguraInstallAttempt >= 10000L) {
               this.figuraInstallAttempted = true;
               this.lastFiguraInstallAttempt = var1;
               this.restoringFigura = true;

               try {
                  this.method1902();
                  this.appliedFiguraEnabled = true;
                  this.method1891();
               } catch (Exception var7) {
                  Helper211.method1811("Failed to install Figura avatar", var7);
               } finally {
                  this.restoringFigura = false;
               }
            }
         }
      }
   }

   private void method1891() {
      try {
         if (this.wingsEnabled.method2200()) {
            this.appliedWingsEnabled = true;
            this.appliedWingsModel = this.wingsModel.method2386();
         }

         if (this.swordEnabled.method2200()) {
            this.appliedSwordEnabled = true;
            this.appliedSwordModel = this.swordModel.method2386();
         }

         if (this.hatEnabled.method2200()) {
            this.appliedHatEnabled = true;
            this.appliedHatModel = this.hatModel.method2386();
         }
      } catch (Exception var2) {
         Helper211.method1811("Failed to reapply Figura cosmetics", var2);
      }
   }

   private void method1892() {
      if (mc.world != null && mc.player != null) {
         if (mc.world != this.lastFiguraWorld || mc.player != this.lastFiguraPlayer) {
            this.lastFiguraWorld = mc.world;
            this.lastFiguraPlayer = mc.player;
            this.method1897();
            this.appliedFiguraKey = "";
            this.mirroredFiguraPlayers.clear();
            this.mirroredFiguraKey = "";
            this.lastFiguraSyncAttempt = 0L;
         }

         String var1 = this.method1901();
         if (!var1.equals(this.appliedFiguraKey)) {
            if (!this.figuraEnabled.method2200()) {
               this.method1898(var1);
            } else {
               long var2 = System.currentTimeMillis();
               if (var2 - this.lastFiguraSyncAttempt >= 500L && !this.restoringFigura) {
                  this.lastFiguraSyncAttempt = var2;
                  this.restoringFigura = true;

                  try {
                     this.method1902();
                     this.appliedFiguraKey = var1;
                     this.mirroredFiguraPlayers.clear();
                     this.mirroredFiguraKey = var1;
                     this.method1891();
                  } catch (Exception var8) {
                     Helper211.method1811("Failed to sync Figura avatar", var8);
                  } finally {
                     this.restoringFigura = false;
                  }
               }
            }
         }
      }
   }

   private void method1893() {
      String var1 = this.wingsModel.method2386();
      if (this.wingsEnabled.method2200() != this.appliedWingsEnabled || !var1.equals(this.appliedWingsModel)) {
         try {
            if (this.wingsEnabled.method2200()) {
               this.method1886();
            } else {
               this.method1896();
               this.appliedWingsEnabled = false;
               this.appliedWingsModel = "";
            }
         } catch (Exception var3) {
            Helper211.method1811("Failed to sync wings", var3);
         }
      }
   }

   private void method1894() {
      String var1 = this.swordModel.method2386();
      if (this.swordEnabled.method2200() != this.appliedSwordEnabled || !var1.equals(this.appliedSwordModel)) {
         try {
            if (this.swordEnabled.method2200()) {
               this.method1887();
            } else {
               this.method1896();
               this.appliedSwordEnabled = false;
               this.appliedSwordModel = "";
            }
         } catch (Exception var3) {
            Helper211.method1811("Failed to sync sword", var3);
         }
      }
   }

   private void method1895() {
      String var1 = this.hatModel.method2386();
      if (this.hatEnabled.method2200() != this.appliedHatEnabled || !var1.equals(this.appliedHatModel)) {
         try {
            if (this.hatEnabled.method2200()) {
               this.method1888();
            } else {
               this.method1896();
               this.appliedHatEnabled = false;
               this.appliedHatModel = "";
            }
         } catch (Exception var3) {
            Helper211.method1811("Failed to sync hat", var3);
         }
      }
   }

   private void method1896() {
      if (this.figuraEnabled.method2200() && !this.restoringFigura) {
         this.figuraInstallAttempted = true;
         this.lastFiguraInstallAttempt = System.currentTimeMillis();
         this.restoringFigura = true;

         try {
            this.method1902();
            this.appliedFiguraEnabled = true;
         } catch (Exception var5) {
            Helper211.method1811("Failed to reload Figura avatar", var5);
         } finally {
            this.restoringFigura = false;
         }
      }
   }

   private void method1897() {
      this.appliedFiguraEnabled = false;
      this.figuraInstallAttempted = false;
      this.restoringFigura = false;
      this.appliedWingsEnabled = false;
      this.appliedSwordEnabled = false;
      this.appliedHatEnabled = false;
      this.appliedWingsModel = "";
      this.appliedSwordModel = "";
      this.appliedHatModel = "";
   }

   private void method1898(String var1) {
      long var2 = System.currentTimeMillis();
      if (var2 - this.lastFiguraSyncAttempt >= 500L && !this.restoringFigura) {
         this.lastFiguraSyncAttempt = var2;
         this.restoringFigura = true;

         try {
            Helper256.method2627(Helper256.EMPTY);
            this.method1897();
            this.mirroredFiguraPlayers.clear();
            this.mirroredFiguraKey = "";
            this.appliedFiguraKey = var1;
            Helper211.method1807("Disabled Figura cosmetics");
         } catch (Exception var8) {
            Helper211.method1811("Failed to disable Figura cosmetics", var8);
         } finally {
            this.restoringFigura = false;
         }
      }
   }

   private void method1899() {
      this.appliedFiguraKey = "";
      this.mirroredFiguraPlayers.clear();
      this.mirroredFiguraKey = "";
      this.method1892();
   }

   private void method1900() {
      if (this.figuraEnabled.method2200() && mc.world != null && mc.player != null && !this.appliedFiguraKey.isEmpty() && !"off".equals(this.appliedFiguraKey)) {
         if (!this.appliedFiguraKey.equals(this.mirroredFiguraKey)) {
            this.mirroredFiguraPlayers.clear();
            this.mirroredFiguraKey = this.appliedFiguraKey;
         }

         try {
            Class var1 = Class.forName("org.figuramc.figura.avatar.AvatarManager");
            Object var2 = var1.getMethod("getLoadedAvatar", UUID.class).invoke(null, mc.player.getUuid());
            if (var2 == null) {
               return;
            }

            Object var3 = var2.getClass().getField("nbt").get(var2);
            if (var3 == null) {
               return;
            }

            Method var4 = var1.getMethod("setAvatar", UUID.class, var3.getClass());
            Method var5 = var1.getMethod("getLoadedAvatar", UUID.class);

            for (PlayerEntity var7 : mc.world.getPlayers()) {
               if (var7 != mc.player && this.method1878(var7)) {
                  Object var8 = var5.invoke(null, var7.getUuid());
                  if (var8 == null || !this.mirroredFiguraPlayers.contains(var7.getUuid())) {
                     var4.invoke(null, var7.getUuid(), var3);
                     this.mirroredFiguraPlayers.add(var7.getUuid());
                     Helper211.method1807("Mirrored Figura avatar to friend: " + var7.getName().getString());
                  }
               }
            }
         } catch (ClassNotFoundException var9) {
         } catch (ReflectiveOperationException var10) {
            Helper211.method1811("Failed to mirror Figura avatar to friends", var10);
         }
      }
   }

   private String method1901() {
      return !this.figuraEnabled.method2200()
         ? "off"
         : this.figuraAvatar.method2386()
            + "|w:"
            + this.wingsEnabled.method2200()
            + ":"
            + this.wingsModel.method2386()
            + "|s:"
            + this.swordEnabled.method2200()
            + ":"
            + this.swordModel.method2386()
            + "|h:"
            + this.hatEnabled.method2200()
            + ":"
            + this.hatModel.method2386();
   }

   private void method1902() throws java.io.IOException {
      Helper255 var1 = this.method1903();
      ArrayList var2 = new ArrayList();
      if (this.wingsEnabled.method2200()) {
         Helper255 var3 = this.method1904();
         if (var3 != null) {
            var2.add(var3);
         }
      }

      if (this.swordEnabled.method2200()) {
         Helper255 var4 = this.method1906();
         if (var4 != null) {
            var2.add(var4);
         }
      }

      if (this.hatEnabled.method2200()) {
         Helper255 var5 = this.method1905();
         if (var5 != null) {
            var2.add(var5);
         }
      }

      if (var2.isEmpty()) {
         Helper256.method2627(var1);
      } else {
         Helper256.method2628(var1, var2);
      }
   }

   private Helper255 method1903() {
      if (this.figuraAvatar.method2385("Ninjago")) {
         return Helper256.NINJAGO;
      } else if (this.figuraAvatar.method2385("Tsumiki Miniwa")) {
         return Helper256.TSUMIKI_MINIWA;
      } else if (this.figuraAvatar.method2385("Senford")) {
         return Helper256.SENFORD;
      } else if (this.figuraAvatar.method2385("Fire Slasher")) {
         return Helper256.FireShlasher;
      } else if (this.figuraAvatar.method2385("Aria")) {
         return Helper256.ARIA;
      } else if (this.figuraAvatar.method2385("Rana")) {
         return Helper256.RANA;
      } else if (this.figuraAvatar.method2385("Beardie")) {
         return Helper256.BEARDIE;
      } else if (this.figuraAvatar.method2385("Lolipop")) {
         return Helper256.LOLIPOP;
      } else if (this.figuraAvatar.method2385("Miku")) {
         return Helper256.MIKU;
      } else if (this.figuraAvatar.method2385("Bat")) {
         return Helper256.BAT;
      } else {
         return this.figuraAvatar.method2385("Peter Griffin") ? Helper256.PETER_GRIFFIN : Helper256.NINJAGO;
      }
   }

   private Helper255 method1904() {
      if (this.wingsModel.method2385("Strike")) {
         return Helper256.STRIKE;
      } else if (this.wingsModel.method2385("Simple")) {
         return Helper256.SIMPLE;
      } else if (this.wingsModel.method2385("Aly")) {
         return Helper256.ALY;
      } else {
         return this.wingsModel.method2385("Harpy") ? Helper256.HARPY : null;
      }
   }

   private Helper255 method1905() {
      if (this.hatModel.method2385("Лягушки")) {
         return Helper256.OLDHAT;
      } else if (this.hatModel.method2385("Мага")) {
         return Helper256.HAT;
      } else {
         return this.hatModel.method2385("Санта") ? Helper256.SANTA : null;
      }
   }

   private Helper255 method1906() {
      if (this.swordModel.method2385("Devilsknife")) {
         return Helper256.DEVILSKNIFE;
      } else {
         return this.swordModel.method2385("Zweisword") ? Helper256.ZWEISWORD : null;
      }
   }

   public boolean method1907() {
      return this.petSkin.method2385("Летучая мышь");
   }

   public boolean method1908() {
      return this.petSkin.method2385("Попугай");
   }

   public boolean method1909() {
      return this.petSkin.method2385("Ворон");
   }

   public boolean method1910() {
      return this.petSkin.method2385("Фея");
   }

   public boolean method1911() {
      return this.petSkin.method2385("Пчела");
   }

   public boolean method1912() {
      return this.petSkin.method2385("Векс");
   }

   public boolean method1913() {
      return this.petSkin.method2385("Лисичка");
   }

   public boolean method1914() {
      return this.petSkin.method2385("Свинья");
   }

   public boolean method1915() {
      return this.petSkin.method2385("Лягушка");
   }

   public boolean method1916() {
      return this.petSkin.method2385("Иглобрюх");
   }

   public boolean method1917() {
      return this.petSkin.method2385("Слайм");
   }

   public boolean method1918() {
      return this.wingsEnabled.method2200();
   }

   public boolean method1919() {
      return this.swordEnabled.method2200();
   }

   public String method1920() {
      return this.wingsModel.method2386();
   }

   public String method1921() {
      return this.swordModel.method2386();
   }

   public boolean method1922() {
      return this.hatEnabled.method2200();
   }

   public String method1923() {
      return this.hatModel.method2386();
   }

   public Setting3 method1924() {
      return this.petEnabled;
   }

   public Setting5 method1925() {
      return this.petSkin;
   }

   public Setting3 method1926() {
      return this.petFirstPerson;
   }

   public Setting2 method1927() {
      return this.petRadius;
   }

   public Setting2 method1928() {
      return this.petHeight;
   }

   public Setting2 method1929() {
      return this.petSpeed;
   }

   public Setting2 method1930() {
      return this.petScale;
   }

   public Setting3 method1931() {
      return this.playerAnimEnabled;
   }

   public Setting5 method1932() {
      return this.playerAnimType;
   }

   public Setting9 method1933() {
      return this.playerAnimBind;
   }

   public Setting3 method1934() {
      return this.figuraEnabled;
   }

   public Setting5 method1935() {
      return this.figuraAvatar;
   }

   public Setting3 method1936() {
      return this.wingsEnabled;
   }

   public Setting3 method1937() {
      return this.swordEnabled;
   }

   public Setting3 method1938() {
      return this.hatEnabled;
   }

   public Setting3 method1939() {
      return this.viewOnFriends;
   }

   public Helper260 method1940() {
      return this.petRenderer;
   }

   public Helper259 method1941() {
      return this.playerAnimations;
   }

   public boolean method1942() {
      return this.playerAnimRequested;
   }

   public boolean method1943() {
      return this.appliedFiguraEnabled;
   }

   public boolean method1944() {
      return this.figuraInstallAttempted;
   }

   public boolean method1945() {
      return this.restoringFigura;
   }

   public long method1946() {
      return this.lastFiguraInstallAttempt;
   }

   public long method1947() {
      return this.lastFiguraSyncAttempt;
   }

   public String method1948() {
      return this.appliedFiguraKey;
   }

   public Object method1949() {
      return this.lastFiguraWorld;
   }

   public Object method1950() {
      return this.lastFiguraPlayer;
   }

   public Set<UUID> method1951() {
      return this.mirroredFiguraPlayers;
   }

   public String method1952() {
      return this.mirroredFiguraKey;
   }

   public boolean method1953() {
      return this.appliedWingsEnabled;
   }

   public boolean method1954() {
      return this.appliedSwordEnabled;
   }

   public boolean method1955() {
      return this.appliedHatEnabled;
   }

   public String method1956() {
      return this.appliedWingsModel;
   }

   public String method1957() {
      return this.appliedSwordModel;
   }

   public String method1958() {
      return this.appliedHatModel;
   }
}
