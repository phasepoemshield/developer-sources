package l;

import fat.releon.teremok.impl.combat.Aura;
import fat.releon.teremok.impl.combat.TriggerBot;

public class Helper20 {
   public Helper20() {
   }

   public static String method388(Helper242 var0) {
      if (var0 instanceof ServerHelper) {
         return "Помогает взаимодействовать с сервером.";
      } else if (var0 instanceof WaterSpeed) {
         return "Увеличивает скорость передвижения в воде.";
      } else if (var0 instanceof ItemScroller) {
         return "Убирает задержку в передвижения предметов.";
      } else if (var0 instanceof Hud) {
         return "Отображает клиент элементы на экране.";
      } else if (var0 instanceof AuctionHelper) {
         return "Помогает управлять аукционом на сервере.";
      } else if (var0 instanceof Predictions) {
         return "Предсказывает траекторию полета снарядов.";
      } else if (var0 instanceof AntiAFK) {
         return "Выполняет какое-то действие.";
      } else if (var0 instanceof Strafe) {
         return "Помогает игроку при ходьбе.";
      } else if (var0 instanceof TargetStrafe) {
         return "Крутится вокруг таргета";
      } else if (var0 instanceof Jesus) {
         return "Дает возможность игроку ходить по воде.";
      } else if (var0 instanceof AimBot) {
         return "Помогает игроку наводится на цель.";
      } else if (var0 instanceof XRay) {
         return "Позволяет видеть сквозь блоки для поиска ресурсов.";
      } else if (var0 instanceof TriggerBot) {
         return "Бьет сущность если игрок смотрит на нее.";
      } else if (var0 instanceof Aura) {
         return "Автоматически атакует ближайших врагов.";
      } else if (var0 instanceof AutoSwap) {
         return "Автоматически меняет предметы в руке.";
      } else if (var0 instanceof AimPotion) {
         return "Автоматически наводиться на игрока когда в руках дон зелье.";
      } else if (var0 instanceof AutoAuth) {
         return "Автоматически регистрируется на сервере.";
      } else if (var0 instanceof UseTracker) {
         return "Уведомляет вас о действиях других игроков.";
      } else if (var0 instanceof ClanUpgrade) {
         return "Автоматически прокачивает клан.";
      } else if (var0 instanceof AppleFarm) {
         return "Автоматически Добывает яблоки.";
      } else if (var0 instanceof AutoSell) {
         return "Автоматически выставляет ценные предметы.";
      } else if (var0 instanceof WardenHelper) {
         return "Показывает время до открытия сундука.";
      } else if (var0 instanceof ChestCycle) {
         return "Ищет сундуки, уходит в /hub, возвращается за секунду до открытия и лутает их.";
      } else if (var0 instanceof Velocity) {
         return "Не дает отталкиваться.";
      } else if (var0 instanceof TotemTracker) {
         return "Уведомляет вас когда был снесен тотем игроку.";
      } else if (var0 instanceof NoFriendDamage) {
         return "Предотвращает урон по друзьям.";
      } else if (var0 instanceof FullBright) {
         return "Позволяет настраивать яркость мира.";
      } else if (var0 instanceof SelfDestruct) {
         return "Скрывает чит с игры";
      } else if (var0 instanceof AutoBuy) {
         return "Автоматически скупает ресурсы с аукциона.";
      } else if (var0 instanceof HitBox) {
         return "Увеличивает хитбокс сущностей.";
      } else if (var0 instanceof AntiBot) {
         return "Обнаруживает и игнорирует ботов на сервере.";
      } else if (var0 instanceof AutoCrystal) {
         return "Автоматизирует размещение и уничтожение кристаллов.";
      } else if (var0 instanceof AutoSprint) {
         return "Автоматически включает спринт при движении.";
      } else if (var0 instanceof NoPush) {
         return "Предотвращает отталкивание игроков и сущностей.";
      } else if (var0 instanceof ElytraHelper) {
         return "Улучшает управление элитрами.";
      } else if (var0 instanceof JoinerHelper) {
         return "Облегчает процесс входа на сервер.";
      } else if (var0 instanceof NoDelay) {
         return "Убирает задержки при выполнении действий.";
      } else if (var0 instanceof Velocity) {
         return "Удаляет отбрасывание от атак.";
      } else if (var0 instanceof AutoRespawn) {
         return "Автоматически возрождает игрока после смерти.";
      } else if (var0 instanceof NoSlow) {
         return "Устраняет замедление при определенных действиях.";
      } else if (var0 instanceof GuiMove) {
         return "Позволяет двигаться при открытом интерфейсе.";
      } else if (var0 instanceof Blink) {
         return "Создает иллюзию телепортации для других игроков.";
      } else if (var0 instanceof AutoTool) {
         return "Автоматически выбирает подходящий инструмент.";
      } else if (var0 instanceof Fly) {
         return "Позволяет летать в режиме выживания.";
      } else if (var0 instanceof FastBreak) {
         return "Ускоряет разрушение блоков.";
      } else if (var0 instanceof CameraSettings) {
         return "Настраивает поведение камеры игрока.";
      } else if (var0 instanceof BlockOverlay) {
         return "Подсвечивает блоки для лучшей видимости.";
      } else if (var0 instanceof Esp) {
         return "Показывает местоположение сущностей";
      } else if (var0 instanceof AutoTotem) {
         return "Автоматически использует тотемы бессмертия.";
      } else if (var0 instanceof EnderChestPlus) {
         return "Улучшает функционал эндер-сундука.";
      } else if (var0 instanceof FreeCam) {
         return "Предоставляет инструменты для отладки камеры.";
      } else if (var0 instanceof ChestStealer) {
         return "Автоматически забирает предметы из контейнеров.";
      } else if (var0 instanceof AutoTpAccept) {
         return "Автоматически принимает запросы на телепортацию.";
      } else if (var0 instanceof AutoEvent) {
         return "Автоматически пишет /event delay при заходе на анархию.";
      } else if (var0 instanceof Arrows) {
         return "Показывает стрелочки на игроков.";
      } else if (var0 instanceof AutoLeave) {
         return "Автоматически покидает сервер при угрозе.";
      } else if (var0 instanceof WorldTweaks) {
         return "Настраивает параметры мира";
      } else if (var0 instanceof NoClip) {
         return "Позволяет проходить стены.";
      } else if (var0 instanceof NoRender) {
         return "Отключает рендеринг плохих заклинаний ";
      } else if (var0 instanceof TargetPearl) {
         return "Автоматически бросает жемчуг за целью.";
      } else if (var0 instanceof NameProtect) {
         return "Скрывает имена игроков.";
      } else if (var0 instanceof SeeInvisible) {
         return "Позволяет видеть невидимых игроков.";
      } else if (var0 instanceof AutoArmor) {
         return "Автоматически надевает броню.";
      } else if (var0 instanceof AutoUse) {
         return "Автоматически использует предметы.";
      } else if (var0 instanceof NoInteract) {
         return "Блокирует взаимодействие с объектами.";
      } else if (var0 instanceof CrossHair) {
         return "Кастомные настройки прицела";
      } else if (var0 instanceof SuperFireWork) {
         return "Усиливает фейерверки для полета.";
      } else if (var0 instanceof Spider) {
         return "Позволяет взбираться по стенам как паук.";
      } else if (var0 instanceof ServerRPSpoof) {
         return "Подделывает данные для серверов.";
      } else if (var0 instanceof HighJump) {
         return "Длинные прыжки";
      } else if (var0 instanceof ShiftTap) {
         return "Автоматически делает WTap перед ударом.";
      } else if (var0 instanceof AspectRatio) {
         return "Изменяет соотношение сторон экрана.";
      } else if (var0 instanceof FreeLook) {
         return "Позволяет свободно вращать камеру без движения игрока.";
      } else if (var0 instanceof ClickPearl) {
         return "Кидает перл по бинду.";
      } else if (var0 instanceof ClickFriend) {
         return "Добавляет игроков в список друзей по клику.";
      } else if (var0 instanceof TargetEsp) {
         return "Добавляет визуальную часть при включенном модуле KillAura ";
      } else if (var0 instanceof NoWeb) {
         return "Позволяет двигаться в паутине без замедления.";
      } else if (var0 instanceof IrcClient) {
         return "Встроенный чат для общения.";
      } else if (var0 instanceof Speed) {
         return "Увеличивает скорость передвижения игрока.";
      } else if (var0 instanceof SwingAnimation) {
         return "Настраивает анимацию взмаха руки.";
      } else if (var0 instanceof ViewModel) {
         return "Изменяет отображение модели предмета.";
      } else if (var0 instanceof AirStuck) {
         return "Замораживает вашу позицию.";
      } else if (var0 instanceof NoFall) {
         return "Убирает урон от падения";
      } else if (var0 instanceof ElytraMotion) {
         return "Замораживает вашу позицию на элитрах.";
      } else if (var0 instanceof Particles) {
         return "Добавляет визуально частицы в мире.";
      } else if (var0 instanceof BlockEspHelper) {
         return "Подсвечивает определенные блоки";
      } else if (var0 instanceof KillEffect) {
         return "Добавляет эффект при убийстве.";
      } else {
         return var0 instanceof AutoBootsSwap ? "Автоматически меняет ботинки." : "Описание модуля отсутствует.";
      }
   }
}
