package com.watercooler.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.watercooler.dto.CardDTO;
import com.watercooler.util.DaoUtil;

@Controller
@RequestMapping("/")
public class WatercoolerController {
	private static final int MAX = DaoUtil.defaultCardsMap.size();
	public HashMap<Integer, String> doneReading = new HashMap<Integer, String>();
	public static ArrayList<CardDTO> myCardsList = new ArrayList<CardDTO>();
	public LinkedHashMap<Integer, Integer> myCardsMap = new LinkedHashMap<Integer, Integer>();
	Integer cursor = 0;

	@RequestMapping(value = "/{card}", method = RequestMethod.GET)
	public String getCards(@PathVariable String card, ModelMap model) {
		doneReading = new HashMap<Integer, String>();
		model.addAttribute("cardDTO",
				DaoUtil.defaultCardsMap.get(getRandom(MAX)));
		model.addAttribute("landed", card);
		model.addAttribute("message", "Card ");
		return "card";

	}

	@RequestMapping(value = "/cardnext/{id}", method = RequestMethod.GET)
	public String getNext(@PathVariable String id, ModelMap model) {
		model.addAttribute("message", "Card Next ");
		cursor++;
		if (myCardsMap.get(cursor) != null) {
			// case wen we click 'next' after a 'prev'
			model.addAttribute("cardDTO",
					DaoUtil.defaultCardsMap.get(myCardsMap.get(cursor)));
		} else {
			// case wen we normally click 'next'
			myCardsMap.put(cursor, Integer.parseInt(id));
			doneReading.put(Integer.parseInt(id)-1, "read");
			myCardsList.add(DaoUtil.getCard(id));
			model.addAttribute("cardDTO",
					DaoUtil.getCard(String.valueOf(getRandom(MAX))));
		}
		return "card";

	}

	@RequestMapping(value = "/cardprev", method = RequestMethod.GET)
	public String getPrev(ModelMap model) {
		model.addAttribute("message", "Card Prev ");
		cursor--;
		if (cursor != null) {
			model.addAttribute("cardDTO",
					DaoUtil.getCard(String.valueOf(myCardsMap.get(cursor))));
		}
		return "card";

	}

	@RequestMapping(value = "/carddetails/{id}", method = RequestMethod.GET)
	public String getCardDetails(@PathVariable String id, ModelMap model) {
		model.addAttribute("message", "Card Details ");
		model.addAttribute("cardDTO", DaoUtil.defaultCardsMap.get(Integer.valueOf(id)-1));
		return "carddetails";

	}
	

	@RequestMapping(value = "/getcard/{id}", method = RequestMethod.GET)
	public String getCard(@PathVariable String id, ModelMap model) {
		model.addAttribute("message", "Card Next ");
		model.addAttribute("cardDTO",
				DaoUtil.defaultCardsMap.get(Integer.valueOf(id)-1));
		return "card";

	}

	public Integer getRandom(int max) {
		Random randomGenerator = new Random();
		int random = randomGenerator.nextInt(max);
		System.out.println("Done reading"+doneReading.toString());
		while (doneReading.get(random) != null) {
			if (doneReading.size()==max) {
				System.out.println("Done reading all :");
				doneReading = new HashMap<Integer, String>();
			} else {
				random = randomGenerator.nextInt(max);
				System.out.println("In loop search for new random values :"+random);
			}
		}
		System.out.println("Final Random Number :"+random);
		return random;
	}


}