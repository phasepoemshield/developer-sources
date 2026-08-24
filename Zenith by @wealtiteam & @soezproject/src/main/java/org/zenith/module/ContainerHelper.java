package org.zenith.module;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;


@ModuleInfo(
   name = "ContainerHelper",
   description = "",
   category = Category.MISC
)
public final class ContainerHelper extends Module {
   public static final ContainerHelper containerHelper = new ContainerHelper();

   public ContainerHelper() {
   }
}
