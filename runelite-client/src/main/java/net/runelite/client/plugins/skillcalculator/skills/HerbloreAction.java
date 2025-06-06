/*
 * Copyright (c) 2021, Jordan Atwood <nightfirecat@protonmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.skillcalculator.skills;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.gameval.ItemID;
import net.runelite.client.game.ItemManager;

@AllArgsConstructor
@Getter
public enum HerbloreAction implements ItemSkillAction
{
	GUAM_LEAF(ItemID.GUAM_LEAF, 3, 2.5f),
	ATTACK_POTION_3(ItemID._3DOSE1ATTACK, 3, 25),
	MARRENTILL(ItemID.MARENTILL, 5, 3.8f),
	ANTIPOISON_3(ItemID._3DOSEANTIPOISON, 5, 37.5f),
	RELICYMS_BALM_3(ItemID.RELICYMS_BALM3, 8, 40),
	TARROMIN(ItemID.TARROMIN, 11, 5),
	STRENGTH_POTION_3(ItemID._3DOSE1STRENGTH, 12, 50),
	SERUM_207_3(ItemID.MORT_SERUM3, 15, 50),
	GUTHIX_REST_3(ItemID.CUP_GUTHIX_REST_3, 18, 59),
	GUAM_TAR(ItemID.SALAMANDER_TAR_GREEN, 19, 30),
	HARRALANDER(ItemID.HARRALANDER, 20, 6.3f),
	COMPOST_POTION_3(ItemID.SUPERCOMPOST_POTION_3, 22, 60),
	RESTORE_POTION_3(ItemID._3DOSESTATRESTORE, 22, 62.5f),
	RANARR_WEED(ItemID.RANARR_WEED, 25, 7.5f),
	ENERGY_POTION_3(ItemID._3DOSE1ENERGY, 26, 67.5f),
	TOADFLAX(ItemID.TOADFLAX, 30, 8),
	DEFENCE_POTION_3(ItemID._3DOSE1DEFENSE, 30, 75),
	MARRENTILL_TAR(ItemID.SALAMANDER_TAR_ORANGE, 31, 42.5f),
	AGILITY_POTION_3(ItemID._3DOSE1AGILITY, 34, 80),
	COMBAT_POTION_3(ItemID._3DOSECOMBAT, 36, 84),
	PRAYER_POTION_3(ItemID._3DOSEPRAYERRESTORE, 38, 87.5f),
	TARROMIN_TAR(ItemID.SALAMANDER_TAR_RED, 39, 55),
	IRIT_LEAF(ItemID.IRIT_LEAF, 40, 8.8f),
	HARRALANDER_TAR(ItemID.SALAMANDER_TAR_BLACK, 44, 72.5f),
	SUPER_ATTACK_3(ItemID._3DOSE2ATTACK, 45, 100),
	AVANTOE(ItemID.AVANTOE, 48, 10),
	SUPERANTIPOISON_3(ItemID._3DOSE2ANTIPOISON, 48, 106.3f),
	FISHING_POTION_3(ItemID._3DOSEFISHERSPOTION, 50, 112.5f),
	SUPER_ENERGY_3(ItemID._3DOSE2ENERGY, 52, 117.5f),
	HUNTER_POTION_3(ItemID._3DOSEHUNTING, 53, 120),
	KWUARM(ItemID.KWUARM, 54, 11.3f),
	GOADING_POTION_3(ItemID._3DOSEGOADING, 54, 132),
	IRIT_TAR(ItemID.SALAMANDER_TAR_MOUNTAIN, 55, 85),
	SUPER_STRENGTH_3(ItemID._3DOSE2STRENGTH, 55, 125),
	MAGIC_ESSENCE_POTION_3(ItemID._3DOSEMAGICESS, 57, 130),
	HUASCA(ItemID.HUASCA, 58, 11.8f),
	PRAYER_REGENERATION_POTION(ItemID._3DOSE1PRAYER_REGENERATION, 58, 132),
	SNAPDRAGON(ItemID.SNAPDRAGON, 59, 11.8f),
	WEAPON_POISON(ItemID.WEAPON_POISON, 60, 137.5f),
	ALCOAUGMENTATOR(ItemID.MM_POTION_AAA_UNFINISHED, 60, 190),
	LIPLACK_LIQUOR(ItemID.MM_POTION_LLL_UNFINISHED, 60, 190),
	MAMMOTHMIGHT_MIX(ItemID.MM_POTION_MMM_UNFINISHED, 60, 190),
	SUPER_RESTORE_3(ItemID._3DOSE2RESTORE, 63, 142.5f),
	MYSTIC_MANA_AMALGAM(ItemID.MM_POTION_MMA_UNFINISHED, 63, 215),
	CADANTINE(ItemID.CADANTINE, 65, 12.5f),
	SANFEW_SERUM_3(ItemID.SANFEW_SALVE_3_DOSE, 65, 160),
	SUPER_DEFENCE_3(ItemID._3DOSE2DEFENSE, 66, 150),
	MARLEYS_MOONLIGHT(ItemID.MM_POTION_MML_UNFINISHED, 66, 240),
	LANTADYME(ItemID.LANTADYME, 67, 13.1f),
	ANTIDOTE_PLUS_4(ItemID.ANTIDOTE_4, 68, 155),
	ANTIFIRE_POTION_3(ItemID._3DOSE1ANTIDRAGON, 69, 157.5f),
	AZURE_AURA_MIX(ItemID.MM_POTION_AAM_UNFINISHED, 69, 265),
	DIVINE_SUPER_ATTACK_POTION_4(ItemID._4DOSEDIVINEATTACK, 70, 2),
	DIVINE_SUPER_DEFENCE_POTION_4(ItemID._4DOSEDIVINEDEFENCE, 70, 2),
	DIVINE_SUPER_STRENGTH_POTION_4(ItemID._4DOSEDIVINESTRENGTH, 70, 2),
	DWARF_WEED(ItemID.DWARF_WEED, 70, 13.8f),
	RANGING_POTION_3(ItemID._3DOSERANGERSPOTION, 72, 162.5f),
	AQUALUX_AMALGAM(ItemID.MM_POTION_AAL_UNFINISHED, 72, 290),
	WEAPON_POISON_PLUS(ItemID.WEAPON_POISON_, 73, 190),
	DIVINE_RANGING_POTION_4(ItemID._4DOSEDIVINERANGE, 74, 2),
	TORSTOL(ItemID.TORSTOL, 75, 15),
	MEGALITE_LIQUID(ItemID.MM_POTION_LLM_UNFINISHED, 75, 315),
	MAGIC_POTION_3(ItemID._3DOSE1MAGIC, 76, 172.5f),
	STAMINA_POTION_3(ItemID._3DOSESTAMINA, 77, 76.5f),
	STAMINA_POTION_4(ItemID._4DOSESTAMINA, 77, 102),
	DIVINE_MAGIC_POTION_4(ItemID._4DOSEDIVINEMAGIC, 78, 2),
	ZAMORAK_BREW_3(ItemID._3DOSEPOTIONOFZAMORAK, 78, 175),
	ANTILEECH_LOTION(ItemID.MM_POTION_LLA_UNFINISHED, 78, 340),
	ANTIDOTE_PLUS_PLUS_4(ItemID.ANTIDOTE__4, 79, 177.5f),
	BASTION_POTION_3(ItemID._3DOSEBASTION, 80, 155),
	BATTLEMAGE_POTION_3(ItemID._3DOSEBATTLEMAGE, 80, 155),
	SARADOMIN_BREW_3(ItemID._3DOSEPOTIONOFSARADOMIN, 81, 180),
	SURGE_POTION_3(ItemID._3DOSESURGE, 81, 185),
	MIXALOT(ItemID.MM_POTION_MAL_UNFINISHED, 81, 365),
	WEAPON_POISON_PLUS_PLUS(ItemID.WEAPON_POISON__, 82, 190),
	EXTENDED_ANTIFIRE_3(ItemID._3DOSE2ANTIDRAGON, 84, 82.5f),
	EXTENDED_ANTIFIRE_4(ItemID._4DOSE2ANTIDRAGON, 84, 110),
	ANCIENT_BREW_4(ItemID._4DOSEANCIENTBREW, 85, 190),
	DIVINE_BASTION_POTION_4(ItemID._4DOSEDIVINEBASTION, 86, 2),
	DIVINE_BATTLEMAGE_POTION_4(ItemID._4DOSEDIVINEBATTLEMAGE, 86, 2),
	ANTIVENOM_3(ItemID.ANTIVENOM3, 87, 90),
	ANTIVENOM_4(ItemID.ANTIVENOM4, 87, 120),
	MENAPHITE_REMEDY_3(ItemID._3DOSESTATRENEWAL, 88, 200),
	SUPER_COMBAT_POTION_4(ItemID._4DOSE2COMBAT, 90, 150),
	FORGOTTEN_BREW_4(ItemID._4DOSEFORGOTTENBREW, 91, 145),
	SUPER_ANTIFIRE_4(ItemID._4DOSE3ANTIDRAGON, 92, 130),
	EXTENDED_ANTIVENOM_PLUS_4(ItemID.EXTENDED_ANTIVENOM_4, 94, 80),
	ANTIVENOM_PLUS_4(ItemID.ANTIVENOM_4, 94, 125),
	DIVINE_SUPER_COMBAT_POTION_4(ItemID._4DOSEDIVINECOMBAT, 97, 2),
	EXTENDED_SUPER_ANTIFIRE_3(ItemID._3DOSE4ANTIDRAGON, 98, 120),
	EXTENDED_SUPER_ANTIFIRE_4(ItemID._4DOSE4ANTIDRAGON, 98, 160),
	;

	private final int itemId;
	private final int level;
	private final float xp;

	@Override
	public boolean isMembers(final ItemManager itemManager)
	{
		return true;
	}
}
