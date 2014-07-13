package com.watercooler.util;

import java.util.ArrayList;
import java.util.HashMap;

import com.watercooler.dto.CardDTO;

public class DaoUtil {

	CardDTO c1 = new CardDTO("Card 1", "1", "", "", false, null);
	CardDTO c2 = new CardDTO("Card 2", "2", "", "", false, null);
	CardDTO c3 = new CardDTO("Card 3", "3", "", "", false, null);
	CardDTO c4 = new CardDTO("Card 4", "4", "", "", false, null);

	public static ArrayList<CardDTO> defaultCardsList = new ArrayList<CardDTO>() {
		{
			add(new CardDTO("Card 1", "1", "", "", false, null));
			add(new CardDTO("Card 2", "2", "", "", false, null));
			add(new CardDTO("Card 3", "3", "", "", false, null));
			add(new CardDTO("Card 4", "4", "", "", false, null));
		}
	};

	public static HashMap<Integer, CardDTO> defaultCardsMap = new HashMap<Integer, CardDTO>() {
		{
			put(0, new CardDTO("Are you spending too much on your rent? See where you are from this graph", "1", "abs.stats data", "", false, null));
			put(1, new CardDTO("We've taken your parameters and positioned where you are Rent Vs Income. See the graph below", "2", "abs.stats data ", "", false, null));
			put(2, new CardDTO(" Australia's obesity rate has ballooned, with 10.8 million Australians now classified as overweight or obese.", "3", "health data", "", false, null));
			put(3, new CardDTO("Card 4", "4", "", "", false, null));
			put(4, new CardDTO("Card 5", "5", "", "", false, null));
			put(5, new CardDTO("Card 6", "6", "", "", false, null));
			put(6, new CardDTO("Card 7", "7", "", "", false, null));
		}
	};

	public static CardDTO getCard(String id)
	{
		return defaultCardsMap.get(Integer.parseInt(id));
	}
}
