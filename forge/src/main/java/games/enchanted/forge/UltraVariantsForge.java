package games.enchanted.forge;

import dev.architectury.platform.forge.EventBuses;
import games.enchanted.UltraVariants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(UltraVariants.MOD_ID)
public class UltraVariantsForge {
    public UltraVariantsForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(UltraVariants.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        UltraVariants.init();
    }
}
