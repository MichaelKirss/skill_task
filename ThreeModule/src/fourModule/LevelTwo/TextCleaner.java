package fourModule.LevelTwo;

class TextCleaner {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sb.insert(0,"ABC");
        }
        System.out.println((System.currentTimeMillis() - startTime));
    }
}