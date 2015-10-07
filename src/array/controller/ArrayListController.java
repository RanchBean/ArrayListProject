package array.controller;

import java.util.ArrayList;
import array.view.ListViewer;

public class ArrayListController
{

	private ArrayList<String> firstWords;
	private ListViewer showList;
	
	
	public ArrayListController()
	{
		firstWords = new ArrayList<String>();
		showList = new ListViewer();
	}
	public void start()
	{
		firstWords.add("aksdjlfh");
		firstWords.add("bababababbabababababababababa");
		displayList();
	}
	
	private void displayList()
	{
		for(int spot = 0; spot < firstWords.size(); spot++)
		{
			showList.showList("The contents at " + spot + " are " + firstWords.get(spot));
		}
	}
}
