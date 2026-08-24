package org.zenith.base.bot.client;

import org.zenith.module.Bot;




import java.lang.reflect.Method;

record BotEventBus_MethodData(Object source, Method target, byte priority) {
}
