package com.example.latihanmodul6;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    //Inisialisasi atau pemanggilan object
    private final TableView<Jadwal> table = new TableView<>();

    private final TableColumn<Jadwal, String> namaDosen = new TableColumn<>("Nama Dosen");
    private final TableColumn<Jadwal, String> mataKuliah = new TableColumn<>("Mata Kuliah");
    private final TableColumn<Jadwal, String> waktuKuliah = new TableColumn<>("Waktu kuliah");
    private final TableColumn<Jadwal, String> gedungKuliah = new TableColumn<>("GKB");
    private final TableColumn<Jadwal, String> Ruangan = new TableColumn<>("Ruangan");

    private final ObservableList<Jadwal> data = FXCollections.observableArrayList();

    final VBox vBox = new VBox();
    final VBox vBoxLayer2 = new VBox();
    final HBox horizontalBox = new HBox();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        //Ukuran stage atau aplikasi
        stage.setMinHeight(720);
        stage.setMinWidth(1080);
        stage.setTitle("CRUD JavaFX Kegiatan B");

        Button tombolCreate = new Button("Create Jadwal");
        tombolCreate.setMinWidth(200);

        Button tombolDelete = new Button("Delete");
        tombolDelete.setMinWidth(200);

        Button tombolDeletAll = new Button("Delete All");
        tombolDeletAll.setMinWidth(200);

        Button tombolUpdate = new Button("Update");
        tombolUpdate.setMinWidth(200);

        Label judulCRUD = new Label("Jadwal Kuliah");
        judulCRUD.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        Scene layer1 = new Scene(new Group());

        stage.setMinHeight(720);
        stage.setMinWidth(900);

        final TextField addNamaDosen = new TextField();
        addNamaDosen.setPromptText("Nama Dosen");
        addNamaDosen.setAlignment(Pos.CENTER);
        addNamaDosen.setMinWidth(namaDosen.getPrefWidth());
        addNamaDosen.setMinHeight(30);

        final TextField addMataKuliah = new TextField();
        addMataKuliah.setPromptText("Mata Kuliah");
        addMataKuliah.setAlignment(Pos.CENTER);
        addMataKuliah.setMinWidth(mataKuliah.getPrefWidth());
        addMataKuliah.setMinHeight(30);

        final  TextField addWaktuKuliah = new TextField();
        addWaktuKuliah.setPromptText("Waktu Kuliah");
        addWaktuKuliah.setAlignment(Pos.CENTER);
        addWaktuKuliah.setMinWidth(waktuKuliah.getPrefWidth());
        addWaktuKuliah.setMinHeight(30);

        final TextField addGedung = new TextField();
        addGedung.setPromptText("Gedung");
        addGedung.setAlignment(Pos.CENTER);
        addGedung.setMinWidth(gedungKuliah.getPrefWidth());
        addGedung.setMinHeight(30);

        final TextField addRuangKuliah = new TextField();
        addRuangKuliah.setPromptText("Ruangan");
        addRuangKuliah.setAlignment(Pos.CENTER);
        addRuangKuliah.setMinWidth(Ruangan.getPrefWidth());
        addRuangKuliah.setMinHeight(30);

        table.setMinWidth(580);
        table.setMinHeight(600);
        table.setPlaceholder(new Label("Data tidak ada / Kosong"));
        table.setEditable(true);

        namaDosen.setCellValueFactory(Jadwal -> new SimpleStringProperty(Jadwal.getValue().getNamaDosen()));
        namaDosen.setCellFactory(TextFieldTableCell.forTableColumn());
        namaDosen.setOnEditCommit(
                (TableColumn.CellEditEvent<Jadwal, String> t) -> t.getTableView().getItems().get(
                        t.getTablePosition().getRow()).setNamaDosen(t.getNewValue()));
        namaDosen.setPrefWidth(144);

        mataKuliah.setCellValueFactory(Jadwal -> new SimpleStringProperty(Jadwal.getValue().getMataKuliah()));
        mataKuliah.setCellFactory(TextFieldTableCell.forTableColumn());
        mataKuliah.setOnEditCommit(
                (TableColumn.CellEditEvent<Jadwal, String> t) -> t.getTableView().getItems().get(
                        t.getTablePosition().getRow()).setMataKuliah(t.getNewValue()));
        mataKuliah.setPrefWidth(144);

        waktuKuliah.setCellValueFactory(Jadwal -> new SimpleStringProperty(Jadwal.getValue().getWaktuKuliah()));
        waktuKuliah.setCellFactory(TextFieldTableCell.forTableColumn());
        waktuKuliah.setOnEditCommit(
                (TableColumn.CellEditEvent<Jadwal, String> t) -> t.getTableView().getItems().get(
                        t.getTablePosition().getRow()).setWaktuKuliah(t.getNewValue()));
        waktuKuliah.setPrefWidth(100);

        gedungKuliah.setCellValueFactory(Jadwal -> new SimpleStringProperty(Jadwal.getValue().getGkb()));

//        gedungKuliah.setCellFactory(TextFieldTableCell.forTableColumn());
//        gedungKuliah.setOnEditCommit(
//                (TableColumn.CellEditEvent<Jadwal, String> t) -> t.getTableView().getItems().get(
//                        t.getTablePosition().getRow()).setGkb(t.getNewValue()));

        gedungKuliah.setPrefWidth(100);

        Ruangan.setCellValueFactory(Jadwal -> new SimpleStringProperty(Jadwal.getValue().getRuangKuliah()));
        namaDosen.setCellFactory(TextFieldTableCell.forTableColumn());
        namaDosen.setOnEditCommit(
                (TableColumn.CellEditEvent<Jadwal, String> t) -> t.getTableView().getItems().get(
                        t.getTablePosition().getRow()).setRuangKuliah(t.getNewValue()));
        Ruangan.setPrefWidth(100);

        table.getColumns().addAll(namaDosen, mataKuliah, waktuKuliah, gedungKuliah, Ruangan);
        table.setItems(data);

        tombolCreate.setOnAction(event -> {
            try {
                String gedungUser = addGedung.getText();
                int filterGKB = Integer.parseInt(gedungUser);

                if  (!addNamaDosen.getText().isEmpty() || !addMataKuliah.getText().isEmpty() || !addGedung.getText().isEmpty() || !addWaktuKuliah.getText().isEmpty() || !addRuangKuliah.getText().isEmpty() || filterGKB >= 1){
                    Alert d = new Alert(Alert.AlertType.INFORMATION,"Create Jadwal Success!!!");
                    d.show();
                    data.add(new Jadwal(addNamaDosen.getText(), addMataKuliah.getText(), addWaktuKuliah.getText() ,addGedung.getText(), addRuangKuliah.getText()
                    ));addNamaDosen.clear(); addMataKuliah.clear(); addWaktuKuliah.clear(); addGedung.clear(); addRuangKuliah.clear();
                }



            }catch (NumberFormatException gkb){
                Alert formatGKB = new Alert(Alert.AlertType.WARNING, "Field harus terisi semua dan GKB berupa angka!\nInput yang Anda masukkan : " + addGedung.getText());
                formatGKB.setTitle("Format Field GKB and Empty");
                formatGKB.show();
            }
        });

       // Tombol Update per row
        tombolUpdate.setOnAction(event -> {
            try {
                String gedungUser = addGedung.getText();
                int filterGKB = Integer.parseInt(gedungUser);

                if  (!addNamaDosen.getText().isEmpty() || !addMataKuliah.getText().isEmpty() || !addGedung.getText().isEmpty() || !addWaktuKuliah.getText().isEmpty() || !addRuangKuliah.getText().isEmpty() || filterGKB >= 1){
                    Alert d = new Alert(Alert.AlertType.INFORMATION,"Create Jadwal Success!!!");
                    d.show();
                    table.getItems().remove(table.getSelectionModel().getSelectedIndex());
                    data.add(new Jadwal(addNamaDosen.getText(), addMataKuliah.getText(), addWaktuKuliah.getText() ,addGedung.getText(), addRuangKuliah.getText()
                    ));addNamaDosen.clear(); addMataKuliah.clear(); addWaktuKuliah.clear(); addGedung.clear(); addRuangKuliah.clear();
                }



            }catch (NumberFormatException gkb){
                Alert formatGKB = new Alert(Alert.AlertType.WARNING, "Field harus terisi semua dan GKB berupa angka!\nInput yang Anda masukkan : " + addGedung.getText());
                formatGKB.setTitle("Format Field GKB and Empty");
                formatGKB.show();
            }
        });


        //Tombol Delete per row
        tombolDelete.setOnAction(event -> {
            Alert d = new Alert(Alert.AlertType.INFORMATION,"Delete Row Success!!!");
            d.show();
            Jadwal selectedItem = table.getSelectionModel().getSelectedItem();
            table.getItems().remove(selectedItem);
        });

        //Tombol delete all data
        tombolDeletAll.setOnAction(event -> {
            Alert d = new Alert(Alert.AlertType.INFORMATION,"Delete All Success!!!");
            d.show();
            table.getItems().clear();
        });

        vBox.getChildren().addAll(addNamaDosen, addMataKuliah, addWaktuKuliah, addGedung, addRuangKuliah,tombolCreate, tombolUpdate, tombolDelete, tombolDeletAll);
        vBox.setSpacing(10);

        horizontalBox.getChildren().addAll(table, vBox);
        horizontalBox.setPadding(new Insets(15,0, 0, 20));
        horizontalBox.setSpacing(20);

        vBoxLayer2.getChildren().addAll(judulCRUD, horizontalBox);
        vBoxLayer2.setAlignment(Pos.CENTER);
        vBoxLayer2.setSpacing(10);
        vBoxLayer2.setPadding(new Insets(15,0,0,10));


        ((Group) layer1.getRoot()).getChildren().addAll(vBoxLayer2);
        stage.setScene(layer1);
        stage.show();
    }

    public static class Jadwal {

        private final SimpleStringProperty namaDosen;
        private final SimpleStringProperty mataKuliah;
        private final SimpleStringProperty gkb;
        private final SimpleStringProperty waktuKuliah;
        private final SimpleStringProperty ruangKuliah;

        private Jadwal(String dosen, String matkul, String WaktuKuliah, String GKB, String ruangKuliah) {
            this.namaDosen = new SimpleStringProperty(dosen);
            this.mataKuliah = new SimpleStringProperty(matkul);
            this.waktuKuliah = new SimpleStringProperty(WaktuKuliah);
            this.gkb = new SimpleStringProperty(GKB);
            this.ruangKuliah = new SimpleStringProperty(ruangKuliah);
        }

        public String getNamaDosen() {
            return namaDosen.get();
        }

        public String getMataKuliah() {return mataKuliah.get();}

        public String getGkb() {
            return gkb.get();
        }

        public String getWaktuKuliah(){return waktuKuliah.get();}

        public String getRuangKuliah(){return ruangKuliah.get();}

        public void setNamaDosen(String fName) {
            namaDosen.set(fName);}

        public void setMataKuliah(String fName) {
            mataKuliah.set(fName);
        }

        public void setGkb(String fName) {
            gkb.set(fName);
        }

        public void setWaktuKuliah(String Waktu){
            waktuKuliah.set(Waktu);}

        public void setRuangKuliah(String ruang){
            ruangKuliah.set(ruang);}
    }
}