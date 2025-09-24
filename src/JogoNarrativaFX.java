import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JogoNarrativaFX extends Application {

    private Label narrativa;
    private Button opcao1, opcao2;

    @Override
    public void start(Stage palco) {
        narrativa = new Label("Você acorda em uma floresta misteriosa.\nO que deseja fazer?");
        opcao1 = new Button("Seguir para a direita (vilarejo)");
        opcao2 = new Button("Seguir para a esquerda (caverna)");

        opcao1.setOnAction(e -> mostrarVilarejo());
        opcao2.setOnAction(e -> mostrarCaverna());

        VBox layout = new VBox(15, narrativa, opcao1, opcao2);

        Scene cena = new Scene(layout, 400, 200);

        palco.setTitle("Jogo de Narrativa");
        palco.setScene(cena);
        palco.show();
    }

    private void mostrarVilarejo() {
        narrativa.setText("Você encontra um vilarejo pacífico.\nOs moradores oferecem ajuda. Final Feliz!");
        opcao1.setDisable(true);
        opcao2.setDisable(true);
    }

    private void mostrarCaverna() {
        narrativa.setText("Você entra na caverna escura...\nUm monstro aparece! Game Over.");
        opcao1.setDisable(true);
        opcao2.setDisable(true);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
