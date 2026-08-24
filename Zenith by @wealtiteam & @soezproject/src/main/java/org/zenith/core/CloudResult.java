package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.Aura_Var159;

import org.zenith.module.Interface;


import java.util.List;

public interface CloudResult {
   double zenithDLC_getPrevServerX();

   double zenithDLC_getPrevServerY();

   double zenithDLC_getPrevServerZ();

   List<Aura_Var159> zenithDLC_getPositionHistory();
}
