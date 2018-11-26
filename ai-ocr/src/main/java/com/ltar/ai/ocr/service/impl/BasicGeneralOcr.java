package com.ltar.ai.ocr.service.impl;

import com.ltar.ai.ocr.service.AbstractBaiduAipOcr;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @desc:
 * @author: changzhigao
 * @date: 2018/11/26
 * @version: 1.0.0
 */
@Component
public class BasicGeneralOcr extends AbstractBaiduAipOcr {

    @Override
    protected ServiceCaller getServiceCaller() {
        return new ServiceCaller() {
            public JSONObject requestAip(byte[] image) {
                HashMap<String, String> options = new HashMap<String, String>();
                options.put("language_type", "CHN_ENG");
                options.put("detect_direction", "true");
                options.put("detect_language", "true");
                options.put("probability", "true");
                return aipOcr.basicGeneral(image, options);
            }
        };
    }
}
