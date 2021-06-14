package clschroeder.marvel;

import clschroeder.marvel.data.MarvelCharacterIDs;
import clschroeder.marvel.marvelApi.MarvelAPIConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MarvelApplication {

	@Autowired
	private MarvelAPIConnector marvelAPIConnector;

	@Autowired
	private MarvelCharacterIDs marvelCharacterIDs;

	public static void main(String[] args) {
		SpringApplication.run(MarvelApplication.class, args);
	}

	/**
	 * Loads application config and character IDs
	 */
	@PostConstruct
	public void load() {
		marvelCharacterIDs.setCharacterSet(marvelAPIConnector.getCharacterIDsFromAPI());
	}
}
