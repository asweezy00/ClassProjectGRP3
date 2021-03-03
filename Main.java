package sample;
import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import java.util.Random;

import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {

        TabPane tabPane = new TabPane();
        // add tabs here
        Random rand = new Random();

        Tab introTab = new Tab("Sorting Intro", new Label("Sorting Intro"));
        Tab bubbleTab = new Tab("Bubble Sort"  , new Label("Bubble Sort Description: " + "\n" + "Bubble Sort is the simplest sorting algorithm that works" +
                                                                    "by repeatedly swapping the adjacent elements if they are in wrong order."));
        Tab selectionTab = new Tab("Selection Sort" , new Label("Show all boats available"));
        Tab InsertionSort = new Tab("Insertion Sort", new Label ("Insertion Sort"));
        Tab mergeSort = new Tab("Merge Sort", new Label("Merge Sort"));
        Tab QuickSort = new Tab("Quick Sort", new Label("Quick Sort"));

        tabPane.getTabs().add(introTab);
        tabPane.getTabs().add(bubbleTab);
        tabPane.getTabs().add(selectionTab);
        tabPane.getTabs().add(InsertionSort);
        tabPane.getTabs().add(mergeSort);
        tabPane.getTabs().add(QuickSort);

        //Intro textfield
        TextField introfield1 = new TextField();
        TextField introfield2 = new TextField();
        TextField introfield3 = new TextField();
        TextField introfield4 = new TextField();
        TextField introfield5 = new TextField();
        TextField introfield6 = new TextField();
        TextField introfield7 = new TextField();
        TextField introfield8 = new TextField();
        TextField introfield9 = new TextField();
        TextField introfield10 = new TextField();

        // Bubble textfield
        TextField bubblefield1 = new TextField();
        TextField bubblefield2 = new TextField();
        TextField bubblefield3 = new TextField();
        TextField bubblefield4 = new TextField();
        TextField bubblefield5 = new TextField();
        TextField bubblefield6 = new TextField();
        TextField bubblefield7 = new TextField();
        TextField bubblefield8 = new TextField();
        TextField bubblefield9 = new TextField();
        TextField bubblefield10 = new TextField();

        //Selection Text Field
        TextField selectionfield1 = new TextField();
        TextField selectionfield2 = new TextField();
        TextField selectionfield3 = new TextField();
        TextField selectionfield4 = new TextField();
        TextField selectionfield5 = new TextField();
        TextField selectionfield6 = new TextField();
        TextField selectionfield7 = new TextField();
        TextField selectionfield8 = new TextField();
        TextField selectionfield9 = new TextField();
        TextField selectionfield10 = new TextField();
        
        //Insertion text field
        TextField insf1 = new TextField();
        TextField insf2 = new TextField();
        TextField insf3 = new TextField();
        TextField insf4 = new TextField();
        TextField insf5 = new TextField();
        TextField insf6 = new TextField();
        TextField insf7 = new TextField();
        TextField insf8 = new TextField();
        TextField insf9 = new TextField();
        TextField insf10 = new TextField();

        // merge Text fields
        TextField mgf1 = new TextField();
        TextField mgf2 = new TextField();
        TextField mgf3 = new TextField();
        TextField mgf4 = new TextField();
        TextField mgf5 = new TextField();
        TextField mgf6 = new TextField();
        TextField mgf7 = new TextField();
        TextField mgf8 = new TextField();
        TextField mgf9 = new TextField();
        TextField mgf10 = new TextField();

        TextField quickfield1 = new TextField();
        TextField quickfield2 = new TextField();
        TextField quickfield3 = new TextField();
        TextField quickfield4 = new TextField();
        TextField quickfield5 = new TextField();
        TextField quickfield6 = new TextField();
        TextField quickfield7 = new TextField();
        TextField quickfield8 = new TextField();
        TextField quickfield9 = new TextField();
        TextField quickfield10 = new TextField();


        // Intro Tab content
        HBox introBub = new HBox(introfield1,introfield2,introfield3,introfield4,introfield5,introfield6,introfield7,introfield8 ,introfield9 ,introfield10);
        introTab.setContent(introBub);
        introBub.setPadding(new Insets(100, 0, 0,0));

        //Bubble Tab Content
        HBox Hbubble = new HBox(bubblefield1,bubblefield2,bubblefield3,bubblefield4,bubblefield5,bubblefield6,bubblefield7,bubblefield8 ,bubblefield9 ,bubblefield10);
        bubbleTab.setContent(Hbubble);
        Hbubble.setPadding(new Insets(100, 0, 0,0));

        //Selection Tab Content
        HBox selec = new HBox(selectionfield1,selectionfield2,selectionfield3,selectionfield4,selectionfield5,selectionfield6,selectionfield7,selectionfield8 ,selectionfield9 ,selectionfield10);
        selectionTab.setContent(selec);
        selec.setPadding(new Insets(100, 0, 0,0));

        //Insertion Tab Content 
        HBox insert = new HBox(insf1,insf2,insf3,insf4,insf5,insf6,insf7,insf8 ,insf9 ,insf10);
        insert.setPadding(new Insets(100,0,0,0));
        InsertionSort.setContent(insert);

        //mergesort content
        HBox merge = new HBox(mgf1,mgf2,mgf3,mgf4,mgf5,mgf6,mgf7,mgf8 ,mgf9 ,mgf10);
        merge.setPadding(new Insets(100,0,0,0));
        mergeSort.setContent(merge);

        // Quick sort content
        HBox quick = new HBox(quickfield1,quickfield2,quickfield3,quickfield4,quickfield5,quickfield6,quickfield7,quickfield8 ,quickfield9 ,quickfield10);
        quick.setPadding(new Insets(100,0,0,0));
        QuickSort.setContent(quick);

        VBox vBox = new VBox(tabPane);
        Scene scene = new Scene(vBox);

        primaryStage.setScene(scene);
        primaryStage.setWidth(600);
        primaryStage.setHeight(600);
        primaryStage.setTitle("JavaFX App");

        primaryStage.show();
    }
}