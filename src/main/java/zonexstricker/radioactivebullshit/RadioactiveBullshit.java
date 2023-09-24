package zonexstricker.radioactivebullshit;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.ItemHelper;


public class RadioactiveBullshit implements ModInitializer {

    static {
        //this is here to possibly fix some class loading issues, do not delete
        try {
            Class.forName("net.minecraft.core.block.Block");
            Class.forName("net.minecraft.core.item.Item");
        } catch (ClassNotFoundException ignored) {}
    }
    public static final String MOD_ID = "radioactivebullshit";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item uraniumRaw = ItemHelper.createItem(MOD_ID, new Item(32750),"uraniumRaw", "uranium_raw.png");
    @Override
    public void onInitialize() {
        LOGGER.info("ExampleMod initialized.");
    }
}
