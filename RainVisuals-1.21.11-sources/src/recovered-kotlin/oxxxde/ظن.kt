package oxxxde

import kotakbaz.rain.client.extensions.Category

// $VF: Compiled from heavy
private Category CONFIGS = Category("Configs", "e", "Конфигурации клиента", null, null, 24, null);
private Category RENDER = Category("Render", "b", "Визуальные модули", null, null, 24, null);
private Category POINTS = Category("WayPoint", "s", "Метки и координаты", null, null, 24, null);
private Category MODELS = Category("Models", "u", "Модельки и косметика", "Название модели..", "N");
private Category PLAYER = Category("Player", "c", "Игровые упрощения и утилиты", null, null, 24, null);
public final val categories: List<ظص> = CollectionsKt.listOf(RENDER, PLAYER, ظن.HUD, ظن.FRIENDS, POINTS, MODELS, ظن.EVENTS)
private Category EVENTS = Category("Events", "M", "События сервера FunTime", null, null, 24, null);
private Category FRIENDS = Category("Friends", "w", "Список друзей", null, null, 24, null);
private Category HUD = Category("Hud", "d", "Модули интерфейса", null, null, 24, null);

public final val FRIENDS: ظص

public final val CONFIGS: ظص

public final val MODELS: ظص

public final val POINTS: ظص

public final val PLAYER: ظص

public final val RENDER: ظص

public final val EVENTS: ظص

public final val HUD: ظص
