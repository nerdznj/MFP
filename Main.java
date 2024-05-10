// public class name is main.java
//تعریف کردن کتابخانه های مختلف در زبان جاوا
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override

    //اور راید همان رفتار ارثی است
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Music and Movie Player");

        // ساختن دکمه های بصری در محیط برنامه
        Button playMusicButton = new Button("Play Music");
        Button playMovieButton = new Button("Play Movie");

        // بدنه ی اصلی برنامه
        playMusicButton.setOnAction(event -> playMusic());
        playMovieButton.setOnAction(event -> playMovie());

        // چیدمان دکمه ها
        VBox layout = new VBox(10);
        layout.getChildren().addAll(playMusicButton, playMovieButton);

        // نمایش  یا همان گرافیک در برنامه
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void playMusic() {
        // Add code to play music
        System.out.println("Playing music...");
    }

    private void playMovie() {
        // اضافه کردن کد برای اجرای فیلم ها
        System.out.println("Playing movie...");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
