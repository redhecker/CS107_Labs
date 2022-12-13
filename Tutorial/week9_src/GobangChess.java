package lab9;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GobangChess {
    int[][] chessboard;

    public int[][] getChessboard() {
        return chessboard;
    }

    public List<String> readFileByFileReader(String path) {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            List<String> readLines = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                readLines.add(line);
            }
            reader.close();
            fileReader.close();
            return readLines;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * need JDK 11 or higher version
     */
    public List<String> readFileByLib(String path) {
        try {
            return Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }



    public void convertToChessboard(List<String> readlines) {
        this.chessboard = new int[readlines.size()][];

        for (int i = 0; i < readlines.size(); i++) {
            String[] pieces = readlines.get(i).split(",");
            this.chessboard[i] = new int[pieces.length];
            for (int j = 0; j < pieces.length; j++) {
                this.chessboard[i][j] = Integer.parseInt(pieces[j]);
            }
        }
    }

    public void playing(int x, int y, int player) {
        this.chessboard[x][y] = player;
    }

    public List<String> convertToList() {
        List<String> lines = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int[] ints : this.chessboard) {
            sb.setLength(0);
            for (int anInt : ints) {
                sb.append(anInt).append(",");
            }
            sb.setLength(sb.length() - 1);
            lines.add(sb.toString());
        }
        return lines;
    }

    public void writeFileByFileWriter(String path) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            List<String> lines = convertToList();
            for (String line : lines) {
                writer.write(line + '\n');
            }
            writer.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFileByLib(String path) {
        try {
            Files.write(Path.of(path), this.convertToList(), Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
