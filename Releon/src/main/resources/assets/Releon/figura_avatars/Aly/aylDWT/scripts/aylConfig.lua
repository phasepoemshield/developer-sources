-- aylConfig 4.0 by ayellowlizard
-- I hate pings
aylConfig = {}

pages = {}
settings = {}
emotes = {}
-- Core functions
function aylConfig:save(key, value)
    config:save(settings[key].config, value)
    settings[key].value = value
end
function aylConfig:generateSetting(key, value, page, runOnPing)
    local data = {}
    data.value = value
    data.config = key .. "Config"
    data.action = pages[page].page:newAction()
    data.func = pings[key .. "Function"]
    data.runOnPing = runOnPing
    return data
end
function aylConfig:settings(names)
    for i, v in ipairs(names) do
        local key = names[i][1]
        local value
        if config:load(key .. "Config") == nil then
            value = names[i][2]
        else
            value = config:load(key .. "Config")
        end
        settings[key] = aylConfig:generateSetting(key, value, names[i][3], names[i][4])
        settings[key].action:setToggled(value)
        aylConfig:save(key, value)
    end
end
-- Pages
function aylConfig:generatePage(key, parent, item, title, description)
    local data = {}
    data.page = action_wheel:newPage(key .. "Page")
    data.to = {}
    data.to.func = function()
        action_wheel:setPage(data.page)
    end
    newDescription = nil
    if description == nil then
        newDescription = ""
    else
        newDescription = "\n§r§7" .. description
    end
    data.to.action = pages[parent].page:newAction()
        :title("§7§l" .. title .. newDescription)
        :item(item)
        :onLeftClick(data.to.func)
    data.from = {}
    data.from.func = function()
        action_wheel:setPage(pages[parent].page)
    end
    data.from.action = data.page:newAction()
	    :title("§7§lBack")
	    :item("minecraft:barrier")
	    :onLeftClick(data.from.func)
    return data
end
function aylConfig:pages(names)
    pages.main = {}
    pages.main.page = action_wheel:newPage("mainPage")
    action_wheel:setPage(pages.main.page)
    for i, v in ipairs(names) do
        pages[names[i][1]] = aylConfig:generatePage(names[i][1], names[i][2], names[i][3], names[i][4], names[i][5])
    end
end
function aylConfig:emotes(names)
    for i, v in ipairs(names) do
        local key = names[i][1]
        local data = {}
        data.action = pages[names[i][2]].page:newAction()
        data.func = pings[key .. "Function"]
        emotes[key] = data
    end
end
-- Finally... the end
function aylConfig:initialize(pageDefaults, settingDefaults, emoteDefaults)
    aylConfig:pages(pageDefaults)
    aylConfig:settings(settingDefaults)
    if emoteDefaults ~= nil then
        aylConfig:emotes(emoteDefaults)
    end
end

-- Secondary functions
function aylConfig:action(key, item, title, description, prefix)
    settings[key].title = title
    if description == nil then
        settings[key].description = ""
    else
        settings[key].description = "\n§r§7" .. description
    end
    settings[key].prefix = prefix
    settings[key].action:setItem(item)
    if type(settings[key].value) == "boolean" then
        settings[key].action:setTitle("§l" .. title .. "\n§r§4OFF" .. settings[key].description)
        settings[key].action:setToggleTitle("§l" .. title .. "\n§r§2ON" .. settings[key].description)
        settings[key].action:setOnToggle(settings[key].func)
    elseif type(settings[key].value) == "number" then
        settings[key].action:setTitle("§l" .. title .. "\n§r§7" .. prefix .. "§f" .. settings[key].value .. "§r§7 - Scroll to change value." .. settings[key].description)
        settings[key].action:setOnScroll(settings[key].func)
    elseif type(settings[key].value) == "string" then
        settings[key].action:setTitle("§l" .. title .. "\n§r" .. settings[key].value .. "§r§7" .. settings[key].description)
    end
end
function aylConfig:emote(key, item, title, description)
    emotes[key].item = item
    emotes[key].title = title
    if description == nil then
        emotes[key].description = ""
    else
        emotes[key].description = "\n§r§7" .. description
    end
    emotes[key].action:setItem(item)
    emotes[key].action:setTitle("§l" .. emotes[key].title .. "\n§r§4OFF" .. emotes[key].description)
    emotes[key].action:setToggleTitle("§l" .. emotes[key].title .. "\n§r§2ON" .. emotes[key].description)
    emotes[key].action:setOnToggle(emotes[key].func)
end
function aylConfig:iterate(key, min, max, step)
    local value = ((settings[key].value - min + step) % (max - min + 1)) + min
    aylConfig:save(key, value)
    settings[key].action:setTitle("§l" .. settings[key].title .. "\n§r§7" .. settings[key].prefix .. "§f" .. settings[key].value .. "§r§7 - Scroll to change value." .. settings[key].description)
end

-- Networking
function aylConfig:functions()
    for i, v in pairs(settings) do
        if settings[i].runOnPing then
            settings[i].func(settings[i].value, settings[i].action, true)
        end
    end
end

function aylConfig:ping()
    for i, v in pairs(settings) do
        pings.ping(i, settings[i].value)
    end
end
function pings.ping(i, ping)
    settings[i].value = ping
end

function events.tick()
    if world.getTime() % 200 == 0 then -- every 10 seconds (200 ticks)
        aylConfig:ping()
        aylConfig:functions()
    end
end
function events.entity_init()
    aylConfig:functions()
end

return aylConfig