package me.sfclog.ciclegenerator;

import me.sfclog.ciclegenerator.chunk.IsLandGenerator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {


    @Override
    public void onEnable() {

    }
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new IsLandGenerator();
    }
}
