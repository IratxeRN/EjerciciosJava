package reguera.iratxe.ejercicios;

import java.util.ArrayList;

public class VideoGamesDao implements IGamesDao {

	private ArrayList<VideoGame> listGames = new ArrayList<VideoGame>();

	private static VideoGamesDao INSTANCE = null;

	private VideoGamesDao() {
		super();
		listGames.add(new VideoGame(1, "WOW", "MMORPG", 2004));
		listGames.add(new VideoGame(2, "Overwach", "Shooter FP", 2015));
		listGames.add(new VideoGame(3, "PUBG", "Battle Royal", 2004));
	}

//SINGLETON
	public static synchronized VideoGamesDao getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new VideoGamesDao();
		}

		return INSTANCE;
	}

	@Override
	public ArrayList<VideoGame> listar() {

		return listGames;
	}

	@Override
	public VideoGame crear(VideoGame game) {
		//
		listGames.add(game);
		return game;
	}

	@Override
	public boolean borrar(int id) {

		VideoGame game = new VideoGame();
		for (VideoGame videoGame : listGames) {
			if (id == game.getId()) {
				listGames.remove(id);
				break;
			}
		}

		return true;
	}

	@Override
	public VideoGame buscar(int id) {
		VideoGame game = new VideoGame();
		for (VideoGame videoGame : listGames) {
			if (id == game.getId()) {
				game = videoGame;
				break;
			}
		}

		return game;
	}

	@Override
	public VideoGame modificar(int id) {

		return null;
	}

}
