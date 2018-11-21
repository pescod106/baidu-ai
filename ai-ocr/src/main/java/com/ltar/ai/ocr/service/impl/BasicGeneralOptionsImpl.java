package com.ltar.ai.ocr.service.impl;

import com.ltar.ai.ocr.service.BaiDuAiOcrOptions;

import java.util.HashMap;

/**
 * @desc:
 * @author: changzhigao
 * @date: 2018/11/19
 * @version: 1.0.0
 */
public class BasicGeneralOptionsImpl implements BaiDuAiOcrOptions {

    public HashMap<String, String> generateOptionMap() {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("language_type", "CHN_ENG");
        options.put("detect_direction", "true");
        options.put("detect_language", "true");
        options.put("probability", "true");
        return options;
    }
}