package fr.lebonq.cavenabler;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.minecraft.world.biome.BiomeKeys;

public class CavenablerInitializer implements ModInitializer {
	@Override
	public void onInitialize() {

		OverworldBiomes.addContinentalBiome(BiomeKeys.LUSH_CAVES, OverworldClimate.TEMPERATE, 4D);
		OverworldBiomes.addContinentalBiome(BiomeKeys.DRIPSTONE_CAVES, OverworldClimate.TEMPERATE, 5D);
	}
}
