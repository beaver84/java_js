class Exercise9_3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";



        int lastIndex = fullPath.lastIndexOf("\\");
        fileName = fullPath.substring(lastIndex+1);

        path = fullPath.substring(0, lastIndex);

        System.out.println("fullPath:"+fullPath);
        System.out.println("path:"+path);
        System.out.println("fileName:"+fileName);
    }
}