package template_method.file_processing;

public class DownloadDoc extends FileDownloader{

    @Override
    public void encrypt(){
        System.out.println("Encrypting file with AES cipher");
    }
}
