package pkg;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;

public class Trial011 {
    public static void main(String[] args) throws Exception {
        System.out.println("execute start.");
        new Trial011().execute();
        System.out.println("execute end.");
    }

    private static final String HDD_TEMP_DIR = "d:/tmp";
    private static final String SSD_TEMP_DIR = "c:/tmp";

    private static final int LINES = 100000;
    private Random random = new Random();

    private void execute() throws Exception {
        // execute logic here.
        System.out.println("execute start hdd false");
        writeRandomNumbers(Path.of(HDD_TEMP_DIR), false);
        System.out.println("execute start hdd true");
        writeRandomNumbers(Path.of(HDD_TEMP_DIR), true);
        System.out.println("execute start ssd false");
        writeRandomNumbers(Path.of(SSD_TEMP_DIR), false);
        System.out.println("execute start ssd true");
        writeRandomNumbers(Path.of(SSD_TEMP_DIR), true);
    }

    private void writeRandomNumbers(Path tempDir, boolean once) throws IOException {
        // 一時ファイルを作成（実行後に削除されるよう設定）
        Path tempFile = Files.createTempFile(tempDir, "temp_", ".txt");
        tempFile.toFile().deleteOnExit();

        // 開始時刻を算出
        LocalDateTime startTime = LocalDateTime.now();

        if (once) {
            openOnce(tempFile);
        } else {
            openAny(tempFile);
        }

        // 終了時刻を算出
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Execution time: " + Duration.between(startTime, endTime));
    }

    private void openAny(Path tempFile) throws IOException {
        // 特定件数ループ
        for (int i = 0; i < LINES; i++) {
            // ランダムで適当な数字を取得
            int randomNumber = random.nextInt();

            // 一時ファイルを追記でオープン、数字を出力、クローズ
            try (BufferedWriter writer = Files.newBufferedWriter(tempFile, StandardOpenOption.APPEND)) {
                writer.write(String.valueOf(randomNumber));
                writer.newLine();
            }
        }
    }
    private void openOnce(Path tempFile) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(tempFile, StandardOpenOption.APPEND)) {
            // 特定件数ループ
            for (int i = 0; i < LINES; i++) {
                // ランダムで適当な数字を取得
                int randomNumber = random.nextInt();

                // 一時ファイルを追記でオープン、数字を出力、クローズ
                writer.write(String.valueOf(randomNumber));
                writer.newLine();
            }
        }
    }
}
