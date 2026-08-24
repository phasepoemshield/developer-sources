package oxxxde

// $VF: Compiled from heavy
public final val CONFIGS: ظص = ظص("Configs", "e", "Конфигурации клиента", null, null, 24, null)
public final val RENDER: ظص = ظص("Render", "b", "Визуальные модули", null, null, 24, null)
public final val POINTS: ظص = ظص("WayPoint", "s", "Метки и координаты", null, null, 24, null)
public final val MODELS: ظص = ظص("Models", "u", "Модельки и косметика", "Название модели..", "N")
public final val PLAYER: ظص = ظص("Player", "c", "Игровые упрощения и утилиты", null, null, 24, null)
public final val categories: List<ظص> = CollectionsKt.listOf(RENDER, PLAYER, ظن.HUD, ظن.FRIENDS, POINTS, MODELS, ظن.EVENTS)
public final val EVENTS: ظص = ظص("Events", "M", "События сервера FunTime", null, null, 24, null)
public final val FRIENDS: ظص = ظص("Friends", "w", "Список друзей", null, null, 24, null)
public final val HUD: ظص = ظص("Hud", "d", "Модули интерфейса", null, null, 24, null)

fun getFRIENDS(): ظص {
   FRIENDS
}

fun getCONFIGS(): ظص {
   CONFIGS
}

fun getMODELS(): ظص {
   MODELS
}

fun getPOINTS(): ظص {
   POINTS
}

fun getPLAYER(): ظص {
   PLAYER
}

fun getRENDER(): ظص {
   RENDER
}

fun getEVENTS(): ظص {
   EVENTS
}

fun getHUD(): ظص {
   HUD
}
