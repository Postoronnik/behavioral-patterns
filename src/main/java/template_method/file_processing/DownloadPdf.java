package template_method.file_processing;

public class DownloadPdf extends FileDownloader {

    @Override
    public void convert(){
        //Do nothing
    }

    @Override
    public void encrypt(){
        System.out.println("Encrypting file with book cipher");
    }
}
