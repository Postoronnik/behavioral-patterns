package template_method.file_processing;

public class FileDownloader {

    public void downloadFile(){
        convert();
        encrypt();
        compression();
        checkDownloadRepository();
        download();
    }

    public void convert(){
        System.out.println("Converting to PDF format...");
    }

    public void encrypt(){
        System.out.println("Encrypting file with Cesar cipher");
    }

    public void compression(){
        System.out.println("Compressing file...");
    }

    public void checkDownloadRepository(){
        System.out.println("Checking repository...");
    }

    public void download(){
        System.out.println("Downloading file...");
    }
}
