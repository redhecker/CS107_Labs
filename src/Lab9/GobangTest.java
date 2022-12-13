package Lab9;

import java.util.List;

public class GobangTest {
    public static void main(String[] args) {
        GobangChess gobangChess = new GobangChess();
        List<String> lines = gobangChess.readFileByFileReader("src/Lab9/chessboard.txt");
        gobangChess.convertToChessboard(lines);
        gobangChess.playing(4,3,1);
        gobangChess.playing(4,2,2);
        gobangChess.writeFileByFileWriter("src/Lab9/new_chessboard.txt");

        List<String> line = gobangChess.readFileByLib("src/Lab9/chessboard.txt");
        gobangChess.convertToChessboard(line);
        gobangChess.playing(4,3,1);
        gobangChess.playing(4,2,2);

        gobangChess.convertToList().forEach(System.out::println);

        gobangChess.writeFileByLib("src/Lab9/new_chessboard1.txt");
    }
}
