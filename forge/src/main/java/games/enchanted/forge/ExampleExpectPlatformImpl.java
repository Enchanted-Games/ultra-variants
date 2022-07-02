package games.enchanted.forge;

import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

import games.enchanted.ExampleExpectPlatform;

public class ExampleExpectPlatformImpl {
    /**
     * This is our actual method to {@link ExampleExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
