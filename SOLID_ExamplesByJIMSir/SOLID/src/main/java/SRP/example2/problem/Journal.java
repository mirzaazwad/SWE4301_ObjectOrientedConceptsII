package SRP.example2.problem;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jubair.
 * Date: 18/10/22
 * Time: 5:11 AM
 */

public class Journal {
    private final List<String> entries;

    public Journal() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String entry) {
        entries.add(entry);
    }

    public void addEntries(List<String> entryList) {
        entries.addAll(entryList);
    }

    public void removeEntry(String entry) {
        entries.remove(entry);
    }

    public void save(String fileName, List<String> entries) throws IOException {
        for (String entry : entries) {
            save(fileName, entry);
        }
    }

    public void save(String fileName, String entry) throws IOException {
        File file = new File(fileName);
        Files.write(file.toPath(), entry.getBytes(), StandardOpenOption.APPEND);
    }

    public List<String> load(String fileName) throws IOException {
        return Files.readAllLines(Paths.get(fileName));
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}