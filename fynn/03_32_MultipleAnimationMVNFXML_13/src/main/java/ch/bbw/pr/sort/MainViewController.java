package ch.bbw.pr.sort;

import ch.bbw.pr.service.*;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * Main View Controller
 * @author Peter Rutschmann
 * @version 26.02.2020
 */

public class MainViewController {
	private final int numberOfValues = 50;
	private final int numberOfSubViews = 3;
	private final int minValue = 1;
	private final int maxValue = 100;
	
	
	private ArrayList<ProgressBar[]> multipleProgressBars = new ArrayList<ProgressBar[]>();
	private ArrayList<Integer[]> listOfInitialValuesArrays = new ArrayList<Integer[]>();
	private ArrayList<ArrayList<Integer[]>> listOfListOfValuesArrays = new ArrayList<ArrayList<Integer[]>>();

	@FXML
	HBox multipleBarPane;
	
	@FXML
	ComboBox<String> cboxSorter;

	@FXML
	public void initialize() {			
		//Setup subviews
		for(int i=0; i<numberOfSubViews; i++) {
			VBox barPane = new VBox();
			barPane.setPadding(new Insets(5, 5, 5, 5));
			barPane.setFillWidth(true);

			ProgressBar[] barArray = new ProgressBar[numberOfValues];
			for (int j = 0; j < numberOfValues; j++) {
				ProgressBar progressBar = new ProgressBar(0.0);
				progressBar.setMaxWidth(Double.MAX_VALUE);
				barArray[j] = progressBar;
				barPane.getChildren().add(progressBar);
			}
			multipleProgressBars.add(barArray);
			multipleBarPane.getChildren().add(barPane);
			HBox.setHgrow(barPane, Priority.ALWAYS);
		}
		
		cboxSorter.getItems().add("Bubble-Sort");
		cboxSorter.getItems().add("Insertion-Sort");
		cboxSorter.getItems().add("Selection-Sort");
		cboxSorter.getSelectionModel().select(0);
	}
	
	@FXML
	private void handlePrepare(ActionEvent ae) {
		System.out.println("handlePrepare");
		
		RandomValues myRandomValues = new RandomValues();
		ArrayList<Integer> values = myRandomValues.generateIntegerValues(numberOfValues, maxValue, minValue, null);
						
		Integer[] randomValues = new Integer[numberOfValues];
		Integer[] reverseOrderValues = new Integer[numberOfValues];
		Integer[] nearlySortedValues = new Integer[numberOfValues];
		
		randomValues = values.toArray(randomValues);
		reverseOrderValues = myRandomValues.reverseSortOrder(values).toArray(reverseOrderValues);
		nearlySortedValues = myRandomValues.nearlySorted(values).toArray(nearlySortedValues);
		System.out.println("random: " + Arrays.toString(randomValues));
		System.out.println("reverse: " + Arrays.toString(reverseOrderValues));
		System.out.println("nearlySorted: " + Arrays.toString(nearlySortedValues));
		
		listOfInitialValuesArrays.clear();
		listOfInitialValuesArrays.add(randomValues);
		listOfInitialValuesArrays.add(reverseOrderValues);
		listOfInitialValuesArrays.add(nearlySortedValues);
		
		//Initialise progressbars, they need doubles < 1.0
		for(int i=0; i<numberOfSubViews; i++) {
			int cnt=0;
			for (Integer value: listOfInitialValuesArrays.get(i)){
				double dvalue = (double) value / (double) maxValue;			
				multipleProgressBars.get(i)[cnt].setProgress(dvalue);
				System.out.print(dvalue + " ");
				cnt++;
			}
			System.out.println();			
		}
	}
	
	@FXML
	private void handleAnimate(ActionEvent ae) {	
		System.out.println("handleAnimate");
		listOfListOfValuesArrays.clear();
		switch(cboxSorter.getSelectionModel().getSelectedIndex()) {
		case 0:
			System.out.println("use BubbleSort");
			BubbleSort bSorter = new BubbleSort();
			for(int i=0; i<numberOfSubViews; i++) {
				listOfListOfValuesArrays.add(bSorter.sort(listOfInitialValuesArrays.get(i)));			
			}
			break;
		case 1:
			System.out.println("use InsertionSort");
			InsertionSort iSorter = new InsertionSort();
			for(int i=0; i<numberOfSubViews; i++) {
				listOfListOfValuesArrays.add(iSorter.sort(listOfInitialValuesArrays.get(i)));			
			}
			break;
		case 2:
			System.out.println("use SelectionSort");
			SelectionSort sSorter = new SelectionSort();
			for(int i=0; i<numberOfSubViews; i++) {
				listOfListOfValuesArrays.add(sSorter.sort(listOfInitialValuesArrays.get(i)));			
			}
			break;
		default:
			break;
		}
				
		for(int i=0; i<numberOfSubViews; i++) {
			Animation animation = new Animation();
			animation.setup(multipleProgressBars.get(i), listOfListOfValuesArrays.get(i));
			animation.start();
		}
	}
}
