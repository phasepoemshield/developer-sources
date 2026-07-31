
--libs
require("GSAnimBlend")

--model setup
vanilla_model.CAPE:setVisible(false)
vanilla_model.ELYTRA:setVisible(false)
vanilla_model.PLAYER:setVisible(false)
if icarus then
    icarus:setWingsVisible(false)
end
local wingmodel = models.harpy
local anim = animations.harpy
local flyState
local expecFlap
anim.dive:setBlendTime(7)
anim.flap:setBlendTime(10)
anim.flap:setSpeed(1)
anim.e_stretchall:setBlendTime(7)
anim.e_showoffleft:setBlendTime(7)
anim.e_showoffright:setBlendTime(7)

--set vanilla skin
models.harpy.Head.Head:setPrimaryTexture("SKIN")
models.harpy.Head["Hat Layer"]:setPrimaryTexture("SKIN")
models.harpy.Body.Body:setPrimaryTexture("SKIN")
models.harpy.Body["Body Layer"]:setPrimaryTexture("SKIN")
models.harpy.RightArm.RightA2["Right Arm"]:setPrimaryTexture("SKIN")
models.harpy.RightArm.RightA2["Right Arm Layer"]:setPrimaryTexture("SKIN")
models.harpy.LeftArm.LeftA2["Left Arm"]:setPrimaryTexture("SKIN")
models.harpy.LeftArm.LeftA2["Left Arm Layer"]:setPrimaryTexture("SKIN")
models.harpy.RightLeg["Right Leg"]:setPrimaryTexture("SKIN")
models.harpy.RightLeg["Right Leg Layer"]:setPrimaryTexture("SKIN")
models.harpy.LeftLeg["Left Leg"]:setPrimaryTexture("SKIN")
models.harpy.LeftLeg["Left Leg Layer"]:setPrimaryTexture("SKIN")
models.harpy.FPARMS.LeftArm2["Left Arm Layer"]:setPrimaryTexture("SKIN")
models.harpy.FPARMS.LeftArm2["Left Arm"]:setPrimaryTexture("SKIN")
models.harpy.FPARMS.RightArm2["Right Arm Layer"]:setPrimaryTexture("SKIN")
models.harpy.FPARMS.RightArm2["Right Arm"]:setPrimaryTexture("SKIN")

--switch statement setup
local function switch(value)
	-- Handing `cases` to the returned function allows the `switch()` function to be used with a syntax closer to c code (see the example below).
	-- This is because lua allows the parentheses around a table type argument to be omitted if it is the only argument.
	return function(cases)

		-- The default case is achieved through the metatable mechanism of lua tables (the `__index` operation).
		setmetatable(cases, cases)

		local f = cases[value]
		if f then
			f()
		end
	end
end

--== scriptin ==--

local function stopEmotes()
  anim.e_stretchall:stop()
  anim.e_showoffleft:stop()
  anim.e_showoffright:stop()
end

local forwardKeyState = false
function pings.examplePing(state)
    forwardKeyState = state
end
local exampleKey = keybinds:newKeybind("Forwards key", keybinds:getVanillaKey("key.forward"))
exampleKey.press = function()
    pings.examplePing(true)
end
exampleKey.release = function()
    pings.examplePing(false)
end

function FlapComplete()
  --log("Complete!", expecFlap, flyState)
  if flyState == "FLAP" and expecFlap >= 1 then
    --log("Flapping!")
    anim.flap:play()
  end
  if (flyState ~= "FLAP") or (expecFlap == 0) then
    --log("Stopping!")
    anim.flap:stop()
  end
  expecFlap = expecFlap - 1
end

function events.tick() --behold, my tick function. look upon it, ye mighty, and weep
  --logTable(animations:getPlaying())
  local speed = vectors.vec3(math.abs(player:getVelocity()[1]),math.abs(player:getVelocity()[2]),math.abs(player:getVelocity()[3])) -- getting the player's velocity and assigning it to this variable
  local totalspeed = speed[1]+speed[2]+speed[3] --all the speed
  local neglookvirt = math.clamp(player:getLookDir()[2], -1, 0)
  local diveDir = -0.3 --how far down the player has to be looking for dive to activate
  local flapPrereq = 2.5 --how fast the player has to be going for flap to activate
  local flappyBlendEQ = (totalspeed+0.3) / 2.5
  local flappyBlend = math.clamp(flappyBlendEQ, 0.5, 1.3) --final blend clamp

  if not player:isGliding() then --hey are we flying or
    flyState = "GROUNDED"
  elseif player:getLookDir()[2] <= diveDir then --highest priority, if facing down far enough, so dive overrides other states
    flyState = "DIVE"
  elseif forwardKeyState then --second priority, if w key is pressed
    flyState = "FLAP"
    expecFlap = 1
  elseif (totalspeed > flapPrereq) and (flyState ~= "FLAP") then -- third priority, flap at high speeds, like when a rocket is used or returning from a dive
    flyState = "FLAP"
    expecFlap = 3
  elseif expecFlap == 0 then --lowest priority, gliding
    flyState = "GLIDE"
  end

  switch(flyState) {--switch statement for governing what to do during each state
    ["GROUNDED"] = function()
      --log("Case Ground")
      anim.dive:stop()
      anim.glide:stop()
    end,
    ["FLAP"] = function()
      --log("Case Flap")
      if anim.flap:isPlaying() == false and expecFlap ~= 0 then
        anim.flap:play()
        anim.flap:setBlend(flappyBlend)
      end
    end,
    ["DIVE"] = function()
      --log("Case Dive")
      anim.dive:play()
      anim.dive:setBlend(math.abs(neglookvirt) * 1.5)
      anim.glide:stop()
    end,
    ["GLIDE"] = function()
      --log("Case Glide")
      anim.glide:play()
      anim.dive:stop()
    end,
    __index = function()
      log("Error: State outside expected range. This is likely because the player is not loaded yet. Press F3+D to clear your chat.")
    end
  }
	if player:getVelocity():length() > 0.01 then
    stopEmotes()
	end
end

--first person arms
function events.render(delta, context)
  if context == "FIRST_PERSON" then
    --show FP arms
    wingmodel.FPARMS:setVisible(true)
    wingmodel.RightArm:setVisible(false)
    wingmodel.LeftArm:setVisible(false)
  else
    --hide FP arms
    wingmodel.FPARMS:setVisible(false)
    wingmodel.RightArm:setVisible(true)
    wingmodel.LeftArm:setVisible(true)
  end
end


--== Wheel Pings ==--
function pings.magpie()
  wingmodel.RightArm.RightA2.RightWing:setPrimaryTexture("Custom",textures["magpie"])
  wingmodel.LeftArm.LeftA2.LeftWing:setPrimaryTexture("Custom",textures["magpie"])
end

function pings.hawk()
  wingmodel.RightArm.RightA2.RightWing:setPrimaryTexture("Custom",textures["hawk"])
  wingmodel.LeftArm.LeftA2.LeftWing:setPrimaryTexture("Custom",textures["hawk"])
end

function pings.e_stretch()
  stopEmotes()
  anim.e_stretchall:play()
end

function pings.e_showoffleft()
  stopEmotes()
  anim.e_showoffleft:play()
end

function pings.e_showoffright()
  stopEmotes()
  anim.e_showoffright:play()
end

--== Wheel Setup ==--
local mainPage = action_wheel:newPage()
local wardrobePage = action_wheel:newPage()
action_wheel:setPage(mainPage)

--== Main Page ==--

local action = mainPage:newAction()
:title("Stretch Wings")
:item("feather")
:onLeftClick(pings.e_stretch)

local action = mainPage:newAction()
:title("Showoff left")
:item("book")
:onLeftClick(pings.e_showoffleft)

local action = mainPage:newAction()
:title("showoff Right")
:item("brewing_stand")
:onLeftClick(pings.e_showoffright)

local toWardrobe = mainPage:newAction() --Change to Wardrobe page, preference to keep in final slot
:title("Wardrobe")
:item("cyan_dye")
:onLeftClick(function()
  action_wheel:setPage(wardrobePage)
end)

--wardrobe page

local action = wardrobePage:newAction()
:title("Magpie Wings")
:item("trident")
:onLeftClick(pings.magpie)

local action = wardrobePage:newAction()
:title("Hawk Wings")
:item("rabbit_hide")
:onLeftClick(pings.hawk)

local toMain = wardrobePage:newAction() --change to main page, preference to keep in final slot
  :title("Main")
  :item("white_dye")
  :onLeftClick(function()
    action_wheel:setPage(mainPage)
  end)