

import java.util.List;
import java.util.Scanner;

import controller.ListItemHelper;

import model.ListItem;

public class openList {

		static Scanner in = new Scanner(System.in);
		static ListItemHelper lih = new ListItemHelper();

		private static void addAGame() {
			// TODO Auto-generated method stub
			System.out.print("Enter a console: ");
			String console = in.nextLine();
			System.out.print("Enter a game: ");
			String game = in.nextLine();
			ListItem toAdd = new ListItem(console, game);
			lih.insertItem(toAdd);

		}

		private static void deleteAGame() {
			// TODO Auto-generated method stub
			System.out.print("Enter the console to delete: ");
			String console = in.nextLine();
			System.out.print("Enter the game to delete: ");
			String game =in.nextLine();
			ListItem toDelete = new ListItem(console,game);
			lih.deleteItem(toDelete);
		}

		private static void editAGame() {
			// TODO Auto-generated method stub
			System.out.println("How would you like to search? ");
			System.out.println("1 : Search by Console");
			System.out.println("2 : Search by Game");
			int searchBy = in.nextInt();
			in.nextLine();
			List<ListItem> foundItems;
			if (searchBy == 1) {
				System.out.print("Enter the console name: ");
				String consoleName = in.nextLine();
				foundItems = lih.searchForItemByConsole(consoleName);
			} else {
				System.out.print("Enter the item: ");
				String gameName = in.nextLine();
				foundItems = lih.searchForItemByGame(gameName);

			}

			if (!foundItems.isEmpty()) {
				System.out.println("Found Results.");
				for (ListItem l : foundItems) {
					System.out.println(l.getId() + " : " + l.toString());
				}
				System.out.print("Which ID to edit: ");
				int idToEdit = in.nextInt();

				ListItem toEdit = lih.searchForItemById(idToEdit);
				System.out.println("Retrieved " + toEdit.getGame() + " from " + toEdit.getConsole());
				System.out.println("1 : Update Console");
				System.out.println("2 : Update Game");
				int update = in.nextInt();
				in.nextLine();

				if (update == 1) {
					System.out.print("New Console: ");
					String newConsole = in.nextLine();
					toEdit.setConsole(newConsole);
				} else if (update == 2) {
					System.out.print("New Game: ");
					String newGame = in.nextLine();
					toEdit.setGame(newGame);
				}

				lih.updateItem(toEdit);

			} else {
				System.out.println("---- No results found");
			}

		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			runMenu();

		}

		public static void runMenu() {
			boolean goAgain = true;
			System.out.println("--- Welcome to our awesome all in one Video Game WishList");
			while (goAgain) {
				System.out.println("*  Select a game:");
				System.out.println("*  1 -- Add a game");
				System.out.println("*  2 -- Edit a game");
				System.out.println("*  3 -- Delete a game");
				System.out.println("*  4 -- View the list");
				System.out.println("*  5 -- Exit the awesome program");
				System.out.print("*  Your selection: ");
				int selection = in.nextInt();
				in.nextLine();

				if (selection == 1) {
					addAGame();
				} else if (selection == 2) {
					editAGame();
				} else if (selection == 3) {
					deleteAGame();
				} else if (selection == 4) {
					viewTheList();
				} else {
					lih.cleanUp();
					System.out.println("   Goodbye!   ");
					goAgain = false;
				}

			}

		}

		private static void viewTheList() {
			// TODO Auto-generated method stub
			List<ListItem>allItems = lih.showAllItems();
			for (ListItem singleItem : allItems) {
				System.out.println(singleItem.returnItemDetails());
			}

		}

	}