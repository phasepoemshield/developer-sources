-- The Rana brain! Empty head, no thoughts
-- 64j - v1.0 - MIT License

-- Hide vanilla model
vanilla_model.PLAYER:setVisible(false)
-- Hide vanilla armor model
vanilla_model.ARMOR:setVisible(false)
-- Re-enable the helmet item (try a bone uwu)
vanilla_model.HELMET_ITEM:setVisible(true)

-- Animations toggling
local ranaPage = action_wheel:newPage()
local staticToggleAction = ranaPage:newAction()
	:title("Animated Rana!")
	:toggleTitle("Static Rana!")
	:item("green_wool")
	:toggleItem("red_wool")
	:setOnToggle(
		function(state)
			config:save("ranaStatic", state)
			pings.setStatic(state)
		end
	)
action_wheel:setPage(ranaPage)

function pings.setStatic(state)
	animations.rana.RanaOverrides:setPlaying(state)
end


function events.entity_init()
	-- Rescale Elytra
	models.rana.root.Body.RightElytraPivot:setScale(0.8)
	models.rana.root.Body.LeftElytraPivot:setScale(0.8)

	-- Wish the vanilla cape could be moved/rescaled to better fit Rana
	-- but couldn't make it work, help welcome <3, just hide for now
	vanilla_model.CAPE:setVisible(false)

	-- Generate tablist portrait preview
	local cloneHead = models.rana.root.Head:copy("cloneHead")
	cloneHead:setPos(0, -21, -10)
	cloneHead:setScale(0.6)
	cloneHead:setParentType("None")
	models.rana.root.Portrait:addChild(cloneHead)

	-- Load config
	local ranaStatic = (config:load("ranaStatic") == true)
	staticToggleAction:setToggled(ranaStatic)
	pings.setStatic(ranaStatic)
end

function events.render(delta, ctx)
	models.rana.root.RightArmFirstPerson:setVisible(ctx == "FIRST_PERSON")
	models.rana.root.LeftArmFirstPerson:setVisible(ctx == "FIRST_PERSON")
	models.rana.root.RightArm:setVisible(ctx ~= "FIRST_PERSON")
	models.rana.root.LeftArm:setVisible(ctx ~= "FIRST_PERSON")
end
