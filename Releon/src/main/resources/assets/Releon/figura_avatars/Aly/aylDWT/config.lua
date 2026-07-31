aylConfig = require("scripts.aylConfig")
config:setName("aylDWTConfig")

-- Defaults
local pageDefaults = {
    {"settings", "main", "minecraft:structure_void", "Settings", "Configuration saved over multiple sessions."},
    {"contrails", "settings", "minecraft:torch", "Contrails", "Particles will trail behind you in elytra flight."},
    {"parts", "settings", "minecraft:item_frame", "Parts", nil}
}
local settingDefaults = {
    {"hover", false, "main", false},
    {"vanillaSkin", true, "settings", true},
    {"elytraOnly", false, "settings", false},
    {"flapSFX", true, "settings", false},
    {"tailIdle", false, "settings", true},
    {"wingContrails", false, "contrails", false},
    {"tailContrails", false, "contrails", false},
    {"contrailDensity", 1, "contrails", false},
    {"soaringOrDiving", false, "contrails", false},
    {"highVelocity", false, "contrails", false},
    {"showCover", true, "parts", true},
    {"showTail", true, "parts", true},
    {"showWings", true, "parts", true}
}
local emoteDefaults = {
    {"spreadWings", "main"},
    {"wag", "main"}
}
aylConfig:initialize(pageDefaults, settingDefaults, emoteDefaults)

-- Hover
settings.hover.func = function(value)
    aylConfig:save("hover", value)
    sounds:playSound("entity.ender_dragon.flap", player:getPos(), 1, 1.25, false)
    if value then
        aylDWTModel:setState("hover")
    else
        aylDWTModel:setState()
    end
end
aylConfig:action("hover", "minecraft:feather", "Hover", nil)
-- Spread wings
emotes.spreadWings.func = function(value)
	aylDWTModel:setExcluOff(value)
    animations.model.spread:setPlaying(value)
	sounds:playSound("entity.ender_dragon.flap", player:getPos(), 1, 1.25, false)
end
aylConfig:emote("spreadWings", "minecraft:elytra", "Spread Wings", nil)
-- Wag
emotes.wag.func = function(value)
    animations.model.wag:setPlaying(value)
	sounds:playSound("entity.fox.sniff", player:getPos(), 1, 0.75, false)
	if value then
		mainTail.idleXMovement = 0
		mainTail.idleYMovement = 0
	else
		if tailIdleToggle then
			mainTail.idleXMovement = 5
			mainTail.idleYMovement = 0.5
		else
			mainTail.idleXMovement = 15
			mainTail.idleYMovement = 5
		end
	end
end
aylConfig:emote("wag", "minecraft:carrot_on_a_stick", "Wag Tail", nil)
-- Vanilla skin
function pings.setVanillaSkin(isSlim)
	-- Set classic/slim arms based on the player's model type
    models.model.root.RightArm.RightArmSlim:setVisible(isSlim)
    models.model.root.RightArm.RightSleeveSlim:setVisible(isSlim)
    models.model.root.LeftArm.LeftArmSlim:setVisible(isSlim)
    models.model.root.LeftArm.LeftSleeveSlim:setVisible(isSlim)
    models.model.root.RightArm.RightArmClassic:setVisible(not isSlim)
    models.model.root.RightArm.RightSleeveClassic:setVisible(not isSlim)
    models.model.root.LeftArm.LeftArmClassic:setVisible(not isSlim)
    models.model.root.LeftArm.LeftSleeveClassic:setVisible(not isSlim)
    models.model.root.Head.Head:setPrimaryTexture("SKIN")
    models.model.root.Head.Hat:setPrimaryTexture("SKIN")
    models.model.root.Body.Body:setPrimaryTexture("SKIN")
    models.model.root.Body.Jacket:setPrimaryTexture("SKIN")
    models.model.root.RightArm.RightArmClassic:setPrimaryTexture("SKIN")
    models.model.root.RightArm.RightSleeveClassic:setPrimaryTexture("SKIN")
    models.model.root.RightArm.RightArmSlim:setPrimaryTexture("SKIN")
    models.model.root.RightArm.RightSleeveSlim:setPrimaryTexture("SKIN")
    models.model.root.LeftArm.LeftArmClassic:setPrimaryTexture("SKIN")
    models.model.root.LeftArm.LeftSleeveClassic:setPrimaryTexture("SKIN")
    models.model.root.LeftArm.LeftArmSlim:setPrimaryTexture("SKIN")
    models.model.root.LeftArm.LeftSleeveSlim:setPrimaryTexture("SKIN")
    models.model.root.RightLeg.RightLeg:setPrimaryTexture("SKIN")
    models.model.root.RightLeg.RightPants:setPrimaryTexture("SKIN")
    models.model.root.LeftLeg.LeftLeg:setPrimaryTexture("SKIN")
    models.model.root.LeftLeg.LeftPants:setPrimaryTexture("SKIN")
end
settings.vanillaSkin.func = function(value)
    aylConfig:save("vanillaSkin", value)
	if settings.vanillaSkin.value then
		isSlim = player:getModelType() == "SLIM"
		pings.setVanillaSkin(isSlim)
	end
end
aylConfig:action("vanillaSkin", "minecraft:armor_stand", "Vanilla Skin", "Reload required.\nUse your vanilla skin automatically. Turn this off if you want to use a different skin from your player.\nNote that the vanilla §omodel §r§7is always hidden and replaced with the modded model.\nIf you want to use a modded model instead, refer to the guide in the README.")
-- Elytra only wings
settings.elytraOnly.func = function(value)
    aylConfig:save("elytraOnly", value)
	if value then
        setElytraOnly()
    else
        showWings(true)
    end
end
aylConfig:action("elytraOnly", "minecraft:elytra", "Elytra Only", "Hides your wings while not wearing elytra.\nThis setting will break if used in conjunction with hiding wings via the parts menu.")
-- Flap SFX
settings.flapSFX.func = function(value)
    aylConfig:save("flapSFX", value)
end
aylConfig:action("flapSFX", "minecraft:jukebox", "Flap SFX", "Controls the flapping sounds from the creative flight & elytra flap animations, as well as the action wheel.")
-- Reduce tail idle animation
settings.tailIdle.func = function(value)
    aylConfig:save("tailIdle", value)
	if value then
		mainTail.idleXMovement = 5
		mainTail.idleYMovement = 0.5
	else
		mainTail.idleXMovement = 15
		mainTail.idleYMovement = 5
	end
end
aylConfig:action("tailIdle", "minecraft:string", "Reduce Tail Idle Animation", "Makes the tail idle animation less distracting.")
-- Wing contrails
settings.wingContrails.func = function(value)
    aylConfig:save("wingContrails", value)
end
aylConfig:action("wingContrails", "minecraft:redstone_torch", "Wing Contrails", "Particles will trail behind your wingtips.\nBy default, the particle is minecraft:lava. If you want to replace this, go into scripts/aylElytra.lua and change wingContrailParticle to your particle of choice.")
-- Tail contrails
settings.tailContrails.func = function(value)
    aylConfig:save("tailContrails", value)
end
aylConfig:action("tailContrails", "minecraft:soul_torch", "Tail Contrails", "Particles will trail behind your tail.\nBy default, the particle is minecraft:smoke. If you want to replace this, go into scripts/aylElytra.lua and change tailContrailParticle to your particle of choice.")
-- Contrail interval
settings.contrailDensity.func = function(value)
    aylConfig:iterate("contrailDensity", 1, 20, value)
end
aylConfig:action("contrailDensity", "minecraft:firework_star", "Contrail Density", "How many ticks to wait before spawning a new particle.\n1 will spawn a particle every tick, 2 will spawn a particle every two ticks, & 3 will spawn a particle every three ticks - so on and so on.", "Ticks: ")
-- Soaring or diving
settings.soaringOrDiving.func = function(value)
    aylConfig:save("soaringOrDiving", value)
end
aylConfig:action("soaringOrDiving", "minecraft:lantern", "Soaring Or Diving", "Contrails will only appear when soaring or diving.")
-- Soaring or diving
settings.highVelocity.func = function(value)
    aylConfig:save("highVelocity", value)
end
aylConfig:action("highVelocity", "minecraft:firework_rocket", "High Velocity", "Contrails will only appear at high velocities, such as when boosting with a firework rocket or diving.")
-- Show cover
settings.showCover.func = function(value)
    aylConfig:save("showCover", value)
	models.model.root.Body.cover:setVisible(value)
end
aylConfig:action("showCover", "minecraft:leather", "Cover", "The cover is the small plate of skin which covers your back.")
-- Show tail
settings.showTail.func = function(value)
    aylConfig:save("showTail", value)
	models.model.root.Body.tail:setVisible(value)
end
aylConfig:action("showTail", "minecraft:stick", "Tail", nil)
-- Show wings
settings.showWings.func = function(value)
    aylConfig:save("showWings", value)
	showWings(value)
end
aylConfig:action("showWings", "minecraft:phantom_membrane", "Wings", nil)