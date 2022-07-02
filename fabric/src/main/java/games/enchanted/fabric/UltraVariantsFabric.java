package games.enchanted.fabric;

import games.enchanted.UltraVariants;
import net.fabricmc.api.ModInitializer;

public class UltraVariantsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        UltraVariants.init();
    }
}
