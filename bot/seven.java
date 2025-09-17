import java.io.*;

public class Seven {
    public static void main(String[] args) {
        try {
            String content1 = readFile("../app/eight.java");
            String content2 = readFile("../app/ten.java");
            int totalLength = content1.length() + content2.length();
            System.out.println("Total length of content in eight.java and ten.java: " + totalLength + " characters");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFile(String path) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        }
        return sb.toString();
    }
}