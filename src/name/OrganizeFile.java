package tnsif.filehandling;

import java.io.File;

public class OrganizeFile {
	static String sourceDirectory = "C:\\Users\\HP\\Desktop\\myfolder";
    public static void main(String[] args) {
       
        organizeFiles(sourceDirectory);
    }

    public static void organizeFiles(String sourceDirectory) {
        File sourceDir = new File(sourceDirectory);

        if (!sourceDir.isDirectory()) {
            System.err.println("Invalid source directory");
            return;
        }

        File[] files = sourceDir.listFiles();

        if (files == null) {
            System.err.println("Error reading files from the source directory");
            return;
        }

        for (File file : files) {
            organizeFile(file);
        }
    }

    private static void organizeFile(File file) {
        String fileName = file.getName();
        String fileExtension = getFileExtension(fileName);

        String destinationDirectory;
        switch (fileExtension.toLowerCase()) {
            case "jpg":
            case "jpeg":
            case "png":
            case "gif":
            case "webp":
                destinationDirectory = "images";
                break;
            case "doc":
            case "docx":
            case "pdf":
            case "xls":
                destinationDirectory = "documents";
                break;
            case "mp4":
            case "avi":
            case "mkv":
                destinationDirectory = "videos";
                break;
            default:
                destinationDirectory = "other";
        }

        File destinationDir = new File(sourceDirectory, destinationDirectory);

        if (!destinationDir.exists()) {
            destinationDir.mkdir();
        }

        File destinationFile = new File(destinationDir, fileName);

        if (file.renameTo(destinationFile)) {
            System.out.println("Moved: " + fileName + " to " + destinationDirectory);
        } else {
            System.err.println("Failed to move: " + fileName);
        }
    }

    private static String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf('.');
        if (lastDotIndex > 0) {
            return fileName.substring(lastDotIndex + 1);
        }
        return "";
    }
}
