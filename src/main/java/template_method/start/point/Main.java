package template_method.start.point;

import template_method.file_processing.DownloadDoc;
import template_method.file_processing.DownloadPdf;
import template_method.file_processing.FileDownloader;

public class Main {
    public static void main(String[] args) {
        FileDownloader fileDownloader = new DownloadDoc();
        fileDownloader.downloadFile();

        System.out.println();

        fileDownloader = new DownloadPdf();
        fileDownloader.downloadFile();
    }
}
