package structure.composite;

public class Client {
    public static void main(String[] args) {
        Directory directory = new Directory();

        // 디렉터리에 파일 삽입
        directory.add(new File());

        // 디렉터리에 디렉터리 삽입
        directory.add(new Directory());

        // 기존 디렉터리를 새 디렉터리에 삽입
        Directory secondDirectory = new Directory();
        secondDirectory.add(directory);
    }
}
