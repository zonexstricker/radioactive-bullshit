package zonexstricker.radioactivebullshit;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.ItemHelper;


public class RadioactiveBullshit implements ModInitializer {
    public static final String MOD_ID = "radioactivebullshit";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item uraniumRaw = ItemHelper.createItem(MOD_ID, new Item("uranium.raw", 32750),"uraniumRaw", "uranium_raw.png");
    @Override
    public void onInitialize() {
        LOGGER.info("ExampleMod initialized.");
    }
}
