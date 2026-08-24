package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.ZenithClient;

import org.zenith.module.Interface;

import org.zenith.event.AttackEntityEvent;
import org.zenith.event.BlockInteractEvent;
import org.zenith.event.CloseScreenEvent;
import org.zenith.event.Event05;
import org.zenith.event.Event12;
import org.zenith.event.Event14;
import org.zenith.event.Event18Ext;
import org.zenith.event.Event18Ext2;
import org.zenith.event.Event18Ext5;
import org.zenith.event.Event26;
import org.zenith.event.Event29;
import org.zenith.event.Event33;
import org.zenith.event.Event37;
import org.zenith.event.Event43;
import org.zenith.event.EventClick;
import org.zenith.event.EventClickSlotHook;
import org.zenith.event.EventDead;
import org.zenith.event.EventEntityCollision;
import org.zenith.event.EventHookPacketProcess;
import org.zenith.event.EventHookPacketProcess2;
import org.zenith.event.EventHookTickEvent;
import org.zenith.event.EventInjectAddEntity;
import org.zenith.event.EventInjectHandleInputEvents;
import org.zenith.event.EventInteractBlock;
import org.zenith.event.EventMixin_modifySetScreenArg;
import org.zenith.event.EventModifyMouseRotationInput;
import org.zenith.event.EventMotion;
import org.zenith.event.EventMouseButton;
import org.zenith.event.EventMouseScrollHook;
import org.zenith.event.EventPushOutOfBlocks;
import org.zenith.event.EventReplaceMovePacketPitche3;
import org.zenith.event.EventTriggerKeyEvent;
import org.zenith.event.EventUpdateHealth;
import org.zenith.event.EventUpdateHealth2;
import org.zenith.event.EventWindowSizeChanged;
import org.zenith.event.MovementInputEvent;
import org.zenith.event.PlayerMoveEvent;
import org.zenith.event.PreventActionEvent;
import org.zenith.event.StopUsingItemEvent;
import org.zenith.event.RefreshCacheEvent;


public interface Easing {
   Easing EventMouseScrollHook = new EasingSolver(0.45, 0.49, 1.45, 1.15);
   Easing EventInteractBlock = new EasingSolver(0.45, 0.43, 1.45, 0.91);
   Easing EventTriggerKeyEvent = new EasingSolver(0.1, 0.34, 1.07, 1.04);
   Easing EventInjectHandleInputEvents = new EasingSolver(0.27, 0.49, 1.09, 1.06);
   Easing EventMouseButton = new EasingSolver(0.62, 0.8, -0.16, 0.37);
   Easing EventModifyMouseRotationInput = new EasingSolver(0.25, 0.11, 1.07, 1.1);
   Easing EventMixin_modifySetScreenArg = new EasingSolver(0.42, 0.58, 0.0, 1.0);
   Easing BlockInteractEvent = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing EventClickSlotHook = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing CloseScreenEvent = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing EventDead = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing Event18Ext2 = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing StopUsingItemEvent = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing RefreshCacheEvent = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing PreventActionEvent = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing Event12 = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing EventMotion = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing EventClick = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing EventEntityCollision = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing EventPushOutOfBlocks = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing EventInjectAddEntity = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing EventHookTickEvent = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing EventHookPacketProcess = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing Event43 = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing EventWindowSizeChanged = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing AttackEntityEvent = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing Event18Ext5 = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing Event05 = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing Event37 = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing EventUpdateHealth = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing EventReplaceMovePacketPitche3 = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   EaseSineBase PlayerMoveEvent = new EaseInOutQuint();
   EaseSineBase MovementInputEvent = new EaseOutBounce();
   EaseSineBase Event14 = new EaseOutElastic();
   EaseBase EventUpdateHealth2 = new EaseLinearStep();
   EaseBase EventHookPacketProcess2 = new EaseOutQuad();
   EaseBase Event18Ext = new EaseInOutCubic();
   Easing Event29 = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing Event26 = new EasingSolver(0.42, 0.0, 0.58, 1.0);
   Easing Event33 = new EasingSolver(0.42, 0.0, 0.58, 1.0);

   static Easing on23(double var0, double var2, double var4, double var6) {
      return new EasingSolver(var0, var4, var2, var6);
   }

   float ease(float var1, float var2, float var3, float var4);
}
