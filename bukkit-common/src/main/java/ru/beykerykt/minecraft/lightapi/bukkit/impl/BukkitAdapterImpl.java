/**
 * The MIT License (MIT)
 * 
 * Copyright (c) 2019 Vladimir Mikhailov <beykerykt@gmail.com>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *  
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package ru.beykerykt.minecraft.lightapi.bukkit.impl;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.World;

import ru.beykerykt.minecraft.lightapi.common.IChunkSectionsData;
import ru.beykerykt.minecraft.lightapi.common.callback.LCallback;

/**
 * 
 * Abstract class for Bukkit implementations
 * 
 * @author BeYkeRYkt
 *
 */
public abstract class BukkitAdapterImpl implements IBukkitAdapterImpl {

	@Override
	public boolean createLight(String worldName, int flags, int blockX, int blockY, int blockZ, int lightlevel,
			LCallback callback) {
		World world = Bukkit.getWorld(worldName);
		return createLight(world, flags, blockX, blockY, blockZ, lightlevel, callback);
	}

	@Override
	public boolean deleteLight(String worldName, int flags, int blockX, int blockY, int blockZ, LCallback callback) {
		World world = Bukkit.getWorld(worldName);
		return deleteLight(world, flags, blockX, blockY, blockZ, callback);
	}

	@Override
	public void setRawLightLevel(String worldName, int flags, int blockX, int blockY, int blockZ, int lightlevel,
			LCallback callback) {
		World world = Bukkit.getWorld(worldName);
		setRawLightLevel(world, flags, blockX, blockY, blockZ, lightlevel, callback);
	}

	@Override
	public int getRawLightLevel(String worldName, int flags, int blockX, int blockY, int blockZ) {
		World world = Bukkit.getWorld(worldName);
		return getRawLightLevel(world, flags, blockX, blockY, blockZ);
	}

	@Override
	public void recalculateLighting(String worldName, int flags, int blockX, int blockY, int blockZ,
			LCallback callback) {
		World world = Bukkit.getWorld(worldName);
		recalculateLighting(world, flags, blockX, blockY, blockZ, callback);
	}

	@Override
	public List<IChunkSectionsData> collectChunkSections(String worldName, int blockX, int blockY, int blockZ,
			int radius) {
		World world = Bukkit.getWorld(worldName);
		return collectChunkSections(world, blockX, blockY, blockZ, radius);
	}

	@Override
	public void sendChanges(String worldName, int chunkX, int chunkZ) {
		World world = Bukkit.getWorld(worldName);
		sendChanges(world, chunkX, chunkZ);
	}

	@Override
	public void sendChanges(String worldName, int chunkX, int chunkSectionY, int chunkZ) {
		World world = Bukkit.getWorld(worldName);
		sendChanges(world, chunkX, chunkSectionY, chunkZ);
	}

	@Override
	public void sendChanges(String worldName, int chunkX, int chunkZ, int sectionMaskSky, int sectionMaskBlock) {
		World world = Bukkit.getWorld(worldName);
		sendChanges(world, chunkX, chunkZ, sectionMaskSky, sectionMaskBlock);
	}
}
