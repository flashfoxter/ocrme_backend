package ocrme_backend.servlets.translate;

import org.junit.Test;

/**
 * Created by iuliia on 8/31/17.
 */
public class TranslateRequestManagerTest {
    @Test
    public void translate() throws Exception {
        TranslateResponse response = TranslateRequestManager.translate(
                "ru", null, null, "My mom is kind");

        assert (! response.getTextResult().isEmpty());
    }

}