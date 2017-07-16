package ocrme_backend.datastore.gcloud_datastore.objects;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by iuliia on 6/19/17.
 */
public class OcrRequest {

    // [START ocrRequest]
    private String inputImageUrl;
    private String[] languages;
    private String textResult;
    private String pdfResultUrl;
    private Long id;
    private String timeStamp;
    private String createdBy;
    private String createdById;
    // [END ocrRequest]

    // [START keys]
    public static final String INPUT_IMAGE_URL = "inputImageUrl";
    public static final String LANGUAGES = "languages";
    public static final String TEXT_RESULT = "textResult";
    public static final String PDF_RESULT_URL = "pdfResultUrl";
    public static final String ID = "id";
    public static final String TIME_STAMP = "timeStamp";
    public static final String CREATED_BY_ID = "createdById";
    public static final String CREATED_BY = "createdBy";
    // [END keys]

    // We use a Builder pattern here to simplify and standardize construction of Book objects.
    private OcrRequest(Builder builder) {
        this.inputImageUrl = builder.inputImageUrl;
        this.languages = languages;
        this.textResult = builder.textResult;
        this.pdfResultUrl = builder.pdfResultUrl;
        this.id = builder.id;
        this.createdBy = builder.createdBy;
        this.createdById = builder.createdById;
        String timeStamp = builder.timeStamp;
        if (timeStamp == null) {
            timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS").format(new Date());
        }
        this.timeStamp = timeStamp;
    }

    public String getInputImageUrl() {
        return inputImageUrl;
    }

    public String[] getLanguages() {
        return languages;
    }

    public String getTextResult() {
        return textResult;
    }

    public String getPdfResultUrl() {
        return pdfResultUrl;
    }

    public Long getId() {
        return id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getCreatedById() {
        return createdById;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public static class Builder {
        private String inputImageUrl;
        private String[] languages;
        private String textResult;
        private String pdfResultUrl;
        private Long id;
        private String createdBy;
        private String createdById;
        private String timeStamp;

        public Builder inputImageUrl(String inputImageUrl) {
            this.inputImageUrl = inputImageUrl;
            return this;
        }

        public Builder languages(String[] languages) {
            this.languages = languages;
            return this;
        }

        public Builder textResult(String textResult) {
            this.textResult = textResult;
            return this;
        }

        public Builder pdfResultUrl(String pdfResultUrl) {
            this.pdfResultUrl = pdfResultUrl;
            return this;
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder createdById(String createdById) {
            this.createdById = createdById;
            return this;
        }

        public Builder timeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public OcrRequest build() {
            return new OcrRequest(this);
        }
    }

    @Override
    public String toString() {
        return
                "input image url: " + inputImageUrl +
                "languages: " +  Arrays.toString(languages) +
                "\ntext result: " + textResult +
                "\npdf result url: " + pdfResultUrl +
                "\nid: " + id +
                "\ncreated by: " + createdBy +
                "\ncreated by id: " + createdById +
                "\ntime stamp: " + timeStamp;
    }
}