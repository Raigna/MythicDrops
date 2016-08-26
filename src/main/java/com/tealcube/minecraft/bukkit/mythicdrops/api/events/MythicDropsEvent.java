/**
 * This file is part of MythicDrops, licensed under the MIT License.
 *
 * Copyright (C) 2013 Teal Cube Games
 *
 * Permission is hereby granted, free of charge,
 * to any person obtaining a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 * OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.tealcube.minecraft.bukkit.mythicdrops.api.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * A very basic extension of {@link Event} that handles HandlerLists.
 */
public class MythicDropsEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    /**
     * Gets the {@link HandlerList} for this {@link Event}.
     *
     * @return HandlerList of the event
     */
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    /**
     * Gets the {@link HandlerList} for this {@link Event}.
     *
     * @return HandlerList of the event
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }
}
