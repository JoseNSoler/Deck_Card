package co.com.deckcard;

import co.com.deckcard.mapper.PerMapper;
import co.com.deckcard.model.Card;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.minidev.json.JSONArray;

import net.minidev.json.parser.JSONParser;
import net.minidev.json.JSONObject;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

@SpringBootTest
class DeckCardApplicationTests {


	// Proposito general, querer llenar base de datos con cartas ya programadas, esto no incluye la logica API necesitada
	// SOLO ES LA INFORMACION NECESARIA TRANSPORTARLA A MONGODB
	@Test
	public void contextLoads() {

		try{
			URL url = new URL("https://deckofcardsapi.com/api/deck/new/draw/?count=52");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();

			String inline = "";
			Scanner scanner = new Scanner(url.openStream());

			//Write all the JSON data into a string using a scanner
			while (scanner.hasNext()) {
				inline += scanner.nextLine();
			}

			//Close the scanner
			scanner.close();

			ObjectMapper mapper = new ObjectMapper();


			//Using the JSON simple library parse the string into a json object
			JSONParser parse = new JSONParser();
			JSONObject data_obj = (JSONObject) parse.parse(inline);

			//Get the required object from the above created object
			JSONArray arr = (JSONArray) data_obj.get("cards");


			ArrayList<JSONObject> listCard = new ArrayList<JSONObject>();

			ArrayList<Card> cards = arr.stream().map(card -> {
						JSONObject new_obj = (JSONObject) card;

						return PerMapper.toDTOCardFromJson2(new_obj.toJSONString());
					}).collect(Collectors.toCollection(ArrayList::new)) // Transform DTOcard to Card
					.stream().map(dtoCard -> PerMapper.fromDTO(dtoCard))
					.collect(Collectors.toCollection(ArrayList::new));


			Card cardss = new Card();
			cardss.setId("aaa1");
			cardss.setCode("aaaasd");
			cardss.setImage("aaasdsdfsdfgd");
			cardss.setValue("sdasdfsdg");
			cardss.setSuit("azz");

			//cardRepository.insert(cards).subscribe();

			//cardRepository.saveAll(cards);


		} catch (Exception e)
		{

		}
	}

}
